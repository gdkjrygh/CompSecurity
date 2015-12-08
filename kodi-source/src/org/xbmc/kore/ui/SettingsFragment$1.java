// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.app.Activity;
import android.preference.Preference;

// Referenced classes of package org.xbmc.kore.ui:
//            SettingsFragment, AboutDialogFragment

class this._cls0
    implements android.preference.enceClickListener
{

    final SettingsFragment this$0;

    public boolean onPreferenceClick(Preference preference)
    {
        (new AboutDialogFragment()).show(getActivity().getFragmentManager(), null);
        return true;
    }

    ()
    {
        this$0 = SettingsFragment.this;
        super();
    }
}
