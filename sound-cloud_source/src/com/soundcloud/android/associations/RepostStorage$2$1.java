// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.associations;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.storage.Table;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.query.Where;

// Referenced classes of package com.soundcloud.android.associations:
//            RepostStorage

class  extends com.soundcloud.propeller.Transaction
{

    final val.whereClause this$1;
    final Urn val$urn;
    final Where val$whereClause;

    public void steps(PropellerDatabase propellerdatabase)
    {
        step(RepostStorage.access$200(_fld0, propellerdatabase, val$urn, cess._mth400(this._cls1.this)));
        step(propellerdatabase.delete(Table.Posts, val$whereClause));
    }

    ()
    {
        this$1 = final_;
        val$urn = urn1;
        val$whereClause = Where.this;
        super();
    }
}
