// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.media.MediaPlayer;

// Referenced classes of package kik.android.widget:
//            WebVideoView, VideoController, ev

final class eu
    implements android.media.MediaPlayer.OnErrorListener
{

    final WebVideoView a;

    eu(WebVideoView webvideoview)
    {
        a = webvideoview;
        super();
    }

    public final boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        WebVideoView.c(a, -1);
        WebVideoView.d(a, -1);
        if (WebVideoView.h(a) != null)
        {
            WebVideoView.h(a).c();
        }
        while (WebVideoView.j(a) != null && WebVideoView.j(a).onError(WebVideoView.g(a), i, j) || a.getWindowToken() == null) 
        {
            return true;
        }
        WebVideoView.k(a).getResources();
        if (i == 200)
        {
            i = 0x1040015;
        } else
        {
            i = 0x1040011;
        }
        (new android.app.AlertDialog.Builder(WebVideoView.k(a))).setTitle(0x1040012).setMessage(i).setPositiveButton(0x1040010, new ev(this)).setCancelable(false).show();
        return true;
    }
}
