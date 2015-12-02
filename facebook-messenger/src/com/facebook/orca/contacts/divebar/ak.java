// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import com.facebook.debug.log.b;
import com.google.common.d.a.h;
import java.util.concurrent.CancellationException;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            ad

class ak
    implements h
{

    final ad a;

    ak(ad ad1)
    {
        a = ad1;
        super();
    }

    public volatile void a(Object obj)
    {
        a((Void)obj);
    }

    public void a(Throwable throwable)
    {
        if (!(throwable instanceof CancellationException) && b.b(6))
        {
            b.d("orca:FriendListsLoader", "Failed to cancel pending fetches", throwable);
        }
        ad.a(a, null);
    }

    public void a(Void void1)
    {
        ad.a(a, null);
    }
}
