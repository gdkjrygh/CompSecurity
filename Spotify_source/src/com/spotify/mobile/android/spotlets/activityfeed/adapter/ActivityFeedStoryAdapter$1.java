// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.activityfeed.adapter;

import com.spotify.mobile.android.spotlets.activityfeed.model.ResourceModel;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import fuj;
import fuo;
import fup;
import fuq;
import fur;
import fut;
import fuu;
import fuy;
import fuz;
import fvb;
import fvc;
import fve;
import fvt;
import fvu;
import fvv;
import fvw;
import fvy;
import fwv;
import fww;
import fwx;
import fwy;
import fwz;
import fxa;
import fxd;

// Referenced classes of package com.spotify.mobile.android.spotlets.activityfeed.adapter:
//            ActivityFeedStoryAdapter

final class a
    implements fuj
{

    private ActivityFeedStoryAdapter a;

    public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
    {
        obj = (ResourceModel)obj;
        switch (a[com.spotify.mobile.android.spotlets.activityfeed.model.(((ResourceModel) (obj)).getType()).()])
        {
        default:
            throw new AssertionError((new StringBuilder("Unexpected ResourceModel type ")).append(((ResourceModel) (obj)).getType()).toString());

        case 1: // '\001'
            fve.a(a.getContext()).b(((ResourceModel) (obj)).getUri(), ((ResourceModel) (obj)).getName()).a(ViewUri.q).a(true).a().b(false).a(ActivityFeedStoryAdapter.a(a)).a(spotifycontextmenu);
            return;

        case 2: // '\002'
            fve.a(a.getContext()).c(((ResourceModel) (obj)).getUri(), ((ResourceModel) (obj)).getName()).a(ViewUri.q).a(false).a(ActivityFeedStoryAdapter.a(a)).a(spotifycontextmenu);
            return;

        case 3: // '\003'
            fve.a(a.getContext()).d(((ResourceModel) (obj)).getUri(), ((ResourceModel) (obj)).getName()).a(ViewUri.q).a(false).a(false).a(ActivityFeedStoryAdapter.a(a)).a(spotifycontextmenu);
            return;

        case 4: // '\004'
            fve.a(a.getContext()).a(((ResourceModel) (obj)).getUri(), ((ResourceModel) (obj)).getName()).a(ViewUri.q).a(true).a(true).a(true).a(false, null).a(ActivityFeedStoryAdapter.a(a)).a(spotifycontextmenu);
            break;
        }
    }

    Y(ActivityFeedStoryAdapter activityfeedstoryadapter)
    {
        a = activityfeedstoryadapter;
        super();
    }
}
