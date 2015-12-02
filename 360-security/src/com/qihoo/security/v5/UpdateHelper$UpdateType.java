// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v5;


// Referenced classes of package com.qihoo.security.v5:
//            UpdateHelper

public static final class  extends Enum
{

    public static final SettingOther ActionMode;
    public static final SettingOther SettingAPP;
    public static final SettingOther SettingOther;
    public static final SettingOther Silent;
    private static final SettingOther a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/qihoo/security/v5/UpdateHelper$UpdateType, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        Silent = new <init>("Silent", 0);
        SettingAPP = new <init>("SettingAPP", 1);
        ActionMode = new <init>("ActionMode", 2);
        SettingOther = new <init>("SettingOther", 3);
        a = (new a[] {
            Silent, SettingAPP, ActionMode, SettingOther
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
