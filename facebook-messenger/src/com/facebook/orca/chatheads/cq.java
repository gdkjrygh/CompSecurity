// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.content.Context;
import android.os.Handler;
import android.view.WindowManager;
import com.facebook.inject.d;
import com.facebook.orca.chatheads.b.f;

// Referenced classes of package com.facebook.orca.chatheads:
//            cn, co

class cq extends d
{

    final cn a;

    private cq(cn cn)
    {
        a = cn;
        super();
    }

    cq(cn cn, co co)
    {
        this(cn);
    }

    public f a()
    {
        return new f((Context)a(android/content/Context), (WindowManager)a(android/view/WindowManager), (Handler)a(android/os/Handler));
    }

    public Object b()
    {
        return a();
    }
}
