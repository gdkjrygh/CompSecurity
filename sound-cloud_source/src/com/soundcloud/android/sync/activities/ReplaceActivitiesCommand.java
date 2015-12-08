// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.activities;

import com.soundcloud.android.comments.StoreCommentCommand;
import com.soundcloud.android.storage.Table;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.TxnResult;
import com.soundcloud.propeller.WriteResult;

// Referenced classes of package com.soundcloud.android.sync.activities:
//            StoreActivitiesCommand

class ReplaceActivitiesCommand extends StoreActivitiesCommand
{
    private class ReplaceActivitiesTransaction extends StoreActivitiesCommand.StoreActivitiesTransaction
    {

        final ReplaceActivitiesCommand this$0;

        public void steps(PropellerDatabase propellerdatabase)
        {
            step(propellerdatabase.delete(Table.Activities));
            super.steps(propellerdatabase);
        }

        ReplaceActivitiesTransaction(Iterable iterable)
        {
            this$0 = ReplaceActivitiesCommand.this;
            super(ReplaceActivitiesCommand.this, iterable);
        }
    }


    ReplaceActivitiesCommand(PropellerDatabase propellerdatabase, StoreCommentCommand storecommentcommand)
    {
        super(propellerdatabase, storecommentcommand);
    }

    protected TxnResult write(PropellerDatabase propellerdatabase, Iterable iterable)
    {
        return propellerdatabase.runTransaction(new ReplaceActivitiesTransaction(iterable));
    }

    protected volatile WriteResult write(PropellerDatabase propellerdatabase, Object obj)
    {
        return write(propellerdatabase, (Iterable)obj);
    }
}
