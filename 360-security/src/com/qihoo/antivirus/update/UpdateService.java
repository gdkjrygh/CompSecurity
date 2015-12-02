// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.antivirus.update;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.qihoo.antivirus.update:
//            e, d, ai

public class UpdateService extends Service
{
    private static final class a
    {

        String a;
        String b;
        String c;
        String d;
        String e;

        private a()
        {
            a = null;
            b = null;
            c = null;
            d = null;
            e = null;
        }

        a(a a1)
        {
            this();
        }
    }

    private class b extends BroadcastReceiver
    {

        final UpdateService a;

        public void onReceive(Context context, Intent intent)
        {
            if (intent != null)
            {
                context = intent.getStringExtra("com.qihoo.action.INTENT_EXTRA_PRODUCT");
                int i1 = intent.getIntExtra("com.qihoo.action.INTENT_EXTRA_UPDATE_STOP_TYPE", 0);
                intent = Message.obtain();
                intent.what = 2;
                intent.obj = context;
                intent.arg1 = i1;
                UpdateService.g.sendMessage(intent);
            }
        }

        private b()
        {
            a = UpdateService.this;
            super();
        }

        b(b b1)
        {
            this();
        }
    }


    static boolean a = false;
    static volatile int b = 0;
    static volatile String c = null;
    static volatile String d = null;
    static volatile String e = null;
    static volatile boolean f = false;
    static final Handler g = new Handler() {

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                return;

            case 2: // '\002'
                UpdateService.a(2, (String)message.obj, message.arg1);
                return;

            case 3: // '\003'
            case 4: // '\004'
                UpdateService.a(message.what, UpdateService.a(), UpdateService.b());
                return;

            case 1: // '\001'
                UpdateService.a(null);
                UpdateService.a(null);
                UpdateService.b = 0;
                UpdateService.a = false;
                UpdateService.c().clear();
                System.exit(0);
                return;
            }
        }

    };
    private static ArrayList h = new ArrayList();
    private static d i = null;
    private static ai j = null;
    private static Context k = null;
    private static String m = null;
    private static int n = 0;
    private b l;

    public UpdateService()
    {
        l = null;
    }

    static String a()
    {
        return m;
    }

    static void a(int i1, String s, int j1)
    {
        b(i1, s, j1);
    }

    public static void a(Context context)
    {
        context = Message.obtain();
        context.what = 3;
        g.sendMessage(context);
    }

    private static void a(Context context, a a1)
    {
        com.qihoo.antivirus.update.e.a(context, "local_pkg_version", a1.c);
        if (a1.d != null)
        {
            i.a = a1.d;
        }
        e = a1.e;
        c = a1.a;
        d = a1.b;
        m = c;
        n = 0;
    }

    static void a(ai ai1)
    {
        j = ai1;
    }

    static void a(d d1)
    {
        i = d1;
    }

    static int b()
    {
        return n;
    }

    private static void b(int i1, String s, int j1)
    {
        i1 = 1;
        ArrayList arraylist = h;
        arraylist;
        JVM INSTR monitorenter ;
        int k1 = h.size();
        if (k1 != 0) goto _L2; else goto _L1
_L1:
        arraylist;
        JVM INSTR monitorexit ;
        if (i1 != 0)
        {
            s = new Intent(k, com/qihoo/antivirus/update/UpdateService);
            k.stopService(s);
        }
        return;
_L2:
        if (k1 != 1) goto _L4; else goto _L3
_L3:
        if (s.equals(c))
        {
            h.clear();
            continue; /* Loop/switch isn't completed */
        }
          goto _L5
        s;
        arraylist;
        JVM INSTR monitorexit ;
        throw s;
_L4:
        if (!s.equals(c)) goto _L7; else goto _L6
_L6:
        if (j1 != 0)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        f = false;
        h.remove(0);
        s = (a)h.get(0);
        a(k, s);
        i.a(j);
        i1 = 0;
        continue; /* Loop/switch isn't completed */
        if (j1 != 1) goto _L5; else goto _L8
_L8:
        f = true;
        i1 = 0;
        continue; /* Loop/switch isn't completed */
_L9:
        if (s.equals(((a)h.get(i1)).a))
        {
            h.remove(i1);
        }
        i1++;
        continue; /* Loop/switch isn't completed */
_L7:
        i1 = 0;
        if (i1 < k1) goto _L9; else goto _L5
_L5:
        i1 = 0;
        if (true) goto _L1; else goto _L10
_L10:
    }

    static ArrayList c()
    {
        return h;
    }

    private void d()
    {
        g.sendEmptyMessageDelayed(1, 200L);
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        k = getApplicationContext();
        l = new b(null);
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.qihoo.broadcast.UPDATE_STOP");
        k.registerReceiver(l, intentfilter);
        i = new d(this);
        j = new ai(this, i);
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (l != null)
        {
            k.unregisterReceiver(l);
        }
        d();
    }

    public int onStartCommand(Intent intent, int i1, int j1)
    {
        super.onStartCommand(intent, i1, j1);
        if (intent != null) goto _L2; else goto _L1
_L1:
        Log.e("UpdateService", "Update service start without intent.");
_L4:
        return 2;
_L2:
        Object obj;
        obj = intent.getAction();
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((String) (obj)).equals("com.qihoo.action.UPDATE_NOTICE_TIMEOUT"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (!a)
        {
            intent = Message.obtain();
            intent.what = 4;
            g.sendMessage(intent);
            return 2;
        }
        if (true) goto _L4; else goto _L3
_L3:
        i1 = intent.getIntExtra("com.qihoo.action.INTENT_EXTRA_UPDATE_TYPE", 0);
        if (i1 > 0)
        {
            b = i1;
        }
        if (!((String) (obj)).equals("com.qihoo.action.BEGIN_UPDATE"))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = h;
        obj;
        JVM INSTR monitorenter ;
        a a1;
        String s;
        a1 = new a(null);
        s = intent.getStringExtra("com.qihoo.action.INTENT_EXTRA_LOCAL_VERSION");
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        a1.c = s;
        String s1 = intent.getStringExtra("com.qihoo.action.INTENT_EXTRA_REQ_PARAM");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        a1.d = s1;
        a1.a = intent.getStringExtra("com.qihoo.action.INTENT_EXTRA_PRODUCT");
        a1.e = intent.getStringExtra("com.qihoo.action.INTENT_EXTRA_PERMISSION");
        intent = intent.getStringExtra("com.qihoo.action.INTENT_EXTRA_SERVER");
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_191;
        }
        a1.b = intent;
        if (h.size() <= 0) goto _L6; else goto _L5
_L5:
        intent = h.iterator();
_L9:
        if (intent.hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = 0;
_L10:
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_414;
        }
        h.add(a1);
        break MISSING_BLOCK_LABEL_414;
_L11:
        obj;
        JVM INSTR monitorexit ;
        if (i1 != 0) goto _L4; else goto _L7
_L7:
        f = false;
        i.a(j);
        return 2;
        if (!((a)intent.next()).a.equals(a1.a)) goto _L9; else goto _L8
_L8:
        i1 = 1;
          goto _L10
_L6:
        h.add(a1);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_306;
        }
        com.qihoo.antivirus.update.e.a(this, "local_pkg_version", s);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_319;
        }
        i.a = s1;
        e = a1.e;
        c = a1.a;
        d = a1.b;
        m = c;
        n = 0;
        i1 = 0;
          goto _L11
        intent;
        obj;
        JVM INSTR monitorexit ;
        throw intent;
        if (!((String) (obj)).equals("com.qihoo.action.BEGIN_UPGRADE_APP")) goto _L4; else goto _L12
_L12:
        boolean flag = intent.getBooleanExtra("extra_apk_merge", false);
        a = true;
        j.a = flag;
        f = false;
        i.a(flag, j);
        return 2;
        i1 = 1;
          goto _L11
    }

}
