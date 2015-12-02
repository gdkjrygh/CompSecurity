// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.ComponentName;
import android.content.Context;
import com.facebook.inject.d;
import com.facebook.orca.threadlist.FrameworkBasedThreadListActivity;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class cu extends d
{

    final h a;

    private cu(h h)
    {
        a = h;
        super();
    }

    cu(h h, i i)
    {
        this(h);
    }

    public ComponentName a()
    {
        return new ComponentName((Context)a(android/content/Context), com/facebook/orca/threadlist/FrameworkBasedThreadListActivity);
    }

    public Object b()
    {
        return a();
    }
}
