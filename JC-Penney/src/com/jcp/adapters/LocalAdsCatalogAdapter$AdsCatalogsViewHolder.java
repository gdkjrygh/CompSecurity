// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;

class 
{

    protected LinearLayout a;
    protected HorizontalScrollView adsCatalogsItemHorizontalView;
    protected TextView adsCatalogsItemTitleText;

    public (View view)
    {
        ButterKnife.inject(this, view);
    }
}
