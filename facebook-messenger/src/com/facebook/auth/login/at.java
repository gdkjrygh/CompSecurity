// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import android.content.Context;
import android.support.v4.a.e;
import com.facebook.auth.c.b;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.auth.login:
//            v, ap, aq

class at extends d
{

    final ap a;

    private at(ap ap)
    {
        a = ap;
        super();
    }

    at(ap ap, aq aq)
    {
        this(ap);
    }

    public v a()
    {
        return new v(e.a((Context)e().a(android/content/Context)), (b)a(com/facebook/auth/c/b));
    }

    public Object b()
    {
        return a();
    }
}
