// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.getbase.floatingactionbutton;

import android.graphics.LinearGradient;
import android.graphics.Shader;

// Referenced classes of package com.getbase.floatingactionbutton:
//            FloatingActionButton

class a extends android.graphics.drawable.ShapeDrawable.ShaderFactory
{

    final int a;
    final int b;
    final int c;
    final int d;
    final int e;
    final FloatingActionButton f;

    a(FloatingActionButton floatingactionbutton, int i, int j, int k, int l, int i1)
    {
        f = floatingactionbutton;
        a = i;
        b = j;
        c = k;
        d = l;
        e = i1;
        super();
    }

    public Shader resize(int i, int j)
    {
        float f1 = i / 2;
        float f2 = i / 2;
        float f3 = j;
        i = a;
        j = b;
        int k = c;
        int l = d;
        int i1 = e;
        android.graphics.Shader.TileMode tilemode = android.graphics.Shader.TileMode.CLAMP;
        return new LinearGradient(f1, 0.0F, f2, f3, new int[] {
            i, j, k, l, i1
        }, new float[] {
            0.0F, 0.2F, 0.5F, 0.8F, 1.0F
        }, tilemode);
    }
}
