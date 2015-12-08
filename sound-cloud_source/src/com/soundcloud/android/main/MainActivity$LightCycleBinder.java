// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;


// Referenced classes of package com.soundcloud.android.main:
//            MainActivity

public final class 
{

    public static void bind(MainActivity mainactivity)
    {
        nd(mainactivity);
        mainactivity.bind(mainactivity.mainPresenter);
        mainactivity.bind(mainactivity.playerController);
        mainactivity.bind(mainactivity.actionBarHelper);
        mainactivity.bind(mainactivity.gcmManager);
        mainactivity.bind(mainactivity.facebookInvitesController);
    }

    public ()
    {
    }
}
