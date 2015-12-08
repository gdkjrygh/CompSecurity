// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.testcompat;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtils;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.client.games.GameFirstPartyEntity;
import com.google.android.gms.games.internal.GamesIntents;
import com.google.android.gms.games.internal.game.GameBadgeEntity;
import com.google.android.gms.games.multiplayer.InvitationEntity;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;

public final class ParcelTestCompatActivity extends Activity
{

    private Context mCallingContext;
    private int mClientVersionCode;

    public ParcelTestCompatActivity()
    {
    }

    private void prepareForClient$745f9f8b(Bundle bundle, String s, Class class1, Bundle bundle1)
    {
        if (bundle.containsKey(s) && !com.google.android.gms.common.internal.DowngradeableSafeParcel.DowngradeableSafeParcelHelper.putParcelable(bundle1, s, (DowngradeableSafeParcel)((Freezable)bundle.getParcelable(s)).freeze(), mCallingContext, Integer.valueOf(mClientVersionCode)))
        {
            throw new IllegalStateException((new StringBuilder("Failed to write client safe class ")).append(class1.getSimpleName()).toString());
        } else
        {
            return;
        }
    }

    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent();
        mClientVersionCode = GamesIntents.getClientVersion(bundle);
        mCallingContext = AndroidUtils.getCallingContext(this);
        Preconditions.checkNotNull(mCallingContext, "ParcelTestCompat must be started for result!");
        GooglePlayServicesUtil.verifyPackageIsGoogleSigned(getPackageManager(), mCallingContext.getPackageName());
        Object obj = com.google.android.gms.common.internal.DowngradeableSafeParcel.DowngradeableSafeParcelHelper.getExtras(bundle, mCallingContext, Integer.valueOf(mClientVersionCode));
        Preconditions.checkNotNull(obj, "No extras found!");
        bundle = new Bundle();
        prepareForClient$745f9f8b(((Bundle) (obj)), "invitation", com/google/android/gms/games/multiplayer/InvitationEntity, bundle);
        prepareForClient$745f9f8b(((Bundle) (obj)), "room", com/google/android/gms/games/multiplayer/realtime/RoomEntity, bundle);
        prepareForClient$745f9f8b(((Bundle) (obj)), "com.google.android.gms.games.GAME", com/google/android/gms/games/GameEntity, bundle);
        prepareForClient$745f9f8b(((Bundle) (obj)), "com.google.android.gms.games.EXTENDED_GAME", com/google/android/gms/games/client/games/GameFirstPartyEntity, bundle);
        prepareForClient$745f9f8b(((Bundle) (obj)), "com.google.android.gms.games.PLAYER", com/google/android/gms/games/PlayerEntity, bundle);
        prepareForClient$745f9f8b(((Bundle) (obj)), "com.google.android.gms.games.GAME_BADGE", com/google/android/gms/games/internal/game/GameBadgeEntity, bundle);
        prepareForClient$745f9f8b(((Bundle) (obj)), "com.google.android.gms.games.PARTICIPANT", com/google/android/gms/games/multiplayer/ParticipantEntity, bundle);
        obj = new Intent();
        ((Intent) (obj)).putExtras(bundle);
        setResult(-1, ((Intent) (obj)));
        finish();
    }
}
