// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.sso;

import com.spotify.cosmos.android.DeferredResolver;
import com.spotify.mobile.android.util.logging.Logger;
import flz;
import fma;
import java.net.HttpCookie;

// Referenced classes of package com.spotify.mobile.android.sso:
//            AuthorizationActivity

final class a
    implements fma
{

    private flz a;
    private AuthorizationActivity b;

    public final void a(Throwable throwable)
    {
        Logger.b(throwable, "Bakery request failed", new Object[0]);
        AuthorizationActivity.a(b, "INTERNAL_ERROR");
        a.a.destroy();
    }

    public final void a(HttpCookie httpcookie)
    {
        a.a.destroy();
        AuthorizationActivity.b(b, httpcookie);
    }

    (AuthorizationActivity authorizationactivity, flz flz1)
    {
        b = authorizationactivity;
        a = flz1;
        super();
    }
}
