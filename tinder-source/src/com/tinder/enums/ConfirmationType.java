// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.enums;


public final class ConfirmationType extends Enum
{

    private static final ConfirmationType $VALUES[];
    public static final ConfirmationType DRAGGING_LEFT;
    public static final ConfirmationType DRAGGING_RIGHT;
    public static final ConfirmationType SUPERLIKE;
    public static final ConfirmationType TAPPING_HEART;
    public static final ConfirmationType TAPPING_X;
    private final int mIdAction;
    private final int mIdPrompt;
    private final int mIdTitle;

    private ConfirmationType(String s, int i, int j, int k, int l)
    {
        super(s, i);
        mIdTitle = j;
        mIdPrompt = k;
        mIdAction = l;
    }

    public static ConfirmationType valueOf(String s)
    {
        return (ConfirmationType)Enum.valueOf(com/tinder/enums/ConfirmationType, s);
    }

    public static ConfirmationType[] values()
    {
        return (ConfirmationType[])$VALUES.clone();
    }

    public final int getIdAction()
    {
        return mIdAction;
    }

    public final int getIdPrompt()
    {
        return mIdPrompt;
    }

    public final int getIdTitle()
    {
        return mIdTitle;
    }

    static 
    {
        TAPPING_X = new ConfirmationType("TAPPING_X", 0, 0x7f060140, 0x7f06013f, 0x7f06013d);
        TAPPING_HEART = new ConfirmationType("TAPPING_HEART", 1, 0x7f0600f7, 0x7f0600f6, 0x7f0600f4);
        DRAGGING_LEFT = new ConfirmationType("DRAGGING_LEFT", 2, 0x7f060140, 0x7f06013e, 0x7f06013d);
        DRAGGING_RIGHT = new ConfirmationType("DRAGGING_RIGHT", 3, 0x7f0600f7, 0x7f0600f5, 0x7f0600f4);
        SUPERLIKE = new ConfirmationType("SUPERLIKE", 4, 0x7f0601ea, 0x7f0601e7, 0x7f0601e9);
        $VALUES = (new ConfirmationType[] {
            TAPPING_X, TAPPING_HEART, DRAGGING_LEFT, DRAGGING_RIGHT, SUPERLIKE
        });
    }
}
