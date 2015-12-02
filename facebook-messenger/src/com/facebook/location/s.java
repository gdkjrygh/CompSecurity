// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.location;

import com.facebook.auth.f.b;
import com.facebook.inject.a.a;
import com.facebook.inject.a.g;
import com.facebook.inject.aj;
import com.facebook.inject.c;

// Referenced classes of package com.facebook.location:
//            r, y, h, w, 
//            aa, z, c, u, 
//            d, v, q, x

public class s extends c
{

    public s()
    {
    }

    protected void a()
    {
        a(com/facebook/location/r).a(new y(this, null)).a();
        a(com/facebook/location/h).a(new w(this, null));
        a(com/facebook/location/aa).a(new z(this, null));
        a(com/facebook/location/c).a(new u(null)).a();
        a(com/facebook/location/d).a(new v(this, null));
        c(com/facebook/auth/f/b).a(com/facebook/location/r);
        c(com/facebook/auth/f/b).a(com/facebook/location/c);
        c(com/facebook/analytics/d/a).a(com/facebook/location/q);
        a(com/facebook/location/q).a(new x(this, null)).a();
    }
}
