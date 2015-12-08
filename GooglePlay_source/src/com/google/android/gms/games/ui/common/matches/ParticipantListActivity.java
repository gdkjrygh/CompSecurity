// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.matches;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.people.People;

// Referenced classes of package com.google.android.gms.games.ui.common.matches:
//            ParticipantListMetaDataProvider

public abstract class ParticipantListActivity extends GamesFragmentActivity
    implements ParticipantListFragment.ParticipantListListener, ParticipantListMetaDataProvider
{

    private String mCurrentAccountName;
    private String mCurrentApplicationId;
    public String mCurrentPlayerId;
    private Uri mFeaturedUri;
    private Uri mIconUri;
    private Participant mParticipants[];

    public ParticipantListActivity(int i)
    {
        super(i, 0, 0x7f0400b3, 0);
    }

    public final String getAccountName()
    {
        return mCurrentAccountName;
    }

    public final String getApplicationId()
    {
        return mCurrentApplicationId;
    }

    public final String getCurrentPlayerId()
    {
        return mCurrentPlayerId;
    }

    public final Uri getFeaturedUri()
    {
        return mFeaturedUri;
    }

    public final Participant[] getParticipants()
    {
        return mParticipants;
    }

    protected final GoogleApiClient instantiateGoogleApiClient()
    {
        com.google.android.gms.common.api.GoogleApiClient.Builder builder = new com.google.android.gms.common.api.GoogleApiClient.Builder(this, this, this);
        com.google.android.gms.people.People.PeopleOptions1p.Builder builder1 = new com.google.android.gms.people.People.PeopleOptions1p.Builder();
        builder1.clientApplicationId = 118;
        builder.addApi(People.API_1P, builder1.build());
        addApisToGoogleApiClient(builder);
        return builder.build();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent();
        android.os.Parcelable aparcelable[] = bundle.getParcelableArrayExtra("com.google.android.gms.games.PARTICIPANTS");
        if (aparcelable == null)
        {
            GamesLog.e("ParticipListAct", "Required participants list is missing.");
            finish();
        } else
        {
            mCurrentAccountName = bundle.getStringExtra("com.google.android.gms.games.ACCOUNT_NAME");
            if (mCurrentAccountName == null)
            {
                GamesLog.e("ParticipListAct", "Required current account name is missing.");
                finish();
            }
            mCurrentApplicationId = bundle.getStringExtra("com.google.android.gms.games.GAME_ID");
            if (mCurrentApplicationId == null)
            {
                GamesLog.e("ParticipListAct", "Required application id is missing.");
                finish();
            }
            mCurrentPlayerId = bundle.getStringExtra("com.google.android.gms.games.PLAYER_ID");
            if (mCurrentPlayerId == null)
            {
                GamesLog.e("ParticipListAct", "Required current player id is missing.");
                finish();
            }
            mFeaturedUri = (Uri)bundle.getParcelableExtra("com.google.android.gms.games.FEATURED_URI");
            mIconUri = (Uri)bundle.getParcelableExtra("com.google.android.gms.games.ICON_URI");
            mParticipants = new Participant[aparcelable.length];
            int i = 0;
            int j = aparcelable.length;
            while (i < j) 
            {
                mParticipants[i] = (Participant)aparcelable[i];
                i++;
            }
        }
    }
}
