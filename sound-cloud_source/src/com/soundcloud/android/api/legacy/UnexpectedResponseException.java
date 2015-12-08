// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy;

import com.soundcloud.java.objects.MoreObjects;
import java.io.IOException;
import org.apache.http.StatusLine;

// Referenced classes of package com.soundcloud.android.api.legacy:
//            Request

public class UnexpectedResponseException extends IOException
{

    private final Request request;
    private final StatusLine statusLine;

    public UnexpectedResponseException(Request request1, StatusLine statusline)
    {
        request = request1;
        statusLine = statusline;
    }

    public String getMessage()
    {
        return toString();
    }

    public int getStatusCode()
    {
        return statusLine.getStatusCode();
    }

    public String toString()
    {
        return MoreObjects.toStringHelper(getClass()).add("response_status", statusLine).add("request", request).toString();
    }
}
