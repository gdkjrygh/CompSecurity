// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import com.facebook.base.activity.d;
import com.facebook.orca.activity.k;
import com.facebook.orca.common.ui.titlebar.a;

// Referenced classes of package com.facebook.orca.threadlist:
//            s, t

public class FrameworkBasedThreadListActivity extends d
    implements k, s
{

    private final t p;

    public FrameworkBasedThreadListActivity()
    {
        this(new t());
    }

    private FrameworkBasedThreadListActivity(t t1)
    {
        super(t1);
        p = t1;
    }

    public t a()
    {
        return p;
    }

    public a c()
    {
        return p.c();
    }

    public boolean c_()
    {
        return true;
    }
}
