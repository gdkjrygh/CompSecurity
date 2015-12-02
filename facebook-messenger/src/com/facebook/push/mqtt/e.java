// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;


final class e extends Enum
{

    private static final e $VALUES[];
    public static final e BACK_OFF;
    public static final e BACK_TO_BACK;

    private e(String s, int i)
    {
        super(s, i);
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/facebook/push/mqtt/e, s);
    }

    public static e[] values()
    {
        return (e[])$VALUES.clone();
    }

    static 
    {
        BACK_OFF = new e("BACK_OFF", 0);
        BACK_TO_BACK = new e("BACK_TO_BACK", 1);
        $VALUES = (new e[] {
            BACK_OFF, BACK_TO_BACK
        });
    }
}
