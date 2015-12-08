// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.vtable;

import android.database.sqlite.SQLiteDatabase;
import com.snapchat.android.Timber;
import com.snapchat.android.discover.model.database.vtable.DSnapPageVirtualTable;
import com.snapchat.android.discover.model.database.vtable.PublisherAndEditionVirtualTable;
import tt;

public abstract class DbVirtualTable
{
    public static final class DatabaseVirtualTable extends Enum
    {

        private static final DatabaseVirtualTable $VALUES[];
        public static final DatabaseVirtualTable DSNAP_PAGE;
        public static final DatabaseVirtualTable PUBLISHER_AND_EDITION;
        private DbVirtualTable a;

        public static DatabaseVirtualTable valueOf(String s)
        {
            return (DatabaseVirtualTable)Enum.valueOf(com/snapchat/android/database/vtable/DbVirtualTable$DatabaseVirtualTable, s);
        }

        public static DatabaseVirtualTable[] values()
        {
            return (DatabaseVirtualTable[])$VALUES.clone();
        }

        public final DbVirtualTable getVirtualTable()
        {
            return a;
        }

        static 
        {
            PUBLISHER_AND_EDITION = new DatabaseVirtualTable("PUBLISHER_AND_EDITION", 0, PublisherAndEditionVirtualTable.d());
            DSNAP_PAGE = new DatabaseVirtualTable("DSNAP_PAGE", 1, DSnapPageVirtualTable.d());
            $VALUES = (new DatabaseVirtualTable[] {
                PUBLISHER_AND_EDITION, DSNAP_PAGE
            });
        }

        private DatabaseVirtualTable(String s, int i, DbVirtualTable dbvirtualtable)
        {
            super(s, i);
            a = dbvirtualtable;
        }
    }


    public DbVirtualTable()
    {
    }

    public static void a(SQLiteDatabase sqlitedatabase)
    {
        DatabaseVirtualTable adatabasevirtualtable[] = DatabaseVirtualTable.values();
        int j = adatabasevirtualtable.length;
        for (int i = 0; i < j; i++)
        {
            DatabaseVirtualTable databasevirtualtable = adatabasevirtualtable[i];
            Timber.c("DbVirtualTable", (new StringBuilder("Create virtual table ")).append(databasevirtualtable.getVirtualTable().a()).toString(), new Object[0]);
            sqlitedatabase.execSQL(databasevirtualtable.getVirtualTable().b());
        }

    }

    public abstract String a();

    public abstract String b();

    public abstract tt[] c();
}
