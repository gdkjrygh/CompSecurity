// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.android.pushservice;

import android.app.Notification;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import com.baidu.frontia.a.b.a.a;
import com.baidu.frontia.a.e.b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;

// Referenced classes of package com.baidu.android.pushservice:
//            PushNotificationBuilder, BasicPushNotificationBuilder, a

public class g
{

    private static String a = "NotificationBuilderManager";
    private static String b = "notification_builder_storage";
    private static Object c = new Object();
    private static int d = 0;

    public static Notification a(Context context, int i, int j, String s, String s1, boolean flag)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        PushNotificationBuilder pushnotificationbuilder = a(context, i);
        pushnotificationbuilder.setNotificationTitle(s);
        pushnotificationbuilder.setNotificationText(s1);
        context = pushnotificationbuilder.construct(context);
        if ((j & 1) == 0) goto _L2; else goto _L1
_L1:
        context.flags = ((Notification) (context)).flags & 0xffffffdf;
_L5:
        if (!flag) goto _L4; else goto _L3
_L3:
        context.defaults = 0;
_L6:
        obj;
        JVM INSTR monitorexit ;
        return context;
_L2:
        context.flags = ((Notification) (context)).flags | 0x20;
          goto _L5
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
_L4:
        context.defaults = -1;
        if ((j & 4) == 0)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        context.defaults = ((Notification) (context)).defaults | 1;
_L7:
        if ((j & 2) == 0)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        context.defaults = ((Notification) (context)).defaults | 2;
          goto _L6
        context.defaults = ((Notification) (context)).defaults & -2;
          goto _L7
        context.defaults = ((Notification) (context)).defaults & -3;
          goto _L6
    }

    public static Notification a(Context context, int i, String s, String s1, boolean flag)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        PushNotificationBuilder pushnotificationbuilder = a(context, i);
        pushnotificationbuilder.setNotificationTitle(s);
        pushnotificationbuilder.setNotificationText(s1);
        context = pushnotificationbuilder.construct(context);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        context.defaults = -1;
_L1:
        obj;
        JVM INSTR monitorexit ;
        return context;
        context.defaults = 0;
          goto _L1
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    private static PushNotificationBuilder a(Context context)
    {
        BasicPushNotificationBuilder basicpushnotificationbuilder = new BasicPushNotificationBuilder();
        basicpushnotificationbuilder.setNotificationFlags(16);
        basicpushnotificationbuilder.setNotificationDefaults(3);
        basicpushnotificationbuilder.setStatusbarIcon(context.getApplicationInfo().icon);
        return basicpushnotificationbuilder;
    }

    private static PushNotificationBuilder a(Context context, int i)
    {
        Object obj;
        if (com.baidu.android.pushservice.a.b())
        {
            com.baidu.frontia.a.b.a.a.b(a, (new StringBuilder("getBuilder id=")).append(i).toString());
        }
        obj = context.getSharedPreferences(b, 0).getString(String.valueOf(i), null);
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = new ByteArrayInputStream(com.baidu.frontia.a.e.b.a(((String) (obj)).getBytes()));
        ObjectInputStream objectinputstream;
        objectinputstream = new ObjectInputStream(((java.io.InputStream) (obj)));
        context = (PushNotificationBuilder)objectinputstream.readObject();
        objectinputstream.close();
        ((ByteArrayInputStream) (obj)).close();
        return context;
        Object obj1;
        obj1;
        context = null;
_L8:
        com.baidu.frontia.a.b.a.a.d(a, "getBuilder read object error");
        com.baidu.frontia.a.b.a.a.d(a, (new StringBuilder("error ")).append(((StreamCorruptedException) (obj1)).getMessage()).toString());
        return context;
        obj1;
        context = null;
_L6:
        com.baidu.frontia.a.b.a.a.d(a, "getBuilder read object error");
        com.baidu.frontia.a.b.a.a.d(a, (new StringBuilder("error ")).append(((IOException) (obj1)).getMessage()).toString());
        return context;
        obj1;
        context = null;
_L4:
        com.baidu.frontia.a.b.a.a.d(a, "getBuilder read object error: class not found");
        com.baidu.frontia.a.b.a.a.d(a, (new StringBuilder("error ")).append(((ClassNotFoundException) (obj1)).getMessage()).toString());
        return context;
_L2:
        return b(context);
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
        obj1;
        if (true) goto _L6; else goto _L5
_L5:
        obj1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static void a(Context context, int i, PushNotificationBuilder pushnotificationbuilder)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        ObjectOutputStream objectoutputstream = new ObjectOutputStream(bytearrayoutputstream);
        objectoutputstream.writeObject(pushnotificationbuilder);
        pushnotificationbuilder = com.baidu.frontia.a.e.b.a(bytearrayoutputstream.toByteArray(), "US-ASCII");
        context = context.getSharedPreferences(b, 0).edit();
        context.putString(String.valueOf(i), pushnotificationbuilder);
        context.commit();
        bytearrayoutputstream.close();
        objectoutputstream.close();
_L1:
        return;
        context;
        com.baidu.frontia.a.b.a.a.d(a, "setNotificationBuilder write object error");
        com.baidu.frontia.a.b.a.a.d(a, (new StringBuilder("error ")).append(context.getMessage()).toString());
          goto _L1
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        context;
        com.baidu.frontia.a.b.a.a.d(a, "setNotificationBuilder write object error");
        com.baidu.frontia.a.b.a.a.d(a, (new StringBuilder("error ")).append(context.getMessage()).toString());
          goto _L1
    }

    public static void a(Context context, PushNotificationBuilder pushnotificationbuilder)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        ObjectOutputStream objectoutputstream = new ObjectOutputStream(bytearrayoutputstream);
        objectoutputstream.writeObject(pushnotificationbuilder);
        pushnotificationbuilder = com.baidu.frontia.a.e.b.a(bytearrayoutputstream.toByteArray(), "US-ASCII");
        context = context.getSharedPreferences(b, 0).edit();
        context.putString((new StringBuilder()).append(d).toString(), pushnotificationbuilder);
        context.commit();
        bytearrayoutputstream.close();
        objectoutputstream.close();
