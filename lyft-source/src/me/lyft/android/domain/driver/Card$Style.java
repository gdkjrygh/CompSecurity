// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.driver;


public final class  extends Enum
{

    private static final EXPRESSPAY $VALUES[];
    public static final EXPRESSPAY DARK;
    public static final EXPRESSPAY EXPRESSPAY;
    public static final EXPRESSPAY GLOWSTACHE;
    public static final EXPRESSPAY LIGHT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(me/lyft/android/domain/driver/Card$Style, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        GLOWSTACHE = new <init>("GLOWSTACHE", 0);
        LIGHT = new <init>("LIGHT", 1);
        DARK = new <init>("DARK", 2);
        EXPRESSPAY = new <init>("EXPRESSPAY", 3);
        $VALUES = (new .VALUES[] {
            GLOWSTACHE, LIGHT, DARK, EXPRESSPAY
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
