// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.a.b;

import com.google.f.e.m;
import com.google.protobuf.nano.g;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.InputStream;

public final class c
    implements Closeable
{

    private final DataInputStream a;

    public c(InputStream inputstream)
    {
        a = new DataInputStream(inputstream);
    }

    public final m a()
    {
        int i;
        do
        {
            i = a.readInt();
        } while (i == 0);
        if (i <= 0 || i > 0x400000)
        {
            throw new IndexOutOfBoundsException((new StringBuilder(21)).append("Wrong len ").append(i).toString());
        } else
        {
            byte abyte0[] = new byte[i];
            a.readFully(abyte0);
            m m1 = new m();
            g.mergeFrom(m1, abyte0);
            return m1;
        }
    }

    public final void close()
    {
        a.close();
    }
}
