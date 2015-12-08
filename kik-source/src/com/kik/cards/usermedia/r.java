// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.usermedia;

import com.kik.sdkutils.b.a;

// Referenced classes of package com.kik.cards.usermedia:
//            q

public final class r
    implements a
{

    public r()
    {
    }

    public final Long a()
    {
        return Long.valueOf(0L);
    }

    public final volatile boolean a(Object obj)
    {
        return (q)obj == null;
    }

    public final String b(Object obj)
    {
        obj = (q)obj;
        if (obj == null)
        {
            return null;
        } else
        {
            return String.valueOf(((q) (obj)).a());
        }
    }
}
