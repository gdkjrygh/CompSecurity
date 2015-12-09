// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.momentsstart.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MomentHeaderView extends RelativeLayout
{

    public TextView a;

    public MomentHeaderView(Context context)
    {
        super(context);
        b();
    }

    public MomentHeaderView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b();
    }

    private void b()
    {
        inflate(getContext(), 0x7f0300dc, this);
        a = (TextView)findViewById(0x7f1102ce);
    }

    public final void a()
    {
        if (a.getAlpha() == 1.0F)
        {
            return;
        } else
        {
            a.animate().cancel();
            a.animate().alpha(1.0F).setDuration(400L).start();
            return;
        }
    }
}
