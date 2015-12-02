// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.push.b;

import com.facebook.config.a.a;
import com.facebook.inject.d;
import com.facebook.orca.annotations.IsAppIconBadgingEnabled;
import com.facebook.orca.annotations.IsPresenceEnabled;
import com.facebook.orca.annotations.IsVoipEnabledForUser;

// Referenced classes of package com.facebook.orca.push.b:
//            h, b, c

class f extends d
{

    final b a;

    private f(b b1)
    {
        a = b1;
        super();
    }

    f(b b1, c c)
    {
        this(b1);
    }

    public h a()
    {
        return new h((a)a(com/facebook/config/a/a), b(java/lang/Boolean, com/facebook/orca/annotations/IsAppIconBadgingEnabled), b(java/lang/Boolean, com/facebook/orca/annotations/IsPresenceEnabled), b(java/lang/Boolean, com/facebook/orca/annotations/IsVoipEnabledForUser));
    }

    public Object b()
    {
        return a();
    }
}
