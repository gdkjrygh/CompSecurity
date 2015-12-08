// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.flurry.sdk:
//            fc, ey, el, do

class nit> extends fc
{

    final ey a;

    public void a()
    {
        try
        {
            for (Iterator iterator = ey.a(a).iterator(); iterator.hasNext(); ((asNext)iterator.next()).a(a)) { }
        }
        catch (Throwable throwable)
        {
            el.a(6, ey.e(), "", throwable);
        }
        if (ey.b(a) && ey.c(a))
        {
            com.flurry.sdk.do.a().a(ey.d(a), ey.e(a));
        }
    }

    (ey ey1)
    {
        a = ey1;
        super();
    }
}
