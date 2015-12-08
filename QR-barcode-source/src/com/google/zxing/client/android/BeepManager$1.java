// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;

import android.media.MediaPlayer;

// Referenced classes of package com.google.zxing.client.android:
//            BeepManager

class 
    implements android.media.CompletionListener
{

    public void onCompletion(MediaPlayer mediaplayer)
    {
        mediaplayer.seekTo(0);
    }

    ()
    {
    }
}
