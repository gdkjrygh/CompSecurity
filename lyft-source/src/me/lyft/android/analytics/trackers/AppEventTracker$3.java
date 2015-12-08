// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.trackers;


// Referenced classes of package me.lyft.android.analytics.trackers:
//            AppEventTracker

class Type
{

    static final int $SwitchMap$me$lyft$android$analytics$definitions$LifecycleEvent$Type[];

    static 
    {
        $SwitchMap$me$lyft$android$analytics$definitions$LifecycleEvent$Type = new int[me.lyft.android.analytics.definitions.e.values().length];
        try
        {
            $SwitchMap$me$lyft$android$analytics$definitions$LifecycleEvent$Type[me.lyft.android.analytics.definitions.e.APP_OPEN.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$me$lyft$android$analytics$definitions$LifecycleEvent$Type[me.lyft.android.analytics.definitions.e.APP_CLOSE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$me$lyft$android$analytics$definitions$LifecycleEvent$Type[me.lyft.android.analytics.definitions.e.APP_INSTALL.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$me$lyft$android$analytics$definitions$LifecycleEvent$Type[me.lyft.android.analytics.definitions.e.APP_UPDATE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
