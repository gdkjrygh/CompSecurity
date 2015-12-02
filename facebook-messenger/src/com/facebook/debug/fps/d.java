// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.debug.fps;

import com.facebook.base.activity.f;
import com.facebook.inject.a.a;
import com.facebook.inject.a.c;
import com.facebook.inject.a.g;
import com.facebook.inject.aj;
import com.facebook.inject.b;
import java.util.EnumSet;

// Referenced classes of package com.facebook.debug.fps:
//            a, g, b, f, 
//            e, k

public class d extends b
{

    public d()
    {
    }

    protected void a()
    {
        a(com/facebook/debug/fps/a).a(new com.facebook.debug.fps.g(this, null)).a();
        a(com/facebook/debug/fps/b).a(new com.facebook.debug.fps.f(this, null));
        b(com.google.inject.a.a(new e(this))).a(EnumSet.noneOf(com/facebook/debug/fps/k));
        c(com/facebook/base/activity/f).a(com/facebook/debug/fps/b);
    }
}
