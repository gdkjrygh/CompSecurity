// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.images.zoomableimageview;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.facebook.widget.images.zoomableimageview:
//            e

class f
    implements Runnable
{

    final Drawable a;
    final boolean b;
    final Matrix c;
    final float d;
    final e e;

    f(e e1, Drawable drawable, boolean flag, Matrix matrix, float f1)
    {
        e = e1;
        a = drawable;
        b = flag;
        c = matrix;
        d = f1;
        super();
    }

    public void run()
    {
        e.b(a, b, c, d);
    }
}
