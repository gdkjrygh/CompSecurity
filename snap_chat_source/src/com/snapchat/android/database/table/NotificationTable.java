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
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import tt;

// Referenced classes of package com.snapchat.android.database.table:
//            DbTable

public final class NotificationTable extends DbTable
{
    public static final class NotificationSchema extends Enum
        implements tt
    {

        private static final NotificationSchema $VALUES[];
        public static final NotificationSchema CASH_AMOUNT;
        public static final NotificationSchema CHAT_MESSAGE_ID;
        public static final NotificationSchema CHAT_SEQ_NUM;
        public static final NotificationSchema ID;
        public static final NotificationSchema NINJA_MODE;
        public static final NotificationSchema SENDER;
        public static final NotificationSchema SENDER_USERNAME;
        public static final NotificationSchema TEXT;
        public static final NotificationSchema TIMESTAMP;
        public static final NotificationSchema TYPE;
        private int a;
        private String b;
        private DataType c;

        static String a(NotificationSchema notificationschema)
        {
            return notificationschema.b;
        }

        static DataType b(NotificationSchema notificationschema)
        {
            return notificationschema.c;
        }

        public static NotificationSchema valueOf(String s)
        {
            return (NotificationSchema)Enum.valueOf(com/snapchat/android/database/table/NotificationTable$NotificationSchema, s);
        }

        public static NotificationSchema[] values()
        {
            return (NotificationSchema[])$VALUES.clone();
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
            ID = new NotificationSchema("ID", 0, 0, "_id", DataType.TEXT);
            TIMESTAMP = new NotificationSchema("TIMESTAMP", 1, 1, "timestamp", DataType.INTEGER);
            SENDER = new NotificationSchema("SENDER", 2, 2, "sender", DataType.TEXT);
            SENDER_USERNAME = new NotificationSchema("SENDER_USERNAME", 3, 3, "sender_username", DataType.TEXT);
            TEXT = new NotificationSchema("TEXT", 4, 4, "text", DataType.TEXT);
            CHAT_MESSAGE_ID = new NotificationSchema("CHAT_MESSAGE_ID", 5, 5, "chat_message_id", DataType.TEXT);
            TYPE = new NotificationSchema("TYPE", 6, 6, "type", DataType.TEXT);
            NINJA_MODE = new NotificationSchema("NINJA_MODE", 7, 7, "ninja_mode", DataType.INTEGER);
            CASH_AMOUNT = new NotificationSchema("CASH_AMOUNT", 8, 8, "cash_amount", DataType.TEXT);
            CHAT_SEQ_NUM = new NotificationSchema("CHAT_SEQ_NUM", 9, 9, "chat_seq_num", DataType.INTEGER);
            $VALUES = (new NotificationSchema[] {
                ID, TIMESTAMP, SENDER, SENDER_USERNAME, TEXT, CHAT_MESSAGE_ID, TYPE, NINJA_MODE, CASH_AMOUNT, CHAT_SEQ_NUM
            });
        }

        private NotificationSchema(String s, int i, int j, String s1, DataType datatype)
        {
            super(s, i);
            a = j;
            b = s1;
            c = datatype;
        }
    }


    private static String a[];
    private static HashMap b;
    private static NotificationTable c;
    private static final ReadWriteLock d = new ReentrantReadWriteLock(true);

    private NotificationTable()
    {
    }

