// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.utils.notice;

import android.os.RemoteException;
import android.text.TextUtils;
import android.text.format.DateUtils;
import com.qihoo.security.app.a;
import com.qihoo360.mobilesafe.b.s;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.qihoo.utils.notice:
//            b, c

class <init> extends com.qihoo.security.service.t>
{

    final b a;

    public void a(boolean flag, boolean flag1, boolean flag2, String s1)
        throws RemoteException
    {
        if (s.a(8, 23))
        {
            if (!b.d(a) && com.qihoo.utils.notice.b.a(a).compareAndSet(false, true))
            {
                b.e(a).a(false);
            }
            boolean flag3;
            if (!com.qihoo.utils.notice.c.a(b.f(a), 4115))
            {
                long l = b.e(a).c();
                long l1 = SharedPref.b(b.g(a), "sp_key_enter_result_time", 0L);
                if (l > 0L && l1 > 0L)
                {
                    if (System.currentTimeMillis() - l1 > 0xa4cb800L)
                    {
                        flag3 = true;
                    } else
                    {
                        flag3 = false;
                    }
                    if (b.h(a) > 70 && !DateUtils.isToday(l) && flag3)
                    {
                        b.j(a).sendMessage(b.i(a).obtainMessage(400));
                    }
                }
            }
            if (!com.qihoo.utils.notice.c.a(b.k(a), 4111) && b.l(a) < 10 && !b.m(a))
            {
                l = s.c();
                l1 = s.d();
                if (s.b(b.l(a), l - l1, b.n(a)) > 30)
                {
                    b.p(a).sendMessage(b.o(a).obtainMessage(100));
                }
            }
            if (!com.qihoo.utils.notice.c.a(b.q(a), 4112))
            {
                if (flag || flag2)
                {
                    flag3 = true;
                } else
                {
                    flag3 = false;
                }
                if (b.l(a) < 30 && b.h(a) > 75 && flag3)
                {
                    if (!b.r(a).hasMessages(200))
                    {
                        b.t(a).sendMessageDelayed(com.qihoo.utils.notice.b.s(a).obtainMessage(200), 0x2bf20L);
                    }
                } else
                {
                    b.u(a).removeMessages(200);
                }
            }
            if (!com.qihoo.utils.notice.c.a(b.v(a), 4113))
            {
                if (!TextUtils.isEmpty(b.w(a)) && b.w(a) != s1)
                {
                    if (!b.x(a).hasMessages(300))
                    {
                        b.z(a).sendMessageDelayed(b.y(a).obtainMessage(300), 60000L);
                        return;
                    }
                } else
                {
                    com.qihoo.utils.notice.b.a(a, "");
                    b.A(a).removeMessages(300);
                    return;
                }
            }
        }
    }

    (b b1)
    {
        a = b1;
        super();
    }
}
