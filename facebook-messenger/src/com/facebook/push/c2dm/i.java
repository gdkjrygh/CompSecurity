// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.c2dm;

import com.facebook.auth.annotations.LoggedInUserId;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.push.c2dm:
//            s, C2DMRegistrar, FacebookPushServerRegistrar, d, 
//            e

class i extends d
{

    final com.facebook.push.c2dm.d a;

    private i(com.facebook.push.c2dm.d d1)
    {
        a = d1;
        super();
    }

    i(com.facebook.push.c2dm.d d1, e e)
    {
        this(d1);
    }

    public s a()
    {
        return new s((C2DMRegistrar)a(com/facebook/push/c2dm/C2DMRegistrar), (FacebookPushServerRegistrar)a(com/facebook/push/c2dm/FacebookPushServerRegistrar), b(java/lang/String, com/facebook/auth/annotations/LoggedInUserId));
    }

    public Object b()
    {
        return a();
    }
}
