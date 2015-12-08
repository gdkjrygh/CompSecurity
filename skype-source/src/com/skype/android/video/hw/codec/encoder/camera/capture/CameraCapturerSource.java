// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.capture;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import com.skype.android.video.hw.format.Resolution;
import com.skype.android.video.hw.utils.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.skype.android.video.hw.codec.encoder.camera.capture:
//            CapturerSource, CapturerException

public class CameraCapturerSource
    implements CapturerSource
{
    private static class FpsRange
    {

        public final int max;
        public final int min;

        public String toString()
        {
            return (new StringBuilder()).append((float)min / 1000F).append("-").append((float)max / 1000F).toString();
        }

        public FpsRange(int i, int j)
        {
            min = i;
            max = j;
        }
    }


    private Camera camera;
    private int cameraId;

    public CameraCapturerSource(int i)
        throws CapturerException
    {
        cameraId = -1;
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Constructing for camera #").append(i).toString());
        }
        cameraId = i;
        camera = acquireCamera(i);
    }

    private static Camera acquireCamera(int i)
        throws CapturerException
    {
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/CameraCapturerSource.getSimpleName()).append(": Opening camera #").append(i).toString());
        }
        Object obj;
        try
        {
            obj = Camera.open(i);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (Log.isLoggable("SLIQ", 6))
            {
                Log.e("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/CameraCapturerSource.getSimpleName()).append(": Failed to open camera #").append(i).toString(), ((Throwable) (obj)));
            }
            throw new CapturerException((new StringBuilder("Failed to open camera #")).append(i).toString(), ((Throwable) (obj)));
        }
        if (obj == null)
        {
            if (Log.isLoggable("SLIQ", 6))
            {
                Log.e("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/CameraCapturerSource.getSimpleName()).append(": Failed to open camera #").append(i).toString());
            }
            throw new CapturerException((new StringBuilder("Failed to open camera #")).append(i).toString());
        } else
        {
            return ((Camera) (obj));
        }
    }

    private static FpsRange findFpsRange(List list, int i)
        throws CapturerException
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            int ai[] = (int[])iterator.next();
            if (ai[0] <= i && ai[1] >= i)
            {
                arraylist.add(ai);
            }
        } while (true);
        if (arraylist.isEmpty())
        {
            throw new CapturerException((new StringBuilder("Framerate ")).append((float)i / 1000F).append(" is not contained withing ranges ").append(list).toString());
        }
        Collections.sort(arraylist, new Comparator() {

            private int getSize(int ai1[])
            {
                return ai1[1] - ai1[0];
            }

            public final volatile int compare(Object obj, Object obj1)
            {
                return compare((int[])obj, (int[])obj1);
            }

            public final int compare(int ai1[], int ai2[])
            {
                int j = getSize(ai1);
                int k = getSize(ai2);
                if (j < k)
                {
                    return -1;
                }
                return j <= k ? 0 : 1;
            }

        });
        list = new FpsRange(((int[])arraylist.get(0))[0], ((int[])arraylist.get(0))[1]);
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/CameraCapturerSource.getSimpleName()).append(": Desired framerate ").append((float)i / 1000F).append(" is found within range ").append(list).append(" fps").toString());
        }
        return list;
    }

    public void close()
    {
        if (camera != null)
        {
            if (Log.isLoggable("SLIQ", 4))
            {
                Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Closing").toString());
            }
            stop();
            if (Log.isLoggable("SLIQ", 4))
            {
                Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Releasing camera #").append(cameraId).toString());
            }
            camera.release();
            camera = null;
            cameraId = -1;
        }
    }

    public void configure(Resolution resolution, int i)
        throws CapturerException
    {
        android.hardware.Camera.Parameters parameters = camera.getParameters();
        if (resolution != null)
        {
            if (Log.isLoggable("SLIQ", 4))
            {
                Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Setting camera #").append(cameraId).append(" resolution ").append(resolution).toString());
            }
            parameters.setPreviewSize(resolution.getWidth(), resolution.getHeight());
        }
        if (i > 0)
        {
            resolution = findFpsRange(parameters.getSupportedPreviewFpsRange(), i);
            if (Log.isLoggable("SLIQ", 4))
            {
                Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Setting camera #").append(cameraId).append(" framerate ").append(resolution).append(" fps").toString());
            }
            parameters.setPreviewFpsRange(((FpsRange) (resolution)).min, ((FpsRange) (resolution)).max);
        }
        try
        {
            camera.setParameters(parameters);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Resolution resolution) { }
        if (Log.isLoggable("SLIQ", 6))
        {
            Log.e("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Failed to set parameters for the camera #").append(cameraId).toString(), resolution);
        }
        throw new CapturerException((new StringBuilder("Failed to set parameters for the camera #")).append(cameraId).toString(), resolution);
    }

    public long getNativeCtx()
    {
        return 0L;
    }

    public void setFramerate(int i)
        throws CapturerException
    {
        configure(null, i);
    }

    public void setResolution(Resolution resolution)
        throws CapturerException
    {
        configure(resolution, 0);
    }

    public void setSurfaceTexture(SurfaceTexture surfacetexture)
        throws CapturerException
    {
        try
        {
            camera.setPreviewTexture(surfacetexture);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SurfaceTexture surfacetexture) { }
        if (Log.isLoggable("SLIQ", 6))
        {
            Log.e("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Failed to set preview texture for the camera #").append(cameraId).toString(), surfacetexture);
        }
        throw new CapturerException((new StringBuilder("Failed to set preview texture for the camera #")).append(cameraId).toString(), surfacetexture);
    }

    public void start()
        throws CapturerException
    {
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Starting camera #").append(cameraId).toString());
        }
        try
        {
            camera.startPreview();
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            throw new CapturerException((new StringBuilder("Failed to start preview from the camera #")).append(cameraId).toString(), runtimeexception);
        }
    }

    public void stop()
    {
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Stopping camera #").append(cameraId).toString());
        }
        camera.stopPreview();
    }

    public void unlock()
    {
    }
}
