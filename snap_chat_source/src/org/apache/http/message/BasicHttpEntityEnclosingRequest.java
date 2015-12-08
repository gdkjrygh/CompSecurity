// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.message;

import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;

// Referenced classes of package org.apache.http.message:
//            BasicHttpRequest

public class BasicHttpEntityEnclosingRequest extends BasicHttpRequest
    implements HttpEntityEnclosingRequest
{

    private HttpEntity entity;

    public BasicHttpEntityEnclosingRequest(String s, String s1)
    {
        super(s, s1);
    }

    public HttpEntity getEntity()
    {
        return entity;
    }

    public void setEntity(HttpEntity httpentity)
    {
        entity = httpentity;
    }
}
