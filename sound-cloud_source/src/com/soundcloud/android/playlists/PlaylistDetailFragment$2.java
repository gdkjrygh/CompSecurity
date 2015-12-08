// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import android.view.View;
import com.soundcloud.android.Navigator;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistDetailFragment, PlaylistWithTracks

class this._cls0
    implements android.view.istDetailFragment._cls2
{

    final PlaylistDetailFragment this$0;

    public void onClick(View view)
    {
        navigator.openProfile(getActivity(), PlaylistDetailFragment.access$100(PlaylistDetailFragment.this).getCreatorUrn());
    }

    ()
    {
        this$0 = PlaylistDetailFragment.this;
        super();
    }
}
