// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicInteger;

public final class cgt
{

    private static final AtomicInteger a = new AtomicInteger();
    private final cgh b;
    private final cgs c;
    private boolean d;
    private boolean e;
    private boolean f;
    private int g;
    private int h;
    private int i;
    private int j;
    private Drawable k;
    private Drawable l;
    private Object m;

    cgt()
    {
        f = true;
        b = null;
        c = new cgs(null, 0, null);
    }

    cgt(cgh cgh1, Uri uri, int i1)
    {
        f = true;
        if (cgh1.m)
        {
            throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
        } else
        {
            b = cgh1;
            c = new cgs(uri, i1, cgh1.j);
            return;
        }
    }

    private cgr a(long l1)
    {
        int i1 = a.getAndIncrement();
        cgr cgr1 = c.f();
        cgr1.a = i1;
        cgr1.b = l1;
        boolean flag = b.l;
        if (flag)
        {
            chf.a("Main", "created", cgr1.b(), cgr1.toString());
        }
        cgr cgr2 = b.a(cgr1);
        if (cgr2 != cgr1)
        {
            cgr2.a = i1;
            cgr2.b = l1;
            if (flag)
            {
                chf.a("Main", "changed", cgr2.a(), (new StringBuilder("into ")).append(cgr2).toString());
            }
        }
        return cgr2;
    }

    private Drawable h()
    {
        if (g != 0)
        {
            return b.c.getResources().getDrawable(g);
        } else
        {
            return k;
        }
    }

    public final cgt a()
    {
        e = true;
        return this;
    }

    public final cgt a(int i1)
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

    public final cgt a(int i1, int j1)
    {
        Resources resources = b.c.getResources();
        return b(resources.getDimensionPixelSize(i1), resources.getDimensionPixelSize(j1));
    }

    public final cgt a(Drawable drawable)
    {
        if (!f)
        {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        }
        if (g != 0)
        {
            throw new IllegalStateException("Placeholder image already set.");
        } else
        {
            k = drawable;
            return this;
        }
    }

    public final transient cgt a(cgc cgc1)
    {
        if (cgc1 == null)
        {
            throw new IllegalArgumentException("Memory policy cannot be null.");
        } else
        {
            i = i | cgc1.c;
            return this;
        }
    }

    public final cgt a(chc chc)
    {
        c.a(chc);
        return this;
    }

    public final cgt a(Object obj)
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

    public final void a(ImageView imageview)
    {
        a(imageview, ((cfj) (null)));
    }

    public final void a(ImageView imageview, cfj cfj1)
    {
        long l1;
        l1 = System.nanoTime();
        chf.b();
        if (imageview == null)
        {
            throw new IllegalArgumentException("Target must not be null.");
        }
        if (c.a()) goto _L2; else goto _L1
_L1:
        b.a(imageview);
        if (f)
        {
            cgo.a(imageview, h());
        }
_L4:
        return;
_L2:
        cgr cgr1;
        String s;
        if (e)
        {
            if (c.b())
            {
                throw new IllegalStateException("Fit cannot be used with resize.");
            }
            int i1 = imageview.getWidth();
            int j1 = imageview.getHeight();
            if (i1 == 0 || j1 == 0)
            {
                if (f)
                {
                    cgo.a(imageview, h());
                }
                b.a(imageview, new cfn(this, imageview, cfj1));
                return;
            }
            c.a(i1, j1);
        }
        cgr1 = a(l1);
        s = chf.a(cgr1);
        if (!cgc.a(i))
        {
            break; /* Loop/switch isn't completed */
        }
        Bitmap bitmap = b.b(s);
        if (bitmap == null)
        {
            break; /* Loop/switch isn't completed */
        }
        b.a(imageview);
        cgo.a(imageview, b.c, bitmap, cgl.a, d, b.k);
        if (b.l)
        {
            chf.a("Main", "completed", cgr1.b(), (new StringBuilder("from ")).append(cgl.a).toString());
        }
        if (cfj1 != null)
        {
            cfj1.a();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (f)
        {
            cgo.a(imageview, h());
        }
        imageview = new cfx(b, imageview, cgr1, i, j, h, l, s, m, cfj1, d);
        b.a(imageview);
        return;
    }

    public final void a(cha cha1)
    {
        long l1 = System.nanoTime();
        chf.b();
        if (cha1 == null)
        {
            throw new IllegalArgumentException("Target must not be null.");
        }
        if (e)
        {
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
        if (!c.a())
        {
            b.a(cha1);
            if (f)
            {
                h();
            }
            cha1.b();
            return;
        }
        Object obj = a(l1);
        String s = chf.a(((cgr) (obj)));
        if (cgc.a(i))
        {
            Bitmap bitmap = b.b(s);
            if (bitmap != null)
            {
                b.a(cha1);
                obj = cgl.a;
                cha1.a(bitmap);
                return;
            }
        }
        if (f)
        {
            h();
        }
        cha1.b();
        cha1 = new chb(b, cha1, ((cgr) (obj)), i, j, l, s, m, h);
        b.a(cha1);
    }

    final cgt b()
    {
        e = false;
        return this;
    }

    public final cgt b(int i1)
    {
        if (i1 == 0)
        {
            throw new IllegalArgumentException("Error image resource invalid.");
        }
        if (l != null)
        {
            throw new IllegalStateException("Error image already set.");
        } else
        {
            h = i1;
            return this;
        }
    }

    public final cgt b(int i1, int j1)
    {
        c.a(i1, j1);
        return this;
    }

    public final cgt b(Drawable drawable)
    {
        if (drawable == null)
        {
            throw new IllegalArgumentException("Error image may not be null.");
        }
        if (h != 0)
        {
            throw new IllegalStateException("Error image already set.");
        } else
        {
            l = drawable;
            return this;
        }
    }

    public final cgt c()
    {
        c.c();
        return this;
    }

    public final cgt d()
    {
        c.d();
        return this;
    }

    public final cgt e()
    {
        c.e();
        return this;
    }

    public final cgt f()
    {
        d = true;
        return this;
    }

    public final Bitmap g()
    {
        long l1 = System.nanoTime();
        chf.a();
        if (e)
        {
            throw new IllegalStateException("Fit cannot be used with get.");
        }
        if (!c.a())
        {
            return null;
        } else
        {
            Object obj = a(l1);
            String s = chf.a(((cgr) (obj)), new StringBuilder());
            obj = new cfw(b, ((cgr) (obj)), i, j, m, s);
            return cfh.a(b, b.d, b.e, b.f, ((cfe) (obj))).a();
        }
    }

}
