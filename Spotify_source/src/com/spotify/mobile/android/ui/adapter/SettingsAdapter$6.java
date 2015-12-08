// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.spotify.mobile.android.ui.activity.DeleteCacheAndSettingsActivity;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import fop;

// Referenced classes of package com.spotify.mobile.android.ui.adapter:
//            SettingsAdapter

final class a
    implements android.view.er
{

    private SettingsAdapter a;

    public final void onClick(View view)
    {
        SettingsAdapter.c(a);
        fop.a(SettingsAdapter.b(a), ViewUri.H, new ClientEvent(com.spotify.mobile.android.util.a, com.spotify.mobile.android.util.nt.c));
        view = new Intent(SettingsAdapter.b(a), com/spotify/mobile/android/ui/activity/DeleteCacheAndSettingsActivity);
        view.addFlags(0x40000000);
        view.addFlags(0x10000);
        SettingsAdapter.b(a).startActivity(view);
    }

    tingsActivity(SettingsAdapter settingsadapter)
    {
        a = settingsadapter;
        super();
    }
}
