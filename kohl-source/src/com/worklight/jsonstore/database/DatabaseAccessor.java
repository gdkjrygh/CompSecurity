// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.database;

import net.sqlcipher.database.SQLiteDatabase;

// Referenced classes of package com.worklight.jsonstore.database:
//            ReadableDatabase, DatabaseSchema, WritableDatabase

public interface DatabaseAccessor
{

    public abstract void createTable();

    public abstract void dropTable();

    public abstract SQLiteDatabase getRawDatabase();

    public abstract ReadableDatabase getReadableDatabase();

    public abstract DatabaseSchema getSchema();

    public abstract boolean getTableExists();

    public abstract WritableDatabase getWritableDatabase();
}
