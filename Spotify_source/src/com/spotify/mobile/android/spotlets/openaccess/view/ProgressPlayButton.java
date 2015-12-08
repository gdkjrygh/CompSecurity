// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.openaccess.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.spotify.android.paste.widget.CircularProgressBar;

public class ProgressPlayButton extends LinearLayout
{

    public View a;
    public View b;
    private CircularProgressBar c;

    public ProgressPlayButton(Context context)
    {
        this(context, null);
    }

    public ProgressPlayButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(0x7f030121, this, true);
        a = findViewById(0x7f110457);
        b = findViewById(0x7f110458);
        c = (CircularProgressBar)findViewById(0x7f1104a2);
    }

    public final void a(float f)
    {
        c.a(f);
    }
}
