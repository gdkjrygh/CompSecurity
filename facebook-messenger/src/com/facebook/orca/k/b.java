// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.k;

import com.facebook.location.Coordinates;
import com.facebook.location.d;
import com.facebook.location.f;
import com.facebook.location.r;
import com.google.common.d.a.i;
import com.google.common.d.a.s;

// Referenced classes of package com.facebook.orca.k:
//            c

public class b
{

    private final r a;
    private final d b;

    public b(r r1, d d1)
    {
        a = r1;
        b = d1;
    }

    private s a()
    {
        Object obj = a.a();
        if (obj == null)
        {
            return i.a(null);
        } else
        {
            obj = new f(Coordinates.a(((android.location.Location) (obj))), true);
            return b.a(((f) (obj)));
        }
    }

    private s b(Coordinates coordinates)
    {
        coordinates = new f(coordinates, false);
        return b.a(coordinates);
    }

    public s a(Coordinates coordinates)
    {
        return i.a(i.a(new s[] {
            a(), b(coordinates)
        }), new c(this));
    }
}
