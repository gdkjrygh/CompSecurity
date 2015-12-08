// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.model.database.table;

import Br;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.database.DataType;
import com.snapchat.android.database.DatabaseHelper;
import com.snapchat.android.database.table.DbTable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apache.http.util.TextUtils;
import tA;
import tt;
import vA;
import vJ;

public final class EditionViewStateTable extends DbTable
{
    public static final class EditionViewStateSchema extends Enum
        implements tt
    {

        private static final EditionViewStateSchema $VALUES[];
        public static final EditionViewStateSchema ID;
        public static final EditionViewStateSchema LAST_ID_VIEWED;
        public static final EditionViewStateSchema VIEWED_ALL_DSNAPS;
        private String a;
        private DataType b;
        private String c;

        static String a(EditionViewStateSchema editionviewstateschema)
        {
            return editionviewstateschema.a;
        }

        static DataType b(EditionViewStateSchema editionviewstateschema)
        {
            return editionviewstateschema.b;
        }

        public static EditionViewStateSchema valueOf(String s)
        {
            return (EditionViewStateSchema)Enum.valueOf(com/snapchat/android/discover/model/database/table/EditionViewStateTable$EditionViewStateSchema, s);
        }

        public static EditionViewStateSchema[] values()
        {
            return (EditionViewStateSchema[])$VALUES.clone();
        }

        public final String getColumnName()
        {
            return a;
        }

        public final int getColumnNumber()
        {
            return ordinal();
        }

        public final String getConstraints()
        {
            return c;
        }

        public final DataType getDataType()
        {
            return b;
        }

        static 
        {
            ID = new EditionViewStateSchema("ID", "_id", DataType.TEXT, "PRIMARY KEY");
            LAST_ID_VIEWED = new EditionViewStateSchema("LAST_ID_VIEWED", 1, "last_id_viewed", DataType.TEXT);
            VIEWED_ALL_DSNAPS = new EditionViewStateSchema("VIEWED_ALL_DSNAPS", 2, "viewed_all_dsnaps", DataType.BOOLEAN);
            $VALUES = (new EditionViewStateSchema[] {
                ID, LAST_ID_VIEWED, VIEWED_ALL_DSNAPS
            });
        }

        private EditionViewStateSchema(String s, int i, String s1, DataType datatype)
        {
            super(s, i);
            a = s1;
            b = datatype;
        }

        private EditionViewStateSchema(String s, String s1, DataType datatype, String s2)
        {
            this(s, 0, s1, datatype);
            c = s2;
        }
    }


    private static String b[];
    private static HashMap c;
    private static final EditionViewStateTable d = new EditionViewStateTable();
    public final vA a;

    protected EditionViewStateTable()
    {
        this(vA.a());
    }

    private EditionViewStateTable(vA va)
    {
        a = va;
    }

    public static ContentValues a(vA.c c1)
    {
        return (new tA()).a(EditionViewStateSchema.ID, c1.a).a(EditionViewStateSchema.LAST_ID_VIEWED, c1.b).a(EditionViewStateSchema.VIEWED_ALL_DSNAPS, c1.c).a;
    }

    public static EditionViewStateTable a()
    {
        return d;
    }

    private static List a(SQLiteDatabase sqlitedatabase)
    {
        ArrayList arraylist;
        arraylist = new ArrayList();
        sqlitedatabase = sqlitedatabase.query("EditionViewState", b, null, null, null, null, null);
        if (sqlitedatabase == null) goto _L2; else goto _L1
_L1:
        if (!sqlitedatabase.moveToFirst()) goto _L2; else goto _L3
_L3:
        String s;
        String s1;
        s = sqlitedatabase.getString(EditionViewStateSchema.ID.getColumnNumber());
        s1 = sqlitedatabase.getString(EditionViewStateSchema.LAST_ID_VIEWED.getColumnNumber());
        vA.c.a a1;
        boolean flag;
        if (sqlitedatabase.getInt(EditionViewStateSchema.VIEWED_ALL_DSNAPS.getColumnNumber()) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a1 = new vA.c.a();
        a1.a = s;
        a1.b = s1;
        a1.c = flag;
        arraylist.add(a1.a());
        flag = sqlitedatabase.moveToNext();
        if (flag) goto _L3; else goto _L2
_L2:
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        return arraylist;
        Exception exception;
        exception;
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        throw exception;
    }

    protected final volatile ContentValues a(Object obj)
    {
        return a((vA.c)obj);
    }

    protected final Collection a(Br br)
    {
        return null;
    }

    public final void b(Br br)
    {
        br = DatabaseHelper.a(SnapchatApplication.get()).getReadableDatabase();
        Timber.c("EditionViewStateTable", "populateUserObjectFromTable - beginTransaction", new Object[0]);
        br.beginTransaction();
        Object obj;
        Object obj1 = a(br);
        obj = a;
        vA.c c1;
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((vA) (obj)).a(c1.a, c1.c))
        {
            c1 = (vA.c)((Iterator) (obj1)).next();
            ((vA) (obj)).a(c1.a, c1.b);
        }

        break MISSING_BLOCK_LABEL_111;
        obj;
        br.endTransaction();
        Timber.c("EditionViewStateTable", "populateUserObjectFromTable - endTransaction", new Object[0]);
        throw obj;
        ((vA) (obj)).a.b();
        br.endTransaction();
        Timber.c("EditionViewStateTable", "populateUserObjectFromTable - endTransaction", new Object[0]);
        return;
    }

    public final tt[] b()
    {
        return EditionViewStateSchema.values();
    }

    public final String c()
    {
        return "EditionViewState";
    }

    public final void c(Br br)
    {
    }

    public final String d()
    {
        StringBuilder stringbuilder = new StringBuilder();
        EditionViewStateSchema aeditionviewstateschema[] = EditionViewStateSchema.values();
        int j = aeditionviewstateschema.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = aeditionviewstateschema[i];
            if (i > 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append((new StringBuilder()).append(EditionViewStateSchema.a(((EditionViewStateSchema) (obj)))).append(" ").append(EditionViewStateSchema.b(((EditionViewStateSchema) (obj))).toString()).toString());
            obj = ((EditionViewStateSchema) (obj)).getConstraints();
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                stringbuilder.append(" ");
                stringbuilder.append(((String) (obj)));
            }
        }

        return stringbuilder.toString();
    }

    static 
    {
        EditionViewStateSchema aeditionviewstateschema[] = EditionViewStateSchema.values();
        int j = aeditionviewstateschema.length;
        b = new String[j];
        c = new HashMap(j);
        for (int i = 0; i < j; i++)
        {
            EditionViewStateSchema editionviewstateschema = aeditionviewstateschema[i];
            b[i] = aeditionviewstateschema[i].getColumnName();
            c.put(editionviewstateschema.getColumnName(), editionviewstateschema.getColumnName());
        }

    }
}
