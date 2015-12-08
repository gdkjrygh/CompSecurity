// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import Br;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.snapchat.android.Timber;
import com.snapchat.android.database.DataType;
import com.snapchat.android.database.DatabaseHelper;
import com.snapchat.android.util.debug.ReleaseManager;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tt;

// Referenced classes of package com.snapchat.android.database.table:
//            DbTable

public final class ClearedChatIdsTable extends DbTable
{
    public static final class ClearedChatIdsSchema extends Enum
        implements tt
    {

        private static final ClearedChatIdsSchema $VALUES[];
        public static final ClearedChatIdsSchema CONVERSATION_ID;
        public static final ClearedChatIdsSchema ID;
        public static final ClearedChatIdsSchema TIMESTAMP;
        private int a;
        private String b;
        private DataType c;
        private String d;

        static String a(ClearedChatIdsSchema clearedchatidsschema)
        {
            return clearedchatidsschema.b;
        }

        static DataType b(ClearedChatIdsSchema clearedchatidsschema)
        {
            return clearedchatidsschema.c;
        }

        public static ClearedChatIdsSchema valueOf(String s)
        {
            return (ClearedChatIdsSchema)Enum.valueOf(com/snapchat/android/database/table/ClearedChatIdsTable$ClearedChatIdsSchema, s);
        }

        public static ClearedChatIdsSchema[] values()
        {
            return (ClearedChatIdsSchema[])$VALUES.clone();
        }

        public final String getColumnName()
        {
            return b;
        }

        public final int getColumnNumber()
        {
            return a;
        }

        public final String getConstraints()
        {
            return d;
        }

        public final DataType getDataType()
        {
            return c;
        }

        static 
        {
            ID = new ClearedChatIdsSchema("ID", "_id", DataType.TEXT, "PRIMARY_KEY");
            CONVERSATION_ID = new ClearedChatIdsSchema("CONVERSATION_ID", 1, 1, "conversationId", DataType.TEXT);
            TIMESTAMP = new ClearedChatIdsSchema("TIMESTAMP", 2, 2, "timestamp", DataType.INTEGER);
            $VALUES = (new ClearedChatIdsSchema[] {
                ID, CONVERSATION_ID, TIMESTAMP
            });
        }

        private ClearedChatIdsSchema(String s, int i, int j, String s1, DataType datatype)
        {
            super(s, i);
            a = j;
            b = s1;
            c = datatype;
        }

        private ClearedChatIdsSchema(String s, String s1, DataType datatype, String s2)
        {
            super(s, 0);
            a = 0;
            b = s1;
            c = datatype;
            d = s2;
        }
    }


    private static String a[];
    private static HashMap b;
    private static ClearedChatIdsTable c;

    private ClearedChatIdsTable()
    {
    }

    public static ClearedChatIdsTable a()
    {
        com/snapchat/android/database/table/ClearedChatIdsTable;
        JVM INSTR monitorenter ;
        ClearedChatIdsTable clearedchatidstable;
        if (c == null)
        {
            c = new ClearedChatIdsTable();
        }
        clearedchatidstable = c;
        com/snapchat/android/database/table/ClearedChatIdsTable;
        JVM INSTR monitorexit ;
        return clearedchatidstable;
        Exception exception;
        exception;
        throw exception;
    }

    public static Map a(SQLiteDatabase sqlitedatabase)
    {
        HashMap hashmap;
        hashmap = new HashMap();
        sqlitedatabase = sqlitedatabase.query("ClearedChatIdsTable", a, null, null, null, null, null);
        if (sqlitedatabase == null)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        boolean flag;
        if (sqlitedatabase.moveToFirst())
        {
            do
            {
                String s = sqlitedatabase.getString(ClearedChatIdsSchema.CONVERSATION_ID.getColumnNumber());
                String s1 = sqlitedatabase.getString(ClearedChatIdsSchema.ID.getColumnNumber());
                if (!hashmap.containsKey(s))
                {
                    hashmap.put(s, new HashSet());
                }
                ((Set)hashmap.get(s)).add(s1);
                flag = sqlitedatabase.moveToNext();
            } while (flag);
        }
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        return hashmap;
        Exception exception;
        exception;
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        throw exception;
    }

