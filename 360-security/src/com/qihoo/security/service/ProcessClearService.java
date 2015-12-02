// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.opti.b.c;
import com.qihoo360.mobilesafe.service.KillBean;
import java.util.ArrayList;
import java.util.List;

public class ProcessClearService extends Service
{

    public ProcessClearService()
    {
    }

    public static void a()
    {
        Context context = SecurityApplication.a();
        Intent intent = new Intent("action_init_engine");
        intent.setClass(context, com/qihoo/security/service/ProcessClearService);
        context.startService(intent);
    }

    public static void a(KillBean killbean)
    {
        ArrayList arraylist = new ArrayList();
        if (killbean != null)
        {
            arraylist.add(killbean);
        }
        b(arraylist);
    }

    public static void a(List list)
    {
        ArrayList arraylist = new ArrayList();
        if (list != null)
        {
            arraylist.addAll(list);
        }
        list = SecurityApplication.a();
        Intent intent = new Intent("action_set_data");
        intent.setClass(list, com/qihoo/security/service/ProcessClearService);
        intent.putExtra("data", arraylist);
        list.startService(intent);
    }

    public static void b()
    {
        Context context = SecurityApplication.a();
        Intent intent = new Intent("action_release_engine");
        intent.setClass(context, com/qihoo/security/service/ProcessClearService);
        context.startService(intent);
    }

    public static void b(List list)
    {
        ArrayList arraylist = new ArrayList();
        if (list != null)
        {
            arraylist.addAll(list);
        }
        list = SecurityApplication.a();
        Intent intent = new Intent("action_remove_data");
        intent.setClass(list, com/qihoo/security/service/ProcessClearService);
        intent.putExtra("data", arraylist);
        list.startService(intent);
    }

    public static void c()
    {
        Context context = SecurityApplication.a();
        Intent intent = new Intent("action_clear");
        intent.setClass(context, com/qihoo/security/service/ProcessClearService);
        context.startService(intent);
    }

    public static void d()
    {
        Context context = SecurityApplication.a();
        Intent intent = new Intent("action_get_data_size");
        intent.setClass(context, com/qihoo/security/service/ProcessClearService);
        context.startService(intent);
    }

    public static void e()
    {
        Context context = SecurityApplication.a();
        Intent intent = new Intent("action_get_pre_data_size");
        intent.setClass(context, com/qihoo/security/service/ProcessClearService);
        context.startService(intent);
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        if (intent == null) goto _L2; else goto _L1
_L1:
        Context context;
        Object obj;
        obj = intent.getAction();
        context = SecurityApplication.a();
        if (!"action_set_data".equals(obj)) goto _L4; else goto _L3
_L3:
        intent = (ArrayList)intent.getSerializableExtra("data");
        com.qihoo.security.opti.b.c.a(context).a(intent);
_L2:
        stopSelf(j);
        return 2;
_L4:
        if ("action_remove_data".equals(obj))
        {
            obj = com.qihoo.security.opti.b.c.a(context).c();
            if (obj != null)
            {
                ((List) (obj)).removeAll((ArrayList)intent.getSerializableExtra("data"));
            }
            com.qihoo.security.opti.b.c.a(context).a(((List) (obj)));
        } else
        if ("action_get_data_size".equals(obj) || "action_get_pre_data_size".equals(obj))
        {
            long l = com.qihoo.security.opti.b.c.a(context).d();
            intent = new Intent(((String) (obj)));
            intent.putExtra("size", l);
            context.sendBroadcast(intent);
        } else
        if ("action_init_engine".equals(obj))
        {
            com.qihoo.security.opti.b.c.a(context).a();
        } else
        if ("action_release_engine".equals(obj))
        {
            com.qihoo.security.opti.b.c.a(context).b();
        } else
        if ("action_clear".equals(obj))
        {
            com.qihoo.security.opti.b.c.a(context).e();
        }
        if (true) goto _L2; else goto _L5
_L5:
    }
}
