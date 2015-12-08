// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import Br;
import QJ;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.snapchat.android.Timber;
import com.snapchat.android.database.DataType;
import com.snapchat.android.util.debug.ReleaseManager;
import eb;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import tA;
import tt;

// Referenced classes of package com.snapchat.android.database.table:
//            DbTable

public final class FriendmojiEditableDictionaryTable extends DbTable
{
    public static final class FriendmojiDictionarySchema extends Enum
        implements tt
    {

        private static final FriendmojiDictionarySchema $VALUES[];
        public static final FriendmojiDictionarySchema DEFAULT_TYPE;
        public static final FriendmojiDictionarySchema DEFAULT_VAL;
        public static final FriendmojiDictionarySchema EMOJI_DESC;
        public static final FriendmojiDictionarySchema EMOJI_LEGEND_RANK;
        public static final FriendmojiDictionarySchema EMOJI_PICKER_DESC;
        public static final FriendmojiDictionarySchema SOURCE;
        public static final FriendmojiDictionarySchema SYMBOL;
        public static final FriendmojiDictionarySchema TITLE;
        public static final FriendmojiDictionarySchema TYPE;
        private int a;
        private String b;
        private DataType c;

        static String a(FriendmojiDictionarySchema friendmojidictionaryschema)
        {
            return friendmojidictionaryschema.b;
        }

        static DataType b(FriendmojiDictionarySchema friendmojidictionaryschema)
        {
            return friendmojidictionaryschema.c;
        }

        public static FriendmojiDictionarySchema valueOf(String s)
        {
            return (FriendmojiDictionarySchema)Enum.valueOf(com/snapchat/android/database/table/FriendmojiEditableDictionaryTable$FriendmojiDictionarySchema, s);
        }

        public static FriendmojiDictionarySchema[] values()
        {
            return (FriendmojiDictionarySchema[])$VALUES.clone();
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
            return null;
        }

        public final DataType getDataType()
        {
            return c;
        }

        static 
        {
            SYMBOL = new FriendmojiDictionarySchema("SYMBOL", 0, 1, "symbol", DataType.TEXT);
            TYPE = new FriendmojiDictionarySchema("TYPE", 1, 2, "type", DataType.INTEGER);
            SOURCE = new FriendmojiDictionarySchema("SOURCE", 2, 3, "source", DataType.TEXT);
            TITLE = new FriendmojiDictionarySchema("TITLE", 3, 4, "title", DataType.TEXT);
            EMOJI_DESC = new FriendmojiDictionarySchema("EMOJI_DESC", 4, 5, "emoji_desc", DataType.TEXT);
            EMOJI_PICKER_DESC = new FriendmojiDictionarySchema("EMOJI_PICKER_DESC", 5, 6, "emoji_picker_desc", DataType.TEXT);
            DEFAULT_TYPE = new FriendmojiDictionarySchema("DEFAULT_TYPE", 6, 7, "default_type", DataType.INTEGER);
            DEFAULT_VAL = new FriendmojiDictionarySchema("DEFAULT_VAL", 7, 8, "default_val", DataType.TEXT);
            EMOJI_LEGEND_RANK = new FriendmojiDictionarySchema("EMOJI_LEGEND_RANK", 8, 9, "emoji_legend_rank", DataType.TEXT);
            $VALUES = (new FriendmojiDictionarySchema[] {
                SYMBOL, TYPE, SOURCE, TITLE, EMOJI_DESC, EMOJI_PICKER_DESC, DEFAULT_TYPE, DEFAULT_VAL, EMOJI_LEGEND_RANK
            });
        }

        private FriendmojiDictionarySchema(String s, int i, int j, String s1, DataType datatype)
        {
            super(s, i);
            a = j;
            b = s1;
            c = datatype;
        }
    }


    private static FriendmojiEditableDictionaryTable a;

    protected FriendmojiEditableDictionaryTable()
    {
    }

    public static FriendmojiEditableDictionaryTable a()
    {
        com/snapchat/android/database/table/FriendmojiEditableDictionaryTable;
        JVM INSTR monitorenter ;
        FriendmojiEditableDictionaryTable friendmojieditabledictionarytable;
        if (a == null)
        {
            a = new FriendmojiEditableDictionaryTable();
        }
        friendmojieditabledictionarytable = a;
        com/snapchat/android/database/table/FriendmojiEditableDictionaryTable;
        JVM INSTR monitorexit ;
        return friendmojieditabledictionarytable;
        Exception exception;
        exception;
        throw exception;
    }

