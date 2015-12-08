// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;


// Referenced classes of package com.crashlytics.android:
//            ao, bc

final class h
    implements Runnable
{

    private bc a;

    h(bc bc1)
    {
        a = bc1;
        super();
    }

    public final void run()
    {
        a.a(bc.a(a, ao.a));
    }
}
