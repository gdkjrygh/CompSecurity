// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import android.content.Context;
import com.facebook.c.s;
import com.facebook.inject.d;
import com.facebook.orca.annotations.IsClientSmsEnabled;
import com.facebook.orca.annotations.IsSmsReadPermitted;
import com.facebook.user.i;

// Referenced classes of package com.facebook.orca.sms:
//            bo, ah, ai

class bc extends d
{

    final ah a;

    private bc(ah ah)
    {
        a = ah;
        super();
    }

    bc(ah ah, ai ai)
    {
        this(ah);
    }

    public bo a()
    {
        return new bo((Context)a(android/content/Context), b(java/lang/Boolean, com/facebook/orca/annotations/IsClientSmsEnabled), b(java/lang/Boolean, com/facebook/orca/annotations/IsSmsReadPermitted), (s)a(com/facebook/c/s), (i)a(com/facebook/user/i));
    }

    public Object b()
    {
        return a();
    }
}
