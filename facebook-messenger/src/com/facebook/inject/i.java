// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;

import android.content.Context;
import com.facebook.inject.a.a;

// Referenced classes of package com.facebook.inject:
//            c, ContextScoped, n, k

class i extends c
{

    private final n a;
    private final Context b;

    i(n n1, Context context)
    {
        a = n1;
        b = context;
    }

    static n a(i j)
    {
        return j.a;
    }

    protected void a()
    {
        a(com/facebook/inject/ContextScoped, ((au) (a)));
        a(com/facebook/inject/n).a(a);
        a(android/content/Context).a(new k(this, null));
        a.a(b);
    }
}
