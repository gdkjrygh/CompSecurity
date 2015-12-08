// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.momentsstart.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import evk;
import fyd;
import km;
import me;

public class PlayButtonOverlayView extends RelativeLayout
{

    public evk a;
    private ImageButton b;
    private final Runnable c;

    public PlayButtonOverlayView(Context context)
    {
        super(context);
        c = new Runnable() {

            private PlayButtonOverlayView a;

            public final void run()
            {
                a.setVisibility(8);
            }

            
            {
                a = PlayButtonOverlayView.this;
                super();
            }
        };
        b();
    }

    public PlayButtonOverlayView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = new _cls1();
        b();
    }

    static evk a(PlayButtonOverlayView playbuttonoverlayview)
    {
        return playbuttonoverlayview.a;
    }

    private void b()
    {
        LayoutInflater.from(getContext()).inflate(0x7f0300e1, this);
        b = (ImageButton)findViewById(0x7f110427);
        b.setImageDrawable(fyd.a(getContext(), 60, 2));
        b.setOnClickListener(new android.view.View.OnClickListener() {

            private PlayButtonOverlayView a;

            public final void onClick(View view)
            {
                if (a.getVisibility() == 0 && PlayButtonOverlayView.a(a) != null)
                {
                    PlayButtonOverlayView.a(a).a();
                }
            }

            
            {
                a = PlayButtonOverlayView.this;
                super();
            }
        });
    }

    private void c()
    {
        animate().cancel();
        setScaleX(1.0F);
        setScaleY(1.0F);
    }

    public final void a()
    {
        if (getVisibility() == 0 && getAlpha() == 1.0F)
        {
            return;
        } else
        {
            setVisibility(0);
            c();
            setAlpha(0.0F);
            animate().setDuration(300L).alpha(1.0F).start();
            return;
        }
    }

    public void dismiss(long l)
    {
        if (getVisibility() == 8)
        {
            return;
        } else
        {
            c();
            setAlpha(1.0F);
            km.q(this).a().b().a(l).a(0.0F).a(c).d();
            return;
        }
    }
}
