// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RatingBar;
import butterknife.ButterKnife;

// Referenced classes of package com.jcp.adapters:
//            ProductFilterRatingAdapter

public class a
{

    final ProductFilterRatingAdapter a;
    protected RadioButton radioBtn;
    protected RatingBar ratingBar;

    protected (ProductFilterRatingAdapter productfilterratingadapter, View view)
    {
        a = productfilterratingadapter;
        super();
        ButterKnife.inject(this, view);
    }
}
