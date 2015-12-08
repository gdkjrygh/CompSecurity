// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.player;

import android.util.Pair;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import faa;
import fuj;

// Referenced classes of package com.spotify.mobile.android.spotlets.player:
//            NewPlayQueueActivity

public final class a
    implements fuj
{

    private NewPlayQueueActivity a;

    public final volatile void a(SpotifyContextMenu spotifycontextmenu, Object obj)
    {
        obj = (Pair)obj;
        NewPlayQueueActivity.a(a).a(spotifycontextmenu, ((Pair) (obj)));
    }

    tMenu(NewPlayQueueActivity newplayqueueactivity)
    {
        a = newplayqueueactivity;
        super();
    }
}
