// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.content.Intent;
import com.adobe.mediacore.MediaPlayer;
import com.nbcsports.liveextra.library.tve.AuthService;
import com.nbcsports.liveextra.ui.main.core.AssetViewModel;
import com.phunware.nbc.sochi.accessenable.SelectProviderActivity;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerActivity

class this._cls0
    implements com.phunware.nbc.sochi.fragments.gment.Callback
{

    final PlayerActivity this$0;

    public void pause()
    {
        if (player.getStatus() == com.adobe.mediacore.rState.PLAYING)
        {
            player.pause();
        }
    }

    public void play()
    {
        if (player.getStatus() == com.adobe.mediacore.rState.PAUSED)
        {
            player.play();
        }
    }

    public void stop()
    {
        pass.unregister(PlayerActivity.access$500(PlayerActivity.this));
        Intent intent = new Intent(PlayerActivity.this, com/phunware/nbc/sochi/accessenable/SelectProviderActivity);
        intent.putExtra("asset", PlayerActivity.access$000(PlayerActivity.this).asset());
        intent.putExtra("allow_temp_pass", pass.isTempPassEnabled());
        startActivityForResult(intent, 200);
        overridePendingTransition(0x7f05000c, 0x7f05000d);
    }

    ()
    {
        this$0 = PlayerActivity.this;
        super();
    }
}
