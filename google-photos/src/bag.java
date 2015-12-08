// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

public final class bag
{

    private static final char a[] = "0123456789abcdef".toCharArray();
    private static final char b[] = new char[64];

    public static int a(int i, int j, android.graphics.Bitmap.Config config)
    {
        android.graphics.Bitmap.Config config1;
        config1 = config;
        if (config == null)
        {
            config1 = android.graphics.Bitmap.Config.ARGB_8888;
        }
        bah.a[config1.ordinal()];
        JVM INSTR tableswitch 1 3: default 44
    //                   1 54
    //                   2 60
    //                   3 60;
           goto _L1 _L2 _L3 _L3
_L1:
        byte byte0 = 4;
_L5:
        return byte0 * (i * j);
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
        if (bitmap.isRecycled())
        {
            String s = String.valueOf(bitmap);
            int i = bitmap.getWidth();
            int k = bitmap.getHeight();
            bitmap = String.valueOf(bitmap.getConfig());
            throw new IllegalStateException((new StringBuilder(String.valueOf(s).length() + 66 + String.valueOf(bitmap).length())).append("Cannot obtain size for recycled Bitmap: ").append(s).append("[").append(i).append("x").append(k).append("] ").append(bitmap).toString());
        }
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            break MISSING_BLOCK_LABEL_118;
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
        int i = 0;
_L2:
        if (i >= abyte0.length)
        {
            break; /* Loop/switch isn't completed */
        }
        int j = abyte0[i] & 0xff;
        ac1[i << 1] = a[j >>> 4];
        ac1[(i << 1) + 1] = a[j & 0xf];
        i++;
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
            throw new IllegalArgumentException("You must call this method on a background thread");
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
