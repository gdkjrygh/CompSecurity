// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;


class .SlotMode
{

    static final int $SwitchMap$com$dominos$nina$dialog$DialogModelBuilder$SlotMode[];

    static 
    {
        $SwitchMap$com$dominos$nina$dialog$DialogModelBuilder$SlotMode = new int[com.dominos.nina.dialog.uilder.SlotMode.values().length];
        try
        {
            $SwitchMap$com$dominos$nina$dialog$DialogModelBuilder$SlotMode[com.dominos.nina.dialog.uilder.SlotMode.Mandatory.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$dominos$nina$dialog$DialogModelBuilder$SlotMode[com.dominos.nina.dialog.uilder.SlotMode.MandatoryCorrectable.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$dominos$nina$dialog$DialogModelBuilder$SlotMode[com.dominos.nina.dialog.uilder.SlotMode.Optional.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$dominos$nina$dialog$DialogModelBuilder$SlotMode[com.dominos.nina.dialog.uilder.SlotMode.OptionalCorrectable.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
