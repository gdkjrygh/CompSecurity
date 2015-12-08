// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.provider;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.provider:
//            PlayGamesContentProvider, GamesDataStore, GamesDatabaseHelper

private class mAssociatedQueries
{

    private final ssociatedQuery mAssociatedQueries[];
    private final String mColumnId;
    private final String mImageColumns[];
    private final HashMap mTableAndForeignKeyPairs;
    private final String mTableName;
    final PlayGamesContentProvider this$0;

    public int delete(GamesDataStore gamesdatastore, long l)
    {
        SQLiteDatabase sqlitedatabase;
        String as[];
        int i;
        int j;
        sqlitedatabase = gamesdatastore.mDatabaseHelper.getWritableDatabase();
        if (mImageColumns != null && !PlayGamesContentProvider.access$500(PlayGamesContentProvider.this, gamesdatastore, mTableName, l, mImageColumns))
        {
            return 0;
        }
        as = new String[1];
        as[0] = String.valueOf(l);
        if (mAssociatedQueries == null)
        {
            break MISSING_BLOCK_LABEL_248;
        }
        i = 0;
        j = mAssociatedQueries.length;
_L5:
        if (i >= j) goto _L2; else goto _L1
_L1:
        ssociatedQuery ssociatedquery;
        Object obj;
        ssociatedquery = mAssociatedQueries[i];
        obj = ssociatedquery.readTable;
        String s1 = ssociatedquery.readColumn;
        String s2 = (new StringBuilder()).append(ssociatedquery.readSelection).append("=?").toString();
        obj = sqlitedatabase.query(((String) (obj)), new String[] {
            s1
        }, s2, as, null, null, null);
_L4:
        if (!((Cursor) (obj)).moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        if (ssociatedquery.deleter == null)
        {
            sqlitedatabase.delete(ssociatedquery.deleteTable, ssociatedquery.deleteSelection, new String[] {
                ((Cursor) (obj)).getString(0)
            });
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_211;
        gamesdatastore;
        ((Cursor) (obj)).close();
        throw gamesdatastore;
        ssociatedquery.deleter.delete(gamesdatastore, ((Cursor) (obj)).getLong(0));
        if (true) goto _L4; else goto _L3
_L3:
        ((Cursor) (obj)).close();
        i++;
          goto _L5
_L2:
        if (mTableAndForeignKeyPairs != null)
        {
            String s;
            for (gamesdatastore = mTableAndForeignKeyPairs.keySet().iterator(); gamesdatastore.hasNext(); sqlitedatabase.delete(s, (new StringBuilder()).append((String)mTableAndForeignKeyPairs.get(s)).append("=?").toString(), as))
            {
                s = (String)gamesdatastore.next();
            }

        }
        return sqlitedatabase.delete(mTableName, (new StringBuilder()).append(mColumnId).append("=?").toString(), as);
    }

    ssociatedQuery(String s, String s1)
    {
        this(s, s1, null, null, null);
    }

    ssociatedQuery(String s, String s1, String as[])
    {
        this(s, s1, as, null, null);
    }

    ssociatedQuery(String s, String s1, String as[], ssociatedQuery associatedquery[], HashMap hashmap)
    {
        this$0 = PlayGamesContentProvider.this;
        super();
        mColumnId = s1;
        mTableName = s;
        mImageColumns = as;
        mTableAndForeignKeyPairs = hashmap;
        mAssociatedQueries = associatedquery;
    }
}
