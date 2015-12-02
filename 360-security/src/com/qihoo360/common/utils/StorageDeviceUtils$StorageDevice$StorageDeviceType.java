// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;


// Referenced classes of package com.qihoo360.common.utils:
//            StorageDeviceUtils

public static final class  extends Enum
{

    public static final EXTERNAL EXTERNAL;
    public static final EXTERNAL INTERNAL;
    public static final EXTERNAL SYSTEM;
    private static final EXTERNAL a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/qihoo360/common/utils/StorageDeviceUtils$StorageDevice$StorageDeviceType, s);
    }

    public static [] values()
    {
         a1[] = a;
        int i = a1.length;
         a2[] = new a[i];
        System.arraycopy(a1, 0, a2, 0, i);
        return a2;
    }

    static 
    {
        SYSTEM = new <init>("SYSTEM", 0);
        INTERNAL = new <init>("INTERNAL", 1);
        EXTERNAL = new <init>("EXTERNAL", 2);
        a = (new a[] {
            SYSTEM, INTERNAL, EXTERNAL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
