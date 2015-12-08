// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            y, u

class lm
    implements Runnable
{

    private final WeakReference ll;
    final u lm;
    final y ln;

    public void run()
    {
        y.a(ln, false);
        u u1 = (u)ll.get();
        if (u1 != null)
        {
            u1.b(y.a(ln));
        }
    }

    (y y1, u u1)
    {
        ln = y1;
        lm = u1;
        super();
        ll = new WeakReference(lm);
    }
}
