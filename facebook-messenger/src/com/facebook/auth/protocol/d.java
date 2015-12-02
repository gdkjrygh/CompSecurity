// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.protocol;

import com.facebook.auth.credentials.PasswordCredentials;

public class d
{

    private final PasswordCredentials a;
    private final String b;
    private final boolean c;

    public d(PasswordCredentials passwordcredentials, String s, boolean flag)
    {
        a = passwordcredentials;
        b = s;
        c = flag;
    }

    static PasswordCredentials a(d d1)
    {
        return d1.a;
    }

    static boolean b(d d1)
    {
        return d1.c;
    }

    static String c(d d1)
    {
        return d1.b;
    }
}
