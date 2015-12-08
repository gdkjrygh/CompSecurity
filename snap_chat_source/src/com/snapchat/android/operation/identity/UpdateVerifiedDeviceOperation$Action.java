// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.operation.identity;


// Referenced classes of package com.snapchat.android.operation.identity:
//            UpdateVerifiedDeviceOperation

public static final class  extends Enum
{

    private static final DELETE_ALL $VALUES[];
    public static final DELETE_ALL DELETE;
    public static final DELETE_ALL DELETE_ALL;
    public static final DELETE_ALL SAVE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/operation/identity/UpdateVerifiedDeviceOperation$Action, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SAVE = new <init>("SAVE", 0);
        DELETE = new <init>("DELETE", 1);
        DELETE_ALL = new <init>("DELETE_ALL", 2);
        $VALUES = (new .VALUES[] {
            SAVE, DELETE, DELETE_ALL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
