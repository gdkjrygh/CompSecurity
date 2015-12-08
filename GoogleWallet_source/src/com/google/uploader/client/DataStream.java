// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.uploader.client;

import java.io.IOException;

public interface DataStream
{

    public abstract long getMarkPosition();

    public abstract long getReadAheadLimit();

    public abstract long getReadPosition();

    public abstract long getSize();

    public abstract boolean hasMoreData()
        throws IOException;

    public abstract void mark();

    public abstract int read(byte abyte0[], int i, int j)
        throws IOException;

    public abstract void rewind();

    public abstract long skip(long l)
        throws IOException;
}
