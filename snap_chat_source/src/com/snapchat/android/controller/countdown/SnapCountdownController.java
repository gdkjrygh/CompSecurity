// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.controller.countdown;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.snapchat.android.Timber;
import com.snapchat.android.ui.AbstractSnapTimerView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import sN;
import sO;

public final class SnapCountdownController
{
    public static final class Action extends Enum
    {

        private static final Action $VALUES[];
        public static final Action CANCEL;
        public static final Action EXPIRE;
        public static final Action SKIP;

        public static Action valueOf(String s)
        {
            return (Action)Enum.valueOf(com/snapchat/android/controller/countdown/SnapCountdownController$Action, s);
        }

        public static Action[] values()
        {
            return (Action[])$VALUES.clone();
        }

        static 
        {
            EXPIRE = new Action("EXPIRE", 0);
            CANCEL = new Action("CANCEL", 1);
            SKIP = new Action("SKIP", 2);
            $VALUES = (new Action[] {
                EXPIRE, CANCEL, SKIP
            });
        }

        private Action(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class a
    {

        protected a()
        {
        }
    }


    private static final SnapCountdownController c = new SnapCountdownController();
    public final Object a;
    final Map b;
    private final Handler d;
    private AbstractSnapTimerView e;
    private final Runnable f;

    SnapCountdownController()
    {
        Handler handler = new Handler(Looper.getMainLooper());
        new a();
        this(handler, ((Map) (new HashMap())));
    }

    private SnapCountdownController(Handler handler, Map map)
    {
        a = new Object();
        f = new Runnable() {

            private SnapCountdownController a;

            public final void run()
            {
                Object obj1 = a;
                Object obj = ((SnapCountdownController) (obj1)).a;
                obj;
                JVM INSTR monitorenter ;
                Object obj2;
                obj2 = new HashSet(((SnapCountdownController) (obj1)).b.size());
                ((Set) (obj2)).addAll(((SnapCountdownController) (obj1)).b.entrySet());
                obj2 = ((Set) (obj2)).iterator();
                long l = 0x7fffffffffffffffL;
_L2:
                sN sn;
                Set set;
                long l1;
                if (!((Iterator) (obj2)).hasNext())
                {
                    break; /* Loop/switch isn't completed */
                }
                sn = (sN)((java.util.Map.Entry)((Iterator) (obj2)).next()).getValue();
                if (!sn.c())
                {
                    continue; /* Loop/switch isn't completed */
                }
                l1 = sn.a();
                set = sn.d();
                if (l1 > 0L)
                {
                    break MISSING_BLOCK_LABEL_131;
                }
                ((SnapCountdownController) (obj1)).a(sn, Action.EXPIRE);
                continue; /* Loop/switch isn't completed */
                obj1;
                obj;
                JVM INSTR monitorexit ;
                throw obj1;
                for (Iterator iterator = set.iterator(); iterator.hasNext(); ((sO)iterator.next()).a(l1)) { }
                l = Math.min(Math.min(l1, l), 100L);
                if (true) goto _L2; else goto _L1
_L1:
                if (l >= 0x7fffffffffffffffL)
                {
                    break MISSING_BLOCK_LABEL_203;
                }
                ((SnapCountdownController) (obj1)).a(l);
                obj;
                JVM INSTR monitorexit ;
            }

            
            {
                a = SnapCountdownController.this;
                super();
            }
        };
        d = handler;
        b = map;
    }

    public static SnapCountdownController a()
    {
        return c;
    }

    final void a(long l)
    {
        d.postDelayed(f, l);
    }

    public final void a(String s)
    {
        Timber.c("SnapCountdownController", "expireCountdown %s", new Object[] {
            s
        });
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        s = c(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        a(((sN) (s)), Action.EXPIRE);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void a(String s, sO so)
    {
        Timber.c("SnapCountdownController", "addListener %s", new Object[] {
            s
        });
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        s = c(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        s.a(so);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void a(String s, boolean flag)
    {
        Timber.c("SnapCountdownController", "pause %s (%b)", new Object[] {
            s, Boolean.valueOf(flag)
        });
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        s = c(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        if (!s.c() || s.b() == flag)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        s.f = ((sN) (s)).g - SystemClock.elapsedRealtime();
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        s.g = SystemClock.elapsedRealtime() + ((sN) (s)).f;
        s.f = 0x7fffffffffffffffL;
        if (true) goto _L2; else goto _L1
_L1:
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void a(String s, boolean flag, AbstractSnapTimerView abstractsnaptimerview)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        e = abstractsnaptimerview;
        s = c(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        if (s.c())
        {
            s.d = flag;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void a(String s, boolean flag, List list)
    {
        Timber.c("SnapCountdownController", "prepareCountdown %s, isCancelable: %b", new Object[] {
            s, Boolean.valueOf(flag)
        });
        Object obj1 = a;
        obj1;
        JVM INSTR monitorenter ;
        Object obj = c(s);
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = new sN(s, flag);
        b.put(s, obj);
        s = ((String) (obj));
_L6:
        list = list.iterator();
_L4:
        do
        {
            if (!list.hasNext())
            {
                break MISSING_BLOCK_LABEL_117;
            }
            obj = (sO)list.next();
        } while (obj == null);
        s.a(((sO) (obj)));
        if (true) goto _L4; else goto _L3
_L3:
        s;
        obj1;
        JVM INSTR monitorexit ;
        throw s;
        obj1;
        JVM INSTR monitorexit ;
        return;
_L2:
        s = ((String) (obj));
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(sN sn, Action action)
    {
        Timber.c("SnapCountdownController", "onSnapFinished %s, action: %s, isLooping: %b", new Object[] {
            sn, action.toString(), Boolean.valueOf(sn.d)
        });
        if (sn.d && action == Action.EXPIRE)
        {
            Timber.c("SnapCountdownController", "restart countdown seconds: %d", new Object[] {
                Integer.valueOf(sn.h)
            });
            int i = sn.h;
            e.a(i, i, i, i);
            a(sn.c, i);
            return;
        }
        b.remove(sn.c);
        Iterator iterator = sn.d().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            sO so = (sO)iterator.next();
            if (action == Action.SKIP)
            {
                so.c();
            } else
            if (action == Action.EXPIRE)
            {
                so.b();
            } else
            if (action == Action.CANCEL)
            {
                so.d();
            }
        } while (true);
        synchronized (sn.a)
        {
            sn.b.clear();
        }
        return;
        sn;
        action;
        JVM INSTR monitorexit ;
        throw sn;
    }

    public final boolean a(String s, int i)
    {
        Timber.c("SnapCountdownController", "startCountdown %s", new Object[] {
            s
        });
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        s = c(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        if (s.c() && !((sN) (s)).d)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        long l = i;
        s.h = (int)l;
        s.g = l + SystemClock.elapsedRealtime();
        if (!((sN) (s)).d)
        {
            for (Iterator iterator = s.d().iterator(); iterator.hasNext(); ((sO)iterator.next()).a()) { }
        }
        break MISSING_BLOCK_LABEL_118;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        a(Math.min(s.a(), 100L));
        obj;
        JVM INSTR monitorexit ;
        return true;
        obj;
        JVM INSTR monitorexit ;
        return false;
    }

    public final boolean b(String s)
    {
        Timber.c("SnapCountdownController", "cancel %s", new Object[] {
            s
        });
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        s = c(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        if (!s.c() || ((sN) (s)).e)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        obj;
        JVM INSTR monitorexit ;
        return false;
        a(s, Action.CANCEL);
        obj;
        JVM INSTR monitorexit ;
        return true;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final sN c(String s)
    {
        return (sN)b.get(s);
    }

    public final boolean d(String s)
    {
        s = c(s);
        if (s == null)
        {
            return false;
        } else
        {
            return s.c();
        }
    }

    public final int e(String s)
    {
        s = c(s);
        long l;
        if (s == null || !s.c())
        {
            l = 0L;
        } else
        {
            l = s.a();
        }
        return (int)Math.ceil((double)l / 1000D);
    }

}
