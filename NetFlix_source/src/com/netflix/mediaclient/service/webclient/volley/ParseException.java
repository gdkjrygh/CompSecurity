// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.volley;

import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;

public class ParseException extends VolleyError
{

    public ParseException()
    {
    }

    public ParseException(NetworkResponse networkresponse)
    {
        super(networkresponse);
    }

    public ParseException(String s)
    {
        super(s);
    }

    public ParseException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public ParseException(Throwable throwable)
    {
        super(throwable);
    }
}
