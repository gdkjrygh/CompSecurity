// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.graphics.Bitmap;
import com.roidapp.imagelib.d.d;

// Referenced classes of package com.roidapp.photogrid.release:
//            ih, mm, an

final class mo
    implements d
{

    final mm a;

    mo(mm mm1)
    {
        a = mm1;
        super();
    }

    public final void a(Bitmap bitmap)
    {
        if (ih.C().be())
        {
            a.q.a(bitmap);
            a.q.b(true);
            a.q.invalidate();
        }
    }
}
