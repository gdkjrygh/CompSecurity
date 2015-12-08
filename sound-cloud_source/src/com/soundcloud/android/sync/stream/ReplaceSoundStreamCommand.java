// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.stream;

import com.soundcloud.android.commands.DefaultWriteStorageCommand;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.TxnResult;
import com.soundcloud.propeller.WriteResult;

// Referenced classes of package com.soundcloud.android.sync.stream:
//            SoundStreamReplaceTransaction

class ReplaceSoundStreamCommand extends DefaultWriteStorageCommand
{

    ReplaceSoundStreamCommand(PropellerDatabase propellerdatabase)
    {
        super(propellerdatabase);
    }

    protected TxnResult write(PropellerDatabase propellerdatabase, Iterable iterable)
    {
        return propellerdatabase.runTransaction(new SoundStreamReplaceTransaction(iterable));
    }

    protected volatile WriteResult write(PropellerDatabase propellerdatabase, Object obj)
    {
        return write(propellerdatabase, (Iterable)obj);
    }
}
