// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import BG;
import BH;
import Br;
import Iz;
import KF;
import KH;
import KO;
import KQ;
import Mf;
import Mp;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.snapchat.android.app.feature.messaging.feed.model.FeedIconChangeType;
import com.snapchat.android.database.DataType;
import com.snapchat.android.model.chat.Chat;
import com.snapchat.android.model.chat.ChatConversation;
import com.snapchat.android.model.chat.ChatMedia;
import com.snapchat.android.model.chat.StatefulChatFeedItem;
import com.squareup.otto.Bus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import sz;
import tt;

// Referenced classes of package com.snapchat.android.database.table:
//            DbTable

public final class ChatTable extends DbTable
{
    public static final class ChatSchema extends Enum
        implements tt
    {

        private static final ChatSchema $VALUES[];
        public static final ChatSchema ACK_ID;
        public static final ChatSchema CONVERSATION_ID;
        public static final ChatSchema HAS_LINKS;
        public static final ChatSchema ID;
        public static final ChatSchema IS_RELEASED_BY_RECIPIENT;
        public static final ChatSchema IS_SAVED_BY_RECIPIENT;
        public static final ChatSchema IS_SAVED_BY_SENDER;
        public static final ChatSchema IS_ZIPPED;
        public static final ChatSchema ITER_TOKEN;
        public static final ChatSchema LINK_CONTENT;
        public static final ChatSchema MEDIA_HEIGHT;
        public static final ChatSchema MEDIA_ID;
        public static final ChatSchema MEDIA_TYPE;
        public static final ChatSchema MEDIA_WIDTH;
        public static final ChatSchema RECIPIENT;
        public static final ChatSchema RECIPIENT_MESSAGE_STATE_VERSION;
        public static final ChatSchema RELEASED_TIMESTAMP;
        public static final ChatSchema SENDER;
        public static final ChatSchema SENDER_MESSAGE_STATE_VERSION;
        public static final ChatSchema SEND_RECEIVE_STATUS;
        public static final ChatSchema SEQ_NUM;
        public static final ChatSchema STATUS_TEXT;
        public static final ChatSchema TARGET_VIEW;
        public static final ChatSchema TEXT_FORMAT;
        public static final ChatSchema TIMESTAMP;
        public static final ChatSchema TYPE;
        public static final ChatSchema USER_TEXT;
        private int a;
        private String b;
        private DataType c;
        private String d;

        static String a(ChatSchema chatschema)
        {
            return chatschema.b;
        }

        static DataType b(ChatSchema chatschema)
        {
            return chatschema.c;
        }

        public static ChatSchema valueOf(String s)
        {
            return (ChatSchema)Enum.valueOf(com/snapchat/android/database/table/ChatTable$ChatSchema, s);
        }

        public static ChatSchema[] values()
        {
            return (ChatSchema[])$VALUES.clone();
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
            ID = new ChatSchema("ID", "_id", DataType.TEXT, "PRIMARY KEY");
            TYPE = new ChatSchema("TYPE", 1, 1, "type", DataType.TEXT);
            ACK_ID = new ChatSchema("ACK_ID", 2, 2, "ack_id", DataType.TEXT);
            RECIPIENT = new ChatSchema("RECIPIENT", 3, 3, "recipient", DataType.TEXT);
            SENDER = new ChatSchema("SENDER", 4, 4, "sender", DataType.TEXT);
            IS_SAVED_BY_SENDER = new ChatSchema("IS_SAVED_BY_SENDER", 5, 5, "is_saved_by_sender", DataType.BOOLEAN);
            IS_SAVED_BY_RECIPIENT = new ChatSchema("IS_SAVED_BY_RECIPIENT", 6, 6, "is_saved_by_recipient", DataType.BOOLEAN);
            IS_RELEASED_BY_RECIPIENT = new ChatSchema("IS_RELEASED_BY_RECIPIENT", 7, 7, "is_released_by_recipient", DataType.BOOLEAN);
            SEND_RECEIVE_STATUS = new ChatSchema("SEND_RECEIVE_STATUS", 8, 8, "send_receive_status", DataType.TEXT);
            TIMESTAMP = new ChatSchema("TIMESTAMP", 9, 9, "timestamp", DataType.INTEGER);
            SEQ_NUM = new ChatSchema("SEQ_NUM", 10, 10, "seq_num", DataType.INTEGER);
            USER_TEXT = new ChatSchema("USER_TEXT", 11, 11, "text", DataType.TEXT);
            MEDIA_ID = new ChatSchema("MEDIA_ID", 12, 12, "media_id", DataType.TEXT);
            CONVERSATION_ID = new ChatSchema("CONVERSATION_ID", 13, 13, "conversation_id", DataType.TEXT);
            SENDER_MESSAGE_STATE_VERSION = new ChatSchema("SENDER_MESSAGE_STATE_VERSION", 14, 14, "sender_message_state_version", DataType.INTEGER);
            RECIPIENT_MESSAGE_STATE_VERSION = new ChatSchema("RECIPIENT_MESSAGE_STATE_VERSION", 15, 15, "recipient_message_state_version", DataType.INTEGER);
            ITER_TOKEN = new ChatSchema("ITER_TOKEN", 16, 16, "iter_token", DataType.TEXT);
            HAS_LINKS = new ChatSchema("HAS_LINKS", 17, 17, "has_links", DataType.BOOLEAN);
            TARGET_VIEW = new ChatSchema("TARGET_VIEW", 18, 18, "target_view", DataType.TEXT);
            RELEASED_TIMESTAMP = new ChatSchema("RELEASED_TIMESTAMP", 19, 19, "released_timestamp", DataType.INTEGER);
            STATUS_TEXT = new ChatSchema("STATUS_TEXT", 20, 20, "status_text", DataType.TEXT);
            MEDIA_TYPE = new ChatSchema("MEDIA_TYPE", 21, 21, "media_type", DataType.TEXT);
            MEDIA_WIDTH = new ChatSchema("MEDIA_WIDTH", 22, 22, "media_width", DataType.INTEGER);
            MEDIA_HEIGHT = new ChatSchema("MEDIA_HEIGHT", 23, 23, "media_height", DataType.INTEGER);
            TEXT_FORMAT = new ChatSchema("TEXT_FORMAT", 24, 24, "text_format", DataType.TEXT);
            IS_ZIPPED = new ChatSchema("IS_ZIPPED", 25, 25, "is_zipped", DataType.BOOLEAN);
            LINK_CONTENT = new ChatSchema("LINK_CONTENT", 26, 26, "link_content", DataType.TEXT);
            $VALUES = (new ChatSchema[] {
                ID, TYPE, ACK_ID, RECIPIENT, SENDER, IS_SAVED_BY_SENDER, IS_SAVED_BY_RECIPIENT, IS_RELEASED_BY_RECIPIENT, SEND_RECEIVE_STATUS, TIMESTAMP, 
                SEQ_NUM, USER_TEXT, MEDIA_ID, CONVERSATION_ID, SENDER_MESSAGE_STATE_VERSION, RECIPIENT_MESSAGE_STATE_VERSION, ITER_TOKEN, HAS_LINKS, TARGET_VIEW, RELEASED_TIMESTAMP, 
                STATUS_TEXT, MEDIA_TYPE, MEDIA_WIDTH, MEDIA_HEIGHT, TEXT_FORMAT, IS_ZIPPED, LINK_CONTENT
            });
        }

        private ChatSchema(String s, int i, int j, String s1, DataType datatype)
        {
            super(s, i);
            a = j;
            b = s1;
            c = datatype;
        }

        private ChatSchema(String s, String s1, DataType datatype, String s2)
        {
            super(s, 0);
            a = 0;
            b = s1;
            c = datatype;
            d = s2;
        }
    }


