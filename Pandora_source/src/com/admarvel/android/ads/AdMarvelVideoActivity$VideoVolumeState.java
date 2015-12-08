// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;


// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelVideoActivity

public static final class  extends Enum
{

    private static final Unknown ENUM$VALUES[];
    public static final Unknown Mute;
    public static final Unknown UnMute;
    public static final Unknown Unknown;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/admarvel/android/ads/AdMarvelVideoActivity$VideoVolumeState, s);
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
        Mute = new <init>("Mute", 0);
        UnMute = new <init>("UnMute", 1);
        Unknown = new <init>("Unknown", 2);
        ENUM$VALUES = (new ENUM.VALUES[] {
            Mute, UnMute, Unknown
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
