// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.lib2.opensense.internal;

import android.os.Environment;
import java.io.File;

// Referenced classes of package com.htc.lib2.opensense.internal:
//            SystemWrapper

public static class 
{

    private static final File DEFAULT_PHONE_STORAGE_FILE = new File("/storage/emmc");
    private static final File DEFAULT_REMOVABLE_STORAGE_FILE = new File("/storage/ext_sd");
    public static final String MEDIA_MOUNTED = "mounted";
    public static final String MEDIA_REMOVED = "removed";

    public static File getExternalStorageDirectory()
    {
        return android.os.Environment.getExternalStorageDirectory();
    }

    public static String getExternalStorageState()
    {
        return android.os.Environment.getExternalStorageState();
    }

    public static File getPhoneStorageDirectory()
    {
        return (File)SystemWrapper.invokePublicStaticMethod("android.os.Environment", "getPhoneStorageDirectory", DEFAULT_PHONE_STORAGE_FILE, null, null);
    }

    public static String getPhoneStorageState()
    {
        return (String)SystemWrapper.invokePublicStaticMethod("android.os.Environment", "getPhoneStorageState", "removed", null, null);
    }

    public static File getRemovableStorageDirectory()
    {
        return (File)SystemWrapper.invokePublicStaticMethod("android.os.Environment", "getRemovableStorageDirectory", DEFAULT_REMOVABLE_STORAGE_FILE, null, null);
    }

    public static String getRemovableStorageState()
    {
        return (String)SystemWrapper.invokePublicStaticMethod("android.os.Environment", "getRemovableStorageState", "removed", null, null);
    }

    public static boolean hasPhoneStorage()
    {
        return ((Boolean)SystemWrapper.invokePublicStaticMethod("android.os.Environment", "hasPhoneStorage", Boolean.valueOf(false), null, null)).booleanValue();
    }

    public static boolean hasRemovableStorageSlot()
    {
        return ((Boolean)SystemWrapper.invokePublicStaticMethod("android.os.Environment", "hasRemovableStorageSlot", Boolean.valueOf(false), null, null)).booleanValue();
    }

    public static boolean isExternalStorageEmulated()
    {
        return android.os.Environment.isExternalStorageEmulated();
    }


    public ()
    {
    }
}
