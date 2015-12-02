// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import android.content.Context;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.orca.sms:
//            ab, ah, ai

class as extends d
{

    final ah a;

    private as(ah ah)
    {
        a = ah;
        super();
    }

    as(ah ah, ai ai)
    {
        this(ah);
    }

    public com.facebook.orca.sms.ab a()
    {
        return new com.facebook.orca.sms.ab((Context)e().a(android/content/Context));
    }

    public Object b()
    {
        return a();
    }
}
