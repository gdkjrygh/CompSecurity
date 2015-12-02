// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;


// Referenced classes of package com.qihoo360.common.utils:
//            TLVBuilder

public static final class  extends Enum
{

    public static final DT_BYTES DT_BYTES;
    public static final DT_BYTES DT_INT;
    public static final DT_BYTES DT_LONG;
    public static final DT_BYTES DT_STRING;
    private static final DT_BYTES a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/qihoo360/common/utils/TLVBuilder$DataType, s);
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
        DT_INT = new <init>("DT_INT", 0);
        DT_LONG = new <init>("DT_LONG", 1);
        DT_STRING = new <init>("DT_STRING", 2);
        DT_BYTES = new <init>("DT_BYTES", 3);
        a = (new a[] {
            DT_INT, DT_LONG, DT_STRING, DT_BYTES
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
