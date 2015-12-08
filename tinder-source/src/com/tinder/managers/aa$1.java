// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.tinder.e.am;
import com.tinder.events.EventPurchaseFlowComplete;
import com.tinder.events.EventPurchaseFlowError;
import com.tinder.model.SuperlikeStatus;
import com.tinder.model.TinderPurchase;
import de.greenrobot.event.c;

// Referenced classes of package com.tinder.managers:
//            aa, ab

final class a
    implements am
{

    final aa a;

    public final void a(TinderPurchase tinderpurchase)
    {
        a.c.i.reset();
        a.b.c(new EventPurchaseFlowComplete(tinderpurchase));
    }

    public final void a(String s, String s1)
    {
        a.b.c(new EventPurchaseFlowError(s, s1));
    }

    rchase(aa aa1)
    {
        a = aa1;
        super();
    }
}
