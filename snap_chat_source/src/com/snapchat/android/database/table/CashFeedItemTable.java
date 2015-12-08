// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import Br;
import Bt;
import IO;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.snapchat.android.Timber;
import com.snapchat.android.database.DataType;
import com.snapchat.android.database.DatabaseHelper;
import com.snapchat.android.model.CashTransaction;
import com.snapchat.android.model.chat.CashFeedItem;
import com.snapchat.android.model.chat.StatefulChatFeedItem;
import com.snapchat.android.util.debug.ReleaseManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tt;

// Referenced classes of package com.snapchat.android.database.table:
//            DbTable

public class CashFeedItemTable extends DbTable
{
    public static final class CashSchema extends Enum
        implements tt
    {

        private static final CashSchema $VALUES[];
        public static final CashSchema AMOUNT;
        public static final CashSchema CURRENCY_CODE;
        public static final CashSchema ID;
        public static final CashSchema IS_FAIL_SEND_RELEASE_MESSAGE;
        public static final CashSchema IS_FROM_SERVER;
        public static final CashSchema IS_SAVED_BY_RECIPIENT;
        public static final CashSchema IS_SAVED_BY_SENDER;
        public static final CashSchema IS_VIEWED_BY_RECIPIENT;
        public static final CashSchema IS_VIEWED_BY_SENDER;
        public static final CashSchema ITER_TOKEN;
        public static final CashSchema PROVIDER;
        public static final CashSchema RECIPIENT;
        public static final CashSchema RECIPIENT_ID;
        public static final CashSchema RECIPIENT_SAVE_VERSION;
        public static final CashSchema SENDER;
        public static final CashSchema SENDER_ID;
        public static final CashSchema SENDER_SAVE_VERSION;
        public static final CashSchema SEND_RECEIVE_STATUS;
        public static final CashSchema STATUS;
        public static final CashSchema TARGET_VIEW;
        public static final CashSchema TIMESTAMP;
        public static final CashSchema UPDATED_TIMESTAMP;
        public static final CashSchema USER_TEXT;
        private int a;
        private String b;
        private DataType c;
        private String d;

        static String a(CashSchema cashschema)
        {
            return cashschema.b;
        }

        static DataType b(CashSchema cashschema)
        {
            return cashschema.c;
        }

        public static CashSchema valueOf(String s)
        {
            return (CashSchema)Enum.valueOf(com/snapchat/android/database/table/CashFeedItemTable$CashSchema, s);
        }

        public static CashSchema[] values()
        {
            return (CashSchema[])$VALUES.clone();
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
            ID = new CashSchema("ID", "_id", DataType.TEXT, "PRIMARY KEY");
            RECIPIENT = new CashSchema("RECIPIENT", 1, 1, "recipient", DataType.TEXT);
            SENDER = new CashSchema("SENDER", 2, 2, "sender", DataType.TEXT);
            RECIPIENT_ID = new CashSchema("RECIPIENT_ID", 3, 3, "recipient_id", DataType.TEXT);
            SENDER_ID = new CashSchema("SENDER_ID", 4, 4, "sender_id", DataType.TEXT);
            AMOUNT = new CashSchema("AMOUNT", 5, 5, "amount", DataType.INTEGER);
            CURRENCY_CODE = new CashSchema("CURRENCY_CODE", 6, 6, "currency_code", DataType.TEXT);
            USER_TEXT = new CashSchema("USER_TEXT", 7, 7, "text", DataType.TEXT);
            IS_VIEWED_BY_SENDER = new CashSchema("IS_VIEWED_BY_SENDER", 8, 8, "sender_viewed", DataType.BOOLEAN);
            IS_VIEWED_BY_RECIPIENT = new CashSchema("IS_VIEWED_BY_RECIPIENT", 9, 9, "recipient_viewed", DataType.BOOLEAN);
            IS_SAVED_BY_SENDER = new CashSchema("IS_SAVED_BY_SENDER", 10, 10, "sender_saved", DataType.BOOLEAN);
            IS_SAVED_BY_RECIPIENT = new CashSchema("IS_SAVED_BY_RECIPIENT", 11, 11, "recipient_saved", DataType.BOOLEAN);
            SENDER_SAVE_VERSION = new CashSchema("SENDER_SAVE_VERSION", 12, 12, "sender_save_version", DataType.INTEGER);
            RECIPIENT_SAVE_VERSION = new CashSchema("RECIPIENT_SAVE_VERSION", 13, 13, "recipient_save_version", DataType.INTEGER);
            STATUS = new CashSchema("STATUS", 14, 14, "status", DataType.TEXT);
            TIMESTAMP = new CashSchema("TIMESTAMP", 15, 15, "timestamp", DataType.INTEGER);
            UPDATED_TIMESTAMP = new CashSchema("UPDATED_TIMESTAMP", 16, 16, "updated_timestamp", DataType.INTEGER);
            IS_FROM_SERVER = new CashSchema("IS_FROM_SERVER", 17, 17, "is_from_server", DataType.BOOLEAN);
            ITER_TOKEN = new CashSchema("ITER_TOKEN", 18, 18, "iter_token", DataType.TEXT);
            TARGET_VIEW = new CashSchema("TARGET_VIEW", 19, 19, "target_view", DataType.TEXT);
            SEND_RECEIVE_STATUS = new CashSchema("SEND_RECEIVE_STATUS", 20, 20, "send_receive_status", DataType.TEXT);
            PROVIDER = new CashSchema("PROVIDER", 21, 21, "provider", DataType.TEXT);
            IS_FAIL_SEND_RELEASE_MESSAGE = new CashSchema("IS_FAIL_SEND_RELEASE_MESSAGE", 22, 22, "fail_send_release_message", DataType.BOOLEAN);
            $VALUES = (new CashSchema[] {
                ID, RECIPIENT, SENDER, RECIPIENT_ID, SENDER_ID, AMOUNT, CURRENCY_CODE, USER_TEXT, IS_VIEWED_BY_SENDER, IS_VIEWED_BY_RECIPIENT, 
                IS_SAVED_BY_SENDER, IS_SAVED_BY_RECIPIENT, SENDER_SAVE_VERSION, RECIPIENT_SAVE_VERSION, STATUS, TIMESTAMP, UPDATED_TIMESTAMP, IS_FROM_SERVER, ITER_TOKEN, TARGET_VIEW, 
                SEND_RECEIVE_STATUS, PROVIDER, IS_FAIL_SEND_RELEASE_MESSAGE
            });
        }

        private CashSchema(String s, int i, int j, String s1, DataType datatype)
        {
            super(s, i);
            a = j;
            b = s1;
            c = datatype;
        }

        private CashSchema(String s, String s1, DataType datatype, String s2)
        {
            super(s, 0);
            a = 0;
            b = s1;
            c = datatype;
            d = s2;
        }
    }


