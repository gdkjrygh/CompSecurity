// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

// Referenced classes of package com.google.zxing.oned.rss.expanded.decoders:
//            CurrentParsingState, DecodedChar, DecodedNumeric, BlockParsedResult, 
//            DecodedInformation, FieldParser

final class GeneralAppIdDecoder
{

    private final StringBuilder buffer = new StringBuilder();
    private final CurrentParsingState current = new CurrentParsingState();
    private final BitArray information;

    GeneralAppIdDecoder(BitArray bitarray)
    {
        information = bitarray;
    }

    private DecodedChar decodeAlphanumeric(int i)
    {
        int j;
        j = extractNumericValueFromBitArray(i, 5);
        if (j == 15)
        {
            return new DecodedChar(i + 5, '$');
        }
        if (j >= 5 && j < 15)
        {
            return new DecodedChar(i + 5, (char)((j + 48) - 5));
        }
        j = extractNumericValueFromBitArray(i, 6);
        if (j >= 32 && j < 58)
        {
            return new DecodedChar(i + 6, (char)(j + 33));
        }
        j;
        JVM INSTR tableswitch 58 62: default 128
    //                   58 155
    //                   59 171
    //                   60 177
    //                   61 183
    //                   62 189;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        throw new IllegalStateException((new StringBuilder()).append("Decoding invalid alphanumeric value: ").append(j).toString());
_L2:
        char c = '*';
_L8:
        return new DecodedChar(i + 6, c);
_L3:
        c = ',';
        continue; /* Loop/switch isn't completed */
_L4:
        c = '-';
        continue; /* Loop/switch isn't completed */
_L5:
        c = '.';
        continue; /* Loop/switch isn't completed */
_L6:
        c = '/';
        if (true) goto _L8; else goto _L7
_L7:
    }

    private DecodedChar decodeIsoIec646(int i)
        throws FormatException
    {
        int j = extractNumericValueFromBitArray(i, 5);
        if (j == 15)
        {
            return new DecodedChar(i + 5, '$');
        }
        if (j >= 5 && j < 15)
        {
            return new DecodedChar(i + 5, (char)((j + 48) - 5));
        }
        j = extractNumericValueFromBitArray(i, 7);
        if (j >= 64 && j < 90)
        {
            return new DecodedChar(i + 7, (char)(j + 1));
        }
        if (j >= 90 && j < 116)
        {
            return new DecodedChar(i + 7, (char)(j + 7));
        }
        extractNumericValueFromBitArray(i, 8);
        JVM INSTR tableswitch 232 252: default 224
    //                   232 228
    //                   233 244
    //                   234 250
    //                   235 256
    //                   236 262
    //                   237 268
    //                   238 274
    //                   239 280
    //                   240 286
    //                   241 292
    //                   242 298
    //                   243 304
    //                   244 310
    //                   245 316
    //                   246 322
    //                   247 328
    //                   248 334
    //                   249 340
    //                   250 346
    //                   251 352
    //                   252 358;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22
_L1:
        throw FormatException.getFormatInstance();
_L2:
        char c = '!';
_L24:
        return new DecodedChar(i + 8, c);
_L3:
        c = '"';
        continue; /* Loop/switch isn't completed */
_L4:
        c = '%';
        continue; /* Loop/switch isn't completed */
_L5:
        c = '&';
        continue; /* Loop/switch isn't completed */
_L6:
        c = '\'';
        continue; /* Loop/switch isn't completed */
_L7:
        c = '(';
        continue; /* Loop/switch isn't completed */
_L8:
        c = ')';
        continue; /* Loop/switch isn't completed */
_L9:
        c = '*';
        continue; /* Loop/switch isn't completed */
_L10:
        c = '+';
        continue; /* Loop/switch isn't completed */
_L11:
        c = ',';
        continue; /* Loop/switch isn't completed */
_L12:
        c = '-';
        continue; /* Loop/switch isn't completed */
_L13:
        c = '.';
        continue; /* Loop/switch isn't completed */
_L14:
        c = '/';
        continue; /* Loop/switch isn't completed */
_L15:
        c = ':';
        continue; /* Loop/switch isn't completed */
_L16:
        c = ';';
        continue; /* Loop/switch isn't completed */
_L17:
        c = '<';
        continue; /* Loop/switch isn't completed */
_L18:
        c = '=';
        continue; /* Loop/switch isn't completed */
_L19:
        c = '>';
        continue; /* Loop/switch isn't completed */
_L20:
        c = '?';
        continue; /* Loop/switch isn't completed */
_L21:
        c = '_';
        continue; /* Loop/switch isn't completed */
_L22:
        c = ' ';
        if (true) goto _L24; else goto _L23
_L23:
    }

