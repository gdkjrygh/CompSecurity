// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture;

import com.microsoft.dl.utils.Log;
import com.microsoft.dl.video.capture.api.CameraCapabilities;
import com.microsoft.dl.video.capture.api.CameraManager;
import com.microsoft.dl.video.capture.api.CameraManagerSingleton;
import com.microsoft.dl.video.capture.api.CameraParameters;
import com.microsoft.dl.video.capture.api.CaptureException;
import com.microsoft.dl.video.capture.api.FpsRange;
import com.microsoft.dl.video.capture.api.ImageFormat;
import com.microsoft.dl.video.capture.api.Resolution;
import com.microsoft.dl.video.capture.impl.CaptureWorker;
import com.microsoft.dl.video.capture.impl.ResolutionMatcher;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;

// Referenced classes of package com.microsoft.dl.video.capture:
//            CapturerMode, CapturerConfiguration

public class Capturer
{

    private final String a;
    private final CameraCapabilities b;
    private final List c;
    private final CaptureWorker d;
    private final Thread e;
    private boolean f;
    private int g;
    private Object h;

    private Capturer(int i, long l, CapturerConfiguration capturerconfiguration, String s)
        throws CaptureException
    {
        a = s;
        b = CameraManagerSingleton.getInstance().getCameraCapabilities(i);
        c = a(b, capturerconfiguration, s);
        if (Log.isLoggable("Capture", 4))
        {
            i = 0;
            for (Iterator iterator = c.iterator(); iterator.hasNext();)
            {
                CapturerMode capturermode1 = (CapturerMode)iterator.next();
                Log.i("Capture", (new StringBuilder("Capturing mode ")).append(i).append(": ").append(capturermode1).append(" (").append(s).append(")").toString());
                i++;
            }

        }
        CapturerMode capturermode = (CapturerMode)Collections.min(c, new Comparator() {

            public final int compare(CapturerMode capturermode2, CapturerMode capturermode3)
            {
                int j = Capturer.a(capturermode3) - Capturer.a(capturermode2);
                if (j > 0)
                {
                    return 1;
                }
                return j >= 0 ? 0 : -1;
            }

            public final volatile int compare(Object obj, Object obj1)
            {
                return compare((CapturerMode)obj, (CapturerMode)obj1);
            }

        });
        i = b(capturermode);
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Highest resolution is ")).append(capturermode.getResolutionTransformation().getFrom()).append(", max sample size is ").append((float)i / 1024F).append(" kB (").append(s).append(")").toString());
        }
        d = new CaptureWorker(b.getCameraId(), i, capturerconfiguration.getNumBuffers(), l, s);
        e = new Thread(d);
    }

    static int a(CapturerMode capturermode)
    {
        return b(capturermode);
    }

    private static int a(Iterable iterable)
    {
        int i = 0;
        iterable = iterable.iterator();
        do
        {
            if (!iterable.hasNext())
            {
                break;
            }
            FpsRange fpsrange = (FpsRange)iterable.next();
            if (fpsrange.getMax() > i)
            {
                i = fpsrange.getMax();
            }
        } while (true);
        return i;
    }

    private static List a(CameraCapabilities cameracapabilities, CapturerConfiguration capturerconfiguration, String s)
        throws CaptureException
    {
        Object obj;
        ResolutionMatcher resolutionmatcher;
        int i;
        obj = new HashSet(cameracapabilities.getSupportedResolutions());
        ((Set) (obj)).removeAll(capturerconfiguration.getBannedCameraResolution());
        resolutionmatcher = new ResolutionMatcher(((Set) (obj)), cameracapabilities.getNativeAspectRatio());
        obj = cameracapabilities.getFacing();
        i = cameracapabilities.getOrientation() % 360;
        static class _cls3
        {

            static final int a[];

            static 
            {
                a = new int[com.microsoft.dl.video.capture.api.CameraCapabilities.Facing.values().length];
                try
                {
                    a[com.microsoft.dl.video.capture.api.CameraCapabilities.Facing.FRONT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.microsoft.dl.video.capture.api.CameraCapabilities.Facing.BACK.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.microsoft.dl.video.capture.api.CameraCapabilities.Facing.OTHER.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls3.a[((com.microsoft.dl.video.capture.api.CameraCapabilities.Facing) (obj)).ordinal()];
        JVM INSTR tableswitch 1 3: default 92
    //                   1 117
    //                   2 567
    //                   3 567;
           goto _L1 _L2 _L3 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("facing=")).append(obj).toString());
_L2:
        i;
        JVM INSTR lookupswitch 4: default 160
    //                   0: 185
    //                   90: 528
    //                   180: 545
    //                   270: 556;
           goto _L4 _L5 _L6 _L7 _L8
_L4:
        throw new IllegalArgumentException((new StringBuilder("mountingAngle=")).append(i).toString());
_L5:
        obj = EnumSet.of(CapturerMode.Orientation.FlippedHorizontally);
_L10:
        FpsRange fpsrange;
        ArrayList arraylist;
        Iterator iterator;
        fpsrange = new FpsRange(capturerconfiguration.getAbsFpsRange().getMin(), Math.min(capturerconfiguration.getAbsFpsRange().getMax(), a(((Iterable) (cameracapabilities.getSupportedFpsRanges())))));
        arraylist = new ArrayList();
        iterator = capturerconfiguration.getOutputResolutions().iterator();
          goto _L9
_L6:
        obj = EnumSet.of(CapturerMode.Orientation.FlippedVertically, CapturerMode.Orientation.FlippedHorizontally, CapturerMode.Orientation.Transposed);
          goto _L10
_L7:
        obj = EnumSet.of(CapturerMode.Orientation.FlippedVertically);
          goto _L10
_L8:
        obj = EnumSet.of(CapturerMode.Orientation.Transposed);
          goto _L10
_L3:
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("mountingAngle=")).append(i).toString());

        case 0: // '\0'
            obj = EnumSet.noneOf(com/microsoft/dl/video/capture/CapturerMode$Orientation);
            break;

        case 90: // 'Z'
            obj = EnumSet.of(CapturerMode.Orientation.FlippedVertically, CapturerMode.Orientation.Transposed);
            break;

        case 180: 
            obj = EnumSet.of(CapturerMode.Orientation.FlippedVertically, CapturerMode.Orientation.FlippedHorizontally);
            break;

        case 270: 
            obj = EnumSet.of(CapturerMode.Orientation.FlippedVertically, CapturerMode.Orientation.Transposed);
            break;
        }
        continue; /* Loop/switch isn't completed */
        if (!((CapturerConfiguration.ResolutionParameters)((java.util.Map.Entry) (obj2)).getValue()).isMandatory()) goto _L9; else goto _L11
