// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import com.bumptech.glide.d.n;
import com.bumptech.glide.g.b.f;
import com.bumptech.glide.load.b.d.a;
import com.bumptech.glide.load.c.a.g;
import com.bumptech.glide.load.c.b.k;
import com.bumptech.glide.load.c.b.m;
import com.bumptech.glide.load.c.b.o;
import com.bumptech.glide.load.c.c;
import com.bumptech.glide.load.c.t;
import com.bumptech.glide.load.resource.b.e;
import com.bumptech.glide.load.resource.bitmap.j;
import com.bumptech.glide.load.resource.bitmap.l;
import com.bumptech.glide.load.resource.bitmap.s;
import com.bumptech.glide.load.resource.bitmap.v;
import com.bumptech.glide.load.resource.c.b;
import com.bumptech.glide.load.resource.d.i;
import com.bumptech.glide.load.resource.e.d;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.bumptech.glide:
//            i, p

public class h
{

    private static volatile h a;
    private final c b;
    private final com.bumptech.glide.load.b.f c;
    private final com.bumptech.glide.load.b.a.e d;
    private final com.bumptech.glide.load.b.b.n e;
    private final com.bumptech.glide.load.a f;
    private final f g = new f();
    private final d h = new d();
    private final com.bumptech.glide.f.c i = new com.bumptech.glide.f.c();
    private final com.bumptech.glide.load.resource.bitmap.e j;
    private final com.bumptech.glide.load.resource.d.h k;
    private final l l;
    private final com.bumptech.glide.load.resource.d.h m;
    private final Handler n = new Handler(Looper.getMainLooper());
    private final a o;

    h(com.bumptech.glide.load.b.f f1, com.bumptech.glide.load.b.b.n n1, com.bumptech.glide.load.b.a.e e1, Context context, com.bumptech.glide.load.a a1)
    {
        c = f1;
        d = e1;
        e = n1;
        f = a1;
        b = new c(context);
        o = new a(n1, e1, a1);
        f1 = new v(e1, a1);
        i.a(java/io/InputStream, android/graphics/Bitmap, f1);
        n1 = new j(e1, a1);
        i.a(android/os/ParcelFileDescriptor, android/graphics/Bitmap, n1);
        f1 = new s(f1, n1);
        i.a(com/bumptech/glide/load/c/j, android/graphics/Bitmap, f1);
        n1 = new com.bumptech.glide.load.resource.c.d(context, e1);
        i.a(java/io/InputStream, com/bumptech/glide/load/resource/c/b, n1);
        i.a(com/bumptech/glide/load/c/j, com/bumptech/glide/load/resource/d/a, new i(f1, n1, e1));
        i.a(java/io/InputStream, java/io/File, new e());
        a(java/io/File, android/os/ParcelFileDescriptor, new com.bumptech.glide.load.c.a.b());
        a(java/io/File, java/io/InputStream, new com.bumptech.glide.load.c.b.f());
        a(Integer.TYPE, android/os/ParcelFileDescriptor, new com.bumptech.glide.load.c.a.e());
        a(Integer.TYPE, java/io/InputStream, new com.bumptech.glide.load.c.b.i());
        a(java/lang/Integer, android/os/ParcelFileDescriptor, new com.bumptech.glide.load.c.a.e());
        a(java/lang/Integer, java/io/InputStream, new com.bumptech.glide.load.c.b.i());
        a(java/lang/String, android/os/ParcelFileDescriptor, new g());
        a(java/lang/String, java/io/InputStream, new k());
        a(android/net/Uri, android/os/ParcelFileDescriptor, new com.bumptech.glide.load.c.a.i());
        a(android/net/Uri, java/io/InputStream, new m());
        a(java/net/URL, java/io/InputStream, new o());
        a(com/bumptech/glide/load/c/e, java/io/InputStream, new com.bumptech.glide.load.c.b.b());
        a([B, java/io/InputStream, new com.bumptech.glide.load.c.b.d());
        h.a(android/graphics/Bitmap, com/bumptech/glide/load/resource/bitmap/m, new com.bumptech.glide.load.resource.e.b(context.getResources(), e1));
        h.a(com/bumptech/glide/load/resource/d/a, com/bumptech/glide/load/resource/a/b, new com.bumptech.glide.load.resource.e.a(new com.bumptech.glide.load.resource.e.b(context.getResources(), e1)));
        j = new com.bumptech.glide.load.resource.bitmap.e(e1);
        k = new com.bumptech.glide.load.resource.d.h(e1, j);
        l = new l(e1);
        m = new com.bumptech.glide.load.resource.d.h(e1, l);
    }

    public static h a(Context context)
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        com/bumptech/glide/h;
        JVM INSTR monitorenter ;
        Object obj;
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        obj = context.getApplicationContext();
        context = (new com.bumptech.glide.e.b(((Context) (obj)))).a();
        obj = new com.bumptech.glide.i(((Context) (obj)));
        for (Iterator iterator = context.iterator(); iterator.hasNext(); ((com.bumptech.glide.e.a)iterator.next()).a(((com.bumptech.glide.i) (obj)))) { }
        break MISSING_BLOCK_LABEL_81;
        context;
        com/bumptech/glide/h;
        JVM INSTR monitorexit ;
        throw context;
        a = ((com.bumptech.glide.i) (obj)).a();
        for (context = context.iterator(); context.hasNext();)
        {
            context.next();
            h h1 = a;
        }

        com/bumptech/glide/h;
        JVM INSTR monitorexit ;
_L2:
        return a;
    }

