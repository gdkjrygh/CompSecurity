// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction;

import com.fitbit.e.a;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;

// Referenced classes of package com.fitbit.serverinteraction:
//            h, c

public class n extends h
{

    private static final String b = "ResponseContentParser";
    private c c;

    public n(HttpResponse httpresponse)
        throws IllegalArgumentException
    {
        super(httpresponse);
        c = null;
    }

    public HttpEntity getEntity()
    {
        if (c == null)
        {
            HttpEntity httpentity = a.getEntity();
            Object obj = httpentity;
            if (httpentity != null)
            {
                obj = httpentity;
                if (!httpentity.isRepeatable())
                {
                    c = new c(httpentity);
                    a.setEntity(c);
                    obj = c;
                }
            }
            return ((HttpEntity) (obj));
        } else
        {
            return c;
        }
    }

    public void setEntity(HttpEntity httpentity)
    {
        a.a("ResponseContentParser", "Entity cannot be replaced", new Object[0]);
    }
}
