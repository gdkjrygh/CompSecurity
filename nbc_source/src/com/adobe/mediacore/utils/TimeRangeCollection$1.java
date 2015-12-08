// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.utils;


// Referenced classes of package com.adobe.mediacore.utils:
//            TimeRangeCollection

static class pe
{

    static final int $SwitchMap$com$adobe$mediacore$utils$TimeRangeCollection$Type[];

    static 
    {
        $SwitchMap$com$adobe$mediacore$utils$TimeRangeCollection$Type = new int[pe.values().length];
        try
        {
            $SwitchMap$com$adobe$mediacore$utils$TimeRangeCollection$Type[pe.DELETE_RANGES.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$adobe$mediacore$utils$TimeRangeCollection$Type[pe.MARK_RANGES.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$adobe$mediacore$utils$TimeRangeCollection$Type[pe.REPLACE_RANGES.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
