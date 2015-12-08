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
import com.appboy.a;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

// Referenced classes of package bo.app:
//            e, ko, iq, ir, 
//            it, kn, io, jg, 
//            jj, kq, ii, ku, 
//            iv, jb, jk, kd, 
//            iw, iu

public final class d
    implements Runnable
{

    final String a;
    final ImageView b;
    final boolean c;
    final a d;

    public d(a a1, String s, ImageView imageview, boolean flag)
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
        e e1 = new e(this);
        ko ko1 = new ko(((ImageView) (obj)));
        if (((iq) (obj2)).b == null)
        {
            throw new IllegalStateException("ImageLoader must be init with configuration before using");
        }
        Object obj3 = ((iq) (obj2)).b.t;
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            ((iq) (obj2)).c.b(ko1);
            ko1.d();
            if (((io) (obj3)).e != null || ((io) (obj3)).b != 0)
            {
                flag = true;
            }
            if (flag)
            {
                obj = ((iq) (obj2)).b.a;
                if (((io) (obj3)).b != 0)
                {
                    obj = ((Resources) (obj)).getDrawable(((io) (obj3)).b);
                } else
                {
                    obj = ((io) (obj3)).e;
                }
                ko1.a(((android.graphics.drawable.Drawable) (obj)));
            } else
            {
                ko1.a(null);
            }
            e1.a(((String) (obj1)), ko1.d(), null);
            return;
        }
        obj = ((iq) (obj2)).b;
        Object obj4 = ((ir) (obj)).a.getDisplayMetrics();
        int j = ((ir) (obj)).b;
        int i = j;
        if (j <= 0)
        {
            i = ((DisplayMetrics) (obj4)).widthPixels;
        }
        int k = ((ir) (obj)).c;
        j = k;
        if (k <= 0)
        {
            j = ((DisplayMetrics) (obj4)).heightPixels;
        }
        obj4 = bo.app.kq.a(ko1, new jj(i, j));
        String s = (new StringBuilder(((String) (obj1)))).append("_").append(((jj) (obj4)).a).append("x").append(((jj) (obj4)).b).toString();
        ((iq) (obj2)).c.e.put(Integer.valueOf(ko1.f()), s);
        ko1.d();
        obj = (Bitmap)((iq) (obj2)).b.p.a(s);
        if (obj != null && !((Bitmap) (obj)).isRecycled())
        {
            if (((iq) (obj2)).b.u)
            {
                bo.app.ku.a("Load image from memory cache [%s]", new Object[] {
                    s
                });
            }
            if (((io) (obj3)).a())
            {
                obj1 = new iv(((String) (obj1)), ko1, ((jj) (obj4)), s, ((io) (obj3)), e1, ((iq) (obj2)).c.a(((String) (obj1))));
                obj = new jb(((iq) (obj2)).c, ((Bitmap) (obj)), ((iv) (obj1)), ((io) (obj3)).b());
                if (((io) (obj3)).s)
                {
                    ((jb) (obj)).run();
                    return;
                } else
                {
                    obj1 = ((iq) (obj2)).c;
                    ((it) (obj1)).a();
                    ((it) (obj1)).c.execute(((Runnable) (obj)));
                    return;
                }
            } else
            {
                obj2 = ((io) (obj3)).q;
                obj3 = jk.c;
                ((kd) (obj2)).a(((Bitmap) (obj)), ko1);
                e1.a(((String) (obj1)), ko1.d(), ((Bitmap) (obj)));
                return;
            }
        }
        if (((io) (obj3)).d != null || ((io) (obj3)).a != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i)
        {
            obj = ((iq) (obj2)).b.a;
            if (((io) (obj3)).a != 0)
            {
                obj = ((Resources) (obj)).getDrawable(((io) (obj3)).a);
            } else
            {
                obj = ((io) (obj3)).d;
            }
            ko1.a(((android.graphics.drawable.Drawable) (obj)));
        } else
        if (((io) (obj3)).g)
        {
            ko1.a(null);
        }
        obj = new iv(((String) (obj1)), ko1, ((jj) (obj4)), s, ((io) (obj3)), e1, ((iq) (obj2)).c.a(((String) (obj1))));
        obj = new iw(((iq) (obj2)).c, ((iv) (obj)), ((io) (obj3)).b());
        if (((io) (obj3)).s)
        {
            ((iw) (obj)).run();
            return;
        } else
        {
            it it1 = ((iq) (obj2)).c;
            it1.d.execute(new iu(it1, ((iw) (obj))));
            return;
        }
    }
}
