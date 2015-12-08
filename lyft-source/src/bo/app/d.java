// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import com.appboy.Appboy;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

// Referenced classes of package bo.app:
//            e, kt, iv, iw, 
//            iy, ks, it, jl, 
//            jo, kv, in, kz, 
//            ja, jg, jp, ki, 
//            jb, iz

public final class d
    implements Runnable
{

    final String a;
    final ImageView b;
    final boolean c;
    final Appboy d;

    public d(Appboy appboy, String s, ImageView imageview, boolean flag)
    {
        d = appboy;
        a = s;
        b = imageview;
        c = flag;
        super();
    }

    public final void run()
    {
        boolean flag = false;
        Object obj1 = Appboy.getAppboyResourceEndpoint(Uri.parse(a)).toString();
        Object obj2 = Appboy.c(d);
        Object obj = b;
        e e1 = new e(this);
        kt kt1 = new kt(((ImageView) (obj)));
        if (((iv) (obj2)).b == null)
        {
            throw new IllegalStateException("ImageLoader must be init with configuration before using");
        }
        Object obj3 = ((iv) (obj2)).b.t;
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            ((iv) (obj2)).c.b(kt1);
            kt1.d();
            if (((it) (obj3)).e != null || ((it) (obj3)).b != 0)
            {
                flag = true;
            }
            if (flag)
            {
                obj = ((iv) (obj2)).b.a;
                if (((it) (obj3)).b != 0)
                {
                    obj = ((Resources) (obj)).getDrawable(((it) (obj3)).b);
                } else
                {
                    obj = ((it) (obj3)).e;
                }
                kt1.a(((android.graphics.drawable.Drawable) (obj)));
            } else
            {
                kt1.a(null);
            }
            e1.a(((String) (obj1)), kt1.d(), null);
            return;
        }
        obj = ((iv) (obj2)).b;
        Object obj4 = ((iw) (obj)).a.getDisplayMetrics();
        int j = ((iw) (obj)).b;
        int i = j;
        if (j <= 0)
        {
            i = ((DisplayMetrics) (obj4)).widthPixels;
        }
        int k = ((iw) (obj)).c;
        j = k;
        if (k <= 0)
        {
            j = ((DisplayMetrics) (obj4)).heightPixels;
        }
        obj4 = kv.a(kt1, new jo(i, j));
        String s = (new StringBuilder(((String) (obj1)))).append("_").append(((jo) (obj4)).a).append("x").append(((jo) (obj4)).b).toString();
        ((iv) (obj2)).c.e.put(Integer.valueOf(kt1.f()), s);
        kt1.d();
        obj = (Bitmap)((iv) (obj2)).b.p.a(s);
        if (obj != null && !((Bitmap) (obj)).isRecycled())
        {
            if (((iv) (obj2)).b.u)
            {
                kz.a("Load image from memory cache [%s]", new Object[] {
                    s
                });
            }
            if (((it) (obj3)).a())
            {
                obj1 = new ja(((String) (obj1)), kt1, ((jo) (obj4)), s, ((it) (obj3)), e1, ((iv) (obj2)).c.a(((String) (obj1))));
                obj = new jg(((iv) (obj2)).c, ((Bitmap) (obj)), ((ja) (obj1)), ((it) (obj3)).b());
                if (((it) (obj3)).s)
                {
                    ((jg) (obj)).run();
                    return;
                } else
                {
                    obj1 = ((iv) (obj2)).c;
                    ((iy) (obj1)).a();
                    ((iy) (obj1)).c.execute(((Runnable) (obj)));
                    return;
                }
            } else
            {
                obj2 = ((it) (obj3)).q;
                obj3 = jp.c;
                ((ki) (obj2)).a(((Bitmap) (obj)), kt1);
                e1.a(((String) (obj1)), kt1.d(), ((Bitmap) (obj)));
                return;
            }
        }
        if (((it) (obj3)).d != null || ((it) (obj3)).a != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i)
        {
            obj = ((iv) (obj2)).b.a;
            if (((it) (obj3)).a != 0)
            {
                obj = ((Resources) (obj)).getDrawable(((it) (obj3)).a);
            } else
            {
                obj = ((it) (obj3)).d;
            }
            kt1.a(((android.graphics.drawable.Drawable) (obj)));
        } else
        if (((it) (obj3)).g)
        {
            kt1.a(null);
        }
        obj = new ja(((String) (obj1)), kt1, ((jo) (obj4)), s, ((it) (obj3)), e1, ((iv) (obj2)).c.a(((String) (obj1))));
        obj = new jb(((iv) (obj2)).c, ((ja) (obj)), ((it) (obj3)).b());
        if (((it) (obj3)).s)
        {
            ((jb) (obj)).run();
            return;
        } else
        {
            iy iy1 = ((iv) (obj2)).c;
            iy1.d.execute(new iz(iy1, ((jb) (obj))));
            return;
        }
    }
}
