// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import com.spotify.android.paste.widget.DialogLayout;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import dgp;
import dkb;
import dmz;
import fop;
import fos;
import fou;
import ggn;
import gin;
import gio;
import gip;
import giq;

public class SoundEffectsWarningActivity extends fou
{

    public static final gip d = gip.b("sound_effect_dialog_disabled");
    private fop i;
    private fos j;
    private CheckBox k;
    private android.view.View.OnClickListener l;

    public SoundEffectsWarningActivity()
    {
        i = (fop)dmz.a(fop);
        j = (fos)dmz.a(fos);
        l = new android.view.View.OnClickListener() {

            private SoundEffectsWarningActivity a;

            public final void onClick(View view)
            {
                SoundEffectsWarningActivity.a(a);
                fop.a(a, ViewUri.bh, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.H));
                if (SoundEffectsWarningActivity.b(a).isChecked())
                {
                    ((giq)dmz.a(giq)).b(a).b().a(SoundEffectsWarningActivity.d, true).b();
                }
                SoundEffectsWarningActivity.c(a);
                fos.a(a);
            }

            
            {
                a = SoundEffectsWarningActivity.this;
                super();
            }
        };
    }

    static fop a(SoundEffectsWarningActivity soundeffectswarningactivity)
    {
        return soundeffectswarningactivity.i;
    }

    public static boolean a(Context context)
    {
        gin gin1 = ((giq)dmz.a(giq)).b(context);
        return dkb.a(context).a() || gin1.a(d, false);
    }

    static CheckBox b(SoundEffectsWarningActivity soundeffectswarningactivity)
    {
        return soundeffectswarningactivity.k;
    }

    public static void b(Context context)
    {
        Intent intent = new Intent(context, com/spotify/mobile/android/ui/activity/SoundEffectsWarningActivity);
        intent.addFlags(0x40000000);
        intent.addFlags(0x10000);
        context.startActivity(intent);
    }

    static fos c(SoundEffectsWarningActivity soundeffectswarningactivity)
    {
        return soundeffectswarningactivity.j;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = new DialogLayout(this);
        setContentView(bundle);
        bundle.a(0x7f08027c);
        bundle.c(0x7f08027b);
        k = dgp.c(this);
        k.setText(0x7f08027a);
        FrameLayout framelayout = new FrameLayout(this);
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutparams.setMargins(0, 0, 0, getResources().getDimensionPixelOffset(0x7f0c00cb));
        framelayout.addView(k, layoutparams);
        bundle.a(framelayout);
        bundle.a(0x7f0805a1, l);
        super.e = ggn.a(this, ViewUri.bh);
    }

}
