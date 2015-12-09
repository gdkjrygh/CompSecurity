// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.l;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.widget.ImageView;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import p.ab.i;
import p.ab.j;
import p.ab.n;
import p.ab.p;
import p.ae.d;
import p.af.b;
import p.ah.e;
import p.ai.k;
import p.an.f;
import p.ap.h;
import p.w.a;
import p.x.c;

// Referenced classes of package p.l:
//            h, j

public class g
{

    private static volatile g a;
    private final c b;
    private final p.s.c c;
    private final p.t.c d;
    private final p.u.h e;
    private final p.q.a f;
    private final e g = new e();
    private final p.ak.c h = new p.ak.c();
    private final p.ab.e i;
    private final f imageViewTargetFactory = new f();
    private final p.ag.f j;
    private final i k;
    private final p.ag.f l;
    private final Handler m = new Handler(Looper.getMainLooper());
    private final a n;

    g(p.s.c c1, p.u.h h1, p.t.c c2, Context context, p.q.a a1)
    {
        c = c1;
        d = c2;
        e = h1;
        f = a1;
        b = new c(context);
        n = new a(h1, c2, a1);
        c1 = new p(c2, a1);
        h.a(java/io/InputStream, android/graphics/Bitmap, c1);
        h1 = new p.ab.g(c2, a1);
        h.a(android/os/ParcelFileDescriptor, android/graphics/Bitmap, h1);
        c1 = new n(c1, h1);
        h.a(p/x/g, android/graphics/Bitmap, c1);
        h1 = new p.af.c(context, c2);
        h.a(java/io/InputStream, p/af/b, h1);
        h.a(p/x/g, p/ag/a, new p.ag.g(c1, h1, c2));
        h.a(java/io/InputStream, java/io/File, new d());
        a(java/io/File, android/os/ParcelFileDescriptor, new p.y.a.a());
        a(java/io/File, java/io/InputStream, new p.z.c.a());
        a(Integer.TYPE, android/os/ParcelFileDescriptor, new p.y.c.a());
        a(Integer.TYPE, java/io/InputStream, new p.z.e.a());
        a(java/lang/Integer, android/os/ParcelFileDescriptor, new p.y.c.a());
        a(java/lang/Integer, java/io/InputStream, new p.z.e.a());
        a(java/lang/String, android/os/ParcelFileDescriptor, new p.y.d.a());
        a(java/lang/String, java/io/InputStream, new p.z.f.a());
        a(android/net/Uri, android/os/ParcelFileDescriptor, new p.y.e.a());
        a(android/net/Uri, java/io/InputStream, new p.z.a());
        a(java/net/URL, java/io/InputStream, new p.z.h.a());
        a(p/x/d, java/io/InputStream, new p.z.a.a());
        a([B, java/io/InputStream, new p.z.b.a());
        g.a(android/graphics/Bitmap, p/ab/j, new p.ah.c(context.getResources(), c2));
        g.a(p/ag/a, p/ad/b, new p.ah.b(new p.ah.c(context.getResources(), c2)));
        i = new p.ab.e(c2);
        j = new p.ag.f(c2, i);
        k = new i(c2);
        l = new p.ag.f(c2, k);
    }

    public static g a(Context context)
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        p/l/g;
        JVM INSTR monitorenter ;
        Object obj;
        p.l.h h1;
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        context = context.getApplicationContext();
        obj = (new p.aj.b(context)).a();
        h1 = new p.l.h(context);
        for (Iterator iterator = ((List) (obj)).iterator(); iterator.hasNext(); ((p.aj.a)iterator.next()).applyOptions(context, h1)) { }
        break MISSING_BLOCK_LABEL_82;
        context;
        p/l/g;
        JVM INSTR monitorexit ;
        throw context;
        a = h1.a();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((p.aj.a)((Iterator) (obj)).next()).registerComponents(context, a)) { }
        p/l/g;
        JVM INSTR monitorexit ;
_L2:
        return a;
    }

    public static p.l.j a(Fragment fragment)
    {
        return p.ai.k.a().a(fragment);
    }

    public static p.l.j a(FragmentActivity fragmentactivity)
    {
        return p.ai.k.a().a(fragmentactivity);
    }

    public static p.x.j a(Class class1, Context context)
    {
        return a(class1, java/io/InputStream, context);
    }

    public static p.x.j a(Class class1, Class class2, Context context)
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
            return a(context).j().a(class1, class2);
        }
    }

    public static void a(p.an.k k1)
    {
        p.ap.h.a();
        p.al.c c1 = k1.a();
        if (c1 != null)
        {
            c1.d();
            k1.a(null);
        }
    }

    public static p.l.j b(Context context)
    {
        return p.ai.k.a().a(context);
    }

    public static p.x.j b(Class class1, Context context)
    {
        return a(class1, android/os/ParcelFileDescriptor, context);
    }

    private c j()
    {
        return b;
    }

    p.ah.d a(Class class1, Class class2)
    {
        return g.a(class1, class2);
    }

    p.an.k a(ImageView imageview, Class class1)
    {
        return imageViewTargetFactory.a(imageview, class1);
    }

    public p.t.c a()
    {
        return d;
    }

    public void a(int i1)
    {
        d.a(i1);
        e.a(i1);
    }

    public void a(Class class1, Class class2, p.x.k k1)
    {
        class1 = b.a(class1, class2, k1);
        if (class1 != null)
        {
            class1.a();
        }
    }

    p.ak.b b(Class class1, Class class2)
    {
        return h.a(class1, class2);
    }

    p.s.c b()
    {
        return c;
    }

    p.ab.e c()
    {
        return i;
    }

    i d()
    {
        return k;
    }

    p.ag.f e()
    {
        return j;
    }

    p.ag.f f()
    {
        return l;
    }

    Handler g()
    {
        return m;
    }

    p.q.a h()
    {
        return f;
    }

    public void i()
    {
        d.a();
        e.a();
    }
}
