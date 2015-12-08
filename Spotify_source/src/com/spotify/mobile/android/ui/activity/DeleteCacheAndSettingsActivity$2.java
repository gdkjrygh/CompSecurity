// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.content.Intent;
import android.view.View;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import fop;

// Referenced classes of package com.spotify.mobile.android.ui.activity:
//            DeleteCacheAndSettingsActivity, DeleteCacheAndSettingsConfirmationActivity

final class a
    implements android.view.acheAndSettingsActivity._cls2
{

    private DeleteCacheAndSettingsActivity a;

    public final void onClick(View view)
    {
        fop.a(a, ViewUri.bg, new ClientEvent(com.spotify.mobile.android.util.vity._cls2.a));
        view = new Intent(a, com/spotify/mobile/android/ui/activity/DeleteCacheAndSettingsConfirmationActivity);
        view.addFlags(0x40000000);
        view.addFlags(0x10000);
        a.startActivity(view);
        a.finish();
        a.overridePendingTransition(0, 0);
    }

    nActivity(DeleteCacheAndSettingsActivity deletecacheandsettingsactivity)
    {
        a = deletecacheandsettingsactivity;
        super();
    }
}
