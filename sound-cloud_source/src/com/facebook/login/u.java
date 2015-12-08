// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.os.Bundle;
import com.facebook.p;

// Referenced classes of package com.facebook.login:
//            WebViewLoginMethodHandler

final class u
    implements com.facebook.internal.Z.c
{

    final LoginClient.Request a;
    final WebViewLoginMethodHandler b;

    u(WebViewLoginMethodHandler webviewloginmethodhandler, LoginClient.Request request)
    {
        b = webviewloginmethodhandler;
        a = request;
        super();
    }

    public final void a(Bundle bundle, p p)
    {
        b.a(a, bundle, p);
    }
}
