// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            la, kt, ku, lc

public abstract class lb
{

    protected volatile int s;

    public lb()
    {
        s = -1;
    }

    public static final lb a(lb lb1, byte abyte0[])
        throws la
    {
        return a(lb1, abyte0, abyte0.length);
    }

    private static lb a(lb lb1, byte abyte0[], int i)
        throws la
    {
        try
        {
            abyte0 = kt.a(abyte0, i);
            lb1.a(((kt) (abyte0)));
            abyte0.a(0);
        }
        // Misplaced declaration of an exception variable
        catch (lb lb1)
        {
            throw lb1;
        }
        // Misplaced declaration of an exception variable
        catch (lb lb1)
        {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
        return lb1;
    }

    public static final byte[] a(lb lb1)
    {
        byte abyte0[] = new byte[lb1.f()];
        int i = abyte0.length;
        try
        {
            ku ku1 = ku.a(abyte0, i);
            lb1.a(ku1);
            ku1.b();
        }
        // Misplaced declaration of an exception variable
        catch (lb lb1)
        {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", lb1);
        }
        return abyte0;
    }

    protected int a()
    {
        return 0;
    }

    public abstract lb a(kt kt1)
        throws IOException;

    public void a(ku ku1)
        throws IOException
    {
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return d();
    }

    public lb d()
        throws CloneNotSupportedException
    {
        return (lb)super.clone();
    }

    public final int e()
    {
        if (s < 0)
        {
            f();
        }
        return s;
    }

    public final int f()
    {
        int i = a();
        s = i;
        return i;
    }

    public String toString()
    {
        return lc.a(this);
    }
}
