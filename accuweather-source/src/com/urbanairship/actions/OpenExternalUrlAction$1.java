// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.actions;


// Referenced classes of package com.urbanairship.actions:
//            OpenExternalUrlAction, Situation

static class 
{

    static final int $SwitchMap$com$urbanairship$actions$Situation[];

    static 
    {
        $SwitchMap$com$urbanairship$actions$Situation = new int[Situation.values().length];
        try
        {
            $SwitchMap$com$urbanairship$actions$Situation[Situation.PUSH_OPENED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$urbanairship$actions$Situation[Situation.WEB_VIEW_INVOCATION.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$urbanairship$actions$Situation[Situation.MANUAL_INVOCATION.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$urbanairship$actions$Situation[Situation.FOREGROUND_NOTIFICATION_ACTION_BUTTON.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
