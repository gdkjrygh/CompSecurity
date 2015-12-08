// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.github.rtyley.android.sherlock.roboguice.fragment.RoboSherlockFragment;
import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.Tracker;

// Referenced classes of package com.thetransitapp.droid:
//            TransitActivity

public abstract class BaseFragment extends RoboSherlockFragment
{

    private static int $SWITCH_TABLE$com$thetransitapp$droid$TransitActivity$TransitScreen[];
    private InputMethodManager inputManager;
    private TransitActivity.TransitScreen screen;
    private View view;

    static int[] $SWITCH_TABLE$com$thetransitapp$droid$TransitActivity$TransitScreen()
    {
        int ai[] = $SWITCH_TABLE$com$thetransitapp$droid$TransitActivity$TransitScreen;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[TransitActivity.TransitScreen.values().length];
        try
        {
            ai[TransitActivity.TransitScreen.ABOUT_SCREEN.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            ai[TransitActivity.TransitScreen.ITINERARY_SCREEN.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            ai[TransitActivity.TransitScreen.LEGAL_SCREEN.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            ai[TransitActivity.TransitScreen.LOCATION_SCREEN.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            ai[TransitActivity.TransitScreen.NEARBY_SCREEN.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            ai[TransitActivity.TransitScreen.OPTION_SCREEN.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai[TransitActivity.TransitScreen.ROUTING_SCREEN.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[TransitActivity.TransitScreen.ROUTING_SCREEN_DETAILS.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[TransitActivity.TransitScreen.SCHEDULE_SCREEN.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$com$thetransitapp$droid$TransitActivity$TransitScreen = ai;
        return ai;
    }

    public BaseFragment()
    {
    }

    public BaseFragment(TransitActivity.TransitScreen transitscreen)
    {
        screen = transitscreen;
    }

    public View createViewIfNeeded(LayoutInflater layoutinflater, ViewGroup viewgroup, int i)
    {
        if (view != null)
        {
            if (view.getParent() != null && (view.getParent() instanceof ViewGroup))
            {
                ((ViewGroup)view.getParent()).removeView(view);
            }
        } else
        {
            view = layoutinflater.inflate(i, viewgroup, false);
        }
        return view;
    }

    public void hideKeyboard()
    {
        if (inputManager != null && super.getView() != null)
        {
            inputManager.hideSoftInputFromWindow(getView().getWindowToken(), 0);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        int i;
        i = -1;
        if (screen == null)
        {
            return null;
        }
        $SWITCH_TABLE$com$thetransitapp$droid$TransitActivity$TransitScreen()[screen.ordinal()];
        JVM INSTR tableswitch 1 9: default 72
    //                   1 102
    //                   2 116
    //                   3 95
    //                   4 88
    //                   5 123
    //                   6 109
    //                   7 81
    //                   8 130
    //                   9 116;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L3
_L1:
        return createViewIfNeeded(layoutinflater, viewgroup, i);
_L8:
        i = 0x7f030029;
        continue; /* Loop/switch isn't completed */
_L5:
        i = 0x7f03002d;
        continue; /* Loop/switch isn't completed */
_L4:
        i = 0x7f03002c;
        continue; /* Loop/switch isn't completed */
_L2:
        i = 0x7f03002e;
        continue; /* Loop/switch isn't completed */
_L7:
        i = 0x7f03002f;
        continue; /* Loop/switch isn't completed */
_L3:
        i = 0x7f030030;
        continue; /* Loop/switch isn't completed */
_L6:
        i = 0x7f030031;
        continue; /* Loop/switch isn't completed */
_L9:
        i = 0x7f03002b;
        if (true) goto _L1; else goto _L10
_L10:
    }

    public void onResume()
    {
        super.onResume();
        if (screen != null && !((TransitActivity)super.getActivity()).isDebuggable())
        {
            EasyTracker.getTracker().sendView(screen.toString());
        }
        if (screen != null && screen != TransitActivity.TransitScreen.ROUTING_SCREEN)
        {
            hideKeyboard();
        }
    }

    public void onStart()
    {
        super.onStart();
        if (screen != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        ActionBar actionbar;
        int i;
        actionbar = getSherlockActivity().getSupportActionBar();
        i = -1;
        $SWITCH_TABLE$com$thetransitapp$droid$TransitActivity$TransitScreen()[screen.ordinal()];
        JVM INSTR tableswitch 3 8: default 72
    //                   3 98
    //                   4 104
    //                   5 110
    //                   6 116
    //                   7 122
    //                   8 128;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        if (i != -1)
        {
            actionbar.setNavigationMode(0);
            actionbar.setDisplayShowTitleEnabled(true);
            actionbar.setTitle(i);
            actionbar.setDisplayHomeAsUpEnabled(true);
            return;
        }
        break; /* Loop/switch isn't completed */
_L4:
        i = 0x7f0a0041;
        continue; /* Loop/switch isn't completed */
_L5:
        i = 0x7f0a0037;
        continue; /* Loop/switch isn't completed */
_L6:
        i = 0x7f0a0034;
        continue; /* Loop/switch isn't completed */
_L7:
        i = 0x7f0a0063;
        continue; /* Loop/switch isn't completed */
_L8:
        i = 0x7f0a0064;
        continue; /* Loop/switch isn't completed */
_L9:
        i = 0x7f0a008c;
        if (true) goto _L3; else goto _L10
_L10:
        actionbar.setNavigationMode(1);
        actionbar.setDisplayShowTitleEnabled(false);
        actionbar.setDisplayHomeAsUpEnabled(false);
        actionbar.setHomeButtonEnabled(false);
        if (actionbar.getNavigationItemCount() >= screen.ordinal())
        {
            actionbar.setSelectedNavigationItem(screen.ordinal());
            return;
        }
        if (true) goto _L1; else goto _L11
_L11:
    }

    public void showKeyboard(View view1)
    {
        inputManager.showSoftInput(view1, 2);
    }
}
