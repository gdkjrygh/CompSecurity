// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.speechkit.speech;

import android.media.MediaPlayer;
import com.admarvel.android.ads.AdMarvelInternalWebView;

// Referenced classes of package com.admarvel.speechkit.speech:
//            AudioPlayer

class this._cls0
    implements android.media.ErrorListener
{

    final AudioPlayer this$0;

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        if (AudioPlayer.access$3(AudioPlayer.this) != null && AudioPlayer.access$3(AudioPlayer.this).audioCompletedCallback != null && AudioPlayer.access$3(AudioPlayer.this).audioCompletedCallback.length() > 0)
        {
            mediaplayer = (new StringBuilder("window.")).append(AudioPlayer.access$3(AudioPlayer.this).audioCompletedCallback).append("();").toString();
            AudioPlayer.access$3(AudioPlayer.this).injectJavaScript(mediaplayer);
        }
        return true;
    }

    View()
    {
        this$0 = AudioPlayer.this;
        super();
    }
}
