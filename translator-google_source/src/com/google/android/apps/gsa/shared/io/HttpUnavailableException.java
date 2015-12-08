// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.io;


// Referenced classes of package com.google.android.apps.gsa.shared.io:
//            HttpException, o

public class HttpUnavailableException extends HttpException
{

    private final String mUrl;

    public HttpUnavailableException(o o, String s)
    {
        super(o);
        mUrl = s;
    }

    public String getUrl()
    {
        return mUrl;
    }
}
