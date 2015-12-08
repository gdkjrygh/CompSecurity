// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.p;
import java.io.OutputStream;

final class b extends OutputStream
{

    b()
    {
    }

    public final String toString()
    {
        return "ByteStreams.nullOutputStream()";
    }

    public final void write(int i)
    {
    }

    public final void write(byte abyte0[])
    {
        p.a(abyte0);
    }

    public final void write(byte abyte0[], int i, int j)
    {
        p.a(abyte0);
    }
}
