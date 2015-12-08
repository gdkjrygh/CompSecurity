// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            s, r

class ep
    implements Runnable
{

    private final WeakReference eo;
    final r ep;
    final s eq;

    public void run()
    {
        s.a(eq, false);
        r r1 = (r)eo.get();
        if (r1 != null)
        {
            r1.b(s.a(eq));
        }
    }

    (s s1, r r1)
    {
        eq = s1;
        ep = r1;
        super();
        eo = new WeakReference(ep);
    }
}
