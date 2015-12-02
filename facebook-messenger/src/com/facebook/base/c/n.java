// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import android.telephony.TelephonyManager;
import com.facebook.common.executors.DefaultExecutorService;
import com.facebook.common.hardware.f;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.facebook.base.c:
//            a, b

class n extends d
{

    final a a;

    private n(a a1)
    {
        a = a1;
        super();
    }

    n(a a1, b b1)
    {
        this(a1);
    }

    public f a()
    {
        return new f((TelephonyManager)e().a(android/telephony/TelephonyManager), (ExecutorService)a(java/util/concurrent/ExecutorService, com/facebook/common/executors/DefaultExecutorService));
    }

    public Object b()
    {
        return a();
    }
}
