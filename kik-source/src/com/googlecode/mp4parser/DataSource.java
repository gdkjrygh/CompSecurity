// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public interface DataSource
    extends Closeable
{

    public abstract void close();

    public abstract ByteBuffer map(long l, long l1);

    public abstract long position();

    public abstract void position(long l);

    public abstract int read(ByteBuffer bytebuffer);

    public abstract long size();

    public abstract long transferTo(long l, long l1, WritableByteChannel writablebytechannel);
}
