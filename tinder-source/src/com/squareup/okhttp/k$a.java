// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;


// Referenced classes of package com.squareup.okhttp:
//            k, TlsVersion

public static final class a
{

    boolean a;
    String b[];
    String c[];
    boolean d;

    public final a a()
    {
        if (!a)
        {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        } else
        {
            d = true;
            return this;
        }
    }

    public final transient ersion a(TlsVersion atlsversion[])
    {
        if (!a)
        {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (atlsversion.length == 0)
        {
            throw new IllegalArgumentException("At least one TlsVersion is required");
        }
        String as[] = new String[atlsversion.length];
        for (int i = 0; i < atlsversion.length; i++)
        {
            as[i] = atlsversion[i].e;
        }

        c = as;
        return this;
    }

    public final transient c a(String as[])
    {
        if (!a)
        {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (as == null)
        {
            b = null;
            return this;
        } else
        {
            b = (String[])as.clone();
            return this;
        }
    }

    public final transient e b(String as[])
    {
        if (!a)
        {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (as == null)
        {
            c = null;
            return this;
        } else
        {
            c = (String[])as.clone();
            return this;
        }
    }

    public final k b()
    {
        return new k(this, (byte)0);
    }

    public ersion(k k1)
    {
        a = k1.d;
        b = k.a(k1);
        c = k.b(k1);
        d = k1.g;
    }

    d(boolean flag)
    {
        a = flag;
    }
}
