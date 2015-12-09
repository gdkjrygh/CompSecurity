// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import dfh;
import dgn;
import dgo;

public class NotificationBadgeView extends TextView
{

    int a;

    public NotificationBadgeView(Context context)
    {
        this(context, null);
    }

    public NotificationBadgeView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f0101f6);
    }

    public NotificationBadgeView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset);
        dgn.a(com/spotify/android/paste/widget/NotificationBadgeView, this);
        attributeset = context.obtainStyledAttributes(attributeset, dfh.ar, i, 0);
        i = attributeset.getResourceId(dfh.av, 0);
        android.graphics.drawable.Drawable drawable = attributeset.getDrawable(dfh.as);
        int j = attributeset.getDimensionPixelSize(dfh.au, 0);
        int k = attributeset.getInteger(dfh.at, 99);
        attributeset.recycle();
        dgo.a(this, drawable);
        dgo.a(context, this, i);
        setMinWidth(j);
        setVisibility(8);
        a = k;
    }
}
