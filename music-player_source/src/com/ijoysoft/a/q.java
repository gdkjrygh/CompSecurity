// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ijoysoft.a;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.AdView;

// Referenced classes of package com.ijoysoft.a:
//            u, t

public final class q extends LinearLayout
{

    public q(Context context)
    {
        super(context);
        inflate(context, u.b, this);
    }

    public final void a(int i)
    {
        TextView textview = (TextView)findViewById(t.h);
        textview.setVisibility(0);
        textview.setText(i);
    }

    public final void a(int i, android.view.View.OnClickListener onclicklistener)
    {
        Button button = (Button)findViewById(t.f);
        button.setOnClickListener(onclicklistener);
        button.setText(i);
        button.setVisibility(0);
    }

    public final void a(AdView adview)
    {
        if (adview == null)
        {
            return;
        }
        if (adview.getParent() != null)
        {
            ((ViewGroup)adview.getParent()).removeView(adview);
        }
        LinearLayout linearlayout = (LinearLayout)findViewById(t.a);
        linearlayout.setVisibility(0);
        linearlayout.addView(adview);
    }

    public final void b(int i)
    {
        TextView textview = (TextView)findViewById(t.b);
        textview.setText(i);
        textview.setVisibility(0);
    }

    public final void b(int i, android.view.View.OnClickListener onclicklistener)
    {
        Button button = (Button)findViewById(t.c);
        button.setOnClickListener(onclicklistener);
        button.setText(i);
        button.setVisibility(0);
    }

    public final void c(int i, android.view.View.OnClickListener onclicklistener)
    {
        Button button = (Button)findViewById(t.e);
        button.setOnClickListener(onclicklistener);
        button.setText(i);
        button.setVisibility(0);
    }
}
