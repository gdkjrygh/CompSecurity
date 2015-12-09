// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.networkoperatorpremiumactivation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import dmz;
import dvv;
import fop;
import fou;
import ggn;

public class PremiumActivationOptInDialog extends fou
{

    private View d;

    public PremiumActivationOptInDialog()
    {
        dmz.a(fop);
    }

    public static Intent a(Context context)
    {
        return new Intent(context, com/spotify/music/spotlets/networkoperatorpremiumactivation/PremiumActivationOptInDialog);
    }

    static void a(PremiumActivationOptInDialog premiumactivationoptindialog)
    {
        ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.H);
        fop.a(premiumactivationoptindialog, ViewUri.bL, clientevent);
        premiumactivationoptindialog.f();
    }

    private void f()
    {
        startService(dvv.a(this, "com.spotify.mobile.android.service.action.RESTART_APP"));
        finish();
    }

    public void onBackPressed()
    {
        ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.ak);
        fop.a(this, ViewUri.bL, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, clientevent);
        f();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030023);
        d = findViewById(0x7f1102b2);
        d.setOnClickListener(new android.view.View.OnClickListener() {

            private PremiumActivationOptInDialog a;

            public final void onClick(View view)
            {
                PremiumActivationOptInDialog.a(a);
            }

            
            {
                a = PremiumActivationOptInDialog.this;
                super();
            }
        });
        ((TextView)findViewById(0x7f1102b3)).setMovementMethod(LinkMovementMethod.getInstance());
        if (bundle == null)
        {
            bundle = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.R);
            fop.a(this, ViewUri.bL, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, bundle);
        }
        super.e = ggn.a(this, ViewUri.bL);
    }
}
