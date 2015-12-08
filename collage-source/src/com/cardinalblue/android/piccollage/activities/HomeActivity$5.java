// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import bolts.i;
import bolts.j;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.events.b;
import com.cardinalblue.android.piccollage.model.Collage;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            HomeActivity

class a
    implements i
{

    final HomeActivity a;

    public Void a(j j1)
        throws Exception
    {
        if (j1.d())
        {
            f.a(j1.f());
            return null;
        } else
        {
            d.a().c(new b((Collage)j1.e()));
            return null;
        }
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    (HomeActivity homeactivity)
    {
        a = homeactivity;
        super();
    }
}
