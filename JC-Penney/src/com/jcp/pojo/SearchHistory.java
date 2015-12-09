// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.pojo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.jcp.helper.x;
import com.jcp.util.ae;
import java.util.ArrayList;
import java.util.List;

public final class SearchHistory
{

    private static final String TAG = com/jcp/pojo/SearchHistory.getSimpleName();
    private static SearchHistory instance;
    private String clearSearchHistoryString;
    private SQLiteDatabase database;
    private x dbHelper;

    private SearchHistory(Context context)
    {
        dbHelper = new x(context);
        clearSearchHistoryString = context.getString(0x7f0700f5);
    }

    private void close()
    {
        dbHelper.close();
    }

    public static SearchHistory getInstance(Context context)
    {
        if (instance == null)
        {
            instance = new SearchHistory(context);
        }
        return instance;
    }

    private void open()
    {
        database = dbHelper.getWritableDatabase();
    }

    public void addToSearchHistory(String s)
    {
        open();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("SearchItem", s);
        database.insertOrThrow("SearchHistroy", null, contentvalues);
        close();
        return;
        s;
        ae.a(TAG, "SQLException occurred while inserting a row to corresponding table : ", s);
        close();
        return;
        s;
        close();
        throw s;
    }

    public void clearSearchHistory()
    {
        open();
        database.delete("SearchHistroy", null, null);
        close();
        return;
        Exception exception;
        exception;
        close();
        throw exception;
    }

    public List getSearchHistory()
    {
        Object obj;
        Cursor cursor;
        open();
        obj = new ArrayList();
        cursor = database.rawQuery("select SearchItem from SearchHistroy", null);
        cursor.moveToFirst();
        for (; !cursor.isAfterLast(); cursor.moveToNext())
        {
            ((List) (obj)).add(cursor.getString(cursor.getColumnIndex("SearchItem")));
        }

        break MISSING_BLOCK_LABEL_77;
        obj;
        close();
        throw obj;
        cursor.close();
        if (!((List) (obj)).isEmpty())
        {
            ((List) (obj)).add(clearSearchHistoryString);
        }
        close();
        return ((List) (obj));
    }

}
