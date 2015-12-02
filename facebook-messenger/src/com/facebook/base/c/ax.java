// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import android.content.Context;
import android.os.PowerManager;
import com.facebook.common.hardware.q;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.base.c:
//            a, b

class ax extends d
{

    final a a;

    private ax(a a1)
    {
        a = a1;
        super();
    }

    ax(a a1, b b1)
    {
        this(a1);
    }

    public q a()
    {
        return new q((Context)e().a(android/content/Context), (PowerManager)e().a(android/os/PowerManager));
    }

    public Object b()
    {
        return a();
    }
}
