// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.squareup.a:
//            az, ak, ax, bm, 
//            af, au, q, aq, 
//            m, aa, bi

public class ba
{

    private static final AtomicInteger a = new AtomicInteger();
    private final ak b;
    private final az c;
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

    ba()
    {
        f = true;
        b = null;
        c = new az(null, 0, null);
    }

    ba(ak ak1, Uri uri, int i1)
    {
        f = true;
        if (ak1.m)
        {
            throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
        } else
        {
            b = ak1;
            c = new az(uri, i1, ak1.j);
            return;
        }
    }

    private ax a(long l1)
    {
        int i1 = a.getAndIncrement();
        ax ax1 = c.c();
        ax1.a = i1;
        ax1.b = l1;
        boolean flag = b.l;
        if (flag)
        {
            bm.a("Main", "created", ax1.b(), ax1.toString());
        }
        ax ax2 = b.a(ax1);
        if (ax2 != ax1)
        {
            ax2.a = i1;
            ax2.b = l1;
            if (flag)
            {
                bm.a("Main", "changed", ax2.a(), (new StringBuilder()).append("into ").append(ax2).toString());
            }
        }
        return ax2;
    }

    private Drawable c()
    {
        if (g != 0)
        {
            return b.c.getResources().getDrawable(g);
        } else
        {
            return k;
        }
    }

    ba a()
    {
        e = false;
        return this;
    }

    public ba a(int i1)
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

    public ba a(int i1, int j1)
    {
        c.a(i1, j1);
        return this;
    }

    public transient ba a(af af1, af aaf[])
    {
        if (af1 == null)
        {
            throw new IllegalArgumentException("Memory policy cannot be null.");
        }
        i = i | af1.c;
        if (aaf == null)
        {
            throw new IllegalArgumentException("Memory policy cannot be null.");
        }
        if (aaf.length > 0)
        {
            int j1 = aaf.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                af1 = aaf[i1];
                if (af1 == null)
                {
                    throw new IllegalArgumentException("Memory policy cannot be null.");
                }
                int k1 = i;
                i = af1.c | k1;
            }

        }
        return this;
    }

    public ba a(bi bi)
    {
        c.a(bi);
        return this;
    }

    public void a(ImageView imageview)
    {
        a(imageview, ((m) (null)));
    }

    public void a(ImageView imageview, m m1)
    {
        long l1;
        l1 = System.nanoTime();
        bm.a();
        if (imageview == null)
        {
            throw new IllegalArgumentException("Target must not be null.");
        }
        if (c.a()) goto _L2; else goto _L1
_L1:
        b.a(imageview);
        if (f)
        {
            au.a(imageview, c());
        }
_L4:
        return;
_L2:
        ax ax1;
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
                    au.a(imageview, c());
                }
                b.a(imageview, new q(this, imageview, m1));
                return;
            }
            c.a(i1, j1);
        }
        ax1 = a(l1);
        s = bm.a(ax1);
        if (!af.a(i))
        {
            break; /* Loop/switch isn't completed */
        }
        android.graphics.Bitmap bitmap = b.b(s);
        if (bitmap == null)
        {
            break; /* Loop/switch isn't completed */
        }
        b.a(imageview);
        au.a(imageview, b.c, bitmap, aq.a, d, b.k);
        if (b.l)
        {
            bm.a("Main", "completed", ax1.b(), (new StringBuilder()).append("from ").append(aq.a).toString());
        }
        if (m1 != null)
        {
            m1.a();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (f)
        {
            au.a(imageview, c());
        }
        imageview = new aa(b, imageview, ax1, i, j, h, l, s, m, m1, d);
        b.a(imageview);
        return;
    }

    public ba b()
    {
        return a(af.a, new af[] {
            af.b
        });
    }

    public ba b(int i1)
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

}
