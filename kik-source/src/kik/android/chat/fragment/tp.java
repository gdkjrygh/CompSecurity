// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.media.MediaPlayer;
import com.kik.cards.web.video.b;

// Referenced classes of package kik.android.chat.fragment:
//            WebVideoFragment

final class tp
    implements android.media.MediaPlayer.OnCompletionListener
{

    final WebVideoFragment a;

    tp(WebVideoFragment webvideofragment)
    {
        a = webvideofragment;
        super();
    }

    public final void onCompletion(MediaPlayer mediaplayer)
    {
        WebVideoFragment.a(a).t();
        a.J();
        kik.android.chat.fragment.WebVideoFragment.b(a);
    }
}