    public static com.bumptech.glide.load.c.s a(Class class1, Context context)
    {
        return a(class1, java/io/InputStream, context);
    }

    private static com.bumptech.glide.load.c.s a(Class class1, Class class2, Context context)
    {
        if (class1 == null)
        {
            Log.isLoggable("Glide", 3);
            return null;
        } else
        {
            return a(context).b.a(class1, class2);
        }
    }

    public static p a(Activity activity)
    {
        return com.bumptech.glide.d.n.a().a(activity);
    }

    public static p a(Fragment fragment)
    {
        return com.bumptech.glide.d.n.a().a(fragment);
    }

    public static p a(FragmentActivity fragmentactivity)
    {
        return com.bumptech.glide.d.n.a().a(fragmentactivity);
    }

    public static void a(com.bumptech.glide.g.b.k k1)
    {
        com.bumptech.glide.i.h.a();
        com.bumptech.glide.g.c c1 = k1.e();
        if (c1 != null)
        {
            c1.c();
            k1.a(null);
        }
    }

    private void a(Class class1, Class class2, t t)
    {
        b.a(class1, class2, t);
    }

    public static com.bumptech.glide.load.c.s b(Class class1, Context context)
    {
        return a(class1, android/os/ParcelFileDescriptor, context);
    }

    public static p b(Context context)
    {
        return com.bumptech.glide.d.n.a().a(context);
    }

    public final com.bumptech.glide.load.b.a.e a()
    {
        return d;
    }

    final com.bumptech.glide.load.resource.e.c a(Class class1, Class class2)
    {
        return h.a(class1, class2);
    }

    public final void a(int i1)
    {
        d.a(i1);
        e.a(i1);
    }

    final com.bumptech.glide.f.b b(Class class1, Class class2)
    {
        return i.a(class1, class2);
    }

    final com.bumptech.glide.load.b.f b()
    {
        return c;
    }

    final com.bumptech.glide.load.resource.bitmap.e c()
    {
        return j;
    }

    final l d()
    {
        return l;
    }

    final com.bumptech.glide.load.resource.d.h e()
    {
        return k;
    }

    final com.bumptech.glide.load.resource.d.h f()
    {
        return m;
    }

    final com.bumptech.glide.load.a g()
    {
        return f;
    }

    public final void h()
    {
        d.a();
        e.a();
    }
}
