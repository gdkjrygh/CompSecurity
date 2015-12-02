// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.main;


// Referenced classes of package com.qihoo.security.ui.main:
//            FragmentsObservable

public static final class  extends Enum
{

    public static final HideRecmdAin ActionBar;
    public static final HideRecmdAin Antivirus_Scan;
    public static final HideRecmdAin Boost;
    public static final HideRecmdAin Clean_Scan;
    public static final HideRecmdAin DrawerClose;
    public static final HideRecmdAin DrawerOpen;
    public static final HideRecmdAin HideRecmdAin;
    public static final HideRecmdAin HideRecmdBoost;
    public static final HideRecmdAin HideRecmdClean;
    public static final HideRecmdAin HideRecmdOther;
    public static final HideRecmdAin MoreMenuClose;
    public static final HideRecmdAin MoreMenuShow;
    private static final HideRecmdAin a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/qihoo/security/ui/main/FragmentsObservable$Action, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        Clean_Scan = new <init>("Clean_Scan", 0);
        Antivirus_Scan = new <init>("Antivirus_Scan", 1);
        Boost = new <init>("Boost", 2);
        ActionBar = new <init>("ActionBar", 3);
        DrawerOpen = new <init>("DrawerOpen", 4);
        DrawerClose = new <init>("DrawerClose", 5);
        MoreMenuShow = new <init>("MoreMenuShow", 6);
        MoreMenuClose = new <init>("MoreMenuClose", 7);
        HideRecmdClean = new <init>("HideRecmdClean", 8);
        HideRecmdOther = new <init>("HideRecmdOther", 9);
        HideRecmdBoost = new <init>("HideRecmdBoost", 10);
        HideRecmdAin = new <init>("HideRecmdAin", 11);
        a = (new a[] {
            Clean_Scan, Antivirus_Scan, Boost, ActionBar, DrawerOpen, DrawerClose, MoreMenuShow, MoreMenuClose, HideRecmdClean, HideRecmdOther, 
            HideRecmdBoost, HideRecmdAin
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
