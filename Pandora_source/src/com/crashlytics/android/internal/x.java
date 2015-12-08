// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;


// Referenced classes of package com.crashlytics.android.internal:
//            ba, j, t

final class x
    implements Runnable
{

    private final j a;
    private final t b;

    public x(j j1, t t1)
    {
        a = j1;
        b = t1;
    }

    public final void run()
    {
        try
        {
            ba.c("Performing time based analytics file roll over.");
            if (!a.a())
            {
                b.c();
            }
            return;
        }
        catch (Exception exception)
        {
            ba.d("Crashlytics failed to roll over session analytics file");
        }
    }
}
