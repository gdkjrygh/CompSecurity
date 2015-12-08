// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.i;

import android.graphics.Bitmap;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

// Referenced classes of package com.bumptech.glide.i:
//            i

public final class h
{

    private static final char a[] = "0123456789abcdef".toCharArray();
    private static final char b[] = new char[64];
    private static final char c[] = new char[40];

    public static int a(int j, int k, android.graphics.Bitmap.Config config)
    {
        android.graphics.Bitmap.Config config1;
        config1 = config;
        if (config == null)
        {
            config1 = android.graphics.Bitmap.Config.ARGB_8888;
        }
        i.a[config1.ordinal()];
        JVM INSTR tableswitch 1 3: default 44
    //                   1 54
    //                   2 60
    //                   3 60;
           goto _L1 _L2 _L3 _L3
_L1:
        byte byte0 = 4;
_L5:
        return byte0 * (j * k);
_L2:
        byte0 = 1;
        continue; /* Loop/switch isn't completed */
_L3:
        byte0 = 2;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static int a(Bitmap bitmap)
    {
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        int j = bitmap.getAllocationByteCount();
        return j;
        NullPointerException nullpointerexception;
        nullpointerexception;
        return bitmap.getHeight() * bitmap.getRowBytes();
    }

    public static String a(byte abyte0[])
    {
        char ac[] = b;
        ac;
        JVM INSTR monitorenter ;
        char ac1[] = b;
        int j = 0;
_L2:
        if (j >= abyte0.length)
        {
            break; /* Loop/switch isn't completed */
        }
        int k = abyte0[j] & 0xff;
        ac1[j * 2] = a[k >>> 4];
        ac1[j * 2 + 1] = a[k & 0xf];
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        abyte0 = new String(ac1);
        ac;
        JVM INSTR monitorexit ;
        return abyte0;
        abyte0;
        ac;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    public static List a(Collection collection)
    {
        ArrayList arraylist = new ArrayList(collection.size());
        for (collection = collection.iterator(); collection.hasNext(); arraylist.add(collection.next())) { }
        return arraylist;
    }

    public static Queue a(int j)
    {
        return new ArrayDeque(j);
    }

    public static void a()
    {
        if (!b())
        {
            throw new IllegalArgumentException("You must call this method on the main thread");
        } else
        {
            return;
        }
    }

    public static boolean a(int j, int k)
    {
        return b(j) && b(k);
    }

    public static boolean b()
    {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    private static boolean b(int j)
    {
        return j > 0 || j == 0x80000000;
    }

    public static boolean c()
    {
        return !b();
    }

}
