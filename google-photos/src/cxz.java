// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class cxz
    implements cxp
{

    private static final String a = cxz.getSimpleName();
    private final cwm b;
    private final cxd c;
    private final Set d;
    private final float e = 0.5F;

    public cxz(cwm cwm1, cxd cxd1, float f, Set set)
    {
        b = (cwm)b.a(cwm1, "qualityModel", null);
        c = (cxd)b.a(cxd1, "similarityMetric", null);
        d = set;
    }

    private cya a(Set set, cya cya1, int i)
    {
        Object obj = null;
        Iterator iterator = set.iterator();
        set = null;
        while (iterator.hasNext()) 
        {
            Object obj1 = (cya)iterator.next();
            float f1 = ((cya) (obj1)).b;
            float f;
            if (i > 0)
            {
                cxd cxd1 = c;
                if (cxd1 == null || cya1 == null)
                {
                    f = 0.0F;
                } else
                {
                    obj1.c = cxd1.a(((cya) (obj1)).a.c, ((cya) (obj1)).a.b, cya1.a.c, cya1.a.b) + ((cya) (obj1)).c;
                    f = ((cya) (obj1)).c;
                }
                f /= i;
            } else
            {
                f = 0.0F;
            }
            f = f * e + f1;
            if (set == null || f > set.floatValue())
            {
                obj = Float.valueOf(f);
                set = ((Set) (obj1));
            } else
            {
                Set set1 = set;
                set = ((Set) (obj));
                obj = set1;
            }
            obj1 = obj;
            obj = set;
            set = ((Set) (obj1));
        }
        return ((cya) (obj));
    }

    private static Set a(cxq cxq1, cwm cwm1, Collection collection)
    {
        collection = cxy.a(cxy.a(cxq1, collection), cwm1, cxq1, collection).a(4, 0);
        cxq1 = new HashSet();
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            cxj cxj1 = (cxj)collection.next();
            if (cwm1.a())
            {
                cxq1.add(new cya(cxj1, cwm1.a(cxj1.b)));
            }
        } while (true);
        return cxq1;
    }

    public final List a(cxq cxq1)
    {
        Set set = a(cxq1, b, ((Collection) (d)));
        cya cya1 = null;
        ArrayList arraylist = new ArrayList();
        long l = 0L;
        do
        {
label0:
            {
                if (l <= cxq1.c)
                {
                    cya1 = a(set, cya1, arraylist.size());
                    if (cya1 != null)
                    {
                        break label0;
                    }
                    Log.w(a, "No more clips available for summary.");
                }
                return arraylist;
            }
            long l1 = cya1.a.a.f.a();
            arraylist.add(cya1.a.a);
            set.remove(cya1);
            l += l1;
        } while (true);
    }

    public final long b(cxq cxq1)
    {
        cxq1 = a(cxq1, b, d).iterator();
        long l;
        for (l = 0L; cxq1.hasNext(); l = ((cya)cxq1.next()).a.a.f.a() + l) { }
        return l;
    }

}
