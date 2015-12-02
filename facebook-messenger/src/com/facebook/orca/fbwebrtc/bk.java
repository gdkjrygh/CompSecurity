// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import android.media.MediaPlayer;

// Referenced classes of package com.facebook.orca.fbwebrtc:
//            bb

class bk
    implements android.media.MediaPlayer.OnErrorListener
{

    final bb a;

    bk(bb bb1)
    {
        a = bb1;
        super();
    }

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        bb.d(a);
        return true;
    }
}
