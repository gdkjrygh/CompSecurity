// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo360.common.utils:
//            Utils

public class StorageDeviceUtils
{
    public static class StorageDevice
    {

        public long freeSize;
        public String path;
        public long totalSize;
        public StorageDeviceType type;

        public String getFormatFreeSize(Context context)
        {
            return Utils.getHumanReadableSizeMore(freeSize);
        }

        public String getFormatTotalSize(Context context)
        {
            return Utils.getHumanReadableSizeMore(totalSize);
        }

        public String toString()
        {
            return (new StringBuilder("StorageDevice [type=")).append(type).append(", totalSize=").append(totalSize).append(", freeSize=").append(freeSize).append(", path=").append(path).append("]").toString();
        }

        public StorageDevice()
        {
        }
    }

    public static final class StorageDevice.StorageDeviceType extends Enum
    {

        public static final StorageDevice.StorageDeviceType EXTERNAL;
        public static final StorageDevice.StorageDeviceType INTERNAL;
        public static final StorageDevice.StorageDeviceType SYSTEM;
        private static final StorageDevice.StorageDeviceType a[];

        public static StorageDevice.StorageDeviceType valueOf(String s)
        {
            return (StorageDevice.StorageDeviceType)Enum.valueOf(com/qihoo360/common/utils/StorageDeviceUtils$StorageDevice$StorageDeviceType, s);
        }

        public static StorageDevice.StorageDeviceType[] values()
        {
            StorageDevice.StorageDeviceType astoragedevicetype[] = a;
            int i = astoragedevicetype.length;
            StorageDevice.StorageDeviceType astoragedevicetype1[] = new StorageDevice.StorageDeviceType[i];
            System.arraycopy(astoragedevicetype, 0, astoragedevicetype1, 0, i);
            return astoragedevicetype1;
        }

        static 
        {
            SYSTEM = new StorageDevice.StorageDeviceType("SYSTEM", 0);
            INTERNAL = new StorageDevice.StorageDeviceType("INTERNAL", 1);
            EXTERNAL = new StorageDevice.StorageDeviceType("EXTERNAL", 2);
            a = (new StorageDevice.StorageDeviceType[] {
                SYSTEM, INTERNAL, EXTERNAL
            });
        }

        private StorageDevice.StorageDeviceType(String s, int i)
        {
            super(s, i);
        }
    }


    public StorageDeviceUtils()
    {
    }

    public static long getDataPartitionFreeSize()
    {
        StatFs statfs = new StatFs(Environment.getDataDirectory().getPath());
        long l = statfs.getBlockSize();
        return (long)statfs.getAvailableBlocks() * l;
    }

    public static long getDataPartitionTotalSize()
    {
        StatFs statfs = new StatFs(Environment.getDataDirectory().getPath());
        long l = statfs.getBlockSize();
        return (long)statfs.getBlockCount() * l;
    }

    public static long getFreeStorageSize(Context context)
    {
        context = getValidExternalStorageDevicePath(context);
        long l = 0L;
        long l1 = getDataPartitionFreeSize();
        int j = context.size();
        int i = 0;
        do
        {
            if (i >= j)
            {
                return l + l1;
            }
            l += getStorageDevice((String)context.get(i)).freeSize;
            i++;
        } while (true);
    }

    public static String getSDPathBySDKApi()
    {
        if (Environment.getExternalStorageState().equals("mounted"))
        {
            return Environment.getExternalStorageDirectory().toString();
        } else
        {
            return null;
        }
    }

