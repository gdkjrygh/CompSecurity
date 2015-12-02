// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.d.a;

import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.common.d.a:
//            ad, h, s

final class l
    implements Runnable
{

    final s a;
    final h b;

    l(s s, h h1)
    {
        a = s;
        b = h1;
        super();
    }

    public void run()
    {
        try
        {
            Object obj = ad.a(a);
            b.a(obj);
            return;
        }
        catch (ExecutionException executionexception)
        {
            b.a(executionexception.getCause());
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            b.a(runtimeexception);
            return;
        }
        catch (Error error)
        {
            b.a(error);
        }
    }
}
