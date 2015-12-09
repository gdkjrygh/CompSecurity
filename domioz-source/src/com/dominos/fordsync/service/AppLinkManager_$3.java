// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.service;

import com.dominos.android.sdk.common.BaseCallback;
import org.androidannotations.api.c;

// Referenced classes of package com.dominos.fordsync.service:
//            AppLinkManager_

class val.setupCallback extends c
{

    final AppLinkManager_ this$0;
    final BaseCallback val$setupCallback;

    public void execute()
    {
        try
        {
            AppLinkManager_.access$201(AppLinkManager_.this, val$setupCallback);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    (int i, String s1, BaseCallback basecallback)
    {
        this$0 = final_applinkmanager_;
        val$setupCallback = basecallback;
        super(String.this, i, s1);
    }
}
