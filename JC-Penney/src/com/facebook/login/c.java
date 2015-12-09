// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.os.Bundle;
import com.facebook.b.ai;

// Referenced classes of package com.facebook.login:
//            GetTokenLoginMethodHandler

class c
    implements ai
{

    final LoginClient.Request a;
    final GetTokenLoginMethodHandler b;

    c(GetTokenLoginMethodHandler gettokenloginmethodhandler, LoginClient.Request request)
    {
        b = gettokenloginmethodhandler;
        a = request;
        super();
    }

    public void a(Bundle bundle)
    {
        b.a(a, bundle);
    }
}
