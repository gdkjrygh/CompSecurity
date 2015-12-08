// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env.gl;

import android.graphics.RectF;
import android.opengl.GLES20;
import com.google.android.apps.unveil.env.Size;
import com.google.android.apps.unveil.env.af;

// Referenced classes of package com.google.android.apps.unveil.env.gl:
//            BoundingBox, ShaderProgram, f, e, 
//            Polygon, l

public final class a
{

    private BoundingBox a[];
    private final ShaderProgram b;
    private final f c;

    public a(f f1, ShaderProgram shaderprogram)
    {
        c = f1;
        b = shaderprogram;
    }

    public final BoundingBox a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        BoundingBox boundingbox = a[i];
        this;
        JVM INSTR monitorexit ;
        return boundingbox;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        a = new BoundingBox[6];
        int i = 0;
_L2:
        if (i >= 6)
        {
            break; /* Loop/switch isn't completed */
        }
        a[i] = new BoundingBox(c, b);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        GLES20.glColorMask(true, true, true, false);
        int i = 0;
_L7:
        if (i >= a.length) goto _L2; else goto _L1
_L1:
        BoundingBox boundingbox;
        if (a[i] == null)
        {
            break MISSING_BLOCK_LABEL_488;
        }
        boundingbox = a[i];
        if (!boundingbox.a || boundingbox.g == null)
        {
            break MISSING_BLOCK_LABEL_488;
        }
        Object obj1;
        GLES20.glUseProgram(boundingbox.g.a);
        obj1 = boundingbox.h;
        if (((f) (obj1)).b != null) goto _L4; else goto _L3
_L3:
        Object obj;
        f.a.e("pxToGLCoords called before onSurfaceChanged", new Object[0]);
        obj = new RectF(0.0F, 0.0F, 0.0F, 0.0F);
_L5:
        obj1 = boundingbox.f;
        float f1 = ((RectF) (obj)).width() / 2.0F;
        float f2 = ((RectF) (obj)).height() / 2.0F;
        ((e) (obj1)).a(0, 0, f1);
        ((e) (obj1)).a(1, 1, f2);
        obj1 = boundingbox.f;
        f1 = ((RectF) (obj)).centerX();
        f2 = ((RectF) (obj)).centerY();
        ((e) (obj1)).a(3, 0, f1);
        ((e) (obj1)).a(3, 1, f2);
        obj = boundingbox.f;
        GLES20.glUniformMatrix4fv(boundingbox.g.b(ShaderProgram.UNIFORM_SLOT.PVMATRIX), 1, false, ((e) (obj)).a, 0);
        boundingbox.e.a(boundingbox.g.b(ShaderProgram.ATTRIBUTE_SLOT.VERTEX));
        if (boundingbox.c != null)
        {
            GLES20.glUniform4f(boundingbox.g.b(ShaderProgram.UNIFORM_SLOT.COLOR), boundingbox.c.f, boundingbox.c.g, boundingbox.c.h, boundingbox.c.i);
            boundingbox.e.a(Polygon.DrawMode.SOLID);
        }
        if (boundingbox.b > 0.0F && boundingbox.d != null)
        {
            GLES20.glUniform4f(boundingbox.g.b(ShaderProgram.UNIFORM_SLOT.COLOR), boundingbox.d.f, boundingbox.d.g, boundingbox.d.h, boundingbox.d.i);
            GLES20.glLineWidth(boundingbox.b);
            boundingbox.e.a(Polygon.DrawMode.OUTLINE);
        }
        break MISSING_BLOCK_LABEL_488;
        obj;
        throw obj;
_L4:
        obj = new RectF();
        obj.left = (((RectF) (boundingbox)).left * 2.0F) / (float)((f) (obj1)).b.width - 1.0F;
        obj.right = (((RectF) (boundingbox)).right * 2.0F) / (float)((f) (obj1)).b.width - 1.0F;
        obj.top = 1.0F - (((RectF) (boundingbox)).top * 2.0F) / (float)((f) (obj1)).b.height;
        obj.bottom = 1.0F - (((RectF) (boundingbox)).bottom * 2.0F) / (float)((f) (obj1)).b.height;
        if (true) goto _L5; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final int c()
    {
        this;
        JVM INSTR monitorenter ;
        int i = a.length;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }
}
