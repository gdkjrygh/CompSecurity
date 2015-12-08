// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.jcp.widget.ProductRating;

class 
{

    protected ImageView image;
    protected TextView lineOne;
    protected TextView lineTwo;
    protected TextView name;
    protected TextView originalPrice;
    protected View personalizedRecommendation;
    protected View product;
    protected ProductRating productRating;
    protected TextView salePrice;
    protected Button shopNow;
    protected TextView tvFor;
    protected TextView userName;

    public (View view)
    {
        ButterKnife.inject(this, view);
    }
}
