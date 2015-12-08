// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;

class a
{

    final a a;
    protected TextView cardMonthYearTextView;
    protected TextView cardNumberTextView;
    protected ImageView defaultImage;
    protected TextView defaultOnOff;
    protected ImageView deleteCard;
    protected ImageView iconImageView;
    protected ImageView unDefaultImage;

    public ( , View view)
    {
        a = ;
        super();
        ButterKnife.inject(this, view);
    }
}
