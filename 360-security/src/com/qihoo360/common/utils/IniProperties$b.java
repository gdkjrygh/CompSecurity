// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;


// Referenced classes of package com.qihoo360.common.utils:
//            IniProperties

static final class  extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/qihoo360/common/utils/IniProperties$b, s);
    }

    public static [] values()
    {
         a1[] = e;
        int i = a1.length;
         a2[] = new e[i];
        System.arraycopy(a1, 0, a2, 0, i);
        return a2;
    }

    static 
    {
        a = new <init>("NORMAL", 0);
        b = new <init>("ESCAPE", 1);
        c = new <init>("ESC_CRNL", 2);
        d = new <init>("COMMENT", 3);
        e = (new e[] {
            a, b, c, d
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
