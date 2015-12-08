// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.okhttp.TlsVersion;

public final class grc
{

    boolean a;
    String b[];
    String c[];
    boolean d;

    public grc(grb grb1)
    {
        a = grb1.d;
        b = grb.a(grb1);
        c = grb.b(grb1);
        d = grb1.g;
    }

    grc(boolean flag)
    {
        a = flag;
    }

    public final grc a()
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

    public final transient grc a(TlsVersion atlsversion[])
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
            as[i] = atlsversion[i].javaName;
        }

        c = as;
        return this;
    }

    public final transient grc a(String as[])
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

    public final grb b()
    {
        return new grb(this, (byte)0);
    }

    public final transient grc b(String as[])
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
}
