// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.maps;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.maps:
//            LatLng

public class q
{

    private i a;

    public q(i j)
    {
        a = j;
    }

    public void a()
    {
        a.a();
    }

    public void a(float f1)
    {
        a.a(f1);
    }

    public void a(int j)
    {
        a.a(j);
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

    public float d()
    {
        return a.d();
    }

    public int e()
    {
        return a.e();
    }

    public boolean equals(Object obj)
    {
        return a.equals(obj);
    }

    public float f()
    {
        return a.f();
    }

    public boolean g()
    {
        return a.g();
    }

    public boolean h()
    {
        return a.h();
    }

    public int hashCode()
    {
        return a.hashCode();
    }
}
