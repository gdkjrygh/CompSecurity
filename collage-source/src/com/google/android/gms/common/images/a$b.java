// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import com.google.android.gms.common.internal.y;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.common.images:
//            a

public static final class eManager.a extends a
{

    private WeakReference f;

    protected void a(Drawable drawable, boolean flag, boolean flag1, boolean flag2)
    {
        if (!flag1)
        {
            eManager.a a1 = (eManager.a)f.get();
            if (a1 != null)
            {
                a1.a(a.a, drawable, flag2);
            }
        }
    }

    public boolean equals(Object obj)
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
        eManager.a a1 = (eManager.a)f.get();
        eManager.a a2 = (eManager.a)((eManager.a) (obj)).f.get();
        boolean flag;
        if (a2 != null && a1 != null && y.a(a2, a1) && y.a(((a) (obj)).a, a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    public int hashCode()
    {
        return y.a(new Object[] {
            a
        });
    }
}
