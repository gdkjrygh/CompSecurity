// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a;

import kik.a.d.j;
import kik.a.e.v;

public final class z
{

    private final String a;
    private final String b;
    private j c;
    private String d;

    private z(j j1, String s, String s1, String s2)
    {
        c = j1;
        d = s;
        a = s1;
        b = s2;
    }

    public static boolean a(v v1)
    {
        return b(v1) != null;
    }

    public static z b(v v1)
    {
        if (v1 != null)
        {
            String s = v1.n("CredentialData.jid");
            String s1 = v1.n("CredentialData.password");
            String s2 = v1.n("CredentialData.username_passkey");
            v1 = v1.n("CredentialData.email_passkey");
            if (s != null && s1 != null)
            {
                return new z(j.a(s), s1, s2, v1);
            }
        }
        return null;
    }

    public final j a()
    {
        return c;
    }

    public final String b()
    {
        return a;
    }

    public final String c()
    {
        return b;
    }

    public final String d()
    {
        return d;
    }
}
