// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.model.database.table;

import Br;
import UX;
import Vb;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.snapchat.android.database.DataType;
import com.snapchat.android.database.table.DbTable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tA;
import tt;

// Referenced classes of package com.snapchat.android.discover.model.database.table:
//            DSnapItemTable

public final class DSnapTable extends DbTable
{
    public static final class DSnapSchema extends Enum
        implements tt
    {

        private static final DSnapSchema $VALUES[];
        public static final DSnapSchema HASH;
        public static final DSnapSchema SHAREABLE;
        public static final DSnapSchema TYPE;
        private String a;
        private DataType b;
        private String c;

        static String a(DSnapSchema dsnapschema)
        {
            return dsnapschema.a;
        }

        static DataType b(DSnapSchema dsnapschema)
        {
            return dsnapschema.b;
        }

        public static DSnapSchema valueOf(String s)
        {
            return (DSnapSchema)Enum.valueOf(com/snapchat/android/discover/model/database/table/DSnapTable$DSnapSchema, s);
        }

        public static DSnapSchema[] values()
        {
            return (DSnapSchema[])$VALUES.clone();
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
            HASH = new DSnapSchema("HASH", "_id", DataType.TEXT, "PRIMARY KEY");
            TYPE = new DSnapSchema("TYPE", 1, "type", DataType.TEXT);
            SHAREABLE = new DSnapSchema("SHAREABLE", 2, "shareable", DataType.BOOLEAN);
            $VALUES = (new DSnapSchema[] {
                HASH, TYPE, SHAREABLE
            });
        }

        private DSnapSchema(String s, int i, String s1, DataType datatype)
        {
            super(s, i);
            a = s1;
            b = datatype;
        }

        private DSnapSchema(String s, String s1, DataType datatype, String s2)
        {
            this(s, 0, s1, datatype);
            c = s2;
        }
    }


    private static String a[];
    private static HashMap b;
    private static DSnapTable c;

    protected DSnapTable()
    {
    }

    private static ContentValues a(Vb vb)
    {
        if (vb == null)
        {
            return null;
        }
        boolean flag = false;
        if (vb.b() != null)
        {
            flag = TextUtils.equals((CharSequence)vb.b().get("shareable"), "true");
        }
        return (new tA()).a(DSnapSchema.TYPE, vb.a()).a(DSnapSchema.SHAREABLE, flag).a;
    }

    public static DSnapTable a()
    {
        com/snapchat/android/discover/model/database/table/DSnapTable;
        JVM INSTR monitorenter ;
        DSnapTable dsnaptable;
        if (c == null)
        {
            c = new DSnapTable();
        }
        dsnaptable = c;
        com/snapchat/android/discover/model/database/table/DSnapTable;
        JVM INSTR monitorexit ;
        return dsnaptable;
        Exception exception;
        exception;
        throw exception;
    }

    public static void a(SQLiteDatabase sqlitedatabase, String s, Vb vb)
    {
        if (vb != null && vb.c() != null) goto _L2; else goto _L1
_L1:
        ContentValues contentvalues;
        return;
_L2:
        if ((contentvalues = a(vb)) != null)
        {
            contentvalues.put(DSnapSchema.HASH.getColumnName(), s);
            if (sqlitedatabase.insertWithOnConflict("DSnap", null, contentvalues, 5) == -1L)
            {
                throw new SQLiteException("Insertion in DB failed for DSnap");
            }
            vb = vb.c().iterator();
            while (vb.hasNext()) 
            {
                UX ux = (UX)vb.next();
                DSnapItemTable.a();
                DSnapItemTable.a(sqlitedatabase, s, ux);
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected final volatile ContentValues a(Object obj)
    {
        return a((Vb)obj);
    }

    protected final Collection a(Br br)
    {
        return null;
    }

    public final void b(Br br)
    {
    }

    public final tt[] b()
    {
        return DSnapSchema.values();
    }

    public final String c()
    {
        return "DSnap";
    }

    public final void c(Br br)
    {
    }

    public final String d()
    {
        StringBuilder stringbuilder = new StringBuilder();
        DSnapSchema adsnapschema[] = DSnapSchema.values();
        int j = adsnapschema.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = adsnapschema[i];
            if (i > 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append((new StringBuilder()).append(DSnapSchema.a(((DSnapSchema) (obj)))).append(" ").append(DSnapSchema.b(((DSnapSchema) (obj))).toString()).toString());
            obj = ((DSnapSchema) (obj)).getConstraints();
            if (!org.apache.http.util.TextUtils.isEmpty(((CharSequence) (obj))))
            {
                stringbuilder.append(" ");
                stringbuilder.append(((String) (obj)));
            }
        }

        return stringbuilder.toString();
    }

    public final boolean l()
    {
        return false;
    }

    static 
    {
        DSnapSchema adsnapschema[] = DSnapSchema.values();
        int j = adsnapschema.length;
        a = new String[j];
        b = new HashMap(j);
        for (int i = 0; i < j; i++)
        {
            DSnapSchema dsnapschema = adsnapschema[i];
            a[i] = adsnapschema[i].getColumnName();
            b.put(dsnapschema.getColumnName(), dsnapschema.getColumnName());
        }

    }
}
