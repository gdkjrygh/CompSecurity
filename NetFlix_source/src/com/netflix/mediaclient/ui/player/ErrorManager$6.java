// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.content.Intent;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.util.AndroidUtils;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            ErrorManager, PlayerActivity

class this._cls0
    implements Runnable
{

    final ErrorManager this$0;

    public void run()
    {
        AndroidUtils.clearApplicationData(ErrorManager.access$100(ErrorManager.this));
        Log.e("ErrorManager", "resetApp");
        if (ErrorManager.access$100(ErrorManager.this) instanceof NetflixActivity)
        {
            NetflixActivity.finishAllActivities(ErrorManager.access$100(ErrorManager.this));
        }
        Intent intent = new Intent();
        intent.setClass(ErrorManager.access$100(ErrorManager.this), com/netflix/mediaclient/service/NetflixService);
        ErrorManager.access$100(ErrorManager.this).stopService(intent);
    }

    ctivity()
    {
        this$0 = ErrorManager.this;
        super();
    }
}