    private DecodedNumeric decodeNumeric(int i)
        throws FormatException
    {
        if (i + 7 > information.getSize())
        {
            i = extractNumericValueFromBitArray(i, 4);
            if (i == 0)
            {
                return new DecodedNumeric(information.getSize(), 10, 10);
            } else
            {
                return new DecodedNumeric(information.getSize(), i - 1, 10);
            }
        } else
        {
            int j = extractNumericValueFromBitArray(i, 7);
            return new DecodedNumeric(i + 7, (j - 8) / 11, (j - 8) % 11);
        }
    }

    static int extractNumericValueFromBitArray(BitArray bitarray, int i, int j)
    {
        int l = 0;
        for (int k = 0; k < j;)
        {
            int i1 = l;
            if (bitarray.get(i + k))
            {
                i1 = l | 1 << j - k - 1;
            }
            k++;
            l = i1;
        }

        return l;
    }

    private boolean isAlphaOr646ToNumericLatch(int i)
    {
        if (i + 3 <= information.getSize()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j = i;
label0:
        do
        {
label1:
            {
                if (j >= i + 3)
                {
                    break label1;
                }
                if (information.get(j))
                {
                    break label0;
                }
                j++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    private boolean isAlphaTo646ToAlphaLatch(int i)
    {
        if (i + 1 <= information.getSize()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j = 0;
_L6:
        if (j >= 5 || j + i >= information.getSize())
        {
            break MISSING_BLOCK_LABEL_75;
        }
        if (j != 2) goto _L4; else goto _L3
_L3:
        if (!information.get(i + 2)) goto _L1; else goto _L5
_L5:
        j++;
          goto _L6
_L4:
        if (!information.get(i + j)) goto _L5; else goto _L7
_L7:
        return false;
        return true;
    }

    private boolean isNumericToAlphaNumericLatch(int i)
    {
        if (i + 1 <= information.getSize()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j = 0;
label0:
        do
        {
label1:
            {
                if (j >= 4 || j + i >= information.getSize())
                {
                    break label1;
                }
                if (information.get(i + j))
                {
                    break label0;
                }
                j++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    private boolean isStillAlpha(int i)
    {
        boolean flag = true;
        if (i + 5 <= information.getSize())
        {
            int j = extractNumericValueFromBitArray(i, 5);
            if (j >= 5 && j < 16)
            {
                return true;
            }
            if (i + 6 <= information.getSize())
            {
                i = extractNumericValueFromBitArray(i, 6);
                if (i < 16 || i >= 63)
                {
                    flag = false;
                }
                return flag;
            }
        }
        return false;
    }

    private boolean isStillIsoIec646(int i)
    {
        boolean flag = true;
        if (i + 5 <= information.getSize())
        {
            int j = extractNumericValueFromBitArray(i, 5);
            if (j >= 5 && j < 16)
            {
                return true;
            }
            if (i + 7 <= information.getSize())
            {
                int k = extractNumericValueFromBitArray(i, 7);
                if (k >= 64 && k < 116)
                {
                    return true;
                }
                if (i + 8 <= information.getSize())
                {
                    i = extractNumericValueFromBitArray(i, 8);
                    if (i < 232 || i >= 253)
                    {
                        flag = false;
                    }
                    return flag;
                }
            }
        }
        return false;
    }

    private boolean isStillNumeric(int i)
    {
        if (i + 7 <= information.getSize()) goto _L2; else goto _L1
_L1:
        if (i + 4 > information.getSize()) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        int j = i;
label0:
        do
        {
label1:
            {
                if (j >= i + 3)
                {
                    break label1;
                }
                if (information.get(j))
                {
                    break label0;
                }
                j++;
            }
        } while (true);
        if (true) goto _L3; else goto _L5
_L5:
        return information.get(i + 3);
    }

    private BlockParsedResult parseAlphaBlock()
    {
        DecodedChar decodedchar;
        for (; isStillAlpha(current.getPosition()); buffer.append(decodedchar.getValue()))
        {
            decodedchar = decodeAlphanumeric(current.getPosition());
            current.setPosition(decodedchar.getNewPosition());
            if (decodedchar.isFNC1())
            {
                return new BlockParsedResult(new DecodedInformation(current.getPosition(), buffer.toString()), true);
            }
        }

        if (!isAlphaOr646ToNumericLatch(current.getPosition())) goto _L2; else goto _L1
_L1:
        current.incrementPosition(3);
        current.setNumeric();
_L4:
        return new BlockParsedResult(false);
_L2:
        if (isAlphaTo646ToAlphaLatch(current.getPosition()))
        {
            if (current.getPosition() + 5 < information.getSize())
            {
                current.incrementPosition(5);
            } else
            {
                current.setPosition(information.getSize());
            }
            current.setIsoIec646();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private DecodedInformation parseBlocks()
        throws FormatException
    {
        do
        {
            int i = current.getPosition();
            BlockParsedResult blockparsedresult;
            boolean flag;
            boolean flag1;
            if (current.isAlpha())
            {
                blockparsedresult = parseAlphaBlock();
                flag1 = blockparsedresult.isFinished();
            } else
            if (current.isIsoIec646())
            {
                blockparsedresult = parseIsoIec646Block();
                flag1 = blockparsedresult.isFinished();
            } else
            {
                blockparsedresult = parseNumericBlock();
                flag1 = blockparsedresult.isFinished();
            }
            if (i != current.getPosition())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            while (!flag && !flag1 || flag1) 
            {
                return blockparsedresult.getDecodedInformation();
            }
        } while (true);
    }

    private BlockParsedResult parseIsoIec646Block()
        throws FormatException
    {
        DecodedChar decodedchar;
        for (; isStillIsoIec646(current.getPosition()); buffer.append(decodedchar.getValue()))
        {
            decodedchar = decodeIsoIec646(current.getPosition());
            current.setPosition(decodedchar.getNewPosition());
            if (decodedchar.isFNC1())
            {
                return new BlockParsedResult(new DecodedInformation(current.getPosition(), buffer.toString()), true);
            }
        }

        if (!isAlphaOr646ToNumericLatch(current.getPosition())) goto _L2; else goto _L1
_L1:
        current.incrementPosition(3);
        current.setNumeric();
_L4:
        return new BlockParsedResult(false);
_L2:
        if (isAlphaTo646ToAlphaLatch(current.getPosition()))
        {
            if (current.getPosition() + 5 < information.getSize())
            {
                current.incrementPosition(5);
            } else
            {
                current.setPosition(information.getSize());
            }
            current.setAlpha();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private BlockParsedResult parseNumericBlock()
        throws FormatException
    {
        Object obj;
        for (; isStillNumeric(current.getPosition()); buffer.append(((DecodedNumeric) (obj)).getSecondDigit()))
        {
            obj = decodeNumeric(current.getPosition());
            current.setPosition(((DecodedNumeric) (obj)).getNewPosition());
            if (((DecodedNumeric) (obj)).isFirstDigitFNC1())
            {
                if (((DecodedNumeric) (obj)).isSecondDigitFNC1())
                {
                    obj = new DecodedInformation(current.getPosition(), buffer.toString());
                } else
                {
                    obj = new DecodedInformation(current.getPosition(), buffer.toString(), ((DecodedNumeric) (obj)).getSecondDigit());
                }
                return new BlockParsedResult(((DecodedInformation) (obj)), true);
            }
            buffer.append(((DecodedNumeric) (obj)).getFirstDigit());
            if (((DecodedNumeric) (obj)).isSecondDigitFNC1())
            {
                return new BlockParsedResult(new DecodedInformation(current.getPosition(), buffer.toString()), true);
            }
        }

        if (isNumericToAlphaNumericLatch(current.getPosition()))
        {
            current.setAlpha();
            current.incrementPosition(4);
        }
        return new BlockParsedResult(false);
    }

    String decodeAllCodes(StringBuilder stringbuilder, int i)
        throws NotFoundException, FormatException
    {
        String s = null;
        do
        {
            DecodedInformation decodedinformation = decodeGeneralPurposeField(i, s);
            s = FieldParser.parseFieldsInGeneralPurpose(decodedinformation.getNewString());
            if (s != null)
            {
                stringbuilder.append(s);
            }
            if (decodedinformation.isRemaining())
            {
                s = String.valueOf(decodedinformation.getRemainingValue());
            } else
            {
                s = null;
            }
            if (i == decodedinformation.getNewPosition())
            {
                return stringbuilder.toString();
            }
            i = decodedinformation.getNewPosition();
        } while (true);
    }

    DecodedInformation decodeGeneralPurposeField(int i, String s)
        throws FormatException
    {
        buffer.setLength(0);
        if (s != null)
        {
            buffer.append(s);
        }
        current.setPosition(i);
        s = parseBlocks();
        if (s != null && s.isRemaining())
        {
            return new DecodedInformation(current.getPosition(), buffer.toString(), s.getRemainingValue());
        } else
        {
            return new DecodedInformation(current.getPosition(), buffer.toString());
        }
    }

    int extractNumericValueFromBitArray(int i, int j)
    {
        return extractNumericValueFromBitArray(information, i, j);
    }
}
