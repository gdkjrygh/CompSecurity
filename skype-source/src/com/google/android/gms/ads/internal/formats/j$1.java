// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import android.widget.FrameLayout;
import com.google.android.gms.internal.hi;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            j, h

final class a
    implements Runnable
{

    final h a;
    final j b;

    public final void run()
    {
        hi hi1 = a.c();
        if (hi1 != null)
        {
            j.a(b).addView(hi1.a());
        }
    }

    (j j1, h h1)
    {
        b = j1;
        a = h1;
        super();
    }
}
