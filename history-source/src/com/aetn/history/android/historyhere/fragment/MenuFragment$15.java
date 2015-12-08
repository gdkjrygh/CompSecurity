// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.support.v4.app.FragmentActivity;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.aetn.history.android.historyhere.HistoryHereApplication;
import com.aetn.history.android.historyhere.model.Configuration;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            MenuFragment

class this._cls0
    implements android.view.animation.ionListener
{

    final MenuFragment this$0;

    public void onAnimationEnd(Animation animation)
    {
        MenuFragment.access$1800(MenuFragment.this).setVisibility(8);
        animation = (HistoryHereApplication)getActivity().getApplication();
        if (HistoryHereApplication.getConfiguration().sponsorImageURL != null)
        {
            MenuFragment.access$1900(MenuFragment.this);
            return;
        }
        try
        {
            MenuFragment.access$1500(MenuFragment.this);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Animation animation)
        {
            animation.printStackTrace();
        }
        return;
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    ()
    {
        this$0 = MenuFragment.this;
        super();
    }
}
