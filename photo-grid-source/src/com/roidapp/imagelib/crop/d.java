// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.crop;

import android.graphics.Matrix;
import android.os.Handler;

// Referenced classes of package com.roidapp.imagelib.crop:
//            a, CropImageView, e

final class d
    implements Runnable
{

    float a;
    Matrix b;
    final a c;

    d(a a1)
    {
        c = a1;
        super();
        a = 1.0F;
    }

    public final void run()
    {
        b = com.roidapp.imagelib.crop.a.b(c).getImageMatrix();
        a = 1.0F / a;
        com.roidapp.imagelib.crop.a.c(c).post(new e(this));
    }
}
