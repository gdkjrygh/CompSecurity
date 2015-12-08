// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.fragments;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.app.Fragment;
import com.fitbit.data.bl.dg;
import com.fitbit.mixpanel.f;
import com.fitbit.ui.r;
import com.fitbit.util.threading.c;

public abstract class FitbitFragment extends Fragment
{

    private final c a = new c() {

        final FitbitFragment a;

        public void a(Intent intent)
        {
            a.w_();
            a.K_();
        }

            
            {
                a = FitbitFragment.this;
                super();
            }
    };

    public FitbitFragment()
    {
    }

    protected void K_()
    {
    }

    public void onPause()
    {
        super.onPause();
        a.d();
        r.b(getActivity());
    }

    public void onResume()
    {
        super.onResume();
        a.a(new IntentFilter("com.fitbit.controllers.AlarmsController.ACTION_MIDNIGHT_COMES"));
        if (dg.d().e())
        {
            r.a(getActivity());
        }
        f.a(getActivity());
        f.b(getActivity());
    }

    protected void w_()
    {
    }
}
