// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.you;

import android.preference.Preference;
import com.soundcloud.android.settings.ClearCacheDialog;

// Referenced classes of package com.soundcloud.android.you:
//            BasicSettingsFragment

class this._cls0
    implements android.preference.lickListener
{

    final BasicSettingsFragment this$0;

    public boolean onPreferenceClick(Preference preference)
    {
        ClearCacheDialog.show(getFragmentManager());
        return true;
    }

    ener()
    {
        this$0 = BasicSettingsFragment.this;
        super();
    }
}
