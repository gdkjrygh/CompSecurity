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
    static final class Table extends Enum
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
        GenericGF genericgf;
        int ai[];
        byte byte0;
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
            byte0 = 8;
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
        i = aflag.length % byte0;
        ai = new int[l];
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
        k = 0;
        for (i = 0; i < k1;)
        {
            int i1;
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
            k = i1;
        }

        aflag = new boolean[k1 * byte0 - k];
        i = 0;
        k = 0;
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
                i += byte0 - 1;
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
        return aflag;
    }

    private boolean[] extractBits(BitMatrix bitmatrix)
    {
        boolean flag = ddata.isCompact();
        int i3 = ddata.getNbLayers();
        int ai[];
        boolean aflag[];
        int i;
        if (flag)
        {
            i = (i3 << 2) + 11;
        } else
        {
            i = (i3 << 2) + 14;
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
                int j2 = l + l / 15;
                ai[j1 - l - 1] = l1 - j2 - 1;
                ai[j1 + l] = l1 + j2 + 1;
            }

        }
        int i1 = 0;
        int k1 = 0;
        for (; i1 < i3; i1++)
        {
            int i2;
            int j3;
            int k3;
            if (flag)
            {
                i2 = (i3 - i1 << 2) + 9;
            } else
            {
                i2 = (i3 - i1 << 2) + 12;
            }
            j3 = i1 << 1;
            k3 = i - 1 - j3;
            for (int k2 = 0; k2 < i2; k2++)
            {
                int l3 = k2 << 1;
                for (int l2 = 0; l2 < 2; l2++)
                {
                    aflag[k1 + l3 + l2] = bitmatrix.get(ai[j3 + l2], ai[j3 + k2]);
                    aflag[i2 * 2 + k1 + l3 + l2] = bitmatrix.get(ai[j3 + k2], ai[k3 - l2]);
                    aflag[i2 * 4 + k1 + l3 + l2] = bitmatrix.get(ai[k3 - l2], ai[k3 - k2]);
                    aflag[i2 * 6 + k1 + l3 + l2] = bitmatrix.get(ai[k3 - k2], ai[j3 + l2]);
                }

            }

            k1 += i2 << 3;
        }

        return aflag;
    }

    private static String getCharacter(Table table, int i)
    {
        static final class _cls1
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
        int l1 = aflag.length;
        Table table = Table.UPPER;
        Table table1 = Table.UPPER;
        StringBuilder stringbuilder = new StringBuilder(20);
        int i = 0;
label0:
        do
        {
            if (i >= l1)
            {
                break;
            }
            if (table1 == Table.BINARY)
            {
                if (l1 - i < 5)
                {
                    break;
                }
                int j = readCode(aflag, i, 5);
                int k1 = i + 5;
                i = k1;
                int i1 = j;
                if (j == 0)
                {
                    if (l1 - k1 < 11)
                    {
                        break;
                    }
                    i1 = readCode(aflag, k1, 11) + 31;
                    i = k1 + 11;
                }
                k1 = 0;
                do
                {
label1:
                    {
                        int k = i;
                        if (k1 < i1)
                        {
                            if (l1 - i >= 8)
                            {
                                break label1;
                            }
                            k = l1;
                        }
                        table1 = table;
                        i = k;
                        continue label0;
                    }
                    stringbuilder.append((char)readCode(aflag, i, 8));
                    i += 8;
                    k1++;
                } while (true);
            }
            String s;
            int l;
            int j1;
            if (table1 == Table.DIGIT)
            {
                l = 4;
            } else
            {
                l = 5;
            }
            if (l1 - i < l)
            {
                break;
            }
            j1 = readCode(aflag, i, l);
            l = i + l;
            s = getCharacter(table1, j1);
            if (s.startsWith("CTRL_"))
            {
                Table table2 = getTable(s.charAt(5));
                i = l;
                table1 = table2;
                if (s.charAt(6) == 'L')
                {
                    table = table2;
                    i = l;
                    table1 = table2;
                }
            } else
            {
                stringbuilder.append(s);
                table1 = table;
                i = l;
            }
        } while (true);
        return stringbuilder.toString();
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

    public final DecoderResult decode(AztecDetectorResult aztecdetectorresult)
        throws FormatException
    {
        ddata = aztecdetectorresult;
        return new DecoderResult(null, getEncodedData(correctBits(extractBits(aztecdetectorresult.getBits()))), null, null);
    }

}
