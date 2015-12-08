// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.storage.Table;
import com.soundcloud.propeller.ContentValuesBuilder;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.query.Filter;
import com.soundcloud.propeller.query.Where;

// Referenced classes of package com.soundcloud.android.likes:
//            UpdateLikeCommand

class ction extends com.soundcloud.propeller.ansaction
{

    final UpdateLikeCommand this$0;
    final dateLikeParams val$params;

    public void steps(PropellerDatabase propellerdatabase)
    {
        step(propellerdatabase.update(Table.Sounds, ContentValuesBuilder.values().put("favoritings_count", UpdateLikeCommand.access$000(UpdateLikeCommand.this)).get(), Filter.filter().whereEq("_id", Long.valueOf(val$params.targetUrn.getNumericId())).whereEq("_type", Integer.valueOf(UpdateLikeCommand.access$100(UpdateLikeCommand.this, val$params.targetUrn)))));
        step(propellerdatabase.upsert(Table.Likes, UpdateLikeCommand.access$200(UpdateLikeCommand.this, val$params)));
    }

    dateLikeParams()
    {
        this$0 = final_updatelikecommand;
        val$params = dateLikeParams.this;
        super();
    }
}
