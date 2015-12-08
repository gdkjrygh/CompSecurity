// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;


final class  extends Enum
{

    private static final HINT_TEXT $VALUES[];
    public static final HINT_TEXT EDIT_TEXT_EDITING;
    public static final HINT_TEXT EDIT_TEXT_HINT;
    public static final HINT_TEXT HINT_TEXT;
    public static final HINT_TEXT TEXT_VIEW;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/dominos/nina/persona/Typefaces$Id, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        TEXT_VIEW = new <init>("TEXT_VIEW", 0);
        EDIT_TEXT_HINT = new <init>("EDIT_TEXT_HINT", 1);
        EDIT_TEXT_EDITING = new <init>("EDIT_TEXT_EDITING", 2);
        HINT_TEXT = new <init>("HINT_TEXT", 3);
        $VALUES = (new .VALUES[] {
            TEXT_VIEW, EDIT_TEXT_HINT, EDIT_TEXT_EDITING, HINT_TEXT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
