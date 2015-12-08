// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media.effects;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.os.SystemClock;
import com.skype.android.media.CameraView;
import com.skype.android.media.GLES20Program;
import com.skype.android.media.Size;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.skype.android.media.effects:
//            FaceDecoration

public class FaceDecorationRenderer
    implements com.skype.android.media.GLES20Renderer.Overlay
{
    final class a
    {

        final FaceDecorationRenderer a;
        private FaceDecoration b;
        private int c;
        private int d;
        private int e;

        static FaceDecoration a(a a1)
        {
            return a1.b;
        }

        public final int a()
        {
            if (c == -1)
            {
                int l = b.a();
                int ai[] = new int[1];
                GLES20.glGenTextures(1, ai, 0);
                GLES20.glBindTexture(3553, ai[0]);
                Bitmap bitmap = BitmapFactory.decodeStream(FaceDecorationRenderer.a(a).getResources().openRawResource(l));
                d = bitmap.getWidth();
                e = bitmap.getHeight();
                GLUtils.texImage2D(3553, 0, bitmap, 0);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                bitmap.recycle();
                c = ai[0];
            }
            return c;
        }

        public final int b()
        {
            return d;
        }

        public final int c()
        {
            return e;
        }

        public final float d()
        {
            return b.b();
        }

        public final float e()
        {
            return b.c();
        }

        public final float f()
        {
            return b.d();
        }

        public a(FaceDecoration facedecoration)
        {
            a = FaceDecorationRenderer.this;
            super();
            b = facedecoration;
            c = -1;
        }
    }

    final class b extends GLES20Program
    {

        final FaceDecorationRenderer a;
        private int b;
        private int c;
        private int d;
        private int e;

        static int a(b b1)
        {
            return b1.b;
        }

        static int b(b b1)
        {
            return b1.c;
        }

        static int c(b b1)
        {
            return b1.d;
        }

        static int d(b b1)
        {
            return b1.e;
        }

        b()
        {
            a = FaceDecorationRenderer.this;
            super("uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n", "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
            int l = b();
            d = GLES20.glGetAttribLocation(l, "aPosition");
            e = GLES20.glGetAttribLocation(l, "aTextureCoord");
            b = GLES20.glGetUniformLocation(l, "uMVPMatrix");
            c = GLES20.glGetUniformLocation(l, "uTexMatrix");
        }
    }


    private CameraView a;
    private Context b;
    private android.hardware.Camera.Face c[];
    private List d;
    private b e;
    private b f;
    private float g[];
    private FloatBuffer h;
    private Map i;
    private long j;
    private boolean k;

    public FaceDecorationRenderer(CameraView cameraview)
    {
        a = cameraview;
        b = cameraview.getContext();
        d = new CopyOnWriteArrayList();
        i = new HashMap();
        g = new float[16];
        Matrix.setIdentityM(g, 0);
        h = GLES20Program.a(new float[] {
            0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F
        });
        k = true;
    }

    static Context a(FaceDecorationRenderer facedecorationrenderer)
    {
        return facedecorationrenderer.b;
    }

    private void a(b b1, float af[])
    {
        Iterator iterator = d.iterator();
_L3:
        a a1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_526;
        }
        a1 = (a)iterator.next();
        if (!k || c == null || c.length <= 0) goto _L2; else goto _L1
_L1:
        Object obj = new RectF(c[0].rect);
_L4:
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setScale(-1F, -1F);
        matrix.postRotate(a.getOrientationHint());
        float f1 = 1.0F;
        float f2 = 1.0F;
        float f3 = (float)a1.b() / (float)a1.c();
        float f4;
        int l;
        int i1;
        if (a1.b() > a1.c())
        {
            f2 = 1.0F / f3;
        } else
        {
            f1 = f3;
        }
        f3 = a1.d();
        f4 = a1.d();
        matrix.postScale((f1 * f3) / 1000F, (f2 * f4) / 1000F);
        f1 = a1.e();
        f2 = a1.f();
        matrix.postTranslate((((RectF) (obj)).width() / 1000F) * f1, (((RectF) (obj)).height() / 1000F) * f2);
        obj = new RectF(((RectF) (obj)));
        matrix.mapRect(((RectF) (obj)));
        obj = GLES20Program.a(new float[] {
            ((RectF) (obj)).left, ((RectF) (obj)).bottom, ((RectF) (obj)).right, ((RectF) (obj)).bottom, ((RectF) (obj)).left, ((RectF) (obj)).top, ((RectF) (obj)).right, ((RectF) (obj)).top
        });
        l = a1.a();
        GLES20.glUseProgram(b1.b());
        GLES20.glBlendFunc(770, 771);
        GLES20.glEnable(3042);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, l);
        GLES20.glUniformMatrix4fv(b.a(b1), 1, false, af, 0);
        GLES20.glUniformMatrix4fv(b.b(b1), 1, false, g, 0);
        GLES20.glEnableVertexAttribArray(b.c(b1));
        GLES20.glVertexAttribPointer(b.c(b1), 2, 5126, false, 8, ((java.nio.Buffer) (obj)));
        GLES20.glEnableVertexAttribArray(b.d(b1));
        GLES20.glVertexAttribPointer(b.d(b1), 2, 5126, false, 8, h);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(b.c(b1));
        GLES20.glDisableVertexAttribArray(b.d(b1));
        GLES20.glUseProgram(0);
        if (true) goto _L3; else goto _L2
_L2:
        if (k)
        {
            break MISSING_BLOCK_LABEL_526;
        }
        l = a.getPreviewSize().a();
        i1 = a.getPreviewSize().b();
        obj = new RectF(-l / 2, i1 / 2, l / 2, -i1 / 2);
          goto _L4
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        e = new b();
        f = new b();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(FaceDecoration facedecoration)
    {
        if (facedecoration == null)
        {
            throw new IllegalArgumentException("null decoration");
        }
        if (!i.containsKey(facedecoration))
        {
            d.add(new a(facedecoration));
        }
    }

    public final void a(float af[])
    {
        a(e, af);
    }

    public final void a(android.hardware.Camera.Face aface[])
    {
        if (aface == null || aface.length == 0)
        {
            if (SystemClock.elapsedRealtime() - j > 1000L)
            {
                c = aface;
            }
            return;
        } else
        {
            c = aface;
            j = SystemClock.elapsedRealtime();
            return;
        }
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (e != null)
        {
            e.a();
        }
        if (f != null)
        {
            f.a();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b(float af[])
    {
        this;
        JVM INSTR monitorenter ;
        a(f, af);
        this;
        JVM INSTR monitorexit ;
        return;
        af;
        throw af;
    }

    public final boolean b(FaceDecoration facedecoration)
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext();)
        {
            if (a.a((a)iterator.next()) == facedecoration)
            {
                return true;
            }
        }

        return false;
    }

    public final void c()
    {
        d.clear();
    }

    public final void c(FaceDecoration facedecoration)
    {
        Object obj = null;
        Iterator iterator = d.iterator();
        a a1;
        do
        {
            a1 = obj;
            if (!iterator.hasNext())
            {
                break;
            }
            a1 = (a)iterator.next();
        } while (a.a(a1) != facedecoration);
        d.remove(a1);
    }
}
