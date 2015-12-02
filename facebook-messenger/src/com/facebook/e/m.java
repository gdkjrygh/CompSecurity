// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.e;

import android.content.Context;
import android.net.ConnectivityManager;
import com.facebook.common.time.a;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.e:
//            c, h, i

class m extends d
{

    final h a;

    private m(h h)
    {
        a = h;
        super();
    }

    m(h h, i i)
    {
        this(h);
    }

    public c a()
    {
        return new c((Context)e().a(android/content/Context), (ConnectivityManager)e().a(android/net/ConnectivityManager), (a)a(com/facebook/common/time/a), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d));
    }

    public Object b()
    {
        return a();
    }
}
