// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity;


public final class  extends Enum
{

    private static final MODAL_OUT $VALUES[];
    public static final MODAL_OUT DEFAULT;
    public static final MODAL_OUT FADE;
    public static final MODAL_OUT MODAL;
    public static final MODAL_OUT MODAL_OUT;
    public static final MODAL_OUT NONE;
    public static final MODAL_OUT SLIDE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pinterest/activity/FragmentHelper$Animation, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        DEFAULT = new <init>("DEFAULT", 1);
        FADE = new <init>("FADE", 2);
        SLIDE = new <init>("SLIDE", 3);
        MODAL = new <init>("MODAL", 4);
        MODAL_OUT = new <init>("MODAL_OUT", 5);
        $VALUES = (new .VALUES[] {
            NONE, DEFAULT, FADE, SLIDE, MODAL, MODAL_OUT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
