// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;


// Referenced classes of package com.crashlytics.android.internal:
//            n, t, ba, aj

final class R
    implements Runnable
{

    private aj a;
    private String b;
    private n c;

    R(n n1, aj aj, String s)
    {
        c = n1;
        a = aj;
        b = s;
        super();
    }

    public final void run()
    {
        try
        {
            c.a.a(a, b);
            return;
        }
        catch (Exception exception)
        {
            ba.d("Crashlytics failed to set analytics settings data.");
        }
    }
}
