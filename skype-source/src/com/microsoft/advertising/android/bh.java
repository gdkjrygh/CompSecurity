// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;


// Referenced classes of package com.microsoft.advertising.android:
//            av

public final class bh
{

    public static String a(String s)
    {
        int i = 0;
        StringBuilder stringbuilder;
        int j;
        s = s.getBytes();
        stringbuilder = new StringBuilder();
        j = s.length;
_L2:
        if (i >= j)
        {
            char ac[];
            byte byte0;
            try
            {
                return new String(stringbuilder.toString().getBytes(), "ISO-8859-1");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                av.c("OrmmaUtils.convert", s.getMessage());
            }
            break MISSING_BLOCK_LABEL_221;
        }
        byte0 = s[i];
        if ((byte0 & 0x80) <= 0)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        stringbuilder.append("%");
        ac = new char[16];
        ac;
        ac[0] = '0';
        ac[1] = '1';
        ac[2] = '2';
        ac[3] = '3';
        ac[4] = '4';
        ac[5] = '5';
        ac[6] = '6';
        ac[7] = '7';
        ac[8] = '8';
        ac[9] = '9';
        ac[10] = 'a';
        ac[11] = 'b';
        ac[12] = 'c';
        ac[13] = 'd';
        ac[14] = 'e';
        ac[15] = 'f';
        stringbuilder.append(new String(new char[] {
            ac[byte0 >> 4 & 0xf], ac[byte0 & 0xf]
        }));
        break MISSING_BLOCK_LABEL_223;
        stringbuilder.append((char)byte0);
        break MISSING_BLOCK_LABEL_223;
        return null;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
