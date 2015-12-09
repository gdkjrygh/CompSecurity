// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.dialog;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.spotify.android.paste.widget.DialogLayout;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import dgp;
import dtx;
import fou;
import ggn;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class TrialStartedActivity extends fou
{

    private int d;
    private Runnable i;
    private Handler j;

    public TrialStartedActivity()
    {
        i = new Runnable() {

            private TrialStartedActivity a;

            public final void run()
            {
                ContentValues contentvalues = new ContentValues();
                contentvalues.put("should_show_trial_start_notice", Boolean.valueOf(false));
                a.getContentResolver().update(dtx.a, contentvalues, null, null);
            }

            
            {
                a = TrialStartedActivity.this;
                super();
            }
        };
        j = new Handler();
    }

    static void a(TrialStartedActivity trialstartedactivity)
    {
        trialstartedactivity.setResult(-1);
        trialstartedactivity.finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setResult(0);
        int k = getIntent().getIntExtra("trial_length", 0);
        d = getIntent().getIntExtra("trial_type", 0);
        if (k <= 0 && d <= 0)
        {
            Assertion.a("Trial length is <= 0. Can't display trial started dialog.");
            finish();
            return;
        }
        DialogLayout dialoglayout = new DialogLayout(this);
        setContentView(dialoglayout);
        dialoglayout.a(0x7f0805f2);
        LinearLayout linearlayout;
        Button button;
        if (d == 2)
        {
            bundle = getResources().getString(0x7f08059b);
        } else
        {
            k = (int)TimeUnit.SECONDS.toHours(k);
            int l = (int)TimeUnit.HOURS.toDays(k);
            int i1 = l / 30;
            if (i1 > 0)
            {
                bundle = getResources().getQuantityString(0x7f090029, i1, new Object[] {
                    Integer.valueOf(i1)
                });
            } else
            if (l >= 2)
            {
                bundle = getResources().getQuantityString(0x7f090027, l, new Object[] {
                    Integer.valueOf(l)
                });
            } else
            {
                bundle = getResources().getQuantityString(0x7f090028, k, new Object[] {
                    Integer.valueOf(k)
                });
            }
        }
        dialoglayout.b(bundle);
        if (getResources().getBoolean(0x7f0a0004))
        {
            dialoglayout.b(0x7f02021f);
        }
        linearlayout = new LinearLayout(this);
        k = getResources().getDimensionPixelOffset(0x7f0c0161);
        linearlayout.setPadding(k, k, k, k);
        button = dgp.c(this, linearlayout);
        bundle = getString(0x7f08059c);
        if (d == 2)
        {
            bundle = getString(0x7f080380);
        }
        button.setText(bundle.toUpperCase(Locale.getDefault()));
        button.setOnClickListener(new android.view.View.OnClickListener() {

            private TrialStartedActivity a;

            public final void onClick(View view)
            {
                TrialStartedActivity.a(a);
            }

            
            {
                a = TrialStartedActivity.this;
                super();
            }
        });
        linearlayout.addView(button, new android.widget.LinearLayout.LayoutParams(-1, -2));
        dialoglayout.a(linearlayout);
        super.e = ggn.a(this, ViewUri.aM);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        j.post(i);
    }
}
