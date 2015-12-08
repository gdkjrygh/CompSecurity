// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.artist;

import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.util.Pair;
import android.util.SparseArray;

public class f extends AbstractCursor
{

    private Cursor a;
    private SparseArray b;

    public f(Cursor cursor)
    {
        a = cursor;
        b = new SparseArray(a.getCount());
    }

    private boolean a(int i)
    {
        return b.get(i) != null;
    }

    public SparseArray a()
    {
        return b.clone();
    }

    public void a(int i, String s, boolean flag, boolean flag1)
    {
        if (a(i) && flag == flag1)
        {
            b.remove(i);
        }
        b.put(i, new Pair(s, Boolean.valueOf(flag1)));
    }

    public boolean a(int i, boolean flag)
    {
        if (a(i))
        {
            flag = ((Boolean)((Pair)b.get(i)).second).booleanValue();
        }
        return flag;
    }

    public void b()
    {
        b.clear();
    }

    public void close()
    {
        a.close();
        super.close();
    }

    public String[] getColumnNames()
    {
        if (a != null)
        {
            return a.getColumnNames();
        } else
        {
            throw new SQLException("Cursor's query did not return any columnNames");
        }
    }

    public int getCount()
    {
        if (a != null)
        {
            return a.getCount();
        } else
        {
            return 0;
        }
    }

    public double getDouble(int i)
    {
        return a.getDouble(i);
    }

    public float getFloat(int i)
    {
        return a.getFloat(i);
    }

    public int getInt(int i)
    {
        return a.getInt(i);
    }

    public long getLong(int i)
    {
        return a.getLong(i);
    }

    public short getShort(int i)
    {
        return a.getShort(i);
    }

    public String getString(int i)
    {
        return a.getString(i);
    }

    public boolean isNull(int i)
    {
        return a.isNull(i);
    }

    public boolean onMove(int i, int j)
    {
        return a.moveToPosition(j);
    }
}
