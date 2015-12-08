// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event;


// Referenced classes of package de.greenrobot.event:
//            EventBus, ThreadMode

static class 
{

    static final int $SwitchMap$de$greenrobot$event$ThreadMode[];

    static 
    {
        $SwitchMap$de$greenrobot$event$ThreadMode = new int[ThreadMode.values().length];
        try
        {
            $SwitchMap$de$greenrobot$event$ThreadMode[ThreadMode.PostThread.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$de$greenrobot$event$ThreadMode[ThreadMode.MainThread.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$de$greenrobot$event$ThreadMode[ThreadMode.BackgroundThread.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$de$greenrobot$event$ThreadMode[ThreadMode.Async.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
