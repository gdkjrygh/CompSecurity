// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.b;

import android.graphics.Matrix;
import android.view.View;
import com.cardinalblue.android.piccollage.controller.f;
import com.cardinalblue.android.piccollage.view.k;

// Referenced classes of package com.cardinalblue.android.piccollage.view.b:
//            e

public class c extends e
{

    private float a;
    private float b;
    private float c;

    public c(k k1, View view, float f1, float f2, float f3, float f4)
    {
        super(k1, view, 500L);
        k1.e(true);
        a = f1 - k1.K();
        b = f2 - k1.L();
        c = Math.min(f3 / (float)k1.o(), f4 / (float)k1.p()) / k1.P();
    }

    public void a()
    {
        super.a();
        Matrix matrix = new Matrix();
        Matrix matrix1 = new Matrix();
        matrix.postScale(c, c);
        matrix.postRotate(180F);
        matrix1.postTranslate(a, b);
        f.a(matrix, matrix1);
        f.b(150);
        f.e(false);
    }

    public void a(float f1)
    {
        f1 = b(f1);
        Matrix matrix = new Matrix();
        Matrix matrix1 = new Matrix();
        float f2 = a(1.0F, c, f1);
        matrix.postScale(f2, f2);
        matrix.postRotate(a(0.0F, 900F, f1));
        matrix1.postTranslate(a(0.0F, a, f1), a(0.0F, b, f1));
        f.b((int)a(f.a, 150F, f1));
        f.a(matrix, matrix1);
    }
}
