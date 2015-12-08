// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            ux, uj

final class ur extends ux
{

    private WeakReference b;

    ur(uj uj1)
    {
        b = new WeakReference(uj1);
    }

    public final void a()
    {
        uj uj1 = (uj)b.get();
        if (uj1 == null)
        {
            return;
        } else
        {
            uj.d(uj1);
            return;
        }
    }
}
