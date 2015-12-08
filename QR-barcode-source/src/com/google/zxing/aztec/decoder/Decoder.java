// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.aztec.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.aztec.AztecDetectorResult;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.util.Arrays;

public final class Decoder
{
    private static final class Table extends Enum
    {

        private static final Table $VALUES[];
        public static final Table BINARY;
        public static final Table DIGIT;
        public static final Table LOWER;
        public static final Table MIXED;
        public static final Table PUNCT;
        public static final Table UPPER;

        public static Table valueOf(String s)
        {
            return (Table)Enum.valueOf(com/google/zxing/aztec/decoder/Decoder$Table, s);
        }

        public static Table[] values()
        {
            return (Table[])$VALUES.clone();
        }

        static 
        {
            UPPER = new Table("UPPER", 0);
            LOWER = new Table("LOWER", 1);
            MIXED = new Table("MIXED", 2);
            DIGIT = new Table("DIGIT", 3);
            PUNCT = new Table("PUNCT", 4);
            BINARY = new Table("BINARY", 5);
            $VALUES = (new Table[] {
                UPPER, LOWER, MIXED, DIGIT, PUNCT, BINARY
            });
        }

        private Table(String s, int i)
        {
            super(s, i);
        }
    }


    static final boolean $assertionsDisabled;
    private static final String DIGIT_TABLE[] = {
        "CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", 
        "8", "9", ",", ".", "CTRL_UL", "CTRL_US"
    };
    private static final String LOWER_TABLE[] = {
        "CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", 
        "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", 
        "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", 
        "CTRL_DL", "CTRL_BS"
    };
    private static final String MIXED_TABLE[] = {
        "CTRL_PS", " ", "\001", "\002", "\003", "\004", "\005", "\006", "\007", "\b", 
        "\t", "\n", "\013", "\f", "\r", "\033", "\034", "\035", "\036", "\037", 
        "@", "\\", "^", "_", "`", "|", "~", "\177", "CTRL_LL", "CTRL_UL", 
        "CTRL_PL", "CTRL_BS"
    };
    private static final String PUNCT_TABLE[] = {
        "", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", 
        "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", 
        "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", 
        "}", "CTRL_UL"
    };
    private static final String UPPER_TABLE[] = {
        "CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", 
        "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", 
        "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", 
        "CTRL_DL", "CTRL_BS"
    };
    private AztecDetectorResult ddata;

    public Decoder()
    {
    }

