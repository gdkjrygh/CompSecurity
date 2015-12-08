// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.f.a;

import android.content.Context;
import android.net.http.AndroidHttpClient;
import com.android.volley.p;
import com.android.volley.toolbox.e;
import com.android.volley.toolbox.h;
import com.kik.cache.SimpleLruBitmapCache;
import com.kik.cache.ad;
import com.kik.cache.x;
import java.io.File;
import kik.a.e.q;
import kik.android.net.c;
import kik.android.util.d;

// Referenced classes of package kik.android.f.a:
//            b, c, d, e

public final class a
{

    private final p a;
    private final com.android.volley.toolbox.d b;
    private final SimpleLruBitmapCache c;
    private final ad d;

    public a(Context context, q q1, String s, SimpleLruBitmapCache simplelrubitmapcache)
    {
        q1 = q1.a(s);
        kik.android.util.d.a(new File(context.getCacheDir(), s), q1);
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            context = new h();
        } else
        {
            context = new e(AndroidHttpClient.newInstance("AN"));
        }
        context = new c(context);
        b = new com.android.volley.toolbox.d(q1, 0x1400000);
        a = new p(b, context, 2);
        c = simplelrubitmapcache;
        a.a();
        d = new ad(a, c, null);
        d.b();
    }

    public final boolean a(String s)
    {
        s = new x(s, new b(this), new kik.android.f.a.c(this));
        String s1 = s.e();
        boolean flag = false;
        if (b.c(s1))
        {
            flag = true;
        }
        if (!flag)
        {
            a.a(s);
        }
        return flag;
    }

    public final com.kik.g.p b(String s)
    {
        com.kik.g.p p1 = new com.kik.g.p();
        x x1 = new x(s, new kik.android.f.a.d(this, p1), new kik.android.f.a.e(this, p1));
        s = null;
        Object obj = x1.e();
        boolean flag1 = false;
        boolean flag = flag1;
        if (b.c(((String) (obj))))
        {
            obj = b.a(((String) (obj)));
            if (obj != null)
            {
                s = ((com.android.volley.b.a) (obj)).a;
            }
            flag = flag1;
            if (s != null)
            {
                flag = true;
                p1.a(s);
            }
        }
        if (!flag)
        {
            a.a(x1);
        }
        return p1;
    }
}
