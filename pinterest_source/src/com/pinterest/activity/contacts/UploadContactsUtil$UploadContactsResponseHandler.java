// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.contacts;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.base.Events;
import com.pinterest.kit.time.Clock;

// Referenced classes of package com.pinterest.activity.contacts:
//            UploadContactsUtil

class contactsHash extends ApiResponseHandler
{

    private int contactsHash;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        Events.post(new init>());
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        apiresponse = UploadContactsUtil.clock;
        UploadContactsUtil.setAccountsStoredContactStatusSynced(Clock.a(), contactsHash);
    }


/*
    static int access$102( , int i)
    {
        .contactsHash = i;
        return i;
    }

*/

    public contactsHash(boolean flag)
    {
        super(flag);
    }
}
