// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;


// Referenced classes of package com.netflix.mediaclient.util:
//            ViewUtils

public static final class  extends Enum
{

    private static final GONE $VALUES[];
    public static final GONE GONE;
    public static final GONE INVISIBLE;
    public static final GONE VISIBLE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/netflix/mediaclient/util/ViewUtils$Visibility, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        VISIBLE = new <init>("VISIBLE", 0);
        INVISIBLE = new <init>("INVISIBLE", 1);
        GONE = new <init>("GONE", 2);
        $VALUES = (new .VALUES[] {
            VISIBLE, INVISIBLE, GONE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
