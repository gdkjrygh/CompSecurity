// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.message;

import java.io.Serializable;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package org.apache.http.message:
//            BasicLineFormatter

public class BasicRequestLine
    implements Serializable, Cloneable, RequestLine
{

    private final String method;
    private final ProtocolVersion protoversion;
    private final String uri;

    public BasicRequestLine(String s, String s1, ProtocolVersion protocolversion)
    {
        method = (String)Args.notNull(s, "Method");
        uri = (String)Args.notNull(s1, "URI");
        protoversion = (ProtocolVersion)Args.notNull(protocolversion, "Version");
    }

    public Object clone()
    {
        return super.clone();
    }

    public String getMethod()
    {
        return method;
    }

    public ProtocolVersion getProtocolVersion()
    {
        return protoversion;
    }

    public String getUri()
    {
        return uri;
    }

    public String toString()
    {
        return BasicLineFormatter.INSTANCE.formatRequestLine(null, this).toString();
    }
}
