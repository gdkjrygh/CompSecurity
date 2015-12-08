// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.maps;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.maps:
//            LatLng

public class p
{

    private h a;

    public p(h h1)
    {
        a = h1;
    }

    public void a()
    {
        a.a();
    }

    public void a(float f1)
    {
        a.a(f1);
    }

    public void a(int k)
    {
        a.a(k);
    }

    public void a(List list)
    {
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(((com.fitbit.maps.LatLng)list.next()).a())) { }
        a.a(arraylist);
    }

    public void a(boolean flag)
    {
        a.a(flag);
    }

    public String b()
    {
        return a.b();
    }

    public void b(float f1)
    {
        a.b(f1);
    }

    public void b(int k)
    {
        a.b(k);
    }

    public void b(List list)
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1;
        for (list = list.iterator(); list.hasNext(); arraylist.add(arraylist1))
        {
            Object obj = (List)list.next();
            arraylist1 = new ArrayList();
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist1.add(((com.fitbit.maps.LatLng)((Iterator) (obj)).next()).a())) { }
        }

        a.b(arraylist);
    }

    public void b(boolean flag)
    {
        a.b(flag);
    }

    public List c()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = a.c().iterator(); iterator.hasNext(); arraylist.add(new com.fitbit.maps.LatLng((LatLng)iterator.next()))) { }
        return arraylist;
    }

    public List d()
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1;
        for (Iterator iterator = a.d().iterator(); iterator.hasNext(); arraylist.add(arraylist1))
        {
            Object obj = (List)iterator.next();
            arraylist1 = new ArrayList();
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist1.add(new com.fitbit.maps.LatLng((LatLng)((Iterator) (obj)).next()))) { }
        }

        return arraylist;
    }

    public float e()
    {
        return a.e();
    }

    public boolean equals(Object obj)
    {
        return a.equals(obj);
    }

    public int f()
    {
        return a.f();
    }

    public int g()
    {
        return a.g();
    }

    public float h()
    {
        return a.h();
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public boolean i()
    {
        return a.i();
    }

    public boolean j()
    {
        return a.j();
    }
}
