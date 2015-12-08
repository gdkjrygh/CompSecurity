// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model;


// Referenced classes of package com.soundcloud.android.api.legacy.model:
//            UserAssociation

public static final class  extends Enum
{

    private static final PENDING_REMOVAL $VALUES[];
    public static final PENDING_REMOVAL NONE;
    public static final PENDING_REMOVAL PENDING_ADDITION;
    public static final PENDING_REMOVAL PENDING_REMOVAL;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/soundcloud/android/api/legacy/model/UserAssociation$LocalState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        PENDING_ADDITION = new <init>("PENDING_ADDITION", 1);
        PENDING_REMOVAL = new <init>("PENDING_REMOVAL", 2);
        $VALUES = (new .VALUES[] {
            NONE, PENDING_ADDITION, PENDING_REMOVAL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
