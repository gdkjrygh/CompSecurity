// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.user;

import com.dominos.android.sdk.core.models.LabsAddress;
import org.androidannotations.api.c;

// Referenced classes of package com.dominos.android.sdk.core.user:
//            UserProfileManager_

class val.callback extends c
{

    final UserProfileManager_ this$0;
    final LabsAddress val$address;
    final int val$addressIndex;
    final eAddressCallback val$callback;
    final boolean val$setDefault;

    public void execute()
    {
        try
        {
            UserProfileManager_.access$101(UserProfileManager_.this, val$addressIndex, val$address, val$setDefault, val$callback);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    eAddressCallback(LabsAddress labsaddress, boolean flag, 
            eAddressCallback eaddresscallback)
    {
        this$0 = final_userprofilemanager_;
        val$addressIndex = I.this;
        val$address = labsaddress;
        val$setDefault = flag;
        val$callback = eaddresscallback;
        super(final_s, final_i, final_s1);
    }
}
