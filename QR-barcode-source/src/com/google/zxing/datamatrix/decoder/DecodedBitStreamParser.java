// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.datamatrix.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitSource;
import com.google.zxing.common.DecoderResult;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class DecodedBitStreamParser
{
    private static final class Mode extends Enum
    {

        private static final Mode $VALUES[];
        public static final Mode ANSIX12_ENCODE;
        public static final Mode ASCII_ENCODE;
        public static final Mode BASE256_ENCODE;
        public static final Mode C40_ENCODE;
        public static final Mode EDIFACT_ENCODE;
        public static final Mode PAD_ENCODE;
        public static final Mode TEXT_ENCODE;

        public static Mode valueOf(String s)
        {
            return (Mode)Enum.valueOf(com/google/zxing/datamatrix/decoder/DecodedBitStreamParser$Mode, s);
        }

        public static Mode[] values()
        {
            return (Mode[])$VALUES.clone();
        }

        static 
        {
            PAD_ENCODE = new Mode("PAD_ENCODE", 0);
            ASCII_ENCODE = new Mode("ASCII_ENCODE", 1);
            C40_ENCODE = new Mode("C40_ENCODE", 2);
            TEXT_ENCODE = new Mode("TEXT_ENCODE", 3);
            ANSIX12_ENCODE = new Mode("ANSIX12_ENCODE", 4);
            EDIFACT_ENCODE = new Mode("EDIFACT_ENCODE", 5);
            BASE256_ENCODE = new Mode("BASE256_ENCODE", 6);
            $VALUES = (new Mode[] {
                PAD_ENCODE, ASCII_ENCODE, C40_ENCODE, TEXT_ENCODE, ANSIX12_ENCODE, EDIFACT_ENCODE, BASE256_ENCODE
            });
        }

        private Mode(String s, int i)
        {
            super(s, i);
        }
    }


    private static final char C40_BASIC_SET_CHARS[] = {
        '*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', 
        '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 
        'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 
        'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    };
    private static final char C40_SHIFT2_SET_CHARS[] = {
        '!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', 
        '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', 
        '?', '@', '[', '\\', ']', '^', '_'
    };
    private static final char TEXT_BASIC_SET_CHARS[] = {
        '*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', 
        '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 
        'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 
        'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    };
    private static final char TEXT_SHIFT3_SET_CHARS[] = {
        '\'', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 
        'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 
        'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', 
        '~', '\177'
    };

    private DecodedBitStreamParser()
    {
    }

    static DecoderResult decode(byte abyte0[])
        throws FormatException
    {
        Object obj;
        ArrayList arraylist;
        Object obj1;
        StringBuilder stringbuilder;
        StringBuilder stringbuilder1;
        obj1 = new BitSource(abyte0);
        stringbuilder = new StringBuilder(100);
        stringbuilder1 = new StringBuilder(0);
        arraylist = new ArrayList(1);
        obj = Mode.ASCII_ENCODE;
_L3:
        if (obj != Mode.ASCII_ENCODE) goto _L2; else goto _L1
_L1:
        obj = decodeAsciiSegment(((BitSource) (obj1)), stringbuilder, stringbuilder1);
_L10:
        if (obj == Mode.PAD_ENCODE || ((BitSource) (obj1)).available() <= 0)
        {
            if (stringbuilder1.length() > 0)
            {
                stringbuilder.append(stringbuilder1.toString());
            }
            obj1 = stringbuilder.toString();
            static class _cls1
            {

                static final int $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[];

                static 
                {
                    $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode = new int[Mode.values().length];
                    try
                    {
                        $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[Mode.C40_ENCODE.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[Mode.TEXT_ENCODE.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[Mode.ANSIX12_ENCODE.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[Mode.EDIFACT_ENCODE.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[Mode.BASE256_ENCODE.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            if (arraylist.isEmpty())
            {
                obj = null;
            } else
            {
                obj = arraylist;
            }
            return new DecoderResult(abyte0, ((String) (obj1)), ((List) (obj)), null);
        }
        if (true) goto _L3; else goto _L2
_L2:
        _cls1..SwitchMap.com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode[((Mode) (obj)).ordinal()];
        JVM INSTR tableswitch 1 5: default 164
    //                   1 168
    //                   2 181
    //                   3 190
    //                   4 199
    //                   5 208;
           goto _L4 _L5 _L6 _L7 _L8 _L9
_L9:
        break MISSING_BLOCK_LABEL_208;
_L4:
        throw FormatException.getFormatInstance();
_L5:
        decodeC40Segment(((BitSource) (obj1)), stringbuilder);
_L11:
        obj = Mode.ASCII_ENCODE;
          goto _L10
_L6:
        decodeTextSegment(((BitSource) (obj1)), stringbuilder);
          goto _L11
_L7:
        decodeAnsiX12Segment(((BitSource) (obj1)), stringbuilder);
          goto _L11
_L8:
        decodeEdifactSegment(((BitSource) (obj1)), stringbuilder);
          goto _L11
        decodeBase256Segment(((BitSource) (obj1)), stringbuilder, arraylist);
          goto _L11
    }

    private static void decodeAnsiX12Segment(BitSource bitsource, StringBuilder stringbuilder)
        throws FormatException
    {
        int ai[] = new int[3];
_L5:
        if (bitsource.available() != 8) goto _L2; else goto _L1
_L1:
        int i;
        return;
_L2:
        if ((i = bitsource.readBits(8)) == 254) goto _L1; else goto _L3
_L3:
        parseTwoBytes(i, bitsource.readBits(8), ai);
        i = 0;
        while (i < 3) 
        {
            int j = ai[i];
            if (j == 0)
            {
                stringbuilder.append('\r');
            } else
            if (j == 1)
            {
                stringbuilder.append('*');
            } else
            if (j == 2)
            {
                stringbuilder.append('>');
            } else
            if (j == 3)
            {
                stringbuilder.append(' ');
            } else
            if (j < 14)
            {
                stringbuilder.append((char)(j + 44));
            } else
            if (j < 40)
            {
                stringbuilder.append((char)(j + 51));
            } else
            {
                throw FormatException.getFormatInstance();
            }
            i++;
        }
        if (bitsource.available() <= 0)
        {
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    private static Mode decodeAsciiSegment(BitSource bitsource, StringBuilder stringbuilder, StringBuilder stringbuilder1)
        throws FormatException
    {
        int i = 0;
_L1:
        int k = bitsource.readBits(8);
        if (k == 0)
        {
            throw FormatException.getFormatInstance();
        }
        if (k <= 128)
        {
            int j;
            if (i != 0)
            {
                i = k + 128;
            } else
            {
                i = k;
            }
            stringbuilder.append((char)(i - 1));
            return Mode.ASCII_ENCODE;
        }
        if (k == 129)
        {
            return Mode.PAD_ENCODE;
        }
        if (k <= 229)
        {
            j = k - 130;
            if (j < 10)
            {
                stringbuilder.append('0');
            }
            stringbuilder.append(j);
            j = i;
        } else
        {
            if (k == 230)
            {
                return Mode.C40_ENCODE;
            }
            if (k == 231)
            {
                return Mode.BASE256_ENCODE;
            }
            if (k == 232)
            {
                stringbuilder.append('\035');
                j = i;
            } else
            {
                j = i;
                if (k != 233)
                {
                    j = i;
                    if (k != 234)
                    {
                        if (k == 235)
                        {
                            j = 1;
                        } else
                        if (k == 236)
                        {
                            stringbuilder.append("[)>\03605\035");
                            stringbuilder1.insert(0, "\036\004");
                            j = i;
                        } else
                        {
label0:
                            {
                                if (k != 237)
                                {
                                    break label0;
                                }
                                stringbuilder.append("[)>\03606\035");
                                stringbuilder1.insert(0, "\036\004");
                                j = i;
                            }
                        }
                    }
                }
            }
        }
        i = j;
        if (bitsource.available() <= 0)
        {
            return Mode.ASCII_ENCODE;
        }
          goto _L1
        if (k == 238)
        {
            return Mode.ANSIX12_ENCODE;
        }
        if (k == 239)
        {
            return Mode.TEXT_ENCODE;
        }
        if (k == 240)
        {
            return Mode.EDIFACT_ENCODE;
        }
        j = i;
        if (k == 241)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        j = i;
        if (k < 242)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        if (k != 254)
        {
            break; /* Loop/switch isn't completed */
        }
        j = i;
        if (bitsource.available() == 0) goto _L3; else goto _L2
_L3:
        break MISSING_BLOCK_LABEL_103;
_L2:
        throw FormatException.getFormatInstance();
    }

    private static void decodeBase256Segment(BitSource bitsource, StringBuilder stringbuilder, Collection collection)
        throws FormatException
    {
        int i;
        int j;
        i = bitsource.getByteOffset() + 1;
        int k = bitsource.readBits(8);
        j = i + 1;
        i = unrandomize255State(k, i);
        if (i != 0) goto _L2; else goto _L1
_L1:
        i = bitsource.available() / 8;
_L4:
        if (i < 0)
        {
            throw FormatException.getFormatInstance();
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (i >= 250)
        {
            i = (i - 249) * 250 + unrandomize255State(bitsource.readBits(8), j);
            j++;
        }
        if (true) goto _L4; else goto _L3
_L3:
        byte abyte0[] = new byte[i];
        for (int l = 0; l < i;)
        {
            if (bitsource.available() < 8)
            {
                throw FormatException.getFormatInstance();
            }
            abyte0[l] = (byte)unrandomize255State(bitsource.readBits(8), j);
            l++;
            j++;
        }

        collection.add(abyte0);
        try
        {
            stringbuilder.append(new String(abyte0, "ISO8859_1"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (BitSource bitsource)
        {
            throw new IllegalStateException((new StringBuilder()).append("Platform does not support required encoding: ").append(bitsource).toString());
        }
    }

    private static void decodeC40Segment(BitSource bitsource, StringBuilder stringbuilder)
        throws FormatException
    {
        int ai[];
        int i;
        boolean flag;
        ai = new int[3];
        i = 0;
        flag = false;
_L13:
        if (bitsource.available() != 8) goto _L2; else goto _L1
_L1:
        int j;
        return;
_L2:
        if ((j = bitsource.readBits(8)) == 254) goto _L1; else goto _L3
_L3:
        parseTwoBytes(j, bitsource.readBits(8), ai);
        j = 0;
_L10:
        int k;
        if (j >= 3)
        {
            continue; /* Loop/switch isn't completed */
        }
        k = ai[j];
        i;
        JVM INSTR tableswitch 0 3: default 96
    //                   0 100
    //                   1 172
    //                   2 209
    //                   3 293;
           goto _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_293;
_L6:
        break; /* Loop/switch isn't completed */
_L4:
        throw FormatException.getFormatInstance();
_L5:
        if (k < 3)
        {
            i = k + 1;
        } else
        if (k < C40_BASIC_SET_CHARS.length)
        {
            char c = C40_BASIC_SET_CHARS[k];
            if (flag)
            {
                stringbuilder.append((char)(c + 128));
                flag = false;
            } else
            {
                stringbuilder.append(c);
            }
        } else
        {
            throw FormatException.getFormatInstance();
        }
_L11:
        j++;
        if (true) goto _L10; else goto _L9
_L9:
        if (flag)
        {
            stringbuilder.append((char)(k + 128));
            flag = false;
        } else
        {
            stringbuilder.append((char)k);
        }
        i = 0;
          goto _L11
_L7:
        if (k < C40_SHIFT2_SET_CHARS.length)
        {
            char c1 = C40_SHIFT2_SET_CHARS[k];
            if (flag)
            {
                stringbuilder.append((char)(c1 + 128));
                flag = false;
            } else
            {
                stringbuilder.append(c1);
            }
        } else
        if (k == 27)
        {
            stringbuilder.append('\035');
        } else
        if (k == 30)
        {
            flag = true;
        } else
        {
            throw FormatException.getFormatInstance();
        }
        i = 0;
          goto _L11
        if (flag)
        {
            stringbuilder.append((char)(k + 224));
            flag = false;
        } else
        {
            stringbuilder.append((char)(k + 96));
        }
        i = 0;
          goto _L11
        if (bitsource.available() > 0) goto _L13; else goto _L12
_L12:
    }

    private static void decodeEdifactSegment(BitSource bitsource, StringBuilder stringbuilder)
    {
_L7:
        if (bitsource.available() > 16) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i = 0;
_L5:
        if (i >= 4) goto _L4; else goto _L3
_L3:
        int k;
label0:
        {
            k = bitsource.readBits(6);
            if (k != 31)
            {
                break label0;
            }
            i = 8 - bitsource.getBitOffset();
            if (i != 8)
            {
                bitsource.readBits(i);
                return;
            }
        }
          goto _L1
        int j = k;
        if ((k & 0x20) == 0)
        {
            j = k | 0x40;
        }
        stringbuilder.append((char)j);
        i++;
          goto _L5
_L4:
        if (bitsource.available() <= 0)
        {
            return;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static void decodeTextSegment(BitSource bitsource, StringBuilder stringbuilder)
        throws FormatException
    {
        int ai[];
        int i;
        boolean flag;
        ai = new int[3];
        i = 0;
        flag = false;
_L13:
        if (bitsource.available() != 8) goto _L2; else goto _L1
_L1:
        int j;
        return;
_L2:
        if ((j = bitsource.readBits(8)) == 254) goto _L1; else goto _L3
_L3:
        parseTwoBytes(j, bitsource.readBits(8), ai);
        j = 0;
_L10:
        int k;
        if (j >= 3)
        {
            continue; /* Loop/switch isn't completed */
        }
        k = ai[j];
        i;
        JVM INSTR tableswitch 0 3: default 96
    //                   0 100
    //                   1 172
    //                   2 209
    //                   3 293;
           goto _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_293;
_L6:
        break; /* Loop/switch isn't completed */
_L4:
        throw FormatException.getFormatInstance();
_L5:
        if (k < 3)
        {
            i = k + 1;
        } else
        if (k < TEXT_BASIC_SET_CHARS.length)
        {
            char c = TEXT_BASIC_SET_CHARS[k];
            if (flag)
            {
                stringbuilder.append((char)(c + 128));
                flag = false;
            } else
            {
                stringbuilder.append(c);
            }
        } else
        {
            throw FormatException.getFormatInstance();
        }
_L11:
        j++;
        if (true) goto _L10; else goto _L9
_L9:
        if (flag)
        {
            stringbuilder.append((char)(k + 128));
            flag = false;
        } else
        {
            stringbuilder.append((char)k);
        }
        i = 0;
          goto _L11
_L7:
        if (k < C40_SHIFT2_SET_CHARS.length)
        {
            char c1 = C40_SHIFT2_SET_CHARS[k];
            if (flag)
            {
                stringbuilder.append((char)(c1 + 128));
                flag = false;
            } else
            {
                stringbuilder.append(c1);
            }
        } else
        if (k == 27)
        {
            stringbuilder.append('\035');
        } else
        if (k == 30)
        {
            flag = true;
        } else
        {
            throw FormatException.getFormatInstance();
        }
        i = 0;
          goto _L11
        if (k < TEXT_SHIFT3_SET_CHARS.length)
        {
            char c2 = TEXT_SHIFT3_SET_CHARS[k];
            if (flag)
            {
                stringbuilder.append((char)(c2 + 128));
                flag = false;
            } else
            {
                stringbuilder.append(c2);
            }
            i = 0;
        } else
        {
            throw FormatException.getFormatInstance();
        }
          goto _L11
        if (bitsource.available() > 0) goto _L13; else goto _L12
_L12:
    }

    private static void parseTwoBytes(int i, int j, int ai[])
    {
        i = ((i << 8) + j) - 1;
        j = i / 1600;
        ai[0] = j;
        i -= j * 1600;
        j = i / 40;
        ai[1] = j;
        ai[2] = i - j * 40;
    }

    private static int unrandomize255State(int i, int j)
    {
        i -= (j * 149) % 255 + 1;
        if (i >= 0)
        {
            return i;
        } else
        {
            return i + 256;
        }
    }

}
