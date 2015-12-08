// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast;

import com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException;
import com.google.android.libraries.cast.companionlibrary.utils.LogUtils;
import java.util.TimerTask;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast:
//            VideoCastManager

private class <init> extends TimerTask
{

    final VideoCastManager this$0;

    public void run()
    {
        if (VideoCastManager.access$1400(VideoCastManager.this) != 4 && isConnected() && VideoCastManager.access$500(VideoCastManager.this) != null) goto _L2; else goto _L1
_L1:
        int i;
        return;
_L2:
        if ((i = (int)getMediaDuration()) <= 0) goto _L1; else goto _L3
_L3:
        int j = (int)getCurrentMediaPosition();
        VideoCastManager.access$1500(VideoCastManager.this, j, i);
        return;
        Object obj;
        obj;
_L5:
        LogUtils.LOGE(VideoCastManager.access$100(), "Failed to update the progress tracker due to network issues", ((Throwable) (obj)));
        return;
        obj;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private tionException()
    {
        this$0 = VideoCastManager.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
