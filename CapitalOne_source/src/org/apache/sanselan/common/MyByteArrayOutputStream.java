// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.common;

import java.io.IOException;
import java.io.OutputStream;

public class MyByteArrayOutputStream extends OutputStream
{

    private final byte a[];
    private int b;

    public void write(int i)
    {
        if (b >= a.length)
        {
            throw new IOException((new StringBuilder("Write exceeded expected length (")).append(b).append(", ").append(a.length).append(")").toString());
        } else
        {
            a[b] = (byte)i;
            b = b + 1;
            return;
        }
    }
}
