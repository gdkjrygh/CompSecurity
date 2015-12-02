// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import com.facebook.auth.annotations.LoggedInUser;
import com.facebook.common.executors.DefaultExecutorService;
import com.facebook.common.time.a;
import com.facebook.inject.d;
import com.facebook.orca.annotations.IsClientSmsEnabled;
import com.facebook.orca.annotations.IsSmsReadPermitted;
import com.facebook.orca.g.aa;
import com.facebook.orca.g.r;
import com.facebook.user.User;
import com.google.common.d.a.u;

// Referenced classes of package com.facebook.orca.sms:
//            ac, af, ah, ai

class at extends d
{

    final ah a;

    private at(ah ah)
    {
        a = ah;
        super();
    }

    at(ah ah, ai ai)
    {
        this(ah);
    }

    public ac a()
    {
        return new ac(b(com/facebook/user/User, com/facebook/auth/annotations/LoggedInUser), b(java/lang/Boolean, com/facebook/orca/annotations/IsClientSmsEnabled), b(java/lang/Boolean, com/facebook/orca/annotations/IsSmsReadPermitted), (aa)a(com/facebook/orca/g/aa), (r)a(com/facebook/orca/g/r), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (af)a(com/facebook/orca/sms/af), (u)a(com/google/common/d/a/u, com/facebook/common/executors/DefaultExecutorService), (a)a(com/facebook/common/time/a));
    }

    public Object b()
    {
        return a();
    }
}
