// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.analytics.framework.ErrorMetric;
import com.snapchat.android.model.Mediabryo;
import com.snapchat.android.model.chat.ChatConversation;
import com.snapchat.android.model.chat.ChatFeedItem;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class lo
{

    private static final lo INSTANCE = new lo();
    protected static final String LOAD_CONVERSATIONS_TABLE_TIMED_EVENT = "LOAD_CONVERSATIONS_TABLE_TIMED";
    protected static final String NUM_CONVERSATIONS_PARAM = "num_conversations";
    protected static final String NUM_ITEMS_PARAM = "num_items";
    private final PB mClock;
    private final com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory mEasyMetricFactory;
    public EasyMetric mLoadConversationsMetric;

    private lo()
    {
        this(new com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory(), new PB());
    }

    private lo(com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory easymetricfactory, PB pb)
    {
        mEasyMetricFactory = easymetricfactory;
        mClock = pb;
    }

    public static lo a()
    {
        return INSTANCE;
    }

    public static void a(AA aa, long l, int i, boolean flag, String s)
    {
        Object obj = ((Mediabryo) (aa)).mSnapType.toString().toLowerCase();
        aa.i();
        JVM INSTR tableswitch 0 4: default 52
    //                   0 116
    //                   1 122
    //                   2 128
    //                   3 52
    //                   4 134;
           goto _L1 _L2 _L3 _L4 _L1 _L5
_L5:
        break MISSING_BLOCK_LABEL_134;
_L1:
        aa = "null";
_L6:
        obj = com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.a("SNAP_MEDIA_UPLOAD").a(l).a("type", aa).a("context", obj).a("request_size_bytes", Integer.valueOf(i));
        if (flag)
        {
            aa = "true";
        } else
        {
            aa = "false";
        }
        ((EasyMetric) (obj)).a("success", aa).a("reachability", s).a(false);
        return;
_L2:
        aa = "image";
          goto _L6
_L3:
        aa = "video_audio";
          goto _L6
_L4:
        aa = "video_no_audio";
          goto _L6
        aa = "discover";
          goto _L6
    }

    public static void a(AT at, String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.a("SNAP_RECEIVED").a("context", s).b(false);
        }
        if (!at.D())
        {
            com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.a("SNAP_DELIVERY_LATENCY").a(System.currentTimeMillis() - at.W()).e();
        }
    }

    public static void a(ChatConversation chatconversation, String s)
    {
        Iterator iterator = chatconversation.mItemsForFeedIcon.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        ChatFeedItem chatfeeditem = (ChatFeedItem)iterator.next();
        if (!(chatfeeditem instanceof AT)) goto _L4; else goto _L3
_L3:
        boolean flag1 = ((AT)chatfeeditem).O();
_L6:
        chatconversation = chatconversation.d(s);
        boolean flag;
        if (chatconversation != null && (chatconversation instanceof AT))
        {
            chatconversation = (AT)chatconversation;
            if (chatconversation.D() || chatconversation.E())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = false;
        }
        com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.a("NOTIF_OPEN_SNAP_META_LOADED").a("success", Boolean.valueOf(flag1)).a(false);
        if (flag)
        {
            com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.a("NOTIF_OPEN_SNAP_VIEWED").a(false);
        }
        return;
_L2:
        flag1 = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static void a(com.snapchat.android.notification.AndroidNotificationManager.Type type)
    {
        if (type == null)
        {
            (new EasyMetric("BACKGROUND_NOTIFICATION_UNSPECIFIED")).b(false);
            return;
        } else
        {
            (new EasyMetric((new StringBuilder("BACKGROUND_NOTIFICATION_")).append(type.name().toUpperCase(Locale.US)).toString())).b(false);
            return;
        }
    }

    public static void a(String s)
    {
        com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.a("SNAP_TAP_TO_RETRY").a("context", s).a(false);
    }

    public static void b(com.snapchat.android.notification.AndroidNotificationManager.Type type)
    {
        (new ErrorMetric("EMPTY_PUSH_NOTIFICATION_TEXT")).a("PUSH_NOTIFICATION_TYPE", type.name()).b(false);
    }

    public static void b(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            (new EasyMetric("NOTIFICATION_RECEIVED_UNSPECIFIED")).b(false);
            return;
        } else
        {
            (new EasyMetric((new StringBuilder("NOTIFICATION_RECEIVED_")).append(s.toUpperCase(Locale.US)).toString())).b(false);
            return;
        }
    }

    public static void c(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            (new EasyMetric("NOTIFICATION_OPENED_UNSPECIFIED")).b(false);
            return;
        } else
        {
            (new EasyMetric((new StringBuilder("NOTIFICATION_OPENED_")).append(s.toUpperCase(Locale.US)).toString())).b(false);
            return;
        }
    }

    public final void a(long l, long l1)
    {
        mLoadConversationsMetric.a("num_conversations", Long.valueOf(l)).a("num_items", Long.valueOf(l1)).b(false);
    }

}
