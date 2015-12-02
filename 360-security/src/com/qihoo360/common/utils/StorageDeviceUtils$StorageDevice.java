// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;

import android.content.Context;

// Referenced classes of package com.qihoo360.common.utils:
//            StorageDeviceUtils, Utils

public static class StorageDeviceType
{
    public static final class StorageDeviceType extends Enum
    {

        public static final StorageDeviceType EXTERNAL;
        public static final StorageDeviceType INTERNAL;
        public static final StorageDeviceType SYSTEM;
        private static final StorageDeviceType a[];

        public static StorageDeviceType valueOf(String s)
        {
            return (StorageDeviceType)Enum.valueOf(com/qihoo360/common/utils/StorageDeviceUtils$StorageDevice$StorageDeviceType, s);
        }

        public static StorageDeviceType[] values()
        {
            StorageDeviceType astoragedevicetype[] = a;
            int i = astoragedevicetype.length;
            StorageDeviceType astoragedevicetype1[] = new StorageDeviceType[i];
            System.arraycopy(astoragedevicetype, 0, astoragedevicetype1, 0, i);
            return astoragedevicetype1;
        }

        static 
        {
            SYSTEM = new StorageDeviceType("SYSTEM", 0);
            INTERNAL = new StorageDeviceType("INTERNAL", 1);
            EXTERNAL = new StorageDeviceType("EXTERNAL", 2);
            a = (new StorageDeviceType[] {
                SYSTEM, INTERNAL, EXTERNAL
            });
        }

        private StorageDeviceType(String s, int i)
        {
            super(s, i);
        }
    }


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

    public StorageDeviceType()
    {
    }
}
