// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.annotation;


// Referenced classes of package com.fasterxml.jackson.annotation:
//            JsonAutoDetect

class sibility
{

    static final int $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[];

    static 
    {
        $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility = new int[sibility.values().length];
        try
        {
            $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[sibility.ANY.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[sibility.NONE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[sibility.NON_PRIVATE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[sibility.PROTECTED_AND_PUBLIC.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[sibility.PUBLIC_ONLY.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
