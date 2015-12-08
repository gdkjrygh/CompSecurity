// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import AT;
import AY;
import Br;
import Bt;
import By;
import KH;
import KQ;
import Mf;
import NG;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.database.DataType;
import com.snapchat.android.database.DatabaseHelper;
import com.snapchat.android.database.SharedPreferenceKey;
import com.snapchat.android.model.Snap;
import com.snapchat.android.model.chat.CashFeedItem;
import com.snapchat.android.model.chat.Chat;
import com.snapchat.android.model.chat.ChatConversation;
import com.snapchat.android.model.chat.ChatFeedItem;
import com.snapchat.android.util.debug.ReleaseManager;
import com.squareup.otto.Bus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import lo;
import tt;

// Referenced classes of package com.snapchat.android.database.table:
//            DbTable, ChatsReceivedInLastHourTable, ClearedChatIdsTable, SentSnapTable, 
//            ReceivedSnapTable, ChatTable, CashFeedItemTable

public final class ConversationTable extends DbTable
{
    public static final class ConversationSchema extends Enum
        implements tt
    {

        private static final ConversationSchema $VALUES[];
        public static final ConversationSchema CHATS_ITER_TOKEN;
        public static final ConversationSchema CONVERSATION_INTERACTION_EVENT_TYPE;
        public static final ConversationSchema HAS_UNVIEWED_AUDIO_SNAPS;
        public static final ConversationSchema HAS_UNVIEWED_CASH;
        public static final ConversationSchema HAS_UNVIEWED_CHATS;
        public static final ConversationSchema HAS_UNVIEWED_SNAPS;
        public static final ConversationSchema ID;
        public static final ConversationSchema ITER_TOKEN;
        public static final ConversationSchema LAST_SEQ_NUM_OF_MY_CHAT_I_DELETED;
        public static final ConversationSchema LAST_SEQ_NUM_OF_MY_CHAT_THEY_RELEASED;
        public static final ConversationSchema LAST_SEQ_NUM_OF_THEIR_CHAT_I_DELETED;
        public static final ConversationSchema LAST_SEQ_NUM_OF_THEIR_CHAT_I_RELEASED;
        public static final ConversationSchema LAST_TIMESTAMP_OF_RECEIVED_SNAP_READ_RECEIPT_I_DELETED;
        public static final ConversationSchema LAST_TIMESTAMP_OF_SENT_SNAP_READ_RECEIPT_I_DELETED;
        public static final ConversationSchema MY_LAST_ACKED_SEQ_NUM;
        public static final ConversationSchema MY_LAST_SEQ_NUM;
        public static final ConversationSchema RECIPIENT;
        public static final ConversationSchema SENDER;
        public static final ConversationSchema SEQ_NUM_STATE;
        public static final ConversationSchema THEIR_LAST_SEQ_NUM;
        public static final ConversationSchema TIMESTAMP;
        private int a;
        private String b;
        private DataType c;
        private String d;

        static String a(ConversationSchema conversationschema)
        {
            return conversationschema.b;
        }

        static DataType b(ConversationSchema conversationschema)
        {
            return conversationschema.c;
        }

        public static ConversationSchema valueOf(String s)
        {
            return (ConversationSchema)Enum.valueOf(com/snapchat/android/database/table/ConversationTable$ConversationSchema, s);
        }

        public static ConversationSchema[] values()
        {
            return (ConversationSchema[])$VALUES.clone();
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
            ID = new ConversationSchema("ID", "_id", DataType.TEXT, "PRIMARY KEY");
            SENDER = new ConversationSchema("SENDER", 1, 1, "sender", DataType.TEXT);
            RECIPIENT = new ConversationSchema("RECIPIENT", 2, 2, "recipient", DataType.TEXT);
            TIMESTAMP = new ConversationSchema("TIMESTAMP", 3, 3, "timestamp", DataType.INTEGER);
            HAS_UNVIEWED_CHATS = new ConversationSchema("HAS_UNVIEWED_CHATS", 4, 4, "has_unviewed_chats", DataType.BOOLEAN);
            HAS_UNVIEWED_SNAPS = new ConversationSchema("HAS_UNVIEWED_SNAPS", 5, 5, "has_unviewed_snaps", DataType.BOOLEAN);
            HAS_UNVIEWED_AUDIO_SNAPS = new ConversationSchema("HAS_UNVIEWED_AUDIO_SNAPS", 6, 6, "has_unviewed_audio_snap", DataType.BOOLEAN);
            HAS_UNVIEWED_CASH = new ConversationSchema("HAS_UNVIEWED_CASH", 7, 7, "has_unviewed_cash", DataType.BOOLEAN);
            ITER_TOKEN = new ConversationSchema("ITER_TOKEN", 8, 8, "iter_token", DataType.TEXT);
            CHATS_ITER_TOKEN = new ConversationSchema("CHATS_ITER_TOKEN", 9, 9, "chats_iter_token", DataType.TEXT);
            LAST_SEQ_NUM_OF_MY_CHAT_THEY_RELEASED = new ConversationSchema("LAST_SEQ_NUM_OF_MY_CHAT_THEY_RELEASED", 10, 10, "last_seq_num_of_my_chat_they_released", DataType.INTEGER);
            LAST_SEQ_NUM_OF_THEIR_CHAT_I_RELEASED = new ConversationSchema("LAST_SEQ_NUM_OF_THEIR_CHAT_I_RELEASED", 11, 11, "last_seq_num_of_their_chat_i_released", DataType.INTEGER);
            LAST_SEQ_NUM_OF_MY_CHAT_I_DELETED = new ConversationSchema("LAST_SEQ_NUM_OF_MY_CHAT_I_DELETED", 12, 12, "last_seq_num_of_my_chat_i_deleted", DataType.INTEGER);
            LAST_SEQ_NUM_OF_THEIR_CHAT_I_DELETED = new ConversationSchema("LAST_SEQ_NUM_OF_THEIR_CHAT_I_DELETED", 13, 13, "last_seq_num_of_their_chat_i_deleted", DataType.INTEGER);
            LAST_TIMESTAMP_OF_SENT_SNAP_READ_RECEIPT_I_DELETED = new ConversationSchema("LAST_TIMESTAMP_OF_SENT_SNAP_READ_RECEIPT_I_DELETED", 14, 14, "last_timestamp_of_sent_snap_read_receipt_i_deleted", DataType.INTEGER);
            LAST_TIMESTAMP_OF_RECEIVED_SNAP_READ_RECEIPT_I_DELETED = new ConversationSchema("LAST_TIMESTAMP_OF_RECEIVED_SNAP_READ_RECEIPT_I_DELETED", 15, 15, "last_timestamp_of_received_snap_read_receipt_i_deleted", DataType.INTEGER);
            MY_LAST_SEQ_NUM = new ConversationSchema("MY_LAST_SEQ_NUM", 16, 16, "my_last_seq_num", DataType.INTEGER);
            THEIR_LAST_SEQ_NUM = new ConversationSchema("THEIR_LAST_SEQ_NUM", 17, 17, "their_last_seq_num", DataType.INTEGER);
            MY_LAST_ACKED_SEQ_NUM = new ConversationSchema("MY_LAST_ACKED_SEQ_NUM", 18, 18, "my_last_acked_seq_num", DataType.INTEGER);
            SEQ_NUM_STATE = new ConversationSchema("SEQ_NUM_STATE", 19, 19, "seq_num_state", DataType.TEXT);
            CONVERSATION_INTERACTION_EVENT_TYPE = new ConversationSchema("CONVERSATION_INTERACTION_EVENT_TYPE", 20, 20, "CONVERSATION_INTERACTION_EVENT_TYPE", DataType.TEXT);
            $VALUES = (new ConversationSchema[] {
                ID, SENDER, RECIPIENT, TIMESTAMP, HAS_UNVIEWED_CHATS, HAS_UNVIEWED_SNAPS, HAS_UNVIEWED_AUDIO_SNAPS, HAS_UNVIEWED_CASH, ITER_TOKEN, CHATS_ITER_TOKEN, 
                LAST_SEQ_NUM_OF_MY_CHAT_THEY_RELEASED, LAST_SEQ_NUM_OF_THEIR_CHAT_I_RELEASED, LAST_SEQ_NUM_OF_MY_CHAT_I_DELETED, LAST_SEQ_NUM_OF_THEIR_CHAT_I_DELETED, LAST_TIMESTAMP_OF_SENT_SNAP_READ_RECEIPT_I_DELETED, LAST_TIMESTAMP_OF_RECEIVED_SNAP_READ_RECEIPT_I_DELETED, MY_LAST_SEQ_NUM, THEIR_LAST_SEQ_NUM, MY_LAST_ACKED_SEQ_NUM, SEQ_NUM_STATE, 
                CONVERSATION_INTERACTION_EVENT_TYPE
            });
        }

        private ConversationSchema(String s, int i, int j, String s1, DataType datatype)
        {
            super(s, i);
            a = j;
            b = s1;
            c = datatype;
        }

        private ConversationSchema(String s, String s1, DataType datatype, String s2)
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
    private static ConversationTable c;
    private final lo d;

    private ConversationTable(lo lo1)
    {
        d = lo1;
    }

    private static int a(Map map)
    {
        map = map.values().iterator();
        int i;
        for (i = 0; map.hasNext(); i = ((List)map.next()).size() + i) { }
        return i;
    }

    public static ConversationTable a()
    {
        com/snapchat/android/database/table/ConversationTable;
        JVM INSTR monitorenter ;
        ConversationTable conversationtable;
        if (c == null)
        {
            ChatsReceivedInLastHourTable.a();
            c = new ConversationTable(lo.a());
        }
        conversationtable = c;
        com/snapchat/android/database/table/ConversationTable;
        JVM INSTR monitorexit ;
        return conversationtable;
        Exception exception;
        exception;
        throw exception;
    }

    private static ChatConversation a(Cursor cursor, Map map, Map map1, Map map2)
    {
        Object obj1;
        String s;
        String s1;
        String s2 = cursor.getString(ConversationSchema.ID.getColumnNumber());
        String s3 = cursor.getString(ConversationSchema.SENDER.getColumnNumber());
        String s4 = cursor.getString(ConversationSchema.RECIPIENT.getColumnNumber());
        long l = cursor.getLong(ConversationSchema.MY_LAST_SEQ_NUM.getColumnNumber());
        long l1 = cursor.getLong(ConversationSchema.MY_LAST_ACKED_SEQ_NUM.getColumnNumber());
        long l2 = cursor.getLong(ConversationSchema.THEIR_LAST_SEQ_NUM.getColumnNumber());
        long l3 = cursor.getLong(ConversationSchema.TIMESTAMP.getColumnNumber());
        String s5;
        int i;
        long l4;
        long l5;
        long l6;
        long l7;
        long l8;
        long l9;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (cursor.getInt(ConversationSchema.HAS_UNVIEWED_CHATS.getColumnNumber()) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (cursor.getInt(ConversationSchema.HAS_UNVIEWED_SNAPS.getColumnNumber()) == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (cursor.getInt(ConversationSchema.HAS_UNVIEWED_AUDIO_SNAPS.getColumnNumber()) == 1)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (cursor.getInt(ConversationSchema.HAS_UNVIEWED_CASH.getColumnNumber()) == 1)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        s1 = cursor.getString(ConversationSchema.ITER_TOKEN.getColumnNumber());
        s = cursor.getString(ConversationSchema.CHATS_ITER_TOKEN.getColumnNumber());
        l4 = cursor.getLong(ConversationSchema.LAST_SEQ_NUM_OF_MY_CHAT_THEY_RELEASED.getColumnNumber());
        l5 = cursor.getLong(ConversationSchema.LAST_SEQ_NUM_OF_THEIR_CHAT_I_RELEASED.getColumnNumber());
        l6 = cursor.getLong(ConversationSchema.LAST_SEQ_NUM_OF_MY_CHAT_I_DELETED.getColumnNumber());
        l7 = cursor.getLong(ConversationSchema.LAST_SEQ_NUM_OF_THEIR_CHAT_I_DELETED.getColumnNumber());
        l8 = cursor.getLong(ConversationSchema.LAST_TIMESTAMP_OF_SENT_SNAP_READ_RECEIPT_I_DELETED.getColumnNumber());
        l9 = cursor.getLong(ConversationSchema.LAST_TIMESTAMP_OF_RECEIVED_SNAP_READ_RECEIPT_I_DELETED.getColumnNumber());
        obj1 = com.snapchat.android.model.chat.ChatConversation.SequenceNumberState.NOT_UPDATED;
        s5 = cursor.getString(ConversationSchema.SEQ_NUM_STATE.getColumnNumber());
        Object obj = obj1;
        if (s5 != null)
        {
            try
            {
                obj = com.snapchat.android.model.chat.ChatConversation.SequenceNumberState.valueOf(s5);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                illegalargumentexception = ((IllegalArgumentException) (obj1));
            }
        }
        obj1 = cursor.getString(ConversationSchema.CONVERSATION_INTERACTION_EVENT_TYPE.getColumnNumber());
        cursor = new HashSet();
        if (map2.containsKey(s2))
        {
            map2 = (Set)map2.get(s2);
        } else
        {
            map2 = cursor;
        }
        cursor = (List)map.get(s2);
        map = cursor;
        if (cursor == null)
        {
            map = new ArrayList();
        }
        Timber.f("ConversationTable", "[Conversation] Create new conversation from database with %s.", new Object[] {
            s4
        });
        cursor = By.c().a(s4, true);
        if (cursor == null || ((ChatConversation) (cursor)).mIsStub)
        {
            if (cursor == null)
            {
                cursor = new ChatConversation(s3, s4, false);
            } else
            {
                cursor.mIsStub = false;
            }
            Timber.c("ConversationTable", "[seqNum] createChatConversation updates MyLastSeqNum to %d", new Object[] {
                Long.valueOf(l)
            });
            cursor.c(l);
            cursor.a(l1, false);
            cursor.d(l2);
            cursor.a(map);
            cursor.mTimestamp = l3;
            cursor.d(flag);
            cursor.mHasUnviewedReceivedSnaps = flag1;
            cursor.mHasUnviewedSnapsWithAudio = flag2;
            cursor.mHasUnviewedCash = flag3;
            if (TextUtils.isEmpty(s1))
            {
                map = null;
            } else
            {
                map = s1;
            }
            cursor.mIterToken = map;
            if (TextUtils.isEmpty(s))
            {
                map = null;
            } else
            {
                map = s;
            }
            cursor.mChatsIterToken = map;
            cursor.mLastSeqNumOfMyChatTheyReleased = l4;
            cursor.mLastSeqNumOfTheirChatIReleased = l5;
            cursor.mLastSeqNumOfTheirChatIDisplayed = l5;
            cursor.mClearedChatIds = map2;
            cursor.mSequenceNumberState = ((com.snapchat.android.model.chat.ChatConversation.SequenceNumberState) (obj));
            cursor.mConversationInteractionEventType = ((String) (obj1));
            map1 = (List)map1.get(s2);
            map = cursor;
            if (map1 != null)
            {
                map = cursor;
                if (!map1.isEmpty())
                {
                    map = (ChatFeedItem[])map1.toArray(new ChatFeedItem[map1.size()]);
                    ((ChatConversation) (cursor)).mItemsForFeedIcon.clear();
                    ((ChatConversation) (cursor)).mItemsForFeedIcon.addAll(Arrays.asList(map));
                    i = map1.size();
                    map = cursor;
                    if (i != 1)
                    {
                        map = cursor;
                        if (ReleaseManager.f())
                        {
                            Timber.e("ConversationTable", (new StringBuilder("ChatConversation should contain at most 1 chatsForFeedIcon. chatsForFeedIconCount=")).append(i).toString(), new Object[0]);
                            map = cursor;
                        }
                    }
                }
            }
        } else
        {
            cursor.a(map);
            cursor.a(map2);
            cursor.x();
            Mf.a().a(new NG());
            map = cursor;
        }
        if (l6 > ((ChatConversation) (map)).mLastSeqNumOfMyChatIDeleted)
        {
            map.mLastSeqNumOfMyChatIDeleted = l6;
        }
        if (l7 > ((ChatConversation) (map)).mLastSeqNumOfTheirChatIDeleted)
        {
            map.mLastSeqNumOfTheirChatIDeleted = l7;
        }
        if (l8 > ((ChatConversation) (map)).mLastTimestampOfSentSnapReadReceiptIDeleted)
        {
            map.mLastTimestampOfSentSnapReadReceiptIDeleted = l8;
        }
        if (l9 > ((ChatConversation) (map)).mLastTimestampOfReceivedSnapReadReceiptIDeleted)
        {
            map.mLastTimestampOfReceivedSnapReadReceiptIDeleted = l9;
        }
        if (l8 > ((ChatConversation) (map)).mLastTimestampOfSentSnapReadReceiptIReleased)
        {
            map.mLastTimestampOfSentSnapReadReceiptIReleased = l8;
        }
        if (l9 > ((ChatConversation) (map)).mLastTimestampOfReceivedSnapReadReceiptIReleased)
        {
            map.mLastTimestampOfReceivedSnapReadReceiptIReleased = l9;
        }
        return map;
    }

    private static List a(SQLiteDatabase sqlitedatabase, Map map, Map map1)
    {
        ArrayList arraylist;
        Map map2;
        arraylist = new ArrayList();
        ClearedChatIdsTable.a(SnapchatApplication.get());
        map2 = ClearedChatIdsTable.a(sqlitedatabase);
        sqlitedatabase = sqlitedatabase.query("Conversation", a, null, null, null, null, null);
        if (sqlitedatabase == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        boolean flag;
        if (sqlitedatabase.moveToFirst())
        {
            do
            {
                arraylist.add(a(((Cursor) (sqlitedatabase)), map, map1, map2));
                flag = sqlitedatabase.moveToNext();
            } while (flag);
        }
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        return arraylist;
        map;
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        throw map;
    }

    private static transient Map a(Map amap[])
    {
        HashMap hashmap = new HashMap();
        for (int i = 0; i < 4; i++)
        {
            Map map = amap[i];
            Object obj;
            String s;
            for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); hashmap.put(s, obj))
            {
                s = (String)iterator.next();
                obj = (List)hashmap.get(s);
                if (obj == null)
                {
                    obj = new ArrayList();
                }
                List list = (List)map.get(s);
                if (list != null)
                {
                    ((List) (obj)).addAll(list);
                }
            }

        }

        return hashmap;
    }

    private static void a(SQLiteDatabase sqlitedatabase, String s, Snap snap, com.snapchat.android.model.Snap.TargetView targetview)
    {
        if (snap instanceof AY)
        {
            if (((AY)snap).mIsSavableSnap)
            {
                SentSnapTable.a(sqlitedatabase, s, (AY)snap, targetview);
            }
        } else
        if (snap instanceof AT)
        {
            ReceivedSnapTable.a();
            ReceivedSnapTable.a(sqlitedatabase, s, (AT)snap, targetview);
            return;
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
        return By.c().f();
    }

    public final void b(Br br)
    {
        SQLiteDatabase sqlitedatabase;
        d.mLoadConversationsMetric = com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.b("LOAD_CONVERSATIONS_TABLE_TIMED").b();
        sqlitedatabase = DatabaseHelper.a(SnapchatApplication.get()).getReadableDatabase();
        Timber.c("ConversationTable", "populateUserObjectFromTable - beginTransaction", new Object[0]);
        sqlitedatabase.beginTransaction();
        Object obj;
        Object obj1;
        int i;
        obj1 = ChatTable.a(sqlitedatabase, Snap.TARGET_VIEWS_CHAT);
        Map map = CashFeedItemTable.a(sqlitedatabase, Snap.TARGET_VIEWS_CHAT);
        ReceivedSnapTable.a();
        obj = ReceivedSnapTable.a(sqlitedatabase, Snap.TARGET_VIEWS_CHAT);
        obj1 = a(new Map[] {
            obj1, obj, SentSnapTable.a(sqlitedatabase, Snap.TARGET_VIEWS_CHAT), map
        });
        i = a(((Map) (obj1)));
        long l;
        long l1;
        l1 = 0L + (long)i;
        l = l1;
        Object obj2 = ChatTable.a(sqlitedatabase, Snap.TARGET_VIEWS_FEED);
        l = l1;
        Object obj3 = CashFeedItemTable.a(sqlitedatabase, Snap.TARGET_VIEWS_FEED);
        l = l1;
        ReceivedSnapTable.a();
        l = l1;
        obj2 = a(new Map[] {
            obj2, ReceivedSnapTable.a(sqlitedatabase, Snap.TARGET_VIEWS_FEED), SentSnapTable.a(sqlitedatabase, Snap.TARGET_VIEWS_FEED), obj3
        });
        l = l1;
        l1 += a(((Map) (obj2)));
        l = l1;
        obj3 = ((Map) (obj2)).entrySet().iterator();
_L4:
        l = l1;
        if (!((Iterator) (obj3)).hasNext()) goto _L2; else goto _L1
_L1:
        l = l1;
        Object obj5 = (java.util.Map.Entry)((Iterator) (obj3)).next();
        l = l1;
        Object obj4 = (String)((java.util.Map.Entry) (obj5)).getKey();
        l = l1;
        obj5 = (List)((java.util.Map.Entry) (obj5)).getValue();
        l = l1;
        if (((List) (obj5)).isEmpty()) goto _L4; else goto _L3
_L3:
        l = l1;
        obj4 = (List)((Map) (obj1)).get(obj4);
        if (obj4 == null) goto _L4; else goto _L5
_L5:
        l = l1;
        if (((List) (obj4)).isEmpty()) goto _L4; else goto _L6
_L6:
        l = l1;
        obj5 = ((List) (obj5)).listIterator();
_L9:
        l = l1;
        if (!((ListIterator) (obj5)).hasNext()) goto _L4; else goto _L7
_L7:
        l = l1;
        i = ((List) (obj4)).indexOf((ChatFeedItem)((ListIterator) (obj5)).next());
        if (i == -1) goto _L9; else goto _L8
_L8:
        l = l1;
        ((ListIterator) (obj5)).remove();
        l = l1;
        ((ListIterator) (obj5)).add(((List) (obj4)).get(i));
          goto _L9
        br;
_L18:
        sqlitedatabase.endTransaction();
        Timber.c("ConversationTable", "populateUserObjectFromTable - endTransaction", new Object[0]);
        d.a(0L, l);
        throw br;
_L2:
        l = l1;
        obj1 = a(sqlitedatabase, ((Map) (obj1)), ((Map) (obj2)));
        l = l1;
        obj = ((Map) (obj)).values().iterator();
_L11:
        l = l1;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_627;
        }
        l = l1;
        obj2 = (List)((Iterator) (obj)).next();
        if (obj2 == null) goto _L11; else goto _L10
_L10:
        l = l1;
        obj2 = ((List) (obj2)).iterator();
_L14:
        l = l1;
        if (!((Iterator) (obj2)).hasNext()) goto _L11; else goto _L12
_L12:
        l = l1;
        obj3 = (ChatFeedItem)((Iterator) (obj2)).next();
        l = l1;
        if (!(obj3 instanceof AT)) goto _L14; else goto _L13
_L13:
        l = l1;
        obj3 = (AT)obj3;
        l = l1;
        if (((AT) (obj3)).g()) goto _L14; else goto _L15
_L15:
        l = l1;
        if (!((AT) (obj3)).D()) goto _L14; else goto _L16
_L16:
        l = l1;
        br.a(((AT) (obj3)));
          goto _L14
        l = l1;
        obj = By.c();
        l = l1;
        br = ((By) (obj)).mConversations;
        l = l1;
        br;
        JVM INSTR monitorenter ;
        ((By) (obj)).mConversations.clear();
        ((By) (obj)).mConversations.addAll(((Collection) (obj1)));
        br;
        JVM INSTR monitorexit ;
        l = l1;
        ((By) (obj)).h();
        l = l1;
        ((By) (obj)).a(new AtomicBoolean(false));
        l = l1;
        ((By) (obj)).g();
        l = l1;
        i = ((List) (obj1)).size();
        l = i;
        sqlitedatabase.endTransaction();
        Timber.c("ConversationTable", "populateUserObjectFromTable - endTransaction", new Object[0]);
        d.a(l, l1);
        return;
        Exception exception;
        exception;
        br;
        JVM INSTR monitorexit ;
        l = l1;
        throw exception;
        br;
        l = 0L;
        if (true) goto _L18; else goto _L17
_L17:
    }

    public final tt[] b()
    {
        return ConversationSchema.values();
    }

    public final String c()
    {
        return "Conversation";
    }

    public final void c(Br br)
    {
        SQLiteDatabase sqlitedatabase;
        android.app.Application application;
        if (!Bt.t())
        {
            return;
        }
        application = SnapchatApplication.get();
        sqlitedatabase = DatabaseHelper.a(application).getWritableDatabase();
        Timber.c("ConversationTable", "safeUpdate - beginTransaction", new Object[0]);
        sqlitedatabase.beginTransaction();
        KH kh;
        Iterator iterator;
        Timber.c("ConversationTable", "Delete the tables for conversations, chats and snaps for safeUpdate", new Object[0]);
        sqlitedatabase.delete("Conversation", null, null);
        sqlitedatabase.delete("Chat", null, null);
        sqlitedatabase.delete("ReceivedSnaps", null, null);
        sqlitedatabase.delete("SentSnaps", null, null);
        CashFeedItemTable.a(application);
        br = By.c().f();
        kh = new KH();
        iterator = br.iterator();
_L16:
        ChatConversation chatconversation;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_1061;
            }
            chatconversation = (ChatConversation)iterator.next();
        } while (chatconversation.mIsStub || !chatconversation.mIsSavableConversation || chatconversation == null);
        String s;
        Object obj1;
        s = chatconversation.mId;
        br = new ContentValues();
        br.put(ConversationSchema.ID.getColumnName(), s);
        br.put(ConversationSchema.SENDER.getColumnName(), chatconversation.mMyUsername);
        br.put(ConversationSchema.RECIPIENT.getColumnName(), chatconversation.mTheirUsername);
        br.put(ConversationSchema.TIMESTAMP.getColumnName(), Long.valueOf(chatconversation.mTimestamp));
        obj1 = ConversationSchema.HAS_UNVIEWED_CHATS.getColumnName();
        Object obj2;
        int i;
        if (chatconversation.mHasUnreleasedReceivedChats)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        br.put(((String) (obj1)), Integer.valueOf(i));
        obj1 = ConversationSchema.HAS_UNVIEWED_SNAPS.getColumnName();
        if (chatconversation.mHasUnviewedReceivedSnaps)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        br.put(((String) (obj1)), Integer.valueOf(i));
        obj1 = ConversationSchema.HAS_UNVIEWED_AUDIO_SNAPS.getColumnName();
        if (chatconversation.mHasUnviewedSnapsWithAudio)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        br.put(((String) (obj1)), Integer.valueOf(i));
        obj1 = ConversationSchema.HAS_UNVIEWED_CASH.getColumnName();
        if (chatconversation.mHasUnviewedCash)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        br.put(((String) (obj1)), Integer.valueOf(i));
        br.put(ConversationSchema.ITER_TOKEN.getColumnName(), chatconversation.mIterToken);
        br.put(ConversationSchema.CHATS_ITER_TOKEN.getColumnName(), chatconversation.mChatsIterToken);
        br.put(ConversationSchema.LAST_SEQ_NUM_OF_MY_CHAT_THEY_RELEASED.getColumnName(), Long.valueOf(chatconversation.mLastSeqNumOfMyChatTheyReleased));
        br.put(ConversationSchema.LAST_SEQ_NUM_OF_THEIR_CHAT_I_RELEASED.getColumnName(), Long.valueOf(chatconversation.mLastSeqNumOfTheirChatIReleased));
        br.put(ConversationSchema.LAST_SEQ_NUM_OF_MY_CHAT_I_DELETED.getColumnName(), Long.valueOf(chatconversation.mLastSeqNumOfMyChatIDeleted));
        br.put(ConversationSchema.LAST_SEQ_NUM_OF_THEIR_CHAT_I_DELETED.getColumnName(), Long.valueOf(chatconversation.mLastSeqNumOfTheirChatIDeleted));
        br.put(ConversationSchema.LAST_TIMESTAMP_OF_SENT_SNAP_READ_RECEIPT_I_DELETED.getColumnName(), Long.valueOf(chatconversation.mLastTimestampOfSentSnapReadReceiptIDeleted));
        br.put(ConversationSchema.LAST_TIMESTAMP_OF_RECEIVED_SNAP_READ_RECEIPT_I_DELETED.getColumnName(), Long.valueOf(chatconversation.mLastTimestampOfReceivedSnapReadReceiptIDeleted));
        br.put(ConversationSchema.MY_LAST_SEQ_NUM.getColumnName(), Long.valueOf(chatconversation.mMyLastSeqNum));
        br.put(ConversationSchema.THEIR_LAST_SEQ_NUM.getColumnName(), Long.valueOf(chatconversation.mTheirLastSeqNum));
        br.put(ConversationSchema.MY_LAST_ACKED_SEQ_NUM.getColumnName(), Long.valueOf(chatconversation.mMyLastAckedSeqNum));
        br.put(ConversationSchema.SEQ_NUM_STATE.getColumnName(), chatconversation.mSequenceNumberState.name());
        br.put(ConversationSchema.CONVERSATION_INTERACTION_EVENT_TYPE.getColumnName(), chatconversation.mConversationInteractionEventType);
        if (ReleaseManager.f())
        {
            obj1 = (new StringBuilder("Save conversation recipient=")).append(chatconversation.mTheirUsername).append(" timestamp=").append(chatconversation.mTimestamp).toString();
            if (ReleaseManager.f())
            {
                Timber.a(com.snapchat.android.Timber.LogType.DEBUG, "ConversationTable", false, null, ((String) (obj1)), new Object[0]);
            }
        }
        sqlitedatabase.insertWithOnConflict("Conversation", null, br, 5);
        obj2 = chatconversation.mItemsForFeedIcon;
        if (((List) (obj2)).size() != 1) goto _L2; else goto _L1
_L1:
        br = (ChatFeedItem)((List) (obj2)).get(0);
_L4:
        obj1 = new HashSet();
        for (obj2 = ((List) (obj2)).iterator(); ((Iterator) (obj2)).hasNext(); ((Set) (obj1)).add(((ChatFeedItem)((Iterator) (obj2)).next()).d())) { }
        break MISSING_BLOCK_LABEL_761;
        br;
        sqlitedatabase.endTransaction();
        Timber.c("ConversationTable", "safeUpdate - endTransaction", new Object[0]);
        throw br;
_L2:
        br = null;
        if (true) goto _L4; else goto _L3
_L3:
        boolean flag = false;
        CashFeedItemTable.b(application);
        if (!(br instanceof CashFeedItem))
        {
            break MISSING_BLOCK_LABEL_788;
        }
        CashFeedItemTable.a(application, (CashFeedItem)br);
        flag = true;
        synchronized (chatconversation.u())
        {
            obj2 = new HashSet(((Collection) (obj)));
        }
        obj2 = ((Set) (obj2)).iterator();
_L11:
        if (!((Iterator) (obj2)).hasNext()) goto _L6; else goto _L5
_L5:
        ChatFeedItem chatfeeditem;
        boolean flag1;
        chatfeeditem = (ChatFeedItem)((Iterator) (obj2)).next();
        flag1 = ((Set) (obj1)).contains(chatfeeditem.d());
        if (!flag1) goto _L8; else goto _L7
_L7:
        obj = com.snapchat.android.model.Snap.TargetView.CHAT_AND_FEED;
_L12:
        if (!(chatfeeditem instanceof Chat)) goto _L10; else goto _L9
_L9:
        ChatTable.a(sqlitedatabase, (Chat)chatfeeditem, ((com.snapchat.android.model.Snap.TargetView) (obj)), kh);
        obj = PreferenceManager.getDefaultSharedPreferences(application).getString(SharedPreferenceKey.USERNAME.getKey(), "");
        String s1 = chatfeeditem.j();
        if (!TextUtils.equals(((CharSequence) (obj)), s1) && chatfeeditem.W() > System.currentTimeMillis() - 0x36ee80L)
        {
            ChatsReceivedInLastHourTable.a(application, chatfeeditem.d(), chatfeeditem.W(), s1);
        }
_L14:
        if (flag1)
        {
            flag = true;
        }
          goto _L11
        br;
        obj;
        JVM INSTR monitorexit ;
        throw br;
_L8:
        obj = com.snapchat.android.model.Snap.TargetView.CHAT;
          goto _L12
_L10:
        if (!(chatfeeditem instanceof Snap)) goto _L14; else goto _L13
_L13:
        a(sqlitedatabase, s, (Snap)chatfeeditem, ((com.snapchat.android.model.Snap.TargetView) (obj)));
          goto _L14
_L6:
        if (br == null || flag) goto _L16; else goto _L15
_L15:
        if (!(br instanceof Snap)) goto _L18; else goto _L17
_L17:
        a(sqlitedatabase, s, (Snap)br, com.snapchat.android.model.Snap.TargetView.FEED);
          goto _L16
_L18:
        if (!(br instanceof Chat)) goto _L16; else goto _L19
_L19:
        ChatTable.a(sqlitedatabase, (Chat)br, com.snapchat.android.model.Snap.TargetView.FEED, kh);
          goto _L16
        br = KQ.CHAT_MEDIA_KEYS_AND_IVS;
        if (kh.mPrefKeyToMapMap.containsKey(br))
        {
            kh.a(br, (Map)kh.mPrefKeyToMapMap.get(br));
        }
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        Timber.c("ConversationTable", "safeUpdate - endTransaction", new Object[0]);
        return;
    }

    public final String d()
    {
        StringBuilder stringbuilder = new StringBuilder();
        ConversationSchema aconversationschema[] = ConversationSchema.values();
        int j = aconversationschema.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = aconversationschema[i];
            if (i > 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append((new StringBuilder()).append(ConversationSchema.a(((ConversationSchema) (obj)))).append(" ").append(ConversationSchema.b(((ConversationSchema) (obj))).toString()).toString());
            obj = ((ConversationSchema) (obj)).getConstraints();
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
        ConversationSchema aconversationschema[] = ConversationSchema.values();
        int k = aconversationschema.length;
        a = new String[k];
        for (int i = 0; i < k; i++)
        {
            a[i] = aconversationschema[i].getColumnName();
        }

        b = new HashMap();
        aconversationschema = ConversationSchema.values();
        k = aconversationschema.length;
        for (int j = ((flag) ? 1 : 0); j < k; j++)
        {
            ConversationSchema conversationschema = aconversationschema[j];
            b.put(conversationschema.getColumnName(), conversationschema.getColumnName());
        }

    }
}
