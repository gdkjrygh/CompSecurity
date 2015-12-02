// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.floatview.a;

import android.os.RemoteException;
import com.qihoo.security.floatview.ui.a;
import com.qihoo.utils.notice.c;

// Referenced classes of package com.qihoo.security.floatview.a:
//            a

class t> extends com.qihoo.security.service.a._cls2
{

    final com.qihoo.security.floatview.a.a a;

    public void a(boolean flag, boolean flag1, boolean flag2, String s)
        throws RemoteException
    {
        if (c.a(com.qihoo.security.floatview.a.a.a(a)))
        {
            if (com.qihoo.security.floatview.a.a.g(a) != null && com.qihoo.security.floatview.a.a.g(a).isShown())
            {
                com.qihoo.security.floatview.a.a.g(a).g();
            }
        } else
        {
            boolean flag3;
            if (com.qihoo.security.floatview.a.a.i(a) != flag || com.qihoo.security.floatview.a.a.j(a) != flag1 || com.qihoo.security.floatview.a.a.k(a) != flag2 || !s.equals(com.qihoo.security.floatview.a.a.l(a)))
            {
                boolean flag4 = false;
                flag3 = flag4;
                if (flag)
                {
                    flag3 = flag4;
                    if (com.qihoo.security.floatview.a.a.k(a))
                    {
                        flag3 = true;
                    }
                }
                com.qihoo.security.floatview.a.a.b(a, flag);
                com.qihoo.security.floatview.a.a.c(a, flag1);
                com.qihoo.security.floatview.a.a.d(a, flag2);
                com.qihoo.security.floatview.a.a.a(a, s);
            }
            while (false) 
            {
                if (com.qihoo.security.floatview.a.a.m(a) && !com.qihoo.security.floatview.a.a.n(a) && !com.qihoo.security.floatview.a.a.i(a) && com.qihoo.security.floatview.a.a.g(a).h())
                {
                    com.qihoo.security.floatview.a.a.g(a).l();
                }
                if (com.qihoo.security.floatview.a.a.f(a))
                {
                    com.qihoo.security.floatview.a.a.g(a).f();
                    if (flag3)
                    {
                        com.qihoo.security.floatview.a.a.g(a).b();
                        com.qihoo.security.floatview.a.a.g(a).a();
                        return;
                    }
                } else
                {
                    com.qihoo.security.floatview.a.a.g(a).g();
                    return;
                }
            }
        }
    }

    (com.qihoo.security.floatview.a.a a1)
    {
        a = a1;
        super();
    }
}
