// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl.real.impl;

import android.hardware.Camera;
import android.os.Build;
import com.microsoft.dl.Platform;
import com.microsoft.dl.utils.Log;
import com.microsoft.dl.video.capture.api.CameraCapabilities;
import com.microsoft.dl.video.capture.api.CaptureException;
import com.microsoft.dl.video.capture.api.FpsRange;
import com.microsoft.dl.video.capture.api.ImageFormat;
import com.microsoft.dl.video.capture.api.Resolution;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public final class CameraCapabilitiesUtils
{
    private static class SerializationBean
        implements Serializable
    {

        private final String a;
        private final List b;

        public List getCapabilities()
        {
            return b;
        }

        public boolean isSameOSBuild()
        {
            return Build.FINGERPRINT.equals(a);
        }

        public String toString()
        {
            return (new StringBuilder()).append(getClass().getSimpleName()).append(" [osBuildFingerprint=").append(a).append(", capabilities=").append(b).append("]").toString();
        }

        public SerializationBean(List list)
        {
            a = Build.FINGERPRINT;
            b = list;
        }
    }

    private static class SerializationFailedException extends Exception
    {

        public SerializationFailedException(String s)
        {
            super(s);
        }

        public SerializationFailedException(Throwable throwable)
        {
            super(throwable);
        }
    }


    private CameraCapabilitiesUtils()
    {
    }

    private static CameraCapabilities a(int i)
        throws CaptureException
    {
        Camera camera;
        android.hardware.Camera.Parameters parameters;
        Object obj1;
        obj1 = b(i);
        camera = c(i);
        parameters = camera.getParameters();
        CameraCapabilities cameracapabilities;
        cameracapabilities = new CameraCapabilities();
        cameracapabilities.setCameraId(i);
        ((android.hardware.Camera.CameraInfo) (obj1)).facing;
        JVM INSTR tableswitch 0 1: default 271
    //                   0 154
    //                   1 161;
           goto _L1 _L2 _L3
_L1:
        Object obj = com.microsoft.dl.video.capture.api.CameraCapabilities.Facing.OTHER;
_L9:
        cameracapabilities.setFacing(((com.microsoft.dl.video.capture.api.CameraCapabilities.Facing) (obj)));
        cameracapabilities.setOrientation(360 - ((android.hardware.Camera.CameraInfo) (obj1)).orientation);
        obj = new TreeSet();
        obj1 = parameters.getSupportedPreviewFormats().iterator();
_L8:
        if (!((Iterator) (obj1)).hasNext()) goto _L5; else goto _L4
_L4:
        Integer integer;
        ImageFormat imageformat;
        integer = (Integer)((Iterator) (obj1)).next();
        imageformat = mapImageFormat(integer.intValue());
        if (imageformat == null) goto _L7; else goto _L6
_L6:
        ((NavigableSet) (obj)).add(imageformat);
          goto _L8
        obj;
        camera.release();
        throw obj;
_L2:
        obj = com.microsoft.dl.video.capture.api.CameraCapabilities.Facing.BACK;
          goto _L9
_L3:
        obj = com.microsoft.dl.video.capture.api.CameraCapabilities.Facing.FRONT;
          goto _L9
_L7:
        if (!Log.isLoggable("Capture", 3)) goto _L8; else goto _L10
_L10:
        Log.d("Capture", (new StringBuilder("Unknown image format ")).append(integer).append(", skipping").toString());
          goto _L8
_L5:
        cameracapabilities.setSupportedImageFormats(((NavigableSet) (obj)));
        cameracapabilities.setSupportedResolutions(b(parameters));
        cameracapabilities.setSupportedFpsRanges(a(parameters));
        obj = (android.hardware.Camera.Size)Collections.max(parameters.getSupportedPictureSizes(), new Comparator() {

            public final int compare(android.hardware.Camera.Size size, android.hardware.Camera.Size size1)
            {
                return Integer.signum(size.width * size.height - size1.width * size1.height);
            }

            public final volatile int compare(Object obj2, Object obj3)
            {
                return compare((android.hardware.Camera.Size)obj2, (android.hardware.Camera.Size)obj3);
            }

        });
        cameracapabilities.setNativeAspectRatio((float)((android.hardware.Camera.Size) (obj)).width / (float)((android.hardware.Camera.Size) (obj)).height);
        camera.release();
        return cameracapabilities;
          goto _L9
    }

    private static List a()
        throws SerializationFailedException
    {
        Object obj;
        Object obj1;
        Object obj2;
        try
        {
            obj = new FileInputStream(new File(Platform.getInfo().getCacheDir(), "camera_capabilities"));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new SerializationFailedException(((Throwable) (obj)));
        }
        catch (StreamCorruptedException streamcorruptedexception)
        {
            throw new SerializationFailedException(streamcorruptedexception);
        }
        catch (IOException ioexception)
        {
            throw new SerializationFailedException(ioexception);
        }
        obj1 = new ObjectInputStream(((java.io.InputStream) (obj)));
        obj2 = (SerializationBean)((ObjectInputStream) (obj1)).readObject();
        if (!((SerializationBean) (obj2)).isSameOSBuild())
        {
            throw new SerializationFailedException("The OS build fingerprint has changed");
        }
        break MISSING_BLOCK_LABEL_81;
        obj2;
        ((ObjectInputStream) (obj1)).close();
        throw obj2;
        obj1;
        ((FileInputStream) (obj)).close();
        throw obj1;
        obj2 = ((SerializationBean) (obj2)).getCapabilities();
        ((ObjectInputStream) (obj1)).close();
        ((FileInputStream) (obj)).close();
        return ((List) (obj2));
    }

    private static NavigableSet a(android.hardware.Camera.Parameters parameters)
    {
        TreeSet treeset = new TreeSet();
        for (parameters = parameters.getSupportedPreviewFpsRange().iterator(); parameters.hasNext(); treeset.add(mapFpsRange((int[])parameters.next()))) { }
        return treeset;
    }

    private static android.hardware.Camera.CameraInfo b(int i)
        throws CaptureException
    {
        android.hardware.Camera.CameraInfo camerainfo = new android.hardware.Camera.CameraInfo();
        try
        {
            Camera.getCameraInfo(i, camerainfo);
        }
        catch (RuntimeException runtimeexception)
        {
            throw new CaptureException((new StringBuilder("Could not get CameraInfo for the camera ")).append(i).toString(), runtimeexception);
        }
        return camerainfo;
    }

    private static List b()
        throws CaptureException
    {
        ArrayList arraylist = new ArrayList();
        int i = 0;
        for (int j = Camera.getNumberOfCameras(); i < j; i++)
        {
            arraylist.add(a(i));
        }

        return arraylist;
    }

    private static NavigableSet b(android.hardware.Camera.Parameters parameters)
    {
        TreeSet treeset = new TreeSet();
        for (parameters = parameters.getSupportedPreviewSizes().iterator(); parameters.hasNext(); treeset.add(mapResolution((android.hardware.Camera.Size)parameters.next()))) { }
        return treeset;
    }

    private static Camera c(int i)
        throws CaptureException
    {
        Object obj;
        try
        {
            obj = Camera.open(i);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new CaptureException((new StringBuilder("Could not open camera ")).append(i).toString(), ((Throwable) (obj)));
        }
        if (obj == null)
        {
            throw new CaptureException((new StringBuilder("Could not open camera ")).append(i).toString());
        } else
        {
            return ((Camera) (obj));
        }
    }

    public static boolean isPictureSizeSupported(Resolution resolution, android.hardware.Camera.Parameters parameters)
    {
        for (parameters = parameters.getSupportedPictureSizes().iterator(); parameters.hasNext();)
        {
            android.hardware.Camera.Size size = (android.hardware.Camera.Size)parameters.next();
            if (size.width == resolution.getWidth() && size.height == resolution.getHeight())
            {
                return true;
            }
        }

        return false;
    }

    public static FpsRange mapFpsRange(int ai[])
    {
        return new FpsRange(ai[0], ai[1]);
    }

    public static int mapImageFormat(ImageFormat imageformat)
    {
        static class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[ImageFormat.values().length];
                try
                {
                    a[ImageFormat.NV21.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[ImageFormat.YV12.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[ImageFormat.NV16.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[ImageFormat.YUY2.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2.a[imageformat.ordinal()])
        {
        default:
            throw new IllegalArgumentException(imageformat.toString());

        case 1: // '\001'
            return 17;

        case 2: // '\002'
            return 0x32315659;

        case 3: // '\003'
            return 16;

        case 4: // '\004'
            return 20;
        }
    }

    public static ImageFormat mapImageFormat(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 17: // '\021'
            return ImageFormat.NV21;
        }
    }

    public static Resolution mapResolution(android.hardware.Camera.Size size)
    {
        return new Resolution(size.width, size.height);
    }

    public static List obtain()
        throws CaptureException
    {
        boolean flag2;
        boolean flag3;
        boolean flag4;
        flag3 = false;
        flag2 = false;
        flag4 = false;
        Object obj = a();
        boolean flag;
        boolean flag1;
        flag = true;
        flag1 = flag4;
_L1:
        if ((!flag || flag2 || flag1) && (flag || !flag2))
        {
            Log.wtf("Capture", (new StringBuilder("The invariant as failed: isLoaded=")).append(flag).append(", isCollected=").append(flag2).append(", isSaved=").append(flag1).toString());
        }
        if (Log.isLoggable("Capture", 4))
        {
            StringBuilder stringbuilder = new StringBuilder("Camera capabilities are ");
            Object obj1;
            SerializationFailedException serializationfailedexception;
            ObjectOutputStream objectoutputstream;
            Exception exception;
            Exception exception1;
            boolean flag5;
            if (flag)
            {
                obj1 = "loaded from the cache file";
            } else
            {
                obj1 = "";
            }
            stringbuilder = stringbuilder.append(((String) (obj1)));
            if (flag2)
            {
                obj1 = "collected from the device";
            } else
            {
                obj1 = "";
            }
            stringbuilder = stringbuilder.append(((String) (obj1)));
            if (flag1)
            {
                obj1 = " and saved to the cache file";
            } else
            {
                obj1 = "";
            }
            Log.i("Capture", stringbuilder.append(((String) (obj1))).toString());
            for (obj1 = ((List) (obj)).iterator(); ((Iterator) (obj1)).hasNext(); Log.i("Capture", ((CameraCapabilities)((Iterator) (obj1)).next()).toString())) { }
        }
        break MISSING_BLOCK_LABEL_411;
        serializationfailedexception;
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Could not load camera capabilities from file: ")).append(serializationfailedexception.getMessage()).toString());
        }
        obj1 = b();
        flag5 = true;
        obj = new FileOutputStream(new File(Platform.getInfo().getCacheDir(), "camera_capabilities"));
        objectoutputstream = new ObjectOutputStream(((java.io.OutputStream) (obj)));
        objectoutputstream.writeObject(new SerializationBean(((List) (obj1))));
        objectoutputstream.close();
        ((FileOutputStream) (obj)).close();
        flag1 = true;
        obj = obj1;
        flag2 = flag5;
        flag = flag3;
          goto _L1
        exception1;
        objectoutputstream.close();
        throw exception1;
        exception;
        ((FileOutputStream) (obj)).close();
        throw exception;
        obj;
        try
        {
            throw new SerializationFailedException(((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = obj1;
        }
        flag2 = flag5;
        flag = flag3;
        flag1 = flag4;
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", "Could not save camera capabilities to file", serializationfailedexception);
            obj = obj1;
            flag2 = flag5;
            flag = flag3;
            flag1 = flag4;
        }
          goto _L1
        return ((List) (obj));
    }
}
