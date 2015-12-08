// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.d;

import android.graphics.Bitmap;
import com.roidapp.baselib.c.l;

// Referenced classes of package com.roidapp.imagelib.d:
//            c, d

public final class b
{

    private c a;

    public b()
    {
    }

    public final void a()
    {
        if (a != null)
        {
            a.cancel(true);
            a = null;
        }
    }

    public final void a(String s, Bitmap bitmap, int i, d d)
    {
        if (a != null && a.getStatus$2cfd0ac4() != l.c)
        {
            return;
        } else
        {
            a = new c(this, s, bitmap, i, d);
            a.execute(new Void[0]);
            return;
        }
    }
}
