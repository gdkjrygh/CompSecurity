// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.adapter;

import com.spotify.mobile.android.ui.fragments.logic.Flags;
import eop;
import fub;
import fys;

// Referenced classes of package com.spotify.mobile.android.ui.adapter:
//            SettingsAdapter

final class a
    implements fub
{

    private SettingsAdapter a;

    public final void a(boolean flag)
    {
        if (((Boolean)SettingsAdapter.a(a).a(fys.w)).booleanValue())
        {
            eop.a(SettingsAdapter.b(a), flag);
        }
    }

    (SettingsAdapter settingsadapter)
    {
        a = settingsadapter;
        super();
    }
}
