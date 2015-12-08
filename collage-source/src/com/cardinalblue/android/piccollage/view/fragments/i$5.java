// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;
import com.cardinalblue.android.piccollage.view.a.d;
import com.malinskiy.superrecyclerview.SuperRecyclerView;
import com.squareup.a.b;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            i

class a
    implements a
{

    final i a;

    public void a(CBCollagesResponse cbcollagesresponse, Exception exception)
    {
        a.k.a();
        if (exception != null)
        {
            if (!a.a(exception))
            {
                a.d();
                k.a(a.getActivity(), 0x7f0700f8, 1);
            }
        } else
        if (cbcollagesresponse != null)
        {
            i.a(a, cbcollagesresponse.getListRevision());
            a.b.a(cbcollagesresponse);
            a.k.setCanLoadMore(a.b.g());
            a.c(cbcollagesresponse);
            a.b.notifyDataSetChanged();
            a.a();
            cbcollagesresponse = a.b(cbcollagesresponse);
            if (cbcollagesresponse != null)
            {
                com.cardinalblue.android.piccollage.controller.d.a().c(cbcollagesresponse);
                return;
            }
        }
    }

    esResponse(i j)
    {
        a = j;
        super();
    }
}
