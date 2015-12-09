// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.app.migration;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.apps.wallet.app.filenames.Filenames;
import java.io.File;

public class WalletDatabaseChecker
{

    private final Application application;

    WalletDatabaseChecker(Application application1)
    {
        application = application1;
    }

    public final void checkDatabase(String s)
    {
        Object obj = application.getDatabasePath(Filenames.getWalletDatabaseName(s)).getPath();
        if ((new File(((String) (obj)))).exists()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        SQLiteDatabase sqlitedatabase;
        SQLiteDatabase sqlitedatabase1;
        sqlitedatabase1 = null;
        sqlitedatabase = null;
        obj = SQLiteDatabase.openDatabase(((String) (obj)), null, 1);
        sqlitedatabase = ((SQLiteDatabase) (obj));
        sqlitedatabase1 = ((SQLiteDatabase) (obj));
        int i = ((SQLiteDatabase) (obj)).getVersion();
        if (i >= 35)
        {
            if (obj != null)
            {
                ((SQLiteDatabase) (obj)).close();
                return;
            }
        } else
        {
            if (obj != null)
            {
                ((SQLiteDatabase) (obj)).close();
            }
            deleteUserFiles(s);
            return;
        }
          goto _L1
        s;
        if (sqlitedatabase == null) goto _L1; else goto _L3
_L3:
        sqlitedatabase.close();
        return;
        s;
        if (sqlitedatabase1 != null)
        {
            sqlitedatabase1.close();
        }
        throw s;
    }

    public final void deleteUserFiles(String s)
    {
        Filenames.getSharedPrefsFile(application, s).delete();
        application.deleteDatabase(Filenames.getWalletDatabaseName(s));
        application.deleteDatabase(Filenames.getHceDatabaseName(s));
    }
}
