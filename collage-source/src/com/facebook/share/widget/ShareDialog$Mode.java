// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;


// Referenced classes of package com.facebook.share.widget:
//            ShareDialog

public static final class  extends Enum
{

    private static final FEED $VALUES[];
    public static final FEED AUTOMATIC;
    public static final FEED FEED;
    public static final FEED NATIVE;
    public static final FEED WEB;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/facebook/share/widget/ShareDialog$Mode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        AUTOMATIC = new <init>("AUTOMATIC", 0);
        NATIVE = new <init>("NATIVE", 1);
        WEB = new <init>("WEB", 2);
        FEED = new <init>("FEED", 3);
        $VALUES = (new .VALUES[] {
            AUTOMATIC, NATIVE, WEB, FEED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
