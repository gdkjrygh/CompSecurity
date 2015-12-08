// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;

import android.media.MediaPlayer;

// Referenced classes of package com.tremorvideo.sdk.android.richmedia:
//            ao, n

class ap
    implements android.media.MediaPlayer.OnCompletionListener
{

    final ao a;

    ap(ao ao1)
    {
        a = ao1;
        super();
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        a.f = a.g;
        if (a.c != null)
        {
            a.c.a(i.c.c);
        }
        ao.a(a, false);
    }
}
