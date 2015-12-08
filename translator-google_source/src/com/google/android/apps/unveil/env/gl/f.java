// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env.gl;

import android.content.Context;
import android.content.res.Resources;
import android.opengl.GLES20;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.apps.unveil.env.Size;
import com.google.android.apps.unveil.env.af;
import com.google.android.apps.unveil.env.v;
import java.nio.ByteBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.apps.unveil.env.gl:
//            d, a, ShaderProgram, Texture, 
//            Polygon, i, BoundingBox, g

public final class f
    implements android.opengl.GLSurfaceView.Renderer
{

    static final af a = new af();
    Size b;
    private d c;
    private Size d;
    private a e;
    private final Display f;
    private final Resources g;
    private final g h;
    private ShaderProgram i;
    private ShaderProgram j;

    public f(Context context, g g1)
    {
        e = null;
        g = context.getResources();
        h = g1;
        f = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
    }

    private void b()
    {
        boolean flag1 = true;
        int k = f.getRotation();
        ShaderProgram shaderprogram = i;
        int l = d.width;
        int i1 = d.height;
        boolean flag = flag1;
        if (k != 1)
        {
            if (k == 3)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        }
        c = new d(shaderprogram, l, i1, flag);
    }

    public final a a()
    {
        this;
        JVM INSTR monitorenter ;
        a a1;
        if (e == null)
        {
            e = new a(this, j);
        }
        a1 = e;
        this;
        JVM INSTR monitorexit ;
        return a1;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(byte abyte0[], Size size)
    {
        this;
        JVM INSTR monitorenter ;
        ShaderProgram shaderprogram = i;
        if (shaderprogram != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (size.equals(d)) goto _L4; else goto _L3
_L3:
        d = size;
          goto _L1
        abyte0;
        throw abyte0;
_L4:
        if (c == null) goto _L1; else goto _L5
_L5:
        c.g = ByteBuffer.wrap(abyte0);
          goto _L1
    }

    public final void onDrawFrame(GL10 gl10)
    {
        this;
        JVM INSTR monitorenter ;
        if (d == null) goto _L2; else goto _L1
_L1:
        if (c != null) goto _L4; else goto _L3
_L3:
        b();
_L6:
        GLES20.glDisable(2929);
        GLES20.glEnable(3042);
        GLES20.glColorMask(true, true, true, true);
        GLES20.glBlendFunc(770, 771);
        gl10 = c;
        if (((d) (gl10)).g != null)
        {
            GLES20.glUseProgram(((d) (gl10)).h.a);
            int k = ((d) (gl10)).h.b(ShaderProgram.ATTRIBUTE_SLOT.TEXUV);
            GLES20.glVertexAttribPointer(k, 2, 5126, false, 0, ((d) (gl10)).d);
            GLES20.glEnableVertexAttribArray(k);
            ((d) (gl10)).g.position(0);
            ((d) (gl10)).e.a(33984);
            ((d) (gl10)).e.a(((d) (gl10)).g, ((d) (gl10)).b, ((d) (gl10)).c);
            ((d) (gl10)).g.position(((d) (gl10)).b * ((d) (gl10)).c);
            ((d) (gl10)).f.a(33985);
            ((d) (gl10)).f.a(((d) (gl10)).g.slice(), ((d) (gl10)).b / 2, ((d) (gl10)).c / 2);
            GLES20.glUniform1i(((d) (gl10)).h.b(ShaderProgram.UNIFORM_SLOT.TEX_Y), 0);
            GLES20.glUniform1i(((d) (gl10)).h.b(ShaderProgram.UNIFORM_SLOT.TEX_UV), 1);
            ((d) (gl10)).a.a(((d) (gl10)).h.b(ShaderProgram.ATTRIBUTE_SLOT.VERTEX));
            ((d) (gl10)).a.a(Polygon.DrawMode.SOLID);
        }
        if (e != null)
        {
            e.b();
        }
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        if (d.equals(new Size(c.b, c.c))) goto _L6; else goto _L5
_L5:
        c.a();
        b();
          goto _L6
        gl10;
        throw gl10;
    }

    public final void onSurfaceChanged(GL10 gl10, int k, int l)
    {
        b = new Size(k, l);
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eglconfig)
    {
        this;
        JVM INSTR monitorenter ;
        gl10 = new i("vShader", 35633, v.a(g, com.google.android.apps.unveil.f.passthrough_ver_tex));
        eglconfig = new i("fShader", 35632, v.a(g, com.google.android.apps.unveil.f.yuv2rgb));
        i k = new i("vShader", 35633, v.a(g, com.google.android.apps.unveil.f.transform_ver_tex));
        i l = new i("fShader", 35632, v.a(g, com.google.android.apps.unveil.f.passthrough_color));
        i = new ShaderProgram("NV21QuadShader");
        i.a(gl10);
        i.a(eglconfig);
        i.a();
        i.a(ShaderProgram.ATTRIBUTE_SLOT.VERTEX);
        i.a(ShaderProgram.ATTRIBUTE_SLOT.TEXUV);
        i.a(ShaderProgram.UNIFORM_SLOT.TEX_Y);
        i.a(ShaderProgram.UNIFORM_SLOT.TEX_UV);
        j = new ShaderProgram("BoundingBoxShader");
        j.a(k);
        j.a(l);
        j.a();
        j.a(ShaderProgram.ATTRIBUTE_SLOT.VERTEX);
        j.a(ShaderProgram.UNIFORM_SLOT.COLOR);
        j.a(ShaderProgram.UNIFORM_SLOT.PVMATRIX);
        if (e == null) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L3:
        if (i1 >= e.c())
        {
            break; /* Loop/switch isn't completed */
        }
        e.a(i1).g = j;
        i1++;
        if (true) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        gl10;
        throw gl10;
    }

}
