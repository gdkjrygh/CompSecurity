// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.keyguard;

import android.os.Handler;

// Referenced classes of package com.facebook.common.keyguard:
//            KeyguardPendingIntentActivity, d

class c
    implements Runnable
{

    final KeyguardPendingIntentActivity a;

    c(KeyguardPendingIntentActivity keyguardpendingintentactivity)
    {
        a = keyguardpendingintentactivity;
        super();
    }

    public void run()
    {
        KeyguardPendingIntentActivity.c(a);
        KeyguardPendingIntentActivity.d(a).postDelayed(new d(this), 700L);
    }
}
