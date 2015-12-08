// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.networkrecognizer;

import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.google.android.libraries.handwriting.networkrecognizer:
//            d

final class e
    implements ConnectionKeepAliveStrategy
{

    final d a;

    e(d d)
    {
        a = d;
        super();
    }

    public final long getKeepAliveDuration(HttpResponse httpresponse, HttpContext httpcontext)
    {
        return 0x186a0L;
    }
}
