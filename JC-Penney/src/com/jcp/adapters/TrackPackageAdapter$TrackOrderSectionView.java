// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;

class 
{

    protected TextView carrierType;
    protected TextView trackMethod;
    protected TextView trackOrderDate;
    protected LinearLayout trackOrderDateLayout;
    protected Button trackPackageButton;
    protected LinearLayout trackPackageLayout;
    protected TextView trackStatus;
    protected TextView trackingNumber;

    public (View view)
    {
        ButterKnife.inject(this, view);
    }
}
