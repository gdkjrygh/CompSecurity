// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import AY;
import Bf;
import Br;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.text.TextUtils;
import com.snapchat.android.Timber;
import com.snapchat.android.database.DataType;
import com.snapchat.android.util.debug.ReleaseManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tt;

// Referenced classes of package com.snapchat.android.database.table:
//            DbTable

public final class SentSnapTable extends DbTable
{
    public static final class SnapSchema extends Enum
        implements tt
    {

        private static final SnapSchema $VALUES[];
        public static final SnapSchema CLIENT_ID;
        public static final SnapSchema CONVERSATION_ID;
        public static final SnapSchema DISPLAY_TIME;
        public static final SnapSchema ID;
        public static final SnapSchema IS_SCREENSHOTTED;
        public static final SnapSchema IS_ZIPPED;
        public static final SnapSchema MEDIA_TYPE;
        public static final SnapSchema RECIPIENT;
        public static final SnapSchema SENT_TIMESTAMP;
        public static final SnapSchema STATUS;
        public static final SnapSchema TARGET_VIEW;
        public static final SnapSchema TIMESTAMP;
        public static final SnapSchema TIME_OF_LAST_SEND_ATTEMPT;
        public static final SnapSchema URI;
        private int a;
        private String b;
        private DataType c;
        private String d;

        static String a(SnapSchema snapschema)
        {
            return snapschema.b;
        }

        static DataType b(SnapSchema snapschema)
        {
            return snapschema.c;
        }

        public static SnapSchema valueOf(String s)
        {
            return (SnapSchema)Enum.valueOf(com/snapchat/android/database/table/SentSnapTable$SnapSchema, s);
        }

        public static SnapSchema[] values()
        {
            return (SnapSchema[])$VALUES.clone();
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
            ID = new SnapSchema("ID", "_id", DataType.TEXT, "PRIMARY KEY");
            CLIENT_ID = new SnapSchema("CLIENT_ID", 1, 1, "ClientId", DataType.TEXT);
            TIMESTAMP = new SnapSchema("TIMESTAMP", 2, 2, "Timestamp", DataType.INTEGER);
            MEDIA_TYPE = new SnapSchema("MEDIA_TYPE", 3, 3, "MediaType", DataType.INTEGER);
            STATUS = new SnapSchema("STATUS", 4, 4, "Status", DataType.TEXT);
            RECIPIENT = new SnapSchema("RECIPIENT", 5, 5, "Recipient", DataType.TEXT);
            DISPLAY_TIME = new SnapSchema("DISPLAY_TIME", 6, 6, "DisplayTime", DataType.REAL);
            URI = new SnapSchema("URI", 7, 7, "Uri", DataType.TEXT);
            TIME_OF_LAST_SEND_ATTEMPT = new SnapSchema("TIME_OF_LAST_SEND_ATTEMPT", 8, 8, "TimeOfLastSendAttempt", DataType.INTEGER);
            IS_ZIPPED = new SnapSchema("IS_ZIPPED", 9, 9, "IsZipped", DataType.INTEGER);
            CONVERSATION_ID = new SnapSchema("CONVERSATION_ID", 10, 10, "ConversationId", DataType.TEXT);
            SENT_TIMESTAMP = new SnapSchema("SENT_TIMESTAMP", 11, 11, "SentTimestamp", DataType.INTEGER);
            TARGET_VIEW = new SnapSchema("TARGET_VIEW", 12, 12, "TargetView", DataType.TEXT);
            IS_SCREENSHOTTED = new SnapSchema("IS_SCREENSHOTTED", 13, 13, "IsScreenshotted", DataType.BOOLEAN);
            $VALUES = (new SnapSchema[] {
                ID, CLIENT_ID, TIMESTAMP, MEDIA_TYPE, STATUS, RECIPIENT, DISPLAY_TIME, URI, TIME_OF_LAST_SEND_ATTEMPT, IS_ZIPPED, 
                CONVERSATION_ID, SENT_TIMESTAMP, TARGET_VIEW, IS_SCREENSHOTTED
            });
        }

        private SnapSchema(String s, int i, int j, String s1, DataType datatype)
        {
            super(s, i);
            a = j;
            b = s1;
            c = datatype;
        }

        private SnapSchema(String s, String s1, DataType datatype, String s2)
        {
            super(s, 0);
            a = 0;
            b = s1;
            c = datatype;
            d = s2;
        }
    }


