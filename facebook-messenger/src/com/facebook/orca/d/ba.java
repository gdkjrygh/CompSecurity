// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import android.net.Uri;
import java.util.concurrent.Callable;

// Referenced classes of package com.facebook.orca.d:
//            az, bc

class ba
    implements Callable
{

    final bc a;
    final az b;

    ba(az az1, bc bc)
    {
        b = az1;
        a = bc;
        super();
    }

    public Uri a()
    {
        return az.a(b, a);
    }

    public Object call()
    {
        return a();
    }
}
