// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.channels.spi.AbstractSelectableChannel;

abstract class al
    implements ReadableByteChannel, ScatteringByteChannel
{

    private AbstractSelectableChannel a;

    al(AbstractSelectableChannel abstractselectablechannel)
    {
        abstractselectablechannel.configureBlocking(false);
        a = abstractselectablechannel;
    }

    public abstract int a(ByteBuffer abytebuffer[]);

    public abstract void a();

    public abstract boolean b();

    public boolean c()
    {
        return false;
    }

    public void close()
    {
        a.close();
    }

    public boolean isOpen()
    {
        return a.isOpen();
    }
}