    public static StorageDevice getStorageDevice(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return null;
        }
        StorageDevice storagedevice = new StorageDevice();
        try
        {
            StatFs statfs = new StatFs(s);
            long l = statfs.getBlockSize();
            long l1 = statfs.getBlockCount();
            long l2 = statfs.getAvailableBlocks();
            storagedevice.path = s;
            storagedevice.totalSize = l1 * l;
            storagedevice.freeSize = l * l2;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return storagedevice;
        }
        return storagedevice;
    }

    public static List getStorageDevice(Context context)
    {
        Object obj1 = Environment.getExternalStorageDirectory().getPath();
        Object obj;
        Exception exception1;
        StorageDevice storagedevice;
        int i;
        boolean flag;
        try
        {
            flag = ((Boolean)android/os/Environment.getMethod("isExternalStorageRemovable", new Class[0]).invoke(android/os/Environment, null)).booleanValue();
        }
        catch (Exception exception)
        {
            flag = false;
        }
        try
        {
            obj = Utils.getInternalAndExternalSDPath(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = null;
            obj = null;
            break MISSING_BLOCK_LABEL_130;
        }
        if (obj == null)
        {
            return null;
        }
        i = ((ArrayList) (obj)).size();
        if (i != 2) goto _L2; else goto _L1
_L1:
        context = (String)((ArrayList) (obj)).get(0);
        obj = (String)((ArrayList) (obj)).get(1);
        if (!((String) (obj1)).equals(context) || !flag)
        {
            obj1 = context;
            context = ((Context) (obj));
            obj = obj1;
        }
_L11:
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L4; else goto _L3
_L3:
        obj = getStorageDevice(((String) (obj)));
        obj1 = obj;
        try
        {
            obj.type = StorageDevice.StorageDeviceType.INTERNAL;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = null;
            obj = obj1;
            break MISSING_BLOCK_LABEL_130;
        }
_L9:
        obj1 = obj;
        if (TextUtils.isEmpty(context)) goto _L6; else goto _L5
_L5:
        obj1 = obj;
        context = getStorageDevice(((String) (context)));
        try
        {
            context.type = StorageDevice.StorageDeviceType.EXTERNAL;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception1) { }
_L7:
        storagedevice = getStorageDevice(Environment.getDataDirectory().getPath());
        storagedevice.type = StorageDevice.StorageDeviceType.SYSTEM;
        obj1 = obj;
        if (obj != null)
        {
            obj1 = obj;
            if (storagedevice != null)
            {
                obj1 = obj;
                if (((StorageDevice) (obj)).totalSize == storagedevice.totalSize)
                {
                    obj1 = obj;
                    if (((StorageDevice) (obj)).freeSize == storagedevice.freeSize)
                    {
                        obj1 = null;
                    }
                }
            }
        }
        obj = new ArrayList();
        if (storagedevice != null)
        {
            ((List) (obj)).add(storagedevice);
        }
        if (obj1 != null)
        {
            ((List) (obj)).add(obj1);
        }
        if (context != null)
        {
            ((List) (obj)).add(context);
        }
        if (context == null && obj1 != null && haveSdCard())
        {
            obj1.type = StorageDevice.StorageDeviceType.EXTERNAL;
            return ((List) (obj));
        } else
        {
            return ((List) (obj));
        }
_L2:
        if (i != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        context = (String)((ArrayList) (obj)).get(0);
        if (flag)
        {
            obj = null;
        } else
        {
            obj = context;
            context = null;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        context = null;
          goto _L7
_L4:
        obj = null;
        if (true) goto _L9; else goto _L8
_L8:
        context = null;
        obj = null;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public static float getStorageUsedPercent(Context context)
    {
        long l = 0L;
        long l2 = getDataPartitionTotalSize();
        getDataPartitionFreeSize();
        context = getValidExternalStorageDevicePath(context);
        int j = context.size();
        int i = 0;
        long l1 = 0L;
        do
        {
            if (i >= j)
            {
                l1 += l2;
                return (float)((l1 - l) / l1);
            }
            StorageDevice storagedevice = getStorageDevice((String)context.get(i));
            l1 += storagedevice.totalSize;
            l += storagedevice.freeSize;
            i++;
        } while (true);
    }

    public static long getTotalStorageSize(Context context)
    {
        context = getValidExternalStorageDevicePath(context);
        long l = 0L;
        long l1 = getDataPartitionTotalSize();
        int j = context.size();
        int i = 0;
        do
        {
            if (i >= j)
            {
                return l + l1;
            }
            l += getStorageDevice((String)context.get(i)).totalSize;
            i++;
        } while (true);
    }

    public static long getUsedStorage(Context context)
    {
        long l;
        long l1;
        long l2;
        l2 = 0L;
        context = getStorageDevice(context);
        if (context == null || context.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        context = context.iterator();
        l = 0L;
        l1 = 0L;
_L3:
        if (context.hasNext()) goto _L2; else goto _L1
_L1:
        l1 -= l;
        l = l2;
        if (l1 > 0L)
        {
            l = l1;
        }
        return l;
_L2:
        StorageDevice storagedevice = (StorageDevice)context.next();
        l1 += storagedevice.totalSize;
        l = storagedevice.freeSize + l;
          goto _L3
        l = 0L;
        l1 = 0L;
          goto _L1
    }

    public static ArrayList getValidExternalStorageDevicePath(Context context)
    {
        ArrayList arraylist;
        long l;
        arraylist = new ArrayList();
        l = getDataPartitionTotalSize();
        if (android.os.Build.VERSION.SDK_INT < 14) goto _L2; else goto _L1
_L1:
        context = ((Context) (Utils.getSystemService(context, "storage")));
        if (context == null) goto _L4; else goto _L3
_L3:
        Object obj;
        Method method;
        method = context.getClass().getMethod("getVolumeList", null);
        obj = context.getClass().getMethod("getVolumeState", new Class[] {
            java/lang/String
        });
        if (method == null) goto _L4; else goto _L5
_L5:
        Object aobj[] = (Object[])method.invoke(context, null);
        if (aobj == null) goto _L4; else goto _L6
_L6:
        if (aobj.length <= 0) goto _L4; else goto _L7
_L7:
        Object obj1 = aobj[0];
        Method method1;
        method1 = obj1.getClass().getMethod("isEmulated", null);
        obj1 = obj1.getClass().getMethod("getPath", null);
        int i = 0;
_L15:
        if (i >= aobj.length)
        {
            i = 0;
            break MISSING_BLOCK_LABEL_129;
        }
        obj2 = aobj[i];
        if (!((Boolean)method1.invoke(obj2, null)).booleanValue())
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = (String)((Method) (obj1)).invoke(obj2, null);
        if (!"mounted".equals(((Method) (obj)).invoke(context, new Object[] {
    obj2
})))
        {
            break; /* Loop/switch isn't completed */
        }
        storagedevice = getStorageDevice(((String) (obj2)));
        if (storagedevice == null)
        {
            break; /* Loop/switch isn't completed */
        }
        String as[];
        Object obj3;
        try
        {
            if (storagedevice.totalSize >= 2L * l)
            {
                arraylist.add(obj2);
            }
            break; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
          goto _L4
_L9:
        Object obj2;
        StorageDevice storagedevice;
        if (i >= aobj.length)
        {
            return arraylist;
        }
        obj3 = aobj[i];
        if (!((Boolean)method1.invoke(obj3, null)).booleanValue())
        {
            obj3 = (String)((Method) (obj1)).invoke(obj3, null);
            if ("mounted".equals(((Method) (obj)).invoke(context, new Object[] {
    obj3
})))
            {
                arraylist.add(obj3);
            }
        }
        i++;
        if (true) goto _L9; else goto _L8
_L2:
        context = getSDPathBySDKApi();
        if (!TextUtils.isEmpty(context))
        {
            arraylist.add(context);
        }
        context = new BufferedReader(new InputStreamReader(new FileInputStream(new File("/proc/mounts"))));
_L11:
        obj = context.readLine();
        if (obj == null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return arraylist;
            }
            return arraylist;
        }
        if (!((String) (obj)).contains("uid=1000") || !((String) (obj)).contains("gid=1015") || ((String) (obj)).contains("asec")) goto _L11; else goto _L10
_L10:
        as = ((String) (obj)).split(" ");
        if (as.length < 4) goto _L11; else goto _L12
_L12:
        as = as[1];
        if (arraylist.contains(as)) goto _L11; else goto _L13
_L13:
        arraylist.add(as);
          goto _L11
        context;
        return arraylist;
_L4:
        return arraylist;
_L8:
        i++;
        if (true) goto _L15; else goto _L14
_L14:
    }

    public static boolean haveSdCard()
    {
        Object obj = (new File("/sys/class/mmc_host/mmc0")).listFiles();
        int i = 0;
_L8:
        int j = obj.length;
        if (i < j) goto _L2; else goto _L1
_L1:
        obj = (new File("/sys/class/mmc_host/mmc1")).listFiles();
        i = 0;
_L10:
        j = obj.length;
        if (i < j) goto _L4; else goto _L3
_L3:
        obj = (new File("/sys/class/mmc_host/mmc2")).listFiles();
        i = 0;
_L12:
        j = obj.length;
        if (i < j) goto _L6; else goto _L5
_L5:
        return false;
_L2:
        if (!obj[i].toString().contains("mmc0:"))
        {
            break MISSING_BLOCK_LABEL_135;
        }
        obj = readFileLine((new StringBuilder(String.valueOf(obj[i].toString()))).append("/type").toString());
        if (obj == null) goto _L1; else goto _L7
_L7:
        boolean flag = ((String) (obj)).equals("SD");
        if (flag)
        {
            return true;
        }
          goto _L1
        i++;
          goto _L8
_L4:
        if (!obj[i].toString().contains("mmc1:"))
        {
            break MISSING_BLOCK_LABEL_204;
        }
        obj = readFileLine((new StringBuilder(String.valueOf(obj[i].toString()))).append("/type").toString());
        if (obj == null) goto _L3; else goto _L9
_L9:
        flag = ((String) (obj)).equals("SD");
        if (flag)
        {
            return true;
        }
          goto _L3
        i++;
          goto _L10
_L6:
        if (!obj[i].toString().contains("mmc2:"))
        {
            break MISSING_BLOCK_LABEL_273;
        }
        obj = readFileLine((new StringBuilder(String.valueOf(obj[i].toString()))).append("/type").toString());
        if (obj == null) goto _L5; else goto _L11
_L11:
        flag = ((String) (obj)).equals("SD");
        if (flag)
        {
            return true;
        }
          goto _L5
        i++;
          goto _L12
        Exception exception;
        exception;
          goto _L5
        exception;
          goto _L3
        exception;
          goto _L1
    }

    public static String readFileLine(String s)
    {
        BufferedReader bufferedreader = new BufferedReader(new FileReader(s));
        s = bufferedreader;
        Object obj = bufferedreader.readLine();
        Exception exception;
        try
        {
            bufferedreader.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return ((String) (obj));
        }
        return ((String) (obj));
        obj;
        bufferedreader = null;
_L4:
        s = bufferedreader;
        ((Exception) (obj)).printStackTrace();
        try
        {
            bufferedreader.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return null;
        exception;
        s = null;
_L2:
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
