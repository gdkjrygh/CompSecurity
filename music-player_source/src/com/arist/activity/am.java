// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.os.Handler;
import android.os.Message;
import com.ijoysoft.a.a;

// Referenced classes of package com.arist.activity:
//            an, WelcomeActivity

final class am extends Handler
{

    final WelcomeActivity a;

    am(WelcomeActivity welcomeactivity)
    {
        a = welcomeactivity;
        super();
    }

    static WelcomeActivity a(am am1)
    {
        return am1.a;
    }

    public final void handleMessage(Message message)
    {
        com.ijoysoft.a.a.a().a(new an(this));
    }
}
