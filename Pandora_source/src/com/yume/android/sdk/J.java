// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;

import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.yume.android.sdk:
//            F, M, x

final class J
    implements Runnable
{

    private F a;

    J(F f)
    {
        a = f;
        super();
    }

    public final void run()
    {
        int i = 0;
_L1:
        Object obj;
        try
        {
            if (a.c == null || i >= a.c.size())
            {
                a.a.b("Asset Downloads Paused.");
                return;
            }
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return;
        }
        obj = (String)a.c.get(i);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        obj = (x)a.b.get(obj);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        ((x) (obj)).a(null);
        ((x) (obj)).b();
        i++;
          goto _L1
    }
}
