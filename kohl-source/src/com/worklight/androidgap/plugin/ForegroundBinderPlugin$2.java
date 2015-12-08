// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;


// Referenced classes of package com.worklight.androidgap.plugin:
//            ForegroundBinderPlugin

static class tion
{

    static final int $SwitchMap$com$worklight$androidgap$plugin$ForegroundBinderPlugin$Action[];

    static 
    {
        $SwitchMap$com$worklight$androidgap$plugin$ForegroundBinderPlugin$Action = new int[tion.values().length];
        try
        {
            $SwitchMap$com$worklight$androidgap$plugin$ForegroundBinderPlugin$Action[tion.BIND_TO_SERVICE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$worklight$androidgap$plugin$ForegroundBinderPlugin$Action[tion.UNBIND_FROM_SERVICE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
