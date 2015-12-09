// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            t, an

class v
    implements Runnable
{

    final String a;
    final Runnable b;
    final t c;

    v(t t1, String s, Runnable runnable)
    {
        c = t1;
        a = s;
        b = runnable;
        super();
    }

    public void run()
    {
        t.a(c).a(a);
        if (b != null)
        {
            b.run();
        }
    }
}
