// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.bsp;


// Referenced classes of package com.yume.android.bsp:
//            d, q, p

final class e
    implements Runnable
{

    private d a;

    e(d d1)
    {
        a = d1;
        super();
    }

    public final void run()
    {
        do
        {
            do
            {
                if (!d.b.equals(""))
                {
                    return;
                }
            } while (!q.b());
            d.b = q.a();
            a.a.a((new StringBuilder("Device UUID - 2: ")).append(d.b).toString());
        } while (true);
    }
}
