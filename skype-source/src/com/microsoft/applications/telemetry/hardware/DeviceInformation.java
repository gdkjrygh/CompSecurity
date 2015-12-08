// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry.hardware;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.microsoft.applications.telemetry.PowerSource;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.microsoft.applications.telemetry.hardware:
//            AbstractHardwareInformation

public class DeviceInformation extends AbstractHardwareInformation
{
    private static final class OsArchitectureType extends Enum
    {

        private static final OsArchitectureType $VALUES[];
        public static final OsArchitectureType ARCH_ARM;
        public static final OsArchitectureType ARCH_UNKNOWN;
        public static final OsArchitectureType ARCH_X64;
        public static final OsArchitectureType ARCH_X86;
        private final int osArchType;

        public static OsArchitectureType valueOf(String s)
        {
            return (OsArchitectureType)Enum.valueOf(com/microsoft/applications/telemetry/hardware/DeviceInformation$OsArchitectureType, s);
        }

        public static OsArchitectureType[] values()
        {
            return (OsArchitectureType[])$VALUES.clone();
        }

        public final int getValue()
        {
            return osArchType;
        }

        static 
        {
            ARCH_UNKNOWN = new OsArchitectureType("ARCH_UNKNOWN", 0, 0);
            ARCH_X86 = new OsArchitectureType("ARCH_X86", 1, 1);
            ARCH_X64 = new OsArchitectureType("ARCH_X64", 2, 2);
            ARCH_ARM = new OsArchitectureType("ARCH_ARM", 3, 3);
            $VALUES = (new OsArchitectureType[] {
                ARCH_UNKNOWN, ARCH_X86, ARCH_X64, ARCH_ARM
            });
        }

        private OsArchitectureType(String s, int i, int j)
        {
            super(s, i);
            osArchType = j;
        }
    }


    private static final int BYTE_MULTIPLIER = 1024;
    private static final String LOG_TAG = com/microsoft/applications/telemetry/hardware/DeviceInformation.getSimpleName();
    private static final String MEMORY_SIZE = "MemTotal";
    private static final DeviceInformation instance;
    private static String m_cpu_manufacturer;
    private static String m_cpu_model;
    private static String m_device_id;
    private static boolean m_has_front_camera = false;
    private static boolean m_has_rear_camera = false;
    private static double m_height_dpi = 0.0D;
    private static int m_height_inches = 0;
    private static int m_height_pixels = 0;
    private static String m_manufacturer;
    private static long m_memory_size_mb = 0L;
    private static String m_model;
    private static int m_os_architecture_type = 0;
    private static boolean m_support_digitizer = false;
    private static boolean m_support_touch = false;
    private static double m_width_dpi = 0.0D;
    private static int m_width_inches = 0;
    private static int m_width_pixels = 0;

    public DeviceInformation()
    {
    }

