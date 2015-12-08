// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.gl;

import android.util.Log;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

// Referenced classes of package com.roidapp.baselib.gl:
//            GPUTestView

final class a
    implements android.opengl.GLSurfaceView.EGLConfigChooser
{

    final GPUTestView a;

    a(GPUTestView gputestview)
    {
        a = gputestview;
        super();
    }

    public final EGLConfig chooseConfig(EGL10 egl10, EGLDisplay egldisplay)
    {
        EGLConfig aeglconfig[];
label0:
        {
            int ai[] = new int[1];
            int ai1[] = new int[15];
            int[] _tmp = ai1;
            ai1[0] = 12325;
            ai1[1] = 16;
            ai1[2] = 12326;
            ai1[3] = 0;
            ai1[4] = 12324;
            ai1[5] = 8;
            ai1[6] = 12323;
            ai1[7] = 8;
            ai1[8] = 12322;
            ai1[9] = 8;
            ai1[10] = 12321;
            ai1[11] = 8;
            ai1[12] = 12352;
            ai1[13] = 4;
            ai1[14] = 12344;
            if (!egl10.eglInitialize(egldisplay, new int[] {
    2, 0
}))
            {
                Log.e("GPUTestView", "default eglInitialize failed");
                a.a("N/A");
                return null;
            }
            egl10.eglChooseConfig(egldisplay, ai1, null, 0, ai);
            int i = ai[0];
            if (i < 0)
            {
                Log.e("GPUTestView", "default eglChooseConfig failed step1");
                a.a("N/A");
                return null;
            }
            aeglconfig = new EGLConfig[i];
            try
            {
                if (egl10.eglChooseConfig(egldisplay, ai1, aeglconfig, 1, ai))
                {
                    break label0;
                }
                Log.e("GPUTestView", "default eglChooseConfig failed step2");
                a.a("N/A");
            }
            // Misplaced declaration of an exception variable
            catch (EGL10 egl10)
            {
                egl10.printStackTrace();
                a.a("N/A");
                return null;
            }
            return null;
        }
        return aeglconfig[0];
    }
}
