// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.experience;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;

// Referenced classes of package com.pinterest.experience:
//            Experiences

class nit> extends ApiResponseHandler
{

    final Experiences a;

    public void onSuccess(ApiResponse apiresponse)
    {
        a.d();
    }

    (Experiences experiences)
    {
        a = experiences;
        super();
    }
}
