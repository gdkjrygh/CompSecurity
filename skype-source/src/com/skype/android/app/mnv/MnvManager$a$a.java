// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;


// Referenced classes of package com.skype.android.app.mnv:
//            MnvManager

static final class  extends Enum
{

    private static final ASYNC $VALUES[];
    public static final ASYNC ASYNC;
    public static final ASYNC FAILURE;
    public static final ASYNC NONE;
    public static final ASYNC SUCCESS;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/app/mnv/MnvManager$a$a, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        SUCCESS = new <init>("SUCCESS", 1);
        FAILURE = new <init>("FAILURE", 2);
        ASYNC = new <init>("ASYNC", 3);
        $VALUES = (new .VALUES[] {
            NONE, SUCCESS, FAILURE, ASYNC
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
