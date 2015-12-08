// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public final class FileLocker
    implements Closeable
{

    private final FileOutputStream a;
    private final FileLock b;

    private FileLocker(File file)
    {
        a = new FileOutputStream(file);
        file = a.getChannel().lock();
        if (file == null)
        {
            a.close();
        }
        b = file;
        return;
        file;
        a.close();
        throw file;
    }

    public static FileLocker a(File file)
    {
        return new FileLocker(file);
    }

    public final void close()
    {
        b.release();
        a.close();
        return;
        Exception exception;
        exception;
        a.close();
        throw exception;
    }
}
