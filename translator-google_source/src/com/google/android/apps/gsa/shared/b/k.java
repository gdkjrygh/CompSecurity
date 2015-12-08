// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.b;

import com.google.android.apps.gsa.shared.util.a.g;
import com.google.android.apps.gsa.shared.util.common.L;
import com.google.common.b.ae;

// Referenced classes of package com.google.android.apps.gsa.shared.b:
//            h

final class k extends g
{

    final ae a;
    final byte b[] = null;
    final String c = null;

    k(String s, ae ae)
    {
        a = ae;
        super(s);
    }

    public final void a(Object obj)
    {
        h.a(a, c);
    }

    public final void a(Throwable throwable)
    {
        L.a(5, "EventLogger", "Failure in callback. Logging anyway.", new Object[0]);
        h.a(a, c);
    }
}
