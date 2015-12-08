// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.content.Intent;

// Referenced classes of package com.skype.android.app.settings:
//            SettingsFragment, ManageAliasesActivity

final class this._cls0
    implements Runnable
{

    final SettingsFragment this$0;

    public final void run()
    {
        startActivity(new Intent(getActivity(), com/skype/android/app/settings/ManageAliasesActivity));
    }

    y()
    {
        this$0 = SettingsFragment.this;
        super();
    }
}
