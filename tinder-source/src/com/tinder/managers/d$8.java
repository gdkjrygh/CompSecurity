// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.android.volley.VolleyError;
import com.tinder.e.k;
import com.tinder.model.SparksEvent;
import com.tinder.utils.v;

// Referenced classes of package com.tinder.managers:
//            d, ae, a

final class a
    implements com.android.volley.
{

    final k a;
    final d b;

    public final void a(VolleyError volleyerror)
    {
        SparksEvent sparksevent = new SparksEvent("Account.InstagramLogoutFail");
        d.c(b);
        sparksevent.put("instagramName", com.tinder.managers.ae.v());
        com.tinder.managers.a.a(sparksevent);
        v.b((new StringBuilder("LogoutInstagram onErrorResponse: ")).append(volleyerror).toString());
        a.b();
    }

    yError(d d1, k k1)
    {
        b = d1;
        a = k1;
        super();
    }
}
