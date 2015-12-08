// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.comm;

import java.util.Map;

public class ApptentiveHttpResponse
{

    private boolean badPayload;
    private int code;
    private String content;
    private Map headers;
    private String reason;

    public ApptentiveHttpResponse()
    {
        content = null;
        reason = null;
        code = -1;
        badPayload = false;
    }

    public int getCode()
    {
        return code;
    }

    public String getContent()
    {
        return content;
    }

    public Map getHeaders()
    {
        return headers;
    }

    public String getReason()
    {
        return reason;
    }

    public boolean isBadPayload()
    {
        return badPayload;
    }

    public boolean isRejectedPermanently()
    {
        return code >= 400 && code < 500;
    }

    public boolean isRejectedTemporarily()
    {
        return !isSuccessful() && !isRejectedPermanently();
    }

    public boolean isSuccessful()
    {
        return code >= 200 && code < 300;
    }

    public void setBadPayload(boolean flag)
    {
        badPayload = flag;
    }

    public void setCode(int i)
    {
        code = i;
    }

    public void setContent(String s)
    {
        content = s;
    }

    public void setHeaders(Map map)
    {
        headers = map;
    }

    public void setReason(String s)
    {
        reason = s;
    }
}
