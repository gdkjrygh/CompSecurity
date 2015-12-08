// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.zxing.oned:
//            OneDimensionalCodeWriter, Code128Reader

public final class Code128Writer extends OneDimensionalCodeWriter
{

    private static final int CODE_CODE_B = 100;
    private static final int CODE_CODE_C = 99;
    private static final int CODE_FNC_1 = 102;
    private static final int CODE_FNC_2 = 97;
    private static final int CODE_FNC_3 = 96;
    private static final int CODE_FNC_4_B = 100;
    private static final int CODE_START_B = 104;
    private static final int CODE_START_C = 105;
    private static final int CODE_STOP = 106;
    private static final char ESCAPE_FNC_1 = 241;
    private static final char ESCAPE_FNC_2 = 242;
    private static final char ESCAPE_FNC_3 = 243;
    private static final char ESCAPE_FNC_4 = 244;

    public Code128Writer()
    {
    }

    private static boolean isDigits(CharSequence charsequence, int i, int j)
    {
        j = i + j;
        int k;
        int l;
        for (l = charsequence.length(); i < j && i < l; j = k)
        {
label0:
            {
                char c = charsequence.charAt(i);
                if (c >= '0')
                {
                    k = j;
                    if (c <= '9')
                    {
                        break label0;
                    }
                }
                if (c != '\361')
                {
                    return false;
                }
                k = j + 1;
            }
            i++;
        }

        boolean flag;
        if (j <= l)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    public BitMatrix encode(String s, BarcodeFormat barcodeformat, int i, int j, Map map)
        throws WriterException
    {
        if (barcodeformat != BarcodeFormat.CODE_128)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can only encode CODE_128, but got ").append(barcodeformat).toString());
        } else
        {
            return super.encode(s, barcodeformat, i, j, map);
        }
    }

    public boolean[] encode(String s)
    {
        int i;
        boolean flag;
        int l1;
        flag = false;
        l1 = s.length();
        if (l1 < 1 || l1 > 80)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Contents length should be between 1 and 80 characters, but got ").append(l1).toString());
        }
        i = 0;
_L11:
        Object obj;
        int j;
        int l;
        int i1;
        if (i < l1)
        {
            char c = s.charAt(i);
            if (c < ' ' || c > '~')
            {
                switch (c)
                {
                default:
                    throw new IllegalArgumentException((new StringBuilder()).append("Bad character in input: ").append(c).toString());

                case 241: 
                case 242: 
                case 243: 
                case 244: 
                    break;
                }
            }
            i++;
            continue; /* Loop/switch isn't completed */
        }
        obj = new ArrayList();
        l = 0;
        i = 0;
        j = 1;
        i1 = 0;
_L7:
        int j1 = j;
        if (l >= l1) goto _L2; else goto _L1
_L1:
        int k;
        int k1;
        if (i == 99)
        {
            j = 2;
        } else
        {
            j = 4;
        }
        if (isDigits(s, l, j))
        {
            j = 99;
        } else
        {
            j = 100;
        }
        if (j != i) goto _L4; else goto _L3
_L3:
        if (i != 100) goto _L6; else goto _L5
_L5:
        k = s.charAt(l) - 32;
        l++;
        j = i;
        i = l;
_L9:
        ((Collection) (obj)).add(Code128Reader.CODE_PATTERNS[k]);
        int ai[];
        if (i != 0)
        {
            l = j1 + 1;
        } else
        {
            l = j1;
        }
        k1 = l;
        i1 += k * j1;
        l = i;
        i = j;
        j = k1;
          goto _L7
_L6:
        switch (s.charAt(l))
        {
        default:
            k = Integer.parseInt(s.substring(l, l + 2));
            l += 2;
            j = i;
            i = l;
            break;

        case 241: 
            k = 102;
            l++;
            j = i;
            i = l;
            break;

        case 242: 
            k = 97;
            l++;
            j = i;
            i = l;
            break;

        case 243: 
            k = 96;
            l++;
            j = i;
            i = l;
            break;

        case 244: 
            l++;
            j = i;
            k = 100;
            i = l;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (i == 0)
        {
            if (j == 100)
            {
                k = 104;
            } else
            {
                k = 105;
            }
        } else
        {
            k = j;
        }
        i = l;
        continue; /* Loop/switch isn't completed */
_L2:
        ((Collection) (obj)).add(Code128Reader.CODE_PATTERNS[i1 % 103]);
        ((Collection) (obj)).add(Code128Reader.CODE_PATTERNS[106]);
        s = ((Collection) (obj)).iterator();
        j = 0;
        do
        {
label0:
            {
                if (!s.hasNext())
                {
                    break label0;
                }
                ai = (int[])s.next();
                l = ai.length;
                k = 0;
                i = j;
                do
                {
                    j = i;
                    if (k >= l)
                    {
                        break;
                    }
                    j = ai[k];
                    k++;
                    i = j + i;
                } while (true);
            }
        } while (true);
        s = new boolean[j];
        obj = ((Collection) (obj)).iterator();
        for (i = ((flag) ? 1 : 0); ((Iterator) (obj)).hasNext(); i += appendPattern(s, i, (int[])((Iterator) (obj)).next(), true)) { }
        return s;
        if (true) goto _L9; else goto _L8
_L8:
        if (true) goto _L11; else goto _L10
_L10:
    }
}
