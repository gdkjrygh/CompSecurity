// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f;

import com.kik.m.e;
import java.io.StringWriter;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import kik.a.f.d.a.b;
import kik.a.h.h;
import org.d.a.c;

// Referenced classes of package kik.a.f:
//            g

public final class o extends b
{

    private b a;
    private StringWriter b;
    private boolean c;
    private byte d[];
    private byte e[];
    private SecureRandom f;
    private byte g[];
    private long h;

    public o()
    {
        a = new b();
        c = false;
        e = new byte[16];
        f = new SecureRandom();
    }

    public final c a(String s, String s1, String s2)
    {
        if (c)
        {
            a.a(s, s1, s2);
            return this;
        } else
        {
            super.a(s, s1, s2);
            return this;
        }
    }

    public final void a()
    {
        if (c || d == null)
        {
            return;
        } else
        {
            h = 0L;
            c = true;
            long l = System.currentTimeMillis();
            f.nextBytes(e);
            b = new StringWriter();
            a.a(b);
            long l1 = h;
            h = (System.currentTimeMillis() - l) + l1;
            return;
        }
    }

    public final void a(String s)
    {
        c(null, s);
    }

    public final void a(String s, String s1)
    {
        a(null, s, s1);
    }

    public final void a(byte abyte0[])
    {
        d = abyte0;
    }

    public final long b()
    {
        if (!c || d == null)
        {
            return 0L;
        }
        c = false;
        long l = System.currentTimeMillis();
        byte abyte0[];
        byte abyte1[];
        byte abyte2[];
        if (g != null)
        {
            abyte0 = g;
        } else
        {
            abyte0 = e;
        }
        b.flush();
        abyte1 = b.toString().getBytes();
        abyte2 = kik.a.h.h.a(abyte1, d, abyte0);
        if (abyte2 == null)
        {
            throw new g("Failed to encrypt");
        }
        String s = com.kik.m.e.b(abyte2);
        super.c(null, "enc");
        super.a(null, "iv", com.kik.m.e.b(abyte0));
        try
        {
            super.a(null, "mac", com.kik.m.e.a(kik.a.h.h.a(abyte1, d), 5, 16));
        }
        catch (InvalidKeyException invalidkeyexception)
        {
            throw new g(invalidkeyexception);
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            throw new g(nosuchalgorithmexception);
        }
        super.c(s);
        super.d(null, "enc");
        h = h + (System.currentTimeMillis() - l);
        return h;
    }

    public final void b(String s)
    {
        d(null, s);
    }

    public final void b(String s, String s1)
    {
        c(null, s);
        c(s1);
        d(null, s);
    }

    public final c c(String s)
    {
        if (c)
        {
            a.c(s);
            return this;
        } else
        {
            super.c(s);
            return this;
        }
    }

    public final c c(String s, String s1)
    {
        if (c)
        {
            a.c(s, s1);
            return this;
        } else
        {
            super.c(s, s1);
            return this;
        }
    }

    public final c d(String s, String s1)
    {
        if (c)
        {
            a.d(s, s1);
            return this;
        } else
        {
            super.d(s, s1);
            return this;
        }
    }
}
