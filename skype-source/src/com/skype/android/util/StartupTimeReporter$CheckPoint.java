// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;


// Referenced classes of package com.skype.android.util:
//            StartupTimeReporter

public static final class  extends Enum
{

    public static final h a;
    public static final h b;
    public static final h c;
    public static final h d;
    public static final h e;
    public static final h f;
    public static final h g;
    public static final h h;
    private static final h i[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/util/StartupTimeReporter$CheckPoint, s);
    }

    public static [] values()
    {
        return ([])i.clone();
    }

    static 
    {
        a = new <init>("LANDING_PAGE_ACTIVITY", 0);
        b = new <init>("APP_SIGN_IN_PROCESS", 1);
        c = new <init>("MNV_ACTIVITY_START", 2);
        d = new <init>("MNV_ACTIVITY_STOP", 3);
        e = new <init>("HUB_ACTIVITY", 4);
        f = new <init>("CHAT_ACTIVITY", 5);
        g = new <init>("ACCOUNT_PICKER_ACTIVITY", 6);
        h = new <init>("PRECALL_ACTIVITY", 7);
        i = (new i[] {
            a, b, c, d, e, f, g, h
        });
    }

    private (String s, int j)
    {
        super(s, j);
    }
}
