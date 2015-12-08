// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.service;

import android.media.MediaPlayer;
import android.util.Log;
import com.arist.MusicPlayer.MyApplication;

// Referenced classes of package com.arist.service:
//            MusicPlayService

class this._cls0
    implements android.media.etionListener
{

    final MusicPlayService this$0;

    public void onCompletion(MediaPlayer mediaplayer)
    {
        MusicPlayService.access$11(MusicPlayService.this, true);
        Log.i("info", (new StringBuilder("MusicPlayService next")).append(MyApplication.getCurrentPosition()).toString());
        MusicPlayService.access$0(MusicPlayService.this);
    }

    nListener()
    {
        this$0 = MusicPlayService.this;
        super();
    }
}
