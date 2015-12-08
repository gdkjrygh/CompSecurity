// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller.test.matchers;

import android.database.sqlite.SQLiteDatabase;
import com.soundcloud.propeller.query.Query;

public final class QueryBinding
{

    public final SQLiteDatabase database;
    public final Query query;

    public QueryBinding(SQLiteDatabase sqlitedatabase, Query query1)
    {
        database = sqlitedatabase;
        query = query1;
    }
}
