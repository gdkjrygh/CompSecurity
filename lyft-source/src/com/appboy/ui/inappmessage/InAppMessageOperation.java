// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;


public final class InAppMessageOperation extends Enum
{

    private static final InAppMessageOperation $VALUES[];
    public static final InAppMessageOperation DISCARD;
    public static final InAppMessageOperation DISPLAY_LATER;
    public static final InAppMessageOperation DISPLAY_NOW;

    private InAppMessageOperation(String s, int i)
    {
        super(s, i);
    }

    public static InAppMessageOperation valueOf(String s)
    {
        return (InAppMessageOperation)Enum.valueOf(com/appboy/ui/inappmessage/InAppMessageOperation, s);
    }

    public static InAppMessageOperation[] values()
    {
        return (InAppMessageOperation[])$VALUES.clone();
    }

    static 
    {
        DISPLAY_NOW = new InAppMessageOperation("DISPLAY_NOW", 0);
        DISPLAY_LATER = new InAppMessageOperation("DISPLAY_LATER", 1);
        DISCARD = new InAppMessageOperation("DISCARD", 2);
        $VALUES = (new InAppMessageOperation[] {
            DISPLAY_NOW, DISPLAY_LATER, DISCARD
        });
    }
}
