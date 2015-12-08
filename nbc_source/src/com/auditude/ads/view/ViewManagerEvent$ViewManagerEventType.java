// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.view;


// Referenced classes of package com.auditude.ads.view:
//            ViewManagerEvent

public static final class A extends Enum
{

    private static final NON_LINEAR_AD_END ENUM$VALUES[];
    public static final NON_LINEAR_AD_END LINEAR_AD_ABOUT_TO_BEGIN;
    public static final NON_LINEAR_AD_END LINEAR_AD_BEGIN;
    public static final NON_LINEAR_AD_END LINEAR_AD_END;
    public static final NON_LINEAR_AD_END NON_LINEAR_AD_ABOUT_TO_BEGIN;
    public static final NON_LINEAR_AD_END NON_LINEAR_AD_BEGIN;
    public static final NON_LINEAR_AD_END NON_LINEAR_AD_END;

    public static A valueOf(String s)
    {
        return (A)Enum.valueOf(com/auditude/ads/view/ViewManagerEvent$ViewManagerEventType, s);
    }

    public static A[] values()
    {
        A aa[] = ENUM$VALUES;
        int i = aa.length;
        A aa1[] = new ENUM.VALUES[i];
        System.arraycopy(aa, 0, aa1, 0, i);
        return aa1;
    }

    static 
    {
        LINEAR_AD_ABOUT_TO_BEGIN = new <init>("LINEAR_AD_ABOUT_TO_BEGIN", 0);
        LINEAR_AD_BEGIN = new <init>("LINEAR_AD_BEGIN", 1);
        LINEAR_AD_END = new <init>("LINEAR_AD_END", 2);
        NON_LINEAR_AD_ABOUT_TO_BEGIN = new <init>("NON_LINEAR_AD_ABOUT_TO_BEGIN", 3);
        NON_LINEAR_AD_BEGIN = new <init>("NON_LINEAR_AD_BEGIN", 4);
        NON_LINEAR_AD_END = new <init>("NON_LINEAR_AD_END", 5);
        ENUM$VALUES = (new ENUM.VALUES[] {
            LINEAR_AD_ABOUT_TO_BEGIN, LINEAR_AD_BEGIN, LINEAR_AD_END, NON_LINEAR_AD_ABOUT_TO_BEGIN, NON_LINEAR_AD_BEGIN, NON_LINEAR_AD_END
        });
    }

    private A(String s, int i)
    {
        super(s, i);
    }
}
