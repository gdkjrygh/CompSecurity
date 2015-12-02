// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage.opti;

import android.os.Handler;
import android.os.Message;
import com.qihoo.security.opti.trashclear.ui.e;
import com.qihoo.security.opti.trashclear.ui.h;
import com.qihoo.security.opti.trashclear.ui.mainpage.a;
import java.util.List;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui.mainpage.opti:
//            ClearListActivity

class a extends Handler
{

    final ClearListActivity a;

    public void handleMessage(Message message)
    {
        if (!a.isFinishing()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        switch (message.what)
        {
        default:
            return;

        case 0: // '\0'
            message = com.qihoo.security.opti.trashclear.ui.mainpage.a.a(com.qihoo.security.opti.trashclear.ui.mainpage.a.a(com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.a(a).c(ClearListActivity.d(a))));
            if (ClearListActivity.d(a) == 0)
            {
                a.a(com.qihoo.security.ui.exam.tus.EXCELLENT);
            } else
            if (message != com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.e(a))
            {
                com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.a(a, message);
                ClearListActivity.f(a).setExamStatus(com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.e(a));
                ClearListActivity.f(a).setBackgroundExamStatus(com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.e(a));
                ClearListActivity.g(a).a(ClearListActivity.b(a, com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.e(a)));
            }
            if (e.a(ClearListActivity.d(a)).size() == 0)
            {
                if (ClearListActivity.d(a) != 0)
                {
                    a.p();
                    return;
                } else
                {
                    ClearListActivity.f(a).setData(com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.a(a));
                    return;
                }
            } else
            {
                ClearListActivity.f(a).setData(com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.a(a));
                return;
            }

        case 1: // '\001'
            com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.h(a);
            return;

        case 2: // '\002'
            if (!ClearListActivity.i(a))
            {
                ClearListActivity.f(a).setData(com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.a(a));
                message = com.qihoo.security.opti.trashclear.ui.mainpage.a.a(com.qihoo.security.opti.trashclear.ui.mainpage.a.a(com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.a(a).c(ClearListActivity.d(a))));
                if (ClearListActivity.d(a) == 0)
                {
                    a.a(com.qihoo.security.ui.exam.tus.EXCELLENT);
                    return;
                }
                if (message != com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.e(a))
                {
                    com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.a(a, message);
                    ClearListActivity.f(a).setExamStatus(com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.e(a));
                    ClearListActivity.f(a).setBackgroundExamStatus(com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.e(a));
                    ClearListActivity.g(a).a(ClearListActivity.b(a, com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.e(a)));
                    return;
                }
            } else
            {
                ClearListActivity.c(a).sendEmptyMessage(0);
                return;
            }
            break;

        case 3: // '\003'
            if (System.currentTimeMillis() - ClearListActivity.j(a) > 10000L)
            {
                a.a(0.0F, 0.0F, true, ClearListActivity.i(a));
                return;
            }
            com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.a(a, ClearListActivity.k(a).d());
            if (com.qihoo.security.opti.trashclear.ui.mainpage.opti.ClearListActivity.a(a) == null)
            {
                ClearListActivity.c(a).sendEmptyMessageDelayed(3, 50L);
                return;
            } else
            {
                ClearListActivity.l(a);
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    (ClearListActivity clearlistactivity)
    {
        a = clearlistactivity;
        super();
    }
}
