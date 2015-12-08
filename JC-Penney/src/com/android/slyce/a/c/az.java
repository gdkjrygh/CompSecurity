// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import com.android.slyce.a.am;
import com.android.slyce.a.c.c.b;
import com.android.slyce.a.c.c.f;
import com.android.slyce.a.c.c.h;
import com.android.slyce.a.c.c.n;

// Referenced classes of package com.android.slyce.a.c:
//            av, as, ba, bn

public class az
{

    public static int a(av av1)
    {
        av1 = av1.a("Content-Length");
        if (av1 == null)
        {
            return -1;
        }
        int i;
        try
        {
            i = Integer.parseInt(av1);
        }
        // Misplaced declaration of an exception variable
        catch (av av1)
        {
            return -1;
        }
        return i;
    }

    public static am a(am am1, bn bn1, av av1, boolean flag)
    {
        long l;
        try
        {
            l = Long.parseLong(av1.a("Content-Length"));
        }
        catch (Exception exception)
        {
            l = -1L;
        }
        if (-1L == l) goto _L2; else goto _L1
_L1:
        if (l >= 0L) goto _L4; else goto _L3
_L3:
        bn1 = ba.a(am1.l(), new as("not using chunked encoding, and no content-length found."));
        bn1.a(am1);
        am1 = bn1;
_L10:
        return am1;
_L4:
        Object obj;
        if (l == 0L)
        {
            bn1 = ba.a(am1.l(), null);
            bn1.a(am1);
            return bn1;
        }
        obj = new f(l);
        ((f) (obj)).a(am1);
_L6:
        if ("gzip".equals(av1.a("Content-Encoding")))
        {
            am1 = new h();
            am1.a(((am) (obj)));
            return am1;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (!"chunked".equalsIgnoreCase(av1.a("Transfer-Encoding")))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = new b();
        ((b) (obj)).a(am1);
        if (true) goto _L6; else goto _L5
_L5:
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = am1;
        if (bn1 != com.android.slyce.a.c.bn.b) goto _L6; else goto _L7
_L7:
        obj = am1;
        if (!"close".equalsIgnoreCase(av1.a("Connection")))
        {
            bn1 = ba.a(am1.l(), null);
            bn1.a(am1);
            return bn1;
        }
        if (true) goto _L6; else goto _L8
_L8:
        am1 = ((am) (obj));
        if ("deflate".equals(av1.a("Content-Encoding")))
        {
            am1 = new n();
            am1.a(((am) (obj)));
            return am1;
        }
        if (true) goto _L10; else goto _L9
_L9:
    }

    public static boolean a(bn bn1, av av1)
    {
        av1 = av1.a("Connection");
        if (av1 == null)
        {
            return bn1 == com.android.slyce.a.c.bn.b;
        } else
        {
            return "keep-alive".equalsIgnoreCase(av1);
        }
    }

    public static boolean a(String s, av av1)
    {
        av1 = av1.a("Connection");
        if (av1 == null)
        {
            return bn.a(s) == com.android.slyce.a.c.bn.b;
        } else
        {
            return "keep-alive".equalsIgnoreCase(av1);
        }
    }
}
