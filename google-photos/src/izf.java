// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class izf
    implements iyi
{

    private final mmv a;
    private final hpb b;
    private final eto c;
    private final fps d;
    private final noz e;
    private final noz f;
    private final Context g;

    public izf(Context context)
    {
        g = context;
        c = (eto)olm.a(context, eto);
        d = (fps)olm.a(context, fps);
        a = (mmv)olm.a(context, mmv);
        b = (hpb)olm.a(context, hpb);
        e = noz.a(context, 3, "TrashDelete", new String[] {
            "perf"
        });
        f = noz.a(context, "TrashDelete", new String[0]);
    }

    static Context a(izf izf1)
    {
        return izf1.g;
    }

    private boolean a(int i, List list)
    {
        hcm hcm1 = new hcm(list);
        d.a(i, hcm1);
        for (Iterator iterator = a.a(new String[] {
    "logged_in"
}).iterator(); iterator.hasNext(); c.a(i, Collections.emptyList(), list, true))
        {
            i = ((Integer)iterator.next()).intValue();
        }

        return true;
    }

    public final elb a(int i, Collection collection, gaw gaw1)
    {
        long l = noy.a();
        Object obj;
        boolean flag;
        boolean flag2;
        if (!collection.isEmpty())
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        p.a(flag2, "cannot delete 0 medias");
        obj = collection.iterator();
        p.a(obj);
        p.a(true);
        obj = new iyp(((Iterator) (obj)), 50);
        flag = false;
        while (((Iterator) (obj)).hasNext()) 
        {
            Collection collection1 = (Collection)((Iterator) (obj)).next();
            Object obj2 = b.a(collection1);
            boolean flag1;
            if (((List) (obj2)).isEmpty())
            {
                flag1 = false;
            } else
            {
                ArrayList arraylist1 = new ArrayList();
                HashSet hashset = new HashSet();
                Object obj1 = new ArrayList();
                ArrayList arraylist = new ArrayList();
                obj2 = ((List) (obj2)).iterator();
                do
                {
                    if (!((Iterator) (obj2)).hasNext())
                    {
                        break;
                    }
                    hpk hpk1 = (hpk)((Iterator) (obj2)).next();
                    if (hpk1.e())
                    {
                        arraylist1.add(hpk1.a);
                    }
                    if (hpk1.a())
                    {
                        arraylist.add(hpk1.c);
                        if (hpk1.f())
                        {
                            hashset.add(hpk1.e);
                        } else
                        {
                            ((List) (obj1)).add(hpk1.c);
                        }
                    }
                } while (true);
                if (gaw1.a(gav.a) && !arraylist1.isEmpty())
                {
                    a(i, ((List) (arraylist1)));
                }
                if (gaw1.a(gav.b) && !arraylist.isEmpty())
                {
                    ArrayList arraylist2 = new ArrayList(hashset);
                    byte abyte0[][] = new byte[arraylist.size()][];
                    izg izg1 = new izg(this, arraylist, i, abyte0);
                    b.a(500, arraylist.size(), izg1);
                    obj1 = new hcu(iye.b, abyte0, ((Collection) (obj1)), arraylist2);
                    d.a(i, ((fpr) (obj1)));
                    c.a(i, arraylist, Collections.emptyList(), true);
                }
                flag1 = true;
            }
            flag = flag1 | flag;
        }
        if (e.a())
        {
            noy.a(i);
            noy.a("media", Integer.valueOf(collection.size()));
            noy.a("sourcesToDelete", gaw1);
            noy.a("duration", l);
        }
        if (flag)
        {
            return b.b(collection);
        } else
        {
            return b.a(new eke("Failed to delete photos from trash"));
        }
    }
}
