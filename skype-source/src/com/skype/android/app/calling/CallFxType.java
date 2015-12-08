// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;


public final class CallFxType extends Enum
{

    private static final CallFxType $VALUES[];
    public static final CallFxType FRAME;
    public static final CallFxType LENS;
    public static final CallFxType PLACEHOLDER;
    public static final CallFxType PUPPET;
    public static final CallFxType SPRITE;
    public static final CallFxType TATTOO;

    private CallFxType(String s, int i)
    {
        super(s, i);
    }

    public static CallFxType valueOf(String s)
    {
        return (CallFxType)Enum.valueOf(com/skype/android/app/calling/CallFxType, s);
    }

    public static CallFxType[] values()
    {
        return (CallFxType[])$VALUES.clone();
    }

    static 
    {
        PLACEHOLDER = new CallFxType("PLACEHOLDER", 0);
        LENS = new CallFxType("LENS", 1);
        FRAME = new CallFxType("FRAME", 2);
        SPRITE = new CallFxType("SPRITE", 3);
        TATTOO = new CallFxType("TATTOO", 4);
        PUPPET = new CallFxType("PUPPET", 5);
        $VALUES = (new CallFxType[] {
            PLACEHOLDER, LENS, FRAME, SPRITE, TATTOO, PUPPET
        });
    }
}
