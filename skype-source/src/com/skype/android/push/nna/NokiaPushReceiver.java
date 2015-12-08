// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push.nna;

import android.content.Context;
import com.nokia.push.PushBroadcastReceiver;

// Referenced classes of package com.skype.android.push.nna:
//            NokiaPushService

public class NokiaPushReceiver extends PushBroadcastReceiver
{

    public NokiaPushReceiver()
    {
    }

    protected String getPushIntentServiceClassName(Context context)
    {
        return com/skype/android/push/nna/NokiaPushService.getName();
    }
}
