// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;


// Referenced classes of package com.soundcloud.android.view:
//            EmptyView

public static final class  extends Enum
{

    private static final OK $VALUES[];
    public static final OK CONNECTION_ERROR;
    public static final OK ERROR;
    public static final OK OK;
    public static final OK SERVER_ERROR;
    public static final OK WAITING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/soundcloud/android/view/EmptyView$Status, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        WAITING = new <init>("WAITING", 0);
        ERROR = new <init>("ERROR", 1);
        CONNECTION_ERROR = new <init>("CONNECTION_ERROR", 2);
        SERVER_ERROR = new <init>("SERVER_ERROR", 3);
        OK = new <init>("OK", 4);
        $VALUES = (new .VALUES[] {
            WAITING, ERROR, CONNECTION_ERROR, SERVER_ERROR, OK
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
