// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.party;

import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseSettings;
import com.spotify.mobile.android.spotlets.party.adapter.PartyTracksAdapter;

// Referenced classes of package com.spotify.mobile.android.spotlets.party:
//            PartySetupActivity

final class a extends AdvertiseCallback
{

    private PartySetupActivity a;

    public final void onStartFailure(int i)
    {
        PartySetupActivity.c(a).d = "Nearby: ERROR device supports BLE advertising but it failed";
    }

    public final void onStartSuccess(AdvertiseSettings advertisesettings)
    {
        super.onStartSuccess(advertisesettings);
        PartySetupActivity.c(a).d = (new StringBuilder("Nearby: ADVERTISING user ")).append(PartySetupActivity.b(a)).toString();
    }

    apter(PartySetupActivity partysetupactivity)
    {
        a = partysetupactivity;
        super();
    }
}
