// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.momentsstart.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MomentOverlayView extends RelativeLayout
{

    public TextView a;
    public boolean b;
    public Runnable c = new Runnable() {

        private MomentOverlayView a;

        public final void run()
        {
            MomentOverlayView.a(a);
        }

            
            {
                a = MomentOverlayView.this;
                super();
            }
    };

    public MomentOverlayView(Context context)
    {
        super(context);
        a();
    }

    public MomentOverlayView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    private void a()
    {
        LayoutInflater.from(getContext()).inflate(0x7f0300e0, this);
        a = (TextView)findViewById(0x1020014);
        setAlpha(0.0F);
    }

    static boolean a(MomentOverlayView momentoverlayview)
    {
        momentoverlayview.b = false;
        return false;
    }
}
