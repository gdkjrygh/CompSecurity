// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.util;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class CachingInputStream extends InputStream
{

    private final InputStream a;
    private final ByteArrayOutputStream b;

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
        b.write(i);
        return i;
    }
}
