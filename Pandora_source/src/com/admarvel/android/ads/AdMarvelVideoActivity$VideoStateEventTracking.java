// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;


// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelVideoActivity

public static final class  extends Enum
{

    public static final STOP CLOSE;
    public static final STOP COMPLETE;
    private static final STOP ENUM$VALUES[];
    public static final STOP PAUSE;
    public static final STOP RESUME;
    public static final STOP START;
    public static final STOP STOP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/admarvel/android/ads/AdMarvelVideoActivity$VideoStateEventTracking, s);
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
        START = new <init>("START", 0);
        COMPLETE = new <init>("COMPLETE", 1);
        PAUSE = new <init>("PAUSE", 2);
        RESUME = new <init>("RESUME", 3);
        CLOSE = new <init>("CLOSE", 4);
        STOP = new <init>("STOP", 5);
        ENUM$VALUES = (new ENUM.VALUES[] {
            START, COMPLETE, PAUSE, RESUME, CLOSE, STOP
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
