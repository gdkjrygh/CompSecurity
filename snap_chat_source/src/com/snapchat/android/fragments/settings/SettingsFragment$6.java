// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import Mf;
import Oi;
import android.os.Bundle;
import android.view.View;
import com.snapchat.android.fragments.addfriends.LeftSwipeContentFragment;
import com.squareup.otto.Bus;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            SettingsFragment

final class a
    implements android.view.r
{

    private SettingsFragment a;

    public final void onClick(View view)
    {
        view = new Bundle();
        view.putString("url", "https://www.snapchat.com/licenses/android");
        view.putString("page_title", a.getString(0x7f080281));
        Mf.a().a(new Oi(LeftSwipeContentFragment.WEB_FRAGMENT, view));
    }

    ragment(SettingsFragment settingsfragment)
    {
        a = settingsfragment;
        super();
    }
}
