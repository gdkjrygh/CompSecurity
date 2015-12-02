// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.location;

import android.location.Address;
import android.location.Geocoder;
import com.facebook.common.w.n;
import com.facebook.debug.log.b;
import com.google.common.a.es;
import com.google.common.d.a.i;
import com.google.common.d.a.s;
import com.google.common.d.a.u;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.location:
//            f, Coordinates, g, c, 
//            e

public class d
{

    private static final Class a = com/facebook/location/d;
    private final Geocoder b;
    private final c c;
    private final u d;

    public d(Geocoder geocoder, c c1, u u1)
    {
        b = geocoder;
        c = c1;
        d = u1;
    }

    private Address a(List list)
    {
        if (list.isEmpty())
        {
            return null;
        }
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            Address address = (Address)iterator.next();
            if (!n.a(address.getSubLocality()))
            {
                return address;
            }
        }

        return (Address)list.get(0);
    }

    static g a(d d1, f f1)
    {
        return d1.b(f1);
    }

    private g b(f f1)
    {
        Object obj = f1.a();
        Address address;
        try
        {
            obj = b.getFromLocation(((Coordinates) (obj)).b(), ((Coordinates) (obj)).c(), 4);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.facebook.debug.log.b.b(a, "Failed to geocode", ((Throwable) (obj)));
            obj = es.d();
        }
        address = a(((List) (obj)));
        obj = null;
        if (address != null)
        {
            obj = new g(f1.a(), address.getSubLocality(), address.getLocality(), address.getAdminArea(), address.getCountryCode(), address.getCountryName());
        }
        if (f1.b())
        {
            c.b(f1.a(), ((g) (obj)));
        } else
        {
            c.a(f1.a(), ((g) (obj)));
        }
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Geocoding complete: ").append(address).toString());
        return ((g) (obj));
    }

    public s a(f f1)
    {
        g g1;
        if (f1.b())
        {
            g1 = c.b(f1.a());
        } else
        {
            g1 = c.a(f1.a());
        }
        if (g1 == null)
        {
            return d.c(new e(this, f1));
        } else
        {
            return i.a(g1);
        }
    }

}
