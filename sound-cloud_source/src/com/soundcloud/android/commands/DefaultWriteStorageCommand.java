// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.commands;

import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.WriteResult;

// Referenced classes of package com.soundcloud.android.commands:
//            WriteStorageCommand

public abstract class DefaultWriteStorageCommand extends WriteStorageCommand
{

    public DefaultWriteStorageCommand(PropellerDatabase propellerdatabase)
    {
        super(propellerdatabase);
    }

    protected WriteResult transform(WriteResult writeresult)
    {
        return writeresult;
    }

    protected volatile Object transform(WriteResult writeresult)
    {
        return transform(writeresult);
    }
}
