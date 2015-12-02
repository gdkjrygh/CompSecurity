// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import android.os.Handler;
import com.facebook.common.time.a;

// Referenced classes of package com.facebook.orca.d:
//            as

class at
    implements Runnable
{

    final as a;

    at(as as1)
    {
        a = as1;
        super();
    }

    public void run()
    {
        com.facebook.orca.d.as.a(a, com.facebook.orca.d.as.a(a).a() - as.b(a));
        as.d(a).postDelayed(as.c(a), 50L);
    }
}
