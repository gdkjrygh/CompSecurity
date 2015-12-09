// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            nh, np

public abstract class no
{

    protected volatile int p;

    public no()
    {
        p = -1;
    }

    public static final byte[] a(no no1)
    {
        byte abyte0[] = new byte[no1.f()];
        int i = abyte0.length;
        try
        {
            nh nh1 = nh.a(abyte0, i);
            no1.a(nh1);
            nh1.a();
        }
        // Misplaced declaration of an exception variable
        catch (no no1)
        {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", no1);
        }
        return abyte0;
    }

    protected int a()
    {
        return 0;
    }

    public void a(nh nh1)
    {
    }

    public Object clone()
    {
        return d();
    }

    public no d()
    {
        return (no)super.clone();
    }

    public final int e()
    {
        if (p < 0)
        {
            f();
        }
        return p;
    }

    public final int f()
    {
        int i = a();
        p = i;
        return i;
    }

    public String toString()
    {
        return np.a(this);
    }
}
