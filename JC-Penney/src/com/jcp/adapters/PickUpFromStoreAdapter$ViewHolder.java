// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.jcp.views.TypefaceButton;
import com.jcp.views.TypefaceTextView;

class 
{

    protected TypefaceTextView addressView;
    protected TypefaceTextView distanceView;
    protected HorizontalScrollView hsvimages;
    protected TextView itemsAvailable;
    protected LinearLayout llview;
    protected TypefaceTextView nameView;
    protected RelativeLayout storeInfoLayout;
    protected TypefaceButton storepick;
    protected TypefaceTextView streetView;

    public (View view)
    {
        ButterKnife.inject(this, view);
    }
}
