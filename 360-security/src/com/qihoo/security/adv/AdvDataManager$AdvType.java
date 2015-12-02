// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.adv;


// Referenced classes of package com.qihoo.security.adv:
//            AdvDataManager

public static final class a extends Enum
{

    public static final GameBoosterFolderHotAdvData AppLockAdvData;
    public static final GameBoosterFolderHotAdvData BatteryLifeAdvData;
    public static final GameBoosterFolderHotAdvData BoosterResultAdvData;
    public static final GameBoosterFolderHotAdvData CleanDeepResultAdvData;
    public static final GameBoosterFolderHotAdvData CleanResultAdvData;
    public static final GameBoosterFolderHotAdvData FaceBookAdvData;
    public static final GameBoosterFolderHotAdvData GameBoosterAddRecmdAdvData;
    public static final GameBoosterFolderHotAdvData GameBoosterFolderAllLikeData;
    public static final GameBoosterFolderHotAdvData GameBoosterFolderHotAdvData;
    public static final GameBoosterFolderHotAdvData PrepareAdvData;
    public static final GameBoosterFolderHotAdvData VirusFullScanResultAdvData;
    public static final GameBoosterFolderHotAdvData VirusResultAdvData;
    private static final GameBoosterFolderHotAdvData e[];
    private boolean a;
    private boolean b;
    private int c;
    private int d;

    static boolean a(a a1)
    {
        return a1.a;
    }

    static boolean b(a a1)
    {
        return a1.b;
    }

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(com/qihoo/security/adv/AdvDataManager$AdvType, s);
    }

    public static b[] values()
    {
        return (b[])e.clone();
    }

    public int getMid()
    {
        return c;
    }

    public int getType()
    {
        return d;
    }

    public boolean isShouldCache()
    {
        return a;
    }

    public boolean isShouldPreLoadImg()
    {
        return b;
    }

    public void setMid(int i)
    {
        c = i;
    }

    public void setShouldCache(boolean flag)
    {
        a = flag;
    }

    public void setShouldPreLoadImg(boolean flag)
    {
        b = flag;
    }

    public void setType(int i)
    {
        d = i;
    }

    static 
    {
        PrepareAdvData = new <init>("PrepareAdvData", 0, 36, 0, true, true);
        BoosterResultAdvData = new <init>("BoosterResultAdvData", 1, 30, 0);
        BatteryLifeAdvData = new <init>("BatteryLifeAdvData", 2, 21, 1);
        CleanResultAdvData = new <init>("CleanResultAdvData", 3, 31, 0);
        CleanDeepResultAdvData = new <init>("CleanDeepResultAdvData", 4, 34, 1);
        VirusResultAdvData = new <init>("VirusResultAdvData", 5, 32, 0);
        VirusFullScanResultAdvData = new <init>("VirusFullScanResultAdvData", 6, 33, 1);
        AppLockAdvData = new <init>("AppLockAdvData", 7, 27, 0, true, true);
        FaceBookAdvData = new <init>("FaceBookAdvData", 8, 35, 0, true);
        GameBoosterAddRecmdAdvData = new <init>("GameBoosterAddRecmdAdvData", 9, 43, true);
        GameBoosterFolderAllLikeData = new <init>("GameBoosterFolderAllLikeData", 10, 45, true);
        GameBoosterFolderHotAdvData = new <init>("GameBoosterFolderHotAdvData", 11, 44, true);
        e = (new e[] {
            PrepareAdvData, BoosterResultAdvData, BatteryLifeAdvData, CleanResultAdvData, CleanDeepResultAdvData, VirusResultAdvData, VirusFullScanResultAdvData, AppLockAdvData, FaceBookAdvData, GameBoosterAddRecmdAdvData, 
            GameBoosterFolderAllLikeData, GameBoosterFolderHotAdvData
        });
    }

    private (String s, int i, int j, int k)
    {
        super(s, i);
        a = false;
        b = false;
        c = j;
        d = k;
    }

    private d(String s, int i, int j, int k, boolean flag)
    {
        super(s, i);
        a = false;
        b = false;
        c = j;
        d = k;
        a = flag;
    }

    private a(String s, int i, int j, int k, boolean flag, boolean flag1)
    {
        super(s, i);
        a = false;
        b = false;
        c = j;
        d = k;
        a = flag;
        b = flag1;
    }

    private b(String s, int i, int j, boolean flag)
    {
        super(s, i);
        a = false;
        b = false;
        c = j;
        a = flag;
    }
}
