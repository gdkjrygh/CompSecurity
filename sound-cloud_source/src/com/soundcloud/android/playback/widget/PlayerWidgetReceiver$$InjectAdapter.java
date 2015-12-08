// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.widget;

import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback.widget:
//            PlayerWidgetReceiver, PlayerWidgetController

public final class  extends b
    implements a, Provider
{

    private b controller;

    public final void attach(l l1)
    {
        controller = l1.a("com.soundcloud.android.playback.widget.PlayerWidgetController", com/soundcloud/android/playback/widget/PlayerWidgetReceiver, getClass().getClassLoader());
    }

    public final PlayerWidgetReceiver get()
    {
        PlayerWidgetReceiver playerwidgetreceiver = new PlayerWidgetReceiver();
        injectMembers(playerwidgetreceiver);
        return playerwidgetreceiver;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(controller);
    }

    public final void injectMembers(PlayerWidgetReceiver playerwidgetreceiver)
    {
        playerwidgetreceiver.controller = (PlayerWidgetController)controller.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PlayerWidgetReceiver)obj);
    }

    public ()
    {
        super("com.soundcloud.android.playback.widget.PlayerWidgetReceiver", "members/com.soundcloud.android.playback.widget.PlayerWidgetReceiver", false, com/soundcloud/android/playback/widget/PlayerWidgetReceiver);
    }
}
