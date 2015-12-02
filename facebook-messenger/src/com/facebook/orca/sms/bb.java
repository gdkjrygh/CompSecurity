// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import android.content.Context;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.orca.sms:
//            bn, bk, ah, ai

class bb extends d
{

    final ah a;

    private bb(ah ah)
    {
        a = ah;
        super();
    }

    bb(ah ah, ai ai)
    {
        this(ah);
    }

    public bn a()
    {
        return new bn((Context)e().a(android/content/Context), (bk)a(com/facebook/orca/sms/bk));
    }

    public Object b()
    {
        return a();
    }
}
