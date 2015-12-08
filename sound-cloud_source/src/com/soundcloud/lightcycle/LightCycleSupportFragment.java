// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.lightcycle;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package com.soundcloud.lightcycle:
//            LightCycleDispatcher, SupportFragmentLightCycleDispatcher, LightCycleBinder, SupportFragmentLightCycle

public abstract class LightCycleSupportFragment extends Fragment
    implements LightCycleDispatcher
{

    private boolean bound;
    private final SupportFragmentLightCycleDispatcher lifeCycleDispatcher = new SupportFragmentLightCycleDispatcher();

    public LightCycleSupportFragment()
    {
    }

    private void bindIfNecessary()
    {
        if (!bound)
        {
            LightCycleBinder.bind(this);
            bound = true;
        }
    }

    public void bind(SupportFragmentLightCycle supportfragmentlightcycle)
    {
        lifeCycleDispatcher.bind(supportfragmentlightcycle);
    }

    public volatile void bind(Object obj)
    {
        bind((SupportFragmentLightCycle)obj);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        bindIfNecessary();
        lifeCycleDispatcher.onAttach(this, activity);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        lifeCycleDispatcher.onCreate(this, bundle);
    }

    public void onDestroy()
    {
        lifeCycleDispatcher.onDestroy(this);
        super.onDestroy();
    }

    public void onDestroyView()
    {
        lifeCycleDispatcher.onDestroyView(this);
        super.onDestroyView();
    }

    public void onDetach()
    {
        lifeCycleDispatcher.onDetach(this);
        super.onDetach();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        return lifeCycleDispatcher.onOptionsItemSelected(this, menuitem);
    }

    public void onPause()
    {
        lifeCycleDispatcher.onPause(this);
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        lifeCycleDispatcher.onResume(this);
    }

    public void onStart()
    {
        super.onStart();
        lifeCycleDispatcher.onStart(this);
    }

    public void onStop()
    {
        lifeCycleDispatcher.onStop(this);
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        lifeCycleDispatcher.onViewCreated(this, view, bundle);
    }
}
