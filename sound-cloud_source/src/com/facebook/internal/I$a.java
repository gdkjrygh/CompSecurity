// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

// Referenced classes of package com.facebook.internal:
//            I, U

private static final class a extends BufferedInputStream
{

    HttpURLConnection a;

    public final void close()
        throws IOException
    {
        super.close();
        U.a(a);
    }

    (InputStream inputstream, HttpURLConnection httpurlconnection)
    {
        super(inputstream, 8192);
        a = httpurlconnection;
    }
}
