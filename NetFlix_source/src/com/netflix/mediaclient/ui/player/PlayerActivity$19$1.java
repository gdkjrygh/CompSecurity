// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.SimpleManagerCallback;
import com.netflix.mediaclient.ui.Asset;
import com.netflix.mediaclient.ui.common.Social;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PlayerActivity, PlayScreen, TopPanel

class ck extends SimpleManagerCallback
{

    final ck this$1;

    public void onVideoHide(int i)
    {
        if (Log.isLoggable("PlayerActivity", 3))
        {
            Log.d("PlayerActivity", (new StringBuilder()).append("Video is hidden status code ").append(i).toString());
        }
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/netflix/mediaclient/ui/player/PlayerActivity$19

/* anonymous class */
    class PlayerActivity._cls19
        implements com.netflix.mediaclient.ui.common.Social.SocialProviderCallback
    {

        final PlayerActivity this$0;

        public void doNotShare()
        {
            ServiceManager servicemanager = getServiceManager();
            if (servicemanager == null || !servicemanager.isReady())
            {
                Log.e("PlayerActivity", "Service manager is NOT ready. This should NOT happen!");
            } else
            if (!destroyed())
            {
                PlayerActivity.access$700(PlayerActivity.this).getTopPanel().getSocial().changeActionState(false);
                servicemanager.hideVideo(PlayerActivity.access$400(PlayerActivity.this).getPlayableId(), new PlayerActivity._cls19._cls1());
                return;
            }
        }

        public void extendTimeoutTimer()
        {
            PlayerActivity.this.extendTimeoutTimer();
        }

            
            {
                this$0 = PlayerActivity.this;
                super();
            }
    }

}
