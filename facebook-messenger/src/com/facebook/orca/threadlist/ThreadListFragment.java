// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.a.c;
import android.support.v4.a.e;
import android.support.v4.app.ag;
import android.support.v4.app.ah;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.analytics.cg;
import com.facebook.analytics.ch;
import com.facebook.analytics.d;
import com.facebook.analytics.f.a;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.base.activity.h;
import com.facebook.base.broadcast.q;
import com.facebook.base.fragment.FbFragment;
import com.facebook.base.fragment.b;
import com.facebook.c.s;
import com.facebook.fbservice.ops.m;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.inject.t;
import com.facebook.l;
import com.facebook.o;
import com.facebook.orca.a.g;
import com.facebook.orca.annotations.CurrentFolder;
import com.facebook.orca.annotations.IsBroadcastEnabled;
import com.facebook.orca.annotations.ShowThirdButtonInThreadList;
import com.facebook.orca.annotations.WillShowInstallMessengerChatHeadPromo;
import com.facebook.orca.broadcast.BroadcastActivity;
import com.facebook.orca.contacts.divebar.an;
import com.facebook.orca.contacts.divebar.ao;
import com.facebook.orca.creation.CreateThreadActivity;
import com.facebook.orca.f.k;
import com.facebook.orca.f.x;
import com.facebook.orca.mutators.DeleteThreadDialogFragment;
import com.facebook.orca.prefs.az;
import com.facebook.orca.server.aq;
import com.facebook.orca.threads.FolderCounts;
import com.facebook.orca.threads.FolderName;
import com.facebook.orca.threads.FolderType;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threads.ThreadsCollection;
import com.facebook.orca.threadview.do;
import com.facebook.orca.upsell.InstallMessengerChatHeadPromoView;
import com.facebook.user.User;
import com.facebook.user.UserKey;
import com.facebook.widget.listview.BetterListView;
import com.facebook.widget.listview.EmptyListViewItem;
import com.google.common.a.es;
import com.google.common.a.fi;
import com.google.common.a.fk;
import com.google.common.a.hq;
import com.google.common.base.Strings;
import com.google.common.base.Supplier;
import com.google.common.d.a.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.orca.threadlist:
//            bf, ba, ThreadListEmptyView, bm, 
//            be, ak, af, bb, 
//            as, bj, bk, q, 
//            bl, i, bo, c, 
//            ao, e, ap, ar, 
//            aq, at, au, bd, 
//            aw, ax, ay, az, 
//            bc

