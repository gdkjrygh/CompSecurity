// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.provider;

import android.database.AbstractCursor;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class a extends AbstractCursor
{

    private List a;
    private Cursor b;

    public a(Cursor cursor)
    {
        a = new ArrayList();
        b = cursor;
    }

    public int a(int i)
    {
        int j = Collections.binarySearch(a, Integer.valueOf(i));
        if (j < 0)
        {
            j = -j - 1;
        } else
        {
            j++;
        }
        do
        {
            int l = i + j;
            int k;
            if (a.size() == j)
            {
                k = -1;
            } else
            {
                k = ((Integer)a.get(j)).intValue();
            }
            if (k < 0 || l < k)
            {
                return l;
            }
            j++;
        } while (true);
    }

    public int b(int i)
    {
        i = a(i);
        int j = Collections.binarySearch(a, Integer.valueOf(i));
        a.add(-j - 1, Integer.valueOf(i));
        return i;
    }

    public boolean c(int i)
    {
        i = Collections.binarySearch(a, Integer.valueOf(i));
        if (i >= 0)
        {
            a.remove(i);
            return true;
        } else
        {
            return false;
        }
    }

    public String[] getColumnNames()
    {
        return b.getColumnNames();
    }

    public int getCount()
    {
        return b.getCount() - a.size();
    }

    public double getDouble(int i)
    {
        return b.getDouble(i);
    }

    public float getFloat(int i)
    {
        return b.getFloat(i);
    }

    public int getInt(int i)
    {
        return b.getInt(i);
    }

    public long getLong(int i)
    {
        return b.getLong(i);
    }

    public short getShort(int i)
    {
        return b.getShort(i);
    }

    public String getString(int i)
    {
        return b.getString(i);
    }

    public boolean isNull(int i)
    {
        return b.isNull(i);
    }

    public boolean onMove(int i, int j)
    {
        b.moveToPosition(a(j));
        return true;
    }

    public void registerContentObserver(ContentObserver contentobserver)
    {
        b.registerContentObserver(contentobserver);
    }

    public void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        b.registerDataSetObserver(datasetobserver);
    }

    public void unregisterContentObserver(ContentObserver contentobserver)
    {
        b.unregisterContentObserver(contentobserver);
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        b.unregisterDataSetObserver(datasetobserver);
    }
}