_L11:
        throw new CaptureException((new StringBuilder("Coud not support mandaroty resolution ")).append(((java.util.Map.Entry) (obj2)).getKey()).append(" (").append(s).append(")").toString());
_L9:
        Object obj2;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            obj2 = (java.util.Map.Entry)iterator.next();
            Object obj1 = capturerconfiguration.getTransformationOptions();
            boolean flag = ((CapturerConfiguration.ResolutionParameters)((java.util.Map.Entry) (obj2)).getValue()).isMandatory();
            Object obj3 = new ArrayList(2);
            if (flag && ((Set) (obj1)).contains(CapturerConfiguration.TransformationOptions.AllowCroppingMandatoryResolutions) || ((Set) (obj1)).contains(CapturerConfiguration.TransformationOptions.AllowCroppingAnyResolution))
            {
                ((List) (obj3)).add(com.microsoft.dl.video.capture.impl.ResolutionMatcher.TransformationAllowed.Cropping);
            }
            float f1;
            float f2;
            if (flag && ((Set) (obj1)).contains(CapturerConfiguration.TransformationOptions.AllowScalingMandatoryResolutions) || ((Set) (obj1)).contains(CapturerConfiguration.TransformationOptions.AllowScalingAnyResolution))
            {
                ((List) (obj3)).add(com.microsoft.dl.video.capture.impl.ResolutionMatcher.TransformationAllowed.AllScaling);
            } else
            if (flag && ((Set) (obj1)).contains(CapturerConfiguration.TransformationOptions.AllowMultipleScalingMandatoryResolutions) || ((Set) (obj1)).contains(CapturerConfiguration.TransformationOptions.AllowMultipleScalingAnyResolution))
            {
                ((List) (obj3)).add(com.microsoft.dl.video.capture.impl.ResolutionMatcher.TransformationAllowed.MultipleScaling);
            }
            if (((List) (obj3)).isEmpty())
            {
                obj1 = EnumSet.noneOf(com/microsoft/dl/video/capture/impl/ResolutionMatcher$TransformationAllowed);
            } else
            {
                obj1 = EnumSet.copyOf(((java.util.Collection) (obj3)));
            }
            obj3 = (Resolution)((java.util.Map.Entry) (obj2)).getKey();
            if (((CapturerConfiguration.ResolutionParameters)((java.util.Map.Entry) (obj2)).getValue()).isMandatory())
            {
                f1 = (1.0F / 0.0F);
            } else
            {
                f1 = (float)capturerconfiguration.getMaxTransformationZoom() / 100F;
            }
            if (((CapturerConfiguration.ResolutionParameters)((java.util.Map.Entry) (obj2)).getValue()).isMandatory())
            {
                f2 = (1.0F / 0.0F);
            } else
            {
                f2 = (float)capturerconfiguration.getMaxTransformationCrop() / 100F;
            }
            obj1 = resolutionmatcher.findBest(((Resolution) (obj3)), f1, f2, ((EnumSet) (obj1)));
            if (obj1 == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj2 = cameracapabilities.getSupportedImageFormats().iterator();
            while (((Iterator) (obj2)).hasNext()) 
            {
                arraylist.add(new CapturerMode(((com.microsoft.dl.video.capture.impl.ResolutionMatcher.ResolutionTransformation) (obj1)), (ImageFormat)((Iterator) (obj2)).next(), ((EnumSet) (obj)), fpsrange));
            }
        } while (true);
        return arraylist;
        if (true) goto _L10; else goto _L12
