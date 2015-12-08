// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.c.b:
//            ax, aj, bj, at, 
//            p, aw, ae, ap, 
//            z, m

public final class ay
{

    private static final AtomicInteger a = new AtomicInteger();
    private final aj b;
    private final ax c;
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

    ay()
    {
        f = true;
        b = null;
        c = new ax(null, null);
    }

    ay(aj aj1, Uri uri)
    {
        f = true;
        if (aj1.m)
        {
            throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
        } else
        {
            b = aj1;
            c = new ax(uri, aj1.j);
            return;
        }
    }

    private Drawable e()
    {
        if (g != 0)
        {
            return b.c.getResources().getDrawable(g);
        } else
        {
            return k;
        }
    }

    public final ay a()
    {
        if (l != null)
        {
            throw new IllegalStateException("Error image already set.");
        } else
        {
            h = 0x7f020143;
            return this;
        }
    }

    public final ay a(int i1, int j1)
    {
        Resources resources = b.c.getResources();
        return b(resources.getDimensionPixelSize(i1), resources.getDimensionPixelSize(j1));
    }

    public final void a(ImageView imageview)
    {
        a(imageview, ((m) (null)));
    }

    public final void a(ImageView imageview, m m1)
    {
        long l1;
        l1 = System.nanoTime();
        bj.a();
        if (imageview == null)
        {
            throw new IllegalArgumentException("Target must not be null.");
        }
        if (c.a()) goto _L2; else goto _L1
_L1:
        b.a(imageview);
        if (f)
        {
            at.a(imageview, e());
        }
_L4:
        return;
_L2:
        aw aw1;
        Object obj;
        if (e)
        {
            if (c.b())
            {
                throw new IllegalStateException("Fit cannot be used with resize.");
            }
            int i1 = imageview.getWidth();
            int k1 = imageview.getHeight();
            if (i1 == 0 || k1 == 0)
            {
                if (f)
                {
                    at.a(imageview, e());
                }
                aj aj1 = b;
                m1 = new p(this, imageview, m1);
                aj1.h.put(imageview, m1);
                return;
            }
            c.a(i1, k1);
        }
        int j1 = a.getAndIncrement();
        obj = c.d();
        obj.a = j1;
        obj.b = l1;
        boolean flag = b.l;
        if (flag)
        {
            bj.a("Main", "created", ((aw) (obj)).b(), ((aw) (obj)).toString());
        }
        aw1 = b.a(((aw) (obj)));
        if (aw1 != obj)
        {
            aw1.a = j1;
            aw1.b = l1;
            if (flag)
            {
                bj.a("Main", "changed", aw1.a(), (new StringBuilder("into ")).append(aw1).toString());
            }
        }
        obj = bj.a(aw1);
        if (!ae.a(i))
        {
            break; /* Loop/switch isn't completed */
        }
        android.graphics.Bitmap bitmap = b.b(((String) (obj)));
        if (bitmap == null)
        {
            break; /* Loop/switch isn't completed */
        }
        b.a(imageview);
        at.a(imageview, b.c, bitmap, ap.a, d, b.k);
        if (b.l)
        {
            bj.a("Main", "completed", aw1.b(), (new StringBuilder("from ")).append(ap.a).toString());
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (f)
        {
            at.a(imageview, e());
        }
        imageview = new z(b, imageview, aw1, i, j, h, l, ((String) (obj)), m, m1, d);
        b.a(imageview);
        return;
    }

    final ay b()
    {
        e = false;
        return this;
    }

    public final ay b(int i1, int j1)
    {
        c.a(i1, j1);
        return this;
    }

    public final ay c()
    {
        c.c();
        return this;
    }

    public final ay d()
    {
        d = true;
        return this;
    }

}
