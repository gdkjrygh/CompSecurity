// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.apps.wallet.hce.util.Hex;
import com.google.common.base.Joiner;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;

public abstract class AbstractDatabaseTable
{

    public static final Integer FALSE = Integer.valueOf(0);
    public static final String NO_GROUP_BY = null;
    public static final String NO_HAVING = null;
    public static final String NO_LIMIT = null;
    public static final String NO_ORDER_BY = null;
    public static final String NO_SELECTION_ARGS[] = null;
    public static final String SELECT_ALL_COLUMNS[] = null;
    public static final String SELECT_ALL_ROWS = null;
    public static final String SELECT_BY_COL_ID = String.format("%s = ?", new Object[] {
        "_id"
    });
    public static final Integer TRUE = Integer.valueOf(1);
    protected final SQLiteOpenHelper helper;
    protected final String mTableName;

    protected AbstractDatabaseTable(String s, SQLiteOpenHelper sqliteopenhelper)
    {
        mTableName = s;
        helper = sqliteopenhelper;
    }

    protected static byte getByte(Cursor cursor, String s)
    {
        return UnsignedBytes.checkedCast(getInt(cursor, s));
    }

    protected static byte[] getBytes(Cursor cursor, String s)
    {
        return Hex.decode(getString(cursor, s));
    }

    protected static int getInt(Cursor cursor, String s)
    {
        return cursor.getInt(cursor.getColumnIndexOrThrow(s));
    }

    protected static long getLong(Cursor cursor, String s)
    {
        return cursor.getLong(cursor.getColumnIndexOrThrow(s));
    }

    protected static short getShort(Cursor cursor, String s)
    {
        return cursor.getShort(cursor.getColumnIndexOrThrow(s));
    }

    protected static String getString(Cursor cursor, String s)
    {
        return cursor.getString(cursor.getColumnIndexOrThrow(s));
    }

    protected static String getWhereIdInClause(int i)
    {
        Character acharacter[] = new Character[i];
        Arrays.fill(acharacter, Character.valueOf('?'));
        return String.format(" WHERE %s in (%s)", new Object[] {
            "_id", Joiner.on(',').join(acharacter)
        });
    }

    public final void deleteAllRows()
    {
        helper.getWritableDatabase().delete(mTableName, SELECT_ALL_ROWS, NO_SELECTION_ARGS);
    }

}
