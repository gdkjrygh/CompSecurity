// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ac;

import p.s.k;

public class a
    implements k
{

    private final byte a[];

    public a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new NullPointerException("Bytes must not be null");
        } else
        {
            a = abyte0;
            return;
        }
    }

    public byte[] a()
    {
        return a;
    }

    public Object b()
    {
        return a();
    }

    public int c()
    {
        return a.length;
    }

    public void d()
    {
    }
}
