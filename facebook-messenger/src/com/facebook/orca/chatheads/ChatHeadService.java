// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.app.Dialog;
import android.app.KeyguardManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import com.facebook.base.a.g;
import com.facebook.base.broadcast.q;
import com.facebook.base.d.b;
import com.facebook.c.k;
import com.facebook.common.d.c;
import com.facebook.common.d.e;
import com.facebook.e.s;
import com.facebook.inject.t;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.threads.model.ThreadViewSpec;
import com.facebook.orca.chatheads.annotations.IsChatHeadsEnabled;
import com.facebook.p;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.f;
import com.google.common.a.ew;
import com.google.common.a.kl;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.Set;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.chatheads:
//            al, q, p, r, 
//            s, bz, t, u, 
//            cz, o

public class ChatHeadService extends b
    implements com.facebook.base.b.b, c
{

    private static final Class a = com/facebook/orca/chatheads/ChatHeadService;
    private static final int b;
    private a c;
    private com.facebook.common.executors.a d;
    private WindowManager e;
    private KeyguardManager f;
    private al g;
    private d h;
    private a i;
    private bz j;
    private f k;
    private s l;
    private k m;
    private q n;
    private int o;
    private Configuration p;
    private boolean q;
    private boolean r;
    private int s;
    private boolean t;
    private Set u;

    public ChatHeadService()
    {
        q = true;
        r = true;
        t = false;
    }

    private static Intent a(Intent intent)
    {
        intent.setFlags(intent.getFlags() | 0x10000000);
        return intent;
    }

    private void a(int i1)
    {
        if (s == 0 && g != null)
        {
            g.a(1);
        }
        s = s | i1;
    }

    private void a(Message message)
    {
        Preconditions.checkNotNull(message);
        if (message.i() == null)
        {
            return;
        } else
        {
            e();
            g.a(message);
            return;
        }
    }

    private void a(ThreadViewSpec threadviewspec)
    {
        e();
        g.a(threadviewspec);
    }

    private void a(ThreadViewSpec threadviewspec, String s1)
    {
        e();
        b(0);
        g.b(threadviewspec, s1);
    }

    static void a(ChatHeadService chatheadservice, e e1)
    {
        chatheadservice.b(e1);
    }

    static void a(ChatHeadService chatheadservice, String s1)
    {
        chatheadservice.a(s1);
    }

    private void a(String s1)
    {
        boolean flag = Objects.equal(s1, "lock");
        if (f())
        {
            g.a("close_sys_dialogs");
            if (flag)
            {
                n();
            }
        }
    }

    private void a(boolean flag)
    {
        q = flag;
        if (g != null)
        {
            g.a(flag);
        }
    }

    static boolean a(ChatHeadService chatheadservice)
    {
        return chatheadservice.f();
    }

    static a b(ChatHeadService chatheadservice)
    {
        return chatheadservice.i;
    }

    private void b()
    {
        IntentFilter intentfilter;
        boolean flag;
        if (m == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.CLOSE_SYSTEM_DIALOGS");
        intentfilter.addAction("android.intent.action.USER_PRESENT");
        m = new k((new ew()).b("android.intent.action.CLOSE_SYSTEM_DIALOGS", new com.facebook.orca.chatheads.q(this)).b("android.intent.action.USER_PRESENT", new com.facebook.orca.chatheads.p(this)).b());
        registerReceiver(m, intentfilter);
    }

    private void b(int i1)
    {
        s = s & ~i1;
        if (s == 0 && g != null)
        {
            g.b(1);
        }
    }

    private void b(Intent intent)
    {
        if (intent.hasExtra("com.facebook.orca.chatheads.EXTRA_HIDE_ON_FULL_SCREEN"))
        {
            a(intent.getBooleanExtra("com.facebook.orca.chatheads.EXTRA_HIDE_ON_FULL_SCREEN", true));
        }
        if (intent.hasExtra("com.facebook.orca.chatheads.EXTRA_HIDE_ON_LOCK_SCREEN"))
        {
            b(intent.getBooleanExtra("com.facebook.orca.chatheads.EXTRA_HIDE_ON_FULL_SCREEN", true));
        }
    }

    private void b(e e1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!t)
        {
            u.remove(e1);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        e1;
        throw e1;
    }

    private void b(ThreadViewSpec threadviewspec, String s1)
    {
        if (g != null && "read_on_web".equals(s1))
        {
            g.a(threadviewspec, s1);
        } else
        if (f())
        {
            g.c(threadviewspec, s1);
            return;
        }
    }

    private void b(boolean flag)
    {
        r = flag;
        if (!flag)
        {
            b(1);
        } else
        if (f.inKeyguardRestrictedInputMode())
        {
            n();
            return;
        }
    }

    private void c()
    {
        IntentFilter intentfilter;
        boolean flag;
        if (n == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        intentfilter = new IntentFilter();
        intentfilter.addAction("com.facebook.orca.login.AuthStateMachineMonitor.LOGOUT_COMPLETE");
        n = new r(this, this, intentfilter);
        n.a();
    }

    private void c(Intent intent)
    {
        if (intent.hasExtra("com.facebook.orca.chatheads.EXTRA_MESSAGE_NOTIFIED"))
        {
            a((Message)intent.getParcelableExtra("com.facebook.orca.chatheads.EXTRA_MESSAGE_NOTIFIED"));
        }
    }

    static void c(ChatHeadService chatheadservice)
    {
        chatheadservice.g();
    }

    private void d()
    {
        boolean flag;
        if (g == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        g = (al)c.b();
        g.a(q);
        g.a(new com.facebook.orca.chatheads.s(this));
        g.a();
        if (f.inKeyguardRestrictedInputMode())
        {
            n();
        }
        if (s != 0)
        {
            g.a(1);
        }
    }

    private void d(Intent intent)
    {
        intent = h(intent);
        if (intent == null)
        {
            com.facebook.debug.log.b.d(a, "Received ACTION_POPUP_CHAT_HEAD with no thread. Dropping intent.");
            return;
        } else
        {
            a(intent);
            return;
        }
    }

    static void d(ChatHeadService chatheadservice)
    {
        chatheadservice.o();
    }

    private void e()
    {
        if (g == null)
        {
            d();
        }
    }

    private void e(Intent intent)
    {
        ThreadViewSpec threadviewspec = h(intent);
        if (threadviewspec == null)
        {
            com.facebook.debug.log.b.d(a, "Received ACTION_OPEN_CHAT_HEAD with no thread. Dropping intent.");
            return;
        }
        if (intent.getBooleanExtra("com.facebook.orca.chatheads.EXTRA_FOR_AFTER_UNLOCK_KEYGUARD", false) && f.inKeyguardRestrictedInputMode())
        {
            com.facebook.debug.log.b.d(a, "Received ACTION_OPEN_CHAT_HEAD and expected keyguard to be unlocked but it wasn't. Dropping intent.");
            return;
        } else
        {
            com.facebook.debug.log.b.b(a, "handleActionOpenChatHead: %s", new Object[] {
                threadviewspec
            });
            a(threadviewspec, intent.getStringExtra("com.facebook.orca.chatheads.EXTRA_REASON"));
            return;
        }
    }

    static void e(ChatHeadService chatheadservice)
    {
        chatheadservice.q();
    }

    static bz f(ChatHeadService chatheadservice)
    {
        return chatheadservice.j;
    }

    private void f(Intent intent)
    {
        ThreadViewSpec threadviewspec = h(intent);
        if (threadviewspec == null)
        {
            com.facebook.debug.log.b.d(a, "Received ACTION_HIDE_CHAT_HEAD with no thread. Dropping intent.");
        } else
        {
            com.facebook.debug.log.b.b(a, "handleActionHideChatHead: %s", new Object[] {
                threadviewspec
            });
            intent = intent.getStringExtra("com.facebook.orca.chatheads.EXTRA_REASON");
            if (g != null)
            {
                g.a(threadviewspec, intent);
                return;
            }
        }
    }

    private boolean f()
    {
        return g != null && g.d();
    }

    private void g()
    {
        p();
        i();
    }

    private void g(Intent intent)
    {
        ThreadViewSpec threadviewspec = h(intent);
        if (threadviewspec == null)
        {
            com.facebook.debug.log.b.d(a, "Received ACTION_CLEAR_UNREAD_THREAD with no thread. Dropping intent.");
            return;
        } else
        {
            b(threadviewspec, intent.getStringExtra("com.facebook.orca.chatheads.EXTRA_REASON"));
            return;
        }
    }

    private ThreadViewSpec h(Intent intent)
    {
        if (intent.hasExtra("com.facebook.orca.chatheads.EXTRA_THREAD_VIEW_SPEC"))
        {
            return (ThreadViewSpec)intent.getParcelableExtra("com.facebook.orca.chatheads.EXTRA_THREAD_VIEW_SPEC");
        }
        if (intent.hasExtra("com.facebook.orca.chatheads.EXTRA_THREAD_ID"))
        {
            return ThreadViewSpec.a(intent.getStringExtra("com.facebook.orca.chatheads.EXTRA_THREAD_ID"));
        } else
        {
            return null;
        }
    }

    private boolean h()
    {
        return !f() && s == 0 && j();
    }

    private void i()
    {
        if (h())
        {
            stopSelf(o);
        }
    }

    private boolean j()
    {
        return q && r;
    }

    private void k()
    {
        if (f())
        {
            g.g();
        }
    }

    private void l()
    {
        b(2);
    }

    private void m()
    {
        a(2);
    }

    private void n()
    {
        if (r)
        {
            a(1);
        }
    }

    private void o()
    {
        b(1);
        i();
    }

    private void p()
    {
        if (g != null)
        {
            j.b();
            g.c();
            g = null;
        }
    }

    private void q()
    {
        p();
        stopSelf(o);
    }

    public void a(Dialog dialog)
    {
        dialog.getWindow().setType(b);
    }

    public void a(e e1)
    {
        this;
        JVM INSTR monitorenter ;
        Preconditions.checkNotNull(e1);
        if (!t) goto _L2; else goto _L1
_L1:
        d.d(new com.facebook.orca.chatheads.t(this, e1));
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (u == null)
        {
            u = kl.a();
        }
        u.add(e1);
        e1.a(new u(this));
        if (true) goto _L4; else goto _L3
_L3:
        e1;
        throw e1;
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        if ((configuration.diff(p) & 0x80) != 0 && g != null)
        {
            g.f();
        }
        p = new Configuration(configuration);
    }

    public void onCreate()
    {
        super.onCreate();
        t t1 = com.facebook.inject.t.a(this);
        c = t1.b(com/facebook/orca/chatheads/al);
        d = (com.facebook.common.executors.a)t1.a(com/facebook/common/executors/a);
        e = (WindowManager)t1.a(android/view/WindowManager);
        f = (KeyguardManager)t1.a(android/app/KeyguardManager);
        h = (d)t1.a(com/facebook/prefs/shared/d);
        i = t1.b(java/lang/Boolean, com/facebook/orca/chatheads/annotations/IsChatHeadsEnabled);
        j = (bz)t1.a(com/facebook/orca/chatheads/bz);
        l = (s)t1.a(com/facebook/e/s);
        ((cz)t1.a(com/facebook/orca/chatheads/cz)).a(this);
        com.facebook.base.a.g.a(this);
        k = new o(this);
        h.a(k);
        p = new Configuration(getResources().getConfiguration());
        c();
        b();
        setTheme(p.Theme_Orca_ChatHeads);
    }

    public void onDestroy()
    {
        h.b(k);
        k = null;
        this;
        JVM INSTR monitorenter ;
        t = true;
        this;
        JVM INSTR monitorexit ;
        super.onDestroy();
        if (m != null)
        {
            unregisterReceiver(m);
            m = null;
        }
        if (n != null)
        {
            n.b();
            n = null;
        }
        p();
        if (u == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        for (Iterator iterator = u.iterator(); iterator.hasNext(); ((e)iterator.next()).a()) { }
        break MISSING_BLOCK_LABEL_122;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        u.clear();
    }

    public void onLowMemory()
    {
        com.facebook.debug.log.b.b(a, "Received onLowMemory");
        if (g != null)
        {
            g.b();
        }
    }

    public int onStartCommand(Intent intent, int i1, int j1)
    {
        o = Math.max(o, j1);
        if (intent == null || intent.getAction() == null) goto _L2; else goto _L1
_L1:
        String s1 = intent.getAction();
        if (!s1.equals("com.facebook.orca.chatheads.ACTION_NEW_MESSAGE_NOTIFICATION")) goto _L4; else goto _L3
_L3:
        c(intent);
_L2:
        i();
        return 1;
_L4:
        if (s1.equals("com.facebook.orca.chatheads.ACTION_POPUP_CHAT_HEAD"))
        {
            d(intent);
        } else
        if (s1.equals("com.facebook.orca.chatheads.ACTION_OPEN_CHAT_HEAD"))
        {
            e(intent);
        } else
        if (s1.equals("com.facebook.orca.chatheads.ACTION_REMOVE_CHAT_HEAD"))
        {
            f(intent);
        } else
        if (s1.equals("com.facebook.orca.chatheads.ACTION_CLEAR_UNREAD_THREAD"))
        {
            g(intent);
        } else
        if (s1.equals("com.facebook.orca.chatheads.ACTION_CLEAR_ALL_UNREAD_THREADS"))
        {
            k();
        } else
        if (s1.equals("com.facebook.orca.chatheads.ACTION_SHOW_CHATHEADS"))
        {
            l();
        } else
        if (s1.equals("com.facebook.orca.chatheads.ACTION_HIDE_CHATHEADS"))
        {
            m();
        } else
        if (s1.equals("com.facebook.orca.chatheads.ACTION_SET_CHATHEADS_POLICY"))
        {
            b(intent);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public void onTrimMemory(int i1)
    {
        boolean flag = true;
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Received onTrimMemory, level: ").append(i1).toString());
        if (g != null)
        {
            android.view.Display display = e.getDefaultDisplay();
            if (l.a(display))
            {
                if (i1 < 80)
                {
                    flag = false;
                }
            } else
            if (i1 < 60)
            {
                flag = false;
            }
            if (flag)
            {
                g.b();
                return;
            }
        }
    }

    public void startActivity(Intent intent)
    {
        startActivity(intent, new Bundle());
    }

    public void startActivity(Intent intent, Bundle bundle)
    {
        if (f())
        {
            g.a(intent);
        }
        super.startActivity(a(intent));
    }

    static 
    {
        int i1;
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            i1 = 2002;
        } else
        {
            i1 = 2007;
        }
        b = i1;
    }
}
