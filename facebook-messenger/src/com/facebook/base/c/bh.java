// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import android.app.AlarmManager;
import android.content.Context;
import com.facebook.common.executors.z;
import com.facebook.common.time.a;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.base.c:
//            a, b

class bh extends d
{

    final com.facebook.base.c.a a;

    private bh(com.facebook.base.c.a a1)
    {
        a = a1;
        super();
    }

    bh(com.facebook.base.c.a a1, b b1)
    {
        this(a1);
    }

    public z a()
    {
        return new z((Context)e().a(android/content/Context), (a)a(com/facebook/common/time/a), (AlarmManager)e().a(android/app/AlarmManager), (com.facebook.common.executors.a)a(com/facebook/common/executors/a));
    }

    public Object b()
    {
        return a();
    }
}
