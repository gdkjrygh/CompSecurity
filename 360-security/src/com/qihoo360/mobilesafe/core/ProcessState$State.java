// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.core;


// Referenced classes of package com.qihoo360.mobilesafe.core:
//            ProcessState

public static final class  extends Enum
{

    public static final STATE_CANCEL STATE_CANCEL;
    public static final STATE_CANCEL STATE_DOING;
    public static final STATE_CANCEL STATE_FINISH;
    public static final STATE_CANCEL STATE_NULL;
    public static final STATE_CANCEL STATE_PREPARE;
    private static final STATE_CANCEL a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/qihoo360/mobilesafe/core/ProcessState$State, s);
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
        STATE_NULL = new <init>("STATE_NULL", 0);
        STATE_PREPARE = new <init>("STATE_PREPARE", 1);
        STATE_DOING = new <init>("STATE_DOING", 2);
        STATE_FINISH = new <init>("STATE_FINISH", 3);
        STATE_CANCEL = new <init>("STATE_CANCEL", 4);
        a = (new a[] {
            STATE_NULL, STATE_PREPARE, STATE_DOING, STATE_FINISH, STATE_CANCEL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
