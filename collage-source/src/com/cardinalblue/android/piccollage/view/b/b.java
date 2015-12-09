// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.b;

import android.graphics.Matrix;
import android.view.View;
import com.cardinalblue.android.piccollage.view.PhotoProtoView;
import com.cardinalblue.android.piccollage.view.k;

// Referenced classes of package com.cardinalblue.android.piccollage.view.b:
//            e

public class b extends e
{

    public b(k k1, PhotoProtoView photoprotoview)
    {
        super(k1, photoprotoview, 300L);
    }

    public void a(float f)
    {
        Matrix matrix;
        if (f <= 0.5F)
        {
            f /= 0.5F;
        } else
        {
            f = (1.0F - f) / 0.5F;
        }
        f = b(1.0F, 1.15F, f);
        matrix = new Matrix();
        matrix.setScale(f, f);
        this.f.a(matrix, null);
        g.postInvalidate();
    }
}
