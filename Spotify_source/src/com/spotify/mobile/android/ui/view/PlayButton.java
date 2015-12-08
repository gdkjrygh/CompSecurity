// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import gba;
import gbb;
import gbc;
import gbd;
import gmr;

public class PlayButton extends LinearLayout
{

    private static gbd d = new gbd() {

        public final void a()
        {
        }

        public final void b()
        {
        }

    };
    private View a;
    private View b;
    private gbd c;

    public PlayButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = d;
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(0x7f03010c, this, true);
        context = context.getTheme().obtainStyledAttributes(attributeset, gmr.g, 0, 0);
        int i = context.getDimensionPixelSize(0, 0);
        context.recycle();
        a = findViewById(0x7f110457);
        b = findViewById(0x7f110458);
        a.setOnClickListener(new gbb(this, (byte)0));
        a.setOnLongClickListener(new gbc(this, (byte)0));
        b.setOnClickListener(new gba(this, (byte)0));
        a.setPadding(i, i, i, i);
        b.setPadding(i, i, i, i);
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    public static gbd a(PlayButton playbutton)
    {
        return playbutton.c;
    }

}
