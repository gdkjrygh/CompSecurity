// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import com.jcp.e.p;
import com.jcp.pojo.LocalAdPromotion;

// Referenced classes of package com.jcp.adapters:
//            LocalAdsCatalogAdapter

class be
    implements android.view.View.OnClickListener
{

    final LocalAdPromotion a;
    final LocalAdsCatalogAdapter b;

    be(LocalAdsCatalogAdapter localadscatalogadapter, LocalAdPromotion localadpromotion)
    {
        b = localadscatalogadapter;
        a = localadpromotion;
        super();
    }

    public void onClick(View view)
    {
        LocalAdsCatalogAdapter.b(b).a(view, a.getId());
    }
}
