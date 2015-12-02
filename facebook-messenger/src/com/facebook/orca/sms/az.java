// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import com.facebook.inject.d;
import com.facebook.orca.annotations.IsClientSmsEnabled;
import com.facebook.orca.annotations.IsSmsNotifyEnabled;
import com.facebook.orca.annotations.IsSmsReadPermitted;
import com.facebook.orca.nux.h;
import com.facebook.orca.push.sms.a;

// Referenced classes of package com.facebook.orca.sms:
//            ah, ai

class az extends d
{

    final ah a;

    private az(ah ah)
    {
        a = ah;
        super();
    }

    az(ah ah, ai ai)
    {
        this(ah);
    }

    public a a()
    {
        return new a(b(java/lang/Boolean, com/facebook/orca/annotations/IsSmsNotifyEnabled), b(java/lang/Boolean, com/facebook/orca/annotations/IsClientSmsEnabled), b(java/lang/Boolean, com/facebook/orca/annotations/IsSmsReadPermitted), (h)a(com/facebook/orca/nux/h));
    }

    public Object b()
    {
        return a();
    }
}
