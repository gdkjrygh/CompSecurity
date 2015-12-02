// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.debug.a;

import android.os.Looper;
import android.os.MessageQueue;
import com.facebook.debug.d.e;

// Referenced classes of package com.facebook.debug.a:
//            b

public class a
{

    private static Class a = com/facebook/debug/a/a;
    private final com.facebook.common.executors.a b;
    private e c;

    public a(com.facebook.common.executors.a a1)
    {
        b = a1;
        a1.a();
    }

    static e a(a a1)
    {
        return a1.c;
    }

    static Class a()
    {
        return a;
    }

    private void b()
    {
        Looper.myQueue().addIdleHandler(new b(this));
    }

    public void a(e e)
    {
        b.a();
        c = e;
        b();
    }

}
