// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;


// Referenced classes of package com.skype.android.util:
//            SignInDurationReporter

public static final class  extends Enum
{

    public static final k a;
    public static final k b;
    public static final k c;
    public static final k d;
    public static final k e;
    public static final k f;
    public static final k g;
    public static final k h;
    public static final k i;
    public static final k j;
    public static final k k;
    private static final k l[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/util/SignInDurationReporter$CheckPoint, s);
    }

    public static [] values()
    {
        return ([])l.clone();
    }

    static 
    {
        a = new <init>("LANDING_PAGE_BTN_CLICK", 0);
        b = new <init>("UNIFIED_ACCOUNT_PICKER_SCREEN_ACC_SELECTED", 1);
        c = new <init>("APP_SIGN_IN_BTN_CLICK", 2);
        d = new <init>("LINKING_NO_BTN_CLICKED", 3);
        e = new <init>("LINKING_SIGNIN_BTN_CLICKED", 4);
        f = new <init>("HUB_LANDED", 5);
        g = new <init>("MNV_FLOW_LANDED", 6);
        h = new <init>("LINKING_TOU_FLOW_LANDED", 7);
        i = new <init>("LINKING_COMPLETED_SCREEN", 8);
        j = new <init>("APP_SIGN_IN_SCREEN_LOADED", 9);
        k = new <init>("UNIFIED_ACCOUNT_PICKER_SCREEN_LOADED", 10);
        l = (new l[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }

    private (String s, int i1)
    {
        super(s, i1);
    }
}
