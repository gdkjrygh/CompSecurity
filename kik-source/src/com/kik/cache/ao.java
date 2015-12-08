// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import com.android.volley.n;
import com.android.volley.toolbox.g;
import java.io.ByteArrayInputStream;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

public final class ao
    implements g
{

    private final ProtocolVersion a = new ProtocolVersion("HTTP", 1, 1);

    public ao()
    {
    }

    public final HttpResponse a(n n, Map map)
    {
        n = new BasicHttpResponse(new BasicStatusLine(a, 200, "OK"));
        map = new BasicHttpEntity();
        map.setContent(new ByteArrayInputStream(new byte[0]));
        n.setEntity(map);
        return n;
    }
}
