// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.view.View;
import android.widget.TextView;
import com.jcp.model.ProductFilterModal;
import java.util.Map;

// Referenced classes of package com.jcp.activities:
//            ar

class au
    implements android.view.View.OnClickListener
{

    final ar a;

    au(ar ar1)
    {
        a = ar1;
        super();
    }

    public void onClick(View view)
    {
        view = view.getTag().toString();
        ProductFilterModal productfiltermodal = (ProductFilterModal)ar.b(a).get(view);
        productfiltermodal.getClearTxv().setVisibility(4);
        a.a(productfiltermodal, view);
    }
}
