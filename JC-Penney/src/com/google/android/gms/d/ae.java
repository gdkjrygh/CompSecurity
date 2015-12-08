// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.d;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.d:
//            z, ac, ad, aj

class ae
    implements Runnable
{

    final z a;
    final ad b;

    ae(ad ad1, z z1)
    {
        b = ad1;
        a = z1;
        super();
    }

    public void run()
    {
        a.h().a(a);
        for (Iterator iterator = ad.a(b).iterator(); iterator.hasNext(); ((aj)iterator.next()).a(a)) { }
        ad.a(b, a);
    }
}
