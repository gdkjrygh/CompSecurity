// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.b;

import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import org.apache.http.HttpEntity;
import org.apache.http.entity.HttpEntityWrapper;

// Referenced classes of package com.facebook.http.b:
//            at

class c extends HttpEntityWrapper
    implements at
{

    public c(HttpEntity httpentity)
    {
        super(httpentity);
    }

    public HttpEntity a()
    {
        return wrappedEntity;
    }

    public InputStream getContent()
    {
        return new GZIPInputStream(wrappedEntity.getContent());
    }

    public long getContentLength()
    {
        return -1L;
    }
}
