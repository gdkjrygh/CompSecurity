// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonEncoding;

// Referenced classes of package com.fasterxml.jackson.core.json:
//            ByteSourceJsonBootstrapper

static class 
{

    static final int $SwitchMap$com$fasterxml$jackson$core$JsonEncoding[];

    static 
    {
        $SwitchMap$com$fasterxml$jackson$core$JsonEncoding = new int[JsonEncoding.values().length];
        try
        {
            $SwitchMap$com$fasterxml$jackson$core$JsonEncoding[JsonEncoding.UTF32_BE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$fasterxml$jackson$core$JsonEncoding[JsonEncoding.UTF32_LE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$fasterxml$jackson$core$JsonEncoding[JsonEncoding.UTF16_BE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$fasterxml$jackson$core$JsonEncoding[JsonEncoding.UTF16_LE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$fasterxml$jackson$core$JsonEncoding[JsonEncoding.UTF8.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
