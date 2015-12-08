// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.core;

import com.google.android.libraries.translate.offline.ah;

// Referenced classes of package com.google.android.libraries.translate.core:
//            s, n, m

final class q extends s
{

    final n a;
    private final int b;

    public q(n n1, int i)
    {
        a = n1;
        super();
        b = i;
    }

    public final transient m a(String as[])
    {
        try
        {
            Thread.sleep(b);
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            return null;
        }
        if (isCancelled())
        {
            return null;
        } else
        {
            return ah.a(a.c, as[0], as[1], as[2], as[3]);
        }
    }
}
