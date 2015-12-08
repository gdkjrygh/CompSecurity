// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;
import com.cardinalblue.android.piccollage.view.a.y;
import com.malinskiy.superrecyclerview.SuperRecyclerView;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            af

class a
    implements a
{

    final af a;

    public void a(CBCollagesResponse cbcollagesresponse, Exception exception)
    {
        a.h.a();
        if (exception != null)
        {
            if (!af.a(a, exception))
            {
                af.a(a);
                k.a(a.getActivity(), 0x7f0700f8, 1);
            }
        } else
        if (cbcollagesresponse != null)
        {
            af.a(a, cbcollagesresponse.getListRevision());
            a.a.b(cbcollagesresponse);
            a.h.setCanLoadMore(a.a.b());
            af.c(a);
            return;
        }
    }

    sResponse(af af1)
    {
        a = af1;
        super();
    }
}
