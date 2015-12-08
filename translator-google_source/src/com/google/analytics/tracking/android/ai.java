// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;


// Referenced classes of package com.google.analytics.tracking.android:
//            ae, k

final class ai
    implements Runnable
{

    final k a;
    final ae b;

    ai(ae ae1, k k1)
    {
        b = ae1;
        a = k1;
        super();
    }

    public final void run()
    {
        a.a(ae.a(b));
    }
}
