// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.datastore;

import android.app.Application;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.apps.wallet.logging.WLog;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.datastore:
//            SchemaMigration

public class WalletDatabaseHelper extends SQLiteOpenHelper
{

    private static final String TAG = com/google/android/apps/wallet/datastore/WalletDatabaseHelper.getSimpleName();
    private final Application application;
    private final int databaseVersion;
    private final List migrations;

    public WalletDatabaseHelper(Application application1, String s, int i, List list)
    {
        super(application1, s, null, i);
        application = application1;
        databaseVersion = i;
        migrations = list;
    }

    private static void enableSecureDelete(SQLiteDatabase sqlitedatabase)
    {
        Object obj;
        if (sqlitedatabase.isReadOnly())
        {
            break MISSING_BLOCK_LABEL_91;
        }
        obj = sqlitedatabase.rawQuery("PRAGMA secure_delete = ON;", null);
        boolean flag = false;
_L1:
        if (!((Cursor) (obj)).moveToNext())
        {
            break MISSING_BLOCK_LABEL_98;
        }
        if (((Cursor) (obj)).getInt(0) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        WLog.d(TAG, (new StringBuilder(39)).append("Value of secure_delete pragma is: ").append(flag).toString());
          goto _L1
        sqlitedatabase;
        try
        {
            ((Cursor) (obj)).close();
            throw sqlitedatabase;
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            WLog.w(TAG, "Error enabling secure delete", sqlitedatabase);
        }
        return;
        ((Cursor) (obj)).close();
        obj = "delete";
        if (!flag)
        {
            obj = "memory";
        }
        sqlitedatabase = sqlitedatabase.rawQuery((new StringBuilder(String.valueOf(obj).length() + 25)).append("PRAGMA journal_mode = '").append(((String) (obj))).append("';").toString(), null);
        while (sqlitedatabase.moveToNext()) 
        {
            String s = TAG;
            String s1 = String.valueOf(sqlitedatabase.getString(0));
            WLog.d(s, (new StringBuilder(String.valueOf(obj).length() + 38 + String.valueOf(s1).length())).append("Setting journal mode to ").append(((String) (obj))).append(" with result: ").append(s1).toString());
        }
        break MISSING_BLOCK_LABEL_241;
        Exception exception;
        exception;
        sqlitedatabase.close();
        throw exception;
        sqlitedatabase.close();
        return;
    }

    private static void shredDatabase(File file)
    {
        WLog.d(TAG, "overwriting file with 0s");
        byte abyte0[];
        long l2;
        file = new RandomAccessFile(file, "rw");
        long l = file.length();
        abyte0 = new byte[1024];
        l2 = l / 1024L;
        long l1 = 0L;
_L2:
        if (l1 >= l2 + 1L)
        {
            break; /* Loop/switch isn't completed */
        }
        file.write(abyte0);
        l1++;
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            file.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            WLog.d(TAG, "Error opening database file");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            WLog.d(TAG, "Error writing to database file");
        }
        return;
    }

    public final void delete()
    {
        this;
        JVM INSTR monitorenter ;
        if (getWritableDatabase() != null)
        {
            close();
            File file = application.getDatabasePath(getDatabaseName());
            if (file.length() > 0L)
            {
                shredDatabase(file);
            }
            if (!application.deleteDatabase(getDatabaseName()))
            {
                WLog.e(TAG, "Could not delete database files");
            }
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        enableSecureDelete(sqlitedatabase);
        Iterator iterator = migrations.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            SchemaMigration schemamigration = (SchemaMigration)iterator.next();
            if (schemamigration.getNewDbVersion() <= databaseVersion)
            {
                schemamigration.upgrade(sqlitedatabase);
            }
        } while (true);
    }

    public void onOpen(SQLiteDatabase sqlitedatabase)
    {
        enableSecureDelete(sqlitedatabase);
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        WLog.d(TAG, (new StringBuilder(60)).append("Upgrading db from version ").append(i).append(" to version ").append(j).toString());
        Iterator iterator = migrations.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            SchemaMigration schemamigration = (SchemaMigration)iterator.next();
            int k = schemamigration.getNewDbVersion();
            if (k <= i)
            {
                continue;
            }
            if (k > j)
            {
                break;
            }
            String s = TAG;
            String s1 = String.valueOf(schemamigration);
            WLog.d(s, (new StringBuilder(String.valueOf(s1).length() + 20)).append("Upgrading to Schema ").append(s1).toString());
            schemamigration.upgrade(sqlitedatabase);
        } while (true);
    }

}
