// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy;

import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;

public class ApiResponseException extends IOException
{

    private static final long serialVersionUID = 0xd67f1219b908ea5dL;
    public final HttpResponse response;

    public ApiResponseException(Throwable throwable, HttpResponse httpresponse)
    {
        String s;
        if (throwable == null)
        {
            s = null;
        } else
        {
            s = throwable.toString();
        }
        super(s);
        initCause(throwable);
        response = httpresponse;
    }

    public ApiResponseException(HttpResponse httpresponse, String s)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(httpresponse.getStatusLine().getStatusCode()).append(": [").append(httpresponse.getStatusLine().getReasonPhrase()).append("] ");
        if (s == null)
        {
            s = "";
        }
        super(stringbuilder.append(s).toString());
        response = httpresponse;
    }

    public String getMessage()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(super.getMessage()).append(" ");
        Object obj;
        if (response != null)
        {
            obj = response.getStatusLine();
        } else
        {
            obj = "";
        }
        return stringbuilder.append(obj).toString();
    }

    public int getStatusCode()
    {
        return response.getStatusLine().getStatusCode();
    }
}
