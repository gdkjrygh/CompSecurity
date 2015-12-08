// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.beta;


// Referenced classes of package com.crashlytics.android.beta:
//            AbstractCheckForUpdatesController

class ImmediateCheckForUpdatesController extends AbstractCheckForUpdatesController
{

    public ImmediateCheckForUpdatesController()
    {
        super(true);
    }

    public boolean isActivityLifecycleTriggered()
    {
        return false;
    }
}
