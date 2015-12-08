// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.media.MediaPlayer;

// Referenced classes of package com.kik.view.adapters:
//            al, ak

final class am
    implements android.media.MediaPlayer.OnPreparedListener
{

    final al a;

    am(al al1)
    {
        a = al1;
        super();
    }

    public final void onPrepared(MediaPlayer mediaplayer)
    {
        if (ak.e(a.e))
        {
            if (a.c != null && mediaplayer != null)
            {
                a.c.onPrepared(mediaplayer);
            }
            ak.c(a.e).start();
        }
        ak.f(a.e);
    }
}
