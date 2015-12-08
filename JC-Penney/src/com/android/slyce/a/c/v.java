// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import android.net.Uri;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;

// Referenced classes of package com.android.slyce.a.c:
//            u

class v
    implements RequestLine
{

    final u a;

    v(u u1)
    {
        a = u1;
        super();
    }

    public String getMethod()
    {
        return u.a(a);
    }

    public ProtocolVersion getProtocolVersion()
    {
        return new ProtocolVersion("HTTP", 1, 1);
    }

    public String getUri()
    {
        return a.d().toString();
    }

    public String toString()
    {
        String s;
label0:
        {
            String s1 = a.d().getEncodedPath();
            if (s1 != null)
            {
                s = s1;
                if (s1.length() != 0)
                {
                    break label0;
                }
            }
            s = "/";
        }
        String s3 = a.d().getEncodedQuery();
        String s2 = s;
        if (s3 != null)
        {
            s2 = s;
            if (s3.length() != 0)
            {
                s2 = (new StringBuilder()).append(s).append("?").append(s3).toString();
            }
        }
        return String.format("%s %s HTTP/1.1", new Object[] {
            u.a(a), s2
        });
    }
}
