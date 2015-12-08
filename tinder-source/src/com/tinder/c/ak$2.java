// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import com.a.a.a.a.f;
import com.tinder.adapters.ad;
import com.tinder.e.x;
import com.tinder.managers.a;
import com.tinder.managers.ab;
import com.tinder.managers.ae;
import com.tinder.model.SparksEvent;
import com.tinder.model.SuperlikeStatus;
import com.tinder.utils.r;
import com.tinder.utils.t;
import com.tinder.utils.v;
import org.json.JSONException;

// Referenced classes of package com.tinder.c:
//            ak, n

final class init>
    implements com.tinder.utils.>
{

    final ad a;
    final ak b;

    public final void a(int i)
    {
        f f1 = a.a(i);
        com.tinder.c.ak.a(b, new init>(f1, -1));
        ak.c(b).a(f1);
        SparksEvent sparksevent = new SparksEvent("TinderPlus.Select");
        sparksevent.put("term", Integer.valueOf(r.b(ak.b(b)..a)));
        f f2 = r.b(com.tinder.c.ak.a(b));
        if (f2 != null)
        {
            sparksevent.put("basePrice", f2.f);
        }
        try
        {
            sparksevent.put("products", com.tinder.c.n.a(com.tinder.c.ak.a(b)));
        }
        catch (JSONException jsonexception)
        {
            v.a("Failed to create product JSON for product selection anayltics", jsonexception);
        }
        if (f1 != null)
        {
            sparksevent.put("sku", f1.a);
            sparksevent.put("price", f1.f);
            sparksevent.put("locale", t.b());
            sparksevent.put("currency", f1.e);
            sparksevent.put("paywallVersion", Integer.valueOf(4));
            sparksevent.put("percentLikesLeft", Integer.valueOf(b.a.g));
            sparksevent.put("unlimitedLikesOffered", Boolean.valueOf(ae.u()));
            sparksevent.put("superLikesRemaining", Integer.valueOf(b.a.i.numRemaining));
            com.tinder.managers.a.a(sparksevent);
        }
    }

    s.ad(ak ak1, ad ad1)
    {
        b = ak1;
        a = ad1;
        super();
    }
}
