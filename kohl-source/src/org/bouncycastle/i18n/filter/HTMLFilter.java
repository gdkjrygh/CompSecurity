// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.i18n.filter;


// Referenced classes of package org.bouncycastle.i18n.filter:
//            Filter

public class HTMLFilter
    implements Filter
{

    public HTMLFilter()
    {
    }

    public String doFilter(String s)
    {
        int i;
        s = new StringBuffer(s);
        i = 0;
_L15:
        if (i >= s.length())
        {
            break MISSING_BLOCK_LABEL_335;
        }
        s.charAt(i);
        JVM INSTR tableswitch 34 62: default 156
    //                   34 251
    //                   35 223
    //                   36 156
    //                   37 279
    //                   38 237
    //                   39 265
    //                   40 195
    //                   41 209
    //                   42 156
    //                   43 307
    //                   44 156
    //                   45 321
    //                   46 156
    //                   47 156
    //                   48 156
    //                   49 156
    //                   50 156
    //                   51 156
    //                   52 156
    //                   53 156
    //                   54 156
    //                   55 156
    //                   56 156
    //                   57 156
    //                   58 156
    //                   59 293
    //                   60 167
    //                   61 156
    //                   62 181;
           goto _L1 _L2 _L3 _L1 _L4 _L5 _L6 _L7 _L8 _L1 _L9 _L1 _L10 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L11 _L12 _L1 _L13
_L10:
        break MISSING_BLOCK_LABEL_321;
_L12:
        break; /* Loop/switch isn't completed */
_L1:
        i -= 3;
_L16:
        i += 4;
        if (true) goto _L15; else goto _L14
_L14:
        s.replace(i, i + 1, "&#60");
          goto _L16
_L13:
        s.replace(i, i + 1, "&#62");
          goto _L16
_L7:
        s.replace(i, i + 1, "&#40");
          goto _L16
_L8:
        s.replace(i, i + 1, "&#41");
          goto _L16
_L3:
        s.replace(i, i + 1, "&#35");
          goto _L16
_L5:
        s.replace(i, i + 1, "&#38");
          goto _L16
_L2:
        s.replace(i, i + 1, "&#34");
          goto _L16
_L6:
        s.replace(i, i + 1, "&#39");
          goto _L16
_L4:
        s.replace(i, i + 1, "&#37");
          goto _L16
_L11:
        s.replace(i, i + 1, "&#59");
          goto _L16
_L9:
        s.replace(i, i + 1, "&#43");
          goto _L16
        s.replace(i, i + 1, "&#45");
          goto _L16
        return s.toString();
    }

    public String doFilterUrl(String s)
    {
        return doFilter(s);
    }
}
