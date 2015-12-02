// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import com.facebook.auth.annotations.LoggedInUser;
import com.facebook.inject.d;
import com.facebook.orca.p.a;
import com.facebook.user.User;
import com.facebook.user.i;

// Referenced classes of package com.facebook.orca.sms:
//            bk, ah, ai

class ax extends d
{

    final ah a;

    private ax(ah ah)
    {
        a = ah;
        super();
    }

    ax(ah ah, ai ai)
    {
        this(ah);
    }

    public bk a()
    {
        return new bk(b(com/facebook/user/User, com/facebook/auth/annotations/LoggedInUser), (a)a(com/facebook/orca/p/a), (i)a(com/facebook/user/i));
    }

    public Object b()
    {
        return a();
    }
}
