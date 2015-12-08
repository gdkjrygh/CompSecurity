// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import c.h;
import com.c.a.A;
import com.c.a.B;
import com.soundcloud.android.utils.IOUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.soundcloud.android.offline:
//            StrictSSLHttpClient

static class response
    implements Closeable
{

    private final A response;

    public void close()
    {
        IOUtils.close(response.g);
    }

    public InputStream getInputStream()
        throws IOException
    {
        return response.g.c().d();
    }

    public boolean isFailure()
    {
        return !response.a();
    }

    public boolean isSuccess()
    {
        return response.a();
    }

    public boolean isUnavailable()
    {
        return response.c >= 400 && response.c <= 499;
    }

    public (A a)
    {
        response = a;
    }
}
