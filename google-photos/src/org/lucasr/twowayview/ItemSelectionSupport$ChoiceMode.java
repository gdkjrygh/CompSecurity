// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.lucasr.twowayview;


public final class  extends Enum
{

    private static final MULTIPLE $VALUES[];
    public static final MULTIPLE MULTIPLE;
    public static final MULTIPLE NONE;
    public static final MULTIPLE SINGLE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(org/lucasr/twowayview/ItemSelectionSupport$ChoiceMode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        SINGLE = new <init>("SINGLE", 1);
        MULTIPLE = new <init>("MULTIPLE", 2);
        $VALUES = (new .VALUES[] {
            NONE, SINGLE, MULTIPLE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
