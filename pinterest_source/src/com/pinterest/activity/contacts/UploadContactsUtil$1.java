// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.contacts;

import com.pinterest.api.ApiResponse;
import com.pinterest.base.Application;

// Referenced classes of package com.pinterest.activity.contacts:
//            UploadContactsUtil

final class loadContactsResponseHandler extends loadContactsResponseHandler
{

    public final void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        UploadContactsUtil.access$000();
    }

    public final void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        Application.showToast(0x7f07017c);
    }

    loadContactsResponseHandler(boolean flag)
    {
        super(flag);
    }
}
