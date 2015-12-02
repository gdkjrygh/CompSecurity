// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import com.facebook.inject.d;
import com.facebook.orca.annotations.IsSmsNotifyEnabled;
import com.facebook.orca.annotations.IsSmsReceivePermitted;
import com.facebook.orca.nux.h;
import com.facebook.orca.phonenumber.identification.f;
import com.facebook.orca.push.sms.b;

// Referenced classes of package com.facebook.orca.sms:
//            ah, ai

class ba extends d
{

    final ah a;

    private ba(ah ah)
    {
        a = ah;
        super();
    }

    ba(ah ah, ai ai)
    {
        this(ah);
    }

    public b a()
    {
        return new b(b(java/lang/Boolean, com/facebook/orca/annotations/IsSmsNotifyEnabled), b(java/lang/Boolean, com/facebook/orca/annotations/IsSmsReceivePermitted), (h)a(com/facebook/orca/nux/h), (f)a(com/facebook/orca/phonenumber/identification/f));
    }

    public Object b()
    {
        return a();
    }
}
