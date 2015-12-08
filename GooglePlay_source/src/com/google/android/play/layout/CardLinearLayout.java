// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.play.cardview.CardViewGroupDelegate;
import com.google.android.play.cardview.CardViewGroupDelegates;

public class CardLinearLayout extends LinearLayout
{

    public CardLinearLayout(Context context)
    {
        this(context, null);
    }

    public CardLinearLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        CardViewGroupDelegates.IMPL.initialize(this, context, attributeset, 0);
    }

    public CardLinearLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        CardViewGroupDelegates.IMPL.initialize(this, context, attributeset, i);
    }
}
