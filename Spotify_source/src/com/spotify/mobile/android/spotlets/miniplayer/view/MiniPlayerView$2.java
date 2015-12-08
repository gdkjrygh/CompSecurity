// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.miniplayer.view;

import android.view.View;
import com.spotify.mobile.android.util.Assertion;
import eue;

// Referenced classes of package com.spotify.mobile.android.spotlets.miniplayer.view:
//            MiniPlayerView

final class a
    implements android.view.ner
{

    private MiniPlayerView a;

    public final void onClick(View view)
    {
        if (MiniPlayerView.b(a) == null)
        {
            return;
        }
        switch (view.getId())
        {
        default:
            Assertion.a((new StringBuilder("Unexpected view ID ")).append(view.getId()).toString());
            return;

        case 2131821721: 
            MiniPlayerView.b(a).c();
            return;

        case 2131821722: 
            MiniPlayerView.b(a).d();
            return;

        case 2131821286: 
            MiniPlayerView.b(a).e();
            return;

        case 2131821720: 
            MiniPlayerView.b(a).f();
            return;

        case 2131821713: 
            MiniPlayerView.b(a).f();
            return;

        case 2131821352: 
            MiniPlayerView.b(a).g();
            return;
        }
    }

    (MiniPlayerView miniplayerview)
    {
        a = miniplayerview;
        super();
    }
}
