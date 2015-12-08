// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.speechkit.speech;

import android.media.MediaPlayer;
import android.widget.MediaController;

// Referenced classes of package com.admarvel.speechkit.speech:
//            AudioPlayer

class this._cls0
    implements android.media.PreparedListener
{

    final AudioPlayer this$0;

    public void onPrepared(MediaPlayer mediaplayer)
    {
        if (AudioPlayer.access$7(AudioPlayer.this) && AudioPlayer.access$8(AudioPlayer.this) != null)
        {
            AudioPlayer.access$9(AudioPlayer.this);
            AudioPlayer.access$8(AudioPlayer.this).setAnchorView(AudioPlayer.access$3(AudioPlayer.this));
            AudioPlayer.access$8(AudioPlayer.this).setEnabled(true);
            AudioPlayer.access$8(AudioPlayer.this).show();
        }
    }

    ()
    {
        this$0 = AudioPlayer.this;
        super();
    }
}
