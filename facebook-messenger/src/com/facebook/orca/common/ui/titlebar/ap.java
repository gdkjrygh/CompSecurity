// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.titlebar;

import android.content.Intent;
import com.facebook.c.s;
import com.facebook.l.v;
import com.facebook.orca.contacts.divebar.a;
import com.facebook.orca.contacts.divebar.c;
import com.facebook.orca.contacts.divebar.d;
import com.facebook.orca.creation.CreateThreadActivity;
import com.facebook.orca.f.k;
import com.facebook.orca.prefs.n;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threadview.ThreadViewActivity;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.e;
import com.facebook.user.User;
import com.facebook.user.UserWithIdentifier;
import com.google.common.a.es;
import com.google.common.a.kl;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.orca.common.ui.titlebar:
//            aq, ac, ar

public class ap
{

    private static final ae a;
    private static boolean b;
    private final a c;
    private final com.facebook.orca.contacts.divebar.e d;
    private final k e;
    private final com.facebook.l.k f;
    private final s g;
    private final com.facebook.common.time.a h;
    private final com.facebook.prefs.shared.d i;
    private final v j = new aq(this);
    private ac k;
    private Set l;
    private User m;
    private int n;

    public ap(a a1, com.facebook.orca.contacts.divebar.e e1, k k1, com.facebook.l.k k2, s s1, com.facebook.common.time.a a2, com.facebook.prefs.shared.d d1)
    {
        c = a1;
        d = e1;
        e = k1;
        f = k2;
        g = s1;
        h = a2;
        i = d1;
    }

    public static void a()
    {
        b = true;
    }

    static void a(ap ap1)
    {
        ap1.d();
    }

    static void b(ap ap1)
    {
        ap1.c();
    }

    private void c()
    {
        android.content.Context context;
label0:
        {
            if (m != null)
            {
                context = k.getContext();
                Object obj = m.c();
                obj = e.c(((com.facebook.user.UserKey) (obj)));
                if (obj == null)
                {
                    break label0;
                }
                obj = ((ThreadSummary) (obj)).a();
                Intent intent = new Intent(context, com/facebook/orca/threadview/ThreadViewActivity);
                intent.putExtra("thread_id", ((String) (obj)));
                g.a(intent, context);
            }
            return;
        }
        UserWithIdentifier userwithidentifier = new UserWithIdentifier(m, m.i());
        Intent intent1 = new Intent(context, com/facebook/orca/creation/CreateThreadActivity);
        intent1.putExtra("to", userwithidentifier);
        intent1.putExtra("show_composer", true);
        intent1.putExtra("disable_redirect_to_thread_view", true);
        g.a(intent1, context);
    }

    private void d()
    {
        Set set;
        int i1;
        i1 = f.c().size();
        set = c.a().a;
        if (set.contains(c.STEADY_STATE_COUNT))
        {
            k.a(i1);
        }
        if (set.contains(c.STEADY_STATE_GREEN_DOT))
        {
            k.a();
        }
        long l1 = c.a().b;
        if (!b && l1 + i.a(a, 0L) > h.a())
        {
            return;
        }
        if (!b || !set.contains(c.ON_OPEN_COUNT)) goto _L2; else goto _L1
_L1:
        k.b(i1);
_L4:
        if (!b && set.contains(c.CHAT_HEAD_ROLL))
        {
            e();
        }
        b = false;
        n = i1;
        i.b().a(a, h.a()).a();
        return;
_L2:
        if (!b && n != i1 && set.contains(c.ON_TRANSITION_COUNT))
        {
            k.a(n, i1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void e()
    {
        Object obj1 = f.c();
        Object obj2 = d.b();
        com.facebook.user.UserKey userkey = null;
        Object obj = null;
        if (obj2 != null)
        {
            obj1 = kl.a(((Iterable) (obj1)));
            java.util.HashSet hashset = kl.a();
            obj2 = ((es) (obj2)).iterator();
            userkey = obj;
            do
            {
                if (!((Iterator) (obj2)).hasNext())
                {
                    break;
                }
                com.facebook.user.UserKey userkey1 = ((User)((Iterator) (obj2)).next()).c();
                if (((Set) (obj1)).contains(userkey1))
                {
                    hashset.add(userkey1);
                    if (userkey == null && l != null && !l.contains(userkey1))
                    {
                        userkey = userkey1;
                    }
                }
            } while (true);
            l = hashset;
        }
        if (userkey != null)
        {
            m = e.a(userkey);
            if (m != null)
            {
                k.a(m);
            }
        }
    }

    public void a(com.facebook.widget.titlebar.a a1)
    {
        d d1 = c.a();
        c.b();
        if (d1.a.isEmpty())
        {
            a1.b();
            return;
        } else
        {
            f.a(j);
            k = (ac)a1.getTitleBarDivebarButtonOverlay();
            k.setOnClickListener(new ar(this));
            k.setClickable(false);
            k.setVisibility(0);
            d();
            return;
        }
    }

    public void b()
    {
        if (k != null)
        {
            k.setVisibility(8);
        }
        f.b(j);
    }

    static 
    {
        a = (ae)n.a.c("last_badge_time");
    }
}
