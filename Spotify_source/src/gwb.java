// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class gwb
{

    private static final AtomicInteger d = new AtomicInteger();
    public final gwa a;
    public boolean b;
    boolean c;
    private final Picasso e;
    private boolean f;
    private int g;
    private int h;
    private Drawable i;
    private Drawable j;
    private Object k;

    gwb()
    {
        f = true;
        e = null;
        a = new gwa(null, 0, null);
    }

    public gwb(Picasso picasso, Uri uri, int l)
    {
        f = true;
        boolean flag = picasso.i;
        e = picasso;
        a = new gwa(uri, l, picasso.f);
    }

    private gvz a(long l)
    {
        int i1 = d.getAndIncrement();
        Object obj = a;
        if (((gwa) (obj)).f && ((gwa) (obj)).e)
        {
            throw new IllegalStateException("Center crop and center inside can not be used together.");
        }
        if (((gwa) (obj)).e && ((gwa) (obj)).c == 0 && ((gwa) (obj)).d == 0)
        {
            throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
        }
        if (((gwa) (obj)).f && ((gwa) (obj)).c == 0 && ((gwa) (obj)).d == 0)
        {
            throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
        }
        if (((gwa) (obj)).j == null)
        {
            obj.j = com.squareup.picasso.Picasso.Priority.b;
        }
        obj = new gvz(((gwa) (obj)).a, ((gwa) (obj)).b, ((gwa) (obj)).h, ((gwa) (obj)).c, ((gwa) (obj)).d, ((gwa) (obj)).e, ((gwa) (obj)).f, ((gwa) (obj)).g, ((gwa) (obj)).i, ((gwa) (obj)).j, (byte)0);
        obj.a = i1;
        obj.b = l;
        boolean flag = e.h;
        if (flag)
        {
            gwm.a("Main", "created", ((gvz) (obj)).b(), ((gvz) (obj)).toString());
        }
        Picasso picasso = e;
        gvz gvz1 = picasso.b.a(((gvz) (obj)));
        if (gvz1 == null)
        {
            throw new IllegalStateException((new StringBuilder("Request transformer ")).append(picasso.b.getClass().getCanonicalName()).append(" returned null for ").append(obj).toString());
        }
        if (gvz1 != obj)
        {
            gvz1.a = i1;
            gvz1.b = l;
            if (flag)
            {
                gwm.a("Main", "changed", gvz1.a(), (new StringBuilder("into ")).append(gvz1).toString());
            }
        }
        return gvz1;
    }

    private Drawable f()
    {
        if (g != 0)
        {
            return e.d.getResources().getDrawable(g);
        } else
        {
            return i;
        }
    }

    public final gwb a()
    {
        if (g != 0)
        {
            throw new IllegalStateException("Placeholder resource already set.");
        }
        if (i != null)
        {
            throw new IllegalStateException("Placeholder image already set.");
        } else
        {
            f = false;
            return this;
        }
    }

    public final gwb a(int l)
    {
        if (!f)
        {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        }
        if (l == 0)
        {
            throw new IllegalArgumentException("Placeholder image resource invalid.");
        }
        if (i != null)
        {
            throw new IllegalStateException("Placeholder image already set.");
        } else
        {
            g = l;
            return this;
        }
    }

    public final gwb a(int l, int i1)
    {
        Resources resources = e.d.getResources();
        return b(resources.getDimensionPixelSize(l), resources.getDimensionPixelSize(i1));
    }

    public final gwb a(android.graphics.Bitmap.Config config)
    {
        a.i = config;
        return this;
    }

    public final gwb a(Drawable drawable)
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
            i = drawable;
            return this;
        }
    }

    public final gwb a(gwk gwk1)
    {
        gwa gwa1 = a;
        if (gwk1 == null)
        {
            throw new IllegalArgumentException("Transformation must not be null.");
        }
        if (gwk1.a() == null)
        {
            throw new IllegalArgumentException("Transformation key must not be null.");
        }
        if (gwa1.h == null)
        {
            gwa1.h = new ArrayList(2);
        }
        gwa1.h.add(gwk1);
        return this;
    }

    public final gwb a(Object obj)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException("Tag invalid.");
        }
        if (k != null)
        {
            throw new IllegalStateException("Tag already set.");
        } else
        {
            k = obj;
            return this;
        }
    }

    public final void a(ImageView imageview, gve gve1)
    {
        long l;
        l = System.nanoTime();
        gwm.a();
        if (imageview == null)
        {
            throw new IllegalArgumentException("Target must not be null.");
        }
        if (a.a()) goto _L2; else goto _L1
_L1:
        e.a(imageview);
        if (f)
        {
            gvw.a(imageview, f());
        }
_L4:
        return;
_L2:
        gvz gvz1;
        String s;
        gvz1 = a(l);
        s = gwm.a(gvz1);
        if (!MemoryPolicy.a(0))
        {
            break; /* Loop/switch isn't completed */
        }
        android.graphics.Bitmap bitmap = e.b(s);
        if (bitmap == null)
        {
            break; /* Loop/switch isn't completed */
        }
        e.a(imageview);
        gvw.a(imageview, e.d, bitmap, com.squareup.picasso.Picasso.LoadedFrom.a, b, e.g);
        if (e.h)
        {
            gwm.a("Main", "completed", gvz1.b(), (new StringBuilder("from ")).append(com.squareup.picasso.Picasso.LoadedFrom.a).toString());
        }
        if (gve1 != null)
        {
            gve1.a();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (f)
        {
            gvw.a(imageview, f());
        }
        imageview = new gvp(e, imageview, gvz1, h, j, s, k, gve1, b);
        e.a(imageview);
        return;
    }

    public final void a(gwi gwi1)
    {
        Drawable drawable = null;
        gvz gvz1 = null;
        long l = System.nanoTime();
        gwm.a();
        if (gwi1 == null)
        {
            throw new IllegalArgumentException("Target must not be null.");
        }
        if (!a.a())
        {
            e.a(gwi1);
            drawable = gvz1;
            if (f)
            {
                drawable = f();
            }
            gwi1.b(drawable);
            return;
        }
        gvz1 = a(l);
        String s = gwm.a(gvz1);
        if (MemoryPolicy.a(0))
        {
            android.graphics.Bitmap bitmap = e.b(s);
            if (bitmap != null)
            {
                e.a(gwi1);
                gwi1.a(bitmap, com.squareup.picasso.Picasso.LoadedFrom.a);
                return;
            }
        }
        if (f)
        {
            drawable = f();
        }
        gwi1.b(drawable);
        gwi1 = new gwj(e, gwi1, gvz1, j, s, k, h);
        e.a(gwi1);
    }

    public final gwb b()
    {
        gwa gwa1 = a;
        if (gwa1.f)
        {
            throw new IllegalStateException("Center crop can not be used after calling centerInside");
        } else
        {
            gwa1.e = true;
            return this;
        }
    }

    public final gwb b(int l)
    {
        if (l == 0)
        {
            throw new IllegalArgumentException("Error image resource invalid.");
        }
        if (j != null)
        {
            throw new IllegalStateException("Error image already set.");
        } else
        {
            h = l;
            return this;
        }
    }

    public final gwb b(int l, int i1)
    {
        gwa gwa1 = a;
        if (l < 0)
        {
            throw new IllegalArgumentException("Width must be positive number or 0.");
        }
        if (i1 < 0)
        {
            throw new IllegalArgumentException("Height must be positive number or 0.");
        }
        if (i1 == 0 && l == 0)
        {
            throw new IllegalArgumentException("At least one dimension has to be positive number.");
        } else
        {
            gwa1.c = l;
            gwa1.d = i1;
            return this;
        }
    }

    public final gwb b(Drawable drawable)
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
            j = drawable;
            return this;
        }
    }

    public final gwb c()
    {
        gwa gwa1 = a;
        if (gwa1.e)
        {
            throw new IllegalStateException("Center inside can not be used after calling centerCrop");
        } else
        {
            gwa1.f = true;
            return this;
        }
    }

    public final gwb d()
    {
        gwa gwa1 = a;
        if (gwa1.d == 0 && gwa1.c == 0)
        {
            throw new IllegalStateException("onlyScaleDown can not be applied without resize");
        } else
        {
            gwa1.g = true;
            return this;
        }
    }

    public final void e()
    {
        Object obj;
        String s;
label0:
        {
            long l = System.nanoTime();
            if (a.a())
            {
                boolean flag;
                if (a.j != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    a.a(com.squareup.picasso.Picasso.Priority.a);
                }
                obj = a(l);
                s = gwm.a(((gvz) (obj)), new StringBuilder());
                if (e.b(s) == null)
                {
                    break label0;
                }
                if (e.h)
                {
                    gwm.a("Main", "completed", ((gvz) (obj)).b(), (new StringBuilder("from ")).append(com.squareup.picasso.Picasso.LoadedFrom.a).toString());
                }
            }
            return;
        }
        obj = new gvn(e, ((gvz) (obj)), k, s);
        e.b(((guz) (obj)));
    }

}
