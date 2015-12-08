// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.widget.RatingBar;
import android.widget.TextView;
import com.jcp.model.ProductFilterModal;
import com.jcp.productfilter.pojo.Filters;
import java.util.Map;

// Referenced classes of package com.jcp.activities:
//            ar

class at
    implements android.widget.RatingBar.OnRatingBarChangeListener
{

    final Filters a;
    final ar b;

    at(ar ar1, Filters filters)
    {
        b = ar1;
        a = filters;
        super();
    }

    public void onRatingChanged(RatingBar ratingbar, float f, boolean flag)
    {
        if ((double)f != 0.0D)
        {
            ((ProductFilterModal)ar.b(b).get(a.getName())).getClearTxv().setVisibility(0);
        }
    }
}
