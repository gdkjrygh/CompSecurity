// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.list;


// Referenced classes of package com.google.android.apps.wallet.widgets.list:
//            HeadedListAdapter

public static final class  extends Enum
{

    private static final GONE $VALUES[];
    public static final GONE GONE;
    public static final GONE VISIBLE;
    public static final GONE VISIBLE_UNLESS_EMPTY;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/wallet/widgets/list/HeadedListAdapter$FixedViewVisibility, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        VISIBLE = new <init>("VISIBLE", 0);
        VISIBLE_UNLESS_EMPTY = new <init>("VISIBLE_UNLESS_EMPTY", 1);
        GONE = new <init>("GONE", 2);
        $VALUES = (new .VALUES[] {
            VISIBLE, VISIBLE_UNLESS_EMPTY, GONE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
