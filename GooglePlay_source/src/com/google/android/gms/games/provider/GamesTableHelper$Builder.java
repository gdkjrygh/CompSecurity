// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.provider;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.provider:
//            GamesTableHelper

public static final class mTable
{

    final ArrayList mColumnNames = new ArrayList();
    final ArrayList mColumnStatements = new ArrayList();
    final ArrayList mIndexStatements = new ArrayList();
    private boolean mPrimaryKeyDefined;
    final String mTable;

    static String generateIndexName(String s, String s1)
    {
        return String.format("%s_%s_index", new Object[] {
            s, s1.replace(",", "_")
        });
    }

    final void appendToLastColumn(String s)
    {
        int i = mColumnStatements.size() - 1;
        mColumnStatements.set(i, (new StringBuilder()).append((String)mColumnStatements.get(i)).append(" ").append(s).toString());
    }

    public final GamesTableHelper build()
    {
        return new GamesTableHelper(this);
    }

    final mColumnStatements col(String s, mColumnStatements mcolumnstatements)
    {
        mColumnNames.add(s);
        mColumnStatements.add((new StringBuilder()).append(s).append(" ").append(mcolumnstatements.iteDataType()).toString());
        return this;
    }

    final iteDataType defaultValue(int i)
    {
        int j = mColumnStatements.size() - 1;
        if (!((String)mColumnStatements.get(j)).contains(ER.iteDataType()))
        {
            throw new RuntimeException((new StringBuilder("Attempting to add an integer default value to a non-integer column: ")).append((String)mColumnNames.get(j)).toString());
        } else
        {
            appendToLastColumn((new StringBuilder("DEFAULT ")).append(i).toString());
            return this;
        }
    }

    final appendToLastColumn defaultValue(String s)
    {
        boolean flag;
        if (!s.contains("'"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        appendToLastColumn((new StringBuilder("DEFAULT '")).append(s).append("'").toString());
        return this;
    }

    final appendToLastColumn index(String s)
    {
        mIndexStatements.add(String.format("CREATE INDEX %s ON %s (%s);", new Object[] {
            generateIndexName(mTable, s), mTable, s
        }));
        return this;
    }

    final mTable notNull()
    {
        appendToLastColumn("NOT NULL");
        return this;
    }

    final appendToLastColumn primaryKey(String s)
    {
        boolean flag;
        if (!mPrimaryKeyDefined)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        mPrimaryKeyDefined = true;
        col(s, ER);
        appendToLastColumn("PRIMARY KEY AUTOINCREMENT");
        return this;
    }

    final appendToLastColumn refCol(String s)
    {
        appendToLastColumn(String.format("REFERENCES %s (%s)", new Object[] {
            s, "_id"
        }));
        return this;
    }

    public (String s)
    {
        mTable = s;
    }
}
