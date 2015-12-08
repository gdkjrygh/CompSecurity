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
//            e, kn, ip, iq, 
//            is, km, in, jf, 
//            ji, kp, ih, kt, 
//            iu, ja, jj, kc, 
//            iv, it

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
        kn kn1 = new kn(((ImageView) (obj)));
        if (((ip) (obj2)).b == null)
        {
            throw new IllegalStateException("ImageLoader must be init with configuration before using");
        }
        Object obj3 = ((ip) (obj2)).b.t;
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            ((ip) (obj2)).c.b(kn1);
            kn1.d();
            if (((in) (obj3)).e != null || ((in) (obj3)).b != 0)
            {
                flag = true;
            }
            if (flag)
            {
                obj = ((ip) (obj2)).b.a;
                if (((in) (obj3)).b != 0)
                {
                    obj = ((Resources) (obj)).getDrawable(((in) (obj3)).b);
                } else
                {
                    obj = ((in) (obj3)).e;
                }
                kn1.a(((android.graphics.drawable.Drawable) (obj)));
            } else
            {
                kn1.a(null);
            }
            e1.a(((String) (obj1)), kn1.d(), null);
            return;
        }
        obj = ((ip) (obj2)).b;
        Object obj4 = ((iq) (obj)).a.getDisplayMetrics();
        int j = ((iq) (obj)).b;
        int i = j;
        if (j <= 0)
        {
            i = ((DisplayMetrics) (obj4)).widthPixels;
        }
        int k = ((iq) (obj)).c;
        j = k;
        if (k <= 0)
        {
            j = ((DisplayMetrics) (obj4)).heightPixels;
        }
        obj4 = kp.a(kn1, new ji(i, j));
        String s = (new StringBuilder(((String) (obj1)))).append("_").append(((ji) (obj4)).a).append("x").append(((ji) (obj4)).b).toString();
        ((ip) (obj2)).c.e.put(Integer.valueOf(kn1.f()), s);
        kn1.d();
        obj = (Bitmap)((ip) (obj2)).b.p.a(s);
        if (obj != null && !((Bitmap) (obj)).isRecycled())
        {
            if (((ip) (obj2)).b.u)
            {
                kt.a("Load image from memory cache [%s]", new Object[] {
                    s
                });
            }
            if (((in) (obj3)).a())
            {
                obj1 = new iu(((String) (obj1)), kn1, ((ji) (obj4)), s, ((in) (obj3)), e1, ((ip) (obj2)).c.a(((String) (obj1))));
                obj = new ja(((ip) (obj2)).c, ((Bitmap) (obj)), ((iu) (obj1)), ((in) (obj3)).b());
                if (((in) (obj3)).s)
                {
                    ((ja) (obj)).run();
                    return;
                } else
                {
                    obj1 = ((ip) (obj2)).c;
                    ((is) (obj1)).a();
                    ((is) (obj1)).c.execute(((Runnable) (obj)));
                    return;
                }
            } else
            {
                obj2 = ((in) (obj3)).q;
                obj3 = jj.c;
                ((kc) (obj2)).a(((Bitmap) (obj)), kn1);
                e1.a(((String) (obj1)), kn1.d(), ((Bitmap) (obj)));
                return;
            }
        }
        if (((in) (obj3)).d != null || ((in) (obj3)).a != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i)
        {
            obj = ((ip) (obj2)).b.a;
            if (((in) (obj3)).a != 0)
            {
                obj = ((Resources) (obj)).getDrawable(((in) (obj3)).a);
            } else
            {
                obj = ((in) (obj3)).d;
            }
            kn1.a(((android.graphics.drawable.Drawable) (obj)));
        } else
        if (((in) (obj3)).g)
        {
            kn1.a(null);
        }
        obj = new iu(((String) (obj1)), kn1, ((ji) (obj4)), s, ((in) (obj3)), e1, ((ip) (obj2)).c.a(((String) (obj1))));
        obj = new iv(((ip) (obj2)).c, ((iu) (obj)), ((in) (obj3)).b());
        if (((in) (obj3)).s)
        {
            ((iv) (obj)).run();
            return;
        } else
        {
            is is1 = ((ip) (obj2)).c;
            is1.d.execute(new it(is1, ((iv) (obj))));
            return;
        }
    }
}
