// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.speechkit.speech;

import android.media.MediaPlayer;
import android.os.Handler;
import android.widget.MediaController;
import com.admarvel.android.ads.AdMarvelInternalWebView;

// Referenced classes of package com.admarvel.speechkit.speech:
//            AudioPlayer

class this._cls0
    implements android.media.CompletionListener
{

    final AudioPlayer this$0;

    public void onCompletion(MediaPlayer mediaplayer)
    {
        AudioPlayer.access$4(AudioPlayer.this).removeCallbacks(AudioPlayer.access$5(AudioPlayer.this));
        if (AudioPlayer.access$3(AudioPlayer.this) != null && AudioPlayer.access$3(AudioPlayer.this).audioCompletedCallback != null && AudioPlayer.access$3(AudioPlayer.this).audioCompletedCallback.length() > 0)
        {
            String s = (new StringBuilder("window.")).append(AudioPlayer.access$3(AudioPlayer.this).audioCompletedCallback).append("();").toString();
            AudioPlayer.access$3(AudioPlayer.this).injectJavaScript(s);
        }
        if (AudioPlayer.access$8(AudioPlayer.this) != null)
        {
            AudioPlayer.access$8(AudioPlayer.this).hide();
        }
        mediaplayer.stop();
        AudioPlayer.access$2(AudioPlayer.this, mediaplayer.getDuration());
        mediaplayer.reset();
        mediaplayer.release();
        AudioPlayer.access$10(AudioPlayer.this, null);
    }

    View()
    {
        this$0 = AudioPlayer.this;
        super();
    }
}
