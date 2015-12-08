// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Closeables
{

    private static final Logger logger = Logger.getLogger(com/google/common/io/Closeables.getName());

    private Closeables()
    {
    }

    public static void close(Closeable closeable, boolean flag)
        throws IOException
    {
        if (closeable == null)
        {
            return;
        }
        try
        {
            closeable.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Closeable closeable) { }
        if (flag)
        {
            logger.log(Level.WARNING, "IOException thrown while closing Closeable.", closeable);
            return;
        } else
        {
            throw closeable;
        }
    }

    public static void closeQuietly(Closeable closeable)
    {
        try
        {
            close(closeable, true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Closeable closeable)
        {
            logger.log(Level.SEVERE, "IOException should not have been thrown.", closeable);
        }
    }

}
