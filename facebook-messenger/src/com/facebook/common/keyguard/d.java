// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.keyguard;


// Referenced classes of package com.facebook.common.keyguard:
//            c, KeyguardPendingIntentActivity

class d
    implements Runnable
{

    final c a;

    d(c c1)
    {
        a = c1;
        super();
    }

    public void run()
    {
        a.a.finish();
        a.a.overridePendingTransition(0, 0);
    }
}
