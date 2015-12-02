// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.backgroundlocation.status;

import com.facebook.f.f;
import com.facebook.inject.a.a;
import com.facebook.inject.a.g;
import com.facebook.inject.aj;
import com.facebook.inject.c;

// Referenced classes of package com.facebook.backgroundlocation.status:
//            b, IsBackgroundLocationEnabled, i, c, 
//            d, h, a, g

public class e extends c
{

    public e()
    {
    }

    protected void a()
    {
        c(com/facebook/f/f).a(com/facebook/backgroundlocation/status/b);
        a(java/lang/Boolean).a(com/facebook/backgroundlocation/status/IsBackgroundLocationEnabled).c(com/facebook/backgroundlocation/status/i);
        c(com/facebook/nux/status/e).a(com/facebook/backgroundlocation/status/c);
        a(com/facebook/backgroundlocation/status/d).a(new h(this, null)).a();
        c(com/facebook/analytics/d/a).a(com/facebook/backgroundlocation/status/a);
        a(com/facebook/backgroundlocation/status/a).a(new com.facebook.backgroundlocation.status.g(this, null)).a();
    }
}
