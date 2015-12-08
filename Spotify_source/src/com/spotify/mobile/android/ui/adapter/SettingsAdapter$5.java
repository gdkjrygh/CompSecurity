// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import fop;

// Referenced classes of package com.spotify.mobile.android.ui.adapter:
//            SettingsAdapter

final class b
    implements android.view.er
{

    private com.spotify.mobile.android.util.nt a;
    private Intent b;
    private SettingsAdapter c;

    public final void onClick(View view)
    {
        if (a != null)
        {
            view = new ClientEvent(com.spotify.mobile.android.util.O, a);
            SettingsAdapter.c(c);
            fop.a(SettingsAdapter.b(c), ViewUri.H, view);
        }
        SettingsAdapter.b(c).startActivity(b);
    }

    (SettingsAdapter settingsadapter, com.spotify.mobile.android.util.nt nt, Intent intent)
    {
        c = settingsadapter;
        a = nt;
        b = intent;
        super();
    }
}
