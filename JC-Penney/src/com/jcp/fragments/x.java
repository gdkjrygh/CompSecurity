// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.webkit.CookieManager;
import android.webkit.ValueCallback;

// Referenced classes of package com.jcp.fragments:
//            u

class x
    implements ValueCallback
{

    final CookieManager a;
    final u b;

    x(u u1, CookieManager cookiemanager)
    {
        b = u1;
        a = cookiemanager;
        super();
    }

    public void a(Boolean boolean1)
    {
        b.b(a);
        a.flush();
        u.d(b);
    }

    public void onReceiveValue(Object obj)
    {
        a((Boolean)obj);
    }
}
