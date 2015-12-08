// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import b.a.a.a.d;

// Referenced classes of package com.a.a.a:
//            e, A

final class h
    implements Runnable
{

    final e a;

    h(e e1)
    {
        a = e1;
        super();
    }

    public final void run()
    {
        try
        {
            a.g.b();
            return;
        }
        catch (Exception exception)
        {
            d.a();
        }
    }
}
