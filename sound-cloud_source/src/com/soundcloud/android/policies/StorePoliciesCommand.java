// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.policies;

import android.content.ContentValues;
import com.soundcloud.android.commands.DefaultWriteStorageCommand;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.android.utils.DateProvider;
import com.soundcloud.propeller.ContentValuesBuilder;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.TxnResult;
import com.soundcloud.propeller.WriteResult;

// Referenced classes of package com.soundcloud.android.policies:
//            ApiPolicyInfo

class StorePoliciesCommand extends DefaultWriteStorageCommand
{

    private final DateProvider dateProvider;

    public StorePoliciesCommand(PropellerDatabase propellerdatabase, CurrentDateProvider currentdateprovider)
    {
        super(propellerdatabase);
        dateProvider = currentdateprovider;
    }

    private ContentValues buildPolicyContentValues(ApiPolicyInfo apipolicyinfo)
    {
        return ContentValuesBuilder.values().put("track_id", apipolicyinfo.getUrn().getNumericId()).put("policy", apipolicyinfo.getPolicy()).put("monetizable", apipolicyinfo.isMonetizable()).put("syncable", apipolicyinfo.isSyncable()).put("last_updated", dateProvider.getCurrentTime()).put("monetization_model", apipolicyinfo.getMonetizationModel()).put("sub_mid_tier", apipolicyinfo.isSubMidTier().booleanValue()).put("sub_high_tier", apipolicyinfo.isSubHighTier().booleanValue()).get();
    }

    protected TxnResult write(PropellerDatabase propellerdatabase, final Iterable input)
    {
        return propellerdatabase.runTransaction(new _cls1());
    }

    protected volatile WriteResult write(PropellerDatabase propellerdatabase, Object obj)
    {
        return write(propellerdatabase, (Iterable)obj);
    }


    private class _cls1 extends com.soundcloud.propeller.PropellerDatabase.Transaction
    {

        final StorePoliciesCommand this$0;
        final Iterable val$input;

        public void steps(PropellerDatabase propellerdatabase)
        {
            ApiPolicyInfo apipolicyinfo;
            for (Iterator iterator = input.iterator(); iterator.hasNext(); step(propellerdatabase.upsert(Table.TrackPolicies, buildPolicyContentValues(apipolicyinfo))))
            {
                apipolicyinfo = (ApiPolicyInfo)iterator.next();
            }

        }

        _cls1()
        {
            this$0 = StorePoliciesCommand.this;
            input = iterable;
            super();
        }
    }

}
