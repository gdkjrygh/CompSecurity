// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.media.MediaPlayer;
import com.kik.l.ab;
import kik.a.d.a.a;

// Referenced classes of package kik.android.chat.fragment:
//            ViewPictureFragment

final class sp
    implements android.media.MediaPlayer.OnErrorListener
{

    final a a;
    final ViewPictureFragment b;

    sp(ViewPictureFragment viewpicturefragment, a a1)
    {
        b = viewpicturefragment;
        a = a1;
        super();
    }

    public final boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        b.j.d(a.o());
        ViewPictureFragment.h(b);
        return false;
    }
}
