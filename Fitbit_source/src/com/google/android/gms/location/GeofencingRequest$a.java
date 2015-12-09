// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import com.google.android.gms.internal.am;
import com.google.android.gms.internal.nn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.location:
//            GeofencingRequest, g

public static final class b
{

    private final List a = new ArrayList();
    private int b;

    public static int b(int i)
    {
        return i & 7;
    }

    public b a(int i)
    {
        b = b(i);
        return this;
    }

    public b a(g g1)
    {
        am.a(g1, "geofence can't be null.");
        am.b(g1 instanceof nn, "Geofence must be created using Geofence.Builder.");
        a.add((nn)g1);
        return this;
    }

    public a a(List list)
    {
        if (list != null && !list.isEmpty())
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                g g1 = (g)list.next();
                if (g1 != null)
                {
                    a(g1);
                }
            }
        }
        return this;
    }

    public GeofencingRequest a()
    {
        boolean flag;
        if (!a.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        am.b(flag, "No geofence has been added to this request.");
        return new GeofencingRequest(a, b, null);
    }

    public _cls9()
    {
        b = 5;
    }
}
