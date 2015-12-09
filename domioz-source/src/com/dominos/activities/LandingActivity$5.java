// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;


class nType
{

    static final int $SwitchMap$com$dominos$bus$events$SpeechEvents$ActionType[];

    static 
    {
        $SwitchMap$com$dominos$bus$events$SpeechEvents$ActionType = new int[com.dominos.bus.events.nType.values().length];
        try
        {
            $SwitchMap$com$dominos$bus$events$SpeechEvents$ActionType[com.dominos.bus.events.nType.NEW_ORDER.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$dominos$bus$events$SpeechEvents$ActionType[com.dominos.bus.events.nType.CARRYOUT.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$dominos$bus$events$SpeechEvents$ActionType[com.dominos.bus.events.nType.DELIVERY.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
