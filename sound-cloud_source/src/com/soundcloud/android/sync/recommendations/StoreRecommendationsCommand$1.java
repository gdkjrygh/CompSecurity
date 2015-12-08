// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.recommendations;

import com.soundcloud.android.api.model.ApiTrack;
import com.soundcloud.android.commands.StoreTracksCommand;
import com.soundcloud.android.commands.StoreUsersCommand;
import com.soundcloud.android.storage.Table;
import com.soundcloud.propeller.InsertResult;
import com.soundcloud.propeller.PropellerDatabase;
import java.util.Iterator;

// Referenced classes of package com.soundcloud.android.sync.recommendations:
//            ApiRecommendation, StoreRecommendationsCommand

class val.input extends com.soundcloud.propeller.endationsCommand._cls1
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
        Iterator iterator = val$input.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (ApiRecommendation)iterator.next();
            if (StoreRecommendationsCommand.access$000(StoreRecommendationsCommand.this, ((ApiRecommendation) (obj))))
            {
                writeTrack(propellerdatabase, ((ApiRecommendation) (obj)).getSeedTrack());
                InsertResult insertresult = propellerdatabase.insert(com.soundcloud.android.storage.LE, StoreRecommendationsCommand.access$100(StoreRecommendationsCommand.this, ((ApiRecommendation) (obj))));
                step(insertresult);
                obj = ((ApiRecommendation) (obj)).getRecommendations().iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    ApiTrack apitrack = (ApiTrack)((Iterator) (obj)).next();
                    writeTrack(propellerdatabase, apitrack);
                    step(propellerdatabase.upsert(com.soundcloud.android.storage.onsCommand._cls1.step, StoreRecommendationsCommand.access$200(StoreRecommendationsCommand.this, apitrack, insertresult.getRowId())));
                }
            }
        } while (true);
    }

    ()
    {
        this$0 = final_storerecommendationscommand;
        val$input = Iterable.this;
        super();
    }
}
