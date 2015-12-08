// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.os.Bundle;
import com.facebook.internal.bk;
import com.facebook.l;

// Referenced classes of package com.facebook.login:
//            WebViewLoginMethodHandler

final class r
    implements bk
{

    final LoginClient.Request a;
    final WebViewLoginMethodHandler b;

    r(WebViewLoginMethodHandler webviewloginmethodhandler, LoginClient.Request request)
    {
        b = webviewloginmethodhandler;
        a = request;
        super();
    }

    public final void a(Bundle bundle, l l)
    {
        b.a(a, bundle, l);
    }
}
