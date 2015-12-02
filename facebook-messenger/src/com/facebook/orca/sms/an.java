// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import android.content.Context;
import android.net.ConnectivityManager;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.orca.sms:
//            u, r, ah, ai

class an extends d
{

    final ah a;

    private an(ah ah)
    {
        a = ah;
        super();
    }

    an(ah ah, ai ai)
    {
        this(ah);
    }

    public u a()
    {
        return new u((Context)e().a(android/content/Context), (r)a(com/facebook/orca/sms/r), (ConnectivityManager)e().a(android/net/ConnectivityManager));
    }

    public Object b()
    {
        return a();
    }
}
