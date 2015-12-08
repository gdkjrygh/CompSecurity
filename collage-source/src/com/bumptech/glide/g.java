// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.widget.ImageView;
import com.bumptech.glide.g.h;
import com.bumptech.glide.load.b.c;
import com.bumptech.glide.load.b.l;
import com.bumptech.glide.load.engine.prefill.a;
import com.bumptech.glide.load.resource.bitmap.e;
import com.bumptech.glide.load.resource.bitmap.i;
import com.bumptech.glide.load.resource.bitmap.j;
import com.bumptech.glide.load.resource.bitmap.m;
import com.bumptech.glide.load.resource.bitmap.o;
import com.bumptech.glide.load.resource.c.b;
import com.bumptech.glide.load.resource.e.d;
import com.bumptech.glide.request.b.f;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.bumptech.glide:
//            h, j

public class g
{

    private static volatile g a;
    private final c b;
    private final com.bumptech.glide.load.engine.c c;
    private final com.bumptech.glide.load.engine.a.c d;
    private final com.bumptech.glide.load.engine.b.h e;
    private final com.bumptech.glide.load.a f;
    private final f g = new f();
    private final d h = new d();
    private final com.bumptech.glide.e.c i = new com.bumptech.glide.e.c();
    private final e j;
    private final com.bumptech.glide.load.resource.d.f k;
    private final i l;
    private final com.bumptech.glide.load.resource.d.f m;
    private final Handler n = new Handler(Looper.getMainLooper());
    private final a o;

