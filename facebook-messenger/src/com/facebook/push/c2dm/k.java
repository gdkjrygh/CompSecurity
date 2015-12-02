// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.c2dm;

import com.facebook.auth.annotations.LoggedInUserId;
import com.facebook.config.b.a;
import com.facebook.inject.d;
import com.facebook.push.annotations.IsGcmEnabled;

// Referenced classes of package com.facebook.push.c2dm:
//            y, d, e

class k extends d
{

    final com.facebook.push.c2dm.d a;

    private k(com.facebook.push.c2dm.d d1)
    {
        a = d1;
        super();
    }

    k(com.facebook.push.c2dm.d d1, e e)
    {
        this(d1);
    }

    public y a()
    {
        return new y((com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), b(java/lang/String, com/facebook/auth/annotations/LoggedInUserId), ((Boolean)a(java/lang/Boolean, com/facebook/push/annotations/IsGcmEnabled)).booleanValue(), ((a)a(com/facebook/config/b/a)).b());
    }

    public Object b()
    {
        return a();
    }
}
