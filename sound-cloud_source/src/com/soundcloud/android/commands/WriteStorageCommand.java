// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.commands;

import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.WriteResult;

// Referenced classes of package com.soundcloud.android.commands:
//            Command

public abstract class WriteStorageCommand extends Command
{

    private final PropellerDatabase propeller;

    public WriteStorageCommand(PropellerDatabase propellerdatabase)
    {
        propeller = propellerdatabase;
    }

    public Object call(Object obj)
    {
        obj = write(propeller, obj);
        if (((WriteResult) (obj)).success())
        {
            return transform(((WriteResult) (obj)));
        } else
        {
            throw ((WriteResult) (obj)).getFailure();
        }
    }

    public abstract Object transform(WriteResult writeresult);

    public abstract WriteResult write(PropellerDatabase propellerdatabase, Object obj);
}
