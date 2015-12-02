// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts;

import android.support.v4.a.e;
import com.facebook.analytics.av;
import com.facebook.contacts.upload.c;
import com.facebook.fbservice.ops.k;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.contacts:
//            a, b

class t extends d
{

    final a a;

    private t(a a1)
    {
        a = a1;
        super();
    }

    t(a a1, b b1)
    {
        this(a1);
    }

    public c a()
    {
        return new c((k)a(com/facebook/fbservice/ops/k), (e)a(android/support/v4/a/e), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (av)a(com/facebook/analytics/av));
    }

    public Object b()
    {
        return a();
    }
}
