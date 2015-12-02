// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage;

import android.app.Activity;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.opti.trashclear.d;
import com.qihoo.security.opti.trashclear.e;
import com.qihoo.security.ui.main.b;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.util.Map;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui.mainpage:
//            CleanupFragment

class a
    implements a
{

    final a a;

    public void a()
    {
        synchronized (CleanupFragment.q(a.a))
        {
            if (com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.d(a.a) && !CleanupFragment.r(a.a) && !a(a))
            {
                CleanupFragment.s(a.a);
            }
        }
        return;
        exception;
        abyte0;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(long l)
    {
        if (!a.a.isAdded())
        {
            return;
        } else
        {
            com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a.a).runOnUiThread(new Runnable(l) {

                final long a;
                final CleanupFragment._cls19._cls1 b;

                public void run()
                {
label0:
                    {
                        {
                            SharedPref.a(CleanupFragment.k(b.a.a), "clear_default_pre_last_data", a);
                            while (!b.a.a.isAdded() || com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.e(b.a.a) != 0 || CleanupFragment.c(b.a.a)) 
                            {
                                return;
                            }
                            if (a <= 0L || a > 0x1400000L)
                            {
                                break label0;
                            }
                            CleanupFragment.c(b.a.a, true);
                            Object obj;
                            if (CleanupFragment.l(b.a.a).getVisibility() == 0)
                            {
                                obj = CleanupFragment.l(b.a.a);
                            } else
                            {
                                obj = null;
                            }
                            CleanupFragment.n(b.a.a).a(((android.view.View) (obj)), null, CleanupFragment.m(b.a.a), null);
                            CleanupFragment.m(b.a.a).setLocalText(CleanupFragment.o(b.a.a).a(0x7f0c0057));
                            CleanupFragment.a(b.a.a, CleanupFragment.m(b.a.a).getText().toString());
                            SharedPref.a(CleanupFragment.k(b.a.a), "sp_key_clear_show_prescan", true);
                        }
                        CleanupFragment.c(b.a.a, a);
                        return;
                    }
                    if (a > 0x1400000L)
                    {
                        CleanupFragment.c(b.a.a, true);
                        if (CleanupFragment.l(b.a.a).getVisibility() == 0)
                        {
                            obj = CleanupFragment.l(b.a.a);
                        } else
                        {
                            obj = null;
                        }
                        CleanupFragment.n(b.a.a).a(((android.view.View) (obj)), null, CleanupFragment.m(b.a.a), null);
                        obj = (new StringBuilder()).append(CleanupFragment.a(SecurityApplication.a(), a)).append("+ ").toString();
                        CleanupFragment.m(b.a.a).setLocalText(CleanupFragment.p(b.a.a).a(0x7f0c0056, new Object[] {
                            obj
                        }));
                        CleanupFragment.a(b.a.a, CleanupFragment.m(b.a.a).getText().toString());
                        SharedPref.a(CleanupFragment.k(b.a.a), "sp_key_clear_show_prescan", true);
                    } else
                    {
                        CleanupFragment.c(b.a.a, false);
                        if (CleanupFragment.l(b.a.a).getVisibility() != 0)
                        {
                            obj = CleanupFragment.l(b.a.a);
                        } else
                        {
                            obj = null;
                        }
                        if (CleanupFragment.m(b.a.a).getVisibility() == 0)
                        {
                            CleanupFragment.n(b.a.a).a(CleanupFragment.m(b.a.a), null, ((android.view.View) (obj)), null);
                        }
                    }
                    if (false)
                    {
                    } else
                    {
                        break MISSING_BLOCK_LABEL_258;
                    }
                }

            
            {
                b = CleanupFragment._cls19._cls1.this;
                a = l;
                super();
            }
            });
            return;
        }
    }

    a(a a1)
    {
        a = a1;
        super();
    }

    // Unreferenced inner class com/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19

/* anonymous class */
    class CleanupFragment._cls19
        implements com.qihoo.security.enginehelper.clean.a.b
    {

        final CleanupFragment a;
        private CleanupFragment.c b;
        private boolean c;
        private final byte d[] = new byte[0];

        static boolean a(CleanupFragment._cls19 _pcls19)
        {
            return _pcls19.c;
        }

        static boolean a(CleanupFragment._cls19 _pcls19, boolean flag)
        {
            _pcls19.c = flag;
            return flag;
        }

        static byte[] b(CleanupFragment._cls19 _pcls19)
        {
            return _pcls19.d;
        }

        static CleanupFragment.c c(CleanupFragment._cls19 _pcls19)
        {
            return _pcls19.b;
        }

        public void a()
        {
            c = false;
            b = new CleanupFragment.c(new CleanupFragment._cls19._cls1(this));
            b.a();
        }

        public void a(int i, Map map)
        {
            for (map = e.a(i, map); CleanupFragment.r(a) || !a.isAdded() || b == null;)
            {
                return;
            }

            b.a(((d) (map)).k.f() + CleanupFragment.t(a));
        }

        public void a(Map map)
        {
        }

        public void b()
        {
            synchronized (CleanupFragment.q(a))
            {
                com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.d(a, false);
                c = true;
            }
            if (b != null)
            {
                b.b();
            }
            return;
            exception;
            abyte0;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void b(int i, Map map)
        {
            map = e.a(i, map);
            CleanupFragment.a(a, map);
            if (CleanupFragment.r(a) || !a.isAdded())
            {
                return;
            } else
            {
                com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.b(a).runOnUiThread(new CleanupFragment._cls19._cls2(map));
                return;
            }
        }

        public void c()
        {
            synchronized (CleanupFragment.q(a))
            {
                com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.d(a, false);
                c = true;
            }
            if (b != null)
            {
                b.b();
            }
            return;
            exception;
            abyte0;
            JVM INSTR monitorexit ;
            throw exception;
        }

            
            {
                a = cleanupfragment;
                super();
            }

        // Unreferenced inner class com/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$2

/* anonymous class */
        class CleanupFragment._cls19._cls2
            implements Runnable
        {

            final d a;
            final CleanupFragment._cls19 b;

            public void run()
            {
                while (CleanupFragment.r(b.a) || !b.a.isAdded() || com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment.e(b.a) != 0 || CleanupFragment.c(b.a)) 
                {
                    return;
                }
                synchronized (com.qihoo.security.opti.trashclear.ui.mainpage.CleanupFragment._cls19.b(b))
                {
                    CleanupFragment._cls19.a(b, true);
                    if (CleanupFragment._cls19.c(b) != null)
                    {
                        CleanupFragment._cls19.c(b).a(a.k.f() + CleanupFragment.t(b.a));
                    }
                    if (CleanupFragment._cls19.c(b) != null)
                    {
                        CleanupFragment._cls19.c(b).b();
                    }
                }
                return;
                exception;
                abyte0;
                JVM INSTR monitorexit ;
                throw exception;
            }

                    
                    {
                        b = CleanupFragment._cls19.this;
                        a = d1;
                        super();
                    }
        }

    }

}