    private Map f()
    {
        Cursor cursor;
        i().lock();
        cursor = mDatabase.query("FriendmojiEditableDictionary", null, null, null, null, null, null);
        Object obj = m();
        if (obj == null)
        {
            if (cursor != null)
            {
                cursor.close();
            }
            i().unlock();
            return null;
        }
        obj = new HashMap();
        if (ReleaseManager.f())
        {
            Timber.c("friendmojiEditableDictionaryTable", "Querying [%s] database table", new Object[] {
                "FriendmojiEditableDictionary"
            });
        }
        cursor.moveToFirst();
        boolean flag;
        do
        {
            if (cursor.isAfterLast())
            {
                break;
            }
            String s = cursor.getString(FriendmojiDictionarySchema.SYMBOL.getColumnNumber());
            String s1 = cursor.getString(FriendmojiDictionarySchema.SOURCE.getColumnNumber());
            int i = cursor.getInt(FriendmojiDictionarySchema.TYPE.getColumnNumber());
            String s2 = cursor.getString(FriendmojiDictionarySchema.TITLE.getColumnNumber());
            String s3 = cursor.getString(FriendmojiDictionarySchema.EMOJI_DESC.getColumnNumber());
            String s4 = cursor.getString(FriendmojiDictionarySchema.EMOJI_PICKER_DESC.getColumnNumber());
            int j = cursor.getInt(FriendmojiDictionarySchema.DEFAULT_TYPE.getColumnNumber());
            String s5 = cursor.getString(FriendmojiDictionarySchema.DEFAULT_VAL.getColumnNumber());
            int k = cursor.getInt(FriendmojiDictionarySchema.EMOJI_LEGEND_RANK.getColumnNumber());
            QJ qj = new QJ();
            qj.a(s1);
            qj.a(Integer.valueOf(i));
            qj.b(s2);
            qj.c(s3);
            qj.d(s4);
            qj.b(Integer.valueOf(j));
            qj.e(s5);
            qj.c(Integer.valueOf(k));
            ((Map) (obj)).put(s, qj);
            flag = cursor.moveToNext();
        } while (flag);
        if (cursor != null)
        {
            cursor.close();
        }
        i().unlock();
        return ((Map) (obj));
        Exception exception;
        exception;
        if (cursor != null)
        {
            cursor.close();
        }
        i().unlock();
        throw exception;
    }

    protected final ContentValues a(Object obj)
    {
        obj = (java.util.Map.Entry)obj;
        if (obj == null)
        {
            return null;
        } else
        {
            tA ta = new tA();
            ta.a(FriendmojiDictionarySchema.SYMBOL, (String)((java.util.Map.Entry) (obj)).getKey());
            ta.a(FriendmojiDictionarySchema.TYPE, ((QJ)((java.util.Map.Entry) (obj)).getValue()).a().intValue());
            ta.a(FriendmojiDictionarySchema.SOURCE, ((QJ)((java.util.Map.Entry) (obj)).getValue()).c());
            ta.a(FriendmojiDictionarySchema.TITLE, ((QJ)((java.util.Map.Entry) (obj)).getValue()).d());
            ta.a(FriendmojiDictionarySchema.EMOJI_DESC, ((QJ)((java.util.Map.Entry) (obj)).getValue()).e());
            ta.a(FriendmojiDictionarySchema.EMOJI_PICKER_DESC, ((QJ)((java.util.Map.Entry) (obj)).getValue()).f());
            ta.a(FriendmojiDictionarySchema.DEFAULT_TYPE, ((QJ)((java.util.Map.Entry) (obj)).getValue()).g().intValue());
            ta.a(FriendmojiDictionarySchema.DEFAULT_VAL, ((QJ)((java.util.Map.Entry) (obj)).getValue()).h());
            ta.a(FriendmojiDictionarySchema.EMOJI_LEGEND_RANK, ((QJ)((java.util.Map.Entry) (obj)).getValue()).i().intValue());
            return ta.a;
        }
    }

    protected final volatile Object a(Cursor cursor)
    {
        return null;
    }

    protected final Collection a(Br br)
    {
        return br.k().b();
    }

    public final void b(Br br)
    {
        br.a(f());
    }

    public final tt[] b()
    {
        return FriendmojiDictionarySchema.values();
    }

    public final String c()
    {
        return "FriendmojiEditableDictionary";
    }

    public final String d()
    {
        String s = "_id INTEGER PRIMARY KEY";
        FriendmojiDictionarySchema afriendmojidictionaryschema[] = FriendmojiDictionarySchema.values();
        int j = afriendmojidictionaryschema.length;
        for (int i = 0; i < j; i++)
        {
            FriendmojiDictionarySchema friendmojidictionaryschema = afriendmojidictionaryschema[i];
            s = (new StringBuilder()).append(s).append(",").append(FriendmojiDictionarySchema.a(friendmojidictionaryschema)).append(" ").append(FriendmojiDictionarySchema.b(friendmojidictionaryschema).toString()).toString();
        }

        return s;
    }
}
