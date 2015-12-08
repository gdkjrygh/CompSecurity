// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.stream;

import com.soundcloud.android.storage.Table;
import com.soundcloud.propeller.PropellerDatabase;

// Referenced classes of package com.soundcloud.android.sync.stream:
//            SoundStreamInsertTransaction

public class SoundStreamReplaceTransaction extends SoundStreamInsertTransaction
{

    SoundStreamReplaceTransaction(Iterable iterable)
    {
        super(iterable);
    }

    protected void beforeInserts(PropellerDatabase propellerdatabase)
    {
        super.beforeInserts(propellerdatabase);
        step(propellerdatabase.delete(Table.SoundStream));
    }

    public volatile void steps(PropellerDatabase propellerdatabase)
    {
        super.steps(propellerdatabase);
    }
}
