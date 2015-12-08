// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.analytics.OriginProvider;
import com.soundcloud.android.main.Screen;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistEngagementsPresenter

class this._cls0
    implements OriginProvider
{

    final PlaylistEngagementsPresenter this$0;

    public String getScreenTag()
    {
        return Screen.UNKNOWN.get();
    }

    ()
    {
        this$0 = PlaylistEngagementsPresenter.this;
        super();
    }
}
