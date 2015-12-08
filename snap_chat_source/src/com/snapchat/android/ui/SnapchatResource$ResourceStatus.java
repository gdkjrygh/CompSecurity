// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;


// Referenced classes of package com.snapchat.android.ui:
//            SnapchatResource

public static final class  extends Enum
{

    private static final LOADING_FAILED $VALUES[];
    public static final LOADING_FAILED LOADED;
    public static final LOADING_FAILED LOADING;
    public static final LOADING_FAILED LOADING_FAILED;
    public static final LOADING_FAILED NOT_LOADED;
    public static final LOADING_FAILED UNINITIALIZED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/ui/SnapchatResource$ResourceStatus, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        UNINITIALIZED = new <init>("UNINITIALIZED", 0);
        NOT_LOADED = new <init>("NOT_LOADED", 1);
        LOADING = new <init>("LOADING", 2);
        LOADED = new <init>("LOADED", 3);
        LOADING_FAILED = new <init>("LOADING_FAILED", 4);
        $VALUES = (new .VALUES[] {
            UNINITIALIZED, NOT_LOADED, LOADING, LOADED, LOADING_FAILED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
