// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.datastore;

import android.database.sqlite.SQLiteDatabase;

public interface SchemaMigration
{

    public abstract int getNewDbVersion();

    public abstract void upgrade(SQLiteDatabase sqlitedatabase);
}
