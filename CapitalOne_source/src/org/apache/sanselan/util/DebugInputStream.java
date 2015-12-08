// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.util;

import java.io.InputStream;

public class DebugInputStream extends InputStream
{

    private final InputStream a;
    private long b;

    public int available()
    {
        return a.available();
    }

    public void close()
    {
        a.close();
    }

    public int read()
    {
        int i = a.read();
        b = b + 1L;
        return i;
    }

    public long skip(long l)
    {
        long l1 = a.skip(l);
        b = b + l;
        return l1;
    }
}
