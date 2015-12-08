// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.media.MediaPlayer;

// Referenced classes of package com.kik.view.adapters:
//            al, ak

final class an
    implements android.media.MediaPlayer.OnCompletionListener
{

    final al a;

    an(al al1)
    {
        a = al1;
        super();
    }

    public final void onCompletion(MediaPlayer mediaplayer)
    {
        if (!ak.d(a.e))
        {
            a.e.c();
            if (a.d != null)
            {
                a.d.onCompletion(mediaplayer);
            }
        }
    }
}
