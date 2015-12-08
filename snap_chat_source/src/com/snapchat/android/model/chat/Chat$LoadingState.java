// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model.chat;


// Referenced classes of package com.snapchat.android.model.chat:
//            Chat

public static final class  extends Enum
{

    private static final LOADED $VALUES[];
    public static final LOADED LOADED;
    public static final LOADED LOADING;
    public static final LOADED NOT_LOADED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/model/chat/Chat$LoadingState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NOT_LOADED = new <init>("NOT_LOADED", 0);
        LOADING = new <init>("LOADING", 1);
        LOADED = new <init>("LOADED", 2);
        $VALUES = (new .VALUES[] {
            NOT_LOADED, LOADING, LOADED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
