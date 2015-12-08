// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.utils;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package org.xbmc.kore.utils:
//            LogUtils

public class SelectionBuilder
{

    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/utils/SelectionBuilder);
    private Map mProjectionMap;
    private StringBuilder mSelection;
    private ArrayList mSelectionArgs;
    private String mTable;

    public SelectionBuilder()
    {
        mTable = null;
        mProjectionMap = new HashMap();
        mSelection = new StringBuilder();
        mSelectionArgs = new ArrayList();
    }

    private void assertTable()
    {
        if (mTable == null)
        {
            throw new IllegalStateException("Table not specified");
        } else
        {
            return;
        }
    }

    private void mapColumns(String as[])
    {
        for (int i = 0; i < as.length; i++)
        {
            String s = (String)mProjectionMap.get(as[i]);
            if (s != null)
            {
                as[i] = s;
            }
        }

    }

    public int delete(SQLiteDatabase sqlitedatabase)
    {
        assertTable();
        return sqlitedatabase.delete(mTable, getSelection(), getSelectionArgs());
    }

    public String getSelection()
    {
        return mSelection.toString();
    }

    public String[] getSelectionArgs()
    {
        return (String[])mSelectionArgs.toArray(new String[mSelectionArgs.size()]);
    }

    public SelectionBuilder mapToTable(String s, String s1)
    {
        mProjectionMap.put(s, (new StringBuilder()).append(s1).append(".").append(s).toString());
        return this;
    }

    public Cursor query(SQLiteDatabase sqlitedatabase, String as[], String s)
    {
        return query(sqlitedatabase, as, null, null, s, null);
    }

    public Cursor query(SQLiteDatabase sqlitedatabase, String as[], String s, String s1, String s2, String s3)
    {
        assertTable();
        if (as != null)
        {
            mapColumns(as);
        }
        return sqlitedatabase.query(mTable, as, getSelection(), getSelectionArgs(), s, s1, s2, s3);
    }

    public SelectionBuilder table(String s)
    {
        mTable = s;
        return this;
    }

    public String toString()
    {
        return (new StringBuilder()).append("SelectionBuilder[table=").append(mTable).append(", selection=").append(getSelection()).append(", selectionArgs=").append(Arrays.toString(getSelectionArgs())).append("]").toString();
    }

    public int update(SQLiteDatabase sqlitedatabase, ContentValues contentvalues)
    {
        assertTable();
        return sqlitedatabase.update(mTable, contentvalues, getSelection(), getSelectionArgs());
    }

    public transient SelectionBuilder where(String s, String as[])
    {
        if (TextUtils.isEmpty(s))
        {
            if (as != null && as.length > 0)
            {
                throw new IllegalArgumentException("Valid selection required when including arguments=");
            }
        } else
        {
            if (mSelection.length() > 0)
            {
                mSelection.append(" AND ");
            }
            mSelection.append("(").append(s).append(")");
            if (as != null)
            {
                Collections.addAll(mSelectionArgs, as);
            }
        }
        return this;
    }

}
