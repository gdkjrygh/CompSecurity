// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;


// Referenced classes of package com.crashlytics.android.internal:
//            n, t, ba, u

final class p
    implements Runnable
{

    private u a;
    private boolean b;
    private n c;

    p(n n1, u u, boolean flag)
    {
        c = n1;
        a = u;
        b = flag;
        super();
    }

    public final void run()
    {
        try
        {
            c.a.a(a);
            if (b)
            {
                c.a.d();
            }
            return;
        }
        catch (Exception exception)
        {
            ba.d("Crashlytics failed to record session event.");
        }
    }
}
