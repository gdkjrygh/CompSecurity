// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzp;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            gq, gt, ry

public final class gs
    implements Iterable
{

    private final List a = new LinkedList();

    public gs()
    {
    }

    public static boolean a(ry ry)
    {
        ry = c(ry);
        if (ry != null)
        {
            ((gq) (ry)).b.a();
            return true;
        } else
        {
            return false;
        }
    }

    public static boolean b(ry ry)
    {
        return c(ry) != null;
    }

    private static gq c(ry ry)
    {
        for (Iterator iterator1 = zzp.zzbI().iterator(); iterator1.hasNext();)
        {
            gq gq1 = (gq)iterator1.next();
            if (gq1.a == ry)
            {
                return gq1;
            }
        }

        return null;
    }

    public final void a(gq gq1)
    {
        a.add(gq1);
    }

    public final void b(gq gq1)
    {
        a.remove(gq1);
    }

    public final Iterator iterator()
    {
        return a.iterator();
    }
}
