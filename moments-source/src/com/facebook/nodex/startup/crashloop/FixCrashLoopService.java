// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nodex.startup.crashloop;

import android.app.IntentService;
import android.content.Intent;

// Referenced classes of package com.facebook.nodex.startup.crashloop:
//            CrashLoop

public class FixCrashLoopService extends IntentService
{

    public FixCrashLoopService()
    {
        super(com/facebook/nodex/startup/crashloop/FixCrashLoopService.getSimpleName());
    }

    protected void onHandleIntent(Intent intent)
    {
        (new CrashLoop(this)).a();
    }
}
