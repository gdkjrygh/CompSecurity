// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.flurry.sdk:
//            ff, fb, eo, do

class nit> extends ff
{

    final fb a;

    public void a()
    {
        try
        {
            for (Iterator iterator = fb.a(a).iterator(); iterator.hasNext(); ((asNext)iterator.next()).a(a)) { }
        }
        catch (Throwable throwable)
        {
            eo.a(6, fb.e(), "", throwable);
        }
        if (fb.b(a) && fb.c(a))
        {
            com.flurry.sdk.do.a().a(fb.d(a), fb.e(a));
        }
    }

    (fb fb1)
    {
        a = fb1;
        super();
    }
}
