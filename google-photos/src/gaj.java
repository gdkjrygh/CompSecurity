// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.util.LruCache;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class gaj
    implements emr, omb, opv
{

    public final LruCache a = new LruCache(3);
    public gai b;
    private final Map c = new HashMap();
    private final emq d;
    private final ekk e;
    private noz f;

    public gaj(ar ar, opd opd1, int i, ekk ekk)
    {
        d = new emq(ar, opd1, this, i);
        e = ekk;
        opd1.a(this);
    }

    public final gai a(ehr ehr1)
    {
        if (b != null && b.a.equals(ehr1))
        {
            return b;
        }
        boolean flag;
        if (a.get(ehr1) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            a.put(ehr1, new gai(ehr1));
        }
        return (gai)a.get(ehr1);
    }

    public final gaj a(olm olm1)
    {
        olm1.a(gaj, this);
        return this;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        f = noz.a(context, 3, "MediaListModelProvider", new String[0]);
    }

    public final void a(ehr ehr1, gak gak1)
    {
        Set set = (Set)c.get(ehr1);
        Object obj = set;
        if (set == null)
        {
            obj = new HashSet();
            c.put(ehr1, obj);
        }
        ((Set) (obj)).add(gak1);
        boolean flag1;
        if (b == null)
        {
            obj = null;
        } else
        {
            obj = b.a;
        }
        if (obj != null && !((ehr) (obj)).equals(ehr1))
        {
            Set set1 = (Set)c.get(obj);
            boolean flag;
            if (set1 != null && set1.size() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            p.b(flag1, "Cannot register monitor on a collection when another collection is active.");
            if (b == null || !b.a.equals(obj))
            {
                if (f.a())
                {
                    noy.a("collection", obj);
                }
            } else
            {
                gai gai1 = b;
                if (gai1 != null)
                {
                    if (f.a())
                    {
                        noy.a("collection", gai1.a);
                    }
                    a.put(gai1.a, gai1);
                }
                b = null;
            }
        }
        if (b == null)
        {
            obj = (gai)a.remove(ehr1);
            if (obj != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (!flag1)
            {
                obj = new gai(ehr1);
            }
            b = ((gai) (obj));
            if (f.a())
            {
                noy.a("collection", b.a);
                noy.a("from cache", Boolean.valueOf(flag1));
            }
            d.a(ehr1.a, ehr1.b, e);
        }
        if (b.c)
        {
            gak1.a(b);
            gak1.s();
        }
    }

    public void a(gai gai1)
    {
        Set set = (Set)c.get(gai1.a);
        if (set != null)
        {
            for (Iterator iterator = set.iterator(); iterator.hasNext(); ((gak)iterator.next()).a(gai1)) { }
            gai1 = set.iterator();
            while (gai1.hasNext()) 
            {
                ((gak)gai1.next()).s();
            }
        }
    }

    public final void b(ehr ehr1, gak gak1)
    {
        ehr1 = (Set)c.get(ehr1);
        if (ehr1 != null)
        {
            ehr1.remove(gak1);
        }
    }

    public final void b(elb elb1)
    {
        gai gai1 = b;
        elb1 = (Collection)elb1.a();
        gai1.c = true;
        gai1.b.clear();
        gai1.b.addAll(elb1);
        a(b);
_L1:
        return;
        elb1;
        Object obj = b;
        obj = (Set)c.get(((gai) (obj)).a);
        if (obj != null)
        {
            obj = ((Set) (obj)).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                ((gak)((Iterator) (obj)).next()).a(elb1);
            }
        }
          goto _L1
    }
}
