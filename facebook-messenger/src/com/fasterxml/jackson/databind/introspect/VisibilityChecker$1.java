// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.PropertyAccessor;

class 
{

    static final int $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[];

    static 
    {
        $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor = new int[PropertyAccessor.values().length];
        try
        {
            $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.GETTER.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.SETTER.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.CREATOR.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.FIELD.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.IS_GETTER.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.ALL.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
