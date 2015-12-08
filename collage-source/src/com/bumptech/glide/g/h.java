// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.g;

import android.graphics.Bitmap;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

public final class h
{

    private static final char a[] = "0123456789abcdef".toCharArray();
    private static final char b[] = new char[64];
    private static final char c[] = new char[40];

    private h()
    {
    }

    public static int a(int i, int j, android.graphics.Bitmap.Config config)
    {
        return i * j * a(config);
    }

    private static int a(android.graphics.Bitmap.Config config)
    {
        android.graphics.Bitmap.Config config1 = config;
        if (config == null)
        {
            config1 = android.graphics.Bitmap.Config.ARGB_8888;
        }
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[android.graphics.Bitmap.Config.values().length];
                try
                {
                    a[android.graphics.Bitmap.Config.ALPHA_8.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[android.graphics.Bitmap.Config.RGB_565.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[android.graphics.Bitmap.Config.ARGB_4444.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[android.graphics.Bitmap.Config.ARGB_8888.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[config1.ordinal()])
        {
        default:
            return 4;

        case 1: // '\001'
            return 1;

        case 2: // '\002'
        case 3: // '\003'
            return 2;
        }
    }

    public static int a(Bitmap bitmap)
    {
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        int i = bitmap.getAllocationByteCount();
        return i;
        NullPointerException nullpointerexception;
        nullpointerexception;
        return bitmap.getHeight() * bitmap.getRowBytes();
    }

    public static String a(byte abyte0[])
    {
        synchronized (b)
        {
            abyte0 = a(abyte0, b);
        }
        return abyte0;
        abyte0;
        ac;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    private static String a(byte abyte0[], char ac[])
    {
        for (int i = 0; i < abyte0.length; i++)
        {
            int j = abyte0[i] & 0xff;
            ac[i * 2] = a[j >>> 4];
            ac[i * 2 + 1] = a[j & 0xf];
        }

        return new String(ac);
    }

    public static List a(Collection collection)
    {
        ArrayList arraylist = new ArrayList(collection.size());
        for (collection = collection.iterator(); collection.hasNext(); arraylist.add(collection.next())) { }
        return arraylist;
    }

    public static Queue a(int i)
    {
        return new ArrayDeque(i);
    }

    public static void a()
    {
        if (!c())
        {
            throw new IllegalArgumentException("You must call this method on the main thread");
        } else
        {
            return;
        }
    }

    public static boolean a(int i, int j)
    {
        return b(i) && b(j);
    }

    public static void b()
    {
        if (!d())
        {
            throw new IllegalArgumentException("YOu must call this method on a background thread");
        } else
        {
            return;
        }
    }

    private static boolean b(int i)
    {
        return i > 0 || i == 0x80000000;
    }

    public static boolean c()
    {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean d()
    {
        return !c();
    }

}
