// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PlayScreen, PlayerUiState, TopPanel

class this._cls0
    implements Runnable
{

    final PlayScreen this$0;

    public void run()
    {
        if (PlayScreen.access$000(PlayScreen.this) == PlayerUiState.Playing)
        {
            Log.d("screen", "AUDIO:: sound bar hide");
            TopPanel toppanel = mTopPanel;
            if (toppanel != null)
            {
                toppanel.hideSoundSection();
            }
            return;
        } else
        {
            Log.d("screen", "AUDIO:: not in loaded state anymore! Ignore.");
            return;
        }
    }

    ()
    {
        this$0 = PlayScreen.this;
        super();
    }
}
