// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.provider;

import android.database.sqlite.SQLiteDatabase;

// Referenced classes of package com.google.android.gms.games.provider:
//            GamesSQLHelper, GamesTableHelper

static final class mTable
    implements GamesSQLHelper
{

    private String mTable;

    public final void execute(SQLiteDatabase sqlitedatabase, int i)
    {
        sqlitedatabase.delete(mTable, null, null);
    }

    (String s)
    {
        mTable = s;
    }
}
