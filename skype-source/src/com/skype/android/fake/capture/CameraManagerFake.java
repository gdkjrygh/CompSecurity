// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.fake.capture;

import com.skype.android.fake.capture.impl.CameraConfig;
import com.skype.android.fake.capture.impl.CaptureSession;
import com.skype.android.platform.capture.Camera;
import com.skype.android.platform.capture.CameraInfo;
import com.skype.android.platform.capture.CameraManager;
import com.skype.android.platform.capture.CameraManagerFactory;
import com.skype.android.platform.capture.CaptureException;
import com.skype.android.util.Log;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.skype.android.fake.capture:
//            a

public class CameraManagerFake
    implements CameraManager
{
    public static class Factory
        implements CameraManagerFactory
    {

        public CameraManager createCameraManager()
        {
            String s1 = "{ \"cameras\": [ { \"id\": 0 } ] }";
            String s = CameraManagerFake.a("/sdcard/fakecam/config.json");
_L2:
            return new CameraManagerFake(s);
            Object obj;
            obj;
            obj = s1;
            if (!Log.isLoggable("Capture", 5)) goto _L2; else goto _L1
_L1:
            Log.w("Capture", "Could not read configuration from /sdcard/fakecam/config.json");
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


    private final CaptureSession a = new CaptureSession();
    private final List b;

    public CameraManagerFake(String s)
        throws JSONException
    {
        b = CameraConfig.a((new JSONObject(s)).getJSONArray("cameras"));
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Initialized with ")).append(b).toString());
        }
    }

    static String a(String s)
        throws IOException
    {
        return b(s);
    }

    private static String b(String s)
        throws IOException
    {
        s = new BufferedReader(new FileReader(s));
        Object obj = new StringBuilder();
_L1:
        String s1 = s.readLine();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        ((StringBuilder) (obj)).append(s1);
          goto _L1
        obj;
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        throw obj;
        obj = ((StringBuilder) (obj)).toString();
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return ((String) (obj));
        }
        return ((String) (obj));
    }

    public final int a()
    {
        return b.size();
    }

    public final Camera a(int i)
        throws CaptureException
    {
        if (i < 0 || i > a())
        {
            throw new IllegalArgumentException((new StringBuilder("No such camera ")).append(i).toString());
        } else
        {
            return new a((CameraConfig)b.get(i), a);
        }
    }

    public final CameraInfo b(int i)
        throws CaptureException
    {
        if (i < 0 || i > a())
        {
            throw new IllegalArgumentException((new StringBuilder("No such camera ")).append(i).toString());
        } else
        {
            return ((CameraConfig)b.get(i)).a.c();
        }
    }

    public void close()
    {
        a.close();
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [config=").append(b).append("]").toString();
    }
}
