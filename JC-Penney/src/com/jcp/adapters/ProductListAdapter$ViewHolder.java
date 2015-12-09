// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.jcp.widget.ProductRating;

// Referenced classes of package com.jcp.adapters:
//            ca

public final class <init>
{

    b a;
    protected ImageView btnvideoplay;
    protected TextView color;
    protected TextView description;
    protected TextView newImage;
    protected TextView originalPrice;
    protected TextView percentOff;
    protected ImageView productImage;
    protected TextView productMarketingLabel;
    protected TextView productPromotionMessage;
    protected ProductRating productRating;
    protected TextView salePrice;
    protected ImageView saveIcon;
    protected TextView searchSimilar;
    protected ViewStub stub;

    private b(View view)
    {
        ButterKnife.inject(this, view);
    }

    b(View view, ca ca)
    {
        this(view);
    }
}
