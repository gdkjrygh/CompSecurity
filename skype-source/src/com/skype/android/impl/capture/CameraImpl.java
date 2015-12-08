// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.impl.capture;

import android.view.SurfaceHolder;
import com.skype.android.platform.capture.Camera;
import com.skype.android.platform.capture.CameraCallback;
import com.skype.android.platform.capture.CameraCapabilities;
import com.skype.android.platform.capture.CameraParameters;
import com.skype.android.platform.capture.CaptureException;
import com.skype.android.platform.capture.FpsRange;
import com.skype.android.platform.capture.ImageFormat;
import com.skype.android.video.hw.format.Resolution;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class CameraImpl
    implements Camera
{
    final class a
        implements android.hardware.Camera.PreviewCallback
    {

        final CameraImpl a;
        private final CameraCallback b;

        public final void onPreviewFrame(byte abyte0[], android.hardware.Camera camera)
        {
            b.onFrame(abyte0, a);
        }

        public a(CameraCallback cameracallback)
        {
            a = CameraImpl.this;
            super();
            b = cameracallback;
        }
    }


    private final int a;
    private final android.hardware.Camera b;
    private boolean c;
    private volatile boolean d;

    public CameraImpl(int i)
        throws CaptureException
    {
        c = false;
        d = false;
        d = true;
        a = i;
        try
        {
            b = android.hardware.Camera.open(a);
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            throw new CaptureException((new StringBuilder()).append(getClass().getSimpleName()).append(" Failed to open camera").toString(), runtimeexception);
        }
    }

    private static native boolean getPictureSizeSetting();

    public final CameraCapabilities a()
    {
        CameraCapabilities cameracapabilities = new CameraCapabilities();
        Object obj = b.getParameters();
        cameracapabilities.a(a);
        TreeSet treeset = new TreeSet();
        int ai[];
        for (Iterator iterator = ((android.hardware.Camera.Parameters) (obj)).getSupportedPreviewFpsRange().iterator(); iterator.hasNext(); treeset.add(new FpsRange(ai[0], ai[1])))
        {
            ai = (int[])iterator.next();
        }

        cameracapabilities.c(treeset);
        treeset = new TreeSet();
        Iterator iterator1 = ((android.hardware.Camera.Parameters) (obj)).getSupportedPictureFormats().iterator();
        do
        {
            if (iterator1.hasNext())
            {
                switch (((Integer)iterator1.next()).intValue())
                {
                case 17: // '\021'
                    treeset.add(ImageFormat.b);
                    break;

                case 842094169: 
                    treeset.add(ImageFormat.a);
                    break;
                }
            } else
            {
                cameracapabilities.a(treeset);
                treeset = new TreeSet();
                android.hardware.Camera.Size size;
                for (Iterator iterator2 = ((android.hardware.Camera.Parameters) (obj)).getSupportedPreviewSizes().iterator(); iterator2.hasNext(); treeset.add(new Resolution(size.width, size.height)))
                {
                    size = (android.hardware.Camera.Size)iterator2.next();
                }

                cameracapabilities.b(treeset);
                obj = (android.hardware.Camera.Size)Collections.max(((android.hardware.Camera.Parameters) (obj)).getSupportedPictureSizes(), new Comparator() {

                    final CameraImpl a;

                    public final int compare(Object obj1, Object obj2)
                    {
                        obj1 = (android.hardware.Camera.Size)obj1;
                        obj2 = (android.hardware.Camera.Size)obj2;
                        return Integer.signum(((android.hardware.Camera.Size) (obj1)).width * ((android.hardware.Camera.Size) (obj1)).height - ((android.hardware.Camera.Size) (obj2)).width * ((android.hardware.Camera.Size) (obj2)).height);
                    }

            
            {
                a = CameraImpl.this;
                super();
            }
                });
                cameracapabilities.a((float)((android.hardware.Camera.Size) (obj)).width / (float)((android.hardware.Camera.Size) (obj)).height);
                return cameracapabilities;
            }
        } while (true);
    }

    public final void a(int i)
        throws CaptureException
    {
        try
        {
            b.setDisplayOrientation(i);
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(getClass().getSimpleName()).append(".setDisplayOrientation failed").toString(), runtimeexception);
        }
    }

    public final void a(CameraCallback cameracallback)
    {
        android.hardware.Camera camera = b;
        if (cameracallback != null)
        {
            cameracallback = new a(cameracallback);
        } else
        {
            cameracallback = null;
        }
        camera.setPreviewCallbackWithBuffer(cameracallback);
    }

    public final void a(CameraParameters cameraparameters)
        throws CaptureException
    {
        android.hardware.Camera.Parameters parameters;
        parameters = b.getParameters();
        parameters.setPreviewSize(cameraparameters.a().getWidth(), cameraparameters.a().getHeight());
        if (getPictureSizeSetting())
        {
            parameters.setPictureSize(cameraparameters.a().getWidth(), cameraparameters.a().getHeight());
        }
        static final class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[ImageFormat.values().length];
                try
                {
                    a[ImageFormat.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[ImageFormat.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2.a[cameraparameters.b().ordinal()];
        JVM INSTR tableswitch 1 2: default 84
    //                   1 111
    //                   2 120;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_120;
_L4:
        parameters.setPreviewFpsRange(cameraparameters.c().a(), cameraparameters.c().b());
        try
        {
            b.setParameters(parameters);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CameraParameters cameraparameters)
        {
            throw new CaptureException((new StringBuilder()).append(getClass().getSimpleName()).append(".setParameters failed").toString(), cameraparameters);
        }
_L2:
        parameters.setPreviewFormat(17);
          goto _L4
        parameters.setPreviewFormat(0x32315659);
          goto _L4
    }

    public final void a(Object obj)
        throws CaptureException
    {
        try
        {
            b.setPreviewDisplay((SurfaceHolder)obj);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new CaptureException((new StringBuilder()).append(getClass().getSimpleName()).append(".setPreviewDisplay failed").toString(), ((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new CaptureException((new StringBuilder()).append(getClass().getSimpleName()).append(".setPreviewDisplay failed").toString(), ((Throwable) (obj)));
        }
    }

    public final void a(byte abyte0[])
        throws CaptureException
    {
        if (!d)
        {
            return;
        }
        if (c) goto _L2; else goto _L1
_L1:
        Resolution resolution = null;
        Resolution resolution1 = b().a();
        resolution = resolution1;
_L4:
        if (resolution != null && abyte0.length < resolution.getWidth() * resolution.getHeight())
        {
            throw new IllegalArgumentException((new StringBuilder()).append(getClass().getSimpleName()).append(" insufficient buffer size").toString());
        }
          goto _L2
        abyte0;
        throw new CaptureException("Failed to get parameters", abyte0);
_L2:
        b.addCallbackBuffer(abyte0);
        return;
        CaptureException captureexception;
        captureexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final CameraParameters b()
        throws CaptureException
    {
        CameraParameters cameraparameters;
        android.hardware.Camera.Parameters parameters;
        boolean flag;
        cameraparameters = new CameraParameters();
        parameters = b.getParameters();
        int ai[] = new int[2];
        cameraparameters.a(new Resolution(parameters.getPreviewSize().width, parameters.getPreviewSize().height));
        parameters.getPreviewFpsRange(ai);
        cameraparameters.a(new FpsRange(ai[0], ai[1]));
        flag = true;
        parameters.getPreviewFormat();
        JVM INSTR lookupswitch 2: default 100
    //                   17: 142
    //                   842094169: 152;
           goto _L1 _L2 _L3
_L3:
        break MISSING_BLOCK_LABEL_152;
_L1:
        flag = false;
_L4:
        if (!flag)
        {
            throw new CaptureException((new StringBuilder()).append(getClass().getSimpleName()).append(".getParameters returned unsupported format").toString());
        } else
        {
            return cameraparameters;
        }
_L2:
        cameraparameters.a(ImageFormat.b);
          goto _L4
        cameraparameters.a(ImageFormat.a);
          goto _L4
    }

    public final void c()
    {
        if (c)
        {
            throw new IllegalStateException("Camera is already started");
        } else
        {
            b.startPreview();
            c = true;
            return;
        }
    }

    public void close()
        throws IOException
    {
        d = false;
        b.release();
    }

    public final void d()
    {
        if (!c)
        {
            throw new IllegalStateException("Camera is not started");
        } else
        {
            b.stopPreview();
            c = false;
            return;
        }
    }
}
