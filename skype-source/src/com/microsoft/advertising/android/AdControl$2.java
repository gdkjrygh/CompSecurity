// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;


// Referenced classes of package com.microsoft.advertising.android:
//            AdControl, g

final class a
    implements Runnable
{

    final AdControl a;

    public final void run()
    {
        AdControl.b(a).a(true);
    }

    (AdControl adcontrol)
    {
        a = adcontrol;
        super();
    }
}
