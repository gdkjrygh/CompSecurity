// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;


// Referenced classes of package com.netflix.mediaclient.android.widget:
//            NetflixActionBar

public static final class  extends Enum
{

    private static final GONE $VALUES[];
    public static final GONE FULL_SIZE;
    public static final GONE GONE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/netflix/mediaclient/android/widget/NetflixActionBar$LogoType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        FULL_SIZE = new <init>("FULL_SIZE", 0);
        GONE = new <init>("GONE", 1);
        $VALUES = (new .VALUES[] {
            FULL_SIZE, GONE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
