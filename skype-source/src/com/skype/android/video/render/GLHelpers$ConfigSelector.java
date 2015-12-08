// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.render;

import com.skype.android.util.Log;
import java.util.Iterator;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

// Referenced classes of package com.skype.android.video.render:
//            GLHelpers

public class attributes
{
    private class EGLConfigurations
        implements Iterable
    {

        private final EGLConfig configs[] = getConfigs();
        private final EGLDisplay display;
        private final EGL10 egl;
        final GLHelpers.ConfigSelector this$1;

        private EGLConfig[] getConfigs()
            throws GLHelpers.EGLException
        {
            int ai[] = new int[1];
            if (!egl.eglChooseConfig(display, attributes, null, 0, ai))
            {
                throw new GLHelpers.EGLException(egl.eglGetError());
            }
            EGLConfig aeglconfig[] = new EGLConfig[ai[0]];
            if (!egl.eglChooseConfig(display, attributes, aeglconfig, aeglconfig.length, ai))
            {
                throw new GLHelpers.EGLException(egl.eglGetError());
            } else
            {
                return aeglconfig;
            }
        }

        public Iterator iterator()
        {
            return new Iterator() {

                int index;
                final EGLConfigurations this$2;

                public boolean hasNext()
                {
                    return index < configs.length;
                }

                public EGLConfigurations.Item next()
                {
                    EGLConfigurations eglconfigurations = EGLConfigurations.this;
                    EGLConfig aeglconfig[] = configs;
                    int i = index;
                    index = i + 1;
                    return eglconfigurations. new EGLConfigurations.Item(aeglconfig[i]);
                }

                public volatile Object next()
                {
                    return next();
                }

                public void remove()
                {
                    throw new UnsupportedOperationException();
                }

            
            {
                this$2 = EGLConfigurations.this;
                super();
                index = 0;
            }
            };
        }




        public EGLConfigurations(EGL10 egl10, EGLDisplay egldisplay)
            throws GLHelpers.EGLException
        {
            this$1 = GLHelpers.ConfigSelector.this;
            super();
            egl = egl10;
            display = egldisplay;
        }
    }

    private class EGLConfigurations.Item
    {

        private final EGLConfig config;
        final EGLConfigurations this$2;

        public int getAttribute(int i)
        {
            int j = 0;
            int ai[] = new int[1];
            if (egl.eglGetConfigAttrib(display, config, i, ai))
            {
                j = ai[0];
            }
            return j;
        }

        public EGLConfig getEGLConfig()
        {
            return config;
        }

        public EGLConfigurations.Item(EGLConfig eglconfig)
        {
            this$2 = EGLConfigurations.this;
            super();
            config = eglconfig;
        }
    }


    private final int alpha;
    private final int attributes[];
    private final int blue;
    private final int depth;
    private final int green;
    private final int red;
    private final int stencil;
    final GLHelpers this$0;

    private boolean isMatch(EGLConfigurations.Item item)
    {
        return item.getAttribute(12325) >= depth && item.getAttribute(12326) >= stencil && item.getAttribute(12324) == red && item.getAttribute(12323) == green && item.getAttribute(12322) == blue && item.getAttribute(12321) == alpha;
    }

    public EGLConfig selectConfig(EGL10 egl10, EGLDisplay egldisplay)
    {
        Object obj;
        obj = null;
        if (Log.isLoggable(GLHelpers.access$000(GLHelpers.this), 3))
        {
            Log.d(GLHelpers.access$000(GLHelpers.this), "selectConfig(): ENTER");
        }
        int i;
        try
        {
            egl10 = new EGLConfigurations(egl10, egldisplay);
        }
        // Misplaced declaration of an exception variable
        catch (EGLDisplay egldisplay)
        {
            egl10 = obj;
            if (Log.isLoggable(GLHelpers.access$000(GLHelpers.this), 6))
            {
                Log.e(GLHelpers.access$000(GLHelpers.this), (new StringBuilder("Failed to get EGL configurations: ")).append(egldisplay.tMessage()).toString());
                return null;
            }
            continue; /* Loop/switch isn't completed */
        }
        egl10 = egl10.iterator();
        if (!egl10.hasNext()) goto _L2; else goto _L1
_L1:
        egldisplay = (EGLConfigurations.Item)egl10.next();
        if (!isMatch(egldisplay))
        {
            break MISSING_BLOCK_LABEL_45;
        }
        if (Log.isLoggable(GLHelpers.access$000(GLHelpers.this), 4))
        {
            i = egldisplay.getAttribute(12328);
            Log.i(GLHelpers.access$000(GLHelpers.this), (new StringBuilder("selected config: EGL_CONFIG_ID=")).append(i).append(", rgb=").append(red).append(':').append(green).append(':').append(blue).toString());
        }
        egl10 = egldisplay.getEGLConfig();
_L4:
        return egl10;
_L2:
        egl10 = obj;
        if (Log.isLoggable(GLHelpers.access$000(GLHelpers.this), 6))
        {
            Log.e(GLHelpers.access$000(GLHelpers.this), "no configurations found!");
            return null;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }


    public EGLConfigurations.display(int i, int j, int k, int l, int i1, int j1, 
            int ai[])
    {
        this$0 = GLHelpers.this;
        super();
        red = i;
        green = j;
        blue = k;
        alpha = l;
        depth = i1;
        stencil = j1;
        attributes = (int[])ai.clone();
    }
}