public class ThreadListFragment extends FbFragment
    implements b
{

    private static final Class a = com/facebook/orca/threadlist/ThreadListFragment;
    private AudioManager Z;
    private Supplier aA;
    private boolean aB;
    private javax.inject.a aC;
    private FolderName aD;
    private q aE;
    private bm aF;
    private long aG;
    private be aH;
    private int aI;
    private long aJ;
    private com.facebook.fbservice.service.t aK;
    private do aL;
    private com.facebook.base.fragment.c aM;
    private String aN;
    private av aO;
    private cg aP;
    private boolean aQ;
    private Handler aR;
    private javax.inject.a aS;
    private javax.inject.a aT;
    private javax.inject.a aU;
    private com.facebook.widget.titlebar.a aa;
    private com.facebook.fbservice.ops.k ab;
    private bf ac;
    private com.facebook.orca.threads.q ad;
    private e ae;
    private ao af;
    private s ag;
    private ViewerContext ah;
    private com.facebook.b.a.b ai;
    private com.facebook.orca.threadlist.i aj;
    private com.facebook.orca.threadlist.c ak;
    private View al;
    private View am;
    private View an;
    private View ao;
    private View ap;
    private View aq;
    private InstallMessengerChatHeadPromoView ar;
    private bc as;
    private es at;
    private ah au;
    private com.google.common.d.a.s av;
    private com.facebook.widget.refreshablelistview.b aw;
    private BetterListView ax;
    private EmptyListViewItem ay;
    private ThreadListEmptyView az;
    private k b;
    private com.facebook.orca.notify.av c;
    private af d;
    private com.facebook.orca.f.b e;
    private x f;
    private com.facebook.orca.common.ui.widgets.a g;
    private com.facebook.ui.d.d h;
    private az i;

    public ThreadListFragment()
    {
        at = es.d();
        aB = false;
        aF = com.facebook.orca.threadlist.bf.a;
        aG = -1L;
        aI = -1;
    }

    private void O()
    {
        au = new ba(this);
        if (Q())
        {
            y().a(0, null, au);
        }
    }

    private void P()
    {
        c c1 = y().a(0);
        if (c1 != null && c1.f())
        {
            c1.o();
        }
    }

    private boolean Q()
    {
        return az.getVisibility() == 0 && at.size() < 6;
    }

    private void R()
    {
        b(false);
    }

    private void T()
    {
        b(true);
    }

    private void U()
    {
        if (!aF.a())
        {
            if (aH != null)
            {
                aH.a();
            }
            V();
        } else
        if (!ac.b())
        {
            if (aH != null)
            {
                aH.a();
            }
            V();
            return;
        }
    }

    private void V()
    {
        byte byte0 = 8;
        ak ak1;
        ThreadListEmptyView threadlistemptyview;
        if (aF.a.c())
        {
            ak1 = ak.NONE;
        } else
        if (aB)
        {
            ak1 = ak.LOAD_MORE;
        } else
        {
            ak1 = ak.LOAD_MORE_PLACEHOLDER;
        }
        ay.setVisibility(8);
        threadlistemptyview = az;
        if (aF.a())
        {
            byte0 = 0;
        }
        threadlistemptyview.setVisibility(byte0);
        d.a(ak1);
        d.a(aF.a.b());
        d.notifyDataSetChanged();
        aw.setLastLoadedTime(aF.b);
        ax.post(new bb(this));
        aB = false;
    }

    private void W()
    {
        if (ah.c())
        {
            return;
        }
        ArrayList arraylist = hq.a();
        int j = ax.getFirstVisiblePosition();
        for (int i1 = ax.getLastVisiblePosition(); j <= i1; j++)
        {
            Object obj = d.getItem(j);
            if (obj instanceof ThreadSummary)
            {
                arraylist.add(((ThreadSummary)obj).a());
            }
        }

        Intent intent = new Intent("com.facebook.orca.THREADS_SHOWN_IN_LIST");
        intent.putExtra("threads", arraylist);
        ae.a(intent);
    }

    private void X()
    {
        FolderCounts foldercounts;
        long l1;
        if (av == null)
        {
            if ((foldercounts = b.g(aD)) != null && foldercounts.b() != 0 && (l1 = System.currentTimeMillis()) - aG >= 60000L)
            {
                Bundle bundle = new Bundle();
                bundle.putParcelable("folderName", aD);
                av = ab.a(aq.s, bundle).a();
                com.google.common.d.a.i.a(av, new as(this));
                aG = l1;
                return;
            }
        }
    }

    private void Y()
    {
        Object obj;
        int j;
        if (!aB)
        {
            if ((j = d.getCount()) > 0 && aI == j && ((obj = d.getItem(aI - 1)) == com.facebook.orca.threadlist.af.d || obj == com.facebook.orca.threadlist.af.c))
            {
                ac.e();
                return;
            }
        }
    }

    private String Z()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (aN != null)
        {
            stringbuilder.append(aN);
        }
        if (n() instanceof d)
        {
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append("_");
            }
            stringbuilder.append(((d)n()).g_().toString());
        }
        return stringbuilder.toString();
    }

    static com.google.common.d.a.s a(ThreadListFragment threadlistfragment, com.google.common.d.a.s s1)
    {
        threadlistfragment.av = s1;
        return s1;
    }

    static String a(ThreadListFragment threadlistfragment)
    {
        return threadlistfragment.aa();
    }

    private void a(com.facebook.fbservice.c.b b1, String s1)
    {
        ch ch1;
        String s2;
        s2 = null;
        if (n() instanceof h)
        {
            s2 = ((h)n()).h();
        }
        ch1 = ch.UNDEFINED;
        if (b1 != com.facebook.fbservice.c.b.FROM_SERVER) goto _L2; else goto _L1
_L1:
        ch1 = ch.NETWORK_DATA;
_L4:
        b1 = aP.a(ch1, Z(), s2, -1L);
        b1.b("load_type", s1);
        aO.a(b1);
        return;
_L2:
        if (b1 == com.facebook.fbservice.c.b.FROM_CACHE_STALE || b1 == com.facebook.fbservice.c.b.FROM_CACHE_UP_TO_DATE || b1 == com.facebook.fbservice.c.b.FROM_CACHE_INCOMPLETE)
        {
            ch1 = ch.LOCAL_DATA;
        } else
        if (b1 == com.facebook.fbservice.c.b.NO_DATA)
        {
            ch1 = ch.NO_DATA;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(ServiceException serviceexception)
    {
        g.a(80);
        g.a(5000L);
        g.a(true);
        g.a(d(com.facebook.i.error_toast_dock), h.a(serviceexception, false, true), com.facebook.orca.common.ui.widgets.d.WARNING);
    }

    private void a(an an1)
    {
        boolean flag1 = true;
        if (an1 != null && at.size() < 6)
        {
            es es1 = an1.a();
            es es2 = an1.c();
            an1 = an1.d();
            boolean flag = false;
            HashSet hashset = new HashSet();
            fk fk1 = fi.e();
            a(((Set) (hashset)), ((Iterable) (at)), fk1);
            if (es1 != null)
            {
                a(((Set) (hashset)), ((Iterable) (es1)), fk1);
                flag = true;
            }
            if (es2 != null)
            {
                a(((Set) (hashset)), ((Iterable) (es2)), fk1);
                flag = true;
            }
            if (an1 != null)
            {
                a(((Set) (hashset)), ((Iterable) (an1)), fk1);
                flag = flag1;
            }
            if (flag)
            {
                at = fk1.b().h();
                az.setSuggestedContacts(at);
                if (!Q())
                {
                    P();
                    return;
                }
            }
        }
    }

    static void a(ThreadListFragment threadlistfragment, int j)
    {
        threadlistfragment.e(j);
    }

    static void a(ThreadListFragment threadlistfragment, Intent intent)
    {
        threadlistfragment.b(intent);
    }

    static void a(ThreadListFragment threadlistfragment, an an1)
    {
        threadlistfragment.a(an1);
    }

    static void a(ThreadListFragment threadlistfragment, bk bk1)
    {
        threadlistfragment.a(bk1);
    }

    static void a(ThreadListFragment threadlistfragment, bk bk1, bj bj1)
    {
        threadlistfragment.a(bk1, bj1);
    }

    static void a(ThreadListFragment threadlistfragment, bk bk1, bm bm1)
    {
        threadlistfragment.a(bk1, bm1);
    }

    static void a(ThreadListFragment threadlistfragment, ThreadSummary threadsummary)
    {
        threadlistfragment.e(threadsummary);
    }

    private void a(bj bj1)
    {
        long l1 = System.currentTimeMillis();
        com.facebook.fbservice.service.t t1;
        for (t1 = bj1.a.a(); l1 - aJ < 0x493e0L && aK == t1 && !bj1.b || !v();)
        {
            return;
        }

        a(bj1.a);
        aJ = l1;
        aK = t1;
    }

    private void a(bk bk1)
    {
        g.a();
        if (bk1 == bk.THREAD_LIST)
        {
            if (aF.a())
            {
                ay.setMessage(o().getString(o.thread_list_loading));
                ay.a(true);
                ay.setVisibility(0);
            }
            az.setVisibility(8);
            if (ac.d())
            {
                aw.a();
            }
            ab();
        } else
        if (bk1 == bk.MORE_THREADS)
        {
            d.a(ak.LOADING);
            d.notifyDataSetChanged();
            return;
        }
    }

    private void a(bk bk1, bj bj1)
    {
        if (bk1 == bk.THREAD_LIST)
        {
            aw.b();
            ac();
            ay.setMessage(null);
            ay.a(false);
            az.setVisibility(8);
            a(bj1);
        } else
        if (bk1 == bk.MORE_THREADS)
        {
            aB = true;
            d.a(ak.LOAD_MORE);
            d.notifyDataSetChanged();
            return;
        }
    }

    private void a(bk bk1, bm bm1)
    {
        aF = bm1;
        if (bk1 == bk.MORE_THREADS)
        {
            ax.smoothScrollBy(0, 0);
        }
        U();
        a(bm1.d, bk1.toString());
    }

    private void a(String s1)
    {
        for (int j = 0; j < ax.getChildCount(); j++)
        {
            Object obj = ax.getChildAt(j);
            if (!(obj instanceof com.facebook.orca.threadlist.q))
            {
                continue;
            }
            obj = (com.facebook.orca.threadlist.q)obj;
            if (s1.equals(((com.facebook.orca.threadlist.q) (obj)).getThreadId()))
            {
                ((com.facebook.orca.threadlist.q) (obj)).a();
            }
        }

    }

    private void a(Set set, Iterable iterable, fk fk1)
    {
        iterable = iterable.iterator();
        do
        {
            if (!iterable.hasNext())
            {
                break;
            }
            User user = (User)iterable.next();
            if (!set.contains(user.c().toString()))
            {
                set.add(user.c().toString());
                fk1.b(user);
            }
        } while (true);
    }

    private String aa()
    {
        if (aN == "messages_jewel")
        {
            return "tap_messages_jewel";
        } else
        {
            return "tap_conversation_thread";
        }
    }

    private void ab()
    {
        while (aa == null || !ac.c() || ac.d()) 
        {
            return;
        }
        aa.a(true);
    }

    private void ac()
    {
        if (aa != null)
        {
            aa.a(false);
        }
    }

    private void ad()
    {
        Intent intent = ag();
        intent.putExtra("trigger", "context_menu_thread_list_group_button");
        a(intent);
    }

    private void ae()
    {
        Intent intent = ag();
        intent.putExtra("trigger", "context_menu_thread_list_message_button");
        intent.putExtra("disable_create_thread_suggestions", true);
        a(intent);
    }

    private void af()
    {
        a(new Intent(l(), com/facebook/orca/broadcast/BroadcastActivity));
    }

    private Intent ag()
    {
        Intent intent = new Intent(l(), com/facebook/orca/creation/CreateThreadActivity);
        intent.putExtra(CreateThreadActivity.r, true);
        return intent;
    }

    static int b(ThreadListFragment threadlistfragment, int j)
    {
        threadlistfragment.aI = j;
        return j;
    }

    static av b(ThreadListFragment threadlistfragment)
    {
        return threadlistfragment.aO;
    }

    private void b(Intent intent)
    {
        if (!"com.facebook.orca.ACTION_SMS_ENABLED_CHANGED".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
        R();
_L4:
        return;
_L2:
        if (!"com.facebook.orca.ACTION_READ_THREAD_FOR_UI".equals(intent.getAction()))
        {
            break; /* Loop/switch isn't completed */
        }
        intent = intent.getStringExtra("threadid");
        if (intent != null)
        {
            a(intent);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if ("com.facebook.push.mqtt.ACTION_CHANNEL_STATE_CHANGED".equals(intent.getAction()))
        {
            R();
            return;
        }
        if (!"com.facebook.orca.contacts.CONTACTS_UPLOAD_STATE_CHANGED".equals(intent.getAction()))
        {
            break; /* Loop/switch isn't completed */
        }
        if (Q())
        {
            y().b(0, null, au);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        long l1 = intent.getLongExtra("actionid", -1L);
        if (l1 == -1L || aF.a())
        {
            R();
            return;
        }
        if (aF.c < l1)
        {
            R();
            return;
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    static void b(ThreadListFragment threadlistfragment, bk bk1)
    {
        threadlistfragment.b(bk1);
    }

    static void b(ThreadListFragment threadlistfragment, bk bk1, bj bj1)
    {
        threadlistfragment.b(bk1, bj1);
    }

    private void b(bk bk1)
    {
        if (bk1 == bk.THREAD_LIST)
        {
            aw.b();
            ac();
        }
    }

    private void b(bk bk1, bj bj1)
    {
        if (bk1 == bk.THREAD_LIST)
        {
            a(bj1);
        }
    }

    private void b(String s1)
    {
        s1 = (new cb("click")).f("thread").g(s1);
        s1.e(Z());
        aO.a(s1);
    }

    private void b(boolean flag)
    {
        bl bl1;
        if (flag)
        {
            bl1 = new bl(true, true);
        } else
        {
            bl1 = new bl(false, false);
        }
        aD = FolderName.a((FolderType)aC.b());
        ac.a(aD);
        ac.a(bl1);
    }

    static AudioManager c(ThreadListFragment threadlistfragment)
    {
        return threadlistfragment.Z;
    }

    private void c(String s1)
    {
        aO.a((new cb("click")).f("opt_menu_item").g(s1));
    }

    static bc d(ThreadListFragment threadlistfragment)
    {
        return threadlistfragment.as;
    }

    static Class d()
    {
        return a;
    }

    static ao e(ThreadListFragment threadlistfragment)
    {
        return threadlistfragment.af;
    }

    private void e(int j)
    {
        Object obj = d.getItem(j);
        if (obj instanceof ThreadSummary)
        {
            obj = (ThreadSummary)obj;
            Intent intent = new Intent();
            intent.putExtra("thread_id", ((ThreadSummary) (obj)).a());
            b(((ThreadSummary) (obj)).a());
            intent.putExtra("trigger", Z());
            aM.a(this, intent);
        } else
        if (obj == com.facebook.orca.threadlist.af.d)
        {
            ac.e();
            return;
        }
    }

    private void e(ThreadSummary threadsummary)
    {
        f.a(threadsummary);
        V();
    }

    static void f(ThreadListFragment threadlistfragment)
    {
        threadlistfragment.W();
    }

    static com.facebook.b.a.b g(ThreadListFragment threadlistfragment)
    {
        return threadlistfragment.ai;
    }

    static void h(ThreadListFragment threadlistfragment)
    {
        threadlistfragment.Y();
    }

    static be i(ThreadListFragment threadlistfragment)
    {
        return threadlistfragment.aH;
    }

    public void A()
    {
        super.A();
        com.facebook.debug.log.b.b(a, "ThreadListFragment.onResume");
        if (aQ)
        {
            aQ = false;
            if (!w())
            {
                com.facebook.debug.log.b.b(a, "clear all notifications");
                c.b();
            }
            T();
        } else
        {
            R();
        }
        if (Q())
        {
            y().b(0, null, au);
        } else
        {
            P();
        }
        if (az.getVisibility() == 0)
        {
            az.b();
        }
        aE.a();
    }

    public void B()
    {
        super.B();
        com.facebook.debug.log.b.b(a, "ThreadListFragment.onPause");
        g.a();
        aE.b();
    }

    public void C()
    {
        super.C();
        if (g != null)
        {
            g.a();
        }
        if (ac != null)
        {
            ac.a();
        }
        aE.b();
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(com.facebook.k.orca_thread_list_fragment, viewgroup, false);
        aw = (com.facebook.widget.refreshablelistview.b)viewgroup.findViewById(com.facebook.i.threadlist_container);
        ax = (BetterListView)viewgroup.findViewById(com.facebook.i.thread_list);
        ay = (EmptyListViewItem)viewgroup.findViewById(com.facebook.i.thread_list_loading_view);
        az = (ThreadListEmptyView)viewgroup.findViewById(com.facebook.i.thread_list_empty_item);
        aq = viewgroup.findViewById(com.facebook.i.publisher);
        layoutinflater = layoutinflater.inflate(com.facebook.k.threadlist_publisher_placeholder, ax, false);
        ax.addHeaderView(layoutinflater);
        al = viewgroup.findViewById(com.facebook.i.message_button);
        am = viewgroup.findViewById(com.facebook.i.group_button);
        ap = viewgroup.findViewById(com.facebook.i.broadcast_button);
        an = viewgroup.findViewById(com.facebook.i.group_broadcast_divider);
        ao = viewgroup.findViewById(com.facebook.i.message_group_divider);
        ar = (InstallMessengerChatHeadPromoView)viewgroup.findViewById(com.facebook.i.install_messenger_chat_head_promo_view);
        aj.a(ax, aq, aq);
        ((bo)ax).setPublisherController(aj);
        a(((View) (ax)));
        return viewgroup;
    }

    void a()
    {
        T();
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        bundle = S();
        b = (k)bundle.a(com/facebook/orca/f/k);
        c = (com.facebook.orca.notify.av)bundle.a(com/facebook/orca/notify/av);
        d = (af)bundle.a(com/facebook/orca/threadlist/af);
        e = (com.facebook.orca.f.b)bundle.a(com/facebook/orca/f/b);
        f = (x)bundle.a(com/facebook/orca/f/x);
        g = (com.facebook.orca.common.ui.widgets.a)bundle.a(com/facebook/orca/common/ui/widgets/a);
        h = (com.facebook.ui.d.d)bundle.a(com/facebook/ui/d/d);
        i = (az)bundle.a(com/facebook/orca/prefs/az);
        Z = (AudioManager)bundle.a(android/media/AudioManager);
        aC = bundle.b(com/facebook/orca/threads/FolderType, com/facebook/orca/annotations/CurrentFolder);
        ab = (com.facebook.fbservice.ops.k)bundle.a(com/facebook/fbservice/ops/k);
        aL = (do)bundle.a(com/facebook/orca/threadview/do);
        ac = (bf)bundle.a(com/facebook/orca/threadlist/bf);
        ad = (com.facebook.orca.threads.q)S().a(com/facebook/orca/threads/q);
        aO = (av)bundle.a(com/facebook/analytics/av);
        aP = new cg(n());
        ae = (e)bundle.a(android/support/v4/a/e);
        af = (ao)bundle.a(com/facebook/orca/contacts/divebar/ao);
        ag = (s)bundle.a(com/facebook/c/s);
        ah = (ViewerContext)bundle.a(com/facebook/auth/viewercontext/ViewerContext);
        ai = (com.facebook.b.a.b)bundle.a(com/facebook/b/a/b);
        aj = (com.facebook.orca.threadlist.i)bundle.a(com/facebook/orca/threadlist/i);
        ak = (com.facebook.orca.threadlist.c)bundle.a(com/facebook/orca/threadlist/c);
        aS = bundle.b(java/lang/Boolean, com/facebook/orca/annotations/IsBroadcastEnabled);
        aT = bundle.b(java/lang/Boolean, com/facebook/orca/annotations/ShowThirdButtonInThreadList);
        aU = bundle.b(java/lang/Boolean, com/facebook/orca/annotations/WillShowInstallMessengerChatHeadPromo);
        aR = new Handler();
        if (aA != null)
        {
            d.a(aA);
        }
        android.content.Context context = n();
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.facebook.orca.ACTION_THREAD_UPDATED_FOR_UI");
        intentfilter.addAction("com.facebook.orca.ACTION_READ_THREAD_FOR_UI");
        intentfilter.addAction("com.facebook.orca.ACTION_REMOVED_THREAD_FOR_UI");
        intentfilter.addAction("com.facebook.orca.ACTION_SMS_ENABLED_CHANGED");
        intentfilter.addAction("com.facebook.push.mqtt.ACTION_CHANNEL_STATE_CHANGED");
        intentfilter.addAction("com.facebook.orca.contacts.CONTACTS_UPLOAD_STATE_CHANGED");
        aE = new com.facebook.orca.threadlist.ao(this, context, intentfilter);
        bundle = (com.facebook.orca.a.d)bundle.a(com/facebook/orca/a/d);
        com.facebook.debug.log.b.b(a, "checking group name upsell type");
        if (bundle.c() == g.UNINITIALIZED)
        {
            com.facebook.debug.log.b.b(a, "initializing group name upsell types");
            bundle.b();
        }
    }

    public void a(Menu menu, MenuInflater menuinflater)
    {
        super.a(menu, menuinflater);
        menuinflater.inflate(l.thread_list_fragment_menu, menu);
        menuinflater = ak.a();
        ak.b();
        if (!Strings.isNullOrEmpty(((com.facebook.orca.threadlist.e) (menuinflater)).a))
        {
            menu.findItem(com.facebook.i.send_message).setTitle(((com.facebook.orca.threadlist.e) (menuinflater)).a);
        } else
        {
            menu.removeItem(com.facebook.i.send_message);
        }
        if (!Strings.isNullOrEmpty(((com.facebook.orca.threadlist.e) (menuinflater)).b))
        {
            menu.findItem(com.facebook.i.create_group).setTitle(((com.facebook.orca.threadlist.e) (menuinflater)).b);
        } else
        {
            menu.removeItem(com.facebook.i.create_group);
        }
        if (((Boolean)aS.b()).booleanValue() && !Strings.isNullOrEmpty(((com.facebook.orca.threadlist.e) (menuinflater)).c))
        {
            menu.findItem(com.facebook.i.broadcast).setTitle(((com.facebook.orca.threadlist.e) (menuinflater)).c);
            return;
        } else
        {
            menu.removeItem(com.facebook.i.broadcast);
            return;
        }
    }

    public void a(com.facebook.base.fragment.c c1)
    {
        aM = c1;
    }

    public void a(bc bc)
    {
        as = bc;
    }

    public void a(be be1)
    {
        aH = be1;
    }

    public void a(ThreadSummary threadsummary)
    {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(0x10000000);
        ag.b(intent, n());
        aR.removeCallbacksAndMessages(null);
        aR.postDelayed(new ap(this, threadsummary), 500L);
    }

    public void a(com.facebook.widget.titlebar.a a1)
    {
        aa = a1;
    }

    public void a(boolean flag)
    {
        aQ = flag;
    }

    public boolean a(MenuItem menuitem)
    {
        int j = menuitem.getItemId();
        if (j == com.facebook.i.refresh)
        {
            c("refresh");
            a();
            return true;
        }
        if (j == com.facebook.i.create_group)
        {
            c("create group");
            ad();
            return true;
        }
        if (j == com.facebook.i.send_message)
        {
            c("send message");
            ae();
            return true;
        }
        if (j == com.facebook.i.broadcast)
        {
            c("broadcast");
            af();
            return true;
        } else
        {
            return super.a(menuitem);
        }
    }

    void b()
    {
        c.b();
        X();
    }

    void b(ThreadSummary threadsummary)
    {
        e.a(threadsummary);
        V();
    }

    public ListView c()
    {
        return ax;
    }

    void c(ThreadSummary threadsummary)
    {
        (new android.app.AlertDialog.Builder(n())).setTitle(o.menu_mark_as_spam_confirm).setCancelable(false).setPositiveButton(o.dialog_yes, new ar(this, threadsummary)).setNegativeButton(o.dialog_no, new com.facebook.orca.threadlist.aq(this)).show();
    }

    public void d(Bundle bundle)
    {
        super.d(bundle);
        com.facebook.debug.log.b.b(a, "ThreadListFragment.onActivityCreated");
        ax.setAdapter(d);
        ax.setDividerHeight(0);
        ax.setItemsCanFocus(true);
        ax.setBroadcastInteractionChanges(true);
        ax.c();
        ax.setOnItemClickListener(new at(this));
        aw.setOnRefreshListener(new au(this));
        ax.a(new bd(this, null));
        ac.a(new aw(this));
        d(true);
        if (ah.c())
        {
            az.setStartConversationTextVisibility(false);
            az.a();
            aq.setVisibility(8);
        }
        O();
        al.setOnClickListener(new ax(this));
        am.setOnClickListener(new ay(this));
        ap.setOnClickListener(new com.facebook.orca.threadlist.az(this));
        if (((Boolean)aS.b()).booleanValue()) goto _L2; else goto _L1
_L1:
        ap.setVisibility(8);
        an.setVisibility(8);
_L4:
        if (((Boolean)aU.b()).booleanValue())
        {
            ar.a();
        }
        return;
_L2:
        if (!((Boolean)aT.b()).booleanValue())
        {
            al.setVisibility(8);
            ao.setVisibility(8);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void d(ThreadSummary threadsummary)
    {
        if (threadsummary == null)
        {
            return;
        } else
        {
            DeleteThreadDialogFragment.a(threadsummary.a()).a(p(), "deleteThreadDialog");
            return;
        }
    }

}
