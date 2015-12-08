// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common;


// Referenced classes of package com.worklight.common:
//            Logger

static class EL
{

    static final int $SwitchMap$com$worklight$common$Logger$LEVEL[];

    static 
    {
        $SwitchMap$com$worklight$common$Logger$LEVEL = new int[EL.values().length];
        try
        {
            $SwitchMap$com$worklight$common$Logger$LEVEL[EL.FATAL.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$worklight$common$Logger$LEVEL[EL.ERROR.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$worklight$common$Logger$LEVEL[EL.WARN.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$worklight$common$Logger$LEVEL[EL.INFO.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$worklight$common$Logger$LEVEL[EL.LOG.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$worklight$common$Logger$LEVEL[EL.DEBUG.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$worklight$common$Logger$LEVEL[EL.TRACE.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
