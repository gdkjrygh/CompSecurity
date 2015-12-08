// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;


// Referenced classes of package com.crashlytics.android:
//            aB, E

final class M
    implements Runnable
{

    private Runnable a;

    M(E e, Runnable runnable)
    {
        a = runnable;
        super();
    }

    public final void run()
    {
        try
        {
            a.run();
            return;
        }
        catch (Exception exception)
        {
            aB.a("Failed to execute task.", exception);
        }
    }
}
