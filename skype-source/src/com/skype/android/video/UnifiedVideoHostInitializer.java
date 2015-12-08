// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import com.skype.android.skylib.VideoHostInitializer;
import com.skype.android.util.MethodTrace;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

// Referenced classes of package com.skype.android.video:
//            Platform, DeviceProfile

public class UnifiedVideoHostInitializer
    implements VideoHostInitializer
{

    private static final String CONFIG_FILENAME = "device_profile.json";
    private boolean videoSupported;

    public UnifiedVideoHostInitializer()
    {
    }

    public void initLibs(Context context)
    {
        boolean flag;
        if (Build.CPU_ABI.equals("armeabi-v7a") || Build.CPU_ABI2.equals("armeabi-v7a"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        videoSupported = flag;
        if (!videoSupported)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        if (Platform.isSliqExternal())
        {
            System.loadLibrary("sliq");
        }
        System.loadLibrary("codecs");
        DeviceProfile.updateCameraFacingAndMounting();
        return;
        context;
    }

    public void postInit(Context context)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Context context1;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        MethodTrace methodtrace;
        if (!videoSupported)
        {
            break MISSING_BLOCK_LABEL_210;
        }
        methodtrace = new MethodTrace("UnifiedVideoHostInitializer", "postInit");
        Platform.initialize(context);
        obj5 = null;
        obj6 = null;
        obj = null;
        obj4 = null;
        obj3 = null;
        obj2 = obj5;
        context1 = obj4;
        obj1 = obj6;
        File file = context.getExternalCacheDir();
        FileInputStream fileinputstream;
        fileinputstream = ((FileInputStream) (obj));
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        obj2 = obj5;
        context1 = obj4;
        obj1 = obj6;
        file = new File(file, "device_profile.json");
        fileinputstream = ((FileInputStream) (obj));
        obj2 = obj5;
        context1 = obj4;
        obj1 = obj6;
        if (!file.exists())
        {
            break MISSING_BLOCK_LABEL_131;
        }
        obj2 = obj5;
        context1 = obj4;
        obj1 = obj6;
        fileinputstream = new FileInputStream(file);
        obj = fileinputstream;
        if (fileinputstream != null)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        obj2 = fileinputstream;
        context1 = obj4;
        obj1 = fileinputstream;
        obj = context.getAssets().open("device_profile.json");
        obj2 = obj;
        context1 = obj4;
        obj1 = obj;
        context = new Scanner(((InputStream) (obj)), "UTF-8");
        DeviceProfile.initWhitelist(context.useDelimiter("\\A").next());
        Throwable throwable;
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            catch (IOException ioexception) { }
        }
        context.close();
        methodtrace.b();
        return;
        throwable;
        obj = obj2;
        context = obj3;
_L4:
        context1 = context;
        obj1 = obj;
        throwable.printStackTrace();
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            catch (IOException ioexception1) { }
        }
        if (context != null)
        {
            context.close();
        }
        break MISSING_BLOCK_LABEL_204;
        context;
        obj = obj1;
_L2:
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            catch (IOException ioexception2) { }
        }
        if (context1 != null)
        {
            context1.close();
        }
        throw context;
        Exception exception;
        exception;
        context1 = context;
        context = exception;
        if (true) goto _L2; else goto _L1
_L1:
        throwable;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void release()
    {
    }
}
