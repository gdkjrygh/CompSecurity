// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import com.google.android.gms.common.internal.bj;
import java.lang.ref.WeakReference;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.common.images:
//            e, a

public final class g extends e
{

    private WeakReference d;

    protected final void a()
    {
        d.get();
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof g))
        {
            return false;
        }
        if (this == obj)
        {
            return true;
        }
        obj = (g)obj;
        a a1 = (a)d.get();
        a a2 = (a)((g) (obj)).d.get();
        return a2 != null && a1 != null && bj.a(a2, a1) && bj.a(((g) (obj)).a, a);
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            a
        });
    }
}
