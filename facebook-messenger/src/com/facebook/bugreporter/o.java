// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter;

import com.facebook.bugreporter.activity.tasklist.j;
import com.facebook.bugreporter.annotations.IsOldVersionOfTheApp;
import com.facebook.bugreporter.annotations.IsRageShakeAvailable;
import com.facebook.inject.a.a;
import com.facebook.inject.a.g;
import com.facebook.inject.c;

// Referenced classes of package com.facebook.bugreporter:
//            f, r, d, q, 
//            g, t, m, s, 
//            ab, w, ae, v, 
//            z, u, c

public class o extends c
{

    public o()
    {
    }

    protected void a()
    {
        a(((com.facebook.inject.ag) (new j())));
        a(com/facebook/bugreporter/f).a(new r(this, null));
        a(com/facebook/bugreporter/d).a(new q(this, null));
        a(com/facebook/bugreporter/g).a(new t(this, null)).a();
        a(com/facebook/bugreporter/m).a(new s(this, null)).a();
        a(com/facebook/bugreporter/ab).a(new w(this, null)).a();
        a(com/facebook/bugreporter/ae).a(new v(this, null));
        b(java/lang/Boolean).a(com/facebook/bugreporter/annotations/IsRageShakeAvailable).a(Boolean.FALSE);
        b(java/lang/Boolean).a(com/facebook/bugreporter/annotations/IsOldVersionOfTheApp).a(Boolean.FALSE);
        a(com/facebook/bugreporter/z).a(new u(this, null));
        c(com/facebook/bugreporter/c);
    }
}
