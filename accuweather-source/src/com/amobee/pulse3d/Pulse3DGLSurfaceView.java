// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.content.Context;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

// Referenced classes of package com.amobee.pulse3d:
//            CustomGLSurfaceView, Pulse3DView, Pulse3DGLRenderer, Log

class Pulse3DGLSurfaceView extends CustomGLSurfaceView
{

    private static final int EGL_OPENGL_ES2_BIT = 4;
    public static final String TAG = "Pulse3DGLSurfaceView";
    static EGLConfig bestConfig = null;
    Pulse3DView mPulse3DView;
    Pulse3DGLRenderer renderer;

    Pulse3DGLSurfaceView(Pulse3DView pulse3dview, Context context)
    {
        super(context);
        mPulse3DView = null;
        mPulse3DView = pulse3dview;
        if (Pulse3DView.debugLevel == Log.DebugLevel.DEBUG)
        {
            setDebugFlags(3);
        }
        setEGLContextClientVersion(2);
        setEGLConfigChooser(new CustomGLSurfaceView.EGLConfigChooser() {

            final Pulse3DGLSurfaceView this$0;

            private EGLConfig better(EGLConfig eglconfig, EGLConfig eglconfig1, EGL10 egl10, EGLDisplay egldisplay)
            {
                int ai[];
                int i;
                int l;
                if (eglconfig == null)
                {
                    return eglconfig1;
                }
                ai = new int[1];
                egl10.eglGetConfigAttrib(egldisplay, eglconfig, 12325, ai);
                i = ai[0];
                egl10.eglGetConfigAttrib(egldisplay, eglconfig1, 12325, ai);
                l = ai[0];
                if (i <= l) goto _L2; else goto _L1
_L1:
                return eglconfig;
_L2:
                if (i < l)
                {
                    eglconfig = eglconfig1;
                } else
                {
                    egl10.eglGetConfigAttrib(egldisplay, eglconfig, 12324, ai);
                    int j = ai[0];
                    egl10.eglGetConfigAttrib(egldisplay, eglconfig1, 12324, ai);
                    int i1 = ai[0];
                    if (j <= i1)
                    {
                        if (j < i1)
                        {
                            eglconfig = eglconfig1;
                        } else
                        {
                            egl10.eglGetConfigAttrib(egldisplay, eglconfig, 12320, ai);
                            int k = ai[0];
                            egl10.eglGetConfigAttrib(egldisplay, eglconfig1, 12320, ai);
                            if (k <= ai[0])
                            {
                                eglconfig = eglconfig1;
                            }
                        }
                    }
                }
                if (true) goto _L1; else goto _L3
_L3:
            }

            private void printConfig(EGLConfig eglconfig, EGL10 egl10, EGLDisplay egldisplay)
            {
                int ai[] = new int[1];
                egl10.eglGetConfigAttrib(egldisplay, eglconfig, 12324, ai);
                Log.d("Pulse3DGLSurfaceView", (new StringBuilder()).append("EGL_RED_SIZE: ").append(ai[0]).toString());
                egl10.eglGetConfigAttrib(egldisplay, eglconfig, 12323, ai);
                Log.d("Pulse3DGLSurfaceView", (new StringBuilder()).append("EGL_GREEN_SIZE: ").append(ai[0]).toString());
                egl10.eglGetConfigAttrib(egldisplay, eglconfig, 12322, ai);
                Log.d("Pulse3DGLSurfaceView", (new StringBuilder()).append("EGL_BLUE_SIZE: ").append(ai[0]).toString());
                egl10.eglGetConfigAttrib(egldisplay, eglconfig, 12321, ai);
                Log.d("Pulse3DGLSurfaceView", (new StringBuilder()).append("EGL_ALPHA_SIZE: ").append(ai[0]).toString());
                egl10.eglGetConfigAttrib(egldisplay, eglconfig, 12325, ai);
                Log.d("Pulse3DGLSurfaceView", (new StringBuilder()).append("EGL_DEPTH_SIZE: ").append(ai[0]).toString());
                egl10.eglGetConfigAttrib(egldisplay, eglconfig, 12350, ai);
                Log.d("Pulse3DGLSurfaceView", (new StringBuilder()).append("EGL_ALPHA_MASK_SIZE: ").append(ai[0]).toString());
                egl10.eglGetConfigAttrib(egldisplay, eglconfig, 12326, ai);
                Log.d("Pulse3DGLSurfaceView", (new StringBuilder()).append("EGL_STENCIL_SIZE: ").append(ai[0]).toString());
                egl10.eglGetConfigAttrib(egldisplay, eglconfig, 12320, ai);
                Log.d("Pulse3DGLSurfaceView", (new StringBuilder()).append("EGL_BUFFER_SIZE: ").append(ai[0]).toString());
            }

            public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay egldisplay)
            {
                if (Pulse3DGLSurfaceView.bestConfig != null)
                {
                    return Pulse3DGLSurfaceView.bestConfig;
                }
                int ai[] = new int[1];
                egl10.eglGetConfigs(egldisplay, null, 0, ai);
                int j = ai[0];
                EGLConfig aeglconfig[] = new EGLConfig[j];
                egl10.eglGetConfigs(egldisplay, aeglconfig, j, ai);
                EGLConfig eglconfig = null;
                int i = 0;
                while (i < j) 
                {
                    int ai1[] = new int[1];
                    egl10.eglGetConfigAttrib(egldisplay, aeglconfig[i], 12352, ai1);
                    if ((ai1[0] & 4) == 0)
                    {
                        Log.d("Pulse3DGLSurfaceView", "Not an OOPENGLES20 config, Skipping");
                    } else
                    {
                        egl10.eglGetConfigAttrib(egldisplay, aeglconfig[i], 12321, ai1);
                        if (ai1[0] > 0)
                        {
                            Log.d("Pulse3DGLSurfaceView", "ALPHA_SIZE > 0, too expensive, Skipping");
                        } else
                        {
                            Log.d("Pulse3DGLSurfaceView", (new StringBuilder()).append("------ EGLConfigChooser: Configuration #").append(i).toString());
                            printConfig(aeglconfig[i], egl10, egldisplay);
                            eglconfig = better(eglconfig, aeglconfig[i], egl10, egldisplay);
                        }
                    }
                    i++;
                }
                Log.d("Pulse3DGLSurfaceView", "------ EGLConfigChooser - Select Config:");
                printConfig(eglconfig, egl10, egldisplay);
                Pulse3DGLSurfaceView.bestConfig = eglconfig;
                return eglconfig;
            }

            
            {
                this$0 = Pulse3DGLSurfaceView.this;
                super();
            }
        });
        renderer = new Pulse3DGLRenderer(context);
        setRenderer(renderer);
        setRenderMode(0);
    }

    protected void onAnimationStart()
    {
    }

    protected void onDetachedFromWindow()
    {
        if (mPulse3DView == null || mPulse3DView.mPulse3dWebView == null)
        {
            Log.d("Pulse3DGLSurfaceView", "super.onDetachedFromWindow");
            super.onDetachedFromWindow();
        }
    }

}
