// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;


// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelVideoActivity

public static final class  extends Enum
{

    private static final PausedBySystem ENUM$VALUES[];
    public static final PausedBySystem Finished;
    public static final PausedBySystem Loading;
    public static final PausedBySystem Paused;
    public static final PausedBySystem PausedBySystem;
    public static final PausedBySystem PausedByToolbar;
    public static final PausedBySystem Playing;
    public static final PausedBySystem Stopped;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/admarvel/android/ads/AdMarvelVideoActivity$VideoPlayerState, s);
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
        Loading = new <init>("Loading", 0);
        Playing = new <init>("Playing", 1);
        Paused = new <init>("Paused", 2);
        Stopped = new <init>("Stopped", 3);
        Finished = new <init>("Finished", 4);
        PausedByToolbar = new <init>("PausedByToolbar", 5);
        PausedBySystem = new <init>("PausedBySystem", 6);
        ENUM$VALUES = (new ENUM.VALUES[] {
            Loading, Playing, Paused, Stopped, Finished, PausedByToolbar, PausedBySystem
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
