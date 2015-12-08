// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.activities;

import com.soundcloud.android.storage.Table;
import com.soundcloud.propeller.PropellerDatabase;

// Referenced classes of package com.soundcloud.android.sync.activities:
//            ReplaceActivitiesCommand

private class t> extends t>
{

    final ReplaceActivitiesCommand this$0;

    public void steps(PropellerDatabase propellerdatabase)
    {
        step(propellerdatabase.delete(Table.Activities));
        super.s(propellerdatabase);
    }

    (Iterable iterable)
    {
        this$0 = ReplaceActivitiesCommand.this;
        super(ReplaceActivitiesCommand.this, iterable);
    }
}