_L12:
    }

    private static int b(CapturerMode capturermode)
    {
        return capturermode.getFormat().getSampleSize(capturermode.getResolutionTransformation().getFrom());
    }

    public static Capturer create(int i, long l, CapturerConfiguration capturerconfiguration, String s, long l1)
    {
label0:
        {
            if (Log.isLoggable("Capture", 4))
            {
                Log.i("Capture", (new StringBuilder("Creating the capturer (")).append(s).append(")").toString());
            }
            try
            {
                capturerconfiguration = new Capturer(i, l, capturerconfiguration, s);
                ((Capturer) (capturerconfiguration)).e.start();
                if (!((Capturer) (capturerconfiguration)).d.isOpen(l1))
                {
                    break label0;
                }
                if (Log.isLoggable("Capture", 4))
                {
                    Log.i("Capture", (new StringBuilder("Capturer created and initialized successfully (")).append(s).append(")").toString());
                }
            }
            // Misplaced declaration of an exception variable
            catch (CapturerConfiguration capturerconfiguration)
            {
                if (Log.isLoggable("Capture", 5))
                {
                    Log.w("Capture", (new StringBuilder("Interrupted (")).append(s).append(")").toString(), capturerconfiguration);
                }
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (CapturerConfiguration capturerconfiguration)
            {
                if (Log.isLoggable("Capture", 6))
                {
                    Log.e("Capture", (new StringBuilder("Could create the capturer (")).append(s).append(")").toString(), capturerconfiguration);
                }
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (CapturerConfiguration capturerconfiguration)
            {
                if (Log.isLoggable("Capture", 6))
                {
                    Log.e("Capture", (new StringBuilder("Exception caught (")).append(s).append(")").toString(), capturerconfiguration);
                }
                return null;
            }
            return capturerconfiguration;
        }
        return null;
    }

    public final CapturerMode getMode(int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (i < 0) goto _L2; else goto _L1
_L1:
        if (i < c.size()) goto _L3; else goto _L2
_L2:
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", (new StringBuilder("Thre is no mode #")).append(i).append(" (").append(a).append(")").toString());
        }
        CapturerMode capturermode = null;
_L5:
        this;
        JVM INSTR monitorexit ;
        return capturermode;
_L3:
        capturermode = (CapturerMode)c.get(i);
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public final int getNumModes()
    {
        this;
        JVM INSTR monitorenter ;
        int i = c.size();
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean isRunning()
    {
        this;
        JVM INSTR monitorenter ;
        if (!e.isAlive()) goto _L2; else goto _L1
_L1:
        boolean flag = f;
        if (!flag) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean setPreview(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        h = obj;
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Setting preview display to ")).append(obj).toString());
        }
        flag = f;
        if (flag) goto _L2; else goto _L1
_L1:
        flag = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (!d.isUpdate(null, h, -1, -1, -1))
        {
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Restarting the capturer in order to apply preview display change (")).append(a).append(")").toString());
        }
        d.stop();
        f = false;
        d.start(null, h, -1, -1, -1);
        f = true;
        flag = true;
        continue; /* Loop/switch isn't completed */
        obj;
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", (new StringBuilder("Could not start capturing (")).append(a).append(")").toString(), ((Throwable) (obj)));
        }
        break MISSING_BLOCK_LABEL_253;
        obj;
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", (new StringBuilder("Exception caught (")).append(a).append(")").toString(), ((Throwable) (obj)));
        }
        flag = false;
        continue; /* Loop/switch isn't completed */
        obj;
        throw obj;
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean setPreviewOrientation(int i)
    {
        this;
        JVM INSTR monitorenter ;
        _cls3.a[b.getFacing().ordinal()];
        JVM INSTR tableswitch 1 1: default 334
    //                   1 123;
           goto _L1 _L2
_L5:
        int j;
        boolean flag;
        g = j;
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Setting preview display orientation to ")).append(g).append("/").append(i).append(" degrees (").append(a).append(")").toString());
        }
        flag = f;
        if (flag) goto _L4; else goto _L3
_L3:
        flag = true;
_L6:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        j = i % 360;
          goto _L5
_L4:
        if (d.isUpdate(null, null, g, -1, -1))
        {
            break MISSING_BLOCK_LABEL_156;
        }
        flag = true;
          goto _L6
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Restarting the capturer in order to apply orientation change (")).append(a).append(")").toString());
        }
        d.stop();
        f = false;
        d.start(null, null, g, -1, -1);
        f = true;
        flag = true;
          goto _L6
        Object obj;
        obj;
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", (new StringBuilder("Could not start capturing (")).append(a).append(")").toString(), ((Throwable) (obj)));
        }
        break MISSING_BLOCK_LABEL_347;
        obj;
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", (new StringBuilder("Exception caught (")).append(a).append(")").toString(), ((Throwable) (obj)));
        }
        flag = false;
          goto _L6
        obj;
        throw obj;
