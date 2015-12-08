// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.settings;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import com.netflix.mediaclient.android.activity.FragmentHostActivity;

// Referenced classes of package com.netflix.mediaclient.ui.settings:
//            SettingsFragment

public class SettingsActivity extends FragmentHostActivity
{

    public SettingsActivity()
    {
    }

    public static Intent createStartIntent(Activity activity)
    {
        return new Intent(activity, com/netflix/mediaclient/ui/settings/SettingsActivity);
    }

    protected Fragment createPrimaryFrag()
    {
        return SettingsFragment.create();
    }

    protected int getContentLayoutId()
    {
        return 0x7f03002e;
    }

    public com.netflix.mediaclient.servicemgr.IClientLogging.ModalView getUiScreen()
    {
        return com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.settings;
    }

    protected boolean showMdxInMenu()
    {
        return false;
    }

    protected boolean showSettingsInMenu()
    {
        return false;
    }
}
