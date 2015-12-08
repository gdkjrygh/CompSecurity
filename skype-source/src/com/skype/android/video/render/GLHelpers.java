// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.render;

import com.skype.android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

public class GLHelpers
{
    public class ConfigSelector
    {

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
            if (Log.isLoggable(tag, 3))
            {
                Log.d(tag, "selectConfig(): ENTER");
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
                if (Log.isLoggable(tag, 6))
                {
                    Log.e(tag, (new StringBuilder("Failed to get EGL configurations: ")).append(egldisplay.getMessage()).toString());
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
            if (Log.isLoggable(tag, 4))
            {
                i = egldisplay.getAttribute(12328);
                Log.i(tag, (new StringBuilder("selected config: EGL_CONFIG_ID=")).append(i).append(", rgb=").append(red).append(':').append(green).append(':').append(blue).toString());
            }
            egl10 = egldisplay.getEGLConfig();
_L4:
            return egl10;
_L2:
            egl10 = obj;
            if (Log.isLoggable(tag, 6))
            {
                Log.e(tag, "no configurations found!");
                return null;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }


        public ConfigSelector(int i, int j, int k, int l, int i1, int j1, 
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

    private class ConfigSelector.EGLConfigurations
        implements Iterable
    {

        private final EGLConfig configs[] = getConfigs();
        private final EGLDisplay display;
        private final EGL10 egl;
        final ConfigSelector this$1;

        private EGLConfig[] getConfigs()
            throws EGLException
        {
            int ai[] = new int[1];
            if (!egl.eglChooseConfig(display, attributes, null, 0, ai))
            {
                throw new EGLException(egl.eglGetError());
            }
            EGLConfig aeglconfig[] = new EGLConfig[ai[0]];
            if (!egl.eglChooseConfig(display, attributes, aeglconfig, aeglconfig.length, ai))
            {
                throw new EGLException(egl.eglGetError());
            } else
            {
                return aeglconfig;
            }
        }

        public Iterator iterator()
        {
            return new Iterator() {

                int index;
                final ConfigSelector.EGLConfigurations this$2;

                public boolean hasNext()
                {
                    return index < configs.length;
                }

                public ConfigSelector.EGLConfigurations.Item next()
                {
                    ConfigSelector.EGLConfigurations eglconfigurations = ConfigSelector.EGLConfigurations.this;
                    EGLConfig aeglconfig[] = configs;
                    int i = index;
                    index = i + 1;
                    return eglconfigurations. new ConfigSelector.EGLConfigurations.Item(aeglconfig[i]);
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
                this$2 = ConfigSelector.EGLConfigurations.this;
                super();
                index = 0;
            }
            };
        }




        public ConfigSelector.EGLConfigurations(EGL10 egl10, EGLDisplay egldisplay)
            throws EGLException
        {
            this$1 = ConfigSelector.this;
            super();
            egl = egl10;
            display = egldisplay;
        }
    }

    private class ConfigSelector.EGLConfigurations.Item
    {

        private final EGLConfig config;
        final ConfigSelector.EGLConfigurations this$2;

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

        public ConfigSelector.EGLConfigurations.Item(EGLConfig eglconfig)
        {
            this$2 = ConfigSelector.EGLConfigurations.this;
            super();
            config = eglconfig;
        }
    }

    private static final class EGLError extends Enum
    {

        private static final EGLError $VALUES[];
        public static final EGLError EGL_BAD_ACCESS;
        public static final EGLError EGL_BAD_ALLOC;
        public static final EGLError EGL_BAD_ATTRIBUTE;
        public static final EGLError EGL_BAD_CONFIG;
        public static final EGLError EGL_BAD_CONTEXT;
        public static final EGLError EGL_BAD_CURRENT_SURFACE;
        public static final EGLError EGL_BAD_DISPLAY;
        public static final EGLError EGL_BAD_MATCH;
        public static final EGLError EGL_BAD_NATIVE_PIXMAP;
        public static final EGLError EGL_BAD_NATIVE_WINDOW;
        public static final EGLError EGL_BAD_PARAMETER;
        public static final EGLError EGL_BAD_SURFACE;
        public static final EGLError EGL_CONTEXT_LOST;
        public static final EGLError EGL_NOT_INITIALIZED;
        public static final EGLError EGL_SUCCESS;

        public static EGLError valueOf(String s)
        {
            return (EGLError)Enum.valueOf(com/skype/android/video/render/GLHelpers$EGLError, s);
        }

        public static EGLError[] values()
        {
            return (EGLError[])$VALUES.clone();
        }

        static 
        {
            EGL_SUCCESS = new EGLError("EGL_SUCCESS", 0, 12288);
            EGL_NOT_INITIALIZED = new EGLError("EGL_NOT_INITIALIZED", 1, 12289);
            EGL_BAD_ACCESS = new EGLError("EGL_BAD_ACCESS", 2, 12290);
            EGL_BAD_ALLOC = new EGLError("EGL_BAD_ALLOC", 3, 12291);
            EGL_BAD_ATTRIBUTE = new EGLError("EGL_BAD_ATTRIBUTE", 4, 12292);
            EGL_BAD_CONTEXT = new EGLError("EGL_BAD_CONTEXT", 5, 12294);
            EGL_BAD_CONFIG = new EGLError("EGL_BAD_CONFIG", 6, 12293);
            EGL_BAD_CURRENT_SURFACE = new EGLError("EGL_BAD_CURRENT_SURFACE", 7, 12295);
            EGL_BAD_DISPLAY = new EGLError("EGL_BAD_DISPLAY", 8, 12296);
            EGL_BAD_SURFACE = new EGLError("EGL_BAD_SURFACE", 9, 12301);
            EGL_BAD_MATCH = new EGLError("EGL_BAD_MATCH", 10, 12297);
            EGL_BAD_PARAMETER = new EGLError("EGL_BAD_PARAMETER", 11, 12300);
            EGL_BAD_NATIVE_PIXMAP = new EGLError("EGL_BAD_NATIVE_PIXMAP", 12, 12298);
            EGL_BAD_NATIVE_WINDOW = new EGLError("EGL_BAD_NATIVE_WINDOW", 13, 12299);
            EGL_CONTEXT_LOST = new EGLError("EGL_CONTEXT_LOST", 14, 12302);
            $VALUES = (new EGLError[] {
                EGL_SUCCESS, EGL_NOT_INITIALIZED, EGL_BAD_ACCESS, EGL_BAD_ALLOC, EGL_BAD_ATTRIBUTE, EGL_BAD_CONTEXT, EGL_BAD_CONFIG, EGL_BAD_CURRENT_SURFACE, EGL_BAD_DISPLAY, EGL_BAD_SURFACE, 
                EGL_BAD_MATCH, EGL_BAD_PARAMETER, EGL_BAD_NATIVE_PIXMAP, EGL_BAD_NATIVE_WINDOW, EGL_CONTEXT_LOST
            });
        }

        private EGLError(String s, int i, int j)
        {
            super(s, i);
            GLHelpers.EGL_ERRORS.put(Integer.valueOf(j), this);
        }
    }

    private static class EGLException extends Exception
    {

        private static final long serialVersionUID = 1L;

        public EGLException(int i)
        {
            super(((EGLError)GLHelpers.EGL_ERRORS.get(Integer.valueOf(i))).name());
        }
    }


    private static final Map EGL_ERRORS = new HashMap();
    private final String tag;

    public GLHelpers(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("tag");
        } else
        {
            tag = s;
            return;
        }
    }



}
