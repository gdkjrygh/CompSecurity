// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.player;

import com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException;
import com.google.android.libraries.cast.companionlibrary.utils.LogUtils;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast.player:
//            VideoCastControllerFragment, VideoCastController

class this._cls1
    implements Runnable
{

    final is._cls0 this$1;

    public void run()
    {
_L2:
        return;
        if (VideoCastControllerFragment.access$1100(_fld0) == 4 || !VideoCastControllerFragment.access$700(_fld0).isConnected()) goto _L2; else goto _L1
_L1:
        long l = VideoCastControllerFragment.access$700(_fld0).getMediaDuration();
        int i = (int)l;
        if (i <= 0) goto _L2; else goto _L3
_L3:
        int j = (int)VideoCastControllerFragment.access$700(_fld0).getCurrentMediaPosition();
        VideoCastControllerFragment.access$200(_fld0).updateSeekbar(j, i);
        return;
        Object obj;
        obj;
        LogUtils.LOGE(VideoCastControllerFragment.access$100(), "Failed to get current media position", ((Throwable) (obj)));
        return;
        obj;
_L5:
        LogUtils.LOGE(VideoCastControllerFragment.access$100(), "Failed to update the progress bar due to network issues", ((Throwable) (obj)));
        return;
        obj;
        if (true) goto _L5; else goto _L4
_L4:
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
