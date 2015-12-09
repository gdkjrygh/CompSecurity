// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.viewuri.Verified;
import ctz;
import dfz;
import dmz;
import dnk;
import dnl;
import dtx;
import fop;
import fou;
import gcg;
import gin;
import gio;
import gip;
import giq;

public class CellularSyncDialogActivity extends fou
{

    public static final gip d = gip.b("cellular_sync_dialog_declined");
    private final fop i = (fop)dmz.a(fop);

    public CellularSyncDialogActivity()
    {
    }

    public static Intent a(Context context, Verified verified)
    {
        ctz.a(context);
        context = new Intent(context, com/spotify/mobile/android/ui/activity/CellularSyncDialogActivity);
        context.putExtra("uri", verified);
        return context;
    }

    static fop a(CellularSyncDialogActivity cellularsyncdialogactivity)
    {
        return cellularsyncdialogactivity.i;
    }

    public static boolean a(Context context)
    {
        return !((giq)dmz.a(giq)).b(context).a(d, false);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03001b);
        Button button = (Button)findViewById(0x7f1102a6);
        Button button1 = (Button)findViewById(0x7f1102a5);
        Object obj = (ImageView)findViewById(0x7f11026d);
        int j = getResources().getDimensionPixelSize(0x7f0c00bf);
        dfz dfz1 = new dfz(this, SpotifyIcon.u, j);
        dfz1.a(gcg.b(this, 0x7f0f0092));
        ((ImageView) (obj)).setImageDrawable(dfz1);
        obj = getIntent();
        if (((Intent) (obj)).hasExtra("uri"))
        {
            obj = (Verified)((Intent) (obj)).getParcelableExtra("uri");
            button.setOnClickListener(new android.view.View.OnClickListener(((Verified) (obj))) {

                private Verified a;
                private CellularSyncDialogActivity b;

                public final void onClick(View view)
                {
                    ((giq)dmz.a(giq)).b(b).b().a(CellularSyncDialogActivity.d, true).b();
                    view = new dnl("cellular-sync-dialog", "dimsiss", a.toString());
                    CellularSyncDialogActivity.a(b);
                    fop.a(b, view);
                    b.finish();
                }

            
            {
                b = CellularSyncDialogActivity.this;
                a = verified;
                super();
            }
            });
            button1.setOnClickListener(new android.view.View.OnClickListener(((Verified) (obj))) {

                private Verified a;
                private CellularSyncDialogActivity b;

                public final void onClick(View view)
                {
                    view = new ContentValues();
                    view.put("download_over_3g", Boolean.valueOf(true));
                    b.getContentResolver().update(dtx.a, view, null, null);
                    new ClientEventFactory();
                    view = ClientEventFactory.a("download_over_3g");
                    view = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.a, view);
                    view.a("value", "true");
                    CellularSyncDialogActivity.a(b);
                    fop.a(b, a, view);
                    view = new dnl("cellular-sync-dialog", "enable", a.toString());
                    CellularSyncDialogActivity.a(b);
                    fop.a(b, view);
                    b.finish();
                }

            
            {
                b = CellularSyncDialogActivity.this;
                a = verified;
                super();
            }
            });
            boolean flag;
            if (bundle == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                fop.a(this, new dnk("cellular-sync-dialog", ((Verified) (obj)).toString()));
            }
            return;
        } else
        {
            bundle = new android.view.View.OnClickListener() {

                private CellularSyncDialogActivity a;

                public final void onClick(View view)
                {
                    a.finish();
                }

            
            {
                a = CellularSyncDialogActivity.this;
                super();
            }
            };
            button.setOnClickListener(bundle);
            button1.setOnClickListener(bundle);
            return;
        }
    }

}
