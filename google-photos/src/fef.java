// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

final class fef
{

    private static final boolean b = Log.isLoggable("Evictor", 3);
    private static final boolean c = Log.isLoggable("Evictor", 2);
    final Handler a;
    private final fem d;
    private final File e;
    private final feh f;
    private final fek g;
    private final Looper h;
    private final long i;
    private final long j;

    fef(fem fem1, File file, feh feh1, fek fek1, Looper looper, long l, 
            float f1)
    {
        d = fem1;
        e = file;
        f = feh1;
        g = fek1;
        h = looper;
        i = l;
        j = Math.min(Math.round((float)l * f1), 0x1900000L);
        a = new Handler(looper, new feg(this));
    }

    static void a(fef fef1)
    {
        if (!Looper.myLooper().equals(fef1.h))
        {
            fef1 = String.valueOf(Thread.currentThread().getName());
            if (fef1.length() != 0)
            {
                fef1 = "Cannot call evictOnWorkThread on thread: ".concat(fef1);
            } else
            {
                fef1 = new String("Cannot call evictOnWorkThread on thread: ");
            }
            throw new IllegalStateException(fef1);
        }
        if (fef1.a())
        {
            long l1 = fef1.i - fef1.j;
            long l2 = fef1.g.d.a.get() - l1;
            if (l2 < 0L)
            {
                throw new IllegalStateException((new StringBuilder(49)).append("Cannot evict negative bytes: ").append(l2).toString());
            }
            List list = fef1.g.a(l2);
            if (list.isEmpty())
            {
                throw new IllegalStateException("Failed to find entries to evict.");
            }
            List list1 = fef1.d.a(list);
            if (b)
            {
                String s = String.valueOf("Ran eviction, tried to delete: ");
                int k = list.size();
                int l = list1.size();
                long l3 = fef1.g.d.a.get();
                long l4 = fef1.f.a(fef1.e);
                (new StringBuilder(String.valueOf(s).length() + 166)).append(s).append(k).append(" entries, actually deleted: ").append(l).append(" entries, target journal : ").append(l1).append(", journal size: ").append(l3).append(", file size: ").append(l4);
            }
        }
    }

    boolean a()
    {
        return g.d.a.get() > j + i;
    }

}
