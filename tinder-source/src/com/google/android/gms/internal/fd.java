// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzsd, ew, zzrx, fe

public abstract class fd
{

    protected volatile int A;

    public fd()
    {
        A = -1;
    }

    public static final fd a(fd fd1, byte abyte0[], int i)
        throws zzsd
    {
        try
        {
            abyte0 = ew.a(abyte0, i);
            fd1.a(((ew) (abyte0)));
            abyte0.a(0);
        }
        // Misplaced declaration of an exception variable
        catch (fd fd1)
        {
            throw fd1;
        }
        // Misplaced declaration of an exception variable
        catch (fd fd1)
        {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
        return fd1;
    }

    public static final byte[] a(fd fd1)
    {
        byte abyte0[] = new byte[fd1.e()];
        int i = abyte0.length;
        try
        {
            zzrx zzrx1 = zzrx.a(abyte0, i);
            fd1.a(zzrx1);
            zzrx1.a();
        }
        // Misplaced declaration of an exception variable
        catch (fd fd1)
        {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", fd1);
        }
        return abyte0;
    }

    public abstract fd a(ew ew1)
        throws IOException;

    public void a(zzrx zzrx1)
        throws IOException
    {
    }

    protected int b()
    {
        return 0;
    }

    public fd c()
        throws CloneNotSupportedException
    {
        return (fd)super.clone();
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return c();
    }

    public final int d()
    {
        if (A < 0)
        {
            e();
        }
        return A;
    }

    public final int e()
    {
        int i = b();
        A = i;
        return i;
    }

    public String toString()
    {
        return fe.a(this);
    }
}
