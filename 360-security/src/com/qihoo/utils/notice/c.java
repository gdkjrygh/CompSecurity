// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.utils.notice;

import android.content.Context;
import android.content.Intent;
import android.text.format.DateUtils;
import android.text.format.Time;
import com.qihoo.security.app.DaemonMain;
import com.qihoo.security.support.b;
import com.qihoo360.mobilesafe.share.SharedPref;

// Referenced classes of package com.qihoo.utils.notice:
//            a

public class c
{

    private static c a;

    private c()
    {
    }

    public static c a()
    {
        if (a == null)
        {
            a = new c();
        }
        return a;
    }

    public static void a(Context context, Intent intent)
    {
        String s = intent.getAction();
        if (!"com.qihoo.security.notify.ACTION_MALWARE".equals(s)) goto _L2; else goto _L1
_L1:
        int i = intent.getIntExtra("size", 0);
        if (!a(context)) goto _L4; else goto _L3
_L3:
        com.qihoo.security.support.b.a(29003, i);
_L6:
        return;
_L4:
        com.qihoo.security.support.b.a(20007, i);
        return;
_L2:
        if ("com.qihoo.security.notify.ACTION_RISKY_APP".equals(s))
        {
            int j = intent.getIntExtra("size", 0);
            if (a(context))
            {
                com.qihoo.security.support.b.a(29005, j);
                return;
            } else
            {
                com.qihoo.security.support.b.a(20008, j);
                return;
            }
        }
        if ("com.qihoo.security.notify.ACTION_SAFE_APP".equals(s))
        {
            intent = intent.getStringExtra("pkg_name");
            if (a(context))
            {
                com.qihoo.security.support.b.a(29007, intent, "");
                return;
            } else
            {
                com.qihoo.security.support.b.a(20009, intent, "");
                return;
            }
        }
        if ("com.qihoo.security.notify.ACTION_ANTIVIRUS_UPGRADE".equals(s))
        {
            if (a(context))
            {
                com.qihoo.security.support.b.b(29009);
                return;
            } else
            {
                com.qihoo.security.support.b.b(20010);
                return;
            }
        }
        if ("com.qihoo.security.notify.ACTION_AUTO_START".equals(intent.getAction()))
        {
            c(context);
            intent = intent.getStringExtra("size");
            if (a(context))
            {
                com.qihoo.security.support.b.a(29015, (new StringBuilder()).append(System.currentTimeMillis()).append("").toString(), intent);
                return;
            } else
            {
                com.qihoo.security.support.b.a(20013, (new StringBuilder()).append(System.currentTimeMillis()).append("").toString(), intent);
                return;
            }
        }
        if ("com.qihoo.security.notify.ACTION_CLEAN".equals(s))
        {
            intent = intent.getStringExtra("do_scan_size");
            if (a(context))
            {
                com.qihoo.security.support.b.a(29011, (new StringBuilder()).append(System.currentTimeMillis()).append("").toString(), intent);
                return;
            } else
            {
                com.qihoo.security.support.b.a(20011, (new StringBuilder()).append(System.currentTimeMillis()).append("").toString(), intent);
                return;
            }
        }
        if ("com.qihoo.security.notify.ACTION_BOOST".equals(s))
        {
            c(context);
            if (a(context))
            {
                com.qihoo.security.support.b.a(29013, (new StringBuilder()).append(System.currentTimeMillis()).append("").toString(), "");
                return;
            } else
            {
                com.qihoo.security.support.b.a(20012, (new StringBuilder()).append(System.currentTimeMillis()).append("").toString(), "");
                return;
            }
        }
        if ("com.qihoo.security.notify.ACTION_ADV_APP".equals(s))
        {
            if (a(context))
            {
                com.qihoo.security.support.b.a(29017, (new StringBuilder()).append(System.currentTimeMillis()).append("").toString(), "");
                return;
            } else
            {
                com.qihoo.security.support.b.a(20014, (new StringBuilder()).append(System.currentTimeMillis()).append("").toString(), "");
                return;
            }
        }
        if ("com.qihoo.security.notify.ACTION_WEEKLY_CLEAN_TIP".equals(s))
        {
            com.qihoo.security.support.b.b(20015);
            return;
        }
        if ("com.qihoo.security.notify.ACTION_BATTERY_LOW".equals(s))
        {
            c(context);
            if (a(context))
            {
                com.qihoo.security.support.b.a(29019, (new StringBuilder()).append(System.currentTimeMillis()).append("").toString(), "");
                return;
            } else
            {
                com.qihoo.security.support.b.a(20016, (new StringBuilder()).append(System.currentTimeMillis()).append("").toString(), "");
                return;
            }
        }
        if ("com.qihoo.security.notify.ACTION_BATTERY_LOW_POWER_REMIND".equals(s))
        {
            c(context);
            if (a(context))
            {
                com.qihoo.security.support.b.a(29021, (new StringBuilder()).append(System.currentTimeMillis()).append("").toString(), "");
                return;
            } else
            {
                com.qihoo.security.support.b.a(20017, (new StringBuilder()).append(System.currentTimeMillis()).append("").toString(), "");
                return;
            }
        }
        if ("com.qihoo.security.notify.ACTION_POWER_REMIND".equals(s))
        {
            c(context);
            if (a(context))
            {
                com.qihoo.security.support.b.a(29023, (new StringBuilder()).append(System.currentTimeMillis()).append("").toString(), "");
                return;
            } else
            {
                com.qihoo.security.support.b.a(20018, (new StringBuilder()).append(System.currentTimeMillis()).append("").toString(), "");
                return;
            }
        }
        if ("com.qihoo.security.notify.ACTION_BOOST_ACTIVE".equals(s))
        {
            c(context);
            if (a(context))
            {
                com.qihoo.security.support.b.a(29029, (new StringBuilder()).append(System.currentTimeMillis()).append("").toString(), "");
                return;
            } else
            {
                com.qihoo.security.support.b.a(20039, (new StringBuilder()).append(System.currentTimeMillis()).append("").toString(), "");
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static void a(Context context, boolean flag)
    {
        a(context, flag, true);
    }

    public static void a(Context context, boolean flag, boolean flag1)
    {
        SharedPref.a(context, "sp_key_process_is_daemon", flag);
        DaemonMain.a(flag);
    }

    private static boolean a(long l)
    {
        Time time = new Time();
        time.set(l);
        return DateUtils.isToday(l) && time.hour >= 8 && time.hour < 23;
    }

    public static boolean a(Context context)
    {
        return SharedPref.b(context, "sp_key_process_is_daemon", false);
    }

    public static boolean a(Context context, int i)
    {
        while (c(context, i) || d(context) || e(context)) 
        {
            return true;
        }
        return false;
    }

    public static void b(Context context, int i)
    {
        SharedPref.a(context, "key_notice_push_one_day", System.currentTimeMillis());
        SharedPref.a(context, (new StringBuilder()).append("key_notice_boost_show_time").append(i).toString(), System.currentTimeMillis());
    }

    public static boolean b()
    {
        return android.os.Build.VERSION.SDK_INT > 20;
    }

    public static boolean b(Context context)
    {
        return SharedPref.b(context, "setting_app_security_alert", true);
    }

    public static void c()
    {
        com.qihoo.utils.notice.a.a().b(4097);
        com.qihoo.utils.notice.a.a().b(4099);
        com.qihoo.utils.notice.a.a().b(4098);
    }

    public static void c(Context context)
    {
        SharedPref.a(context, "key_notice_boost_click_time", System.currentTimeMillis());
    }

    private static boolean c(Context context, int i)
    {
        return a(SharedPref.b(context, (new StringBuilder()).append("key_notice_boost_show_time").append(i).toString(), 0L));
    }

    public static void d()
    {
        com.qihoo.utils.notice.a.a().b(4104);
        com.qihoo.utils.notice.a.a().b(4115);
        com.qihoo.utils.notice.a.a().b(4102);
        com.qihoo.utils.notice.a.a().b(4111);
        com.qihoo.utils.notice.a.a().b(4113);
        com.qihoo.utils.notice.a.a().b(4112);
    }

    private static boolean d(Context context)
    {
        boolean flag1 = false;
        long l = SharedPref.b(context, "key_notice_push_one_day", 0L);
        boolean flag = flag1;
        if (a(l))
        {
            l = System.currentTimeMillis() - l;
            flag = flag1;
            if (l > 0L)
            {
                flag = flag1;
                if (l < 0x1499700L)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    private static boolean e(Context context)
    {
        return a(SharedPref.b(context, "key_notice_boost_click_time", 0L));
    }

    public int a(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.values().length];
                try
                {
                    a[com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.EXCELLENT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.NEED_OPTIMIZE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[examstatus.ordinal()])
        {
        case 1: // '\001'
        default:
            return 0x7f0200c6;

        case 2: // '\002'
            return 0x7f0200c7;

        case 3: // '\003'
            return 0x7f0200c8;
        }
    }

    public int b(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus)
    {
        switch (_cls1.a[examstatus.ordinal()])
        {
        case 1: // '\001'
        default:
            return 0x7f0200c9;

        case 2: // '\002'
            return 0x7f0200ca;

        case 3: // '\003'
            return 0x7f0200cb;
        }
    }

    public int c(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus)
    {
        switch (_cls1.a[examstatus.ordinal()])
        {
        case 1: // '\001'
        default:
            return 0x7f0200ce;

        case 2: // '\002'
            return 0x7f0200d0;

        case 3: // '\003'
            return 0x7f0200c3;
        }
    }

    public int d(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus examstatus)
    {
        switch (_cls1.a[examstatus.ordinal()])
        {
        case 1: // '\001'
        default:
            return 0x7f0200cf;

        case 2: // '\002'
            return 0x7f0200d1;

        case 3: // '\003'
            return 0x7f0200c4;
        }
    }
}
