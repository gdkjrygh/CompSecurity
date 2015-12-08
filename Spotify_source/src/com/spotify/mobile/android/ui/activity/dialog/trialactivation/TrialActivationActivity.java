// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.dialog.trialactivation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import dmz;
import dvv;
import edb;
import edd;
import fop;
import fou;
import fpp;
import fpq;
import fpr;
import ggc;
import java.lang.ref.WeakReference;

public class TrialActivationActivity extends fou
    implements fpr
{

    private fpq d;

    public TrialActivationActivity()
    {
    }

    static fpq a(TrialActivationActivity trialactivationactivity)
    {
        return trialactivationactivity.d;
    }

    public final void f()
    {
        finish();
    }

    public final void g()
    {
        dmz.a(ggc);
        ggc.a(this, 0x7f080594, 1, new Object[0]);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030035);
        findViewById(0x7f1102dc).setOnClickListener(new android.view.View.OnClickListener() {

            private TrialActivationActivity a;

            public final void onClick(View view)
            {
                view = TrialActivationActivity.a(a);
                Context context = (Context)((fpq) (view)).a.a.get();
                if (context != null)
                {
                    ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.dQ);
                    dmz.a(fop);
                    fop.a(context, ViewUri.aP, clientevent);
                }
                view.c();
            }

            
            {
                a = TrialActivationActivity.this;
                super();
            }
        });
        dmz.a(edd);
        edb edb1 = edd.a(this);
        fpp fpp1 = new fpp(this);
        boolean flag;
        if (bundle == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = new fpq(fpp1, this, edb1, flag);
    }

    protected void onPause()
    {
        super.onPause();
        d.b();
    }

    protected void onResume()
    {
        super.onResume();
        fpq fpq1 = d;
        if (getIntent().getBooleanExtra("activate_trial_extra", true))
        {
            Context context = (Context)fpq1.a.a.get();
            if (context != null)
            {
                Intent intent = dvv.a(context, "com.spotify.mobile.android.service.action.optintrial.START");
                intent.putExtra("restart_app_opt_in_trial_activation", false);
                context.startService(intent);
            }
            fpq1.d = System.currentTimeMillis();
            fpq1.e.postDelayed(fpq1.f, fpq.c);
        }
    }

    protected void onStart()
    {
        super.onStart();
        fpq fpq1 = d;
        fpq1.b.a();
        fpq1.b.a(fpq1);
    }

    protected void onStop()
    {
        super.onStop();
        d.a();
    }
}
