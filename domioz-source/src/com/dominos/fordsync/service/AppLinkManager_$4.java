// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.service;

import java.util.Vector;
import org.androidannotations.api.c;

// Referenced classes of package com.dominos.fordsync.service:
//            AppLinkManager_

class val.chunks extends c
{

    final AppLinkManager_ this$0;
    final Vector val$chunks;

    public void execute()
    {
        try
        {
            AppLinkManager_.access$301(AppLinkManager_.this, val$chunks);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    (int i, String s1, Vector vector)
    {
        this$0 = final_applinkmanager_;
        val$chunks = vector;
        super(String.this, i, s1);
    }
}
