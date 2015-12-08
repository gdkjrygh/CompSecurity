// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts;

import com.microsoft.onlineid.d;
import com.microsoft.onlineid.g;
import com.microsoft.onlineid.internal.k;
import com.microsoft.onlineid.internal.o;
import java.io.Serializable;
import java.util.Arrays;

public final class f
    implements Serializable
{

    public static final d a = new g("http://Passport.NET/tb", null);
    private final String b;
    private final byte c[];

    public f(String s, byte abyte0[])
    {
        o.a(s, "token");
        k.a(abyte0, "sessionKey");
        b = s;
        c = abyte0;
    }

    public final String a()
    {
        return b;
    }

    public final byte[] b()
    {
        return c;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj != null && (obj instanceof f))
            {
                if (!k.a(b, ((f) (obj = (f)obj)).b) || !Arrays.equals(c, ((f) (obj)).c))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return b.hashCode() + Arrays.hashCode(c);
    }

}
