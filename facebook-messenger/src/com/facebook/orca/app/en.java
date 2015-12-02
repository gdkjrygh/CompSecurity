// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.ComponentName;
import com.facebook.inject.d;
import com.facebook.orca.activity.m;
import com.facebook.orca.c.a;
import com.facebook.orca.nux.h;
import com.facebook.orca.threadlist.ForThreadListActivity;

// Referenced classes of package com.facebook.orca.app:
//            dv, dw

class en extends d
{

    final dv a;

    private en(dv dv)
    {
        a = dv;
        super();
    }

    en(dv dv, dw dw)
    {
        this(dv);
    }

    public m a()
    {
        return new m((h)a(com/facebook/orca/nux/h), (a)a(com/facebook/orca/c/a), (ComponentName)a(android/content/ComponentName, com/facebook/orca/threadlist/ForThreadListActivity));
    }

    public Object b()
    {
        return a();
    }
}
