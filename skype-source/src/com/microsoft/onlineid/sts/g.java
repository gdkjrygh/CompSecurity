// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts;

import java.security.SecureRandom;

// Referenced classes of package com.microsoft.onlineid.sts:
//            h

public final class g
{

    private final SecureRandom a = new SecureRandom();

    public g()
    {
    }

    private String a(String s, int i)
    {
        char ac[] = new char[i];
        int j = s.length();
        for (i = 0; i < ac.length; i++)
        {
            ac[i] = s.charAt(a.nextInt(j));
        }

        return new String(ac);
    }

    public final h a()
    {
        return new h((new StringBuilder("02")).append(a("abcdefghijklmnopqrstuvwxyz", 18)).toString(), a("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+[]{}/?;:'\",.<>`~", 16));
    }
}