    public static final HashMap a;
    private static String b[];
    private static ChatTable c;
    private static Iz d = new Iz();

    private ChatTable()
    {
    }

    public static ChatTable a()
    {
        com/snapchat/android/database/table/ChatTable;
        JVM INSTR monitorenter ;
        ChatTable chattable;
        if (c == null)
        {
            c = new ChatTable();
        }
        chattable = c;
        com/snapchat/android/database/table/ChatTable;
        JVM INSTR monitorexit ;
        return chattable;
        Exception exception;
        exception;
        throw exception;
    }

    public static Map a(SQLiteDatabase sqlitedatabase, Set set)
    {
        KH kh;
        HashMap hashmap;
        Cursor cursor;
        kh = new KH();
        if (!kh.mPrefKeyToMapMap.containsKey(KQ.CHAT_MEDIA_KEYS_AND_IVS))
        {
            byte abyte0[] = kh.mSlightlySecurePreferences.b(KQ.CHAT_MEDIA_KEYS_AND_IVS);
            if (abyte0 != null)
            {
                kh.mPrefKeyToMapMap.put(KQ.CHAT_MEDIA_KEYS_AND_IVS, KH.a(abyte0));
            }
        }
        hashmap = new HashMap();
        cursor = sqlitedatabase.query("Chat", b, null, null, null, null, null);
        if (cursor == null) goto _L2; else goto _L1
_L1:
        if (!cursor.moveToFirst()) goto _L2; else goto _L3
_L3:
        sqlitedatabase = cursor.getString(ChatSchema.TARGET_VIEW.getColumnNumber());
        if (!TextUtils.isEmpty(sqlitedatabase)) goto _L5; else goto _L4
_L4:
        sqlitedatabase = com.snapchat.android.model.Snap.TargetView.CHAT;
_L32:
        if (set == null) goto _L7; else goto _L6
_L6:
        if (!set.contains(sqlitedatabase)) goto _L8; else goto _L7
_L7:
        Object obj;
        Object obj1;
        String s;
        String s1;
        com.snapchat.android.model.chat.StatefulChatFeedItem.SendReceiveStatus sendreceivestatus;
        String s3;
        String s4;
        String s5;
        String s6;
        long l1;
        obj = cursor.getString(ChatSchema.ID.getColumnNumber());
        obj1 = cursor.getString(ChatSchema.TYPE.getColumnNumber());
        s5 = cursor.getString(ChatSchema.SENDER.getColumnNumber());
        s6 = cursor.getString(ChatSchema.RECIPIENT.getColumnNumber());
        s4 = cursor.getString(ChatSchema.USER_TEXT.getColumnNumber());
        s = cursor.getString(ChatSchema.STATUS_TEXT.getColumnNumber());
        sqlitedatabase = cursor.getString(ChatSchema.MEDIA_ID.getColumnNumber());
        s3 = cursor.getString(ChatSchema.MEDIA_TYPE.getColumnNumber());
        l1 = cursor.getLong(ChatSchema.TIMESTAMP.getColumnNumber());
        s1 = cursor.getString(ChatSchema.ACK_ID.getColumnNumber());
        sendreceivestatus = com.snapchat.android.model.chat.StatefulChatFeedItem.SendReceiveStatus.valueOf(cursor.getString(ChatSchema.SEND_RECEIVE_STATUS.getColumnNumber()));
        String s2;
        Object obj2;
        Object obj3;
        byte byte0;
        int i;
        int j;
        int k;
        int l;
        long l2;
        long l3;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        if (cursor.getInt(ChatSchema.IS_RELEASED_BY_RECIPIENT.getColumnNumber()) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (cursor.getInt(ChatSchema.IS_SAVED_BY_SENDER.getColumnNumber()) == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (cursor.getInt(ChatSchema.IS_SAVED_BY_RECIPIENT.getColumnNumber()) == 1)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        i = cursor.getInt(ChatSchema.SENDER_MESSAGE_STATE_VERSION.getColumnNumber());
        j = cursor.getInt(ChatSchema.RECIPIENT_MESSAGE_STATE_VERSION.getColumnNumber());
        l2 = cursor.getLong(ChatSchema.SEQ_NUM.getColumnNumber());
        s2 = cursor.getString(ChatSchema.ITER_TOKEN.getColumnNumber());
        if (cursor.getInt(ChatSchema.HAS_LINKS.getColumnNumber()) == 1)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        k = cursor.getInt(ChatSchema.MEDIA_WIDTH.getColumnNumber());
        l = cursor.getInt(ChatSchema.MEDIA_HEIGHT.getColumnNumber());
        if (cursor.getInt(ChatSchema.IS_ZIPPED.getColumnNumber()) == 1)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        obj2 = (new TypeToken() {

        }).getType();
        obj2 = (List)d.a(cursor.getString(ChatSchema.TEXT_FORMAT.getColumnNumber()), ((java.lang.reflect.Type) (obj2)));
        obj3 = (new TypeToken() {

        }).getType();
        obj3 = (List)d.a(cursor.getString(ChatSchema.LINK_CONTENT.getColumnNumber()), ((java.lang.reflect.Type) (obj3)));
        byte0 = -1;
        ((String) (obj1)).hashCode();
        JVM INSTR lookupswitch 7: default 1421
    //                   -1890252483: 1049
    //                   -916839648: 1017
    //                   -416447130: 1033
    //                   3556653: 969
    //                   95886894: 1001
    //                   103772132: 985
    //                   1365360682: 1065;
           goto _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L36:
        sqlitedatabase = new BH(new BH.a(s5, s6), (byte)0);
_L33:
        l3 = cursor.getLong(ChatSchema.RELEASED_TIMESTAMP.getColumnNumber());
        sqlitedatabase.c(((String) (obj)));
        sqlitedatabase.a(s1);
        sqlitedatabase.d(l1);
        sqlitedatabase.c(flag1);
        sqlitedatabase.d(flag2);
        sqlitedatabase.b(flag);
        sqlitedatabase.a(i);
        sqlitedatabase.b(j);
        sqlitedatabase.mSendReceiveStatus = sendreceivestatus;
        sqlitedatabase.b(l2);
        sqlitedatabase.d(s2);
        sqlitedatabase.e(l3);
        if (!flag) goto _L18; else goto _L17
_L17:
        sqlitedatabase.f(l3);
_L18:
        sqlitedatabase.b(s);
        if (((String) (obj1)).equals("media") || ((String) (obj1)).equals("dsnap")) goto _L20; else goto _L19
_L19:
        obj = sqlitedatabase;
        if (!((String) (obj1)).equals("story_reply")) goto _L21; else goto _L20
_L20:
        obj = (ChatMedia)sqlitedatabase;
        obj1 = (Map)kh.mPrefKeyToMapMap.get(KQ.CHAT_MEDIA_KEYS_AND_IVS);
        if (obj1 != null) goto _L23; else goto _L22
_L22:
        byte0 = 0;
          goto _L24
_L21:
        if (obj == null) goto _L8; else goto _L25
_L25:
        s = cursor.getString(ChatSchema.CONVERSATION_ID.getColumnNumber());
        obj1 = (List)hashmap.get(s);
        sqlitedatabase = ((SQLiteDatabase) (obj1));
        if (obj1 != null) goto _L27; else goto _L26
_L26:
        sqlitedatabase = new ArrayList();
_L27:
        sqlitedatabase.add(obj);
        if (((StatefulChatFeedItem) (obj)).mSendReceiveStatus != com.snapchat.android.model.chat.StatefulChatFeedItem.SendReceiveStatus.SENDING) goto _L29; else goto _L28
_L28:
        l1 = System.currentTimeMillis() - ((Chat) (obj)).W();
        if (l1 <= 20000L) goto _L31; else goto _L30
_L30:
        obj.mSendReceiveStatus = com.snapchat.android.model.chat.StatefulChatFeedItem.SendReceiveStatus.FAILED;
_L29:
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
          goto _L32
_L13:
        if (((String) (obj1)).equals("text"))
        {
            byte0 = 0;
        }
          goto _L9
_L15:
        if (((String) (obj1)).equals("media"))
        {
            byte0 = 1;
        }
          goto _L9
_L14:
        if (((String) (obj1)).equals("dsnap"))
        {
            byte0 = 2;
        }
          goto _L9
_L11:
        if (((String) (obj1)).equals("story_reply"))
        {
            byte0 = 3;
        }
          goto _L9
_L12:
        if (((String) (obj1)).equals("screenshot"))
        {
            byte0 = 4;
        }
          goto _L9
_L10:
        if (((String) (obj1)).equals("sticker"))
        {
            byte0 = 5;
        }
          goto _L9
_L16:
        if (((String) (obj1)).equals("welcome_message"))
        {
            byte0 = 6;
        }
          goto _L9
_L37:
        sqlitedatabase = new BG.a(s5, s6);
        sqlitedatabase.text = s4;
        sqlitedatabase.hasLinks = flag3;
        sqlitedatabase.formats = ((List) (obj2));
        sqlitedatabase.linkContent = ((List) (obj3));
        sqlitedatabase = sqlitedatabase.a();
          goto _L33
_L38:
        com.snapchat.android.model.chat.ChatMedia.a a1 = new com.snapchat.android.model.chat.ChatMedia.a(s5, s6);
        a1.mediaId = sqlitedatabase;
        sqlitedatabase = a1.a(s3);
        sqlitedatabase.width = k;
        sqlitedatabase.height = l;
        sqlitedatabase = sqlitedatabase.a();
          goto _L33
_L39:
        BD.a a2 = new BD.a(s5, s6);
        a2.mediaId = sqlitedatabase;
        sqlitedatabase = a2.a(s3);
        sqlitedatabase.width = k;
        sqlitedatabase.height = l;
        sqlitedatabase = sqlitedatabase.a();
          goto _L33
_L40:
        com.snapchat.android.model.chat.ChatMedia.a a3 = new com.snapchat.android.model.chat.ChatMedia.a(s5, s6);
        a3.mediaId = sqlitedatabase;
        sqlitedatabase = a3.a(s3);
        sqlitedatabase.width = k;
        sqlitedatabase.height = l;
        sqlitedatabase.isZipped = flag4;
        sqlitedatabase = sqlitedatabase.a();
          goto _L33
_L41:
        sqlitedatabase = (new BC.a(s5, s6)).a();
          goto _L33
_L42:
        sqlitedatabase = (new BE.a(s5, s6)).a();
          goto _L33
_L43:
        sqlitedatabase = (new BK.a(s5, s6)).b();
          goto _L33
_L23:
        obj1 = (KF)((Map) (obj1)).get(((ChatMedia) (obj)).d());
        if (obj1 != null) goto _L35; else goto _L34
_L34:
        byte0 = 0;
          goto _L24
_L35:
        ((ChatMedia) (obj)).f(((KF) (obj1)).mKey);
        ((ChatMedia) (obj)).g(((KF) (obj1)).mIv);
        byte0 = 1;
          goto _L24
_L31:
        (new Handler(Looper.getMainLooper())).postDelayed(new Runnable(((Chat) (obj)), s) {

            private Chat a;
            private String b;

            public final void run()
            {
                if (((StatefulChatFeedItem) (a)).mSendReceiveStatus.equals(com.snapchat.android.model.chat.StatefulChatFeedItem.SendReceiveStatus.SENDING))
                {
                    a.mSendReceiveStatus = com.snapchat.android.model.chat.StatefulChatFeedItem.SendReceiveStatus.FAILED;
                    ChatConversation chatconversation = sz.a(b);
                    if (chatconversation != null)
                    {
                        chatconversation.a(a, FeedIconChangeType.FAILED_TO_SEND);
                    }
                    Mf.a().a(new Mp(a.ac(), a.d()));
                }
            }

            
            {
                a = chat;
                b = s;
                super();
            }
        }, 20000L - l1);
          goto _L29
        sqlitedatabase;
        if (cursor != null)
        {
            cursor.close();
        }
        throw sqlitedatabase;
_L9:
        byte0;
        JVM INSTR tableswitch 0 6: default 1464
    //                   0 1082
    //                   1 1126
    //                   2 1173
    //                   3 1220
    //                   4 1273
    //                   5 1291
    //                   6 1309;
           goto _L36 _L37 _L38 _L39 _L40 _L41 _L42 _L43
_L24:
        obj = sqlitedatabase;
        if (byte0 == 0)
        {
            obj = null;
        }
          goto _L21
    }

    public static void a(SQLiteDatabase sqlitedatabase, Chat chat, com.snapchat.android.model.Snap.TargetView targetview, KH kh)
    {
        boolean flag = true;
        if (chat != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(ChatSchema.ID.getColumnName(), chat.d());
        contentvalues.put(ChatSchema.TYPE.getColumnName(), chat.h());
        contentvalues.put(ChatSchema.TIMESTAMP.getColumnName(), Long.valueOf(chat.W()));
        Object obj = chat.j();
        String s = ((String) (obj));
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            s = "";
        }
        contentvalues.put(ChatSchema.SENDER.getColumnName(), s);
        if (chat.k() != null && !chat.k().isEmpty())
        {
            contentvalues.put(ChatSchema.RECIPIENT.getColumnName(), (String)chat.k().get(0));
        }
        contentvalues.put(ChatSchema.ACK_ID.getColumnName(), chat.v());
        contentvalues.put(ChatSchema.USER_TEXT.getColumnName(), chat.an());
        contentvalues.put(ChatSchema.SEQ_NUM.getColumnName(), Long.valueOf(chat.w()));
        contentvalues.put(ChatSchema.SENDER_MESSAGE_STATE_VERSION.getColumnName(), Integer.valueOf(chat.x()));
        contentvalues.put(ChatSchema.RECIPIENT_MESSAGE_STATE_VERSION.getColumnName(), Integer.valueOf(chat.y()));
        contentvalues.put(ChatSchema.CONVERSATION_ID.getColumnName(), chat.ac());
        s = ChatSchema.IS_RELEASED_BY_RECIPIENT.getColumnName();
        int i;
        if (chat.u())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        contentvalues.put(s, Integer.valueOf(i));
        s = ChatSchema.IS_SAVED_BY_SENDER.getColumnName();
        if (chat.z())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        contentvalues.put(s, Integer.valueOf(i));
        s = ChatSchema.IS_SAVED_BY_RECIPIENT.getColumnName();
        if (chat.A())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        contentvalues.put(s, Integer.valueOf(i));
        contentvalues.put(ChatSchema.SEND_RECEIVE_STATUS.getColumnName(), ((StatefulChatFeedItem) (chat)).mSendReceiveStatus.name());
        contentvalues.put(ChatSchema.ITER_TOKEN.getColumnName(), chat.l());
        contentvalues.put(ChatSchema.TARGET_VIEW.getColumnName(), targetview.name());
        contentvalues.put(ChatSchema.RELEASED_TIMESTAMP.getColumnName(), Long.valueOf(chat.B()));
        contentvalues.put(ChatSchema.STATUS_TEXT.getColumnName(), chat.b());
        if (chat instanceof BG)
        {
            targetview = (BG)chat;
            String s1 = ChatSchema.HAS_LINKS.getColumnName();
            Object obj1;
            if (((BG) (targetview)).mHasLinks)
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 0;
            }
            contentvalues.put(s1, Integer.valueOf(i));
            s1 = d.a(((BG) (targetview)).mFormats);
            contentvalues.put(ChatSchema.TEXT_FORMAT.getColumnName(), s1);
            targetview = d.a(((BG) (targetview)).mLinkContent);
            contentvalues.put(ChatSchema.LINK_CONTENT.getColumnName(), targetview);
        }
        if (!(chat instanceof ChatMedia))
        {
            break; /* Loop/switch isn't completed */
        }
        targetview = (ChatMedia)chat;
        contentvalues.put(ChatSchema.MEDIA_ID.getColumnName(), targetview.F());
        if (targetview.G() == null)
        {
            chat = com.snapchat.android.model.chat.ChatMedia.MediaType.IMAGE.toString();
        } else
        {
            chat = targetview.G().toString();
        }
        contentvalues.put(ChatSchema.MEDIA_TYPE.getColumnName(), chat);
        if (targetview.H() == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        s1 = targetview.d();
        chat = targetview.H();
        obj1 = targetview.I();
        obj = KQ.CHAT_MEDIA_KEYS_AND_IVS;
        obj1 = new KF(chat, ((String) (obj1)));
        if (kh.mPrefKeyToMapMap.containsKey(obj))
        {
            chat = (Map)kh.mPrefKeyToMapMap.get(obj);
        } else
        {
            chat = kh.mSlightlySecurePreferences.b(((KP) (obj)));
            if (chat == null)
            {
                chat = new HashMap();
            } else
            {
                chat = KH.a(chat);
            }
        }
        chat.put(s1, obj1);
        kh.mPrefKeyToMapMap.put(obj, chat);
        contentvalues.put(ChatSchema.MEDIA_WIDTH.getColumnName(), Integer.valueOf(targetview.J()));
        contentvalues.put(ChatSchema.MEDIA_HEIGHT.getColumnName(), Integer.valueOf(targetview.K()));
        contentvalues.put(ChatSchema.IS_ZIPPED.getColumnName(), Boolean.valueOf(targetview.ab()));
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        sqlitedatabase.insertWithOnConflict("Chat", null, contentvalues, 5);
        return;
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
        return ChatSchema.values();
    }

    public final String c()
    {
        return "Chat";
    }

    public final String d()
    {
        StringBuilder stringbuilder = new StringBuilder();
        ChatSchema achatschema[] = ChatSchema.values();
        int j = achatschema.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = achatschema[i];
            if (i > 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append((new StringBuilder()).append(ChatSchema.a(((ChatSchema) (obj)))).append(" ").append(ChatSchema.b(((ChatSchema) (obj))).toString()).toString());
            obj = ((ChatSchema) (obj)).getConstraints();
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
        ChatSchema achatschema[] = ChatSchema.values();
        int k = achatschema.length;
        b = new String[k];
        for (int i = 0; i < k; i++)
        {
            b[i] = achatschema[i].getColumnName();
        }

        a = new HashMap();
        achatschema = ChatSchema.values();
        k = achatschema.length;
        for (int j = ((flag) ? 1 : 0); j < k; j++)
        {
            ChatSchema chatschema = achatschema[j];
            a.put(chatschema.getColumnName(), chatschema.getColumnName());
        }

    }
}
