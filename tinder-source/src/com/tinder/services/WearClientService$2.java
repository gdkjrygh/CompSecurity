// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.services;

import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;

// Referenced classes of package com.tinder.services:
//            WearClientService

final class a
    implements g
{

    final WearClientService a;

    public final void a(f f)
    {
        f = (com.google.android.gms.wearable._cls1)f;
        (new StringBuilder("recs result sent .. status ")).append(f._mth1());
    }

    (WearClientService wearclientservice)
    {
        a = wearclientservice;
        super();
    }
}
