// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.google.gson.reflect.TypeToken;
import com.snapchat.android.Timber;
import java.util.Map;

public final class Im
{

    public static final String DISPLAY_DENSITY_PARAM = "display_density";
    public static final String NUM_PROCESSORS_PARAM = "num_processors";
    public static final String TAG = "DeviceUtils";
    public static final String TOTAL_MEMORY_PARAM = "total_memory";
    public static final String YEAR_CLASS_PARAM = "year_class";
    private static final Im sInstance = new Im();
    public Map mDeviceHardwareInfo;

    protected Im()
    {
    }

    public static Im a()
    {
        return sInstance;
    }

    public static boolean a(Context context)
    {
        return (context.getResources().getConfiguration().screenLayout & 0xf) >= 3;
    }

    public static int b(Context context)
    {
        return ((ActivityManager)context.getSystemService("activity")).getMemoryClass();
    }

    public static android.app.ActivityManager.MemoryInfo c(Context context)
    {
        android.app.ActivityManager.MemoryInfo memoryinfo;
        try
        {
            memoryinfo = new android.app.ActivityManager.MemoryInfo();
            ((ActivityManager)context.getSystemService("activity")).getMemoryInfo(memoryinfo);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Timber.e("DeviceUtils", "Failed to get the memory info %s", new Object[] {
                context.getMessage()
            });
            return null;
        }
        return memoryinfo;
    }

    public static int d(Context context)
    {
        context = (ActivityManager)context.getSystemService("activity");
        int i;
        try
        {
            i = context.getLargeMemoryClass();
        }
        catch (Exception exception)
        {
            Timber.e("DeviceUtils", "getLargeMemoryClass failed %s", new Object[] {
                exception.getMessage()
            });
            return context.getMemoryClass();
        }
        return i;
    }


    // Unreferenced inner class Im$1

/* anonymous class */
    public final class _cls1 extends TypeToken
    {

        final Im this$0;

            public 
            {
                this$0 = Im.this;
                super();
            }
    }

}
