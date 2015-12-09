// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.os.SystemClock;
import android.view.View;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PlayerActivity, PlayerWorkflowState

class this._cls0
    implements android.view.ner
{

    final PlayerActivity this$0;

    public void onClick(View view)
    {
        PlayerActivity.access$100(PlayerActivity.this).setLastActionTime(SystemClock.elapsedRealtime());
        PlayerActivity.access$100(PlayerActivity.this).userInteraction();
        boolean flag;
        if (PlayerActivity.access$500(PlayerActivity.this))
        {
            doZoomIn();
        } else
        {
            doZoomOut();
        }
        view = PlayerActivity.this;
        if (!PlayerActivity.access$500(PlayerActivity.this))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        PlayerActivity.access$502(view, flag);
    }

    te()
    {
        this$0 = PlayerActivity.this;
        super();
    }
}