    g(com.bumptech.glide.load.engine.c c1, com.bumptech.glide.load.engine.b.h h1, com.bumptech.glide.load.engine.a.c c2, Context context, com.bumptech.glide.load.a a1)
    {
        c = c1;
        d = c2;
        e = h1;
        f = a1;
        b = new c(context);
        o = new a(h1, c2, a1);
        c1 = new o(c2, a1);
        i.a(java/io/InputStream, android/graphics/Bitmap, c1);
        h1 = new com.bumptech.glide.load.resource.bitmap.g(c2, a1);
        i.a(android/os/ParcelFileDescriptor, android/graphics/Bitmap, h1);
        c1 = new m(c1, h1);
        i.a(com/bumptech/glide/load/b/g, android/graphics/Bitmap, c1);
        h1 = new com.bumptech.glide.load.resource.c.c(context, c2);
        i.a(java/io/InputStream, com/bumptech/glide/load/resource/c/b, h1);
        i.a(com/bumptech/glide/load/b/g, com/bumptech/glide/load/resource/d/a, new com.bumptech.glide.load.resource.d.g(c1, h1, c2));
        i.a(java/io/InputStream, java/io/File, new com.bumptech.glide.load.resource.b.d());
        a(java/io/File, android/os/ParcelFileDescriptor, new com.bumptech.glide.load.b.a.a.a());
        a(java/io/File, java/io/InputStream, new com.bumptech.glide.load.b.b.c.a());
        a(Integer.TYPE, android/os/ParcelFileDescriptor, new com.bumptech.glide.load.b.a.c.a());
        a(Integer.TYPE, java/io/InputStream, new com.bumptech.glide.load.b.b.e.a());
        a(java/lang/Integer, android/os/ParcelFileDescriptor, new com.bumptech.glide.load.b.a.c.a());
        a(java/lang/Integer, java/io/InputStream, new com.bumptech.glide.load.b.b.e.a());
        a(java/lang/String, android/os/ParcelFileDescriptor, new com.bumptech.glide.load.b.a.d.a());
        a(java/lang/String, java/io/InputStream, new com.bumptech.glide.load.b.b.f.a());
        a(android/net/Uri, android/os/ParcelFileDescriptor, new com.bumptech.glide.load.b.a.e.a());
        a(android/net/Uri, java/io/InputStream, new com.bumptech.glide.load.b.b.a());
        a(java/net/URL, java/io/InputStream, new com.bumptech.glide.load.b.b.h.a());
        a(com/bumptech/glide/load/b/d, java/io/InputStream, new com.bumptech.glide.load.b.b.a.a());
        a([B, java/io/InputStream, new com.bumptech.glide.load.b.b.b.a());
        h.a(android/graphics/Bitmap, com/bumptech/glide/load/resource/bitmap/j, new com.bumptech.glide.load.resource.e.b(context.getResources(), c2));
        h.a(com/bumptech/glide/load/resource/d/a, com/bumptech/glide/load/resource/a/b, new com.bumptech.glide.load.resource.e.a(new com.bumptech.glide.load.resource.e.b(context.getResources(), c2)));
        j = new e(c2);
        k = new com.bumptech.glide.load.resource.d.f(c2, j);
        l = new i(c2);
        m = new com.bumptech.glide.load.resource.d.f(c2, l);
    }

    public static g a(Context context)
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        com/bumptech/glide/g;
        JVM INSTR monitorenter ;
        Object obj;
        com.bumptech.glide.h h1;
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        context = context.getApplicationContext();
        obj = (new com.bumptech.glide.d.b(context)).a();
        h1 = new com.bumptech.glide.h(context);
        for (Iterator iterator = ((List) (obj)).iterator(); iterator.hasNext(); ((com.bumptech.glide.d.a)iterator.next()).a(context, h1)) { }
        break MISSING_BLOCK_LABEL_82;
        context;
        com/bumptech/glide/g;
        JVM INSTR monitorexit ;
        throw context;
        a = h1.a();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((com.bumptech.glide.d.a)((Iterator) (obj)).next()).a(context, a)) { }
        com/bumptech/glide/g;
        JVM INSTR monitorexit ;
_L2:
        return a;
    }

    public static com.bumptech.glide.j a(FragmentActivity fragmentactivity)
    {
        return com.bumptech.glide.manager.j.a().a(fragmentactivity);
    }

    public static l a(Class class1, Context context)
    {
        return a(class1, java/io/InputStream, context);
    }

    public static l a(Class class1, Class class2, Context context)
    {
        if (class1 == null)
        {
            if (Log.isLoggable("Glide", 3))
            {
                Log.d("Glide", "Unable to load null model, setting placeholder only");
            }
            return null;
        } else
        {
            return a(context).i().a(class1, class2);
        }
    }

    public static void a(com.bumptech.glide.request.b.j j1)
    {
        com.bumptech.glide.g.h.a();
        com.bumptech.glide.request.c c1 = j1.a();
        if (c1 != null)
        {
            c1.d();
            j1.a(null);
        }
    }

    public static com.bumptech.glide.j b(Context context)
    {
        return com.bumptech.glide.manager.j.a().a(context);
    }

    public static l b(Class class1, Context context)
    {
        return a(class1, android/os/ParcelFileDescriptor, context);
    }

    private c i()
    {
        return b;
    }

    public com.bumptech.glide.load.engine.a.c a()
    {
        return d;
    }

    com.bumptech.glide.load.resource.e.c a(Class class1, Class class2)
    {
        return h.a(class1, class2);
    }

    com.bumptech.glide.request.b.j a(ImageView imageview, Class class1)
    {
        return g.a(imageview, class1);
    }

    public void a(int i1)
    {
        d.a(i1);
        e.a(i1);
    }

    public void a(Class class1, Class class2, com.bumptech.glide.load.b.m m1)
    {
        class1 = b.a(class1, class2, m1);
        if (class1 != null)
        {
            class1.a();
        }
    }

    com.bumptech.glide.e.b b(Class class1, Class class2)
    {
        return i.a(class1, class2);
    }

    com.bumptech.glide.load.engine.c b()
    {
        return c;
    }

    e c()
    {
        return j;
    }

    i d()
    {
        return l;
    }

    com.bumptech.glide.load.resource.d.f e()
    {
        return k;
    }

    com.bumptech.glide.load.resource.d.f f()
    {
        return m;
    }

    com.bumptech.glide.load.a g()
    {
        return f;
    }

    public void h()
    {
        d.a();
        e.c();
    }
}
