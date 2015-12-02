// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;


// Referenced classes of package com.qihoo360.common.utils:
//            ZipUtil

public static final class  extends Enum
{

    public static final SizeLimitZipResult_NotFound SizeLimitZipResult_NotFound;
    public static final SizeLimitZipResult_NotFound SizeLimitZipResult_OK;
    public static final SizeLimitZipResult_NotFound SizeLimitZipResult_TooBig;
    private static final SizeLimitZipResult_NotFound a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/qihoo360/common/utils/ZipUtil$SizeLimitZipResult, s);
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
        SizeLimitZipResult_OK = new <init>("SizeLimitZipResult_OK", 0);
        SizeLimitZipResult_TooBig = new <init>("SizeLimitZipResult_TooBig", 1);
        SizeLimitZipResult_NotFound = new <init>("SizeLimitZipResult_NotFound", 2);
        a = (new a[] {
            SizeLimitZipResult_OK, SizeLimitZipResult_TooBig, SizeLimitZipResult_NotFound
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
