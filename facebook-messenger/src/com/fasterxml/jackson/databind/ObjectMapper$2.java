// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;


class faultTyping
{

    static final int $SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping[];

    static 
    {
        $SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping = new int[faultTyping.values().length];
        try
        {
            $SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping[faultTyping.NON_CONCRETE_AND_ARRAYS.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping[faultTyping.OBJECT_AND_NON_CONCRETE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping[faultTyping.NON_FINAL.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
