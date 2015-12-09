// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.dialog;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.spotify.android.paste.widget.DialogLayout;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientInfo;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import dmz;
import dtx;
import fop;
import fou;
import fyw;
import ggn;

public class TrialReminderActivity extends fou
{

    private int d;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private DialogLayout m;
    private Verified n;
    private Flags o;

    public TrialReminderActivity()
    {
        n = ViewUri.aC;
    }

    static void a(TrialReminderActivity trialreminderactivity)
    {
        ContentValues contentvalues = new ContentValues();
        if (trialreminderactivity.d == 0)
        {
            contentvalues.put("should_show_trial_start_notice", Boolean.valueOf(false));
        } else
        if (trialreminderactivity.d == 1)
        {
            contentvalues.put("should_show_trial_end_notice", Boolean.valueOf(false));
        } else
        {
            Assertion.a("Should not be able to end up with a dialog that does not match TRIAL_STARTED or TRIAL_ENDED");
            return;
        }
        trialreminderactivity.getContentResolver().update(dtx.a, contentvalues, null, null);
    }

    static Verified b(TrialReminderActivity trialreminderactivity)
    {
        return trialreminderactivity.n;
    }

    static Flags c(TrialReminderActivity trialreminderactivity)
    {
        return trialreminderactivity.o;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setResult(0);
        Intent intent = getIntent();
        o = fyw.a(this);
        i = intent.getIntExtra("trial_remaining", -1);
        j = intent.getIntExtra("trial_length", 0);
        k = intent.getBooleanExtra("shuffle_streaming", false);
        l = intent.getBooleanExtra("streaming", false);
        if (bundle != null)
        {
            bundle.setClassLoader(getClassLoader());
            i = bundle.getInt("trial_remaining", -1);
            j = bundle.getInt("trial_length", 0);
            k = bundle.getBoolean("shuffle_streaming");
            l = bundle.getBoolean("streaming");
        }
        m = new DialogLayout(this);
        setContentView(m);
        int i1 = 0x7f08059e;
        m.a(0x7f08061c);
        if (j > 0)
        {
            d = 0;
            int j1 = j / 3600;
            int k1 = j1 / 24;
            if ((long)k1 > 30L)
            {
                j1 = k1 / 30;
                bundle = getResources().getQuantityString(0x7f090026, j1, new Object[] {
                    Integer.valueOf(j1)
                });
            } else
            if (j1 > 48)
            {
                bundle = getResources().getQuantityString(0x7f090024, k1, new Object[] {
                    Integer.valueOf(k1)
                });
            } else
            {
                bundle = getResources().getQuantityString(0x7f090025, j1, new Object[] {
                    Integer.valueOf(j1)
                });
            }
        } else
        if (i == 0)
        {
            d = 1;
            bundle = m;
            if (((ClientInfo)dmz.a(com/spotify/mobile/android/util/ClientInfo)).a())
            {
                bundle.a(0x7f0805e5, new android.view.View.OnClickListener() {

                    private TrialReminderActivity a;

                    public final void onClick(View view)
                    {
                        dmz.a(fop);
                        fop.a(a, null, TrialReminderActivity.b(a), com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, null, TrialReminderActivity.c(a));
                        TrialReminderActivity.a(a);
                        a.finish();
                    }

            
            {
                a = TrialReminderActivity.this;
                super();
            }
                });
            }
            if (k)
            {
                n = ViewUri.aD;
                bundle = getString(0x7f080598);
                m.a(getString(0x7f08059a));
                i1 = 0x7f080599;
                m.b(0x7f02021d);
            } else
            if (l)
            {
                bundle = getString(0x7f080597);
            } else
            {
                bundle = getString(0x7f080596);
            }
        } else
        {
            Assertion.a((new StringBuilder("Should not end up here, timeToTrialEnd==")).append(i).append(" , totalTimeOfTrial==").append(j).toString());
            finish();
            return;
        }
        if (bundle != null)
        {
            m.b(bundle);
        }
        m.b(i1, new android.view.View.OnClickListener() {

            private TrialReminderActivity a;

            public final void onClick(View view)
            {
                TrialReminderActivity.a(a);
                a.setResult(-1);
                a.finish();
            }

            
            {
                a = TrialReminderActivity.this;
                super();
            }
        });
        super.e = ggn.a(this, n);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putInt("trial_remaining", i);
        bundle.putInt("trial_length", j);
        bundle.putBoolean("shuffle_streaming", k);
        bundle.putBoolean("streaming", l);
    }
}
