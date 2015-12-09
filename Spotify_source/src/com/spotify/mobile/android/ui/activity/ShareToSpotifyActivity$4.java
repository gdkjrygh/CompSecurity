// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import dof;

// Referenced classes of package com.spotify.mobile.android.ui.activity:
//            ShareToSpotifyActivity

final class a
    implements android.widget.stener
{

    private ShareToSpotifyActivity a;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (view.getTag() instanceof dof)
        {
            adapterview = (dof)view.getTag();
            ShareToSpotifyActivity.a(a, adapterview.a());
            ShareToSpotifyActivity.a(a).setEnabled(true);
        }
    }

    (ShareToSpotifyActivity sharetospotifyactivity)
    {
        a = sharetospotifyactivity;
        super();
    }
}
