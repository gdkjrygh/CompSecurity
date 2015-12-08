// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;


// Referenced classes of package com.google.analytics.tracking.android:
//            ae, am

final class ah
    implements Runnable
{

    final am a;
    final ae b;

    ah(ae ae1, am am1)
    {
        b = ae1;
        a = am1;
        super();
    }

    public final void run()
    {
        a.a(ae.b(b));
    }
}
