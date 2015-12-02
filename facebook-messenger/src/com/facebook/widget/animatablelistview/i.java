// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.animatablelistview;


public final class i extends Enum
{

    private static final i $VALUES[];
    public static final i ADD;
    public static final i ADD_WITH_ANIMATION_DOWN;
    public static final i ADD_WITH_ANIMATION_UP;
    public static final i CUSTOM;
    public static final i MARKED_FOR_REPLACE;
    public static final i REMOVE;
    public static final i REMOVE_WITH_ANIMATION_DOWN;
    public static final i REMOVE_WITH_ANIMATION_UP;
    public static final i REPLACE;

    private i(String s, int j)
    {
        super(s, j);
    }

    public static i valueOf(String s)
    {
        return (i)Enum.valueOf(com/facebook/widget/animatablelistview/i, s);
    }

    public static i[] values()
    {
        return (i[])$VALUES.clone();
    }

    static 
    {
        ADD = new i("ADD", 0);
        ADD_WITH_ANIMATION_UP = new i("ADD_WITH_ANIMATION_UP", 1);
        ADD_WITH_ANIMATION_DOWN = new i("ADD_WITH_ANIMATION_DOWN", 2);
        REMOVE = new i("REMOVE", 3);
        REMOVE_WITH_ANIMATION_UP = new i("REMOVE_WITH_ANIMATION_UP", 4);
        REMOVE_WITH_ANIMATION_DOWN = new i("REMOVE_WITH_ANIMATION_DOWN", 5);
        REPLACE = new i("REPLACE", 6);
        MARKED_FOR_REPLACE = new i("MARKED_FOR_REPLACE", 7);
        CUSTOM = new i("CUSTOM", 8);
        $VALUES = (new i[] {
            ADD, ADD_WITH_ANIMATION_UP, ADD_WITH_ANIMATION_DOWN, REMOVE, REMOVE_WITH_ANIMATION_UP, REMOVE_WITH_ANIMATION_DOWN, REPLACE, MARKED_FOR_REPLACE, CUSTOM
        });
    }
}
