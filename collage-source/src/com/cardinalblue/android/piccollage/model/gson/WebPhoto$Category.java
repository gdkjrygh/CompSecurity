// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;


// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            WebPhoto

public static final class  extends Enum
{

    private static final AD_ADMOB $VALUES[];
    public static final AD_ADMOB AD_ADMOB;
    public static final AD_ADMOB AD_FACEBOOK;
    public static final AD_ADMOB PICCOLLAGE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/cardinalblue/android/piccollage/model/gson/WebPhoto$Category, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PICCOLLAGE = new <init>("PICCOLLAGE", 0);
        AD_FACEBOOK = new <init>("AD_FACEBOOK", 1);
        AD_ADMOB = new <init>("AD_ADMOB", 2);
        $VALUES = (new .VALUES[] {
            PICCOLLAGE, AD_FACEBOOK, AD_ADMOB
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
