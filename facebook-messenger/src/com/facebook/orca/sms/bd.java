// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import com.facebook.inject.d;
import com.facebook.orca.annotations.IsSmsNotifyEnabled;
import com.facebook.orca.annotations.IsSmsReadPermitted;
import com.facebook.orca.g.b;
import com.facebook.orca.sms.a.c;

// Referenced classes of package com.facebook.orca.sms:
//            bn, af, ah, ai

class bd extends d
{

    final ah a;

    private bd(ah ah)
    {
        a = ah;
        super();
    }

    bd(ah ah, ai ai)
    {
        this(ah);
    }

    public c a()
    {
        return new c((bn)a(com/facebook/orca/sms/bn), (b)a(com/facebook/orca/g/b), (com.facebook.orca.push.b)a(com/facebook/orca/push/b), (af)a(com/facebook/orca/sms/af), b(java/lang/Boolean, com/facebook/orca/annotations/IsSmsReadPermitted), b(java/lang/Boolean, com/facebook/orca/annotations/IsSmsNotifyEnabled));
    }

    public Object b()
    {
        return a();
    }
}
