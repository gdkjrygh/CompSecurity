// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.services;

import com.tinder.e.aa;
import com.tinder.model.User;

// Referenced classes of package com.tinder.services:
//            WearClientService

final class a
    implements aa
{

    final WearClientService a;

    public final void onProfileLoadFailed()
    {
    }

    public final void onProfileLoaded(User user)
    {
        a.a(user);
    }

    (WearClientService wearclientservice)
    {
        a = wearclientservice;
        super();
    }
}
