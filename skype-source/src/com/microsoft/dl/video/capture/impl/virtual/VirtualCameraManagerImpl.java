// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl.virtual;

import com.microsoft.dl.Platform;
import com.microsoft.dl.utils.Log;
import com.microsoft.dl.video.capture.api.Camera;
import com.microsoft.dl.video.capture.api.CameraCapabilities;
import com.microsoft.dl.video.capture.api.CameraManager;
import com.microsoft.dl.video.capture.api.CameraManagerFactory;
import com.microsoft.dl.video.capture.api.CaptureException;
import com.microsoft.dl.video.capture.impl.virtual.impl.CameraConfig;
import com.microsoft.dl.video.capture.impl.virtual.impl.CaptureSession;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.microsoft.dl.video.capture.impl.virtual:
//            VirtualCameraImpl

public class VirtualCameraManagerImpl
    implements CameraManager
{
    public static class Factory
        implements CameraManagerFactory
    {

        public final CameraManager createCameraManager()
        {
            String s1 = "{ \"cameras\": [ { \"id\": 0 } ] }";
            String s = VirtualCameraManagerImpl.a(VirtualCameraManagerImpl.a());
_L2:
            return new VirtualCameraManagerImpl(s);
            Object obj;
            obj;
            obj = s1;
            if (!Log.isLoggable("Capture", 5)) goto _L2; else goto _L1
_L1:
            Log.w("Capture", (new StringBuilder("Could not read configuration from ")).append(VirtualCameraManagerImpl.a()).toString());
            obj = s1;
              goto _L2
            obj;
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", "Could not parse configuration", ((Throwable) (obj)));
            }
            return null;
        }

        public Factory()
        {
        }
    }


    public static final String DIR;
    private static final File a;
    private final CaptureSession b = new CaptureSession();
    private final List c;

    public VirtualCameraManagerImpl(String s)
        throws JSONException
    {
        c = CameraConfig.parse((new JSONObject(s)).getJSONArray("cameras"));
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Initialized with ")).append(c).toString());
        }
    }

    static File a()
    {
        return a;
    }

    static String a(File file)
        throws IOException
    {
        return b(file);
    }

    private static String b(File file)
        throws IOException
    {
        file = new BufferedReader(new FileReader(file));
        Object obj = new StringBuilder();
_L1:
        String s = file.readLine();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        ((StringBuilder) (obj)).append(s);
          goto _L1
        obj;
        try
        {
            file.close();
        }
        // Misplaced declaration of an exception variable
        catch (File file) { }
        throw obj;
        obj = ((StringBuilder) (obj)).toString();
        try
        {
            file.close();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return ((String) (obj));
        }
        return ((String) (obj));
    }

    public final void close()
    {
        b.close();
    }

    public final CameraCapabilities getCameraCapabilities(int i)
        throws CaptureException
    {
        if (i < 0 || i > getNumberOfCameras())
        {
            throw new IllegalArgumentException((new StringBuilder("No such camera ")).append(i).toString());
        } else
        {
            return ((CameraConfig)c.get(i)).getCapabilities().clone();
        }
    }

    public final int getNumberOfCameras()
    {
        return c.size();
    }

    public final Camera openCamera(int i)
        throws CaptureException
    {
        if (i < 0 || i > getNumberOfCameras())
        {
            throw new IllegalArgumentException((new StringBuilder("No such camera ")).append(i).toString());
        } else
        {
            return new VirtualCameraImpl((CameraConfig)c.get(i), b);
        }
    }

    public final String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [config=").append(c).append("]").toString();
    }

    static 
    {
        DIR = (new StringBuilder()).append(Platform.getInfo().getStorageDir()).append(File.pathSeparator).append("fakecam").toString();
        a = new File(DIR, "config.json");
    }
}
