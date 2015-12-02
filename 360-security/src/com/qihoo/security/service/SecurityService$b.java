// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.service;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.qihoo.security.ui.result.a;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.core.c;
import com.qihoo360.mobilesafe.core.d.b;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.util.ArrayList;

// Referenced classes of package com.qihoo.security.service:
//            SecurityService

private final class sendEmptyMessage extends Handler
{

    final SecurityService a;
    private ArrayList b;
    private String c;

    static void a(sendEmptyMessage sendemptymessage)
    {
        sendemptymessage.d();
    }

    static void a(d d1, boolean flag)
    {
        d1.a(flag);
    }

    private void a(boolean flag)
    {
        if (!SecurityService.r(a) || SecurityService.s(a) <= 0)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        Message message = new Message();
        message.what = 2;
        message.arg1 = 100;
        com.qihoo.security.service.SecurityService.c(a).sendMessage(message);
_L4:
        return;
_L2:
        if (hasMessages(2)) goto _L4; else goto _L3
_L3:
        Message message1 = new Message();
        message1.what = 2;
        message1.arg1 = 100;
        com.qihoo.security.service.SecurityService.c(a).sendMessageDelayed(message1, 30000L);
        return;
        com.qihoo.security.service.SecurityService.c(a).removeMessages(2);
        SecurityService.d(a, 0);
        return;
    }

    static String b(a a1)
    {
        return a1.c;
    }

    private void b()
    {
        if (SecurityService.q(a) == null)
        {
            com.qihoo.security.service.SecurityService.a(a, new b(SecurityService.p(a)));
        }
        String s = SecurityService.q(a).a();
        Object obj = s;
        if (TextUtils.isEmpty(s))
        {
            obj = c;
        }
        com.qihoo.security.service.SecurityService.a(a, false);
        if (!TextUtils.isEmpty(((CharSequence) (obj))) && !((String) (obj)).equals(c))
        {
            com.qihoo.security.ui.result.a.a().a(((String) (obj)), true);
            c = ((String) (obj));
            com.qihoo.security.service.SecurityService.b(a, b.contains(c));
            obj = a;
            boolean flag;
            if (SecurityService.h(a))
            {
                flag = false;
            } else
            {
                flag = c.equals("com.qihoo.security.lite");
            }
            com.qihoo.security.service.SecurityService.c(((SecurityService) (obj)), flag);
        }
        if (SecurityService.h(a) && !SharedPref.b(SecurityService.p(a), "clear_default_pre_is_need_run", true))
        {
            SharedPref.a(SecurityService.p(a), "clear_default_pre_is_need_run", true);
        }
        SecurityService.o(a).sendEmptyMessage(4);
        b(false);
    }

    static void b(b b1, boolean flag)
    {
        b1.b(flag);
    }

    private void b(boolean flag)
    {
        if (SecurityService.r(a) && SecurityService.t(a) > 0)
        {
            if (flag)
            {
                com.qihoo.security.service.SecurityService.c(a).removeMessages(1);
                com.qihoo.security.service.SecurityService.c(a).sendEmptyMessage(1);
            } else
            if (!hasMessages(1))
            {
                com.qihoo.security.service.SecurityService.c(a).sendEmptyMessageDelayed(1, 2000L);
                return;
            }
        }
    }

    private void c()
    {
        sendEmptyMessage(3);
    }

    private void d()
    {
        sendEmptyMessage(4);
    }

    public void a()
    {
        if (SecurityService.r(a) && SecurityService.s(a) > 0)
        {
            Message message = new Message();
            message.what = 2;
            message.arg1 = 200;
            com.qihoo.security.service.SecurityService.c(a).removeMessages(2);
            com.qihoo.security.service.SecurityService.c(a).sendMessage(message);
        }
    }

    public void handleMessage(Message message)
    {
        boolean flag1 = true;
        switch (message.what)
        {
        default:
            return;

        case 0: // '\0'
            c();
            d();
            return;

        case 1: // '\001'
            b();
            return;

        case 2: // '\002'
            if (SecurityService.l(a) == 0L)
            {
                com.qihoo.security.service.SecurityService.a(a, Utils.getMemoryTotalKb());
            }
            boolean flag = flag1;
            if (message.arg1 == 100)
            {
                if (SecurityService.m(a) != null && !SecurityService.m(a).b())
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
            }
            if (flag)
            {
                if (SecurityService.n(a) > 0)
                {
                    com.qihoo.security.service.SecurityService.c(a, SecurityService.n(a));
                    SecurityService.d(a, 0);
                } else
                {
                    com.qihoo.security.service.SecurityService.c(a, (int)(((SecurityService.l(a) - Utils.getMemoryFreeKb()) * 100L) / SecurityService.l(a)));
                }
                SecurityService.o(a).sendEmptyMessage(5);
            }
            a(false);
            return;

        case 3: // '\003'
            b = Utils.getHomeLauncherPackages(SecurityService.p(a));
            return;

        case 4: // '\004'
            com.qihoo.security.service.SecurityService.a(a, Utils.openConfigFileDescrypt(SecurityService.p(a), "lock_screen.dat", "com.qihoo.security.lite"));
            return;
        }
    }

    public (SecurityService securityservice, Looper looper)
    {
        a = securityservice;
        super(looper);
        sendEmptyMessage(0);
    }
}
