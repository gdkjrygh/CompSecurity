// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.recommend;


// Referenced classes of package com.qihoo.security.recommend:
//            RecommendHelper

public static final class recommendAction extends Enum
{

    public static final Anitvirus Anitvirus;
    public static final Anitvirus Boost;
    public static final Anitvirus Clean;
    private static final Anitvirus a[];
    public String countKey;
    public int iconRes;
    public int okRes;
    public n recommendAction;
    public String timeKey;
    public int titleRes;

    public static recommendAction valueOf(String s)
    {
        return (recommendAction)Enum.valueOf(com/qihoo/security/recommend/RecommendHelper$RecommendType, s);
    }

    public static recommendAction[] values()
    {
        return (recommendAction[])a.clone();
    }

    static 
    {
        Boost = new <init>("Boost", 0, "last_recommend_boost_time", "boost_recommend_count", 0x7f0200f8, 0x7f0c017a, 0x7f0c017a, n.Boost);
        Clean = new <init>("Clean", 1, "last_recommend_clean_time", "clean_recommend_count", 0x7f0200f9, 0x7f0c00cf, 0x7f0c00d5, n.Clean);
        Anitvirus = new <init>("Anitvirus", 2, "last_recommend_anitvirus_time", "anitvirus_recommend_count", 0x7f0200f7, 0x7f0c00d0, 0x7f0c00d6, n.Anivirus);
        a = (new a[] {
            Boost, Clean, Anitvirus
        });
    }

    private n(String s, int i, String s1, String s2, int j, int k, int l, 
            n n)
    {
        super(s, i);
        timeKey = s1;
        countKey = s2;
        iconRes = j;
        titleRes = k;
        okRes = l;
        recommendAction = n;
    }
}
