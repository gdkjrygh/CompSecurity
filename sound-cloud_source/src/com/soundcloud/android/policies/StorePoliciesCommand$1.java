// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.policies;

import com.soundcloud.android.storage.Table;
import com.soundcloud.propeller.PropellerDatabase;
import java.util.Iterator;

// Referenced classes of package com.soundcloud.android.policies:
//            ApiPolicyInfo, StorePoliciesCommand

class <init> extends com.soundcloud.propeller.action
{

    final StorePoliciesCommand this$0;
    final Iterable val$input;

    public void steps(PropellerDatabase propellerdatabase)
    {
        ApiPolicyInfo apipolicyinfo;
        for (Iterator iterator = val$input.iterator(); iterator.hasNext(); step(propellerdatabase.upsert(Table.TrackPolicies, StorePoliciesCommand.access$000(StorePoliciesCommand.this, apipolicyinfo))))
        {
            apipolicyinfo = (ApiPolicyInfo)iterator.next();
        }

    }

    ()
    {
        this$0 = final_storepoliciescommand;
        val$input = Iterable.this;
        super();
    }
}
