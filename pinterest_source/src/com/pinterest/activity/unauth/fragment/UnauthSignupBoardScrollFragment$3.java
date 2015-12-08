// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.unauth.fragment;

import android.os.Bundle;
import com.pinterest.activity.FragmentHelper;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.events.OverrideNavigationEvent;

// Referenced classes of package com.pinterest.activity.unauth.fragment:
//            UnauthSignupPinFragment, UnauthSignupBoardScrollFragment

class this._cls0
    implements com.pinterest.base.ardScrollFragment._cls3
{

    final UnauthSignupBoardScrollFragment this$0;

    public void onEventMainThread(OverrideNavigationEvent overridenavigationevent)
    {
        if (overridenavigationevent.a() != 2)
        {
            return;
        } else
        {
            Object obj = overridenavigationevent.b();
            overridenavigationevent = new Bundle();
            overridenavigationevent.putString("com.pinterest.EXTRA_PIN_ID", ((String) (obj)));
            obj = new UnauthSignupPinFragment();
            ((BaseFragment) (obj)).setArguments(overridenavigationevent);
            FragmentHelper.replaceFragment(getActivity(), ((android.support.v4.app.Fragment) (obj)), true);
            return;
        }
    }

    ()
    {
        this$0 = UnauthSignupBoardScrollFragment.this;
        super();
    }
}
