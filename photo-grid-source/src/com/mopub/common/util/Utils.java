// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common.util;

import java.security.MessageDigest;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

public class Utils
{

    private static final AtomicLong a = new AtomicLong(1L);

    public Utils()
    {
    }

    public static boolean bitMaskContainsFlag(int i, int j)
    {
        return (i & j) != 0;
    }

    public static long generateUniqueId()
    {
        long l;
        long l2;
        do
        {
            l2 = a.get();
            long l1 = l2 + 1L;
            l = l1;
            if (l1 > 0x7ffffffffffffffeL)
            {
                l = 1L;
            }
        } while (!a.compareAndSet(l2, l));
        return l2;
    }

    public static String sha1(String s)
    {
        int i = 0;
        StringBuilder stringbuilder = new StringBuilder();
        int j;
        try
        {
            MessageDigest messagedigest = MessageDigest.getInstance("SHA-1");
            s = s.getBytes("UTF-8");
            messagedigest.update(s, 0, s.length);
            s = messagedigest.digest();
            j = s.length;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return "";
        }
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        stringbuilder.append(String.format("%02X", new Object[] {
            Byte.valueOf(s[i])
        }));
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_40;
_L1:
        s = stringbuilder.toString().toLowerCase(Locale.US);
        return s;
    }

}
