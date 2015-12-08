// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.spotify.android.paste.widget.DialogLayout;
import com.spotify.mobile.android.ui.cell.settings.LastFmSettingsCell;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import dft;
import dgo;
import dgp;
import dmz;
import fop;
import fou;
import gcg;
import ggn;

public class LastFmLoginDialog extends fou
{

    private EditText d;
    private EditText i;
    private android.view.View.OnClickListener j;
    private android.view.View.OnClickListener k;

    public LastFmLoginDialog()
    {
        dmz.a(fop);
        j = new android.view.View.OnClickListener() {

            private LastFmLoginDialog a;

            public final void onClick(View view)
            {
                fop.a(a, ViewUri.ar, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.H));
                LastFmLoginDialog.a(LastFmLoginDialog.c(a));
                LastFmLoginDialog.a(LastFmLoginDialog.a(a));
                view = LastFmLoginDialog.c(a).getText().toString().trim();
                String s = LastFmLoginDialog.a(a).getText().toString().trim();
                if (!TextUtils.isEmpty(view) && !TextUtils.isEmpty(s))
                {
                    LastFmSettingsCell.a(a.getApplicationContext(), view, s);
                    a.finish();
                    a.overridePendingTransition(0, 0);
                }
                a.finish();
            }

            
            {
                a = LastFmLoginDialog.this;
                super();
            }
        };
        k = new android.view.View.OnClickListener() {

            private LastFmLoginDialog a;

            public final void onClick(View view)
            {
                fop.a(a, ViewUri.ar, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.g));
                a.finish();
            }

            
            {
                a = LastFmLoginDialog.this;
                super();
            }
        };
    }

    public static Intent a(Context context, String s)
    {
        context = new Intent(context, com/spotify/mobile/android/ui/activity/LastFmLoginDialog);
        context.addFlags(0x40000000);
        context.addFlags(0x10000);
        context.putExtra("intent_username", s);
        return context;
    }

    static EditText a(LastFmLoginDialog lastfmlogindialog)
    {
        return lastfmlogindialog.i;
    }

    static void a(EditText edittext)
    {
        if (TextUtils.isEmpty(edittext.getText().toString()))
        {
            edittext.setHintTextColor(gcg.b(edittext.getContext(), 0x7f0f013a));
        }
    }

    static void b(LastFmLoginDialog lastfmlogindialog)
    {
        lastfmlogindialog.f();
    }

    static EditText c(LastFmLoginDialog lastfmlogindialog)
    {
        return lastfmlogindialog.d;
    }

    private void f()
    {
        dgo.a(i.getContext(), i, 0x7f0b0146);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = new DialogLayout(this);
        setContentView(bundle);
        bundle.a(0x7f080486);
        LinearLayout linearlayout = new LinearLayout(this);
        linearlayout.setOrientation(1);
        Object obj = getIntent().getStringExtra("intent_username");
        d = dgp.a(this);
        d.setId(0x7f11011c);
        d.setImeOptions(5);
        d.setText(((CharSequence) (obj)));
        d.setFreezesText(true);
        d.setSingleLine(true);
        d.setHint(0x7f080487);
        i = dgp.a(this);
        i.setId(0x7f1100df);
        i.setImeOptions(6);
        i.setHint(0x7f080485);
        i.setFreezesText(true);
        i.setSingleLine(true);
        i.setInputType(129);
        f();
        obj = dgp.c(this);
        ((CheckBox) (obj)).setId(0x7f11027d);
        ((CheckBox) (obj)).setText(0x7f08032e);
        ((CheckBox) (obj)).setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            private LastFmLoginDialog a;

            public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                compoundbutton = LastFmLoginDialog.a(a);
                int i1;
                if (flag)
                {
                    i1 = 145;
                } else
                {
                    i1 = 129;
                }
                compoundbutton.setInputType(i1);
                i1 = LastFmLoginDialog.a(a).length();
                LastFmLoginDialog.a(a).setSelection(i1);
                LastFmLoginDialog.b(a);
            }

            
            {
                a = LastFmLoginDialog.this;
                super();
            }
        });
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        int l = dft.a(8F, getResources());
        layoutparams.setMargins(0, l, 0, l);
        linearlayout.addView(d, layoutparams);
        linearlayout.addView(i, layoutparams);
        linearlayout.addView(((View) (obj)), layoutparams);
        bundle.a(linearlayout);
        bundle.a(0x7f0805a1, j);
        bundle.b(0x7f08059f, k);
        super.e = ggn.a(this, ViewUri.ar);
    }
}
