// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cu;

import java.io.IOException;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.m4b.maps.cu:
//            a, h

public class g
{

    public volatile int n;

    public g()
    {
        n = -1;
    }

    public static final byte[] a(g g1)
    {
        byte abyte0[] = new byte[g1.e()];
        int i = abyte0.length;
        try
        {
            a a1 = com.google.android.m4b.maps.cu.a.a(abyte0, i);
            g1.a(a1);
            if (a1.a.remaining() != 0)
            {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
        }
        // Misplaced declaration of an exception variable
        catch (g g1)
        {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", g1);
        }
        return abyte0;
    }

    public void a(a a1)
    {
    }

    public int b()
    {
        return 0;
    }

    public Object clone()
    {
        return d();
    }

    public g d()
    {
        return (g)super.clone();
    }

    public final int e()
    {
        int i = b();
        n = i;
        return i;
    }

    public String toString()
    {
        return h.a(this);
    }
}
