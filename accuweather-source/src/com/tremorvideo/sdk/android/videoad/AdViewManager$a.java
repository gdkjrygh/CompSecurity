// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.content.Context;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            AdViewManager, ct, ea, ex, 
//            dw, az, a

class b
    implements b
{

    final AdViewManager a;
    private Context b;

    public int a(ea ea1)
    {
        return a(ea1, -1);
    }

    public int a(ea ea1, int i)
    {
        int j = -1;
        if (ea1 != null)
        {
            ct.d((new StringBuilder()).append("Starting Event: ").append(ct.B()).append("ms ").append(ea1.a().a()).append(" ").append(ea1.i()).append(" ").append(ea1.c()).toString());
            i = AdViewManager.c(a).a(ea1, i);
            j = i;
            if (ea1.e())
            {
                j = i;
                if (ea1.h())
                {
                    AdViewManager.d(a);
                    j = i;
                }
            }
        }
        return j;
    }

    public az a()
    {
        return a.c;
    }

    public void a(int i)
    {
        if (i != -1)
        {
            AdViewManager.c(a).a(i);
            a a1 = AdViewManager.c(a).e();
            ea ea1 = a1.a;
            ct.d((new StringBuilder()).append("Ending Event: ").append(a1.a).append("ms ").append(ea1.a().a()).append(" ").append(ea1.i()).append(" ").append(ea1.c()).toString());
            if (ea1.e() && !ea1.h())
            {
                AdViewManager.d(a);
            }
        }
    }

    public void a(a a1)
    {
        AdViewManager.a(a);
        ct.d(" ");
        ct.d("<<< Ad End");
        ct.d(" ");
        ct.y().f();
        AdViewManager.b(a);
    }

    public Context b()
    {
        return b;
    }

    public void b(int i)
    {
    }

    public int c()
    {
        return 0;
    }

    public int d()
    {
        return -1;
    }

    public _cls9(AdViewManager adviewmanager, Context context, ex ex1)
    {
        a = adviewmanager;
        super();
        b = context;
        AdViewManager.a(adviewmanager, ex1);
    }
}
