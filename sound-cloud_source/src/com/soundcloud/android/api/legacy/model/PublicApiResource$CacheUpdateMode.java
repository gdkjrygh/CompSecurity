// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model;


// Referenced classes of package com.soundcloud.android.api.legacy.model:
//            PublicApiResource

public static final class  extends Enum
{

    private static final FULL $VALUES[];
    public static final FULL FULL;
    public static final FULL MINI;
    public static final FULL NONE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/soundcloud/android/api/legacy/model/PublicApiResource$CacheUpdateMode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    public final boolean shouldUpdate()
    {
        return this != NONE;
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        MINI = new <init>("MINI", 1);
        FULL = new <init>("FULL", 2);
        $VALUES = (new .VALUES[] {
            NONE, MINI, FULL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