    public static void addSubscriber(long l)
    {
        com/microsoft/applications/telemetry/hardware/DeviceInformation;
        JVM INSTR monitorenter ;
        String.format("addSubscriber|ptr:0x%x", new Object[] {
            Long.valueOf(l)
        });
        instance.addSubscriberInstance(l);
        com/microsoft/applications/telemetry/hardware/DeviceInformation;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private static long calculateStorageSize(File file)
    {
        file = new StatFs(file.getAbsolutePath());
        long l;
        if (android.os.Build.VERSION.SDK_INT < 18)
        {
            l = file.getBlockSize();
        } else
        {
            l = file.getBlockSizeLong();
        }
        if (android.os.Build.VERSION.SDK_INT < 18)
        {
            return (long)file.getBlockCount() * l;
        } else
        {
            return file.getBlockCountLong() * l;
        }
    }

    private static long convertBytesToMb(long l)
    {
        return l / 0x100000L;
    }

    private static long convertMemoryStringToMb(String s)
    {
        long l;
        try
        {
            l = (long)Integer.parseInt(s.split(" ")[0]) / 1024L;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e(LOG_TAG, (new StringBuilder("Error reading memory information: ")).append(s.getMessage()).toString());
            return 0L;
        }
        return l;
    }

    private static void determineDisplayInfo(Context context)
    {
        context = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        context.getSize(new Point());
        DisplayMetrics displaymetrics = new DisplayMetrics();
        context.getMetrics(displaymetrics);
        m_height_dpi = displaymetrics.ydpi;
        m_width_dpi = displaymetrics.xdpi;
        m_height_inches = (int)((float)displaymetrics.heightPixels / displaymetrics.ydpi);
        m_width_inches = (int)((float)displaymetrics.widthPixels / displaymetrics.xdpi);
        m_height_pixels = displaymetrics.heightPixels;
        m_width_pixels = displaymetrics.widthPixels;
    }

    private static void determineHardwareSupport(Context context)
    {
        context = context.getPackageManager();
        m_has_rear_camera = context.hasSystemFeature("android.hardware.camera");
        m_has_front_camera = context.hasSystemFeature("android.hardware.camera.front");
        m_support_touch = context.hasSystemFeature("android.hardware.touchscreen");
        m_support_digitizer = false;
    }

    private static Map getCpuInfo()
    {
        return getProcInfo("/proc/cpuinfo");
    }

    public static String getCpuMake()
    {
        String.format("getCpuMake|value: %s", new Object[] {
            m_cpu_manufacturer
        });
        return m_cpu_manufacturer;
    }

    public static String getCpuModel()
    {
        String.format("getCpuMake|value: %s", new Object[] {
            m_cpu_model
        });
        return m_cpu_model;
    }

    public static String getDeviceId()
    {
        String.format("getDeviceId|value: %s", new Object[] {
            m_device_id
        });
        return m_device_id;
    }

    private static long getInternalStorageSize()
    {
        return calculateStorageSize(Environment.getRootDirectory());
    }

    public static String getManufacturer()
    {
        String.format("getManufacturer|value: %s", new Object[] {
            m_manufacturer
        });
        return m_manufacturer;
    }

    private static Map getMemoryInfo()
    {
        return getProcInfo("/proc/meminfo");
    }

    public static long getMemorySize()
    {
        String.format("getMemorySize|value: %s", new Object[] {
            Long.valueOf(m_memory_size_mb)
        });
        return m_memory_size_mb;
    }

    public static String getModel()
    {
        String.format("getModel|value: %s", new Object[] {
            m_model
        });
        return m_model;
    }

    public static int getPowerSource()
    {
        com/microsoft/applications/telemetry/hardware/DeviceInformation;
        JVM INSTR monitorenter ;
        int i;
        i = ((Integer)instance.getObservableProperty("PowerSource")).intValue();
        String.format("getPowerSource|value:%s", new Object[] {
            Integer.valueOf(i)
        });
        com/microsoft/applications/telemetry/hardware/DeviceInformation;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    private static Map getProcInfo(String s)
    {
        HashMap hashmap = new HashMap();
        if (!(new File(s)).exists()) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        s = new BufferedReader(new FileReader(new File(s)));
_L5:
        obj = s.readLine();
        if (obj == null) goto _L4; else goto _L3
_L3:
        String as[];
        as = ((String) (obj)).split(":");
        obj1 = as[0].replaceAll("\t", "").trim();
        obj = "";
        if (as.length > 1)
        {
            obj = as[1].trim();
        }
        hashmap.put(obj1, obj);
          goto _L5
        obj1;
_L9:
        obj = s;
        Log.e(LOG_TAG, (new StringBuilder("Error reading device process information: ")).append(((IOException) (obj1)).getMessage()).toString());
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return hashmap;
            }
        }
_L2:
        return hashmap;
_L4:
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return hashmap;
        }
        return hashmap;
        s;
_L7:
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw s;
        obj1;
        obj = s;
        s = ((String) (obj1));
        if (true) goto _L7; else goto _L6
_L6:
        IOException ioexception;
        ioexception;
        s = ((String) (obj1));
        obj1 = ioexception;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static double getScreenHeightDPI()
    {
        String.format("getScreenHeightDPI|value:%s", new Object[] {
            Double.valueOf(m_height_dpi)
        });
        return m_height_dpi;
    }

    public static int getScreenHeightInInches()
    {
        String.format("getScreenHeightInInches|value:%s", new Object[] {
            Integer.valueOf(m_height_inches)
        });
        return m_height_inches;
    }

    public static int getScreenHeightInPixels()
    {
        String.format("getScreenHeightInPixels|value:%s", new Object[] {
            Integer.valueOf(m_height_pixels)
        });
        return m_height_pixels;
    }

    public static double getScreenWidthDPI()
    {
        String.format("getMemorySize|value %s", new Object[] {
            Long.valueOf(m_memory_size_mb)
        });
        return m_width_dpi;
    }

    public static int getScreenWidthInInches()
    {
        String.format("getScreenWidthInInches|value:%s", new Object[] {
            Integer.valueOf(m_width_inches)
        });
        return m_width_inches;
    }

    public static int getScreenWidthInPixels()
    {
        String.format("getScreenWidthInPixels|value:%s", new Object[] {
            Integer.valueOf(m_width_pixels)
        });
        return m_width_pixels;
    }

    private static long getSdCardStorageSize()
    {
        long l = 0L;
        String s = Environment.getExternalStorageState();
        if ("mounted".equals(s) || "mounted_ro".equals(s))
        {
            l = calculateStorageSize(Environment.getExternalStorageDirectory());
        }
        return l;
    }

