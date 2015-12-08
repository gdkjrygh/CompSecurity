// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.squareup.picasso:
//            Picasso, r, ab, z, 
//            p, h, MemoryPolicy, e, 
//            l, x, y, j

public final class s
{

    private static final AtomicInteger b = new AtomicInteger();
    boolean a;
    private final Picasso c;
    private final r.a d;
    private boolean e;
    private boolean f;
    private int g;
    private int h;
    private int i;
    private int j;
    private Drawable k;
    private Drawable l;
    private Object m;

    s()
    {
        f = true;
        c = null;
        d = new r.a(null, 0, null);
    }

    s(Picasso picasso, Uri uri, int i1)
    {
        f = true;
        if (picasso.o)
        {
            throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
        } else
        {
            c = picasso;
            d = new r.a(uri, i1, picasso.l);
            return;
        }
    }

    private r a(long l1)
    {
        int i1 = b.getAndIncrement();
        Object obj = d;
        if (((r.a) (obj)).g && ((r.a) (obj)).f)
        {
            throw new IllegalStateException("Center crop and center inside can not be used together.");
        }
        if (((r.a) (obj)).f && ((r.a) (obj)).d == 0 && ((r.a) (obj)).e == 0)
        {
            throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
        }
        if (((r.a) (obj)).g && ((r.a) (obj)).d == 0 && ((r.a) (obj)).e == 0)
        {
            throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
        }
        if (((r.a) (obj)).o == null)
        {
            obj.o = Picasso.Priority.b;
        }
        obj = new r(((r.a) (obj)).a, ((r.a) (obj)).b, ((r.a) (obj)).c, ((r.a) (obj)).m, ((r.a) (obj)).d, ((r.a) (obj)).e, ((r.a) (obj)).f, ((r.a) (obj)).g, ((r.a) (obj)).h, ((r.a) (obj)).i, ((r.a) (obj)).j, ((r.a) (obj)).k, ((r.a) (obj)).l, ((r.a) (obj)).n, ((r.a) (obj)).o, (byte)0);
        obj.a = i1;
        obj.b = l1;
        boolean flag = c.n;
        if (flag)
        {
            ab.a("Main", "created", ((r) (obj)).b(), ((r) (obj)).toString());
        }
        Picasso picasso = c;
        r r1 = picasso.c.a(((r) (obj)));
        if (r1 == null)
        {
            throw new IllegalStateException((new StringBuilder("Request transformer ")).append(picasso.c.getClass().getCanonicalName()).append(" returned null for ").append(obj).toString());
        }
        if (r1 != obj)
        {
            r1.a = i1;
            r1.b = l1;
            if (flag)
            {
                ab.a("Main", "changed", r1.a(), (new StringBuilder("into ")).append(r1).toString());
            }
        }
        return r1;
    }

    private Drawable d()
    {
        if (g != 0)
        {
            return c.e.getResources().getDrawable(g);
        } else
        {
            return k;
        }
    }

    public final s a()
    {
        if (l != null)
        {
            throw new IllegalStateException("Error image already set.");
        } else
        {
            h = 0x7f02004f;
            return this;
        }
    }

    public final s a(int i1)
    {
        if (!f)
        {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        }
        if (i1 == 0)
        {
            throw new IllegalArgumentException("Placeholder image resource invalid.");
        }
        if (k != null)
        {
            throw new IllegalStateException("Placeholder image already set.");
        } else
        {
            g = i1;
            return this;
        }
    }

    public final s a(int i1, int j1)
    {
        Resources resources = c.e.getResources();
        return b(resources.getDimensionPixelSize(i1), resources.getDimensionPixelSize(j1));
    }

    public final s a(z z1)
    {
        r.a a1 = d;
        if (z1.key() == null)
        {
            throw new IllegalArgumentException("Transformation key must not be null.");
        }
        if (a1.m == null)
        {
            a1.m = new ArrayList(2);
        }
        a1.m.add(z1);
        return this;
    }

    public final s a(Object obj)
    {
        if (m != null)
        {
            throw new IllegalStateException("Tag already set.");
        } else
        {
            m = obj;
            return this;
        }
    }

