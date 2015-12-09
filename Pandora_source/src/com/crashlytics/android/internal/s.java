// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;


// Referenced classes of package com.crashlytics.android.internal:
//            n, h, t, ba

final class s
    implements Runnable
{

    private n a;

    s(n n1)
    {
        a = n1;
        super();
    }

    public final void run()
    {
        try
        {
            t t1 = a.a;
            a.a = new h();
            t1.b();
            return;
        }
        catch (Exception exception)
        {
            ba.d("Crashlytics failed to disable analytics.");
        }
    }
}
