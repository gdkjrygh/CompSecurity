// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.media.a;

import com.google.common.b.c;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpEntity;

// Referenced classes of package com.facebook.ui.media.a:
//            c, d

class f extends com.facebook.ui.media.a.c
{

    private final HttpEntity a;
    private final InputStream b;

    f(HttpEntity httpentity)
    {
        super(d.SUCCESS);
        a = (HttpEntity)Preconditions.checkNotNull(httpentity);
        b = httpentity.getContent();
    }

    public InputStream b()
    {
        return b;
    }

    public void c()
    {
        com.google.common.b.c.a(b);
        try
        {
            a.consumeContent();
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }

    public long d()
    {
        return a.getContentLength();
    }
}
