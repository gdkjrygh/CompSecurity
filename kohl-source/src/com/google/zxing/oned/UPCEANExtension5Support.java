// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.EnumMap;
import java.util.Map;

// Referenced classes of package com.google.zxing.oned:
//            UPCEANReader

final class UPCEANExtension5Support
{

    private static final int CHECK_DIGIT_ENCODINGS[] = {
        24, 20, 18, 17, 12, 6, 3, 10, 9, 5
    };
    private final int decodeMiddleCounters[] = new int[4];
    private final StringBuilder decodeRowStringBuffer = new StringBuilder();

    UPCEANExtension5Support()
    {
    }

    private static int determineCheckDigit(int i)
        throws NotFoundException
    {
        for (int j = 0; j < 10; j++)
        {
            if (i == CHECK_DIGIT_ENCODINGS[j])
            {
                return j;
            }
        }

        throw NotFoundException.getNotFoundInstance();
    }

    private static int extensionChecksum(CharSequence charsequence)
    {
        int l = charsequence.length();
        int k = 0;
        for (int i = l - 2; i >= 0; i -= 2)
        {
            k += charsequence.charAt(i) - 48;
        }

        k *= 3;
        for (int j = l - 1; j >= 0; j -= 2)
        {
            k += charsequence.charAt(j) - 48;
        }

        return (k * 3) % 10;
    }

    private static String parseExtension5String(String s)
    {
        s.charAt(0);
        JVM INSTR lookupswitch 3: default 40
    //                   48: 119
    //                   53: 125
    //                   57: 131;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_131;
_L1:
        String s1 = "";
_L5:
        int j = Integer.parseInt(s.substring(1));
        int i = j / 100;
        j %= 100;
        if (j < 10)
        {
            s = (new StringBuilder()).append("0").append(j).toString();
        } else
        {
            s = String.valueOf(j);
        }
        return (new StringBuilder()).append(s1).append(String.valueOf(i)).append('.').append(s).toString();
_L2:
        s1 = "\243";
          goto _L5
_L3:
        s1 = "$";
          goto _L5
        if ("90000".equals(s))
        {
            return null;
        }
        if ("99991".equals(s))
        {
            return "0.00";
        }
        if ("99990".equals(s))
        {
            return "Used";
        }
        s1 = "";
          goto _L5
    }

    private static Map parseExtensionString(String s)
    {
        if (s.length() == 5)
        {
            if ((s = parseExtension5String(s)) != null)
            {
                EnumMap enummap = new EnumMap(com/google/zxing/ResultMetadataType);
                enummap.put(ResultMetadataType.SUGGESTED_PRICE, s);
                return enummap;
            }
        }
        return null;
    }

    int decodeMiddle(BitArray bitarray, int ai[], StringBuilder stringbuilder)
        throws NotFoundException
    {
        int ai1[] = decodeMiddleCounters;
        ai1[0] = 0;
        ai1[1] = 0;
        ai1[2] = 0;
        ai1[3] = 0;
        int l1 = bitarray.getSize();
        int i = ai[1];
        int j1 = 0;
        int k;
        for (int i1 = 0; i1 < 5 && i < l1; i = k)
        {
            int i2 = UPCEANReader.decodeDigit(bitarray, ai1, i, UPCEANReader.L_AND_G_PATTERNS);
            stringbuilder.append((char)(i2 % 10 + 48));
            int k1 = ai1.length;
            for (int j = 0; j < k1; j++)
            {
                i += ai1[j];
            }

            k1 = j1;
            if (i2 >= 10)
            {
                k1 = j1 | 1 << 4 - i1;
            }
            k = i;
            if (i1 != 4)
            {
                k = bitarray.getNextUnset(bitarray.getNextSet(i));
            }
            i1++;
            j1 = k1;
        }

        if (stringbuilder.length() != 5)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        int l = determineCheckDigit(j1);
        if (extensionChecksum(stringbuilder.toString()) != l)
        {
            throw NotFoundException.getNotFoundInstance();
        } else
        {
            return i;
        }
    }

    Result decodeRow(int i, BitArray bitarray, int ai[])
        throws NotFoundException
    {
        Object obj = decodeRowStringBuffer;
        ((StringBuilder) (obj)).setLength(0);
        int j = decodeMiddle(bitarray, ai, ((StringBuilder) (obj)));
        obj = ((StringBuilder) (obj)).toString();
        bitarray = parseExtensionString(((String) (obj)));
        ai = new ResultPoint((float)(ai[0] + ai[1]) / 2.0F, i);
        ResultPoint resultpoint = new ResultPoint(j, i);
        BarcodeFormat barcodeformat = BarcodeFormat.UPC_EAN_EXTENSION;
        ai = new Result(((String) (obj)), null, new ResultPoint[] {
            ai, resultpoint
        }, barcodeformat);
        if (bitarray != null)
        {
            ai.putAllMetadata(bitarray);
        }
        return ai;
    }

}
