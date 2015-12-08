// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.params;

import org.apache.http.ProtocolVersion;
import org.apache.http.util.Args;

// Referenced classes of package org.apache.http.params:
//            HttpParams

public final class HttpProtocolParams
{

    public static void setContentCharset(HttpParams httpparams, String s)
    {
        Args.notNull(httpparams, "HTTP parameters");
        httpparams.setParameter("http.protocol.content-charset", s);
    }

    public static void setVersion(HttpParams httpparams, ProtocolVersion protocolversion)
    {
        Args.notNull(httpparams, "HTTP parameters");
        httpparams.setParameter("http.protocol.version", protocolversion);
    }
}
