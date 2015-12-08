// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.settings;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.media.PlayerType;
import com.netflix.mediaclient.service.configuration.PlayerTypeFactory;

// Referenced classes of package com.netflix.mediaclient.ui.settings:
//            SettingsFragment

class val.newType
    implements Runnable
{

    final SettingsFragment this$0;
    final PlayerType val$newType;

    public void run()
    {
        Log.w("SettingsFragment", "Updating player type!");
        PlayerTypeFactory.setPlayerTypeForQAOverride(SettingsFragment.access$000(SettingsFragment.this), val$newType);
        Log.w("SettingsFragment", "Updating player type done.");
    }

    eFactory()
    {
        this$0 = final_settingsfragment;
        val$newType = PlayerType.this;
        super();
    }
}
