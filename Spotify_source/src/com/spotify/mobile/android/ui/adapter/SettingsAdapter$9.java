// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.adapter;

import android.view.View;
import com.spotify.mobile.android.arsenal.ArsenalActivity;
import com.spotify.mobile.android.arsenal.FeedbackMode;

// Referenced classes of package com.spotify.mobile.android.ui.adapter:
//            SettingsAdapter

final class a
    implements android.view.er
{

    private SettingsAdapter a;

    public final void onClick(View view)
    {
        ArsenalActivity.a(SettingsAdapter.b(a), FeedbackMode.a);
    }

    (SettingsAdapter settingsadapter)
    {
        a = settingsadapter;
        super();
    }
}
