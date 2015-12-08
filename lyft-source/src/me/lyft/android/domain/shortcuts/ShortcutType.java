// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.shortcuts;


public final class ShortcutType extends Enum
{

    private static final ShortcutType $VALUES[];
    public static final ShortcutType HOME;
    public static final ShortcutType WORK;

    private ShortcutType(String s, int i)
    {
        super(s, i);
    }

    public static ShortcutType valueOf(String s)
    {
        return (ShortcutType)Enum.valueOf(me/lyft/android/domain/shortcuts/ShortcutType, s);
    }

    public static ShortcutType[] values()
    {
        return (ShortcutType[])$VALUES.clone();
    }

    static 
    {
        WORK = new ShortcutType("WORK", 0);
        HOME = new ShortcutType("HOME", 1);
        $VALUES = (new ShortcutType[] {
            WORK, HOME
        });
    }
}
