// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import Br;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.snapchat.android.Timber;
import com.snapchat.android.database.DataType;
import com.snapchat.android.database.DatabaseHelper;
import com.snapchat.android.util.debug.ReleaseManager;
import java.util.Collection;
import java.util.HashMap;
import tt;

// Referenced classes of package com.snapchat.android.database.table:
//            DbTable

public final class ChatsReceivedInLastHourTable extends DbTable
{
    public static final class ChatReceivedViaSCCPSchema extends Enum
        implements tt
    {

        private static final ChatReceivedViaSCCPSchema $VALUES[];
        public static final ChatReceivedViaSCCPSchema ID;
        public static final ChatReceivedViaSCCPSchema SENDER_USERNAME;
        public static final ChatReceivedViaSCCPSchema TIMESTAMP;
        private int a;
        private String b;
        private DataType c;
        private String d;

        static String a(ChatReceivedViaSCCPSchema chatreceivedviasccpschema)
        {
            return chatreceivedviasccpschema.b;
        }

        static DataType b(ChatReceivedViaSCCPSchema chatreceivedviasccpschema)
        {
            return chatreceivedviasccpschema.c;
        }

        public static ChatReceivedViaSCCPSchema valueOf(String s)
        {
            return (ChatReceivedViaSCCPSchema)Enum.valueOf(com/snapchat/android/database/table/ChatsReceivedInLastHourTable$ChatReceivedViaSCCPSchema, s);
        }

        public static ChatReceivedViaSCCPSchema[] values()
        {
            return (ChatReceivedViaSCCPSchema[])$VALUES.clone();
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
            ID = new ChatReceivedViaSCCPSchema("ID", "_id", DataType.TEXT, "PRIMARY_KEY");
            TIMESTAMP = new ChatReceivedViaSCCPSchema("TIMESTAMP", 1, 1, "timestamp", DataType.INTEGER);
            SENDER_USERNAME = new ChatReceivedViaSCCPSchema("SENDER_USERNAME", 2, 2, "sender_username", DataType.TEXT);
            $VALUES = (new ChatReceivedViaSCCPSchema[] {
                ID, TIMESTAMP, SENDER_USERNAME
            });
        }

        private ChatReceivedViaSCCPSchema(String s, int i, int j, String s1, DataType datatype)
        {
            super(s, i);
            a = j;
            b = s1;
            c = datatype;
        }

        private ChatReceivedViaSCCPSchema(String s, String s1, DataType datatype, String s2)
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
    private static ChatsReceivedInLastHourTable c;

    private ChatsReceivedInLastHourTable()
    {
    }

    public static ChatsReceivedInLastHourTable a()
    {
        com/snapchat/android/database/table/ChatsReceivedInLastHourTable;
        JVM INSTR monitorenter ;
        ChatsReceivedInLastHourTable chatsreceivedinlasthourtable;
        if (c == null)
        {
            c = new ChatsReceivedInLastHourTable();
        }
        chatsreceivedinlasthourtable = c;
        com/snapchat/android/database/table/ChatsReceivedInLastHourTable;
        JVM INSTR monitorexit ;
        return chatsreceivedinlasthourtable;
        Exception exception;
        exception;
        throw exception;
    }

    public static void a(Context context)
    {
        context = DatabaseHelper.a(context).getWritableDatabase();
        long l = System.currentTimeMillis();
        if (context != null)
        {
            context.delete("ChatsReceivedInLastHour", (new StringBuilder()).append(ChatReceivedViaSCCPSchema.TIMESTAMP.getColumnName()).append(" <? ").toString(), new String[] {
                Long.toString(l - 0x36ee80L)
            });
        }
    }

    public static void a(Context context, String s, long l, String s1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(ChatReceivedViaSCCPSchema.ID.getColumnName(), s);
        contentvalues.put(ChatReceivedViaSCCPSchema.TIMESTAMP.getColumnName(), Long.valueOf(l));
        contentvalues.put(ChatReceivedViaSCCPSchema.SENDER_USERNAME.getColumnName(), s1);
        if (ReleaseManager.f())
        {
            Timber.c("ChatsReceivedInLastHourTable", (new StringBuilder("insert ")).append(contentvalues).toString(), new Object[0]);
        }
        context = DatabaseHelper.a(context).getWritableDatabase();
        if (context != null)
        {
            context.insertWithOnConflict("ChatsReceivedInLastHour", null, contentvalues, 4);
        }
    }

    public static boolean a(Context context, String s)
    {
        return DatabaseUtils.longForQuery(DatabaseHelper.a(context).getReadableDatabase(), (new StringBuilder("SELECT COUNT() from ChatsReceivedInLastHour WHERE ")).append(ChatReceivedViaSCCPSchema.ID.getColumnName()).append("=?").toString(), new String[] {
            s
        }) > 0L;
    }

    public static void b(Context context, String s)
    {
        context = DatabaseHelper.a(context).getWritableDatabase();
        if (context != null)
        {
            context.delete("ChatsReceivedInLastHour", (new StringBuilder()).append(ChatReceivedViaSCCPSchema.ID.getColumnName()).append("=?").toString(), new String[] {
                s
            });
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
        return ChatReceivedViaSCCPSchema.values();
    }

    public final String c()
    {
        return "ChatsReceivedInLastHour";
    }

    public final String d()
    {
        StringBuilder stringbuilder = new StringBuilder();
        ChatReceivedViaSCCPSchema achatreceivedviasccpschema[] = ChatReceivedViaSCCPSchema.values();
        int j = achatreceivedviasccpschema.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = achatreceivedviasccpschema[i];
            if (i > 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append((new StringBuilder()).append(ChatReceivedViaSCCPSchema.a(((ChatReceivedViaSCCPSchema) (obj)))).append(" ").append(ChatReceivedViaSCCPSchema.b(((ChatReceivedViaSCCPSchema) (obj))).toString()).toString());
            obj = ((ChatReceivedViaSCCPSchema) (obj)).getConstraints();
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
        ChatReceivedViaSCCPSchema achatreceivedviasccpschema[] = ChatReceivedViaSCCPSchema.values();
        int k = achatreceivedviasccpschema.length;
        a = new String[k];
        for (int i = 0; i < k; i++)
        {
            a[i] = achatreceivedviasccpschema[i].getColumnName();
        }

        b = new HashMap();
        achatreceivedviasccpschema = ChatReceivedViaSCCPSchema.values();
        k = achatreceivedviasccpschema.length;
        for (int j = ((flag) ? 1 : 0); j < k; j++)
        {
            ChatReceivedViaSCCPSchema chatreceivedviasccpschema = achatreceivedviasccpschema[j];
            b.put(chatreceivedviasccpschema.getColumnName(), chatreceivedviasccpschema.getColumnName());
        }

    }
}
