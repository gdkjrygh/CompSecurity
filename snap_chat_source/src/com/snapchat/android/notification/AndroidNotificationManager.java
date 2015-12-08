// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.notification;

import AY;
import Br;
import Bt;
import Bv;
import By;
import CG;
import CH;
import Ei;
import IC;
import Ic;
import MY;
import Mf;
import Pj;
import ad;
import ak;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.google.gson.reflect.TypeToken;
import com.snapchat.android.Timber;
import com.snapchat.android.database.table.ChatsReceivedInLastHourTable;
import com.snapchat.android.database.table.ConversationTable;
import com.snapchat.android.database.table.NotificationTable;
import com.snapchat.android.model.Snap;
import com.snapchat.android.model.chat.Chat;
import com.snapchat.android.model.chat.ChatConversation;
import com.snapchat.android.model.chat.ChatFeedItem;
import com.snapchat.android.model.chat.StatefulChatFeedItem;
import com.snapchat.android.util.SnapMediaUtils;
import com.snapchat.android.util.crypto.CbcEncryptionAlgorithm;
import com.snapchat.android.util.debug.ReleaseManager;
import com.snapchat.android.util.debug.ScApplicationInfo;
import com.squareup.otto.Bus;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import lX;
import lo;
import lw;
import oy;
import sz;

public final class AndroidNotificationManager
{
    public static final class Destination extends Enum
    {

        private static final Destination $VALUES[];
        public static final Destination ADD_FRIENDS;

        public static Destination valueOf(String s)
        {
            return (Destination)Enum.valueOf(com/snapchat/android/notification/AndroidNotificationManager$Destination, s);
        }

        public static Destination[] values()
        {
            return (Destination[])$VALUES.clone();
        }

        static 
        {
            ADD_FRIENDS = new Destination("ADD_FRIENDS");
            $VALUES = (new Destination[] {
                ADD_FRIENDS
            });
        }

        private Destination(String s)
        {
            super(s, 0);
        }
    }

    public static final class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type ADDFRIEND;
        public static final Type ADD_COLLABORATOR_TO_COLLABORATOR;
        public static final Type ADD_COLLABORATOR_TO_OWNER;
        public static final Type CASH;
        public static final Type CASH_MESSAGE;
        public static final Type CHAT;
        public static final Type CHAT_SCREENSHOT;
        public static final Type EMAIL_VERIFIED;
        public static final Type FAILED_CASH;
        public static final Type FAILED_CHAT_NOT_FRIENDS;
        public static final Type FAILED_SNAP_AND_CHAT;
        public static final Type HERE_SCREENSHOT;
        public static final Type REPLAY;
        public static final Type SCREENSHOT;
        public static final Type SNAP;
        public static final Type STORIES;
        public static final Type TYPING;
        public static final Type UPLOAD_LOGS_REQUEST;
        private final int a;

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/snapchat/android/notification/AndroidNotificationManager$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        public final int getNotificationId()
        {
            return a;
        }

        public final String getTypeNotificationAction()
        {
            return (new StringBuilder("LANDING_PAGE_ACTION_FROM_NOTIF_TYPE")).append(name()).toString();
        }

        static 
        {
            SNAP = new Type("SNAP", 0, 0);
            CHAT = new Type("CHAT", 1, 0);
            ADDFRIEND = new Type("ADDFRIEND", 2, 1);
            REPLAY = new Type("REPLAY", 3, 2);
            TYPING = new Type("TYPING", 4, 3);
            SCREENSHOT = new Type("SCREENSHOT", 5, 4);
            CHAT_SCREENSHOT = new Type("CHAT_SCREENSHOT", 6, 5);
            HERE_SCREENSHOT = new Type("HERE_SCREENSHOT", 7, 6);
            STORIES = new Type("STORIES", 8, 7);
            CASH = new Type("CASH", 9, 11);
            CASH_MESSAGE = new Type("CASH_MESSAGE", 10, 13);
            FAILED_SNAP_AND_CHAT = new Type("FAILED_SNAP_AND_CHAT", 11, 8);
            FAILED_CHAT_NOT_FRIENDS = new Type("FAILED_CHAT_NOT_FRIENDS", 12, 9);
            UPLOAD_LOGS_REQUEST = new Type("UPLOAD_LOGS_REQUEST", 13, 10);
            FAILED_CASH = new Type("FAILED_CASH", 14, 12);
            EMAIL_VERIFIED = new Type("EMAIL_VERIFIED", 15, 15);
            ADD_COLLABORATOR_TO_OWNER = new Type("ADD_COLLABORATOR_TO_OWNER", 16, 16);
            ADD_COLLABORATOR_TO_COLLABORATOR = new Type("ADD_COLLABORATOR_TO_COLLABORATOR", 17, 17);
            $VALUES = (new Type[] {
                SNAP, CHAT, ADDFRIEND, REPLAY, TYPING, SCREENSHOT, CHAT_SCREENSHOT, HERE_SCREENSHOT, STORIES, CASH, 
                CASH_MESSAGE, FAILED_SNAP_AND_CHAT, FAILED_CHAT_NOT_FRIENDS, UPLOAD_LOGS_REQUEST, FAILED_CASH, EMAIL_VERIFIED, ADD_COLLABORATOR_TO_OWNER, ADD_COLLABORATOR_TO_COLLABORATOR
            });
        }

