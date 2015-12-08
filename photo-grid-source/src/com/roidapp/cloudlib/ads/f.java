// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.ads;

import android.content.Context;
import android.text.TextUtils;
import com.cmcm.a.a.a;
import com.cmcm.a.a.d;
import com.roidapp.baselib.c.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.roidapp.cloudlib.ads:
//            h

public final class f
{

    private static f a;
    private Map b;
    private Map c;
    private Map d;

    private f()
    {
        c = new HashMap();
        b = new TreeMap();
        d = new TreeMap();
    }

    public static f a()
    {
        if (a == null)
        {
            a = new f();
        }
        return a;
    }

    public final a a(int i)
    {
        Object obj = (com.cmcm.adsdk.f)b.get(Integer.valueOf(i));
        if (obj == null)
        {
            return null;
        }
        obj = ((com.cmcm.adsdk.f) (obj)).b();
        if (obj == null || ((List) (obj)).isEmpty())
        {
            return null;
        }
        Object obj1 = new ArrayList(((List) (obj)).size());
        Object obj2 = new HashSet();
        Iterator iterator = ((List) (obj)).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            a a1 = (a)iterator.next();
            if (a1 != null && "fb".equalsIgnoreCase(a1.c()))
            {
                ((List) (obj1)).add(a1);
                ((HashSet) (obj2)).add(a1.d());
            }
        } while (true);
        if (((HashSet) (obj2)).size() >= 2)
        {
            obj = obj1;
        }
        int l = (int)(Math.random() * (double)((List) (obj)).size());
        obj1 = (a)((List) (obj)).get(l);
        if (obj1 == null)
        {
            return null;
        }
        obj2 = (String)c.get(Integer.valueOf(i));
        if (!TextUtils.equals(((a) (obj1)).d(), ((CharSequence) (obj2))))
        {
            c.put(Integer.valueOf(i), ((a) (obj1)).d());
            return ((a) (obj1));
        }
        if (((List) (obj)).size() > 1)
        {
            int k = (int)(Math.random() * (double)(((List) (obj)).size() - 1));
            int j = k;
            if (k >= l)
            {
                j = k + 1;
            }
            obj = (a)((List) (obj)).get(j);
            if (obj == null)
            {
                return null;
            } else
            {
                c.put(Integer.valueOf(i), ((a) (obj)).d());
                return ((a) (obj));
            }
        } else
        {
            c.put(Integer.valueOf(i), ((a) (obj1)).d());
            return ((a) (obj1));
        }
    }

    public final com.cmcm.adsdk.f a(Context context, int i)
    {
        com.cmcm.adsdk.f f2 = (com.cmcm.adsdk.f)b.get(Integer.valueOf(i));
        com.cmcm.adsdk.f f1 = f2;
        if (f2 == null)
        {
            f1 = new com.cmcm.adsdk.f(new w(context), String.valueOf(i));
            b.put(Integer.valueOf(i), f1);
        }
        return f1;
    }

    public final void a(int i, d d1)
    {
        h h1;
        if (d1 != null)
        {
            if ((h1 = (h)d.get(Integer.valueOf(i))) != null)
            {
                h1.b(d1);
                return;
            }
        }
    }

    public final void a(Context context, int i, d d1)
    {
        com.cmcm.adsdk.f f1 = a(context, i);
        h h1 = (h)d.get(Integer.valueOf(i));
        context = h1;
        if (h1 == null)
        {
            context = new h();
            d.put(Integer.valueOf(i), context);
        }
        context.a(d1);
        f1.a(context);
        f1.a();
    }

    public final void b()
    {
        h h1 = (h)d.get(Integer.valueOf(40008));
        if (h1 != null)
        {
            h1.b();
        }
    }
}
