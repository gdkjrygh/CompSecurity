// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.widget.ListView;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.model.gdata.UserFeed;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            d

class a
    implements i
{

    final d a;

    public Void a(j j1)
        throws Exception
    {
        if (j1.d() || j1.c())
        {
            f.a(j1.f());
            d.a(a);
        } else
        {
            j1 = (UserFeed)j1.e();
            a a1 = (d)d.b(a).getAdapter();
            a1.clear();
            a1.addAll(j1.a());
            d.c(a);
        }
        return null;
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    d(d d1)
    {
        a = d1;
        super();
    }
}
