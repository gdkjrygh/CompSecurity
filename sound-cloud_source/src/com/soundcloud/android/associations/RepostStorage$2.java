// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.associations;

import com.soundcloud.android.commands.WriteStorageCommand;
import com.soundcloud.android.model.Urn;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.WriteResult;
import com.soundcloud.propeller.query.Filter;
import com.soundcloud.propeller.query.Where;

// Referenced classes of package com.soundcloud.android.associations:
//            RepostStorage

class <init> extends WriteStorageCommand
{

    final RepostStorage this$0;
    private int updatedRepostCount;

    protected Integer transform(WriteResult writeresult)
    {
        return Integer.valueOf(updatedRepostCount);
    }

    protected volatile Object transform(WriteResult writeresult)
    {
        return transform(writeresult);
    }

    public WriteResult write(PropellerDatabase propellerdatabase, final Urn urn)
    {
        int i = 0;
        updatedRepostCount = RepostStorage.access$000(RepostStorage.this, propellerdatabase, urn, false);
        Where where = Filter.filter().whereEq("target_id", Long.valueOf(urn.getNumericId()));
        class _cls1 extends com.soundcloud.propeller.PropellerDatabase.Transaction
        {

            final RepostStorage._cls2 this$1;
            final Urn val$urn;
            final Where val$whereClause;

            public void steps(PropellerDatabase propellerdatabase1)
            {
                step(RepostStorage.access$200(this$0, propellerdatabase1, urn, updatedRepostCount));
                step(propellerdatabase1.delete(Table.Posts, whereClause));
            }

            _cls1()
            {
                this$1 = RepostStorage._cls2.this;
                urn = urn1;
                whereClause = where;
                super();
            }
        }

        if (!urn.isTrack())
        {
            i = 1;
        }
        return propellerdatabase.runTransaction(new _cls1());
    }

    public volatile WriteResult write(PropellerDatabase propellerdatabase, Object obj)
    {
        return write(propellerdatabase, (Urn)obj);
    }


    _cls1(PropellerDatabase propellerdatabase)
    {
        this$0 = RepostStorage.this;
        super(propellerdatabase);
    }
}
