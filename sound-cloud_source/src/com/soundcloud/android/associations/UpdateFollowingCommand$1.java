// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.associations;

import com.soundcloud.android.storage.Table;
import com.soundcloud.propeller.PropellerDatabase;

// Referenced classes of package com.soundcloud.android.associations:
//            UpdateFollowingCommand

class  extends com.soundcloud.propeller.tion
{

    final UpdateFollowingCommand this$0;
    final dateFollowingParams val$params;

    public void steps(PropellerDatabase propellerdatabase)
    {
        step(propellerdatabase.update(Table.Users, UpdateFollowingCommand.access$000(UpdateFollowingCommand.this), UpdateFollowingCommand.access$100(UpdateFollowingCommand.this, val$params)));
        step(propellerdatabase.upsert(Table.UserAssociations, UpdateFollowingCommand.access$200(UpdateFollowingCommand.this, val$params)));
    }

    dateFollowingParams()
    {
        this$0 = final_updatefollowingcommand;
        val$params = dateFollowingParams.this;
        super();
    }
}
