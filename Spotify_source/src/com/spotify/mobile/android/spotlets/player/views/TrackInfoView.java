// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.player.views;

import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.CheckableImageButton;
import dft;
import dfz;
import dgo;
import fcu;
import fyd;
import fye;
import gcg;

// Referenced classes of package com.spotify.mobile.android.spotlets.player.views:
//            MarqueeTextView

public class TrackInfoView extends LinearLayout
    implements android.view.View.OnClickListener
{

    private static final fcu f = new fcu() {

        public final void a()
        {
        }

        public final void b()
        {
        }

    };
    public CheckableImageButton a;
    public ImageView b;
    public fcu c;
    private MarqueeTextView d;
    private MarqueeTextView e;

    public TrackInfoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = f;
        LayoutInflater.from(context).inflate(0x7f030141, this);
        a = (CheckableImageButton)findViewById(0x7f1104d5);
        d = (MarqueeTextView)findViewById(0x7f11026e);
        e = (MarqueeTextView)findViewById(0x7f1104d6);
        b = (ImageView)findViewById(0x7f1104d7);
        context = a;
        attributeset = getContext();
        int i = dft.b(15F, attributeset.getResources());
        dfz dfz1 = new dfz(attributeset, SpotifyIcon.i, i);
        dfz dfz2 = new dfz(attributeset, SpotifyIcon.H, i);
        dfz dfz3 = new dfz(attributeset, SpotifyIcon.H, i);
        dfz dfz4 = new dfz(attributeset, SpotifyIcon.H, i);
        dfz1.a(gcg.b(attributeset, 0x7f0f00b9));
        dfz2.a(gcg.b(attributeset, 0x7f0f00b9));
        dfz3.a(gcg.b(attributeset, 0x7f0f00bf));
        dfz4.a(gcg.b(attributeset, 0x7f0f00ba));
        StateListDrawable statelistdrawable = new StateListDrawable();
        statelistdrawable.addState(new int[] {
            0x10100a0, 0x101009e
        }, dfz1);
        statelistdrawable.addState(new int[] {
            0x10100a7, 0x101009e
        }, dfz2);
        statelistdrawable.addState(new int[] {
            0x10100a0
        }, dfz1);
        statelistdrawable.addState(new int[] {
            0x10100a7
        }, dfz2);
        statelistdrawable.addState(new int[] {
            0x101009e
        }, dfz3);
        statelistdrawable.addState(new int[0], dfz4);
        context.setImageDrawable(fyd.a(attributeset, gcg.c(attributeset, 0x7f0f0157), statelistdrawable, 0.625F));
        b.setImageDrawable(fye.a(getContext(), 0x7f0f0156));
        a.setOnClickListener(this);
        b.setOnClickListener(this);
    }

    public final void a(String s)
    {
        d.a(s);
    }

    public final void a(String s, boolean flag)
    {
        MarqueeTextView marqueetextview = e;
        int i;
        if (flag)
        {
            i = 0x7f0b016b;
        } else
        {
            i = 0x7f0b016a;
        }
        if (!marqueetextview.a().equals(s))
        {
            dgo.a(marqueetextview.getContext(), marqueetextview, i);
            marqueetextview.setText(s);
        }
    }

    public final void a(boolean flag)
    {
        a.setChecked(flag);
        CheckableImageButton checkableimagebutton = a;
        Context context = getContext();
        int i;
        if (flag)
        {
            i = 0x7f0803e7;
        } else
        {
            i = 0x7f0803e6;
        }
        checkableimagebutton.setContentDescription(context.getString(i));
    }

    public final void b(boolean flag)
    {
        a.setEnabled(flag);
    }

    public final void c(boolean flag)
    {
        a.setClickable(flag);
    }

    public void onClick(View view)
    {
        if (view == a)
        {
            c.a();
        } else
        if (view == b)
        {
            c.b();
            return;
        }
    }

}
