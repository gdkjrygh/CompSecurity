// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import android.app.Activity;
import android.preference.Preference;
import com.soundcloud.android.policies.DailyUpdateService;

// Referenced classes of package com.soundcloud.android.main:
//            DevDrawerFragment

class this._cls0
    implements android.preference.nceClickListener
{

    final DevDrawerFragment this$0;

    public boolean onPreferenceClick(Preference preference)
    {
        DailyUpdateService.start(getActivity().getApplicationContext());
        return true;
    }

    ce()
    {
        this$0 = DevDrawerFragment.this;
        super();
    }
}
