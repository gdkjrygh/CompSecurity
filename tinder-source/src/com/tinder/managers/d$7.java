// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.tinder.e.k;
import com.tinder.model.InstagramDataSet;
import com.tinder.model.SparksEvent;
import com.tinder.model.UserMeta;

// Referenced classes of package com.tinder.managers:
//            d, ae, a

final class a
    implements com.android.volley.
{

    final k a;
    final d b;

    public final void a(Object obj)
    {
        obj = new SparksEvent("Account.InstagramLogoutSuccess");
        d.c(b);
        ((SparksEvent) (obj)).put("instagramName", ae.v());
        com.tinder.managers.a.a(((SparksEvent) (obj)));
        a.a();
        d.c(b);
        ae.a("");
        d.h().instagramDataSet = new InstagramDataSet();
        d.c(b);
        ae.w();
    }

    a(d d1, k k1)
    {
        b = d1;
        a = k1;
        super();
    }
}
