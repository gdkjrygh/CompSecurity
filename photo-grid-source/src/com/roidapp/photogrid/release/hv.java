// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.graphics.Bitmap;
import com.roidapp.photogrid.common.bb;

// Referenced classes of package com.roidapp.photogrid.release:
//            ig, rf

public final class hv
{

    protected Bitmap a;
    protected int b;
    protected int c;
    protected String d;
    protected ig e;

    public hv(int i, int j, ig ig1)
    {
        b = i;
        c = j;
        e = ig1;
        d = ig1.d();
    }

    protected final Bitmap a()
    {
        rf.a();
        a = bb.a(rf.a(d, b, c), d);
        return a;
    }

    public final void b()
    {
        if (a != null && !a.isRecycled())
        {
            a.recycle();
        }
        a = null;
    }
}
