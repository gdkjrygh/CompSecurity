// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.view.WindowManager;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.orca.chatheads:
//            ae, cn, co

class cs extends d
{

    final cn a;

    private cs(cn cn)
    {
        a = cn;
        super();
    }

    cs(cn cn, co co)
    {
        this(cn);
    }

    public ae a()
    {
        return new ae((WindowManager)a(android/view/WindowManager));
    }

    public Object b()
    {
        return a();
    }
}
