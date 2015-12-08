// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.nio.ByteBuffer;

public class krw
{

    public volatile int b;

    public krw()
    {
        b = -1;
    }

    public static final void a(krw krw1, byte abyte0[], int i, int j)
    {
        try
        {
            abyte0 = krr.a(abyte0, 0, j);
            krw1.a(((krr) (abyte0)));
            if (((krr) (abyte0)).a.remaining() != 0)
            {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
        }
        // Misplaced declaration of an exception variable
        catch (krw krw1)
        {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", krw1);
        }
    }

    protected int a()
    {
        return 0;
    }

    public void a(krr krr1)
    {
    }

    public krw c()
    {
        return (krw)super.clone();
    }

    public Object clone()
    {
        return c();
    }

    public final int d()
    {
        if (b < 0)
        {
            e();
        }
        return b;
    }

    public final int e()
    {
        int i = a();
        b = i;
        return i;
    }

    public String toString()
    {
        return b.a(this);
    }
}
