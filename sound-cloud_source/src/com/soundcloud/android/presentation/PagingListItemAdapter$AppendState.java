// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.presentation;


// Referenced classes of package com.soundcloud.android.presentation:
//            PagingListItemAdapter

protected static final class  extends Enum
{

    private static final ERROR $VALUES[];
    public static final ERROR ERROR;
    public static final ERROR IDLE;
    public static final ERROR LOADING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/soundcloud/android/presentation/PagingListItemAdapter$AppendState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        IDLE = new <init>("IDLE", 0);
        LOADING = new <init>("LOADING", 1);
        ERROR = new <init>("ERROR", 2);
        $VALUES = (new .VALUES[] {
            IDLE, LOADING, ERROR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