    public final void a(ImageView imageview, e e1)
    {
        long l1;
        l1 = System.nanoTime();
        ab.a();
        if (imageview == null)
        {
            throw new IllegalArgumentException("Target must not be null.");
        }
        if (d.a()) goto _L2; else goto _L1
_L1:
        c.b(imageview);
        if (f)
        {
            p.a(imageview, d());
        }
_L4:
        return;
_L2:
        r r1;
        String s1;
        if (a)
        {
            r.a a1 = d;
            boolean flag;
            if (a1.d != 0 || a1.e != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                throw new IllegalStateException("Fit cannot be used with resize.");
            }
            int i1 = imageview.getWidth();
            int j1 = imageview.getHeight();
            if (i1 == 0 || j1 == 0)
            {
                if (f)
                {
                    p.a(imageview, d());
                }
                Picasso picasso = c;
                e1 = new h(this, imageview, e1);
                picasso.j.put(imageview, e1);
                return;
            }
            d.a(i1, j1);
        }
        r1 = a(l1);
        s1 = ab.a(r1);
        if (!MemoryPolicy.a(i))
        {
            break; /* Loop/switch isn't completed */
        }
        android.graphics.Bitmap bitmap = c.b(s1);
        if (bitmap == null)
        {
            break; /* Loop/switch isn't completed */
        }
        c.b(imageview);
        p.a(imageview, c.e, bitmap, Picasso.LoadedFrom.a, e, c.m);
        if (c.n)
        {
            ab.a("Main", "completed", r1.b(), (new StringBuilder("from ")).append(Picasso.LoadedFrom.a).toString());
        }
        if (e1 != null)
        {
            e1.a();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (f)
        {
            p.a(imageview, d());
        }
        imageview = new l(c, imageview, r1, i, j, h, l, s1, m, e1, e);
        c.a(imageview);
        return;
    }

    public final void a(x x1)
    {
        Drawable drawable = null;
        r r1 = null;
        long l1 = System.nanoTime();
        ab.a();
        if (x1 == null)
        {
            throw new IllegalArgumentException("Target must not be null.");
        }
        if (a)
        {
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
        if (!d.a())
        {
            c.b(x1);
            drawable = r1;
            if (f)
            {
                drawable = d();
            }
            x1.onPrepareLoad(drawable);
            return;
        }
        r1 = a(l1);
        String s1 = ab.a(r1);
        if (MemoryPolicy.a(i))
        {
            android.graphics.Bitmap bitmap = c.b(s1);
            if (bitmap != null)
            {
                c.b(x1);
                x1.onBitmapLoaded(bitmap, Picasso.LoadedFrom.a);
                return;
            }
        }
        if (f)
        {
            drawable = d();
        }
        x1.onPrepareLoad(drawable);
        x1 = new y(c, x1, r1, i, j, l, s1, m, h);
        c.a(x1);
    }

    public final s b()
    {
        r.a a1 = d;
        if (a1.g)
        {
            throw new IllegalStateException("Center crop can not be used after calling centerInside");
        } else
        {
            a1.f = true;
            return this;
        }
    }

    public final s b(int i1, int j1)
    {
        d.a(i1, j1);
        return this;
    }

    public final void c()
    {
        Object obj;
        String s1;
label0:
        {
            long l1 = System.nanoTime();
            if (a)
            {
                throw new IllegalStateException("Fit cannot be used with fetch.");
            }
            if (d.a())
            {
                boolean flag;
                if (d.o != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    r.a a1 = d;
                    Picasso.Priority priority = Picasso.Priority.a;
                    if (priority == null)
                    {
                        throw new IllegalArgumentException("Priority invalid.");
                    }
                    if (a1.o != null)
                    {
                        throw new IllegalStateException("Priority already set.");
                    }
                    a1.o = priority;
                }
                obj = a(l1);
                s1 = ab.a(((r) (obj)), new StringBuilder());
                if (c.b(s1) == null)
                {
                    break label0;
                }
                if (c.n)
                {
                    ab.a("Main", "completed", ((r) (obj)).b(), (new StringBuilder("from ")).append(Picasso.LoadedFrom.a).toString());
                }
            }
            return;
        }
        obj = new j(c, ((r) (obj)), i, j, m, s1);
        c.b(((a) (obj)));
    }

}
