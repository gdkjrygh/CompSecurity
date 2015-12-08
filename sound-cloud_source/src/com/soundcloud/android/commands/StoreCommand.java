// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.commands;

import com.soundcloud.android.rx.ScSchedulers;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.WriteResult;
import rx.b;

// Referenced classes of package com.soundcloud.android.commands:
//            LegacyCommand

public abstract class StoreCommand extends LegacyCommand
{

    public final PropellerDatabase database;

    public StoreCommand(PropellerDatabase propellerdatabase)
    {
        database = propellerdatabase;
    }

    public WriteResult call()
    {
        WriteResult writeresult = store();
        if (writeresult.success())
        {
            return writeresult;
        } else
        {
            throw writeresult.getFailure();
        }
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public abstract WriteResult store();

    public b toObservable()
    {
        return super.toObservable().subscribeOn(ScSchedulers.HIGH_PRIO_SCHEDULER);
    }
}
