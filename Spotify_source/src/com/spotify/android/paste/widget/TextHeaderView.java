// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import dfh;
import dft;
import dgn;
import dgo;

public class TextHeaderView extends LinearLayout
{

    public TextView a;
    private TextView b;

    public TextHeaderView(Context context)
    {
        this(context, null);
    }

    public TextHeaderView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f0101f5);
    }

    public TextHeaderView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset);
        dgn.a(com/spotify/android/paste/widget/TextHeaderView, this);
        setOrientation(1);
        setGravity(17);
        int j = dft.b(16F, context.getResources());
        int k = dft.b(40F, context.getResources());
        int l = dft.b(16F, context.getResources());
        setPadding(l, j, l, k);
        LinearLayout linearlayout = (LinearLayout)LayoutInflater.from(context).inflate(0x7f030109, this, true);
        a = (TextView)linearlayout.findViewById(0x7f11026e);
        b = (TextView)linearlayout.findViewById(0x7f110474);
        attributeset = context.obtainStyledAttributes(attributeset, dfh.U, i, 0);
        a(attributeset.getString(dfh.V));
        i = attributeset.getResourceId(dfh.X, 0);
        if (i != 0)
        {
            dgo.a(context, a, i);
        }
        attributeset.recycle();
    }

    public final void a(CharSequence charsequence)
    {
        a.setText(charsequence);
        TextView textview = a;
        byte byte0;
        if (TextUtils.isEmpty(charsequence))
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        textview.setVisibility(byte0);
    }

    public final void b(CharSequence charsequence)
    {
        b.setText(charsequence);
        TextView textview = b;
        byte byte0;
        if (TextUtils.isEmpty(charsequence))
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        textview.setVisibility(byte0);
    }
}