        private Type(String s, int l, int i1)
        {
            super(s, l);
            a = i1;
        }
    }

    public static final class a
    {

        public final String a;
        public int b;
        public long c;

        public a(String s)
        {
            a = s;
        }
    }

    public static final class b
    {

        public final String a;
        public final String b;

        public b(String s, String s1)
        {
            a = s;
            b = s1;
        }
    }


    public static final int a = Color.parseColor("#AAAAAA");
    private static final String f[];
    private static final AndroidNotificationManager g = new AndroidNotificationManager();
    private static final long h[] = {
        0L, 50L, 100L, 180L
    };
    private static String i;
    public By b;
    public final oy c;
    public final lw d;
    public boolean e;
    private final Ei j;
    private CG k;

    private AndroidNotificationManager()
    {
        ChatsReceivedInLastHourTable.a();
        Ei ei = Ei.a();
        By by = By.c();
        oy oy1 = oy.a();
        Bt.a();
        CG cg = CG.a();
        new CH();
        lo.a();
        lw lw1 = lw.a();
        new lX();
        this(ei, by, oy1, cg, lw1);
    }

    private AndroidNotificationManager(Ei ei, By by, oy oy1, CG cg, lw lw1)
    {
        j = ei;
        b = by;
        c = oy1;
        k = cg;
        d = lw1;
    }

    public static AndroidNotificationManager a()
    {
        return g;
    }

    public static String a(String s, String s1)
    {
        if (s == null || s1 == null)
        {
            return null;
        }
        Object aobj[] = s.split(":");
        if (aobj.length != 2)
        {
            Timber.e("AndroidNotificationManager", (new StringBuilder("Ignoring malformed payload. iv and messages aren't properly formatted: ")).append(s).toString(), new Object[0]);
            return null;
        }
        s1 = s1.getBytes();
        byte abyte0[];
        try
        {
            abyte0 = Base64.decode(aobj[0], 0);
            aobj = Base64.decode(aobj[1], 0);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            Timber.e("AndroidNotificationManager", (new StringBuilder("Badly encoded push notification data: ")).append(s).toString(), new Object[0]);
            return null;
        }
        s1 = new CbcEncryptionAlgorithm(s1, abyte0);
        try
        {
            s1 = s1.b(((byte []) (aobj)), "no dataId provided");
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            Timber.a("AndroidNotificationManager", s1);
            s1 = null;
        }
        if (s1 == null)
        {
            Timber.e("AndroidNotificationManager", (new StringBuilder("Badly encrypted push notification data: ")).append(s).toString(), new Object[0]);
            return null;
        }
        try
        {
            s = new String(s1, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = null;
        }
        return s;
    }

    private static String a(LinkedHashMap linkedhashmap)
    {
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator = linkedhashmap.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (Bv)iterator.next();
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(((Bv) (obj)).b());
            obj = (a)linkedhashmap.get(obj);
            if (((a) (obj)).b > 1)
            {
                stringbuilder.append(" (");
                stringbuilder.append(((a) (obj)).b);
                stringbuilder.append(")");
            }
        } while (true);
        return stringbuilder.toString();
    }

    public static void a(Context context)
    {
        int l = 0;
        Timber.c("AndroidNotificationManager", "clearAllNotifications", new Object[0]);
        NotificationManager notificationmanager = (NotificationManager)context.getSystemService("notification");
        Type atype[] = Type.values();
        for (int i1 = atype.length; l < i1; l++)
        {
            Type type = atype[l];
            notificationmanager.cancel(type.getNotificationId());
            NotificationTable.a(context, type.name());
        }

    }

    private void a(Context context, Resources resources, Cursor cursor)
    {
        LinkedHashMap linkedhashmap;
        Object obj;
        Type type = Type.CASH;
        if (cursor == null || cursor.getCount() == 0 || !cursor.moveToFirst())
        {
            a(context, type);
            return;
        }
        linkedhashmap = new LinkedHashMap();
        boolean flag = false;
        do
        {
            obj = cursor.getString(com.snapchat.android.database.table.NotificationTable.NotificationSchema.SENDER.getColumnNumber());
            String s = cursor.getString(com.snapchat.android.database.table.NotificationTable.NotificationSchema.SENDER_USERNAME.getColumnNumber());
            linkedhashmap.put(obj, cursor.getString(com.snapchat.android.database.table.NotificationTable.NotificationSchema.CASH_AMOUNT.getColumnNumber()));
            boolean flag1 = flag;
            if (cursor.isLast())
            {
                if (cursor.getInt(com.snapchat.android.database.table.NotificationTable.NotificationSchema.NINJA_MODE.getColumnNumber()) == 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                flag1 = flag;
            }
            flag = flag1;
        } while (cursor.moveToNext());
        cursor = resources.getStringArray(b(type));
        obj = new ArrayList();
        resources = new ArrayList(linkedhashmap.keySet());
        switch (resources.size())
        {
        default:
            ((List) (obj)).addAll(resources);
            break;

        case 1: // '\001'
            break MISSING_BLOCK_LABEL_281;
        }
_L1:
        cursor = String.format(cursor[Math.min(resources.size() - 1, cursor.length - 1)], ((List) (obj)).toArray());
        String s1;
        if (resources.size() == 1)
        {
            resources = new a(s);
        } else
        {
            resources = null;
        }
        a(context, b(context), ((String) (cursor)), ((String) (cursor)), type, ((a) (resources)), null, flag1);
        return;
        s1 = (String)resources.get(0);
        ((List) (obj)).add(s1);
        ((List) (obj)).add(linkedhashmap.get(s1));
          goto _L1
    }

    private void a(Context context, Resources resources, Cursor cursor, Type type)
    {
        if (cursor != null && cursor.moveToFirst()) goto _L2; else goto _L1
_L1:
        a(context, type);
_L4:
        return;
_L2:
        String s1;
        ArrayList arraylist;
        int l;
        boolean flag;
        arraylist = new ArrayList();
        LinkedHashSet linkedhashset = new LinkedHashSet();
        flag = false;
        String s = null;
        do
        {
            String s2 = cursor.getString(com.snapchat.android.database.table.NotificationTable.NotificationSchema.SENDER.getColumnNumber());
            s1 = cursor.getString(com.snapchat.android.database.table.NotificationTable.NotificationSchema.SENDER_USERNAME.getColumnNumber());
            if (linkedhashset.add(s1))
            {
                if (s == null)
                {
                    s = s1;
                }
                arraylist.add(s2);
            }
            s1 = cursor.getString(com.snapchat.android.database.table.NotificationTable.NotificationSchema.TEXT.getColumnNumber());
            if (cursor.isLast())
            {
                if (cursor.getInt(com.snapchat.android.database.table.NotificationTable.NotificationSchema.NINJA_MODE.getColumnNumber()) == 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            }
        } while (cursor.moveToNext());
        l = b(type);
        if (l < 0 && !a(type)) goto _L4; else goto _L3
_L3:
        String as[];
        if (linkedhashset.size() == 1)
        {
            cursor = new a(s);
        } else
        {
            cursor = null;
        }
        if (!a(type)) goto _L6; else goto _L5
_L5:
        if (TextUtils.isEmpty(s1))
        {
            lo.b(type);
            return;
        }
        resources = s1;
_L8:
        a(context, b(context), ((String) (resources)), ((String) (resources)), type, ((a) (cursor)), null, flag);
        return;
_L6:
        as = resources.getStringArray(l);
        l = Math.min(arraylist.size() - 1, as.length - 1);
        switch (arraylist.size())
        {
        default:
            resources = Pair.create(arraylist.get(0), arraylist.get(1));
            break;

        case 0: // '\0'
            break; /* Loop/switch isn't completed */

        case 1: // '\001'
            break MISSING_BLOCK_LABEL_351;
        }
_L9:
        resources = String.format(as[l], new Object[] {
            ((Pair) (resources)).first, ((Pair) (resources)).second
        });
        if (true) goto _L8; else goto _L7
_L7:
        resources = Pair.create(null, null);
          goto _L9
        resources = Pair.create(arraylist.get(0), null);
          goto _L9
    }

    public static void a(Context context, Type type)
    {
        Timber.c("AndroidNotificationManager", (new StringBuilder("clearNotifications type=")).append(type).toString(), new Object[0]);
        ((NotificationManager)context.getSystemService("notification")).cancel(type.getNotificationId());
        NotificationTable.a(context, type.name());
    }

    private void a(Context context, String s, String s1, String s2, Type type, a a1, b b1, 
            boolean flag)
    {
        if (Bt.bQ()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int l;
        boolean flag1;
        NotificationManager notificationmanager = (NotificationManager)context.getSystemService("notification");
        a1 = PendingIntent.getActivity(context, 0, CH.a(context, type, a1, b1, true), 0x8000000);
        Object obj = j;
        b1 = type.name();
        obj = ((Ei) (obj)).c(context);
        ((Intent) (obj)).putExtra("op_code", 1000);
        ((Intent) (obj)).putExtra("clear", true);
        ((Intent) (obj)).putExtra("notification_type", b1);
        b1 = PendingIntent.getService(context, 0, ((Intent) (obj)), 0x10000000);
        s1 = (new ad.d(context)).a(s).b(s1).a((new ad.c()).a(s1)).a();
        s1.d = a1;
        long l1 = System.currentTimeMillis();
        ((ad.d) (s1)).l.when = l1;
        if (flag)
        {
            s2 = null;
        }
        s1 = s1.c(s2);
        ((ad.d) (s1)).l.deleteIntent = b1;
        s1 = s1.a(new long[0]);
        flag1 = TextUtils.equals(s, b(context));
        l = android.os.Build.VERSION.SDK_INT;
        s1.a(0x7f0201aa);
        if (l < 21)
        {
            break MISSING_BLOCK_LABEL_670;
        }
        public static final class _cls5
        {

            public static final int a[];

            static 
            {
                a = new int[Type.values().length];
                try
                {
                    a[Type.TYPING.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    a[Type.CHAT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    a[Type.CHAT_SCREENSHOT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    a[Type.SNAP.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    a[Type.REPLAY.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    a[Type.SCREENSHOT.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    a[Type.HERE_SCREENSHOT.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[Type.CASH.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[Type.STORIES.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[Type.CASH_MESSAGE.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[Type.ADDFRIEND.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[Type.ADD_COLLABORATOR_TO_OWNER.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[Type.ADD_COLLABORATOR_TO_COLLABORATOR.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[Type.FAILED_SNAP_AND_CHAT.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[Type.FAILED_CHAT_NOT_FRIENDS.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[Type.FAILED_CASH.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        int i1;
        if (flag1)
        {
            l = 0x7f0201a6;
        } else
        {
            l = 0x7f0201a8;
        }
        s1.e = SnapMediaUtils.a(context, l);
        _cls5.a[type.ordinal()];
        JVM INSTR tableswitch 1 16: default 328
    //                   1 625
    //                   2 625
    //                   3 625
    //                   4 610
    //                   5 610
    //                   6 610
    //                   7 625
    //                   8 640
    //                   9 655
    //                   10 640
    //                   11 328
    //                   12 328
    //                   13 328
    //                   14 610
    //                   15 625
    //                   16 640;
           goto _L3 _L4 _L4 _L4 _L5 _L5 _L5 _L4 _L6 _L7 _L6 _L3 _L3 _L3 _L5 _L4 _L6
_L3:
        l = context.getResources().getColor(0x7f0c0058);
_L8:
        s1.k = l;
_L9:
        if (!flag && Bt.bM())
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (l != 0)
        {
            s1.a(h);
        }
        if (!flag && Bt.bN())
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (l != 0)
        {
            ((ad.d) (s1)).l.defaults = 1;
        }
        if (Bt.bO())
        {
            ((ad.d) (s1)).l.ledARGB = -256;
            ((ad.d) (s1)).l.ledOnMS = 1000;
            ((ad.d) (s1)).l.ledOffMS = 2000;
            if (((ad.d) (s1)).l.ledOnMS != 0 && ((ad.d) (s1)).l.ledOffMS != 0)
            {
                l = 1;
            } else
            {
                l = 0;
            }
            s = ((ad.d) (s1)).l;
            i1 = ((ad.d) (s1)).l.flags;
            if (l != 0)
            {
                l = 1;
            } else
            {
                l = 0;
            }
            s.flags = l | i1 & -2;
        }
        s = new ad.r();
        s.a = BitmapFactory.decodeResource(context.getResources(), 0x7f020085);
        s.a(s1);
        if (Ic.SUPPORTS_NOTIFICATION_PRIORITY)
        {
            s1.f = 1;
        }
        notificationmanager.notify(type.getNotificationId(), s1.b());
        if (!flag && Bt.bP())
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (l != 0)
        {
            context = (PowerManager)context.getSystemService("power");
            if (!context.isScreenOn())
            {
                context.newWakeLock(0x10000006, "MyLock").acquire(2000L);
                return;
            }
        }
          goto _L1
_L5:
        l = context.getResources().getColor(0x7f0c0058);
          goto _L8
_L4:
        l = context.getResources().getColor(0x7f0c000a);
          goto _L8
_L6:
        l = context.getResources().getColor(0x7f0c0064);
          goto _L8
_L7:
        l = context.getResources().getColor(0x7f0c0050);
          goto _L8
        if (flag1)
        {
            l = 0x7f0201a7;
        } else
        {
            l = 0x7f0201a9;
        }
        s1.e = SnapMediaUtils.a(context, l);
          goto _L9
    }

    private static boolean a(Type type)
    {
        switch (_cls5.a[type.ordinal()])
        {
        default:
            return false;

        case 9: // '\t'
        case 10: // '\n'
            return true;
        }
    }

    private static int b(Type type)
    {
        switch (_cls5.a[type.ordinal()])
        {
        case 2: // '\002'
        case 4: // '\004'
        case 9: // '\t'
        case 10: // '\n'
        default:
            return -1;

        case 11: // '\013'
            return 0x7f090009;

        case 5: // '\005'
            return 0x7f09000c;

        case 3: // '\003'
        case 6: // '\006'
        case 7: // '\007'
            return 0x7f09000d;

        case 8: // '\b'
            return 0x7f090008;

        case 1: // '\001'
            return 0x7f09000e;

        case 12: // '\f'
            return 0x7f09000b;

        case 13: // '\r'
            return 0x7f09000a;
        }
    }

    private static String b(Context context)
    {
        if (TextUtils.isEmpty(i))
        {
            i = context.getString(0x7f0801a9);
        }
        return i;
    }

    public static void c(Context context, String s)
    {
        boolean flag1 = true;
        if (!ReleaseManager.f())
        {
            return;
        }
        Object obj = (new StringBuilder()).append(ScApplicationInfo.a(context)).append("\nUser Agent: ").append(Pj.a()).append("\n").append(s).toString();
        Object obj1 = new Intent("android.intent.action.SEND");
        ((Intent) (obj1)).setType("plain/text");
        ((Intent) (obj1)).setFlags(0x10000000);
        ((Intent) (obj1)).putExtra("android.intent.extra.SUBJECT", "[Android] New ANR Report");
        ((Intent) (obj1)).putExtra("android.intent.extra.TEXT", ((String) (obj)));
        obj1 = PendingIntent.getActivity(context, 0, ((Intent) (obj1)), 0x8000000);
        obj = ak.a(context);
        ad.g g1 = new ad.g();
        if (!TextUtils.isEmpty(s))
        {
            String as[] = TextUtils.split(s, "\n");
            for (int l = 1; l < as.length; l++)
            {
                g1.a(as[l]);
            }

        }
        context = (new ad.d(context)).a("ANR detected from Snapchat").a(0x1080078).b(s).c("ANR detected from Snapchat").a(g1);
        ((ad.d) (context)).i.add(new ad.a("Send E-mail", ((PendingIntent) (obj1))));
        context.d = ((PendingIntent) (obj1));
        context = context.a(new long[] {
            0L, 50L
        }).a().b();
        s = ad.a(context);
        boolean flag;
        if (s != null && s.getBoolean("android.support.useSideChannel"))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            s = new ak.e(((ak) (obj)).a.getPackageName(), context);
            synchronized (ak.c)
            {
                if (ak.d == null)
                {
                    ak.d = new ak.g(((ak) (obj)).a.getApplicationContext());
                }
            }
            ak.d.a.obtainMessage(0, s).sendToTarget();
            ak.e.a(((ak) (obj)).b);
            return;
        } else
        {
            ak.e.a(((ak) (obj)).b, context);
            return;
        }
        s;
        context;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final transient void a(Context context, int l, Object aobj[])
    {
        b(context, context.getString(l, aobj));
    }

    public final void a(Context context, String s)
    {
        s = IC.a(null, 0x7f0801a3, new Object[] {
            s
        });
        a(context, b(context), s, s, Type.FAILED_CHAT_NOT_FRIENDS, null, null, false);
    }

    public final void a(Context context, String s, long l, String s1, String s2, String s3, 
            String s4, long l1, Type type, boolean flag, String s5)
    {
        if (!e)
        {
            break MISSING_BLOCK_LABEL_253;
        }
        context = k;
        if (!CG.h.contains(type))
        {
            break MISSING_BLOCK_LABEL_278;
        }
        l = System.currentTimeMillis();
        if (type == Type.CHAT)
        {
label0:
            {
                synchronized (((CG) (context)).f)
                {
                    if (!((CG) (context)).f.containsKey(s2) || l - ((Long)((CG) (context)).f.get(s2)).longValue() >= 0x124f80L)
                    {
                        break label0;
                    }
                }
                return;
            }
        }
          goto _L1
        ((CG) (context)).f.put(s2, Long.valueOf(l));
        s3;
        JVM INSTR monitorexit ;
_L1:
        if (type == Type.TYPING)
        {
            synchronized (((CG) (context)).g)
            {
                if (!((CG) (context)).g.containsKey(s2) || l - ((Long)((CG) (context)).g.get(s2)).longValue() >= 0x124f80L)
                {
                    break MISSING_BLOCK_LABEL_182;
                }
            }
            return;
        }
          goto _L2
        context;
        s3;
        JVM INSTR monitorexit ;
        throw context;
        context;
        s3;
        JVM INSTR monitorexit ;
        throw context;
        ((CG) (context)).g.put(s2, Long.valueOf(l));
        s3;
        JVM INSTR monitorexit ;
_L2:
        synchronized (((CG) (context)).d)
        {
            s = new CG.a(s2, s1, type, ((CG) (context)).e.getAndIncrement(), s);
            ((CG) (context)).d.add(s);
        }
        return;
        context;
        s3;
        JVM INSTR monitorexit ;
        throw context;
        NotificationTable.a(context, s, l, s1, s2, s3, s4, l1, type.name(), flag, s5);
    }

    public final void a(Context context, boolean flag)
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Iterator iterator;
        int l;
        int j1;
        int k1;
        int l1;
        long l2;
        long l3;
        iterator = b.f().iterator();
        l1 = 0;
        k1 = 0;
        j1 = 0;
        l3 = 0L;
        l2 = 0L;
        l = 0;
_L11:
        List list;
        ChatConversation chatconversation;
        do
        {
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            chatconversation = (ChatConversation)iterator.next();
            list = chatconversation.u();
        } while (list == null);
        list;
        JVM INSTR monitorenter ;
        Iterator iterator1 = list.iterator();
        int i2 = l;
        l = l1;
        l1 = i2;
_L6:
        if (!iterator1.hasNext()) goto _L4; else goto _L3
_L3:
        ChatFeedItem chatfeeditem = (ChatFeedItem)iterator1.next();
        if (!chatfeeditem.R() || chatfeeditem.S()) goto _L6; else goto _L5
_L5:
        long l4 = chatfeeditem.W();
        if (!(chatfeeditem instanceof Chat)) goto _L8; else goto _L7
_L7:
        ((Chat)chatfeeditem).mSendReceiveStatus = com.snapchat.android.model.chat.StatefulChatFeedItem.SendReceiveStatus.FAILED_NOTIFIED_USER;
        int j2;
        if (l2 < l4)
        {
            l2 = l4;
        }
        j2 = k1 + 1;
        k1 = l1;
        break MISSING_BLOCK_LABEL_186;
_L8:
        if (!(chatfeeditem instanceof Snap)) goto _L6; else goto _L9
_L9:
        long l5;
        if (chatfeeditem instanceof AY)
        {
            ((AY)chatfeeditem).a(com.snapchat.android.model.Snap.ClientSnapStatus.FAILED_AND_USER_NOTIFIED_OF_FAILURE);
        }
        break MISSING_BLOCK_LABEL_517;
_L13:
        if (chatconversation.mIsUserInConversation) goto _L6; else goto _L10
_L10:
        j1++;
        l3 = l5;
        l = j2;
          goto _L6
_L4:
        list;
        JVM INSTR monitorexit ;
        j2 = l;
        l = l1;
        l1 = j2;
          goto _L11
        context;
        list;
        JVM INSTR monitorexit ;
        throw context;
        if (k1 == 0 && l1 == 0) goto _L1; else goto _L12
_L12:
        if (k1 > 0 && l1 == 0)
        {
            Br.a(context).a(new com.snapchat.android.database.table.DbTable.DatabaseTable[] {
                com.snapchat.android.database.table.DbTable.DatabaseTable.CHAT
            });
        } else
        if (k1 == 0 && l1 > 0)
        {
            Br.a(context).a(new com.snapchat.android.database.table.DbTable.DatabaseTable[] {
                com.snapchat.android.database.table.DbTable.DatabaseTable.SENT_SNAPS
            });
        } else
        {
            Br.a(context).a(new com.snapchat.android.database.table.DbTable.DatabaseTable[] {
                com.snapchat.android.database.table.DbTable.DatabaseTable.CHAT, com.snapchat.android.database.table.DbTable.DatabaseTable.SENT_SNAPS
            });
        }
        if (l != 0 || j1 != 0)
        {
            String s;
            String s1;
            if (l > 0 && j1 == 0)
            {
                s1 = context.getString(0x7f0801a2);
                s = s1;
            } else
            if (l == 0 && j1 > 0)
            {
                s1 = context.getString(0x7f0801a4);
                s = s1;
            } else
            {
                s = context.getString(0x7f0801a5);
                int i1;
                if (l3 > l2)
                {
                    i1 = 0x7f0801a4;
                } else
                {
                    i1 = 0x7f0801a2;
                }
                s1 = context.getString(i1);
            }
            a(context, b(context), s, s1, Type.FAILED_SNAP_AND_CHAT, null, null, flag);
            return;
        }
          goto _L1
        if (!chatconversation.mIsUserInConversation)
        {
            k1 = l1 + 1;
        }
        l1 = k1;
        k1 = j2;
          goto _L6
        l5 = l3;
        if (l3 < l4)
        {
            l5 = l4;
        }
        j2 = l + 1;
        l3 = l5;
        l = j2;
          goto _L13
    }

    public final void b(Context context, Type type)
    {
        Object obj;
        Object obj1;
        Object obj3;
        Cursor cursor;
        boolean flag2;
        if (e)
        {
            Mf.a().a(new MY());
            return;
        }
        obj1 = context.getResources();
        Object obj2;
        a a2;
        Object obj5;
        LinkedHashMap linkedhashmap;
        String s;
        String s1;
        String s2;
        boolean flag;
        long l;
        if (type == Type.SNAP || type == Type.CHAT)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            obj = f;
        } else
        {
            obj = new String[1];
            obj[0] = type.name();
        }
        cursor = NotificationTable.a(context, ((String []) (obj)));
        if (!flag) goto _L2; else goto _L1
_L1:
        linkedhashmap = new LinkedHashMap();
        flag2 = false;
        if (cursor == null) goto _L4; else goto _L3
_L3:
        if (cursor.getCount() <= 0 || !cursor.moveToFirst()) goto _L4; else goto _L5
_L5:
        obj1 = null;
        obj = null;
        flag = false;
_L20:
        obj2 = cursor.getString(com.snapchat.android.database.table.NotificationTable.NotificationSchema.SENDER.getColumnNumber());
        obj3 = cursor.getString(com.snapchat.android.database.table.NotificationTable.NotificationSchema.SENDER_USERNAME.getColumnNumber());
        l = cursor.getLong(com.snapchat.android.database.table.NotificationTable.NotificationSchema.CHAT_SEQ_NUM.getColumnNumber());
        obj3 = new Bv(((String) (obj3)), ((String) (obj2)));
        boolean flag1;
        if (type == Type.SNAP)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        obj = cursor.getString(com.snapchat.android.database.table.NotificationTable.NotificationSchema.ID.getColumnNumber());
        flag = true;
        a2 = (a)linkedhashmap.get(obj3);
        obj2 = a2;
        if (a2 != null)
        {
            break MISSING_BLOCK_LABEL_235;
        }
        obj2 = new a(((Bv) (obj3)).a());
        obj2.b = ((a) (obj2)).b + 1;
        if (((a) (obj2)).c < l)
        {
            obj2.c = l;
        }
        linkedhashmap.put(obj3, obj2);
        if (cursor.isLast())
        {
            a a1;
            Object obj4;
            if (cursor.getInt(com.snapchat.android.database.table.NotificationTable.NotificationSchema.NINJA_MODE.getColumnNumber()) == 1)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            obj1 = obj3;
            break; /* Loop/switch isn't completed */
        }
        if (cursor.moveToNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        linkedhashmap.size();
        JVM INSTR tableswitch 0 0: default 607
    //                   0 529;
           goto _L6 _L7
_L6:
        s = b(context);
        s1 = a(linkedhashmap);
        obj3 = ((Bv) (obj1)).b();
        obj2 = obj3;
        if (obj3 != null) goto _L9; else goto _L8
_L8:
        obj2 = ((Bv) (obj1)).a();
_L9:
        s2 = IC.a(null, 0x7f0801a8, new Object[] {
            obj2
        });
        obj4 = null;
        obj5 = null;
        a1 = obj4;
        obj3 = obj5;
        if (linkedhashmap.size() != 1) goto _L11; else goto _L10
_L10:
        if (flag) goto _L13; else goto _L12
_L12:
        a1 = (a)linkedhashmap.get(obj1);
        obj3 = obj5;
_L11:
        a(context, s, s1, s2, type, a1, ((b) (obj3)), flag2);
_L14:
        if (cursor != null)
        {
            cursor.close();
        }
        lo.a(type);
        return;
_L4:
        a(context, type);
          goto _L14
        context;
        if (cursor != null)
        {
            cursor.close();
        }
        throw context;
_L7:
        a(context, type);
          goto _L14
_L13:
        obj3 = new b(((Bv) (obj1)).a(), ((String) (obj)));
        a1 = obj4;
          goto _L11
_L2:
        if (type != Type.CASH) goto _L16; else goto _L15
_L15:
        a(context, ((Resources) (obj1)), cursor);
          goto _L14
_L16:
        a(context, ((Resources) (obj1)), cursor, type);
          goto _L14
        if (true) goto _L18; else goto _L17
_L18:
        break MISSING_BLOCK_LABEL_308;
_L17:
        if (true) goto _L20; else goto _L19
_L19:
    }

    public final void b(Context context, String s)
    {
        a(context, b(context), s, s, Type.FAILED_CASH, null, null, false);
    }

    static 
    {
        f = (new String[] {
            Type.SNAP.name(), Type.CHAT.name()
        });
    }

    // Unreferenced inner class com/snapchat/android/notification/AndroidNotificationManager$1

/* anonymous class */
    public final class _cls1 extends TypeToken
    {

    }


    // Unreferenced inner class com/snapchat/android/notification/AndroidNotificationManager$2

/* anonymous class */
    public final class _cls2 extends TypeToken
    {

    }


    // Unreferenced inner class com/snapchat/android/notification/AndroidNotificationManager$3

/* anonymous class */
    public final class _cls3
        implements com.snapchat.android.api2.chat.LoadConversationPageTask.a
    {

        private String a;
        private Br b;

        public final void a(boolean flag)
        {
            Timber.f("AndroidNotificationManager", "CHAT-LOG: AndroidNotificationManager LoadConversationPageTask completed for %s with success: %s", new Object[] {
                a, Boolean.valueOf(flag)
            });
            if (flag)
            {
                ChatConversation chatconversation = sz.a(a);
                if (chatconversation != null)
                {
                    if (chatconversation.mIsStub)
                    {
                        chatconversation.mIsStub = false;
                    }
                    ConversationTable.a().c(b);
                }
            }
        }

            public 
            {
                a = s;
                b = br;
                super();
            }
    }


    // Unreferenced inner class com/snapchat/android/notification/AndroidNotificationManager$4

/* anonymous class */
    public final class _cls4
        implements Runnable
    {

        private List a;
        private ChatConversation b;

        public final void run()
        {
            synchronized (a)
            {
                b.a(1);
            }
            return;
            exception;
            list;
            JVM INSTR monitorexit ;
            throw exception;
        }

            public 
            {
                a = list;
                b = chatconversation;
                super();
            }
    }

}
