// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.adapter;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.View;

// Referenced classes of package com.spotify.mobile.android.ui.adapter:
//            SettingsAdapter

final class a
    implements android.view.r
{

    private SettingsAdapter a;

    public final void onClick(View view)
    {
        if (!ActivityManager.isUserAMonkey())
        {
            view = new Intent();
            view.setComponent(new ComponentName(SettingsAdapter.b(a), "com.spotify.mobile.android.spotlets.debugtools.DebugMenuActivity"));
            SettingsAdapter.b(a).startActivity(view);
        }
    }

    (SettingsAdapter settingsadapter)
    {
        a = settingsadapter;
        super();
    }
}
