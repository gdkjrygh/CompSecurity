// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.media.MediaPlayer;
import com.kik.l.ab;
import kik.a.d.a.a;

// Referenced classes of package com.kik.view.adapters:
//            al, ak

final class ao
    implements android.media.MediaPlayer.OnErrorListener
{

    final al a;

    ao(al al1)
    {
        a = al1;
        super();
    }

    public final boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        if (ak.g(a.e) != null)
        {
            ak.h(a.e).d(ak.g(a.e).o());
        }
        a.e.c();
        if (a.a != null)
        {
            a.a.onError(mediaplayer, i, j);
        }
        return false;
    }
}
