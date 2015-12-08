// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.upsell;

import org.androidannotations.api.c;

// Referenced classes of package com.dominos.android.sdk.core.upsell:
//            UpsellManager_

class val.environment extends c
{

    final UpsellManager_ this$0;
    final String val$environment;

    public void execute()
    {
        try
        {
            UpsellManager_.access$001(UpsellManager_.this, val$environment);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    (int i, String s1, String s2)
    {
        this$0 = final_upsellmanager_;
        val$environment = s2;
        super(String.this, i, s1);
    }
}
