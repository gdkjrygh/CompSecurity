// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.render;

import java.util.Iterator;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

// Referenced classes of package com.skype.android.video.render:
//            GLHelpers

private class display
    implements Iterable
{
    private class Item
    {

        private final EGLConfig config;
        final GLHelpers.ConfigSelector.EGLConfigurations this$2;

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

        public Item(EGLConfig eglconfig)
        {
            this$2 = GLHelpers.ConfigSelector.EGLConfigurations.this;
            super();
            config = eglconfig;
        }
    }


    private final EGLConfig configs[] = getConfigs();
    private final EGLDisplay display;
    private final EGL10 egl;
    final getConfigs this$1;

    private EGLConfig[] getConfigs()
        throws Item.config
    {
        int ai[] = new int[1];
        if (!egl.eglChooseConfig(display, display(this._cls1.this), null, 0, ai))
        {
            throw new this._cls1(egl.eglGetError());
        }
        EGLConfig aeglconfig[] = new EGLConfig[ai[0]];
        if (!egl.eglChooseConfig(display, display(this._cls1.this), aeglconfig, aeglconfig.length, ai))
        {
            throw new this._cls1(egl.eglGetError());
        } else
        {
            return aeglconfig;
        }
    }

    public Iterator iterator()
    {
        return new Iterator() {

            int index;
            final GLHelpers.ConfigSelector.EGLConfigurations this$2;

            public boolean hasNext()
            {
                return index < configs.length;
            }

            public Item next()
            {
                GLHelpers.ConfigSelector.EGLConfigurations eglconfigurations = GLHelpers.ConfigSelector.EGLConfigurations.this;
                EGLConfig aeglconfig[] = configs;
                int i = index;
                index = i + 1;
                return eglconfigurations. new Item(aeglconfig[i]);
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
                this$2 = GLHelpers.ConfigSelector.EGLConfigurations.this;
                super();
                index = 0;
            }
        };
    }




    public _cls1.index(EGL10 egl10, EGLDisplay egldisplay)
        throws _cls1.index
    {
        this$1 = this._cls1.this;
        super();
        egl = egl10;
        display = egldisplay;
    }
}
