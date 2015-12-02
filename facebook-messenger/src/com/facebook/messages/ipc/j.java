// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.ipc;

import android.content.Context;
import com.facebook.auth.annotations.LoggedInUserId;
import com.facebook.c.l;
import com.facebook.config.a.a;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.messages.ipc:
//            e, g

class j extends d
{

    private j()
    {
    }

    j(g g)
    {
        this();
    }

    public e a()
    {
        return new e((Context)a(android/content/Context), b(java/lang/String, com/facebook/auth/annotations/LoggedInUserId), ((a)a(com/facebook/config/a/a)).j(), (l)a(com/facebook/c/l));
    }

    public Object b()
    {
        return a();
    }
}
