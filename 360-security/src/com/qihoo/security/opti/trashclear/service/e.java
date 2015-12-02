// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.service;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.qihoo.security.locale.d;
import com.qihoo.security.opti.trashclear.ui.ResidualFileUninstallDialog;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.b.q;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.qihoo.security.opti.trashclear.service:
//            c, b, ResidualFileInfo, a

public class e
{
    private class a extends Handler
    {

        final e a;

        public void handleMessage(Message message)
        {
            super.handleMessage(message);
            long l;
            switch (message.what)
            {
            default:
                return;

            case 0: // '\0'
                l = ((Long)message.obj).longValue();
                break;
            }
            q.a().a(com.qihoo.security.locale.d.a().a(0x7f0c0228, new Object[] {
                Utils.getHumanReadableSizeMore(l)
            }), 0x7f020144);
        }

        public a(Looper looper)
        {
            a = e.this;
            super(looper);
        }
    }

    private class b extends Handler
    {

        final e a;

        public void handleMessage(Message message)
        {
            super.handleMessage(message);
            message.what;
            JVM INSTR tableswitch 0 3: default 40
        //                       0 41
        //                       1 58
        //                       2 40
        //                       3 40;
               goto _L1 _L2 _L3 _L1 _L1
_L1:
            return;
_L2:
            message = (String)message.obj;
            a.a(message);
            return;
_L3:
            e.b(a);
            long l2;
            if (com.qihoo.security.opti.trashclear.service.e.d(a) != null && !com.qihoo.security.opti.trashclear.service.e.d(a).isEmpty())
            {
                int l = 0;
                long l1 = 0L;
                do
                {
                    l2 = l1;
                    if (l >= com.qihoo.security.opti.trashclear.service.e.d(a).size())
                    {
                        break;
                    }
                    message = (c)com.qihoo.security.opti.trashclear.service.e.d(a).get(l);
                    l2 = l1;
                    if (message != null)
                    {
                        l2 = l1;
                        if (message.b() != null)
                        {
                            l1 += message.b().b;
                            l2 = l1;
                            if (message != null)
                            {
                                message.c();
                                l2 = l1;
                            }
                        }
                    }
                    l++;
                    l1 = l2;
                } while (true);
            } else
            {
                l2 = 0L;
            }
            if (com.qihoo.security.opti.trashclear.service.e.d(a) != null)
            {
                com.qihoo.security.opti.trashclear.service.e.d(a).clear();
            }
            if (l2 > 0L && e.f(a) != null)
            {
                e.f(a).sendMessage(e.f(a).obtainMessage(0, Long.valueOf(l2)));
                return;
            }
            if (true) goto _L1; else goto _L4
_L4:
        }

        public b(Looper looper)
        {
            a = e.this;
            super(looper);
        }
    }


