// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.experience;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;

// Referenced classes of package com.pinterest.experience:
//            Experiences, ExperienceValue

class  extends ApiResponseHandler
{

    final ExperienceValue a;

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        Experiences.c().d();
    }

    (ExperienceValue experiencevalue)
    {
        a = experiencevalue;
        super();
    }
}
