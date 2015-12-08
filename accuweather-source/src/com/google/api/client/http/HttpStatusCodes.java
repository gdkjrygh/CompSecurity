// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;


public class HttpStatusCodes
{

    public static final int STATUS_CODE_BAD_GATEWAY = 502;
    public static final int STATUS_CODE_FORBIDDEN = 403;
    public static final int STATUS_CODE_FOUND = 302;
    public static final int STATUS_CODE_MOVED_PERMANENTLY = 301;
    public static final int STATUS_CODE_MULTIPLE_CHOICES = 300;
    public static final int STATUS_CODE_NOT_FOUND = 404;
    public static final int STATUS_CODE_NOT_MODIFIED = 304;
    public static final int STATUS_CODE_NO_CONTENT = 204;
    public static final int STATUS_CODE_OK = 200;
    public static final int STATUS_CODE_SEE_OTHER = 303;
    public static final int STATUS_CODE_SERVER_ERROR = 500;
    public static final int STATUS_CODE_SERVICE_UNAVAILABLE = 503;
    public static final int STATUS_CODE_TEMPORARY_REDIRECT = 307;
    public static final int STATUS_CODE_UNAUTHORIZED = 401;

    public HttpStatusCodes()
    {
    }

    public static boolean isRedirect(int i)
    {
        switch (i)
        {
        case 304: 
        case 305: 
        case 306: 
        default:
            return false;

        case 301: 
        case 302: 
        case 303: 
        case 307: 
            return true;
        }
    }

    public static boolean isSuccess(int i)
    {
        return i >= 200 && i < 300;
    }
}
