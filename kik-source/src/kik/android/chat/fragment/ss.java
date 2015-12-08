// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.media.MediaPlayer;
import kik.a.d.a.a;

// Referenced classes of package kik.android.chat.fragment:
//            ViewPictureFragment

final class ss
    implements android.media.MediaPlayer.OnCompletionListener
{

    final a a;
    final ViewPictureFragment b;

    ss(ViewPictureFragment viewpicturefragment, a a1)
    {
        b = viewpicturefragment;
        a = a1;
        super();
    }

    public final void onCompletion(MediaPlayer mediaplayer)
    {
        if (!a.z())
        {
            ViewPictureFragment.v(b);
        }
    }
}
