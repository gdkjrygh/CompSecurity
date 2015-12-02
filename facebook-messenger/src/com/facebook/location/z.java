// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.location;

import android.content.Context;
import android.location.LocationManager;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.location:
//            aa, s, t

class z extends d
{

    final s a;

    private z(s s)
    {
        a = s;
        super();
    }

    z(s s, t t)
    {
        this(s);
    }

    public aa a()
    {
        return new aa((Context)e().a(android/content/Context), (LocationManager)e().a(android/location/LocationManager));
    }

    public Object b()
    {
        return a();
    }
}
