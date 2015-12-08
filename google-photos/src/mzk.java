// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.libraries.social.gallery3d.common.FileCache;
import java.io.File;

public final class mzk extends SQLiteOpenHelper
{

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        boolean flag = false;
        Object obj = com.google.android.libraries.social.gallery3d.common.FileCache.FileEntry.a;
        String s1 = ((mzi) (obj)).b;
        Object aobj[];
        StringBuilder stringbuilder;
        int k1;
        boolean flag1;
        if (s1 != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        mzl.a(flag1);
        stringbuilder = new StringBuilder("CREATE TABLE ");
        stringbuilder.append(s1);
        stringbuilder.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT");
        aobj = ((mzi) (obj)).c;
        k1 = aobj.length;
        for (int i = 0; i < k1; i++)
        {
            mzj mzj1 = aobj[i];
            if ("_id".equals(mzj1.a))
            {
                continue;
            }
            stringbuilder.append(',');
            stringbuilder.append(mzj1.a);
            stringbuilder.append(' ');
            stringbuilder.append(mzi.a[mzj1.b]);
            if (!mzj1.e)
            {
                stringbuilder.append(" NOT NULL");
            }
            if (!TextUtils.isEmpty(mzj1.f))
            {
                stringbuilder.append(" DEFAULT ");
                stringbuilder.append(mzj1.f);
            }
        }

        stringbuilder.append(");");
        sqlitedatabase.execSQL(stringbuilder.toString());
        stringbuilder.setLength(0);
        aobj = ((mzi) (obj)).c;
        k1 = aobj.length;
        for (int j = 0; j < k1; j++)
        {
            mzj mzj2 = aobj[j];
            if (mzj2.c)
            {
                stringbuilder.append("CREATE INDEX ");
                stringbuilder.append(s1);
                stringbuilder.append("_index_");
                stringbuilder.append(mzj2.a);
                stringbuilder.append(" ON ");
                stringbuilder.append(s1);
                stringbuilder.append(" (");
                stringbuilder.append(mzj2.a);
                stringbuilder.append(");");
                sqlitedatabase.execSQL(stringbuilder.toString());
                stringbuilder.setLength(0);
            }
        }

        if (((mzi) (obj)).d)
        {
            String s = String.valueOf(s1);
            Object obj1 = String.valueOf("_fulltext");
            mzj amzj1[];
            if (((String) (obj1)).length() != 0)
            {
                s = s.concat(((String) (obj1)));
            } else
            {
                s = new String(s);
            }
            stringbuilder.append("CREATE VIRTUAL TABLE ");
            stringbuilder.append(s);
            stringbuilder.append(" USING FTS3 (_id INTEGER PRIMARY KEY");
            amzj1 = ((mzi) (obj)).c;
            k1 = amzj1.length;
            for (int k = 0; k < k1; k++)
            {
                Object obj2 = amzj1[k];
                if (((mzj) (obj2)).d)
                {
                    obj2 = ((mzj) (obj2)).a;
                    stringbuilder.append(',');
                    stringbuilder.append(((String) (obj2)));
                    stringbuilder.append(" TEXT");
                }
            }

            stringbuilder.append(");");
            sqlitedatabase.execSQL(stringbuilder.toString());
            stringbuilder.setLength(0);
            amzj1 = new StringBuilder("INSERT OR REPLACE INTO ");
            amzj1.append(s);
            amzj1.append(" (_id");
            mzj amzj2[] = ((mzi) (obj)).c;
            k1 = amzj2.length;
            for (int l = 0; l < k1; l++)
            {
                mzj mzj4 = amzj2[l];
                if (mzj4.d)
                {
                    amzj1.append(',');
                    amzj1.append(mzj4.a);
                }
            }

            amzj1.append(") VALUES (new._id");
            mzj amzj[] = ((mzi) (obj)).c;
            k1 = amzj.length;
            for (int i1 = 0; i1 < k1; i1++)
            {
                mzj mzj3 = amzj[i1];
                if (mzj3.d)
                {
                    amzj1.append(",new.");
                    amzj1.append(mzj3.a);
                }
            }

            amzj1.append(");");
            amzj = amzj1.toString();
            stringbuilder.append("CREATE TRIGGER ");
            stringbuilder.append(s1);
            stringbuilder.append("_insert_trigger AFTER INSERT ON ");
            stringbuilder.append(s1);
            stringbuilder.append(" FOR EACH ROW BEGIN ");
            stringbuilder.append(amzj);
            stringbuilder.append("END;");
            sqlitedatabase.execSQL(stringbuilder.toString());
            stringbuilder.setLength(0);
            stringbuilder.append("CREATE TRIGGER ");
            stringbuilder.append(s1);
            stringbuilder.append("_update_trigger AFTER UPDATE ON ");
            stringbuilder.append(s1);
            stringbuilder.append(" FOR EACH ROW BEGIN ");
            stringbuilder.append(amzj);
            stringbuilder.append("END;");
            sqlitedatabase.execSQL(stringbuilder.toString());
            stringbuilder.setLength(0);
            stringbuilder.append("CREATE TRIGGER ");
            stringbuilder.append(s1);
            stringbuilder.append("_delete_trigger AFTER DELETE ON ");
            stringbuilder.append(s1);
            stringbuilder.append(" FOR EACH ROW BEGIN DELETE FROM ");
            stringbuilder.append(s);
            stringbuilder.append(" WHERE _id = old._id; END;");
            sqlitedatabase.execSQL(stringbuilder.toString());
            stringbuilder.setLength(0);
        }
        s = FileCache.a(null).listFiles();
        k1 = s.length;
        int j1 = ((flag) ? 1 : 0);
        while (j1 < k1) 
        {
            sqlitedatabase = s[j1];
            if (!sqlitedatabase.delete())
            {
                sqlitedatabase = String.valueOf(sqlitedatabase.getAbsolutePath());
                if (sqlitedatabase.length() != 0)
                {
                    sqlitedatabase = "fail to remove: ".concat(sqlitedatabase);
                } else
                {
                    sqlitedatabase = new String("fail to remove: ");
                }
                Log.w("FileCache", sqlitedatabase);
            }
            j1++;
        }
    }

    public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        mzi mzi1 = com.google.android.libraries.social.gallery3d.common.FileCache.FileEntry.a;
        String s = mzi1.b;
        StringBuilder stringbuilder = new StringBuilder("DROP TABLE IF EXISTS ");
        stringbuilder.append(s);
        stringbuilder.append(';');
        sqlitedatabase.execSQL(stringbuilder.toString());
        stringbuilder.setLength(0);
        if (mzi1.d)
        {
            stringbuilder.append("DROP TABLE IF EXISTS ");
            stringbuilder.append(s);
            stringbuilder.append("_fulltext");
            stringbuilder.append(';');
            sqlitedatabase.execSQL(stringbuilder.toString());
        }
        onCreate(sqlitedatabase);
    }
}
