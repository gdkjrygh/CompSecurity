// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tjeannin.provigen;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.tjeannin.provigen.helper.TableBuilder;
import com.tjeannin.provigen.helper.TableUpdater;

public class ProviGenOpenHelper extends SQLiteOpenHelper
{

    private final Class contracts[];

    public ProviGenOpenHelper(Context context, String s, android.database.sqlite.SQLiteDatabase.CursorFactory cursorfactory, int i, Class aclass[])
    {
        super(context, s, cursorfactory, i);
        contracts = aclass;
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        Class aclass[] = contracts;
        int j = aclass.length;
        for (int i = 0; i < j; i++)
        {
            (new TableBuilder(aclass[i])).createTable(sqlitedatabase);
        }

    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        if (j > i)
        {
            Class aclass[] = contracts;
            int l = aclass.length;
            for (int k = 0; k < l; k++)
            {
                TableUpdater.addMissingColumns(sqlitedatabase, aclass[k]);
            }

        }
        if (i == 1 && j > 1)
        {
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("neverSetSeen", Integer.valueOf(1));
            contentvalues.put("omitDate", Integer.valueOf(1));
            sqlitedatabase.update("inbox_messages", contentvalues, "dismissOnClick = 1", null);
        }
    }
}