_L1:
        j = (360 - i) % 360;
          goto _L5
        flag = false;
          goto _L6
    }

    public final boolean shutdown(long l)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Shutting down the capturer (")).append(a).append(")").toString());
        }
        if (d == null) goto _L2; else goto _L1
_L1:
        d.close();
        if (e == null || !e.isAlive()) goto _L2; else goto _L3
_L3:
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Waiting until worker thread exit (")).append(a).append(")").toString());
        }
        e.join(l);
        if (!e.isAlive()) goto _L2; else goto _L4
_L4:
        boolean flag = flag1;
        if (!Log.isLoggable("Capture", 6))
        {
            break MISSING_BLOCK_LABEL_198;
        }
        Log.e("Capture", (new StringBuilder("Worker thread has not exited during ")).append((float)l / 1000F).append(" sec (").append(a).append(")").toString());
        flag = flag1;
_L6:
        this;
        JVM INSTR monitorexit ;
        return flag;
        Object obj;
        obj;
        flag = flag1;
        if (!Log.isLoggable("Capture", 5))
        {
            continue; /* Loop/switch isn't completed */
        }
        Log.w("Capture", (new StringBuilder("Interrupted (")).append(a).append(")").toString(), ((Throwable) (obj)));
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        obj;
        flag = flag1;
        if (!Log.isLoggable("Capture", 6))
        {
            continue; /* Loop/switch isn't completed */
        }
        Log.e("Capture", (new StringBuilder("Exception caught (")).append(a).append(")").toString(), ((Throwable) (obj)));
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        obj;
        throw obj;
