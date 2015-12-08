// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import java.io.IOException;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.gms.b:
//            aA, aH

public abstract class aG
{

    protected volatile int n;

    public aG()
    {
        n = -1;
    }

    public static final byte[] a(aG ag)
    {
        byte abyte0[] = new byte[ag.e()];
        int i = abyte0.length;
        try
        {
            aA aa = aA.a(abyte0, i);
            ag.a(aa);
            if (aa.a.remaining() != 0)
            {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
        }
        // Misplaced declaration of an exception variable
        catch (aG ag)
        {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", ag);
        }
        return abyte0;
    }

    protected int a()
    {
        return 0;
    }

    public void a(aA aa)
        throws IOException
    {
    }

    public aG c()
        throws CloneNotSupportedException
    {
        return (aG)super.clone();
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return c();
    }

    public final int d()
    {
        if (n < 0)
        {
            e();
        }
        return n;
    }

    public final int e()
    {
        int i = a();
        n = i;
        return i;
    }

    public String toString()
    {
        return aH.a(this);
    }
}
