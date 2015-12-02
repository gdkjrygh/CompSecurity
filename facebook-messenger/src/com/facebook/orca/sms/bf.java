// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import android.content.Context;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.orca.sms:
//            br, bn, af, ah, 
//            ai

class bf extends d
{

    final ah a;

    private bf(ah ah)
    {
        a = ah;
        super();
    }

    bf(ah ah, ai ai)
    {
        this(ah);
    }

    public br a()
    {
        return new br((Context)e().a(android/content/Context), (bn)a(com/facebook/orca/sms/bn), (af)a(com/facebook/orca/sms/af));
    }

    public Object b()
    {
        return a();
    }
}
