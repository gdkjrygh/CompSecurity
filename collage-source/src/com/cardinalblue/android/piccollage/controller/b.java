// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.a;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.lib.e;
import com.cardinalblue.android.piccollage.view.g;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            l, CollageController

public class b extends l
{

    private com.cardinalblue.android.piccollage.lib.g c;
    private Executor d;
    private bolts.j.a e;

    public b(g g1, CollageController collagecontroller)
    {
        super(g1, collagecontroller);
        d = Executors.newSingleThreadExecutor();
    }

    private Bitmap a(int i, Bitmap bitmap)
    {
        float f = (float)i / 320F;
        return Bitmap.createScaledBitmap(bitmap, (int)Math.ceil((float)bitmap.getWidth() * f), (int)Math.ceil(f * (float)bitmap.getHeight()), false);
    }

    private Bitmap a(Bitmap bitmap)
        throws com.cardinalblue.android.piccollage.model.k.a
    {
        Object obj = ((g)a).i();
        Bitmap bitmap1;
        if (bitmap == null)
        {
            bitmap1 = null;
        } else
        {
            bitmap1 = bitmap;
            if (((g)a).j())
            {
                obj = a(bitmap, ((String) (obj)));
                bitmap1 = bitmap;
                if (obj != null)
                {
                    return ((Bitmap) (obj));
                }
            }
        }
        return bitmap1;
    }

    private Bitmap a(Bitmap bitmap, String s)
    {
        DisplayMetrics displaymetrics = k.a().getResources().getDisplayMetrics();
        Bitmap bitmap1 = bitmap;
        switch (displaymetrics.densityDpi)
        {
        default:
            bitmap1 = a(displaymetrics.densityDpi, bitmap);
            // fall through

        case 320: 
            return bitmap1;

        case 120: // 'x'
        case 160: 
        case 240: 
            return a(s, displaymetrics.densityDpi, bitmap);
        }
    }

    static Bitmap a(b b1, Bitmap bitmap)
        throws com.cardinalblue.android.piccollage.model.k.a
    {
        return b1.a(bitmap);
    }

    private Bitmap a(String s, int i, Bitmap bitmap)
    {
        s = a(i, s);
        try
        {
            s = com.cardinalblue.android.piccollage.lib.a.e.a(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        s = s.a(1024);
        return s;
        s;
        return a(i, bitmap);
    }

    static bolts.j.a a(b b1)
    {
        return b1.e;
    }

    private j a(com.cardinalblue.android.piccollage.lib.g.a a1)
    {
        return e().a(a1).c(new i() {

            final b a;

            public Bitmap a(j j1)
                throws Exception
            {
                Bitmap bitmap = (Bitmap)j1.e();
                j1 = bitmap;
                if (bitmap == null)
                {
                    j1 = ((g)a.a).m();
                }
                try
                {
                    j1 = com.cardinalblue.android.piccollage.controller.b.a(a, j1.copy(android.graphics.Bitmap.Config.ARGB_8888, false));
                }
                // Misplaced declaration of an exception variable
                catch (j j1)
                {
                    throw new com.cardinalblue.android.piccollage.model.k.a(j1);
                }
                return j1;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                a = b.this;
                super();
            }
        }, k.b).c(new i() {

            final b a;

            public Bitmap a(j j1)
                throws Exception
            {
                ((g)a.a).a((Bitmap)j1.e());
                return (Bitmap)j1.e();
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                a = b.this;
                super();
            }
        }, d);
    }

    private String a(int i, String s)
    {
        switch (i)
        {
        default:
            return s;

        case 120: // 'x'
            return (new StringBuilder()).append(s).append("_ldpi").toString();

        case 160: 
            return (new StringBuilder()).append(s).append("_mdpi").toString();

        case 240: 
            return (new StringBuilder()).append(s).append("_hdpi").toString();
        }
    }

    private com.cardinalblue.android.piccollage.lib.g e()
    {
        if (c == null)
        {
            c = new com.cardinalblue.android.piccollage.lib.g((g)a);
        }
        return c;
    }

    public j a()
    {
        e = j.a();
        a(com.cardinalblue.android.piccollage.lib.g.a.c).a(new i() {

            final b a;

            public Object then(j j1)
                throws Exception
            {
                if (com.cardinalblue.android.piccollage.controller.b.a(a) == null)
                {
                    return null;
                }
                if (j1.c())
                {
                    com.cardinalblue.android.piccollage.controller.b.a(a).c();
                    return null;
                }
                if (j1.d())
                {
                    com.cardinalblue.android.piccollage.controller.b.a(a).b(j1.f());
                    return null;
                } else
                {
                    com.cardinalblue.android.piccollage.controller.b.a(a).b(j1.e());
                    return null;
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
        return e.a();
    }

    public void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        ((g)a).n();
        ((g)a).b(new String(s));
        ((g)a).a(new File(""));
        c = null;
        if (e != null)
        {
            e.b();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public j b()
    {
        if (a == null || ((g)a).m() == null)
        {
            return j.a(new IOException("the image scrap and drawable should not be null"));
        } else
        {
            return j.a(new Callable() {

                final b a;

                public Void a()
                    throws Exception
                {
                    if (a.a == null || ((g)a.a).m() == null)
                    {
                        throw new IOException("the image scrap and drawable should not be null");
                    }
                    File file = com.cardinalblue.android.piccollage.model.k.a(((g)a.a).m(), "png");
                    if (file == null)
                    {
                        throw new IOException("the image scrap's bitmap can't save into a file");
                    } else
                    {
                        ((g)a.a).a(file);
                        return null;
                    }
                }

                public Object call()
                    throws Exception
                {
                    return a();
                }

            
            {
                a = b.this;
                super();
            }
            }, d);
        }
    }

    public void c()
    {
        com.cardinalblue.android.b.a.b(((g)j()).m());
    }

    public boolean d()
    {
        return e().c();
    }
}