    public String a;
    private final b b;
    private final a c = new a(Looper.getMainLooper());
    private final Context d;
    private final List e = new ArrayList();
    private String f;
    private final Handler g = new Handler(Looper.getMainLooper()) {

        final e a;

        public void handleMessage(Message message)
        {
            message.what;
            JVM INSTR tableswitch 1 2: default 28
        //                       1 28
        //                       2 29;
               goto _L1 _L1 _L2
_L1:
            return;
_L2:
            if (e.a(a) != null && e.a(a).b() != null)
            {
                Object obj = e.a(a).b().a;
                long l = e.a(a).b().b;
                if (e.a(a).b().c > 0L && e.b(a))
                {
                    message = new ResidualFileInfo();
                    message.appName = ((String) (obj));
                    message.fileSize = l;
                    obj = new Intent(e.c(a), com/qihoo/security/opti/trashclear/ui/ResidualFileUninstallDialog);
                    ((Intent) (obj)).addFlags(0x10000000);
                    ((Intent) (obj)).putExtra("uninstalled_app_info", message);
                    e.c(a).startActivity(((Intent) (obj)));
                    return;
                }
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

            
            {
                a = e.this;
                super(looper);
            }
    };
    private final HashMap h = new HashMap();
    private List i;
    private c j;
    private final d.a k = new d.a() {

        final e a;

        public void a()
            throws RemoteException
        {
            long l = System.currentTimeMillis();
            if (Math.abs(l - SharedPref.b(e.c(a), "last_time_cancel_residual_file_dialog", 0L)) < 20000L)
            {
                SharedPref.a(e.c(a), "start_time_silence_residual_file_dialog", l);
            }
            SharedPref.a(e.c(a), "last_time_cancel_residual_file_dialog", l);
        }

        public void a(List list)
            throws RemoteException
        {
            if (e.g(a) != null)
            {
                e.g(a).sendMessage(e.g(a).obtainMessage(1, list));
            }
        }

        public void b()
            throws RemoteException
        {
            long l = System.currentTimeMillis();
            if (Math.abs(l - SharedPref.b(e.c(a), "last_time_cancel_add_file_dialog", 0L)) < 20000L)
            {
                SharedPref.a(e.c(a), "start_time_silence_add_file_dialog", l);
            }
            SharedPref.a(e.c(a), "last_time_cancel_add_file_dialog", l);
        }

        public void b(List list)
            throws RemoteException
        {
            if (e.g(a) != null)
            {
                e.g(a).sendMessage(e.g(a).obtainMessage(3, list));
            }
        }

            
            {
                a = e.this;
                super();
            }
    };

    public e(Context context)
    {
        f = null;
        a = "MAP_KEY_STR";
        d = context;
        context = new HandlerThread("ResidualFileServiceHelper");
        context.start();
        b = new b(context.getLooper());
    }

    static c a(e e1)
    {
        return e1.j;
    }

    static c a(e e1, c c1)
    {
        e1.j = c1;
        return c1;
    }

    static List a(e e1, List list)
    {
        e1.i = list;
        return list;
    }

    static boolean b(e e1)
    {
        return e1.c();
    }

    static Context c(e e1)
    {
        return e1.d;
    }

    private boolean c()
    {
        return Math.abs(System.currentTimeMillis() - SharedPref.b(d, "start_time_silence_residual_file_dialog", 0L)) > 0x1b7740L;
    }

    static List d(e e1)
    {
        return e1.i;
    }

    static Handler e(e e1)
    {
        return e1.g;
    }

    static a f(e e1)
    {
        return e1.c;
    }

    static b g(e e1)
    {
        return e1.b;
    }

    public IBinder a()
    {
        return k;
    }

    public void a(String s)
    {
        if (!SharedPref.b(d, "remind_uninstallReminder_swtich", true))
        {
            return;
        } else
        {
            (new Thread(new Runnable(s) {

                final String a;
                final e b;

                public void run()
                {
                    e.a(b, new com.qihoo.security.opti.trashclear.service.a(e.c(b)));
                    if (e.a(b) != null)
                    {
                        if (com.qihoo.security.opti.trashclear.service.e.d(b) == null)
                        {
                            e.a(b, new ArrayList());
                        }
                        com.qihoo.security.opti.trashclear.service.e.d(b).add(e.a(b));
                        e.a(b).a(a);
                        e.a(b).a();
                        if (e.a(b).b() != null)
                        {
                            Message message = e.e(b).obtainMessage(2);
                            e.e(b).sendMessage(message);
                            return;
                        }
                    }
                }

            
            {
                b = e.this;
                a = s;
                super();
            }
            })).start();
            return;
        }
    }

    public void b()
    {
        if (b != null)
        {
            b.getLooper().quit();
        }
        if (c != null)
        {
            c.removeMessages(0);
        }
        if (i != null)
        {
            i.clear();
            i = null;
        }
    }

    public void b(String s)
    {
        if (b != null)
        {
            b.sendMessageDelayed(b.obtainMessage(0, s), 0L);
        }
    }
}
