// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.jcp.d.a;
import com.jcp.fragments.fd;
import com.jcp.fragments.t;

// Referenced classes of package com.jcp.adapters:
//            RecommendedProductAdapter

class cf
    implements android.view.View.OnClickListener
{

    final boolean a;
    final RecommendedProductAdapter b;

    cf(RecommendedProductAdapter recommendedproductadapter, boolean flag)
    {
        b = recommendedproductadapter;
        a = flag;
        super();
    }

    public void onClick(View view)
    {
        view = com.jcp.adapters.RecommendedProductAdapter.a(b).getString(0x7f070328);
        boolean flag;
        if (!a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = fd.a(view, flag);
        if (com.jcp.adapters.RecommendedProductAdapter.a(b) instanceof t)
        {
            ((t)com.jcp.adapters.RecommendedProductAdapter.a(b)).c(view, "RecommendationFragment");
            return;
        } else
        {
            throw new a(String.format("Cannot typecast the object of type %s to class %s", new Object[] {
                android/app/Activity.getName(), com/jcp/fragments/t.getName()
            }));
        }
    }
}
