// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.notify;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.qihoo360.mobilesafe.b.r;
import com.qihoo360.mobilesafe.b.s;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class a
{

    private static final String a = com/qihoo/security/notify/a.getSimpleName();
    private Context b;
    private com.qihoo.security.service.a c;
    private Handler d;
    private Thread e;

    public a(Context context, com.qihoo.security.service.a a1)
    {
        b = null;
        c = null;
        d = null;
        e = null;
        b = context;
        c = a1;
        d = new Handler() {

            final a a;

            public void handleMessage(Message message)
            {
                message.what;
                JVM INSTR tableswitch 1 3: default 32
            //                           1 38
            //                           2 48
            //                           3 91;
                   goto _L1 _L2 _L3 _L4
_L1:
                super.handleMessage(message);
                return;
_L2:
                a.a(a);
                continue; /* Loop/switch isn't completed */
_L3:
                com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus = com.qihoo.security.booster.a.a(message.arg1);
                com.qihoo.utils.notice.a a2 = com.qihoo.utils.notice.a.a();
                a2.b(4102);
                a2.a(examstatus);
                SharedPref.a(a.b(a), "sp_key_last_nofity_booster", System.currentTimeMillis());
                continue; /* Loop/switch isn't completed */
_L4:
                SharedPref.a(a.b(a), "sp_key_last_nofity_booster", System.currentTimeMillis());
                if (true) goto _L1; else goto _L5
_L5:
            }

            
            {
                a = a.this;
                super();
            }
        };
    }

    private String a(Date date)
    {
        if (date == null)
        {
            return "";
        }
        try
        {
            date = (new SimpleDateFormat("yyyyMMdd", Locale.getDefault())).format(date);
        }
        // Misplaced declaration of an exception variable
        catch (Date date)
        {
            return "";
        }
        return date;
    }

    static void a(a a1)
    {
        a1.c();
    }

    private boolean a(Date date, Date date1)
    {
        while (date == null || date1 == null || !a(date1).equals(a(date))) 
        {
            return false;
        }
        return true;
    }

    static Context b(a a1)
    {
        return a1.b;
    }

    static com.qihoo.security.service.a c(a a1)
    {
        return a1.c;
    }

    private void c()
    {
        if (!a(new Date(SharedPref.b(b, "sp_key_last_nofity_booster", 0L)), new Date(System.currentTimeMillis())) && s.a(8, 23) && d())
        {
            e = new Thread(new Runnable() {

                final a a;

                public void run()
                {
                    int i = 0;
                    int j = a.c(a).c();
                    i = j;
_L2:
                    if (i >= 85)
                    {
                        Message message = new Message();
                        message.what = 2;
                        message.arg1 = i;
                        a.d(a).sendMessage(message);
                    }
                    return;
                    Exception exception;
                    exception;
                    if (true) goto _L2; else goto _L1
_L1:
                }

            
            {
                a = a.this;
                super();
            }
            });
            e.start();
        }
    }

    static Handler d(a a1)
    {
        return a1.d;
    }

    private boolean d()
    {
        float f = 0.0F;
        int i = c.c();
        f = (float)i / 100F;
_L2:
        return r.a(f);
        Exception exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void a()
    {
        d.sendEmptyMessageDelayed(1, 10000L);
    }

    public void b()
    {
        b = null;
        c = null;
        if (e != null && e.isAlive())
        {
            e.stop();
        }
        e = null;
    }

}