    public static final String a[];
    private static final String b = com/snapchat/android/database/table/CashFeedItemTable.getSimpleName();
    private static HashMap c;
    private static CashFeedItemTable d;
    private static ConcurrentHashMap e = new ConcurrentHashMap();
    private static ConcurrentHashMap f = new ConcurrentHashMap();

    private CashFeedItemTable()
    {
    }

    public static CashFeedItemTable a()
    {
        com/snapchat/android/database/table/CashFeedItemTable;
        JVM INSTR monitorenter ;
        CashFeedItemTable cashfeeditemtable;
        if (d == null)
        {
            d = new CashFeedItemTable();
        }
        cashfeeditemtable = d;
        com/snapchat/android/database/table/CashFeedItemTable;
        JVM INSTR monitorexit ;
        return cashfeeditemtable;
        Exception exception;
        exception;
        throw exception;
    }

    public static Map a(SQLiteDatabase sqlitedatabase, Set set)
    {
        HashMap hashmap;
        Cursor cursor;
        hashmap = new HashMap();
        cursor = sqlitedatabase.query("CashFeedItem", a, null, null, null, null, null);
        if (cursor == null) goto _L2; else goto _L1
_L1:
        if (!cursor.moveToFirst()) goto _L2; else goto _L3
_L3:
        sqlitedatabase = cursor.getString(CashSchema.TARGET_VIEW.getColumnNumber());
        if (!TextUtils.isEmpty(sqlitedatabase)) goto _L5; else goto _L4
_L4:
        sqlitedatabase = com.snapchat.android.model.Snap.TargetView.CHAT;
_L11:
        if (set == null) goto _L7; else goto _L6
_L6:
        if (!set.contains(sqlitedatabase)) goto _L8; else goto _L7
_L7:
        Object obj1;
        String s;
        String s1;
        String s2;
        String s3;
        String s4;
        String s5;
        Object obj2;
        String s6;
        int i;
        long l;
        long l1;
        obj1 = cursor.getString(CashSchema.ID.getColumnNumber());
        obj2 = cursor.getString(CashSchema.SENDER.getColumnNumber());
        s6 = cursor.getString(CashSchema.RECIPIENT.getColumnNumber());
        s = cursor.getString(CashSchema.SENDER_ID.getColumnNumber());
        s1 = cursor.getString(CashSchema.RECIPIENT_ID.getColumnNumber());
        s2 = cursor.getString(CashSchema.USER_TEXT.getColumnNumber());
        i = cursor.getInt(CashSchema.AMOUNT.getColumnNumber());
        s3 = cursor.getString(CashSchema.CURRENCY_CODE.getColumnNumber());
        l = cursor.getLong(CashSchema.TIMESTAMP.getColumnNumber());
        l1 = cursor.getLong(CashSchema.UPDATED_TIMESTAMP.getColumnNumber());
        s4 = cursor.getString(CashSchema.STATUS.getColumnNumber());
        sqlitedatabase = cursor.getString(CashSchema.SEND_RECEIVE_STATUS.getColumnNumber());
        s5 = cursor.getString(CashSchema.PROVIDER.getColumnNumber());
        Object obj;
        int j;
        int k;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        if (cursor.getInt(CashSchema.IS_FROM_SERVER.getColumnNumber()) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (cursor.getInt(CashSchema.IS_VIEWED_BY_SENDER.getColumnNumber()) == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (cursor.getInt(CashSchema.IS_VIEWED_BY_RECIPIENT.getColumnNumber()) == 1)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (cursor.getInt(CashSchema.IS_SAVED_BY_SENDER.getColumnNumber()) == 1)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (cursor.getInt(CashSchema.IS_SAVED_BY_RECIPIENT.getColumnNumber()) == 1)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        if (cursor.getInt(CashSchema.IS_FAIL_SEND_RELEASE_MESSAGE.getColumnNumber()) == 1)
        {
            flag5 = true;
        } else
        {
            flag5 = false;
        }
        j = cursor.getInt(CashSchema.SENDER_SAVE_VERSION.getColumnNumber());
        k = cursor.getInt(CashSchema.RECIPIENT_SAVE_VERSION.getColumnNumber());
        obj = cursor.getString(CashSchema.ITER_TOKEN.getColumnNumber());
        obj2 = new com.snapchat.android.model.CashTransaction.a(((String) (obj2)), s6, i);
        obj2.mId = ((String) (obj1));
        obj2.mProvider = s5;
        obj2.mCashSenderId = s;
        obj2.mCashRecipientId = s1;
        obj2.mCurrencyCode = com.snapchat.android.util.CashUtils.CurrencyCode.valueOf(s3);
        obj2.mMessage = s2;
        obj2.mCreatedAt = l;
        obj2.mUpdatedAt = l1;
        obj2.mStatus = com.snapchat.android.model.CashTransaction.TransactionStatus.valueOf(s4);
        obj2.mIsFromServer = flag;
        obj1 = ((com.snapchat.android.model.CashTransaction.a) (obj2)).a();
        obj1.mIsViewedBySender = flag1;
        obj1.mIsViewedByRecipient = flag2;
        obj1.mIsSavedBySender = flag3;
        obj1.mIsSavedByRecipient = flag4;
        obj1.mSenderSaveVersion = j;
        obj1.mRecipientSaveVersion = k;
        obj1.mFailToSendReleaseMessage = flag5;
        obj1 = new CashFeedItem(((CashTransaction) (obj1)));
        obj1.mIterToken = ((String) (obj));
        obj = com.snapchat.android.model.chat.StatefulChatFeedItem.SendReceiveStatus.valueOf(sqlitedatabase);
        if (!((com.snapchat.android.model.chat.StatefulChatFeedItem.SendReceiveStatus) (obj)).equals(com.snapchat.android.model.chat.StatefulChatFeedItem.SendReceiveStatus.SENDING)) goto _L10; else goto _L9
_L9:
        sqlitedatabase = com.snapchat.android.model.chat.StatefulChatFeedItem.SendReceiveStatus.FAILED;
_L13:
        obj1.mSendReceiveStatus = sqlitedatabase;
        s = ((CashFeedItem) (obj1)).ac();
        obj = (List)hashmap.get(s);
        sqlitedatabase = ((SQLiteDatabase) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_658;
        }
        sqlitedatabase = new ArrayList();
        sqlitedatabase.add(obj1);
        hashmap.put(s, sqlitedatabase);
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
        sqlitedatabase = ((SQLiteDatabase) (obj));
        if (!((com.snapchat.android.model.chat.StatefulChatFeedItem.SendReceiveStatus) (obj)).equals(com.snapchat.android.model.chat.StatefulChatFeedItem.SendReceiveStatus.RECEIVING)) goto _L13; else goto _L12
_L12:
        sqlitedatabase = com.snapchat.android.model.chat.StatefulChatFeedItem.SendReceiveStatus.RECEIVED;
          goto _L13
        sqlitedatabase;
        if (cursor != null)
        {
            cursor.close();
        }
        throw sqlitedatabase;
          goto _L11
    }

    public static void a(Context context)
    {
        context = DatabaseHelper.a(context).getWritableDatabase();
        context.beginTransaction();
        Timber.b(b, "CASH-LOG: Deleting all cash feed icons", new Object[0]);
        context.delete("CashFeedItem", (new StringBuilder()).append(CashSchema.TARGET_VIEW.getColumnName()).append("=?").toString(), new String[] {
            com.snapchat.android.model.Snap.TargetView.FEED.name()
        });
        context.setTransactionSuccessful();
        context.endTransaction();
        return;
        Exception exception;
        exception;
        context.endTransaction();
        throw exception;
    }

    public static void a(Context context, CashFeedItem cashfeeditem)
    {
        com/snapchat/android/database/table/CashFeedItemTable;
        JVM INSTR monitorenter ;
        (new AsyncTask(context, cashfeeditem) {

            private Context a;
            private CashFeedItem b;

            private transient Void a()
            {
                SQLiteDatabase sqlitedatabase;
                sqlitedatabase = DatabaseHelper.a(a).getWritableDatabase();
                sqlitedatabase.beginTransaction();
                Cursor cursor = sqlitedatabase.query("CashFeedItem", CashFeedItemTable.a, (new StringBuilder()).append(CashSchema.ID.getColumnName()).append("=? AND ").append(CashSchema.TARGET_VIEW.getColumnName()).append("=?").toString(), new String[] {
                    b.d(), com.snapchat.android.model.Snap.TargetView.CHAT.name()
                }, null, null, null);
                if (cursor == null) goto _L2; else goto _L1
_L1:
                int i;
                i = cursor.getCount();
                cursor.close();
                if (i <= 0)
                {
                    break MISSING_BLOCK_LABEL_190;
                }
                ContentValues contentvalues = new ContentValues();
                contentvalues.put(CashSchema.TARGET_VIEW.getColumnName(), com.snapchat.android.model.Snap.TargetView.CHAT_AND_FEED.name());
                sqlitedatabase.update("CashFeedItem", contentvalues, (new StringBuilder()).append(CashSchema.ID.getColumnName()).append("=?").toString(), new String[] {
                    b.d()
                });
_L3:
                sqlitedatabase.setTransactionSuccessful();
_L2:
                sqlitedatabase.endTransaction();
                return null;
                CashFeedItemTable.a(sqlitedatabase, b, com.snapchat.android.model.Snap.TargetView.FEED);
                  goto _L3
                Exception exception;
                exception;
                sqlitedatabase.endTransaction();
                throw exception;
            }

            protected final Object doInBackground(Object aobj[])
            {
                return a();
            }

            
            {
                a = context;
                b = cashfeeditem;
                super();
            }
        }).executeOnExecutor(IO.SERIAL_EXECUTOR_FOR_SQL_WRITE_OPS, new Void[0]);
        com/snapchat/android/database/table/CashFeedItemTable;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public static void a(Context context, Collection collection)
    {
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            CashFeedItem cashfeeditem = (CashFeedItem)collection.next();
            if (!cashfeeditem.mCashTransaction.mIsInFlight)
            {
                e.put(cashfeeditem.d(), cashfeeditem);
            }
        } while (true);
        if (context == null)
        {
            return;
        } else
        {
            b(context);
            return;
        }
    }

    protected static void a(SQLiteDatabase sqlitedatabase, CashFeedItem cashfeeditem, com.snapchat.android.model.Snap.TargetView targetview)
    {
        boolean flag = true;
        if (cashfeeditem == null)
        {
            return;
        }
        CashTransaction cashtransaction = cashfeeditem.mCashTransaction;
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(CashSchema.ID.getColumnName(), cashfeeditem.d());
        contentvalues.put(CashSchema.RECIPIENT.getColumnName(), cashfeeditem.ad());
        contentvalues.put(CashSchema.SENDER.getColumnName(), cashfeeditem.j());
        contentvalues.put(CashSchema.RECIPIENT_ID.getColumnName(), cashtransaction.mCashRecipientId);
        contentvalues.put(CashSchema.SENDER_ID.getColumnName(), cashtransaction.mCashSenderId);
        contentvalues.put(CashSchema.AMOUNT.getColumnName(), Integer.valueOf(cashfeeditem.mCashTransaction.mAmount));
        contentvalues.put(CashSchema.CURRENCY_CODE.getColumnName(), cashtransaction.mCurrencyCode.name());
        contentvalues.put(CashSchema.USER_TEXT.getColumnName(), cashfeeditem.an());
        String s = CashSchema.IS_VIEWED_BY_SENDER.getColumnName();
        int i;
        if (cashtransaction.mIsViewedBySender)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        contentvalues.put(s, Integer.valueOf(i));
        s = CashSchema.IS_VIEWED_BY_RECIPIENT.getColumnName();
        if (cashtransaction.mIsViewedByRecipient)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        contentvalues.put(s, Integer.valueOf(i));
        s = CashSchema.IS_SAVED_BY_SENDER.getColumnName();
        if (cashtransaction.mIsSavedBySender)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        contentvalues.put(s, Integer.valueOf(i));
        s = CashSchema.IS_SAVED_BY_RECIPIENT.getColumnName();
        if (cashtransaction.mIsSavedByRecipient)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        contentvalues.put(s, Integer.valueOf(i));
        contentvalues.put(CashSchema.SENDER_SAVE_VERSION.getColumnName(), Integer.valueOf(cashtransaction.mSenderSaveVersion));
        contentvalues.put(CashSchema.RECIPIENT_SAVE_VERSION.getColumnName(), Integer.valueOf(cashtransaction.mRecipientSaveVersion));
        contentvalues.put(CashSchema.STATUS.getColumnName(), cashtransaction.mTransactionStatus.name());
        contentvalues.put(CashSchema.TIMESTAMP.getColumnName(), Long.valueOf(cashtransaction.mCreatedTimestamp));
        contentvalues.put(CashSchema.UPDATED_TIMESTAMP.getColumnName(), Long.valueOf(cashtransaction.mUpdatedTimestamp));
        s = CashSchema.IS_FROM_SERVER.getColumnName();
        if (cashtransaction.mIsFromServer)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        contentvalues.put(s, Integer.valueOf(i));
        contentvalues.put(CashSchema.ITER_TOKEN.getColumnName(), cashfeeditem.l());
        contentvalues.put(CashSchema.TARGET_VIEW.getColumnName(), targetview.name());
        contentvalues.put(CashSchema.SEND_RECEIVE_STATUS.getColumnName(), ((StatefulChatFeedItem) (cashfeeditem)).mSendReceiveStatus.name());
        contentvalues.put(CashSchema.PROVIDER.getColumnName(), cashfeeditem.mCashTransaction.mProvider);
        cashfeeditem = CashSchema.IS_FAIL_SEND_RELEASE_MESSAGE.getColumnName();
        if (cashtransaction.mFailToSendReleaseMessage)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        contentvalues.put(cashfeeditem, Integer.valueOf(i));
        sqlitedatabase.insertWithOnConflict("CashFeedItem", "NULL", contentvalues, 5);
    }

    public static void b(Context context)
    {
        com/snapchat/android/database/table/CashFeedItemTable;
        JVM INSTR monitorenter ;
        if (!e.isEmpty()) goto _L2; else goto _L1
_L1:
        boolean flag = f.isEmpty();
        if (!flag) goto _L2; else goto _L3
_L3:
        com/snapchat/android/database/table/CashFeedItemTable;
        JVM INSTR monitorexit ;
        return;
_L2:
        (new AsyncTask(context) {

            private Context a;

            private transient Void a()
            {
                SQLiteDatabase sqlitedatabase;
                sqlitedatabase = DatabaseHelper.a(a).getWritableDatabase();
                sqlitedatabase.beginTransaction();
                Object obj;
                obj = new HashSet();
                java.util.Map.Entry entry;
                for (Iterator iterator = CashFeedItemTable.f().entrySet().iterator(); iterator.hasNext(); CashFeedItemTable.a(sqlitedatabase, (CashFeedItem)entry.getValue(), com.snapchat.android.model.Snap.TargetView.CHAT))
                {
                    entry = (java.util.Map.Entry)iterator.next();
                    if (ReleaseManager.f())
                    {
                        Timber.b(CashFeedItemTable.g(), (new StringBuilder("CASH-LOG: Saving a cash feed item with ID ")).append((String)entry.getKey()).toString(), new Object[0]);
                    }
                    ((Set) (obj)).add(entry.getKey());
                }

                break MISSING_BLOCK_LABEL_137;
                obj;
                sqlitedatabase.endTransaction();
                throw obj;
                HashSet hashset;
                if (!((Set) (obj)).isEmpty())
                {
                    Bt.ay();
                }
                hashset = new HashSet();
                java.util.Map.Entry entry1;
                for (Iterator iterator1 = CashFeedItemTable.h().entrySet().iterator(); iterator1.hasNext(); sqlitedatabase.delete("CashFeedItem", (new StringBuilder()).append(CashSchema.ID.getColumnName()).append("=?").toString(), new String[] {
            ((CashFeedItem)entry1.getValue()).d()
        }))
                {
                    entry1 = (java.util.Map.Entry)iterator1.next();
                    if (ReleaseManager.f())
                    {
                        Timber.b(CashFeedItemTable.g(), (new StringBuilder("CASH-LOG: Deleting a cash feed item with ID ")).append((String)entry1.getKey()).toString(), new Object[0]);
                    }
                    hashset.add(entry1.getKey());
                }

                CashFeedItemTable.f().keySet().removeAll(((Collection) (obj)));
                CashFeedItemTable.h().keySet().removeAll(hashset);
                sqlitedatabase.setTransactionSuccessful();
                sqlitedatabase.endTransaction();
                return null;
            }

            protected final Object doInBackground(Object aobj[])
            {
                return a();
            }

            
            {
                a = context;
                super();
            }
        }).executeOnExecutor(IO.SERIAL_EXECUTOR_FOR_SQL_WRITE_OPS, new Void[0]);
        if (true) goto _L3; else goto _L4
_L4:
        context;
        throw context;
    }

    public static void b(Context context, Collection collection)
    {
        CashFeedItem cashfeeditem;
        for (collection = collection.iterator(); collection.hasNext(); f.put(cashfeeditem.d(), cashfeeditem))
        {
            cashfeeditem = (CashFeedItem)collection.next();
        }

        if (context == null)
        {
            return;
        } else
        {
            b(context);
            return;
        }
    }

    static ConcurrentHashMap f()
    {
        return e;
    }

    static String g()
    {
        return b;
    }

    static ConcurrentHashMap h()
    {
        return f;
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
        return CashSchema.values();
    }

    public final String c()
    {
        return "CashFeedItem";
    }

    public final String d()
    {
        StringBuilder stringbuilder = new StringBuilder();
        CashSchema acashschema[] = CashSchema.values();
        int j = acashschema.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = acashschema[i];
            if (i > 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append((new StringBuilder()).append(CashSchema.a(((CashSchema) (obj)))).append(" ").append(CashSchema.b(((CashSchema) (obj))).toString()).toString());
            obj = ((CashSchema) (obj)).getConstraints();
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
        boolean flag = false;
        CashSchema acashschema[] = CashSchema.values();
        int k = acashschema.length;
        a = new String[k];
        for (int i = 0; i < k; i++)
        {
            a[i] = acashschema[i].getColumnName();
        }

        c = new HashMap();
        acashschema = CashSchema.values();
        k = acashschema.length;
        for (int j = ((flag) ? 1 : 0); j < k; j++)
        {
            CashSchema cashschema = acashschema[j];
            c.put(cashschema.getColumnName(), cashschema.getColumnName());
        }

    }
}
