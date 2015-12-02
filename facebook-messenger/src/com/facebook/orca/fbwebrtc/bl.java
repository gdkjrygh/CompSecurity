// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import android.media.MediaPlayer;

// Referenced classes of package com.facebook.orca.fbwebrtc:
//            bb

class bl
    implements android.media.MediaPlayer.OnCompletionListener
{

    final bb a;

    bl(bb bb1)
    {
        a = bb1;
        super();
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        bb.d(a);
    }
}
