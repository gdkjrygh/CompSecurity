// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import com.facebook.common.executors.a;

// Referenced classes of package com.facebook.orca.d:
//            af, ah

class ag
    implements Runnable
{

    final af a;

    ag(af af1)
    {
        a = af1;
        super();
    }

    public void run()
    {
        com.facebook.orca.d.af.a(a).a();
        com.facebook.orca.d.af.a(a, new ah(this));
    }
}
