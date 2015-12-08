// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.speech;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.media.AudioTrack;
import com.google.android.libraries.translate.e.d;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

public final class a
{

    public static final byte a[] = new byte[0];
    public final ExecutorService b;
    private final Context c;

    public a(Context context, ExecutorService executorservice)
    {
        c = context;
        b = executorservice;
    }

    static long a(long l)
    {
        long l1;
        if (l > 500L)
        {
            l1 = 500L;
        } else
        {
            l1 = l;
            if (l < 50L)
            {
                return 50L;
            }
        }
        return l1;
    }

    public static void a(byte abyte0[], AudioTrack audiotrack, int i)
    {
        int j = 0;
        do
        {
            if (j >= i)
            {
                break;
            }
            int k = audiotrack.write(abyte0, j, i - j);
            if (k < 0)
            {
                break;
            }
            j += k;
        } while (true);
    }

    public final byte[] a(int i)
    {
        AssetFileDescriptor assetfiledescriptor = c.getResources().openRawResourceFd(i);
        if (assetfiledescriptor.getLength() > 0x7fffffffL)
        {
            Object obj;
            Object obj1;
            Object obj2;
            java.io.Closeable closeable;
            byte abyte0[];
            try
            {
                assetfiledescriptor.close();
            }
            catch (IOException ioexception) { }
            return a;
        }
        i = (int)assetfiledescriptor.getLength();
        abyte0 = new byte[i];
        obj2 = null;
        obj = null;
        closeable = assetfiledescriptor.createInputStream();
        obj = closeable;
        obj2 = closeable;
        if (com.google.common.a.a.a(closeable, abyte0, i) == i)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        obj = closeable;
        obj2 = closeable;
        try
        {
            throw new IOException();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            obj2 = obj;
        }
        finally
        {
            d.a(((java.io.Closeable) (obj2)));
        }
        closeable = a;
        d.a(((java.io.Closeable) (obj)));
        try
        {
            assetfiledescriptor.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            return closeable;
        }
        return closeable;
        d.a(closeable);
        try
        {
            assetfiledescriptor.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            return abyte0;
        }
        return abyte0;
        try
        {
            assetfiledescriptor.close();
        }
        catch (IOException ioexception1) { }
        throw obj1;
    }

}
