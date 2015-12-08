// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import com.a.a.a.a.f;
import com.tinder.adapters.ad;
import com.tinder.e.x;
import com.tinder.fragments.FragmentSideMenu;
import com.tinder.managers.a;
import com.tinder.managers.ab;
import com.tinder.managers.ae;
import com.tinder.model.SparksEvent;
import com.tinder.utils.r;
import com.tinder.utils.t;
import com.tinder.utils.v;
import org.json.JSONException;

// Referenced classes of package com.tinder.c:
//            n

final class <init>
    implements com.tinder.utils.
{

    final n a;

    public final void a(int i)
    {
        com.tinder.c.n.a(a, new <init>(com.tinder.c.n.a(a).a(i), i));
        f f1 = com.tinder.c.n.a(a).a(i);
        if (f1 == null)
        {
            v.b("User clicked on a paywall option, but the adapter had no product at that position.");
            return;
        }
        SparksEvent sparksevent = new SparksEvent("TinderPlus.Select");
        sparksevent.put("term", Integer.valueOf(r.b(n.b(a).b.a)));
        f f2 = r.b(n.c(a));
        if (f2 != null)
        {
            sparksevent.put("basePrice", f2.f);
        }
        try
        {
            sparksevent.put("products", com.tinder.c.n.a(n.c(a)));
        }
        catch (JSONException jsonexception)
        {
            v.a("Failed to create product JSON for product selection anayltics", jsonexception);
        }
        sparksevent.put("features", n.d(a));
        sparksevent.put("sku", f1.a);
        sparksevent.put("price", f1.f);
        sparksevent.put("locale", t.b());
        sparksevent.put("currency", f1.e);
        sparksevent.put("paywallVersion", Integer.valueOf(4));
        sparksevent.put("from", Integer.valueOf(n.e(a)));
        sparksevent.put("percentLikesLeft", Integer.valueOf(a.c.g));
        sparksevent.put("unlimitedLikesOffered", Boolean.valueOf(ae.u()));
        sparksevent.put("superLikesRemaining", Integer.valueOf(com.tinder.c.n.f(a)));
        if (n.e(a) == 5)
        {
            sparksevent.put("plusMenuOffer", FragmentSideMenu.c);
        }
        com.tinder.managers.a.a(sparksevent);
        n.g(a).a(f1);
    }

    ption(n n1)
    {
        a = n1;
        super();
    }
}
