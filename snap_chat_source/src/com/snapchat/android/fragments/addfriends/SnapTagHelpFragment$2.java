// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import android.media.MediaPlayer;
import com.snapchat.android.ui.TextureVideoView;

// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            SnapTagHelpFragment

final class a
    implements android.media.Listener
{

    private SnapTagHelpFragment a;

    public final void onPrepared(MediaPlayer mediaplayer)
    {
        SnapTagHelpFragment.a(a).setLooping(true);
    }

    (SnapTagHelpFragment snaptaghelpfragment)
    {
        a = snaptaghelpfragment;
        super();
    }
}
