// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.widget.ViewSwitcher;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            ag

class a
    implements i
{

    final ag a;

    public Object then(j j1)
        throws Exception
    {
        ag.a(a).setDisplayedChild(1);
        if (j1.d() || j1.c())
        {
            f.a(j1.f());
            return null;
        } else
        {
            ag.a(a, (CBCollagesResponse)j1.e());
            return null;
        }
    }

    sResponse(ag ag1)
    {
        a = ag1;
        super();
    }
}
