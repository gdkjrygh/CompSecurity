// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.recommend;


// Referenced classes of package com.qihoo.security.recommend:
//            RecommendHelper

public static final class cancel extends Enum
{

    public static final Anivirus Anivirus;
    public static final Anivirus Boost;
    public static final Anivirus Clean;
    private static final Anivirus a[];
    public int cancel;
    public int click;
    public int show;

    public static cancel valueOf(String s)
    {
        return (cancel)Enum.valueOf(com/qihoo/security/recommend/RecommendHelper$RecommendAction, s);
    }

    public static cancel[] values()
    {
        return (cancel[])a.clone();
    }

    static 
    {
        Boost = new <init>("Boost", 0, 28001, 28002, 28003);
        Clean = new <init>("Clean", 1, 28004, 28005, 28006);
        Anivirus = new <init>("Anivirus", 2, 28007, 28008, 28009);
        a = (new a[] {
            Boost, Clean, Anivirus
        });
    }

    private (String s, int i, int j, int k, int l)
    {
        super(s, i);
        show = j;
        click = k;
        cancel = l;
    }
}
