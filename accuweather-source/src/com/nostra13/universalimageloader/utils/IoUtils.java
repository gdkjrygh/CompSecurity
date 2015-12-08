// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.utils;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class IoUtils
{
    public static interface CopyListener
    {

        public abstract boolean onBytesCopied(int i, int j);
    }


    public static final int CONTINUE_LOADING_PERCENTAGE = 75;
    public static final int DEFAULT_BUFFER_SIZE = 32768;

    private IoUtils()
    {
    }

    public static void closeSilently(Closeable closeable)
    {
        try
        {
            closeable.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Closeable closeable)
        {
            return;
        }
    }

    public static boolean copyStream(InputStream inputstream, OutputStream outputstream, CopyListener copylistener)
        throws IOException
    {
        return copyStream(inputstream, outputstream, copylistener, 32768);
    }

    public static boolean copyStream(InputStream inputstream, OutputStream outputstream, CopyListener copylistener, int i)
        throws IOException
    {
        int j = 0;
        int l = inputstream.available();
        byte abyte0[] = new byte[i];
        if (shouldStopLoading(copylistener, 0, l))
        {
            return false;
        }
        do
        {
            int k = inputstream.read(abyte0, 0, i);
            if (k != -1)
            {
                outputstream.write(abyte0, 0, k);
                k = j + k;
                j = k;
                if (shouldStopLoading(copylistener, k, l))
                {
                    return false;
                }
            } else
            {
                return true;
            }
        } while (true);
    }

    private static boolean shouldStopLoading(CopyListener copylistener, int i, int j)
    {
        return copylistener != null && !copylistener.onBytesCopied(i, j) && (i * 100) / j < 75;
    }
}
