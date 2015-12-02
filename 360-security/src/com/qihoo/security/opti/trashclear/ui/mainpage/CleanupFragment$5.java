// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage;

import android.app.Activity;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.enginehelper.clean.CleanScanType;
import com.qihoo.security.enginehelper.clean.CleanTrashType;
import com.qihoo.security.enginehelper.clean.a;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.opti.trashclear.b;
import com.qihoo.security.service.ProcessClearService;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.util.ArrayList;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui.mainpage:
//            CleanupFragment

class a extends Thread
{

    final CleanupFragment a;

    public void run()
    {
_L2:
        return;
        if (!a.isAdded() || CleanupFragment.e(a) != 0 || CleanupFragment.c(a) || com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.d(a)) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        if (!b.a().d())
        {
            continue; /* Loop/switch isn't completed */
        }
        System.currentTimeMillis();
        arraylist = b.a().c();
        if (!a.isAdded()) goto _L2; else goto _L3
_L3:
        com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a).runOnUiThread(new Runnable(arraylist) {

            final ArrayList a;
            final CleanupFragment._cls5 b;

            public void run()
            {
label0:
                {
                    synchronized (CleanupFragment.q(b.a))
                    {
                        if (b.a.isAdded())
                        {
                            break label0;
                        }
                    }
                    return;
                }
                if (CleanupFragment.e(b.a) == 0 && !CleanupFragment.c(b.a) && !com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.d(b.a))
                {
                    com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.d(b.a, true);
                    CleanupFragment.f(b.a, false);
                    com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(b.a, 0L);
                    if (!SharedPref.b(CleanupFragment.k(b.a), "sp_key_has_clear_memory", false))
                    {
                        ProcessClearService.e();
                    }
                    CleanupFragment.O(b.a).a(CleanupFragment.N(b.a));
                    CleanupFragment.O(b.a).a(CleanScanType.PREPOSE);
                    CleanupFragment.O(b.a).a(new CleanTrashType[] {
                        CleanTrashType.SYSTEM, CleanTrashType.CACHE
                    });
                    CleanupFragment.O(b.a).a(a);
                    CleanupFragment.O(b.a).b();
                    com.qihoo.security.opti.trashclear.b.a().g();
                    SharedPref.a(CleanupFragment.k(b.a), "clear_default_pre_last_time", System.currentTimeMillis());
                }
                abyte0;
                JVM INSTR monitorexit ;
                return;
                exception;
                abyte0;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                b = CleanupFragment._cls5.this;
                a = arraylist;
                super();
            }
        });
        return;
        if (b.a().e() || !b.a().f() || b.a().h() < 3) goto _L2; else goto _L4
_L4:
        com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a).runOnUiThread(new Runnable() {

            final CleanupFragment._cls5 a;

            public void run()
            {
label0:
                {
                    {
                        while (!a.a.isAdded() || CleanupFragment.e(a.a) != 0 || CleanupFragment.c(a.a) || com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.d(a.a)) 
                        {
                            return;
                        }
                        long l = SharedPref.b(CleanupFragment.k(a.a), "clear_default_pre_last_data", 0L);
                        if (l <= 0L || l > 0x1400000L)
                        {
                            break label0;
                        }
                        CleanupFragment.c(a.a, true);
                        Object obj;
                        if (CleanupFragment.l(a.a).getVisibility() == 0)
                        {
                            obj = CleanupFragment.l(a.a);
                        } else
                        {
                            obj = null;
                        }
                        CleanupFragment.n(a.a).a(((android.view.View) (obj)), null, CleanupFragment.m(a.a), null);
                        CleanupFragment.m(a.a).setLocalText(CleanupFragment.P(a.a).a(0x7f0c0057));
                        com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(a.a, CleanupFragment.m(a.a).getText().toString());
                        SharedPref.a(CleanupFragment.k(a.a), "sp_key_clear_show_prescan", true);
                    }
                    CleanupFragment.c(a.a, l);
                    return;
                }
                if (l > 0x1400000L)
                {
                    CleanupFragment.c(a.a, true);
                    if (CleanupFragment.l(a.a).getVisibility() == 0)
                    {
                        obj = CleanupFragment.l(a.a);
                    } else
                    {
                        obj = null;
                    }
                    CleanupFragment.n(a.a).a(((android.view.View) (obj)), null, CleanupFragment.m(a.a), null);
                    obj = (new StringBuilder()).append(com.qihoo.security.opti.b.d.a(SecurityApplication.a(), l, true)).append("+ ").toString();
                    CleanupFragment.m(a.a).setLocalText(CleanupFragment.Q(a.a).a(0x7f0c0056, new Object[] {
                        obj
                    }));
                    com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.a(a.a, CleanupFragment.m(a.a).getText().toString());
                    SharedPref.a(CleanupFragment.k(a.a), "sp_key_clear_show_prescan", true);
                } else
                {
                    CleanupFragment.c(a.a, false);
                    if (CleanupFragment.l(a.a).getVisibility() != 0)
                    {
                        obj = CleanupFragment.l(a.a);
                    } else
                    {
                        obj = null;
                    }
                    if (CleanupFragment.m(a.a).getVisibility() == 0)
                    {
                        CleanupFragment.n(a.a).a(CleanupFragment.m(a.a), null, ((android.view.View) (obj)), null);
                    }
                }
                if (false)
                {
                } else
                {
                    break MISSING_BLOCK_LABEL_221;
                }
            }

            
            {
                a = CleanupFragment._cls5.this;
                super();
            }
        });
        return;
    }

    _cls2.a(CleanupFragment cleanupfragment)
    {
        a = cleanupfragment;
        super();
    }
}
