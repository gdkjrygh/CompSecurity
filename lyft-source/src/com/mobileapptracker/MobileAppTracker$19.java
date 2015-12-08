// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobileapptracker;


// Referenced classes of package com.mobileapptracker:
//            MobileAppTracker, MATParameters

class a
    implements Runnable
{

    final String a;
    final MobileAppTracker b;

    public void run()
    {
        b.e.t(a);
    }

    (MobileAppTracker mobileapptracker, String s)
    {
        b = mobileapptracker;
        a = s;
        super();
    }
}
