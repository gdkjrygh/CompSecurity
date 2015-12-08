// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.view;


// Referenced classes of package com.amobee.richmedia.view:
//            AmobeeView

public static final class  extends Enum
{

    public static final INTERSTITIAL DEFAULT;
    private static final INTERSTITIAL ENUM$VALUES[];
    public static final INTERSTITIAL EXPANDED;
    public static final INTERSTITIAL HIDDEN;
    public static final INTERSTITIAL INTERSTITIAL;
    public static final INTERSTITIAL LEFT_BEHIND;
    public static final INTERSTITIAL LOADING;
    public static final INTERSTITIAL OPENED;
    public static final INTERSTITIAL RESIZED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/amobee/richmedia/view/AmobeeView$ViewState, s);
    }

    public static [] values()
    {
         a[] = ENUM$VALUES;
        int i = a.length;
         a1[] = new ENUM.VALUES[i];
        System.arraycopy(a, 0, a1, 0, i);
        return a1;
    }

    static 
    {
        DEFAULT = new <init>("DEFAULT", 0);
        RESIZED = new <init>("RESIZED", 1);
        EXPANDED = new <init>("EXPANDED", 2);
        HIDDEN = new <init>("HIDDEN", 3);
        LEFT_BEHIND = new <init>("LEFT_BEHIND", 4);
        OPENED = new <init>("OPENED", 5);
        LOADING = new <init>("LOADING", 6);
        INTERSTITIAL = new <init>("INTERSTITIAL", 7);
        ENUM$VALUES = (new ENUM.VALUES[] {
            DEFAULT, RESIZED, EXPANDED, HIDDEN, LEFT_BEHIND, OPENED, LOADING, INTERSTITIAL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
