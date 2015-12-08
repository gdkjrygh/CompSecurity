// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.activerecorbase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

// Referenced classes of package com.hmobile.activerecorbase:
//            ActiveRecordException, DatabaseBuilder

class DatabaseOpenHelper extends SQLiteOpenHelper
{

    DatabaseBuilder _builder;
    int _version;

    public DatabaseOpenHelper(Context context, String s, int i, DatabaseBuilder databasebuilder)
    {
        super(context, s, null, i);
        _builder = databasebuilder;
        _version = i;
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        String as[];
        int i;
        int j;
        as = _builder.getTables();
        j = as.length;
        i = 0;
_L2:
        String s;
        String s1;
        if (i >= j)
        {
            sqlitedatabase.setVersion(_version);
            return;
        }
        s1 = as[i];
        s = null;
        s1 = _builder.getSQLCreate(s1);
        s = s1;
_L3:
        if (s != null)
        {
            sqlitedatabase.execSQL(s);
        }
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        ActiveRecordException activerecordexception;
        activerecordexception;
        Log.e(getClass().getName(), activerecordexception.getMessage(), activerecordexception);
          goto _L3
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        String as[] = _builder.getTables();
        j = as.length;
        i = 0;
        do
        {
            if (i >= j)
            {
                onCreate(sqlitedatabase);
                return;
            }
            String s = as[i];
            sqlitedatabase.execSQL(_builder.getSQLDrop(s));
            i++;
        } while (true);
    }
}
