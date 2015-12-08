// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.d;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            aw, cw

public final class ax
    implements Iterable
{

    final List a = new LinkedList();

    public ax()
    {
    }

    public static boolean a(cw cw)
    {
        return b(cw) != null;
    }

    static aw b(cw cw)
    {
        for (Iterator iterator1 = d.k().iterator(); iterator1.hasNext();)
        {
            aw aw1 = (aw)iterator1.next();
            if (aw1.a == cw)
            {
                return aw1;
            }
        }

        return null;
    }

    public final Iterator iterator()
    {
        return a.iterator();
    }
}
