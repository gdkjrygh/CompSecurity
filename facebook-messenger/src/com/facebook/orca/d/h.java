// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import android.media.MediaPlayer;

// Referenced classes of package com.facebook.orca.d:
//            e, k

class h
    implements android.media.MediaPlayer.OnErrorListener
{

    final e a;

    h(e e1)
    {
        a = e1;
        super();
    }

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        e.b(a);
        e.a(a, k.PLAYBACK_ERROR);
        return true;
    }
}