    public static long a(Context context, String s, String s1)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = DatabaseHelper.a(context).getReadableDatabase();
        context = d.readLock();
        long l;
        context.lock();
        if (!s.equals(com.snapchat.android.notification.AndroidNotificationManager.Type.TYPING.name()))
        {
            break MISSING_BLOCK_LABEL_149;
        }
        l = DatabaseUtils.longForQuery(sqlitedatabase, (new StringBuilder("SELECT MAX(")).append(NotificationSchema.TIMESTAMP).append(") from Notification WHERE ").append(NotificationSchema.SENDER_USERNAME).append("=? AND (").append(NotificationSchema.TYPE).append(" ='").append(s).append("' OR ").append(NotificationSchema.TYPE).append(" ='").append(com.snapchat.android.notification.AndroidNotificationManager.Type.CHAT.name()).append("') AND ").append(NotificationSchema.NINJA_MODE).append("=0").toString(), new String[] {
            s1
        });
        context.unlock();
        return l;
        l = DatabaseUtils.longForQuery(sqlitedatabase, (new StringBuilder("SELECT MAX(")).append(NotificationSchema.TIMESTAMP).append(") from Notification WHERE ").append(NotificationSchema.SENDER_USERNAME).append("=? AND ").append(NotificationSchema.TYPE).append(" ='").append(s).append("' AND ").append(NotificationSchema.NINJA_MODE).append("=0").toString(), new String[] {
            s1
        });
        context.unlock();
        return l;
        s;
        context.unlock();
        throw s;
    }

    public static Cursor a(Context context, String as[])
    {
        SQLiteDatabase sqlitedatabase;
        StringBuilder stringbuilder;
        sqlitedatabase = DatabaseHelper.a(context).getReadableDatabase();
        stringbuilder = new StringBuilder();
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(" OR ");
            }
            stringbuilder.append(NotificationSchema.TYPE.getColumnName());
            stringbuilder.append("=?");
        }

        context = d.readLock();
        context.lock();
        as = sqlitedatabase.query("Notification", a, stringbuilder.toString(), as, null, null, (new StringBuilder()).append(NotificationSchema.TIMESTAMP.getColumnName()).append(" ASC").toString());
        context.unlock();
        return as;
        as;
        context.unlock();
        throw as;
    }

    public static NotificationTable a()
    {
        com/snapchat/android/database/table/NotificationTable;
        JVM INSTR monitorenter ;
        NotificationTable notificationtable;
        if (c == null)
        {
            c = new NotificationTable();
        }
        notificationtable = c;
        com/snapchat/android/database/table/NotificationTable;
        JVM INSTR monitorexit ;
        return notificationtable;
        Exception exception;
        exception;
        throw exception;
    }

    public static List a(Context context)
    {
        Object obj;
        Object obj1;
        obj1 = DatabaseHelper.a(context).getReadableDatabase();
        context = new ArrayList();
        obj = d.readLock();
        ((Lock) (obj)).lock();
        obj1 = ((SQLiteDatabase) (obj1)).query(true, "Notification", new String[] {
            NotificationSchema.TYPE.getColumnName()
        }, null, null, null, null, null, null);
        ((Lock) (obj)).unlock();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        boolean flag;
        if (((Cursor) (obj1)).moveToFirst())
        {
            do
            {
                obj = ((Cursor) (obj1)).getString(0);
                if (!TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    context.add(obj);
                }
                flag = ((Cursor) (obj1)).moveToNext();
            } while (flag);
        }
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        return context;
        context;
        ((Lock) (obj)).unlock();
        throw context;
        context;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw context;
    }

    public static void a(Context context, String s)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = DatabaseHelper.a(context).getWritableDatabase();
        context = d.writeLock();
        context.lock();
        sqlitedatabase.delete("Notification", (new StringBuilder()).append(NotificationSchema.TYPE.getColumnName()).append("=?").toString(), new String[] {
            s
        });
        context.unlock();
        return;
        s;
        context.unlock();
        throw s;
    }

    public static void a(Context context, String s, long l, String s1, String s2, String s3, String s4, 
            long l1, String s5, boolean flag, String s6)
    {
        Lock lock = d.writeLock();
        ContentValues contentvalues;
        lock.lock();
        contentvalues = new ContentValues();
        contentvalues.put(NotificationSchema.ID.getColumnName(), s);
        contentvalues.put(NotificationSchema.TIMESTAMP.getColumnName(), Long.valueOf(l));
        contentvalues.put(NotificationSchema.SENDER.getColumnName(), s1);
        contentvalues.put(NotificationSchema.SENDER_USERNAME.getColumnName(), s2);
        contentvalues.put(NotificationSchema.TEXT.getColumnName(), s3);
        contentvalues.put(NotificationSchema.CHAT_MESSAGE_ID.getColumnName(), s4);
        contentvalues.put(NotificationSchema.TYPE.getColumnName(), s5);
        s = NotificationSchema.NINJA_MODE.getColumnName();
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        contentvalues.put(s, Integer.valueOf(i));
        contentvalues.put(NotificationSchema.CASH_AMOUNT.getColumnName(), s6);
        contentvalues.put(NotificationSchema.CHAT_SEQ_NUM.getColumnName(), Long.valueOf(l1));
        if (ReleaseManager.f())
        {
            Timber.c("NotificationTable", (new StringBuilder("insert ")).append(contentvalues).toString(), new Object[0]);
        }
        DatabaseHelper.a(context).getWritableDatabase().insertWithOnConflict("Notification", null, contentvalues, 5);
        lock.unlock();
        return;
        context;
        lock.unlock();
        throw context;
    }

    public static void b(Context context, String s, String s1)
    {
        SQLiteDatabase sqlitedatabase;
        String s2;
        sqlitedatabase = DatabaseHelper.a(context).getWritableDatabase();
        s2 = (new StringBuilder()).append(NotificationSchema.TYPE.getColumnName()).append("=? AND ").append(NotificationSchema.SENDER_USERNAME.getColumnName()).append("=?").toString();
        context = d.writeLock();
        context.lock();
        sqlitedatabase.delete("Notification", s2, new String[] {
            s, s1
        });
        context.unlock();
        return;
        s;
        context.unlock();
        throw s;
    }

    public static void c(Context context, String s, String s1)
    {
        (new Thread(new Runnable(s1, context, s) {

            private String a;
            private Context b;
            private String c;

            public final void run()
            {
                if (a == null)
                {
                    NotificationTable.a(b, c);
                    return;
                } else
                {
                    NotificationTable.b(b, c, a);
                    return;
                }
            }

            
            {
                a = s;
                b = context;
                c = s1;
                super();
            }
        })).start();
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
        return NotificationSchema.values();
    }

    public final String c()
    {
        return "Notification";
    }

    public final String d()
    {
        StringBuilder stringbuilder = new StringBuilder();
        NotificationSchema anotificationschema[] = NotificationSchema.values();
        int j = anotificationschema.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = anotificationschema[i];
            if (i > 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append((new StringBuilder()).append(NotificationSchema.a(((NotificationSchema) (obj)))).append(" ").append(NotificationSchema.b(((NotificationSchema) (obj))).toString()).toString());
            obj = ((NotificationSchema) (obj)).getConstraints();
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
        NotificationSchema anotificationschema[] = NotificationSchema.values();
        int k = anotificationschema.length;
        a = new String[k];
        for (int i = 0; i < k; i++)
        {
            a[i] = anotificationschema[i].getColumnName();
        }

        b = new HashMap();
        anotificationschema = NotificationSchema.values();
        k = anotificationschema.length;
        for (int j = ((flag) ? 1 : 0); j < k; j++)
        {
            NotificationSchema notificationschema = anotificationschema[j];
            b.put(notificationschema.getColumnName(), notificationschema.getColumnName());
        }

    }
}
