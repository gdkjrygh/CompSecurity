// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.content.DialogInterface;
import com.adobe.mediacore.MediaPlayerItem;
import com.adobe.mediacore.info.AudioTrack;
import java.util.List;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerControlBar

class this._cls0
    implements android.content.lickListener
{

    final PlayerControlBar this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        AudioTrack audiotrack = (AudioTrack)PlayerControlBar.access$600(PlayerControlBar.this).getAudioTracks().get(i);
        if (PlayerControlBar.access$600(PlayerControlBar.this).selectAudioTrack(audiotrack))
        {
            PlayerControlBar.access$702(PlayerControlBar.this, i);
        }
        dialoginterface.cancel();
    }

    ()
    {
        this$0 = PlayerControlBar.this;
        super();
    }
}
