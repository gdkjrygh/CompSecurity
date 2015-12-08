// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.events.nativeImpl;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

final class FileLockResources
{

    private final FileChannel channel;
    private final FileLock lock;
    private final OutputStream stream;

    public FileLockResources(OutputStream outputstream, FileChannel filechannel, FileLock filelock)
    {
        stream = outputstream;
        channel = filechannel;
        lock = filelock;
    }

    public void close()
    {
        try
        {
            if (lock.isValid())
            {
                lock.release();
            }
            channel.close();
            stream.flush();
            stream.close();
            return;
        }
        catch (IOException ioexception)
        {
            throw new AssertionError(ioexception);
        }
    }
}
