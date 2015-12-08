// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.util;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public class CachingOutputStream extends OutputStream
{

    private final OutputStream a;
    private final ByteArrayOutputStream b;

    public void close()
    {
        a.close();
    }

    public void flush()
    {
        a.flush();
    }

    public void write(int i)
    {
        a.write(i);
        b.write(i);
    }
}
