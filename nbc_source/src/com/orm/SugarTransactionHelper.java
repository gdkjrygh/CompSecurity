// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.orm;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

// Referenced classes of package com.orm:
//            SugarApp, Database

public class SugarTransactionHelper
{
    public static interface Callback
    {

        public abstract void manipulateInTransaction();
    }


    public SugarTransactionHelper()
    {
    }

    public static void doInTansaction(Callback callback)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = SugarApp.getSugarContext().getDatabase().getDB();
        sqlitedatabase.beginTransaction();
        Log.d(com/orm/SugarTransactionHelper.getSimpleName(), "callback executing within transaction");
        callback.manipulateInTransaction();
        sqlitedatabase.setTransactionSuccessful();
        Log.d(com/orm/SugarTransactionHelper.getSimpleName(), "callback successfully executed within transaction");
        sqlitedatabase.endTransaction();
        return;
        callback;
        Log.d(com/orm/SugarTransactionHelper.getSimpleName(), "could execute callback within transaction", callback);
        sqlitedatabase.endTransaction();
        return;
        callback;
        sqlitedatabase.endTransaction();
        throw callback;
    }
}
