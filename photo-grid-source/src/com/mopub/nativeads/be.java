// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.mopub.nativeads:
//            ba, bc, bd, bf

final class be
    implements Runnable
{

    final ba a;
    private final ArrayList b = new ArrayList();
    private final ArrayList c = new ArrayList();

    be(ba ba1)
    {
        a = ba1;
        super();
    }

    public final void run()
    {
        ba.a(a);
        for (Iterator iterator = ba.b(a).entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            View view = (View)entry.getKey();
            int i = ((bc)entry.getValue()).a;
            if (ba.c(a).a(view, i))
            {
                b.add(view);
            } else
            {
                c.add(view);
            }
        }

        if (ba.d(a) != null)
        {
            ba.d(a).onVisibilityChanged(b, c);
        }
        b.clear();
        c.clear();
    }
}
