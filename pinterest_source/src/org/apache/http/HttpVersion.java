// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http;

import java.io.Serializable;

// Referenced classes of package org.apache.http:
//            ProtocolVersion

public final class HttpVersion extends ProtocolVersion
    implements Serializable
{

    public static final String HTTP = "HTTP";
    public static final HttpVersion HTTP_0_9 = new HttpVersion(0, 9);
    public static final HttpVersion HTTP_1_0 = new HttpVersion(1, 0);
    public static final HttpVersion HTTP_1_1 = new HttpVersion(1, 1);
    private static final long serialVersionUID = 0xaeb8fca8b3c7b410L;

    public HttpVersion(int i, int j)
    {
        super("HTTP", i, j);
    }

    public final ProtocolVersion forVersion(int i, int j)
    {
        if (i == major && j == minor)
        {
            return this;
        }
        if (i == 1)
        {
            if (j == 0)
            {
                return HTTP_1_0;
            }
            if (j == 1)
            {
                return HTTP_1_1;
            }
        }
        if (i == 0 && j == 9)
        {
            return HTTP_0_9;
        } else
        {
            return new HttpVersion(i, j);
        }
    }

}
