// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.os.Bundle;
import com.facebook.b.az;
import com.facebook.m;

// Referenced classes of package com.facebook.login:
//            WebViewLoginMethodHandler

class t
    implements az
{

    final LoginClient.Request a;
    final WebViewLoginMethodHandler b;

    t(WebViewLoginMethodHandler webviewloginmethodhandler, LoginClient.Request request)
    {
        b = webviewloginmethodhandler;
        a = request;
        super();
    }

    public void a(Bundle bundle, m m)
    {
        b.a(a, bundle, m);
    }
}
