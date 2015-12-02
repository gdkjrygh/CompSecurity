// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.result.card.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class CardView extends RelativeLayout
{

    protected Context c;

    public CardView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CardView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        c = context;
    }
}
