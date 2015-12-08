// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.commands;

import com.soundcloud.android.storage.Table;
import com.soundcloud.propeller.ChangeResult;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.WriteResult;

// Referenced classes of package com.soundcloud.android.commands:
//            DefaultWriteStorageCommand

public class ClearTableCommand extends DefaultWriteStorageCommand
{

    protected ClearTableCommand(PropellerDatabase propellerdatabase)
    {
        super(propellerdatabase);
    }

    protected ChangeResult write(PropellerDatabase propellerdatabase, Table table)
    {
        return propellerdatabase.delete(table);
    }

    protected volatile WriteResult write(PropellerDatabase propellerdatabase, Object obj)
    {
        return write(propellerdatabase, (Table)obj);
    }
}
