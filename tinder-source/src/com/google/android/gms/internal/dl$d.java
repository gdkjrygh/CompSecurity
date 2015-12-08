// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            do, dl

static final class b extends do
{

    private WeakReference b;

    public final void a()
    {
        dl dl1 = (dl)b.get();
        if (dl1 == null)
        {
            return;
        } else
        {
            dl.d(dl1);
            return;
        }
    }

    (dl dl1)
    {
        b = new WeakReference(dl1);
    }
}
