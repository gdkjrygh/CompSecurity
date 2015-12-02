// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.location;

import android.location.Geocoder;
import com.facebook.common.executors.DefaultExecutorService;
import com.facebook.inject.d;
import com.google.common.d.a.u;

// Referenced classes of package com.facebook.location:
//            d, c, s, t

class v extends d
{

    final s a;

    private v(s s)
    {
        a = s;
        super();
    }

    v(s s, t t)
    {
        this(s);
    }

    public com.facebook.location.d a()
    {
        return new com.facebook.location.d((Geocoder)a(android/location/Geocoder), (c)a(com/facebook/location/c), (u)a(com/google/common/d/a/u, com/facebook/common/executors/DefaultExecutorService));
    }

    public Object b()
    {
        return a();
    }
}
