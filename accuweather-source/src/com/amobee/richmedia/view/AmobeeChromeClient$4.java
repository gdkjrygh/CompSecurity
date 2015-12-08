// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.view;

import android.media.MediaPlayer;
import com.amobee.adsdk.Log;

// Referenced classes of package com.amobee.richmedia.view:
//            AmobeeChromeClient, AmobeeView

class val.ormma
    implements android.media.ionListener
{

    final AmobeeChromeClient this$0;
    private final AmobeeView val$ormma;

    public void onCompletion(MediaPlayer mediaplayer)
    {
        mediaplayer.stop();
        onHideCustomView();
        closeVideo(videoCloseButton, val$ormma);
        Log.d("Amobee Video", "onCompletion");
    }

    ()
    {
        this$0 = final_amobeechromeclient;
        val$ormma = AmobeeView.this;
        super();
    }
}