    private static String a[];
    private static SentSnapTable b;

    private SentSnapTable()
    {
    }

    public static SentSnapTable a()
    {
        com/snapchat/android/database/table/SentSnapTable;
        JVM INSTR monitorenter ;
        SentSnapTable sentsnaptable;
        if (b == null)
        {
            b = new SentSnapTable();
        }
        sentsnaptable = b;
        com/snapchat/android/database/table/SentSnapTable;
        JVM INSTR monitorexit ;
        return sentsnaptable;
        Exception exception;
        exception;
        throw exception;
    }

    public static Map a(SQLiteDatabase sqlitedatabase, Set set)
    {
        HashMap hashmap;
        Cursor cursor;
        hashmap = new HashMap();
        cursor = sqlitedatabase.query("SentSnaps", a, null, null, null, null, null);
        if (cursor == null) goto _L2; else goto _L1
_L1:
        if (!cursor.moveToFirst()) goto _L2; else goto _L3
_L3:
        sqlitedatabase = com.snapchat.android.model.Snap.TargetView.valueOf(cursor.getString(SnapSchema.TARGET_VIEW.getColumnNumber()));
        if (set == null) goto _L5; else goto _L4
_L4:
        if (!set.contains(sqlitedatabase)) goto _L6; else goto _L5
_L5:
        Object obj;
        Object obj1;
        String s;
        String s1;
        String s2;
        int i;
        long l;
        long l1;
        long l2;
        obj = cursor.getString(SnapSchema.ID.getColumnNumber());
        obj1 = cursor.getString(SnapSchema.CLIENT_ID.getColumnNumber());
        l = cursor.getLong(SnapSchema.TIMESTAMP.getColumnNumber());
        l1 = cursor.getLong(SnapSchema.SENT_TIMESTAMP.getColumnNumber());
        i = cursor.getInt(SnapSchema.MEDIA_TYPE.getColumnNumber());
        s = cursor.getString(SnapSchema.STATUS.getColumnNumber());
        s1 = cursor.getString(SnapSchema.RECIPIENT.getColumnNumber());
        s2 = cursor.getString(SnapSchema.DISPLAY_TIME.getColumnNumber());
        sqlitedatabase = cursor.getString(SnapSchema.URI.getColumnNumber());
        l2 = cursor.getLong(SnapSchema.TIME_OF_LAST_SEND_ATTEMPT.getColumnNumber());
        boolean flag;
        boolean flag1;
        if (cursor.getInt(SnapSchema.IS_ZIPPED.getColumnNumber()) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!TextUtils.isEmpty(sqlitedatabase))
        {
            break MISSING_BLOCK_LABEL_432;
        }
        sqlitedatabase = null;
_L7:
        if (cursor.getInt(SnapSchema.IS_SCREENSHOTTED.getColumnNumber()) == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        obj1 = new AY(((String) (obj)), ((String) (obj1)), l, l1, i, com.snapchat.android.model.Snap.ClientSnapStatus.fromString(s), s1, s2, sqlitedatabase, l2, flag);
        ((AY) (obj1)).d(flag1);
        s = cursor.getString(SnapSchema.CONVERSATION_ID.getColumnNumber());
        obj = (List)hashmap.get(s);
        sqlitedatabase = ((SQLiteDatabase) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_347;
        }
        sqlitedatabase = new ArrayList();
        sqlitedatabase.add(obj1);
        if (((AY) (obj1)).Q() && ((AY) (obj1)).o())
        {
            ((AY) (obj1)).e();
            Bf.a().c(((AY) (obj1)).mClientId);
        }
        hashmap.put(s, sqlitedatabase);
_L6:
        flag = cursor.moveToNext();
        if (flag) goto _L3; else goto _L2
_L2:
        if (cursor != null)
        {
            cursor.close();
        }
        return hashmap;
        sqlitedatabase = Uri.parse(sqlitedatabase);
          goto _L7
        sqlitedatabase;
        if (cursor != null)
        {
            cursor.close();
        }
        throw sqlitedatabase;
    }

    public static void a(SQLiteDatabase sqlitedatabase, String s, AY ay, com.snapchat.android.model.Snap.TargetView targetview)
    {
        boolean flag = true;
        if (ay == null || TextUtils.isEmpty(s))
        {
            return;
        }
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(SnapSchema.ID.getColumnName(), ay.ai());
        contentvalues.put(SnapSchema.CLIENT_ID.getColumnName(), ay.mClientId);
        contentvalues.put(SnapSchema.TIMESTAMP.getColumnName(), Long.valueOf(ay.n()));
        contentvalues.put(SnapSchema.SENT_TIMESTAMP.getColumnName(), Long.valueOf(ay.W()));
        contentvalues.put(SnapSchema.RECIPIENT.getColumnName(), ay.mRecipient);
        contentvalues.put(SnapSchema.MEDIA_TYPE.getColumnName(), Integer.valueOf(ay.am()));
        String s1 = SnapSchema.IS_ZIPPED.getColumnName();
        int i;
        if (ay.mZipped)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        contentvalues.put(s1, Integer.valueOf(i));
        contentvalues.put(SnapSchema.STATUS.getColumnName(), ay.aj().name());
        contentvalues.put(SnapSchema.DISPLAY_TIME.getColumnName(), ay.mDisplayTime);
        contentvalues.put(SnapSchema.URI.getColumnName(), ay.mSnapUriString);
        contentvalues.put(SnapSchema.TIME_OF_LAST_SEND_ATTEMPT.getColumnName(), Long.valueOf(ay.mTimeOfLastSendAttempt));
        contentvalues.put(SnapSchema.CONVERSATION_ID.getColumnName(), s);
        contentvalues.put(SnapSchema.TARGET_VIEW.getColumnName(), targetview.name());
        s = SnapSchema.IS_SCREENSHOTTED.getColumnName();
        if (ay.as())
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        contentvalues.put(s, Integer.valueOf(i));
        if (ReleaseManager.f())
        {
            Timber.c("SentSnapTable", (new StringBuilder("saveSnapInTransaction values=")).append(contentvalues).toString(), new Object[0]);
        }
        sqlitedatabase.insertWithOnConflict("SentSnaps", null, contentvalues, 5);
    }

    protected final volatile ContentValues a(Object obj)
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
        return SnapSchema.values();
    }

    public final String c()
    {
        return "SentSnaps";
    }

    public final String d()
    {
        StringBuilder stringbuilder = new StringBuilder();
        SnapSchema asnapschema[] = SnapSchema.values();
        int j = asnapschema.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = asnapschema[i];
            if (i > 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append((new StringBuilder()).append(SnapSchema.a(((SnapSchema) (obj)))).append(" ").append(SnapSchema.b(((SnapSchema) (obj))).toString()).toString());
            obj = ((SnapSchema) (obj)).getConstraints();
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                stringbuilder.append(" ");
                stringbuilder.append(((String) (obj)));
            }
        }

        return stringbuilder.toString();
    }

    public final boolean e()
    {
        return true;
    }

    static 
    {
        SnapSchema asnapschema[] = SnapSchema.values();
        int j = asnapschema.length;
        a = new String[j];
        for (int i = 0; i < j; i++)
        {
            a[i] = asnapschema[i].getColumnName();
        }

    }
}
