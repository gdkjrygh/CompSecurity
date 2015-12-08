// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import com.squareup.okhttp.k;
import java.io.IOException;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

// Referenced classes of package com.squareup.okhttp.internal:
//            d

public final class a
{

    public boolean a;
    public boolean b;
    private final List c;
    private int d;

    public a(List list)
    {
        d = 0;
        c = list;
    }

    private boolean b(SSLSocket sslsocket)
    {
        for (int i = d; i < c.size(); i++)
        {
            if (((k)c.get(i)).a(sslsocket))
            {
                return true;
            }
        }

        return false;
    }

    public final k a(SSLSocket sslsocket)
        throws IOException
    {
        int i;
        int j;
        i = d;
        j = c.size();
_L3:
        k k1;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        k1 = (k)c.get(i);
        if (!k1.a(sslsocket)) goto _L2; else goto _L1
_L1:
        d = i + 1;
_L4:
        if (k1 == null)
        {
            throw new UnknownServiceException((new StringBuilder("Unable to find acceptable protocols. isFallback=")).append(b).append(", modes=").append(c).append(", supported protocols=").append(Arrays.toString(sslsocket.getEnabledProtocols())).toString());
        } else
        {
            a = b(sslsocket);
            d.b.a(k1, sslsocket, b);
            return k1;
        }
_L2:
        i++;
          goto _L3
        k1 = null;
          goto _L4
    }
}
