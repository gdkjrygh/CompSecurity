// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            AdResponseParcel

public final class g extends k.a
{

    private final WeakReference a;

    public g(c.a a1)
    {
        a = new WeakReference(a1);
    }

    public final void a(AdResponseParcel adresponseparcel)
    {
        c.a a1 = (c.a)a.get();
        if (a1 != null)
        {
            a1.a(adresponseparcel);
        }
    }
}
