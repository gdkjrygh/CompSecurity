// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import com.skype.SkyLib;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.push:
//            CallPushHandler, SkyLibPushMessage

private static final class pushMessage
{

    private static final int MAX_RETRIES = 2;
    private int pushId;
    private SkyLibPushMessage pushMessage;
    private int retryCount;

    final int getPushId()
    {
        return pushId;
    }

    final boolean retry(SkyLib skylib, int i)
    {
        if (retryCount < 2 && i == pushId)
        {
            retryCount = retryCount + 1;
            CallPushHandler.access$000().info((new StringBuilder("Retry ")).append(retryCount).toString());
            pushId = pushMessage.handleInSkyLib(skylib);
            return true;
        } else
        {
            CallPushHandler.access$000().info((new StringBuilder("Call retry failed ")).append(retryCount).toString());
            return false;
        }
    }

    (int i, SkyLibPushMessage skylibpushmessage)
    {
        retryCount = 0;
        pushId = i;
        pushMessage = skylibpushmessage;
    }
}
