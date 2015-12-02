// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.k;

import android.location.Location;
import com.facebook.fbservice.service.OperationResult;
import com.google.common.base.Function;

// Referenced classes of package com.facebook.orca.k:
//            e

class f
    implements Function
{

    final e a;

    f(e e)
    {
        a = e;
        super();
    }

    public OperationResult a(Location location)
    {
        return OperationResult.a(location);
    }

    public Object apply(Object obj)
    {
        return a((Location)obj);
    }
}
