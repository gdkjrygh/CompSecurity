// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import AB;
import AT;
import Br;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.snapchat.android.database.DataType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tt;

// Referenced classes of package com.snapchat.android.database.table:
//            DbTable

public final class ReceivedSnapTable extends DbTable
{
    public static final class SnapSchema extends Enum
        implements tt
    {

        private static final SnapSchema $VALUES[];
        public static final SnapSchema BROADCAST_HIDE_TIMER;
        public static final SnapSchema BROADCAST_MEDIA_URL;
        public static final SnapSchema BROADCAST_SECONDARY_TEXT;
        public static final SnapSchema BROADCAST_TEXT;
        public static final SnapSchema BROADCAST_URL;
        public static final SnapSchema CAPTION_TEXT;
        public static final SnapSchema CONVERSATION_ID;
        public static final SnapSchema DISPLAY_TIME;
        public static final SnapSchema ES_ID;
        public static final SnapSchema FILTER_ID;
        public static final SnapSchema ID;
        public static final SnapSchema IS_LAST_SNAP_IN_STACK;
        public static final SnapSchema IS_PAID_TO_REPLAY;
        public static final SnapSchema IS_SCREENSHOTTED;
        public static final SnapSchema IS_UPDATED;
        public static final SnapSchema IS_ZIPPED;
        public static final SnapSchema MEDIA_TYPE;
        public static final SnapSchema REPLAY_PURCHASE_RECEIPT;
        public static final SnapSchema SENDER;
        public static final SnapSchema SENT_TIMESTAMP;
        public static final SnapSchema STATUS;
        public static final SnapSchema TARGET_VIEW;
        public static final SnapSchema TIMESTAMP;
        public static final SnapSchema VIEWED_TIMESTAMP;
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
            return (SnapSchema)Enum.valueOf(com/snapchat/android/database/table/ReceivedSnapTable$SnapSchema, s);
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
            TIMESTAMP = new SnapSchema("TIMESTAMP", 1, 1, "Timestamp", DataType.INTEGER);
            MEDIA_TYPE = new SnapSchema("MEDIA_TYPE", 2, 2, "MediaType", DataType.INTEGER);
            IS_ZIPPED = new SnapSchema("IS_ZIPPED", 3, 3, "IsZipped", DataType.BOOLEAN);
            STATUS = new SnapSchema("STATUS", 4, 4, "Status", DataType.TEXT);
            SENDER = new SnapSchema("SENDER", 5, 5, "Sender", DataType.TEXT);
            DISPLAY_TIME = new SnapSchema("DISPLAY_TIME", 6, 6, "DisplayTime", DataType.REAL);
            CAPTION_TEXT = new SnapSchema("CAPTION_TEXT", 7, 7, "CaptionText", DataType.TEXT);
            IS_SCREENSHOTTED = new SnapSchema("IS_SCREENSHOTTED", 8, 8, "IsScreenshotted", DataType.BOOLEAN);
            IS_UPDATED = new SnapSchema("IS_UPDATED", 9, 9, "IsUpdated", DataType.BOOLEAN);
            VIEWED_TIMESTAMP = new SnapSchema("VIEWED_TIMESTAMP", 10, 10, "ViewedTimestamp", DataType.INTEGER);
            CONVERSATION_ID = new SnapSchema("CONVERSATION_ID", 11, 11, "ConversationId", DataType.TEXT);
            SENT_TIMESTAMP = new SnapSchema("SENT_TIMESTAMP", 12, 12, "SentTimestamp", DataType.INTEGER);
            TARGET_VIEW = new SnapSchema("TARGET_VIEW", 13, 13, "TargetView", DataType.TEXT);
            BROADCAST_MEDIA_URL = new SnapSchema("BROADCAST_MEDIA_URL", 14, 14, "BroadcastMediaUrl", DataType.TEXT);
            BROADCAST_URL = new SnapSchema("BROADCAST_URL", 15, 15, "BroadcastUrl", DataType.TEXT);
            BROADCAST_TEXT = new SnapSchema("BROADCAST_TEXT", 16, 16, "BroadcastText", DataType.TEXT);
            BROADCAST_HIDE_TIMER = new SnapSchema("BROADCAST_HIDE_TIMER", 17, 17, "BroadcastHideTimer", DataType.BOOLEAN);
            FILTER_ID = new SnapSchema("FILTER_ID", 18, 18, "FilterId", DataType.TEXT);
            REPLAY_PURCHASE_RECEIPT = new SnapSchema("REPLAY_PURCHASE_RECEIPT", 19, 19, "ReplayPurchaseReceipt", DataType.TEXT);
            IS_PAID_TO_REPLAY = new SnapSchema("IS_PAID_TO_REPLAY", 20, 20, "IsPaidToReplay", DataType.BOOLEAN);
            IS_LAST_SNAP_IN_STACK = new SnapSchema("IS_LAST_SNAP_IN_STACK", 21, 21, "IsLastSnapInStack", DataType.BOOLEAN);
            BROADCAST_SECONDARY_TEXT = new SnapSchema("BROADCAST_SECONDARY_TEXT", 22, 22, "BroadcastSecondaryText", DataType.TEXT);
            ES_ID = new SnapSchema("ES_ID", 23, 23, "ESnapId", DataType.TEXT);
            $VALUES = (new SnapSchema[] {
                ID, TIMESTAMP, MEDIA_TYPE, IS_ZIPPED, STATUS, SENDER, DISPLAY_TIME, CAPTION_TEXT, IS_SCREENSHOTTED, IS_UPDATED, 
                VIEWED_TIMESTAMP, CONVERSATION_ID, SENT_TIMESTAMP, TARGET_VIEW, BROADCAST_MEDIA_URL, BROADCAST_URL, BROADCAST_TEXT, BROADCAST_HIDE_TIMER, FILTER_ID, REPLAY_PURCHASE_RECEIPT, 
                IS_PAID_TO_REPLAY, IS_LAST_SNAP_IN_STACK, BROADCAST_SECONDARY_TEXT, ES_ID
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
    private static ReceivedSnapTable b;

    private ReceivedSnapTable()
    {
    }

    public static ReceivedSnapTable a()
    {
        com/snapchat/android/database/table/ReceivedSnapTable;
        JVM INSTR monitorenter ;
        ReceivedSnapTable receivedsnaptable;
        if (b == null)
        {
            b = new ReceivedSnapTable();
        }
        receivedsnaptable = b;
        com/snapchat/android/database/table/ReceivedSnapTable;
        JVM INSTR monitorexit ;
        return receivedsnaptable;
        Exception exception;
        exception;
        throw exception;
    }

    public static Map a(SQLiteDatabase sqlitedatabase, Set set)
    {
        HashMap hashmap;
        Cursor cursor;
        hashmap = new HashMap();
        cursor = sqlitedatabase.query("ReceivedSnaps", a, null, null, null, null, null);
        if (cursor == null) goto _L2; else goto _L1
_L1:
        if (!cursor.moveToFirst()) goto _L2; else goto _L3
_L3:
        sqlitedatabase = cursor.getString(SnapSchema.TARGET_VIEW.getColumnNumber());
        if (!TextUtils.isEmpty(sqlitedatabase)) goto _L5; else goto _L4
_L4:
        sqlitedatabase = com.snapchat.android.model.Snap.TargetView.CHAT;
_L11:
        if (set == null) goto _L7; else goto _L6
_L6:
        if (!set.contains(sqlitedatabase)) goto _L8; else goto _L7
_L7:
        int i;
        long l;
        long l1;
        sqlitedatabase = cursor.getString(SnapSchema.ID.getColumnNumber());
        l = cursor.getLong(SnapSchema.TIMESTAMP.getColumnNumber());
        l1 = cursor.getLong(SnapSchema.SENT_TIMESTAMP.getColumnNumber());
        i = cursor.getInt(SnapSchema.MEDIA_TYPE.getColumnNumber());
        double d1;
        Object obj;
        Object obj1;
        String s;
        String s1;
        String s2;
        String s3;
        String s4;
        String s5;
        String s6;
        String s7;
        long l2;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        if (cursor.getInt(SnapSchema.IS_ZIPPED.getColumnNumber()) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = cursor.getString(SnapSchema.STATUS.getColumnNumber());
        obj1 = cursor.getString(SnapSchema.SENDER.getColumnNumber());
        if (cursor.getInt(SnapSchema.IS_SCREENSHOTTED.getColumnNumber()) == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        d1 = cursor.getDouble(SnapSchema.DISPLAY_TIME.getColumnNumber());
        s = cursor.getString(SnapSchema.CAPTION_TEXT.getColumnNumber());
        l2 = cursor.getLong(SnapSchema.VIEWED_TIMESTAMP.getColumnNumber());
        s1 = cursor.getString(SnapSchema.FILTER_ID.getColumnNumber());
        s2 = cursor.getString(SnapSchema.REPLAY_PURCHASE_RECEIPT.getColumnNumber());
        if (cursor.getInt(SnapSchema.IS_PAID_TO_REPLAY.getColumnNumber()) == 1)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (cursor.getInt(SnapSchema.IS_LAST_SNAP_IN_STACK.getColumnNumber()) == 1)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        s3 = cursor.getString(SnapSchema.ES_ID.getColumnNumber());
        s4 = cursor.getString(SnapSchema.BROADCAST_MEDIA_URL.getColumnNumber());
        s5 = cursor.getString(SnapSchema.BROADCAST_URL.getColumnNumber());
        s6 = cursor.getString(SnapSchema.BROADCAST_TEXT.getColumnNumber());
        s7 = cursor.getString(SnapSchema.BROADCAST_SECONDARY_TEXT.getColumnNumber());
        if (cursor.getInt(SnapSchema.BROADCAST_HIDE_TIMER.getColumnNumber()) == 1)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        if (cursor.getInt(SnapSchema.IS_UPDATED.getColumnNumber()) == 1)
        {
            flag5 = true;
        } else
        {
            flag5 = false;
        }
        if (s5 != null) goto _L10; else goto _L9
_L9:
        sqlitedatabase = new AT(sqlitedatabase, l, l1, l2, i, flag, com.snapchat.android.model.Snap.ClientSnapStatus.fromString(((String) (obj))), ((String) (obj1)), d1, s, flag1, s1, s2, flag2, flag3, s3);
_L12:
        sqlitedatabase.a(flag5);
        s = cursor.getString(SnapSchema.CONVERSATION_ID.getColumnNumber());
        obj1 = (List)hashmap.get(s);
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_536;
        }
        obj = new ArrayList();
        ((List) (obj)).add(sqlitedatabase);
        hashmap.put(s, obj);
_L8:
        flag = cursor.moveToNext();
        if (flag) goto _L3; else goto _L2
_L2:
        if (cursor != null)
        {
            cursor.close();
        }
        return hashmap;
_L5:
        sqlitedatabase = com.snapchat.android.model.Snap.TargetView.valueOf(sqlitedatabase);
          goto _L11
_L10:
        sqlitedatabase = new AB(sqlitedatabase, l, l1, i, flag, com.snapchat.android.model.Snap.ClientSnapStatus.fromString(((String) (obj))), ((String) (obj1)), d1, s, s4, s6, s7, s5, flag4, s1, s2, flag2, flag3, s3);
          goto _L12
        sqlitedatabase;
        if (cursor != null)
        {
            cursor.close();
        }
        throw sqlitedatabase;
          goto _L11
    }

    public static void a(SQLiteDatabase sqlitedatabase, String s, AT at, com.snapchat.android.model.Snap.TargetView targetview)
    {
        boolean flag = true;
        if (at == null || TextUtils.isEmpty(s))
        {
            return;
        }
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(SnapSchema.ID.getColumnName(), at.d());
        contentvalues.put(SnapSchema.TIMESTAMP.getColumnName(), Long.valueOf(at.X()));
        contentvalues.put(SnapSchema.SENT_TIMESTAMP.getColumnName(), Long.valueOf(at.W()));
        contentvalues.put(SnapSchema.CAPTION_TEXT.getColumnName(), at.V());
        String s2 = at.j();
        String s1 = s2;
        if (TextUtils.isEmpty(s2))
        {
            s1 = "";
        }
        contentvalues.put(SnapSchema.SENDER.getColumnName(), s1);
        contentvalues.put(SnapSchema.MEDIA_TYPE.getColumnName(), Integer.valueOf(at.am()));
        s1 = SnapSchema.IS_ZIPPED.getColumnName();
        int i;
        if (at.h())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        contentvalues.put(s1, Integer.valueOf(i));
        contentvalues.put(SnapSchema.STATUS.getColumnName(), at.aj().name());
        s1 = SnapSchema.IS_SCREENSHOTTED.getColumnName();
        if (at.as())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        contentvalues.put(s1, Integer.valueOf(i));
        contentvalues.put(SnapSchema.DISPLAY_TIME.getColumnName(), Double.valueOf(at.G()));
        s1 = SnapSchema.IS_UPDATED.getColumnName();
        if (at.g())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        contentvalues.put(s1, Integer.valueOf(i));
        contentvalues.put(SnapSchema.CONVERSATION_ID.getColumnName(), s);
        contentvalues.put(SnapSchema.TARGET_VIEW.getColumnName(), targetview.name());
        contentvalues.put(SnapSchema.VIEWED_TIMESTAMP.getColumnName(), Long.valueOf(at.F()));
        contentvalues.put(SnapSchema.IS_PAID_TO_REPLAY.getColumnName(), Boolean.valueOf(at.mIsPaidToReplay));
        contentvalues.put(SnapSchema.IS_LAST_SNAP_IN_STACK.getColumnName(), Boolean.valueOf(at.mIsLastSnapInStack));
        contentvalues.put(SnapSchema.ES_ID.getColumnName(), at.mEsId);
        if (!TextUtils.isEmpty(at.H()))
        {
            contentvalues.put(SnapSchema.FILTER_ID.getColumnName(), at.H());
        }
        if (!TextUtils.isEmpty(at.mReplayPurchaseReceipt))
        {
            contentvalues.put(SnapSchema.REPLAY_PURCHASE_RECEIPT.getColumnName(), at.mReplayPurchaseReceipt);
        }
        if (at instanceof AB)
        {
            contentvalues.put(SnapSchema.BROADCAST_MEDIA_URL.getColumnName(), ((AB)at).mMediaUrl);
            contentvalues.put(SnapSchema.BROADCAST_URL.getColumnName(), ((AB)at).mActionUrl);
            contentvalues.put(SnapSchema.BROADCAST_TEXT.getColumnName(), ((AB)at).mActionText);
            s = SnapSchema.BROADCAST_HIDE_TIMER.getColumnName();
            if (at.e())
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 0;
            }
            contentvalues.put(s, Integer.valueOf(i));
        }
        sqlitedatabase.insertWithOnConflict("ReceivedSnaps", null, contentvalues, 5);
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
        return "ReceivedSnaps";
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
