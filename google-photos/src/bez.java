// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.opengl.GLSurfaceView;
import android.os.Environment;
import com.google.android.apps.consumerphotoeditor.core.PipelineParams;
import com.google.android.apps.consumerphotoeditor.core.Renderer;
import java.io.IOException;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

final class bez
    implements android.opengl.GLSurfaceView.Renderer
{

    private boolean a;
    private long b;
    private int c;
    private bem d;

    bez(bem bem1)
    {
        d = bem1;
        super();
        b = 0L;
        c = 0;
    }

    public final void onDrawFrame(GL10 gl10)
    {
        if (bem.E(d))
        {
            bem.a(d, false);
            gl10 = bem.n(d);
            ((bdo) (gl10)).b.setPipelineParams(((bdo) (gl10)).e);
        }
        if (bem.F(d))
        {
            gl10 = d;
            String s;
            boolean flag;
            if (!bem.G(d))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            bem.b(gl10, flag);
        }
        if (bem.n(d).b.drawFrame() && !bem.H(d))
        {
            bem.c(d, true);
            bem.D(d);
        }
        if (!bem.I(d))
        {
            break MISSING_BLOCK_LABEL_187;
        }
        bem.d(d, false);
        gl10 = bem.n(d).b.getScreenShot();
        s = String.valueOf(Environment.getExternalStorageDirectory());
        bfv.a(gl10, (new StringBuilder(String.valueOf(s).length() + 8)).append(s).append("/log.jpg").toString());
_L1:
        return;
        gl10;
        if (bem.J(d).a())
        {
            bem.J(d);
            return;
        }
          goto _L1
    }

    public final void onSurfaceChanged(GL10 gl10, int i, int j)
    {
        bem.n(d).b.surfaceChanged(i, j);
        gl10 = bem.n(d).f();
        gl10.easterEggShow = false;
        if (((PipelineParams) (gl10)).applyCrop)
        {
            bem.n(d).a(Renderer.zoomCenterForMove(gl10));
            bem.a(d, true);
        }
        d.g(1);
        bem.c(d).requestRender();
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eglconfig)
    {
        a = false;
        gl10 = d;
        eglconfig = bem.n(d);
        ar ar = d.O_();
        bem.b(gl10, ((bdo) (eglconfig)).b.surfaceCreated(ar));
        bem.a(d, true);
        bem.b(d, true);
    }
}
