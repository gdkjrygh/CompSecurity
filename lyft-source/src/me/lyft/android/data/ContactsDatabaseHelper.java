// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ContactsDatabaseHelper extends SQLiteOpenHelper
{

    private static final String DATABASE_NAME = "lyft_contacts.db";
    private static final int DATABASE_VERSION = 1;

    public ContactsDatabaseHelper(Context context)
    {
        super(context, "lyft_contacts.db", null, 1);
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE Contacts ( _id integer primary key autoincrement, name varchar default '', phone varchar default '', times_splitted integer default 0, last_time_splitted integer default 0)");
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        i;
        JVM INSTR tableswitch 1 2: default 24
    //                   1 25
    //                   2 30;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (j <= 1)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        if (j <= 2)
        {
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
