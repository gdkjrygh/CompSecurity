// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.media.MediaPlayer;
import android.widget.Toast;

// Referenced classes of package kik.android.chat.fragment:
//            VideoTrimmingFragment

final class rz
    implements android.media.MediaPlayer.OnErrorListener
{

    final VideoTrimmingFragment a;

    rz(VideoTrimmingFragment videotrimmingfragment)
    {
        a = videotrimmingfragment;
        super();
    }

    public final boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        Toast.makeText(a.getActivity(), 0x7f0900e3, 0).show();
        return false;
    }
}
