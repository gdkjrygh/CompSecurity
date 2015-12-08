// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import java.io.IOException;

// Referenced classes of package com.b.a:
//            a, u, p, m, 
//            r

public final class q
{

    static final boolean a;

    private q()
    {
    }

    public static void a(byte abyte0[], Object obj, u u1)
    {
        int i = abyte0.length;
        try
        {
            abyte0 = new a(abyte0, i, false);
            u1.a(abyte0, obj);
            abyte0.a(0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", p.a(abyte0));
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", abyte0);
        }
    }

    public static byte[] a(Object obj, u u1, m m1)
    {
        if (m1.b != m1.c)
        {
            throw new IllegalArgumentException("Buffer previously used and had not been reset.");
        }
        m1 = new r(m1);
        try
        {
            u1.a(m1, obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", ((Throwable) (obj)));
        }
        return m1.a();
    }

    static 
    {
        boolean flag;
        if (!com/b/a/q.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
