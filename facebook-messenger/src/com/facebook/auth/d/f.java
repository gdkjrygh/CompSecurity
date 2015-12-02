// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.d;

import android.app.Activity;
import com.facebook.auth.b.b;
import com.facebook.auth.login.al;
import com.facebook.auth.login.w;
import com.facebook.fbservice.ops.o;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.auth.d:
//            b, c

class f extends d
{

    final com.facebook.auth.d.b a;

    private f(com.facebook.auth.d.b b1)
    {
        a = b1;
        super();
    }

    f(com.facebook.auth.d.b b1, c c)
    {
        this(b1);
    }

    public w a()
    {
        return new w((Activity)a(android/app/Activity), (b)a(com/facebook/auth/b/b), (com.facebook.base.a.d)a(com/facebook/base/a/d), (o)a(com/facebook/fbservice/ops/o), (al)a(com/facebook/auth/login/al));
    }

    public Object b()
    {
        return a();
    }
}
