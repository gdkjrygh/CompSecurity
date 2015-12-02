// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.ComponentName;
import android.content.Context;
import com.facebook.c.s;
import com.facebook.inject.d;
import com.facebook.orca.annotations.IsClientSmsEnabled;
import com.facebook.orca.annotations.IsSmsReadPermitted;
import com.facebook.orca.intents.b;
import com.facebook.orca.threadlist.ForThreadListActivity;
import com.facebook.user.i;

// Referenced classes of package com.facebook.orca.app:
//            dv, dw

class ec extends d
{

    final dv a;

    private ec(dv dv)
    {
        a = dv;
        super();
    }

    ec(dv dv, dw dw)
    {
        this(dv);
    }

    public b a()
    {
        return new b((Context)a(android/content/Context), (i)a(com/facebook/user/i), (com.facebook.auth.b.b)a(com/facebook/auth/b/b), b(java/lang/Boolean, com/facebook/orca/annotations/IsClientSmsEnabled), b(java/lang/Boolean, com/facebook/orca/annotations/IsSmsReadPermitted), (s)a(com/facebook/c/s), (ComponentName)a(android/content/ComponentName, com/facebook/orca/threadlist/ForThreadListActivity), (com.facebook.b.a.b)a(com/facebook/b/a/b));
    }

    public Object b()
    {
        return a();
    }
}
