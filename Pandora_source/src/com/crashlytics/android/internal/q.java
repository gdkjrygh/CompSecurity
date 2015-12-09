// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;


// Referenced classes of package com.crashlytics.android.internal:
//            n, t, ba

final class q
    implements Runnable
{

    private n a;

    q(n n1)
    {
        a = n1;
        super();
    }

    public final void run()
    {
        try
        {
            a.a.a();
            return;
        }
        catch (Exception exception)
        {
            ba.d("Crashlytics failed to send analytics files.");
        }
    }
}