    private boolean[] correctBits(boolean aflag[])
        throws FormatException
    {
        byte byte0 = 8;
        GenericGF genericgf;
        int ai[];
        int i;
        int l;
        int k1;
        if (ddata.getNbLayers() <= 2)
        {
            byte0 = 6;
            genericgf = GenericGF.AZTEC_DATA_6;
        } else
        if (ddata.getNbLayers() <= 8)
        {
            genericgf = GenericGF.AZTEC_DATA_8;
        } else
        if (ddata.getNbLayers() <= 22)
        {
            byte0 = 10;
            genericgf = GenericGF.AZTEC_DATA_10;
        } else
        {
            byte0 = 12;
            genericgf = GenericGF.AZTEC_DATA_12;
        }
        k1 = ddata.getNbDatablocks();
        l = aflag.length / byte0;
        i = aflag.length;
        ai = new int[l];
        i %= byte0;
        for (int j = 0; j < l;)
        {
            ai[j] = readCode(aflag, i, byte0);
            j++;
            i += byte0;
        }

        int k;
        int l1;
        try
        {
            (new ReedSolomonDecoder(genericgf)).decode(ai, l - k1);
        }
        // Misplaced declaration of an exception variable
        catch (boolean aflag[])
        {
            throw FormatException.getFormatInstance();
        }
        l1 = (1 << byte0) - 1;
        i = 0;
        int i1;
        for (k = 0; i < k1; k = i1)
        {
label0:
            {
                int i2 = ai[i];
                if (i2 == 0 || i2 == l1)
                {
                    throw FormatException.getFormatInstance();
                }
                if (i2 != 1)
                {
                    i1 = k;
                    if (i2 != l1 - 1)
                    {
                        break label0;
                    }
                }
                i1 = k + 1;
            }
            i++;
        }

        aflag = new boolean[k1 * byte0 - k];
        k = 0;
        i = 0;
        while (k < k1) 
        {
            int j2 = ai[k];
            if (j2 == 1 || j2 == l1 - 1)
            {
                boolean flag;
                if (j2 > 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Arrays.fill(aflag, i, (i + byte0) - 1, flag);
                i = (byte0 - 1) + i;
            } else
            {
                int j1 = byte0 - 1;
                while (j1 >= 0) 
                {
                    boolean flag1;
                    if ((1 << j1 & j2) != 0)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    aflag[i] = flag1;
                    j1--;
                    i++;
                }
            }
            k++;
        }
        if (!$assertionsDisabled && i != aflag.length)
        {
            throw new AssertionError();
        } else
        {
            return aflag;
        }
    }

    private static String getCharacter(Table table, int i)
    {
        static class _cls1
        {

            static final int $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[];

            static 
            {
                $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table = new int[Table.values().length];
                try
                {
                    $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[Table.UPPER.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[Table.LOWER.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[Table.MIXED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[Table.PUNCT.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[Table.DIGIT.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.google.zxing.aztec.decoder.Decoder.Table[table.ordinal()])
        {
        default:
            throw new IllegalStateException("Bad table");

        case 1: // '\001'
            return UPPER_TABLE[i];

        case 2: // '\002'
            return LOWER_TABLE[i];

        case 3: // '\003'
            return MIXED_TABLE[i];

        case 4: // '\004'
            return PUNCT_TABLE[i];

        case 5: // '\005'
            return DIGIT_TABLE[i];
        }
    }

    private static String getEncodedData(boolean aflag[])
    {
        Table table;
        Table table1;
        StringBuilder stringbuilder;
        int i;
        int j1;
        j1 = aflag.length;
        table = Table.UPPER;
        table1 = Table.UPPER;
        stringbuilder = new StringBuilder(20);
        i = 0;
_L9:
        if (i >= j1) goto _L2; else goto _L1
_L1:
        if (table1 != Table.BINARY) goto _L4; else goto _L3
_L3:
        if (j1 - i >= 5) goto _L5; else goto _L2
_L2:
        return stringbuilder.toString();
_L5:
        int j;
        int k = readCode(aflag, i, 5);
        int k1 = i + 5;
        j = k;
        i = k1;
        if (k != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (j1 - k1 < 11)
        {
            continue; /* Loop/switch isn't completed */
        }
        j = readCode(aflag, k1, 11) + 31;
        i = k1 + 11;
        break; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L6
_L6:
        int l = 0;
        do
        {
label0:
            {
                if (l < j)
                {
                    if (j1 - i >= 8)
                    {
                        break label0;
                    }
                    i = j1;
                }
                table1 = table;
                continue; /* Loop/switch isn't completed */
            }
            stringbuilder.append((char)readCode(aflag, i, 8));
            l++;
            i += 8;
        } while (true);
_L4:
        if (table1 == Table.DIGIT)
        {
            j = 4;
        } else
        {
            j = 5;
        }
        if (j1 - i < j) goto _L2; else goto _L7
_L7:
        int i1 = readCode(aflag, i, j);
        i += j;
        String s = getCharacter(table1, i1);
        if (s.startsWith("CTRL_"))
        {
            Table table2 = getTable(s.charAt(5));
            table1 = table2;
            if (s.charAt(6) == 'L')
            {
                table = table2;
                table1 = table2;
            }
        } else
        {
            stringbuilder.append(s);
            table1 = table;
        }
        if (true) goto _L9; else goto _L8
_L8:
    }

    private static Table getTable(char c)
    {
        switch (c)
        {
        default:
            return Table.UPPER;

        case 76: // 'L'
            return Table.LOWER;

        case 80: // 'P'
            return Table.PUNCT;

        case 77: // 'M'
            return Table.MIXED;

        case 68: // 'D'
            return Table.DIGIT;

        case 66: // 'B'
            return Table.BINARY;
        }
    }

    public static String highLevelDecode(boolean aflag[])
    {
        return getEncodedData(aflag);
    }

    private static int readCode(boolean aflag[], int i, int j)
    {
        int k = 0;
        for (int l = i; l < i + j; l++)
        {
            int i1 = k << 1;
            k = i1;
            if (aflag[l])
            {
                k = i1 + 1;
            }
        }

        return k;
    }

    private static int totalBitsInLayer(int i, boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 88;
        } else
        {
            byte0 = 112;
        }
        return (byte0 + i * 16) * i;
    }

    public DecoderResult decode(AztecDetectorResult aztecdetectorresult)
        throws FormatException
    {
        ddata = aztecdetectorresult;
        return new DecoderResult(null, getEncodedData(correctBits(extractBits(aztecdetectorresult.getBits()))), null, null);
    }

    boolean[] extractBits(BitMatrix bitmatrix)
    {
        boolean flag = ddata.isCompact();
        int i3 = ddata.getNbLayers();
        int ai[];
        boolean aflag[];
        int i;
        if (flag)
        {
            i = i3 * 4 + 11;
        } else
        {
            i = i3 * 4 + 14;
        }
        ai = new int[i];
        aflag = new boolean[totalBitsInLayer(i3, flag)];
        if (flag)
        {
            for (int j = 0; j < ai.length; j++)
            {
                ai[j] = j;
            }

        } else
        {
            int k = (i / 2 - 1) / 15;
            int j1 = i / 2;
            int l1 = (i + 1 + k * 2) / 2;
            for (int l = 0; l < j1; l++)
            {
                int j2 = l / 15 + l;
                ai[j1 - l - 1] = l1 - j2 - 1;
                ai[j1 + l] = j2 + l1 + 1;
            }

        }
        int k1 = 0;
        for (int i1 = 0; i1 < i3; i1++)
        {
            int i2;
            int j3;
            int k3;
            if (flag)
            {
                i2 = (i3 - i1) * 4 + 9;
            } else
            {
                i2 = (i3 - i1) * 4 + 12;
            }
            j3 = i1 * 2;
            k3 = i - 1 - j3;
            for (int k2 = 0; k2 < i2; k2++)
            {
                int l3 = k2 * 2;
                for (int l2 = 0; l2 < 2; l2++)
                {
                    aflag[k1 + l3 + l2] = bitmatrix.get(ai[j3 + l2], ai[j3 + k2]);
                    aflag[i2 * 2 + k1 + l3 + l2] = bitmatrix.get(ai[j3 + k2], ai[k3 - l2]);
                    aflag[i2 * 4 + k1 + l3 + l2] = bitmatrix.get(ai[k3 - l2], ai[k3 - k2]);
                    aflag[i2 * 6 + k1 + l3 + l2] = bitmatrix.get(ai[k3 - k2], ai[j3 + l2]);
                }

            }

            k1 = i2 * 8 + k1;
        }

        return aflag;
    }

    static 
    {
        boolean flag;
        if (!com/google/zxing/aztec/decoder/Decoder.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