    public static void a(Context context)
    {
        context = DatabaseHelper.a(context).getWritableDatabase();
        long l = System.currentTimeMillis();
        if (context != null)
        {
            context.delete("ClearedChatIdsTable", (new StringBuilder()).append(ClearedChatIdsSchema.TIMESTAMP.getColumnName()).append(" <? ").toString(), new String[] {
                Long.toString(l - 0x5265c00L)
            });
        }
    }

    public static void a(Context context, String s)
    {
        (new Thread(new Runnable(context, s) {

            private Context a;
            private String b;

            public final void run()
            {
                ClearedChatIdsTable.b(a, b);
            }

            
            {
                a = context;
                b = s;
                super();
            }
        })).start();
    }

    public static void a(Context context, String s, String s1)
    {
        (new Thread(new Runnable(context, s, s1) {

            private Context a;
            private String b;
            private String c;

            public final void run()
            {
                ClearedChatIdsTable.b(a, b, c);
            }

            
            {
                a = context;
                b = s;
                c = s1;
                super();
            }
        })).start();
    }

    public static void b(Context context, String s)
    {
        context = DatabaseHelper.a(context).getWritableDatabase();
        if (context != null)
        {
            context.delete("ClearedChatIdsTable", (new StringBuilder()).append(ClearedChatIdsSchema.ID.getColumnName()).append("=?").toString(), new String[] {
                s
            });
        }
    }

    public static void b(Context context, String s, String s1)
    {
        long l = System.currentTimeMillis();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(ClearedChatIdsSchema.ID.getColumnName(), s);
        contentvalues.put(ClearedChatIdsSchema.CONVERSATION_ID.getColumnName(), s1);
        contentvalues.put(ClearedChatIdsSchema.TIMESTAMP.getColumnName(), Long.valueOf(l));
        if (ReleaseManager.f())
        {
            Timber.c("ClearedChatIdsTable", (new StringBuilder("insert ")).append(contentvalues).toString(), new Object[0]);
        }
        context = DatabaseHelper.a(context).getWritableDatabase();
        if (context != null)
        {
            context.insertWithOnConflict("ClearedChatIdsTable", null, contentvalues, 5);
        }
    }

    protected final volatile ContentValues a(Object obj)
    {
        return null;
    }

    protected final volatile Object a(Cursor cursor)
    {
        return null;
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
        return ClearedChatIdsSchema.values();
    }

    public final String c()
    {
        return "ClearedChatIdsTable";
    }

    public final String d()
    {
        StringBuilder stringbuilder = new StringBuilder();
        ClearedChatIdsSchema aclearedchatidsschema[] = ClearedChatIdsSchema.values();
        int j = aclearedchatidsschema.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = aclearedchatidsschema[i];
            if (i > 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append((new StringBuilder()).append(ClearedChatIdsSchema.a(((ClearedChatIdsSchema) (obj)))).append(" ").append(ClearedChatIdsSchema.b(((ClearedChatIdsSchema) (obj))).toString()).toString());
            obj = ((ClearedChatIdsSchema) (obj)).getConstraints();
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
        boolean flag = false;
        ClearedChatIdsSchema aclearedchatidsschema[] = ClearedChatIdsSchema.values();
        int k = aclearedchatidsschema.length;
        a = new String[k];
        for (int i = 0; i < k; i++)
        {
            a[i] = aclearedchatidsschema[i].getColumnName();
        }

        b = new HashMap();
        aclearedchatidsschema = ClearedChatIdsSchema.values();
        k = aclearedchatidsschema.length;
        for (int j = ((flag) ? 1 : 0); j < k; j++)
        {
            ClearedChatIdsSchema clearedchatidsschema = aclearedchatidsschema[j];
            b.put(clearedchatidsschema.getColumnName(), clearedchatidsschema.getColumnName());
        }

    }
}
