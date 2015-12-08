// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env.gl;

import android.graphics.RectF;

// Referenced classes of package com.google.android.apps.unveil.env.gl:
//            e, Polygon, l, ShaderProgram, 
//            f

public class BoundingBox extends RectF
{

    public boolean a;
    final float b = 3F;
    public l c;
    public l d;
    final Polygon e = Polygon.a();
    final e f = new e();
    ShaderProgram g;
    final f h;

    public BoundingBox(f f1, ShaderProgram shaderprogram)
    {
        a = false;
        h = f1;
        g = shaderprogram;
    }
}
