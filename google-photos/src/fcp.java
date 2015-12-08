// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.sqlite.SQLiteDatabase;

public final class fcp
    implements mvi
{

    public fcp()
    {
    }

    public final String a()
    {
        return "device_mgmt";
    }

    public final void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL(fbp.a());
    }

    public final boolean a(SQLiteDatabase sqlitedatabase, int i, int j, int k)
    {
        if (j < 2)
        {
            sqlitedatabase.execSQL("ALTER TABLE device_mgmt_batch ADD COLUMN is_dismissed INTEGER DEFAULT 0");
        }
        if (j < 3)
        {
            sqlitedatabase.execSQL("DELETE FROM device_mgmt_batch");
            sqlitedatabase.execSQL("ALTER TABLE device_mgmt_batch ADD COLUMN type INTEGER NOT NULL");
            sqlitedatabase.execSQL("ALTER TABLE device_mgmt_batch ADD COLUMN width INTEGER");
            sqlitedatabase.execSQL("ALTER TABLE device_mgmt_batch ADD COLUMN height INTEGER");
        }
        if (j < 4)
        {
            sqlitedatabase.execSQL("DELETE FROM device_mgmt_batch");
            sqlitedatabase.execSQL("ALTER TABLE device_mgmt_batch ADD COLUMN path STRING NOT NULL");
        }
        if (j < 5)
        {
            sqlitedatabase.execSQL("ALTER TABLE device_mgmt_batch ADD COLUMN is_read INTEGER DEFAULT 0");
        }
        if (j < 7)
        {
            sqlitedatabase.execSQL("ALTER TABLE device_mgmt_batch ADD COLUMN has_original_bytes INTEGER DEFAULT 0");
            sqlitedatabase.execSQL("UPDATE device_mgmt_batch SET has_original_bytes=1");
        }
        return true;
    }

    public final void b(SQLiteDatabase sqlitedatabase)
    {
    }

    public final String[] b()
    {
        return (new String[] {
            "device_mgmt_batch"
        });
    }

    public final String[] c()
    {
        return new String[0];
    }

    public final int d()
    {
        return 7;
    }
}
