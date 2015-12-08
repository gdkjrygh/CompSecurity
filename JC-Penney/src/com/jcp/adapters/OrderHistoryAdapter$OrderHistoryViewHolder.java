// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;

class A
{

    protected TextView orderHistoryDateView;
    protected TextView orderHistoryStatusView;
    protected TextView orderIdView;

    public A(View view)
    {
        ButterKnife.inject(this, view);
    }
}
