// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.maps;

import com.google.android.gms.maps.model.e;
import com.google.android.gms.maps.model.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.maps:
//            k

public class j
{

    private e a;

    public j(e e1)
    {
        a = e1;
    }

    public int a()
    {
        return a.a();
    }

    public int b()
    {
        return a.b();
    }

    public List c()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = a.c().iterator(); iterator.hasNext(); arraylist.add(new k((f)iterator.next()))) { }
        return arraylist;
    }

    public boolean d()
    {
        return a.d();
    }

    public boolean equals(Object obj)
    {
        return a.equals(obj);
    }

    public int hashCode()
    {
        return a.hashCode();
    }
}
