// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import com.google.android.gms.common.internal.t;
import java.lang.ref.WeakReference;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.common.images:
//            a

public static final class eManager.a extends a
{

    private WeakReference d;

    protected final void a()
    {
        d.get();
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof eManager.a))
        {
            return false;
        }
        if (this == obj)
        {
            return true;
        }
        obj = (eManager.a)obj;
        eManager.a a1 = (eManager.a)d.get();
        eManager.a a2 = (eManager.a)((eManager.a) (obj)).d.get();
        return a2 != null && a1 != null && t.a(a2, a1) && t.a(((a) (obj)).a, a);
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            a
        });
    }
}
