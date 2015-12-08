// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller;

import android.database.Cursor;
import com.soundcloud.propeller.schema.Column;
import java.util.Date;

public class CursorReader
{

    private static final int TRUE_VALUE = 1;
    private final boolean autoExpandColumns;
    private final Cursor cursor;

    CursorReader(Cursor cursor1, boolean flag)
    {
        cursor = cursor1;
        autoExpandColumns = flag;
    }

    private String getColumnName(Column column)
    {
        if (autoExpandColumns)
        {
            return column.fullName();
        } else
        {
            return column.name();
        }
    }

    void advanceCursor()
    {
        cursor.moveToNext();
    }

    void closeCursor()
    {
        if (!cursor.isClosed())
        {
            cursor.close();
        }
    }

    public byte[] getBlob(int i)
    {
        return cursor.getBlob(i);
    }

    public byte[] getBlob(Column column)
    {
        return cursor.getBlob(cursor.getColumnIndex(getColumnName(column)));
    }

    public byte[] getBlob(String s)
    {
        return cursor.getBlob(cursor.getColumnIndex(s));
    }

    public boolean getBoolean(int i)
    {
        return getInt(i) == 1;
    }

    public boolean getBoolean(Column column)
    {
        return getBoolean(getColumnName(column));
    }

    public boolean getBoolean(String s)
    {
        return getInt(s) == 1;
    }

    public int getColumnCount()
    {
        return cursor.getColumnCount();
    }

    public Date getDateFromTimestamp(int i)
    {
        return new Date(getLong(i));
    }

    public Date getDateFromTimestamp(Column column)
    {
        return new Date(getLong(getColumnName(column)));
    }

    public Date getDateFromTimestamp(String s)
    {
        return new Date(getLong(s));
    }

    public double getDouble(int i)
    {
        return cursor.getDouble(i);
    }

    public double getDouble(Column column)
    {
        return cursor.getDouble(cursor.getColumnIndex(getColumnName(column)));
    }

    public double getDouble(String s)
    {
        return cursor.getDouble(cursor.getColumnIndex(s));
    }

    public float getFloat(int i)
    {
        return cursor.getFloat(i);
    }

    public float getFloat(Column column)
    {
        return cursor.getFloat(cursor.getColumnIndex(getColumnName(column)));
    }

    public float getFloat(String s)
    {
        return cursor.getFloat(cursor.getColumnIndex(s));
    }

    public int getInt(int i)
    {
        return cursor.getInt(i);
    }

    public int getInt(Column column)
    {
        return cursor.getInt(cursor.getColumnIndex(getColumnName(column)));
    }

    public int getInt(String s)
    {
        return cursor.getInt(cursor.getColumnIndex(s));
    }

    public long getLong(int i)
    {
        return cursor.getLong(i);
    }

    public long getLong(Column column)
    {
        return cursor.getLong(cursor.getColumnIndex(getColumnName(column)));
    }

    public long getLong(String s)
    {
        return cursor.getLong(cursor.getColumnIndex(s));
    }

    public int getRowCount()
    {
        return cursor.getCount();
    }

    public short getShort(int i)
    {
        return cursor.getShort(i);
    }

    public short getShort(Column column)
    {
        return cursor.getShort(cursor.getColumnIndex(getColumnName(column)));
    }

    public short getShort(String s)
    {
        return cursor.getShort(cursor.getColumnIndex(s));
    }

    public String getString(int i)
    {
        return cursor.getString(i);
    }

    public String getString(Column column)
    {
        return cursor.getString(cursor.getColumnIndex(getColumnName(column)));
    }

    public String getString(String s)
    {
        return cursor.getString(cursor.getColumnIndex(s));
    }

    boolean hasNext()
    {
        return !cursor.isLast() && !cursor.isAfterLast();
    }

    public boolean isNotNull(int i)
    {
        return !isNull(i);
    }

    public boolean isNotNull(Column column)
    {
        return !isNull(column);
    }

    public boolean isNotNull(String s)
    {
        return !isNull(s);
    }

    public boolean isNull(int i)
    {
        return cursor.isNull(i);
    }

    public boolean isNull(Column column)
    {
        return cursor.isNull(cursor.getColumnIndex(getColumnName(column)));
    }

    public boolean isNull(String s)
    {
        return cursor.isNull(cursor.getColumnIndex(s));
    }
}
