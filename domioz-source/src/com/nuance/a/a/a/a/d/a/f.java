// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.a.d.a;

import com.nuance.a.a.a.b.l;

public abstract class f
{

    private static f a = new l();

    public f()
    {
    }

    public static byte[] b(byte abyte0[], byte abyte1[])
    {
        return a.a(abyte0, abyte1);
    }

    public static byte[] c(byte abyte0[], byte abyte1[])
    {
        return a.a(abyte0, abyte1, 28);
    }

    protected abstract byte[] a(byte abyte0[], byte abyte1[]);

    protected abstract byte[] a(byte abyte0[], byte abyte1[], int i);

}
