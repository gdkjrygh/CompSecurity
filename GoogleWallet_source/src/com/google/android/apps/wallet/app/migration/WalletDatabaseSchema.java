// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.app.migration;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.apps.wallet.datastore.Column;
import com.google.android.apps.wallet.datastore.Table;
import java.util.Iterator;
import java.util.List;

public final class WalletDatabaseSchema
{

    public static final String addColumnToTable(Table table, Column column, String s, String s1)
    {
        return (new StringBuilder("ALTER TABLE ")).append(table.getTableName()).append(" ADD COLUMN ").append(column.getColumnName()).append(" ").append(s).append(" DEFAULT ").append(s1).append(";").toString();
    }

    private static String createIndex(String s, String s1)
    {
        String s2 = (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append("_").append(s1).toString();
        return (new StringBuilder(String.valueOf(s2).length() + 21 + String.valueOf(s).length() + String.valueOf(s1).length())).append("CREATE INDEX ").append(s2).append(" on ").append(s).append(" (").append(s1).append(");").toString();
    }

    public static void createTable(SQLiteDatabase sqlitedatabase, Table table)
    {
        Object obj = (new StringBuilder("CREATE TABLE IF NOT EXISTS ")).append(table.getTableName()).append(" (").append(table.getPrimaryKeyColumn().getColumnName()).append(" ");
        table.appendPrimaryKeyDeclaration(((StringBuilder) (obj)));
        List list = table.getColumns();
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Column column1 = (Column)iterator.next();
            ((StringBuilder) (obj)).append(", ").append(column1.getColumnName()).append(' ').append(column1.getColumnType());
            if (column1.getDefaultValue() != null)
            {
                ((StringBuilder) (obj)).append(" DEFAULT ").append(column1.getDefaultValue());
            }
        } while (true);
        ((StringBuilder) (obj)).append(");");
        sqlitedatabase.execSQL(((StringBuilder) (obj)).toString());
        obj = list.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Column column = (Column)((Iterator) (obj)).next();
            if (column.isIndexed())
            {
                sqlitedatabase.execSQL(createIndex(table.getTableName(), column.getColumnName()));
            }
        } while (true);
    }

    public static final String dropTableSql(String s)
    {
        return (new StringBuilder("DROP TABLE IF EXISTS ")).append(s).append(";").toString();
    }

    public static boolean tableHasColumn(SQLiteDatabase sqlitedatabase, Table table, Column column)
    {
        sqlitedatabase = sqlitedatabase.query(table.getTableName(), null, null, null, null, null, null).getColumnNames();
        int j = sqlitedatabase.length;
        for (int i = 0; i < j; i++)
        {
            table = sqlitedatabase[i];
            if (column.getColumnName().equalsIgnoreCase(table))
            {
                return true;
            }
        }

        return false;
    }
}
