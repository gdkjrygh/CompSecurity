// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;

class 
{

    protected TextView deliveredDayAndDate;
    protected TextView leftAtPlace;
    protected TextView scheduleLabel;
    protected ImageView shipmentProgressView;
    protected TextView status;
    protected TextView trackingNumber;

    public (View view)
    {
        ButterKnife.inject(this, view);
    }
}
