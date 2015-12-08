// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.core.models.LabsOrder;
import org.androidannotations.api.c;

// Referenced classes of package com.dominos.activities:
//            LabsCheckoutActivity_

class val.order extends c
{

    final LabsCheckoutActivity_ this$0;
    final LabsOrder val$order;

    public void execute()
    {
        try
        {
            LabsCheckoutActivity_.access$2101(LabsCheckoutActivity_.this, val$order);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    (int i, String s1, LabsOrder labsorder)
    {
        this$0 = final_labscheckoutactivity_;
        val$order = labsorder;
        super(String.this, i, s1);
    }
}
