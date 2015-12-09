// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.d;

import com.android.slyce.a.c.bn;
import java.util.List;

// Referenced classes of package com.android.slyce.a.c.d:
//            au

final class at
{

    private static final List a = au.a(new String[] {
        "connection", "host", "keep-alive", "proxy-connection", "transfer-encoding"
    });
    private static final List b = au.a(new String[] {
        "connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"
    });

    static boolean a(bn bn1, String s)
    {
        if (bn1 == bn.c)
        {
            return a.contains(s.toLowerCase());
        }
        if (bn1 == bn.d)
        {
            return b.contains(s.toLowerCase());
        } else
        {
            throw new AssertionError(bn1);
        }
    }

}
