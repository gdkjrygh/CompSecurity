// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market.data;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import java.io.Serializable;
import org.json.JSONObject;

public class PackageStatInfo
    implements Serializable
{

    public static final int VERSION = 2;
    private static final long serialVersionUID = 0x62740ae8067fa107L;
    private boolean mIsExpended;
    private String mPackageName;
    private int mVersionCode;

    public PackageStatInfo(String s)
    {
        mPackageName = null;
        mVersionCode = 0;
        mIsExpended = false;
        mPackageName = s;
    }

    public static void createTable(SQLiteDatabase sqlitedatabase, String s)
    {
        sqlitedatabase.execSQL((new StringBuilder("CREATE TABLE IF NOT EXISTS ")).append(s).append("(_id INTEGER PRIMARY KEY,pkg_name TEXT,version_code INTEGER);").toString());
    }

    public static PackageStatInfo fromJSONObject(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        String s1;
        String s = jsonobject.getString("pkg_name");
        s1 = jsonobject.getString("version_code");
        jsonobject = new PackageStatInfo(s);
        jsonobject.setVersionCode(Integer.valueOf(s1).intValue());
        return jsonobject;
        Exception exception;
        exception;
        jsonobject = null;
_L2:
        exception.printStackTrace();
        return jsonobject;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
        return null;
    }

    public String getPackageName()
    {
        return mPackageName;
    }

    public int getVersionCode()
    {
        return mVersionCode;
    }

    public boolean isExpended()
    {
        return mIsExpended;
    }

    public void setExpended(boolean flag)
    {
        mIsExpended = flag;
    }

    public void setVersionCode(int i)
    {
        mVersionCode = i;
    }

    public ContentValues toContentValues()
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("pkg_name", getPackageName());
        contentvalues.put("version_code", Integer.valueOf(getVersionCode()));
        return contentvalues;
    }

    public String toString()
    {
        return String.format("%s : %d", new Object[] {
            getPackageName(), Integer.valueOf(getVersionCode())
        });
    }
}
