// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.media.MediaPlayer;
import android.view.ViewGroup;
import com.kik.cards.web.video.b;

// Referenced classes of package kik.android.chat.fragment:
//            WebVideoFragment

final class tr
    implements android.media.MediaPlayer.OnInfoListener
{

    final WebVideoFragment a;

    tr(WebVideoFragment webvideofragment)
    {
        a = webvideofragment;
        super();
    }

    public final boolean onInfo(MediaPlayer mediaplayer, int i, int j)
    {
        boolean flag = true;
        i;
        JVM INSTR tableswitch 701 702: default 28
    //                   701 34
    //                   702 60;
           goto _L1 _L2 _L3
_L1:
        flag = false;
_L5:
        return flag;
_L2:
        if (!WebVideoFragment.a(a).h()) goto _L5; else goto _L4
_L4:
        a._loadingLayout.setVisibility(0);
        return true;
_L3:
        a._loadingLayout.setVisibility(8);
        return true;
    }
}
