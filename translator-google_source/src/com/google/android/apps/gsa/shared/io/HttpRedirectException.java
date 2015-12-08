// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.io;


// Referenced classes of package com.google.android.apps.gsa.shared.io:
//            HttpException, o

public class HttpRedirectException extends HttpException
{

    private final String mLocation;

    public HttpRedirectException(o o, String s)
    {
        super(o);
        mLocation = s;
    }

    public String getRedirectLocation()
    {
        return mLocation;
    }
}