_L1:
        return;
        context;
        com.baidu.frontia.a.b.a.a.d(a, "setDefaultNotificationBuilder write object error");
        com.baidu.frontia.a.b.a.a.d(a, (new StringBuilder("error ")).append(context.getMessage()).toString());
          goto _L1
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        context;
        com.baidu.frontia.a.b.a.a.d(a, "setDefaultNotificationBuilder write object error");
        com.baidu.frontia.a.b.a.a.d(a, (new StringBuilder("error ")).append(context.getMessage()).toString());
          goto _L1
    }

    private static PushNotificationBuilder b(Context context)
    {
        Object obj = context.getSharedPreferences(b, 0).getString((new StringBuilder()).append(d).toString(), null);
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = new ByteArrayInputStream(com.baidu.frontia.a.e.b.a(((String) (obj)).getBytes()));
        ObjectInputStream objectinputstream;
        objectinputstream = new ObjectInputStream(((java.io.InputStream) (obj)));
        context = (PushNotificationBuilder)objectinputstream.readObject();
        objectinputstream.close();
        ((ByteArrayInputStream) (obj)).close();
        return context;
        Object obj1;
        obj1;
        context = null;
_L8:
        com.baidu.frontia.a.b.a.a.d(a, "getDefaultBuilder read object error");
        com.baidu.frontia.a.b.a.a.d(a, (new StringBuilder("error ")).append(((StreamCorruptedException) (obj1)).getMessage()).toString());
        return context;
        obj1;
        context = null;
_L6:
        com.baidu.frontia.a.b.a.a.d(a, "getDefaultBuilder read object error");
        com.baidu.frontia.a.b.a.a.d(a, (new StringBuilder("error ")).append(((IOException) (obj1)).getMessage()).toString());
        return context;
        obj1;
        context = null;
_L4:
        com.baidu.frontia.a.b.a.a.d(a, "getDefaultBuilder read object error: class not found");
        com.baidu.frontia.a.b.a.a.d(a, (new StringBuilder("error ")).append(((ClassNotFoundException) (obj1)).getMessage()).toString());
        return context;
_L2:
        return a(context);
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
        obj1;
        if (true) goto _L6; else goto _L5
_L5:
        obj1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static void b(Context context, PushNotificationBuilder pushnotificationbuilder)
    {
        a(context, 8888, pushnotificationbuilder);
    }

}
