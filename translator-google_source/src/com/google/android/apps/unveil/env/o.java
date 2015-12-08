// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

// Referenced classes of package com.google.android.apps.unveil.env:
//            j, m

final class o extends PhantomReference
{

    final j a;
    final m b;

    public o(m m, j j, ReferenceQueue referencequeue, j j1)
    {
        b = m;
        super(j, referencequeue);
        a = j1;
    }
}
