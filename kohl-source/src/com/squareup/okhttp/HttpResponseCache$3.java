// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;


// Referenced classes of package com.squareup.okhttp:
//            HttpResponseCache, ResponseSource

static class 
{

    static final int $SwitchMap$com$squareup$okhttp$ResponseSource[];

    static 
    {
        $SwitchMap$com$squareup$okhttp$ResponseSource = new int[ResponseSource.values().length];
        try
        {
            $SwitchMap$com$squareup$okhttp$ResponseSource[ResponseSource.CACHE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$squareup$okhttp$ResponseSource[ResponseSource.CONDITIONAL_CACHE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$squareup$okhttp$ResponseSource[ResponseSource.NETWORK.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
