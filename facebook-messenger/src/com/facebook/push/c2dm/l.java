// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.c2dm;

import com.facebook.inject.d;

// Referenced classes of package com.facebook.push.c2dm:
//            ad, C2DMRegistrar, FacebookPushServerRegistrar, d, 
//            e

class l extends d
{

    final com.facebook.push.c2dm.d a;

    private l(com.facebook.push.c2dm.d d1)
    {
        a = d1;
        super();
    }

    l(com.facebook.push.c2dm.d d1, e e)
    {
        this(d1);
    }

    public ad a()
    {
        return new ad((C2DMRegistrar)a(com/facebook/push/c2dm/C2DMRegistrar), (FacebookPushServerRegistrar)a(com/facebook/push/c2dm/FacebookPushServerRegistrar));
    }

    public Object b()
    {
        return a();
    }
}
