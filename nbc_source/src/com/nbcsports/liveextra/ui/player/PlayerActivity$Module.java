// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.content.Context;
import com.adobe.mediacore.ABRControlParameters;
import com.adobe.mediacore.BufferControlParameters;
import com.adobe.mediacore.DefaultMediaPlayer;
import com.adobe.mediacore.MediaPlayer;
import com.nbcsports.liveextra.library.ui.systemui.SystemUiHelper;
import com.nbcsports.liveextra.ui.main.core.AssetViewModel;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerActivity

public class activity
{

    private final PlayerActivity activity;
    final PlayerActivity this$0;

    Context context()
    {
        return activity;
    }

    MediaPlayer player()
    {
        MediaPlayer mediaplayer = DefaultMediaPlayer.create(activity.getApplicationContext());
        mediaplayer.setBufferControlParameters(BufferControlParameters.createDual(2000L, 18000L));
        mediaplayer.setABRControlParameters(new ABRControlParameters(0, 0, 0x44aa20, com.adobe.mediacore.BRPolicy.ABR_AGGRESSIVE));
        return mediaplayer;
    }

    PlayerActivity playerActivity()
    {
        return activity;
    }

    SystemUiHelper systemUiHelper()
    {
        if (android.os.i.systemui.SystemUiHelper >= 19)
        {
            return new SystemUiHelper(activity, 3, 0);
        } else
        {
            return new SystemUiHelper(activity, 2, 0);
        }
    }

    AssetViewModel viewModel()
    {
        return PlayerActivity.access$000(PlayerActivity.this);
    }

    public er(PlayerActivity playeractivity1)
    {
        this$0 = PlayerActivity.this;
        super();
        activity = playeractivity1;
    }
}
