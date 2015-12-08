// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.activitylog;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.NavUtils;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.fitbit.FitBitApplication;
import com.fitbit.analytics.google.ga.AnalyticsContainer;
import com.fitbit.analytics.google.ga.d;
import com.fitbit.data.bl.ActivityBusinessLogic;
import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.savedstate.ActivityLoggingState;
import com.fitbit.ui.fragments.FitbitFragment;
import com.fitbit.ui.s;
import com.fitbit.util.bf;

// Referenced classes of package com.fitbit.activity.ui.activitylog:
//            ActivityLogFormFragment

public class LogNewExerciseFragment extends FitbitFragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, android.view.View.OnClickListener
{
    private static class a extends bf
    {

        private final ActivityLogEntry a;

        protected ActivityLogEntry a()
        {
            ActivityBusinessLogic.a().a(a, getContext());
            return a;
        }

        protected Object f_()
        {
            return a();
        }

        public a(Context context, ActivityLogEntry activitylogentry)
        {
            super(context);
            a = activitylogentry;
        }
    }


    private static final String c = "Log Manual Exercise";
    private Button a;
    private ActivityLogEntry b;

    public LogNewExerciseFragment()
    {
    }

    public void a(Loader loader, ActivityLogEntry activitylogentry)
    {
        ActivityLoggingState.a(com.fitbit.savedstate.ActivityLoggingState.LoggingType.a);
        NavUtils.navigateUpFromSameTask(getActivity());
    }

    public void onClick(View view)
    {
        view = (ActivityLogFormFragment)getChildFragmentManager().findFragmentById(0x7f110009);
        try
        {
            ActivityLogEntry activitylogentry = new ActivityLogEntry();
            view.a(activitylogentry);
            b = activitylogentry;
            getLoaderManager().restartLoader(0x7f110094, getArguments(), this);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            s.a(getActivity(), view.getMessage(), 0).i();
        }
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        return new a(getActivity(), b);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f040092, viewgroup, false);
        a = (Button)layoutinflater.findViewById(0x7f1101da);
        a.setOnClickListener(this);
        return layoutinflater;
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (ActivityLogEntry)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public void onResume()
    {
        super.onResume();
        FitBitApplication.a().c().a(0x7f11000a).a("Log Manual Exercise");
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        getChildFragmentManager().beginTransaction().replace(0x7f110009, new ActivityLogFormFragment()).commit();
    }
}
