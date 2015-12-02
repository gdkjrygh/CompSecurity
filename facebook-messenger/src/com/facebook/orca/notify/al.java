// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;

import android.media.MediaPlayer;

// Referenced classes of package com.facebook.orca.notify:
//            ak

class al
    implements android.media.MediaPlayer.OnCompletionListener
{

    final ak a;

    al(ak ak)
    {
        a = ak;
        super();
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        mediaplayer.release();
    }
}