_L2:
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("The capturer shut down successfully (")).append(a).append(")").toString());
        }
        flag = true;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final boolean startMode(int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        CameraParameters cameraparameters;
        obj = getMode(i);
        cameraparameters = new CameraParameters();
        cameraparameters.setImageFormat(((CapturerMode) (obj)).getFormat());
        cameraparameters.setResolution(((CapturerMode) (obj)).getResolutionTransformation().getFrom());
        if (b.getSupportedFpsRanges().isEmpty())
        {
            throw new IllegalStateException("No frame rate ranges defined");
        }
          goto _L1
        obj;
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", (new StringBuilder("Could not start capturing (")).append(a).append(")").toString(), ((Throwable) (obj)));
        }
        boolean flag = false;
_L3:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L1:
        FpsRange fpsrange = (FpsRange)Collections.min(b.getSupportedFpsRanges(), new Comparator(j) {

            final int a;
            final Capturer b;

            public int compare(FpsRange fpsrange1, FpsRange fpsrange2)
            {
                if (fpsrange1.getMin() < a || fpsrange2.getMin() >= a) goto _L2; else goto _L1
_L1:
                return -1;
_L2:
                int l;
                if (fpsrange1.getMin() < a && fpsrange2.getMin() >= a)
                {
                    return 1;
                }
                l = 0;
                if (fpsrange1.getMin() < a || fpsrange2.getMin() < a) goto _L4; else goto _L3
_L3:
                int k = fpsrange1.getMax() - fpsrange2.getMax();
_L6:
                l = fpsrange2.getMax() - fpsrange2.getMin() - (fpsrange1.getMax() - fpsrange1.getMin());
                if (k > 0)
                {
                    return 1;
                }
                break; /* Loop/switch isn't completed */
_L4:
                k = l;
                if (fpsrange1.getMin() < a)
                {
                    k = l;
                    if (fpsrange2.getMin() < a)
                    {
                        k = fpsrange2.getMin() - fpsrange1.getMin();
                    }
                }
                if (true) goto _L6; else goto _L5
_L5:
                if (k >= 0)
                {
                    if (l > 0)
                    {
                        return 1;
                    }
                    if (l >= 0)
                    {
                        return 0;
                    }
                }
                if (true) goto _L1; else goto _L7
_L7:
            }

            public volatile int compare(Object obj2, Object obj3)
            {
                return compare((FpsRange)obj2, (FpsRange)obj3);
            }

            
            {
                b = Capturer.this;
                a = i;
                super();
            }
        });
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Frame rate matching ")).append((float)j / 1000F).append(" found: ").append(fpsrange).append(" fps (").append(a).append(")").toString());
        }
        cameraparameters.setFpsRange(fpsrange);
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Starting capturing mode ")).append(i).append(" [").append(obj).append("], ").append((float)j / 1000F).append(" fps, CameraParameters: ").append(cameraparameters).append(" (").append(a).append(")").toString());
        }
        if (!f)
        {
            break MISSING_BLOCK_LABEL_344;
        }
        if (!d.isUpdate(cameraparameters, h, g, j, i))
        {
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
        d.stop();
        f = false;
        d.start(cameraparameters, h, g, j, i);
        f = true;
        flag = true;
        continue; /* Loop/switch isn't completed */
        Object obj1;
        obj1;
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", (new StringBuilder("Exception caught (")).append(a).append(")").toString(), ((Throwable) (obj1)));
        }
        flag = false;
        if (true) goto _L3; else goto _L2
_L2:
        obj1;
        throw obj1;
    }

    public final boolean stop()
    {
        boolean flag1 = true;
        this;
        JVM INSTR monitorenter ;
        if (f) goto _L2; else goto _L1
_L1:
        boolean flag = flag1;
        if (!Log.isLoggable("Capture", 4))
        {
            break MISSING_BLOCK_LABEL_55;
        }
        Log.i("Capture", (new StringBuilder("Stop capturing request ignored - capturing is not started (")).append(a).append(")").toString());
        flag = flag1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        d.stop();
        f = false;
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        Object obj;
        obj;
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", (new StringBuilder("Could not start capturing (")).append(a).append(")").toString(), ((Throwable) (obj)));
        }
        break MISSING_BLOCK_LABEL_175;
        obj;
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", (new StringBuilder("Exception caught (")).append(a).append(")").toString(), ((Throwable) (obj)));
        }
        flag = false;
        continue; /* Loop/switch isn't completed */
        obj;
        throw obj;
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
