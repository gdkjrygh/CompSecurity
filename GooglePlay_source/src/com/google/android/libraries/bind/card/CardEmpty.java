// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.card;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.libraries.bind.widget.BindingFrameLayout;

public class CardEmpty extends BindingFrameLayout
{

    public static final int EQUALITY_FIELDS[] = new int[0];
    public static final int LAYOUT = 0x7f040024;

    public CardEmpty(Context context)
    {
        this(context, null, 0);
    }

    public CardEmpty(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CardEmpty(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

}
