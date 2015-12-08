// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.a.a.a.a.g;
import com.tinder.e.am;
import com.tinder.events.EventPurchaseRestoreConfirmed;
import com.tinder.events.EventPurchaseRestoreFailed;
import com.tinder.model.SuperlikeStatus;
import com.tinder.model.TinderPurchase;
import com.tinder.utils.v;
import de.greenrobot.event.c;

// Referenced classes of package com.tinder.managers:
//            aa, ab, ae

final class b
    implements am
{

    final g a;
    final boolean b;
    final aa c;

    public final void a(TinderPurchase tinderpurchase)
    {
        c.c.i.reset();
        c.b.c(new EventPurchaseRestoreConfirmed(a, b));
    }

    public final void a(String s, String s1)
    {
        v.b((new StringBuilder("Purchase or restore failed api verification, sku: ")).append(s).toString());
        if (!ae.a())
        {
            c.b.c(new EventPurchaseRestoreFailed(s, s1, b));
        }
    }

    rchase(aa aa1, g g, boolean flag)
    {
        c = aa1;
        a = g;
        b = flag;
        super();
    }
}
