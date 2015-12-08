// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.core.models.LabsAddress;
import org.androidannotations.api.c;

// Referenced classes of package com.dominos.activities:
//            UserAddLocation_

class val.deliveryAddress extends c
{

    final UserAddLocation_ this$0;
    final LabsAddress val$deliveryAddress;

    public void execute()
    {
        try
        {
            UserAddLocation_.access$1201(UserAddLocation_.this, val$deliveryAddress);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    ress(int i, String s1, LabsAddress labsaddress)
    {
        this$0 = final_useraddlocation_;
        val$deliveryAddress = labsaddress;
        super(String.this, i, s1);
    }
}
