// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.speechkit.speech;

import android.media.MediaPlayer;
import android.os.Handler;
import com.admarvel.android.ads.AdMarvelInternalWebView;
import com.admarvel.android.util.Logging;

// Referenced classes of package com.admarvel.speechkit.speech:
//            AudioPlayer

class this._cls0
    implements Runnable
{

    final AudioPlayer this$0;

    public void run()
    {
        if (!isPlaying())
        {
            Logging.log("Not firing AudioPositionChangeEvent -- not playing");
        } else
        if (AudioPlayer.access$0(AudioPlayer.this) != null)
        {
            int i = AudioPlayer.access$0(AudioPlayer.this).getCurrentPosition();
            if (i == AudioPlayer.access$1(AudioPlayer.this))
            {
                Logging.log("Not firing AudioPositionChangeEvent -- didn't change");
                return;
            }
            AudioPlayer.access$2(AudioPlayer.this, i);
            Logging.log((new StringBuilder("Firing AudioPositonChangeEvent() position=")).append(i).toString());
            if (AudioPlayer.access$3(AudioPlayer.this) != null && AudioPlayer.access$3(AudioPlayer.this).audioPositionChangeCallback != null && AudioPlayer.access$3(AudioPlayer.this).audioPositionChangeCallback.length() > 0)
            {
                String s = (new StringBuilder("window.")).append(AudioPlayer.access$3(AudioPlayer.this).audioPositionChangeCallback).append("(").append(i).append(");").toString();
                AudioPlayer.access$3(AudioPlayer.this).injectJavaScript(s);
            }
            AudioPlayer.access$4(AudioPlayer.this).postDelayed(AudioPlayer.access$5(AudioPlayer.this), AudioPlayer.access$6(AudioPlayer.this));
            return;
        }
    }

    View()
    {
        this$0 = AudioPlayer.this;
        super();
    }
}
