// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.ave.PayloadType;

// Referenced classes of package com.adobe.mediacore:
//            VideoEngineItem

static class 
{

    static final int $SwitchMap$com$adobe$ave$PayloadType[];

    static 
    {
        $SwitchMap$com$adobe$ave$PayloadType = new int[PayloadType.values().length];
        try
        {
            $SwitchMap$com$adobe$ave$PayloadType[PayloadType.DATA.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$adobe$ave$PayloadType[PayloadType.AUDIO.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$adobe$ave$PayloadType[PayloadType.VIDEO.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
