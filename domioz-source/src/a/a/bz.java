// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import com.appboy.a;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

// Referenced classes of package a.a:
//            da, jm, hn, ho, 
//            hq, jl, hl, ie, 
//            ih, jo, hf, js, 
//            hs, hy, ii, ja, 
//            ht, hr

public final class bz
    implements Runnable
{

    final String a;
    final ImageView b;
    final boolean c;
    final a d;

    public bz(a a1, String s, ImageView imageview, boolean flag)
    {
        d = a1;
        a = s;
        b = imageview;
        c = flag;
        super();
    }

    public final void run()
    {
        boolean flag = false;
        Object obj1 = com.appboy.a.b(Uri.parse(a)).toString();
        Object obj2 = com.appboy.a.c(d);
        Object obj = b;
        da da1 = new da(this);
        jm jm1 = new jm(((ImageView) (obj)));
        if (((hn) (obj2)).b == null)
        {
            throw new IllegalStateException("ImageLoader must be init with configuration before using");
        }
        Object obj3 = ((hn) (obj2)).b.t;
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            ((hn) (obj2)).c.b(jm1);
            jm1.d();
            if (((hl) (obj3)).e != null || ((hl) (obj3)).b != 0)
            {
                flag = true;
            }
            if (flag)
            {
                obj = ((hn) (obj2)).b.a;
                if (((hl) (obj3)).b != 0)
                {
                    obj = ((Resources) (obj)).getDrawable(((hl) (obj3)).b);
                } else
                {
                    obj = ((hl) (obj3)).e;
                }
                jm1.a(((android.graphics.drawable.Drawable) (obj)));
            } else
            {
                jm1.a(null);
            }
            da1.a(((String) (obj1)), jm1.d(), null);
            return;
        }
        obj = ((hn) (obj2)).b;
        Object obj4 = ((ho) (obj)).a.getDisplayMetrics();
        int j = ((ho) (obj)).b;
        int i = j;
        if (j <= 0)
        {
            i = ((DisplayMetrics) (obj4)).widthPixels;
        }
        int k = ((ho) (obj)).c;
        j = k;
        if (k <= 0)
        {
            j = ((DisplayMetrics) (obj4)).heightPixels;
        }
        obj4 = a.a.jo.a(jm1, new ih(i, j));
        String s = (new StringBuilder(((String) (obj1)))).append("_").append(((ih) (obj4)).a).append("x").append(((ih) (obj4)).b).toString();
        ((hn) (obj2)).c.e.put(Integer.valueOf(jm1.f()), s);
        jm1.d();
        obj = (Bitmap)((hn) (obj2)).b.p.a(s);
        if (obj != null && !((Bitmap) (obj)).isRecycled())
        {
            if (((hn) (obj2)).b.u)
            {
                a.a.js.a("Load image from memory cache [%s]", new Object[] {
                    s
                });
            }
            if (((hl) (obj3)).a())
            {
                obj1 = new hs(((String) (obj1)), jm1, ((ih) (obj4)), s, ((hl) (obj3)), da1, ((hn) (obj2)).c.a(((String) (obj1))));
                obj = new hy(((hn) (obj2)).c, ((Bitmap) (obj)), ((hs) (obj1)), ((hl) (obj3)).b());
                if (((hl) (obj3)).s)
                {
                    ((hy) (obj)).run();
                    return;
                } else
                {
                    obj1 = ((hn) (obj2)).c;
                    ((hq) (obj1)).a();
                    ((hq) (obj1)).c.execute(((Runnable) (obj)));
                    return;
                }
            } else
            {
                obj2 = ((hl) (obj3)).q;
                obj3 = ii.c;
                ((ja) (obj2)).a(((Bitmap) (obj)), jm1);
                da1.a(((String) (obj1)), jm1.d(), ((Bitmap) (obj)));
                return;
            }
        }
        if (((hl) (obj3)).d != null || ((hl) (obj3)).a != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i)
        {
            obj = ((hn) (obj2)).b.a;
            if (((hl) (obj3)).a != 0)
            {
                obj = ((Resources) (obj)).getDrawable(((hl) (obj3)).a);
            } else
            {
                obj = ((hl) (obj3)).d;
            }
            jm1.a(((android.graphics.drawable.Drawable) (obj)));
        } else
        if (((hl) (obj3)).g)
        {
            jm1.a(null);
        }
        obj = new hs(((String) (obj1)), jm1, ((ih) (obj4)), s, ((hl) (obj3)), da1, ((hn) (obj2)).c.a(((String) (obj1))));
        obj = new ht(((hn) (obj2)).c, ((hs) (obj)), ((hl) (obj3)).b());
        if (((hl) (obj3)).s)
        {
            ((ht) (obj)).run();
            return;
        } else
        {
            hq hq1 = ((hn) (obj2)).c;
            hq1.d.execute(new hr(hq1, ((ht) (obj))));
            return;
        }
    }
}
