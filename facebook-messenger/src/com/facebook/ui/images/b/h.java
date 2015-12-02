// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.b;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.common.executors.n;
import com.facebook.ui.images.cache.a;
import com.google.common.d.a.ab;
import com.google.common.d.a.i;
import com.google.common.d.a.s;
import com.google.common.d.a.w;

// Referenced classes of package com.facebook.ui.images.b:
//            m, k, p, q, 
//            l, r, v, t, 
//            u, e, i

public class h
{

    private final Class a = com/facebook/ui/images/b/h;
    private final a b;
    private final n c;
    private final l d;
    private final e e;

    public h(a a1, n n1, l l1, e e1)
    {
        b = a1;
        c = n1;
        d = l1;
        e = e1;
    }

    private int a(Uri uri, int j)
    {
        return Math.abs(uri.hashCode() % j);
    }

    static l a(h h1)
    {
        return h1.d;
    }

    static s a(h h1, m m1)
    {
        return h1.c(m1);
    }

    private s c(m m1)
    {
        com.facebook.ui.images.cache.d d1 = m1.i();
        s s = c.a(d1);
        Object obj = s;
        if (s == null)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (m1.b() != null)
            {
                obj = m1.j();
                flag = flag1;
                if (b.b(((com.facebook.ui.media.cache.l) (obj))))
                {
                    flag = true;
                }
            }
            k k1 = new k(this, m1);
            if (flag)
            {
                obj = "fetch-image-task-processing";
            } else
            {
                obj = m1.a();
                if (((Uri) (obj)).getAuthority().startsWith("api."))
                {
                    int j = a(((Uri) (obj)), 3);
                    obj = (new StringBuilder()).append("fetch-image-api-").append(j).toString();
                } else
                {
                    int i1 = a(((Uri) (obj)), 3);
                    obj = (new StringBuilder()).append("fetch-image-other-").append(i1).toString();
                }
            }
            m1 = m1.a().toString();
            obj = c.a(obj, d1, k1, m1);
        }
        return ((s) (obj));
    }

    public r a(m m1)
    {
        m1 = com.facebook.ui.images.b.p.a(m1).c();
        return d.a(m1);
    }

    public s b(m m1)
    {
        Object obj = m1.i();
        if (obj != null)
        {
            if (b.g(((com.facebook.ui.media.cache.l) (obj))))
            {
                return i.a(com.facebook.ui.images.b.r.a(((com.facebook.ui.images.cache.d) (obj))).a(v.ERROR).a(u.PREV_FAILURE_RETRY_BLOCKED).a());
            }
            if (!m1.e())
            {
                Bitmap bitmap = (Bitmap)b.a(((com.facebook.ui.media.cache.l) (obj)));
                if (bitmap != null)
                {
                    return i.a(com.facebook.ui.images.b.r.a(((com.facebook.ui.images.cache.d) (obj))).a(bitmap).a(v.MEMORY_CACHE).a());
                }
            }
        }
        obj = ab.a();
        i.a(e.a(m1), new com.facebook.ui.images.b.i(this, m1, ((ab) (obj))), w.a());
        return ((s) (obj));
    }
}
