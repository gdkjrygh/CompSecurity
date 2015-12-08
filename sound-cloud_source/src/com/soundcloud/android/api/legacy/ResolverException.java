// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy;

import org.apache.http.HttpResponse;

// Referenced classes of package com.soundcloud.android.api.legacy:
//            ApiResponseException

public class ResolverException extends ApiResponseException
{

    public ResolverException(String s, HttpResponse httpresponse)
    {
        super(httpresponse, s);
    }

    public ResolverException(Throwable throwable, HttpResponse httpresponse)
    {
        super(throwable, httpresponse);
    }
}
