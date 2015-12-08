// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.message;

import java.io.Serializable;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package org.apache.http.message:
//            BasicLineFormatter

public class BasicStatusLine
    implements Serializable, Cloneable, StatusLine
{

    private static final long serialVersionUID = 0xde17a42b501ecf7bL;
    private final ProtocolVersion protoVersion;
    private final String reasonPhrase;
    private final int statusCode;

    public BasicStatusLine(ProtocolVersion protocolversion, int i, String s)
    {
        if (protocolversion == null)
        {
            throw new IllegalArgumentException("Protocol version may not be null.");
        }
        if (i < 0)
        {
            throw new IllegalArgumentException("Status code may not be negative.");
        } else
        {
            protoVersion = protocolversion;
            statusCode = i;
            reasonPhrase = s;
            return;
        }
    }

    public Object clone()
    {
        return super.clone();
    }

    public ProtocolVersion getProtocolVersion()
    {
        return protoVersion;
    }

    public String getReasonPhrase()
    {
        return reasonPhrase;
    }

    public int getStatusCode()
    {
        return statusCode;
    }

    public String toString()
    {
        return BasicLineFormatter.DEFAULT.formatStatusLine(null, this).toString();
    }
}
