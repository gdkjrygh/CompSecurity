// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.urbanairship.Logger;

// Referenced classes of package com.urbanairship.util:
//            DataManager

class ry extends SQLiteOpenHelper
{

    final DataManager this$0;
    final String val$name;

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        DataManager.this.onCreate(sqlitedatabase);
    }

    public void onDowngrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        Logger.info((new StringBuilder()).append("Downgrading database ").append(val$name).append(" from version ").append(i).append(" to ").append(j).toString());
        DataManager.this.onDowngrade(sqlitedatabase, i, j);
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        Logger.info((new StringBuilder()).append("Upgrading database ").append(val$name).append(" from version ").append(i).append(" to ").append(j).toString());
        DataManager.this.onUpgrade(sqlitedatabase, i, j);
    }

    ry(String s, android.database.sqlite..CursorFactory cursorfactory, int i, String s1)
    {
        this$0 = final_datamanager;
        val$name = s1;
        super(Context.this, s, cursorfactory, i);
    }
}