    public static long getStorageSize()
    {
        com/microsoft/applications/telemetry/hardware/DeviceInformation;
        JVM INSTR monitorenter ;
        long l;
        l = ((Long)instance.getObservableProperty("StorageSize")).longValue();
        String.format("getStorageSize|value:%s", new Object[] {
            Long.valueOf(l)
        });
        com/microsoft/applications/telemetry/hardware/DeviceInformation;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    private static native void initNative();

    public static boolean isDigitizerAvailable()
    {
        String.format("isDigitizerAvailable|value:%s", new Object[] {
            Boolean.valueOf(m_support_digitizer)
        });
        return m_support_digitizer;
    }

    public static boolean isFrontCameraAvailable()
    {
        String.format("isFrontCameraAvailable|value:%s", new Object[] {
            Boolean.valueOf(m_has_front_camera)
        });
        return m_has_front_camera;
    }

    public static boolean isRearCameraAvailable()
    {
        String.format("isRearCameraAvailable|value:%s", new Object[] {
            Boolean.valueOf(m_has_rear_camera)
        });
        return m_has_rear_camera;
    }

    public static boolean isTouchAvailable()
    {
        String.format("isTouchAvailable|value:%s", new Object[] {
            Boolean.valueOf(m_support_touch)
        });
        return m_support_touch;
    }

    public static void removeSubscriber(long l)
    {
        com/microsoft/applications/telemetry/hardware/DeviceInformation;
        JVM INSTR monitorenter ;
        String.format("removeSubscriber|ptr:0x%x", new Object[] {
            Long.valueOf(l)
        });
        instance.removeSubscriberInstance(l);
        com/microsoft/applications/telemetry/hardware/DeviceInformation;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void update(Context context)
    {
        com/microsoft/applications/telemetry/hardware/DeviceInformation;
        JVM INSTR monitorenter ;
        m_device_id = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        determineHardwareSupport(context);
        determineDisplayInfo(context);
        com/microsoft/applications/telemetry/hardware/DeviceInformation;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    protected static void updatePowerInfo(Intent intent)
    {
        boolean flag = false;
        com/microsoft/applications/telemetry/hardware/DeviceInformation;
        JVM INSTR monitorenter ;
        int i;
        int j;
        j = intent.getIntExtra("plugged", -1);
        break MISSING_BLOCK_LABEL_15;
_L7:
        deviceinformation = instance;
        if (j == 0) goto _L2; else goto _L1
_L1:
        intent = Integer.valueOf(PowerSource.AC.getValue());
_L3:
        deviceinformation.setObservableProperty("PowerSource", intent);
        com/microsoft/applications/telemetry/hardware/DeviceInformation;
        JVM INSTR monitorexit ;
        return;
_L5:
        j = 0;
        break; /* Loop/switch isn't completed */
_L2:
        i = PowerSource.BATTERY.getValue();
        intent = Integer.valueOf(i);
          goto _L3
        intent;
        throw intent;
        DeviceInformation deviceinformation;
        if (j == 2)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (j != 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        j = 1;
        break; /* Loop/switch isn't completed */
        if (true) goto _L5; else goto _L4
_L4:
        if (j == 0)
        {
            j = ((flag) ? 1 : 0);
            if (i == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        j = 1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected static void updateStorageInfo()
    {
        com/microsoft/applications/telemetry/hardware/DeviceInformation;
        JVM INSTR monitorenter ;
        long l = getSdCardStorageSize();
        long l1 = getInternalStorageSize();
        instance.setObservableProperty("StorageSize", Long.valueOf(convertBytesToMb(l + l1)));
        com/microsoft/applications/telemetry/hardware/DeviceInformation;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static 
    {
        instance = new DeviceInformation();
        initNative();
        instance.setObservableProperty("PowerSource", Integer.valueOf(PowerSource.UNKNOWN.getValue()));
        updateStorageInfo();
        m_manufacturer = Build.MANUFACTURER;
        m_model = Build.MODEL;
        m_cpu_manufacturer = Build.HARDWARE;
        String s;
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            s = Build.CPU_ABI;
        } else
        if (Build.SUPPORTED_ABIS.length > 0)
        {
            s = Build.SUPPORTED_ABIS[0];
        } else
        {
            s = "Unknown";
        }
        m_cpu_model = s;
        if (s.matches("(?i)arm"))
        {
            OsArchitectureType.ARCH_ARM.getValue();
        } else
        if (m_cpu_model.matches("[xX]86"))
        {
            OsArchitectureType.ARCH_X86.getValue();
        } else
        if (m_cpu_model.matches("[xX]64"))
        {
            OsArchitectureType.ARCH_X64.getValue();
        } else
        {
            m_os_architecture_type = OsArchitectureType.ARCH_UNKNOWN.getValue();
        }
        m_memory_size_mb = convertMemoryStringToMb((String)getMemoryInfo().get("MemTotal"));
    }
}
