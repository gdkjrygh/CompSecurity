// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.richpush;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.urbanairship.richpush:
//            RichPushManager

static final class  extends BroadcastReceiver
{

    public void onReceive(Context context, Intent intent)
    {
        RichPushManager.access$000().refreshMessages();
    }

    ()
    {
    }
}
