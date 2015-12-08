// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast;

import android.content.Intent;
import android.view.KeyEvent;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.CastException;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException;
import com.google.android.libraries.cast.companionlibrary.utils.LogUtils;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast:
//            VideoCastManager

class this._cls0 extends android.support.v4.media.session.allback
{

    final VideoCastManager this$0;

    public boolean onMediaButtonEvent(Intent intent)
    {
        intent = (KeyEvent)intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (intent == null || intent.getKeyCode() != 127 && intent.getKeyCode() != 126)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        togglePlayback();
_L2:
        return true;
        intent;
_L3:
        LogUtils.LOGE(VideoCastManager.access$100(), "onMediaButtonEvent(): Failed to toggle playback", intent);
        if (true) goto _L2; else goto _L1
_L1:
        intent;
          goto _L3
        intent;
          goto _L3
    }

    ionException()
    {
        this$0 = VideoCastManager.this;
        super();
    }
}
