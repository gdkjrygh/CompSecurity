// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.recommendations;

import android.content.ContentValues;
import com.soundcloud.android.api.model.ApiTrack;
import com.soundcloud.android.commands.DefaultWriteStorageCommand;
import com.soundcloud.android.model.Urn;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.WriteResult;
import com.soundcloud.propeller.schema.Column;

// Referenced classes of package com.soundcloud.android.sync.recommendations:
//            ApiRecommendation

public class StoreRecommendationsCommand extends DefaultWriteStorageCommand
{

    private final PropellerDatabase propeller;

    public StoreRecommendationsCommand(PropellerDatabase propellerdatabase)
    {
        super(propellerdatabase);
        propeller = propellerdatabase;
    }

    private ContentValues buildRecommendationContentValues(ApiTrack apitrack, long l)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(com.soundcloud.android.storage.Tables.Recommendations.SEED_ID.name(), Long.valueOf(l));
        contentvalues.put(com.soundcloud.android.storage.Tables.Recommendations.RECOMMENDED_SOUND_ID.name(), Long.valueOf(apitrack.getUrn().getNumericId()));
        contentvalues.put(com.soundcloud.android.storage.Tables.Recommendations.RECOMMENDED_SOUND_TYPE.name(), Integer.valueOf(0));
        return contentvalues;
    }

    private ContentValues buildSeedContentValues(ApiRecommendation apirecommendation)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(com.soundcloud.android.storage.Tables.RecommendationSeeds.SEED_SOUND_ID.name(), Long.valueOf(apirecommendation.getSeedTrack().getUrn().getNumericId()));
        contentvalues.put(com.soundcloud.android.storage.Tables.RecommendationSeeds.SEED_SOUND_TYPE.name(), Integer.valueOf(0));
        contentvalues.put(com.soundcloud.android.storage.Tables.RecommendationSeeds.RECOMMENDATION_REASON.name(), Integer.valueOf(getReason(apirecommendation)));
        return contentvalues;
    }

    private int getReason(ApiRecommendation apirecommendation)
    {
        apirecommendation = apirecommendation.getRecommendationReason();
        switch (_cls2..SwitchMap.com.soundcloud.android.sync.recommendations.ApiRecommendation.Reason[apirecommendation.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unhandled reason ")).append(apirecommendation).toString());

        case 1: // '\001'
            return 0;

        case 2: // '\002'
            return 1;
        }
    }

    private boolean isReasonValid(ApiRecommendation apirecommendation)
    {
        return apirecommendation.getRecommendationReason() != ApiRecommendation.Reason.UNKNOWN;
    }

    public void clearTables()
    {
        propeller.delete(com.soundcloud.android.storage.Tables.Recommendations.TABLE);
        propeller.delete(com.soundcloud.android.storage.Tables.RecommendationSeeds.TABLE);
    }

    protected WriteResult write(PropellerDatabase propellerdatabase, final Iterable input)
    {
        clearTables();
        return propellerdatabase.runTransaction(new _cls1());
    }

    protected volatile WriteResult write(PropellerDatabase propellerdatabase, Object obj)
    {
        return write(propellerdatabase, (Iterable)obj);
    }




    private class _cls2
    {

        static final int $SwitchMap$com$soundcloud$android$sync$recommendations$ApiRecommendation$Reason[];

        static 
        {
            $SwitchMap$com$soundcloud$android$sync$recommendations$ApiRecommendation$Reason = new int[ApiRecommendation.Reason.values().length];
            try
            {
                $SwitchMap$com$soundcloud$android$sync$recommendations$ApiRecommendation$Reason[ApiRecommendation.Reason.LIKED.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$soundcloud$android$sync$recommendations$ApiRecommendation$Reason[ApiRecommendation.Reason.LISTENED_TO.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls1 extends com.soundcloud.propeller.PropellerDatabase.Transaction
    {

        final StoreRecommendationsCommand this$0;
        final Iterable val$input;

        private void writeTrack(PropellerDatabase propellerdatabase, ApiTrack apitrack)
        {
            step(propellerdatabase.upsert(Table.Users, StoreUsersCommand.buildUserContentValues(apitrack.getUser())));
            step(propellerdatabase.upsert(Table.Sounds, StoreTracksCommand.buildTrackContentValues(apitrack)));
            step(propellerdatabase.upsert(Table.TrackPolicies, StoreTracksCommand.buildPolicyContentValues(apitrack)));
        }

        public void steps(PropellerDatabase propellerdatabase)
        {
            Iterator iterator = input.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = (ApiRecommendation)iterator.next();
                if (isReasonValid(((ApiRecommendation) (obj))))
                {
                    writeTrack(propellerdatabase, ((ApiRecommendation) (obj)).getSeedTrack());
                    InsertResult insertresult = propellerdatabase.insert(com.soundcloud.android.storage.Tables.RecommendationSeeds.TABLE, buildSeedContentValues(((ApiRecommendation) (obj))));
                    step(insertresult);
                    obj = ((ApiRecommendation) (obj)).getRecommendations().iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        ApiTrack apitrack = (ApiTrack)((Iterator) (obj)).next();
                        writeTrack(propellerdatabase, apitrack);
                        step(propellerdatabase.upsert(com.soundcloud.android.storage.Tables.Recommendations.TABLE, buildRecommendationContentValues(apitrack, insertresult.getRowId())));
                    }
                }
            } while (true);
        }

        _cls1()
        {
            this$0 = StoreRecommendationsCommand.this;
            input = iterable;
            super();
        }
    }

}
