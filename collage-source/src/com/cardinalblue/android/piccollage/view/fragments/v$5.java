// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.widget.ImageView;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            v

class a
    implements i
{

    final v a;

    public Void a(j j1)
        throws Exception
    {
        if (j1.c() || j1.d())
        {
            v.a(a).setVisibility(8);
            return null;
        }
        j1 = (CBCollagesResponse)j1.e();
        if (j1 != null && j1.getPromotion() != null)
        {
            v.a(a, j1.getPromotion());
            return null;
        } else
        {
            v.a(a).setVisibility(8);
            return null;
        }
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    esResponse(v v1)
    {
        a = v1;
        super();
    }
}
