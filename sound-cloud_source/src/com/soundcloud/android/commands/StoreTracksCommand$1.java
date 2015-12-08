// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.commands;

import com.soundcloud.android.storage.Table;
import com.soundcloud.android.tracks.TrackRecord;
import com.soundcloud.propeller.PropellerDatabase;
import java.util.Iterator;

// Referenced classes of package com.soundcloud.android.commands:
//            StoreUsersCommand, StoreTracksCommand

class n extends com.soundcloud.propeller.nsaction
{

    final StoreTracksCommand this$0;
    final Iterable val$input;

    public void steps(PropellerDatabase propellerdatabase)
    {
        TrackRecord trackrecord;
        for (Iterator iterator = val$input.iterator(); iterator.hasNext(); step(propellerdatabase.upsert(Table.TrackPolicies, StoreTracksCommand.buildPolicyContentValues(trackrecord))))
        {
            trackrecord = (TrackRecord)iterator.next();
            step(propellerdatabase.upsert(Table.Users, StoreUsersCommand.buildUserContentValues(trackrecord.getUser())));
            step(propellerdatabase.upsert(Table.Sounds, StoreTracksCommand.buildTrackContentValues(trackrecord)));
        }

    }

    n()
    {
        this$0 = final_storetrackscommand;
        val$input = Iterable.this;
        super();
    }
}
