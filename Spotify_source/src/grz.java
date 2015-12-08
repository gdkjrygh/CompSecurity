// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

public final class grz
{

    public boolean a;
    public boolean b;
    private final List c;
    private int d;

    public grz(List list)
    {
        d = 0;
        c = list;
    }

    private boolean b(SSLSocket sslsocket)
    {
        for (int i = d; i < c.size(); i++)
        {
            if (((grb)c.get(i)).a(sslsocket))
            {
                return true;
            }
        }

        return false;
    }

    public final grb a(SSLSocket sslsocket)
    {
        int i;
        int j;
        i = d;
        j = c.size();
_L3:
        grb grb1;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        grb1 = (grb)c.get(i);
        if (!grb1.a(sslsocket)) goto _L2; else goto _L1
_L1:
        d = i + 1;
_L4:
        if (grb1 == null)
        {
            throw new UnknownServiceException((new StringBuilder("Unable to find acceptable protocols. isFallback=")).append(b).append(", modes=").append(c).append(", supported protocols=").append(Arrays.toString(sslsocket.getEnabledProtocols())).toString());
        } else
        {
            a = b(sslsocket);
            gsf.b.a(grb1, sslsocket, b);
            return grb1;
        }
_L2:
        i++;
          goto _L3
        grb1 = null;
          goto _L4
    }
}
