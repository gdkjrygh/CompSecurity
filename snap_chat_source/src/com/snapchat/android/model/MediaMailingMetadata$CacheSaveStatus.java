// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model;


// Referenced classes of package com.snapchat.android.model:
//            MediaMailingMetadata

public static final class  extends Enum
{

    private static final SAVED $VALUES[];
    public static final SAVED NOT_SAVED;
    public static final SAVED SAVED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/model/MediaMailingMetadata$CacheSaveStatus, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NOT_SAVED = new <init>("NOT_SAVED", 0);
        SAVED = new <init>("SAVED", 1);
        $VALUES = (new .VALUES[] {
            NOT_SAVED, SAVED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
