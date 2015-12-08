// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.media.MediaPlayer;

// Referenced classes of package com.skype.android.media:
//            LoopbackActivity

final class a
    implements android.media.redListener
{

    final LoopbackActivity a;

    public final void onPrepared(MediaPlayer mediaplayer)
    {
        mediaplayer.start();
    }

    r(LoopbackActivity loopbackactivity)
    {
        a = loopbackactivity;
        super();
    }
}
