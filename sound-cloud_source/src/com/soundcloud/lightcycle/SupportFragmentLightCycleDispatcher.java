// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.lightcycle;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.MenuItem;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.soundcloud.lightcycle:
//            LightCycleDispatcher, SupportFragmentLightCycle

public class SupportFragmentLightCycleDispatcher
    implements LightCycleDispatcher, SupportFragmentLightCycle
{

    private final Set fragmentLightCycles = new HashSet();

    public SupportFragmentLightCycleDispatcher()
    {
    }

    public void bind(SupportFragmentLightCycle supportfragmentlightcycle)
    {
        fragmentLightCycles.add(supportfragmentlightcycle);
    }

    public volatile void bind(Object obj)
    {
        bind((SupportFragmentLightCycle)obj);
    }

    public void onAttach(Fragment fragment, Activity activity)
    {
        for (Iterator iterator = fragmentLightCycles.iterator(); iterator.hasNext(); ((SupportFragmentLightCycle)iterator.next()).onAttach(fragment, activity)) { }
    }

    public void onCreate(Fragment fragment, Bundle bundle)
    {
        for (Iterator iterator = fragmentLightCycles.iterator(); iterator.hasNext(); ((SupportFragmentLightCycle)iterator.next()).onCreate(fragment, bundle)) { }
    }

    public void onDestroy(Fragment fragment)
    {
        for (Iterator iterator = fragmentLightCycles.iterator(); iterator.hasNext(); ((SupportFragmentLightCycle)iterator.next()).onDestroy(fragment)) { }
    }

    public void onDestroyView(Fragment fragment)
    {
        for (Iterator iterator = fragmentLightCycles.iterator(); iterator.hasNext(); ((SupportFragmentLightCycle)iterator.next()).onDestroyView(fragment)) { }
    }

    public void onDetach(Fragment fragment)
    {
        for (Iterator iterator = fragmentLightCycles.iterator(); iterator.hasNext(); ((SupportFragmentLightCycle)iterator.next()).onDetach(fragment)) { }
    }

    public boolean onOptionsItemSelected(Fragment fragment, MenuItem menuitem)
    {
        for (Iterator iterator = fragmentLightCycles.iterator(); iterator.hasNext();)
        {
            if (((SupportFragmentLightCycle)iterator.next()).onOptionsItemSelected(fragment, menuitem))
            {
                return true;
            }
        }

        return false;
    }

    public void onPause(Fragment fragment)
    {
        for (Iterator iterator = fragmentLightCycles.iterator(); iterator.hasNext(); ((SupportFragmentLightCycle)iterator.next()).onPause(fragment)) { }
    }

    public void onRestoreInstanceState(Fragment fragment, Bundle bundle)
    {
        for (Iterator iterator = fragmentLightCycles.iterator(); iterator.hasNext(); ((SupportFragmentLightCycle)iterator.next()).onRestoreInstanceState(fragment, bundle)) { }
    }

    public void onResume(Fragment fragment)
    {
        for (Iterator iterator = fragmentLightCycles.iterator(); iterator.hasNext(); ((SupportFragmentLightCycle)iterator.next()).onResume(fragment)) { }
    }

    public void onSaveInstanceState(Fragment fragment, Bundle bundle)
    {
        for (Iterator iterator = fragmentLightCycles.iterator(); iterator.hasNext(); ((SupportFragmentLightCycle)iterator.next()).onSaveInstanceState(fragment, bundle)) { }
    }

    public void onStart(Fragment fragment)
    {
        for (Iterator iterator = fragmentLightCycles.iterator(); iterator.hasNext(); ((SupportFragmentLightCycle)iterator.next()).onStart(fragment)) { }
    }

    public void onStop(Fragment fragment)
    {
        for (Iterator iterator = fragmentLightCycles.iterator(); iterator.hasNext(); ((SupportFragmentLightCycle)iterator.next()).onStop(fragment)) { }
    }

    public void onViewCreated(Fragment fragment, View view, Bundle bundle)
    {
        for (Iterator iterator = fragmentLightCycles.iterator(); iterator.hasNext(); ((SupportFragmentLightCycle)iterator.next()).onViewCreated(fragment, view, bundle)) { }
    }
}
