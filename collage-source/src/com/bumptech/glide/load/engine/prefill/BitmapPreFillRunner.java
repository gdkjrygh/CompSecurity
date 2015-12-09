// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.g.h;
import com.bumptech.glide.load.engine.a.c;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.Set;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.bumptech.glide.load.engine.prefill:
//            c, b

final class BitmapPreFillRunner
    implements Runnable
{
    static class a
    {

        public long a()
        {
            return SystemClock.currentThreadTimeMillis();
        }

        a()
        {
        }
    }

    private static class b
        implements com.bumptech.glide.load.c
    {

        public void a(MessageDigest messagedigest)
            throws UnsupportedEncodingException
        {
        }

        private b()
        {
        }

    }


    static final long a;
    private static final a b = new a();
    private final c c;
    private final com.bumptech.glide.load.engine.b.h d;
    private final com.bumptech.glide.load.engine.prefill.b e;
    private final a f;
    private final Set g;
    private final Handler h;
    private long i;
    private boolean j;

    private void a(com.bumptech.glide.load.engine.prefill.c c1, Bitmap bitmap)
    {
        if (g.add(c1))
        {
            c1 = c.a(c1.a(), c1.b(), c1.c());
            if (c1 != null)
            {
                c.a(c1);
            }
        }
        c.a(bitmap);
    }

    private boolean a()
    {
        long l = f.a();
        do
        {
            if (e.b() || a(l))
            {
                break;
            }
            com.bumptech.glide.load.engine.prefill.c c1 = e.a();
            Bitmap bitmap = Bitmap.createBitmap(c1.a(), c1.b(), c1.c());
            if (b() >= com.bumptech.glide.g.h.a(bitmap))
            {
                d.b(new b(), com.bumptech.glide.load.resource.bitmap.c.a(bitmap, c));
            } else
            {
                a(c1, bitmap);
            }
            if (Log.isLoggable("PreFillRunner", 3))
            {
                Log.d("PreFillRunner", (new StringBuilder()).append("allocated [").append(c1.a()).append("x").append(c1.b()).append("] ").append(c1.c()).append(" size: ").append(com.bumptech.glide.g.h.a(bitmap)).toString());
            }
        } while (true);
        return !j && !e.b();
    }

    private boolean a(long l)
    {
        return f.a() - l >= 32L;
    }

    private int b()
    {
        return d.b() - d.a();
    }

    private long c()
    {
        long l = i;
        i = Math.min(i * 4L, a);
        return l;
    }

    public void run()
    {
        if (a())
        {
            h.postDelayed(this, c());
        }
    }

    static 
    {
        a = TimeUnit.SECONDS.toMillis(1L);
    }
}
