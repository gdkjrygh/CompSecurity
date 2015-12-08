// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.util.cache.CacheType;

public final class vw
{

    public static final JY a;
    public static final Kb b;
    public static final JY c;

    static 
    {
        a = new JY(CacheType.DISCOVER_INTRO_VIDEOS, 40000L);
        b = new Kb(CacheType.DISCOVER_EDITIONS_CHUNKS);
        c = new JY(CacheType.DISCOVER_PUBLISHER_ICONS, 40000L);
    }
}
