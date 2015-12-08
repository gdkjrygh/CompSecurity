// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.graphics.Bitmap;
import bolts.j;
import com.cardinalblue.android.b.a;
import com.cardinalblue.android.piccollage.lib.g;
import com.cardinalblue.android.piccollage.model.k;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import pl.droidsonroids.gif.c;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            l, CollageController, f

public class i extends l
    implements pl.droidsonroids.gif.c.a
{

    private g c;
    private Executor d;

    public i(com.cardinalblue.android.piccollage.view.g g1, CollageController collagecontroller)
    {
        super(g1, collagecontroller);
        d = Executors.newSingleThreadExecutor();
    }

    static g a(i i1)
    {
        return i1.k();
    }

    static g a(i i1, g g1)
    {
        i1.c = g1;
        return g1;
    }

    private g k()
    {
        if (c == null)
        {
            c = new g((com.cardinalblue.android.piccollage.view.g)a);
        }
        return c;
    }

    private j l()
    {
        return j.a(new Callable() {

            final i a;

            public c a()
                throws Exception
            {
                return com.cardinalblue.android.piccollage.controller.i.a(a).b();
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                a = i.this;
                super();
            }
        }).c(new bolts.i() {

            final i a;

            public Void a(j j1)
                throws Exception
            {
                j1 = (c)j1.e();
                ((com.cardinalblue.android.piccollage.view.g)a.a).b(false);
                j1.a(a);
                ((com.cardinalblue.android.piccollage.view.g)a.a).a(j1);
                a.b.h();
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                a = i.this;
                super();
            }
        });
    }

    public j a()
    {
        if (com.cardinalblue.android.b.g.b(((com.cardinalblue.android.piccollage.view.g)a).i()))
        {
            return l();
        } else
        {
            return k().a().c(new bolts.i() {

                final i a;

                public Void a(j j1)
                    throws Exception
                {
                    ((com.cardinalblue.android.piccollage.view.g)a.a).b(false);
                    if (j1.e() == null)
                    {
                        j1 = new StringBuilder();
                        j1.append("Image resourcer load image with size (").append(com.cardinalblue.android.piccollage.lib.g.a.b).append(") failed");
                        throw new IOException(j1.toString());
                    } else
                    {
                        ((com.cardinalblue.android.piccollage.view.g)a.a).b((Bitmap)j1.e());
                        a.b.h();
                        return null;
                    }
                }

                public Object then(j j1)
                    throws Exception
                {
                    return a(j1);
                }

            
            {
                a = i.this;
                super();
            }
            }, d);
        }
    }

    public j a(boolean flag)
    {
        return j.a(new Callable(flag) {

            final boolean a;
            final i b;

            public Void a()
                throws Exception
            {
                com.cardinalblue.android.piccollage.controller.i.a(b, new g((com.cardinalblue.android.piccollage.view.g)b.a));
                Bitmap bitmap = com.cardinalblue.android.piccollage.lib.a.e.a(((com.cardinalblue.android.piccollage.view.g)b.a).i()).a(f.b);
                if (bitmap != null)
                {
                    ((com.cardinalblue.android.piccollage.view.g)b.a).a(bitmap, a);
                    b.b.h();
                }
                ((com.cardinalblue.android.piccollage.view.g)b.a).b(false);
                return null;
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                b = i.this;
                a = flag;
                super();
            }
        }, d);
    }

    public void a(int i1)
    {
        c c1 = ((com.cardinalblue.android.piccollage.view.g)a).B();
        if (c1 != null)
        {
            c1.b(i1);
        }
    }

    public void a(com.cardinalblue.android.piccollage.lib.g.a a1, android.graphics.Bitmap.Config config)
    {
        if (config == null)
        {
            throw new IllegalArgumentException("the bitmap config should not be null");
        }
        a1 = k().a(a1, config);
        if (a1 != null)
        {
            ((com.cardinalblue.android.piccollage.view.g)a).b(a1);
            b.h();
        }
        ((com.cardinalblue.android.piccollage.view.g)a).b(false);
    }

    public j b()
    {
        if (a == null || ((com.cardinalblue.android.piccollage.view.g)a).m() == null)
        {
            return j.a(new IOException("the image scrap and drawable should not be null"));
        }
        if (((com.cardinalblue.android.piccollage.view.g)a).k() != null && ((com.cardinalblue.android.piccollage.view.g)a).k().exists())
        {
            return j.a(null);
        } else
        {
            return j.a(new Callable() {

                final i a;

                public Void a()
                    throws Exception
                {
                    if (a.a == null || ((com.cardinalblue.android.piccollage.view.g)a.a).m() == null)
                    {
                        throw new IOException("the image scrap and drawable should not be null");
                    }
                    File file = com.cardinalblue.android.piccollage.model.k.a(((com.cardinalblue.android.piccollage.view.g)a.a).m(), "png");
                    if (file == null)
                    {
                        throw new IOException("the image scrap's bitmap can't save into a file");
                    } else
                    {
                        ((com.cardinalblue.android.piccollage.view.g)a.a).a(file);
                        return null;
                    }
                }

                public Object call()
                    throws Exception
                {
                    return a();
                }

            
            {
                a = i.this;
                super();
            }
            }, d);
        }
    }

    public void b(int i1)
    {
        c c1 = ((com.cardinalblue.android.piccollage.view.g)a).B();
        if (c1 != null)
        {
            c1.a(i1 % c1.getDuration());
        }
    }

    public void c()
    {
        com.cardinalblue.android.b.a.b(((com.cardinalblue.android.piccollage.view.g)j()).m());
    }

    public boolean d()
    {
        return k().c();
    }

    public void e()
    {
        b.h();
    }

    public int f()
    {
        c c1 = ((com.cardinalblue.android.piccollage.view.g)a).B();
        if (c1 == null)
        {
            return -1;
        }
        int i1 = c1.c(0);
        if (i1 <= 0)
        {
            return -1;
        } else
        {
            return Math.round(1000F / (float)i1);
        }
    }

    public float g()
    {
        c c1 = ((com.cardinalblue.android.piccollage.view.g)a).B();
        if (c1 == null)
        {
            return -1F;
        } else
        {
            c1.stop();
            c1.start();
            return (float)c1.getDuration() / 1000F;
        }
    }

    public void h()
    {
        c c1 = ((com.cardinalblue.android.piccollage.view.g)a).B();
        if (c1 != null)
        {
            c1.stop();
        }
    }

    public void i()
    {
        c c1 = ((com.cardinalblue.android.piccollage.view.g)a).B();
        if (c1 != null)
        {
            c1.start();
        }
    }
}
