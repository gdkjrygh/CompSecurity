// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ad;
import android.support.v4.app.p;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import com.facebook.analytics.cb;
import com.facebook.analytics.d;
import com.facebook.base.fragment.FbFragment;
import com.facebook.base.fragment.b;
import com.facebook.base.fragment.c;
import com.facebook.c.s;
import com.facebook.common.w.j;
import com.facebook.common.w.n;
import com.facebook.contacts.contactcard.ContactCardFragment;
import com.facebook.contacts.contactcard.GroupContactCardFragment;
import com.facebook.f;
import com.facebook.fbservice.ops.aa;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.h;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.threads.model.ThreadViewSpec;
import com.facebook.orca.a.g;
import com.facebook.orca.annotations.IsThreadviewDivebarButtonEnabled;
import com.facebook.orca.common.ui.widgets.a;
import com.facebook.orca.compose.ComposeFragment;
import com.facebook.orca.compose.LocationDisabledNuxView;
import com.facebook.orca.compose.LocationNuxView;
import com.facebook.orca.compose.ai;
import com.facebook.orca.compose.ap;
import com.facebook.orca.d.af;
import com.facebook.orca.d.m;
import com.facebook.orca.f.k;
import com.facebook.orca.f.o;
import com.facebook.orca.f.x;
import com.facebook.orca.mutators.DeleteThreadDialogFragment;
import com.facebook.orca.mutators.LeaveThreadDialogFragment;
import com.facebook.orca.notify.NotificationSetting;
import com.facebook.orca.notify.as;
import com.facebook.orca.notify.av;
import com.facebook.orca.nux.ThreadTitleNuxView;
import com.facebook.orca.nux.u;
import com.facebook.orca.prefs.az;
import com.facebook.orca.server.ModifyThreadParams;
import com.facebook.orca.server.RemoveMemberParams;
import com.facebook.orca.server.an;
import com.facebook.orca.server.aq;
import com.facebook.orca.threads.MessagesCollection;
import com.facebook.orca.threads.ThreadParticipant;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threads.q;
import com.facebook.orca.threadview.upsell.UpsellContactView;
import com.facebook.user.RecipientInfo;
import com.facebook.user.User;
import com.facebook.user.UserKey;
import com.facebook.widget.ConfirmationView;
import com.facebook.widget.OverlayLayout;
import com.facebook.widget.listview.EmptyListViewItem;
import com.facebook.widget.titlebar.e;
import com.facebook.zero.ui.l;
import com.google.common.a.es;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.orca.threadview:
//            ar, ci, dn, ThreadAlertRateLimitView, 
//            bu, bv, bw, bx, 
//            by, ThreadViewMessageFragment, ca, cp, 
//            bk, bp, br, ThreadViewMapFragment, 
//            cn, cm, bz, bj, 
//            cw, dm, ThreadViewActivity, bq, 
//            bo, bn, cb, co, 
//            bm, bi, bl, bs, 
//            bt

public class ThreadViewFragment extends FbFragment
    implements d, b, ar
{

    private static final Class a = com/facebook/orca/threadview/ThreadViewFragment;
    private as Z;
    private LocationDisabledNuxView aA;
    private View aB;
    private EditText aC;
    private View aD;
    private Button aE;
    private ThreadViewSpec aF;
    private l aG;
    private List aH;
    private List aI;
    private List aJ;
    private List aK;
    private ThreadViewMessageFragment aL;
    private ThreadViewMapFragment aM;
    private ContactCardFragment aN;
    private GroupContactCardFragment aO;
    private boolean aP;
    private boolean aQ;
    private boolean aR;
    private boolean aS;
    private boolean aT;
    private boolean aU;
    private ca aV;
    private cp aW;
    private boolean aX;
    private boolean aY;
    private ai aZ;
    private com.facebook.orca.f.b aa;
    private x ab;
    private o ac;
    private com.facebook.analytics.av ad;
    private q ae;
    private az af;
    private m ag;
    private af ah;
    private com.facebook.config.a.a ai;
    private com.facebook.orca.threadview.cb aj;
    private com.facebook.fbservice.ops.k ak;
    private dn al;
    private com.facebook.orca.common.ui.widgets.text.a am;
    private javax.inject.a an;
    private javax.inject.a ao;
    private ThreadTitleNuxView ap;
    private u aq;
    private com.google.common.d.a.s ar;
    private com.google.common.d.a.s as;
    private com.facebook.widget.titlebar.a at;
    private EmptyListViewItem au;
    private ThreadAlertRateLimitView av;
    private com.facebook.orca.threadview.upsell.a aw;
    private s ax;
    private com.facebook.orca.compose.av ay;
    private LocationNuxView az;
    private ci b;
    private boolean ba;
    private c bb;
    private float bc;
    private float bd;
    private k c;
    private av d;
    private com.facebook.prefs.shared.d e;
    private android.support.v4.app.q f;
    private a g;
    private com.facebook.ui.d.d h;
    private InputMethodManager i;

    public ThreadViewFragment()
    {
        aF = ThreadViewSpec.a;
        aW = com.facebook.orca.threadview.ci.a;
    }

    static Class U()
    {
        return a;
    }

    private void V()
    {
        t t1 = S();
        b = (ci)t1.a(com/facebook/orca/threadview/ci);
        c = (k)t1.a(com/facebook/orca/f/k);
        d = (av)t1.a(com/facebook/orca/notify/av);
        e = (com.facebook.prefs.shared.d)t1.a(com/facebook/prefs/shared/d);
        f = q();
        g = (a)t1.a(com/facebook/orca/common/ui/widgets/a);
        h = (com.facebook.ui.d.d)t1.a(com/facebook/ui/d/d);
        i = (InputMethodManager)t1.a(android/view/inputmethod/InputMethodManager);
        Z = (as)t1.a(com/facebook/orca/notify/as);
        aa = (com.facebook.orca.f.b)t1.a(com/facebook/orca/f/b);
        ab = (x)t1.a(com/facebook/orca/f/x);
        ac = (o)t1.a(com/facebook/orca/f/o);
        ad = (com.facebook.analytics.av)t1.a(com/facebook/analytics/av);
        ae = (q)t1.a(com/facebook/orca/threads/q);
        al = (dn)t1.a(com/facebook/orca/threadview/dn);
        am = (com.facebook.orca.common.ui.widgets.text.a)t1.a(com/facebook/orca/common/ui/widgets/text/a);
        af = (az)t1.a(com/facebook/orca/prefs/az);
        ag = (m)t1.a(com/facebook/orca/d/m);
        ah = (af)t1.a(com/facebook/orca/d/af);
        ak = (com.facebook.fbservice.ops.k)t1.a(com/facebook/fbservice/ops/k);
        ai = (com.facebook.config.a.a)t1.a(com/facebook/config/a/a);
        an = t1.b(com/facebook/orca/a/a);
        ao = t1.b(java/lang/Boolean, com/facebook/orca/annotations/IsThreadviewDivebarButtonEnabled);
        ax = (s)t1.a(com/facebook/c/s);
        aG = (l)t1.a(com/facebook/zero/ui/l);
    }

    private void W()
    {
        au = (EmptyListViewItem)d(i.threadview_empty_item);
        az = (LocationNuxView)d(i.compose_location_nux);
        aA = (LocationDisabledNuxView)d(i.compose_location_disabled_nux);
        av = (ThreadAlertRateLimitView)d(i.thread_view_rate_limit_popup);
        ConfirmationView confirmationview = (ConfirmationView)d(i.merged_threads_upsell_intro);
        UpsellContactView upsellcontactview = (UpsellContactView)d(i.merged_threads_upsell_contact);
        aw = new com.facebook.orca.threadview.upsell.a(n(), y(), confirmationview, upsellcontactview, e, ax);
        aD = d(i.cancel_group_name_button);
        aB = d(i.group_name_layout);
        aC = (EditText)d(i.group_name_edit);
        X();
        aD.setOnClickListener(new bu(this));
        aE = (Button)d(i.save_group_name_button);
        aE.setOnClickListener(new bv(this));
    }

    private void X()
    {
        aC.addTextChangedListener(new bw(this));
        aC.setOnFocusChangeListener(new bx(this));
    }

    private void Y()
    {
        boolean flag1 = com.facebook.common.w.n.c(aC.getText().toString());
        if (!aC.hasFocus() && flag1)
        {
            aD.setVisibility(0);
            aE.setVisibility(8);
            return;
        }
        aD.setVisibility(8);
        aE.setVisibility(0);
        Button button = aE;
        boolean flag;
        if (!flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        button.setEnabled(flag);
        if (flag1)
        {
            aE.setShadowLayer(bd, 0.0F, bc, 0);
            return;
        } else
        {
            aE.setShadowLayer(bd, 0.0F, bc, f.composer_button_shadow);
            return;
        }
    }

    private void Z()
    {
        if (at == null)
        {
            return;
        }
        Resources resources = o();
        com.facebook.widget.titlebar.d d1 = com.facebook.widget.titlebar.d.newBuilder().a(1).a(resources.getDrawable(h.orca_info_button)).a("back_side_button").k();
        com.facebook.widget.titlebar.d d2 = com.facebook.widget.titlebar.d.newBuilder().a(2).b(o().getString(com.facebook.o.contact_card_edit)).a("edit_contact_button").k();
        com.facebook.widget.titlebar.d d3 = com.facebook.widget.titlebar.d.newBuilder().a(3).b(o().getString(com.facebook.o.contact_card_done)).a("edit_done_contact_button").k();
        if (((Boolean)ao.b()).booleanValue() && (l() instanceof com.facebook.orca.activity.k))
        {
            aH = es.a(d1, com.facebook.widget.titlebar.d.newBuilder().a(4).a(resources.getDrawable(h.orca_divebar_icon)).a("divebar_button").k());
        } else
        {
            aH = es.a(d1);
        }
        aI = es.a(d2);
        aJ = es.a(d3);
        aK = es.d();
        at.setButtonSpecs(aH);
        at.setOnToolbarButtonListener(new by(this));
        at.setTitle(a(com.facebook.o.thread_list_view_updating));
        at.setHasProgressBar(true);
        at.setHasBackButton(true);
        al.a(at);
    }

    static com.google.common.d.a.s a(ThreadViewFragment threadviewfragment, com.google.common.d.a.s s1)
    {
        threadviewfragment.ar = s1;
        return s1;
    }

    private void a(cb cb1)
    {
        cb1.a(g_());
        aF.a(cb1);
        ad.a(cb1);
    }

    private void a(OperationResult operationresult)
    {
        aj();
    }

    private void a(ServiceException serviceexception)
    {
        com.facebook.ui.d.a.a(n()).a(com.facebook.o.app_error_dialog_title).a(serviceexception).a();
    }

    private void a(ServiceException serviceexception, boolean flag)
    {
        g.a(5000L);
        g.a(true);
        View view;
        if (flag)
        {
            view = aL.Q().z();
            g.a(48);
        } else
        {
            view = (View)at;
            g.a(80);
        }
        g.a(view, h.a(serviceexception, false, true), com.facebook.orca.common.ui.widgets.d.WARNING);
    }

    private void a(ThreadViewSpec threadviewspec, boolean flag)
    {
        Preconditions.checkNotNull(threadviewspec);
        aF = threadviewspec;
        if (!aX)
        {
            return;
        }
        if (aV == ca.MESSAGES)
        {
            aC.setText("");
            aB.setVisibility(8);
        }
        if (flag)
        {
            aL.V();
            aQ = false;
            au.setVisibility(0);
            aW = com.facebook.orca.threadview.ci.a;
            if (aN != null)
            {
                aN.U();
            }
        }
        e(flag);
        ai();
        av();
        x();
    }

    private void a(LeaveThreadDialogFragment leavethreaddialogfragment)
    {
        if (leavethreaddialogfragment != null)
        {
            ThreadSummary threadsummary = aW.a;
            User user = c.a();
            if (threadsummary != null && user != null)
            {
                leavethreaddialogfragment.a(new bk(this, threadsummary, user));
                return;
            }
        }
    }

    private void a(ThreadSummary threadsummary)
    {
        al.a(threadsummary);
    }

    private void a(ThreadSummary threadsummary, User user)
    {
        if (as != null)
        {
            return;
        } else
        {
            threadsummary = new RemoveMemberParams(threadsummary.a(), user.b());
            user = new Bundle();
            user.putParcelable("removeMemberParams", threadsummary);
            threadsummary = ak.a(aq.o, user);
            threadsummary.a(new aa(n(), com.facebook.o.thread_leave_progress));
            as = threadsummary.a();
            a(new cb("leave_conversation"));
            com.google.common.d.a.i.a(as, new bp(this));
            return;
        }
    }

    static void a(ThreadViewFragment threadviewfragment)
    {
        threadviewfragment.ai();
    }

    static void a(ThreadViewFragment threadviewfragment, cb cb1)
    {
        threadviewfragment.a(cb1);
    }

    static void a(ThreadViewFragment threadviewfragment, OperationResult operationresult)
    {
        threadviewfragment.a(operationresult);
    }

    static void a(ThreadViewFragment threadviewfragment, ServiceException serviceexception)
    {
        threadviewfragment.a(serviceexception);
    }

    static void a(ThreadViewFragment threadviewfragment, ThreadViewSpec threadviewspec)
    {
        threadviewfragment.b(threadviewspec);
    }

    static void a(ThreadViewFragment threadviewfragment, ThreadSummary threadsummary)
    {
        threadviewfragment.a(threadsummary);
    }

    static void a(ThreadViewFragment threadviewfragment, ThreadSummary threadsummary, User user)
    {
        threadviewfragment.a(threadsummary, user);
    }

    static void a(ThreadViewFragment threadviewfragment, ca ca1)
    {
        threadviewfragment.a(ca1);
    }

    static void a(ThreadViewFragment threadviewfragment, cn cn1)
    {
        threadviewfragment.a(cn1);
    }

    static void a(ThreadViewFragment threadviewfragment, cn cn1, cm cm1)
    {
        threadviewfragment.a(cn1, cm1);
    }

    static void a(ThreadViewFragment threadviewfragment, cn cn1, cp cp1)
    {
        threadviewfragment.a(cn1, cp1);
    }

    static void a(ThreadViewFragment threadviewfragment, User user)
    {
        threadviewfragment.a(user);
    }

    static void a(ThreadViewFragment threadviewfragment, String s1)
    {
        threadviewfragment.e(s1);
    }

    private void a(ca ca1)
    {
        if (aV == ca.MESSAGES)
        {
            aL.O();
        }
        com.facebook.orca.threadview.br.a[ca1.ordinal()];
        JVM INSTR tableswitch 2 4: default 52
    //                   2 63
    //                   3 241
    //                   4 264;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_264;
_L1:
        throw new IllegalArgumentException("cannot transition to that state");
_L2:
        Object obj;
        af();
        aa();
        obj = aN;
_L5:
        b(ca1);
        if (ca1 != ca.MESSAGES)
        {
            aL.X();
        }
        ao();
        Object obj1 = as();
        ad ad1 = f.a();
        ad1.a(null);
        ad1.a(com.facebook.b.in_from_right, com.facebook.b.out_to_left, com.facebook.b.in_from_left, com.facebook.b.out_to_right);
        ad1.b(((Fragment) (obj1)));
        ad1.c(((Fragment) (obj)));
        ad1.a();
        obj = aW.a;
        obj1 = aW.b;
        if (ca1 == ca.MAP)
        {
            if (obj != null && obj1 != null)
            {
                ah();
                aM.a(((ThreadSummary) (obj)), ((MessagesCollection) (obj1)).b());
            }
        } else
        if (ca1 == ca.CONTACTCARD)
        {
            af();
            aN.R();
        } else
        if (ca1 == ca.GROUP_CONTACTCARD)
        {
            ag();
            aO.b();
        }
        aV = ca1;
        x();
        aq();
        au();
        a(ad.c(ca1.toString(), false));
        return;
_L3:
        ag();
        aO.a(aF);
        obj = aO;
          goto _L5
        ah();
        obj = aM;
          goto _L5
    }

    private void a(cn cn1)
    {
        g.a();
        if (cn1 == cn.THREAD_VIEW)
        {
            au.setMessage(o().getString(com.facebook.o.thread_loading));
            au.a(true);
            am();
            return;
        } else
        {
            aL.c();
            return;
        }
    }

    private void a(cn cn1, cm cm1)
    {
        if (!aF.c())
        {
            an();
            if (cn1 == cn.THREAD_VIEW)
            {
                if (aW.a == null || aW.b == null)
                {
                    au.a(false);
                    au.setMessage(null);
                } else
                {
                    f(true);
                    aq();
                }
                if (cm1.b)
                {
                    a(cm1.a, true);
                    return;
                }
            } else
            {
                if (cm1.b)
                {
                    a(cm1.a, false);
                }
                aL.U();
                return;
            }
        }
    }

    private void a(cn cn1, cp cp1)
    {
        if (aF.c())
        {
            return;
        } else
        {
            aW = cp1;
            f(au.a());
            aq();
            return;
        }
    }

    private void a(User user)
    {
        user = am.a(user);
        al.a(user);
        f(au.a());
    }

    private void a(String s1, int i1)
    {
        s1 = com.facebook.orca.prefs.n.d(s1);
        e.b().a(s1, i1).a();
    }

    private void aa()
    {
        if (aF.b())
        {
            UserKey userkey = UserKey.a(aF.e().a());
            aN.a(userkey, true);
        } else
        {
            Object obj = aW.a;
            obj = ae.b(((ThreadSummary) (obj)));
            if (obj != null)
            {
                aN.a(((ThreadParticipant) (obj)).d(), true);
                return;
            }
        }
    }

    private void ab()
    {
        Object obj;
        if (aF.a())
        {
            if (Z.a(((String) (obj = aF.d()))).c())
            {
                obj = com.facebook.orca.prefs.n.a(((String) (obj)));
                com.facebook.prefs.shared.e e1 = e.b();
                e1.a(((com.facebook.prefs.shared.ae) (obj)), NotificationSetting.a.d());
                e1.a();
                return;
            }
        }
    }

    private void ac()
    {
        while (!aQ || !aU || !ba) 
        {
            return;
        }
        ba = false;
        Window window = m().c();
        if (window != null)
        {
            window.setSoftInputMode(4);
        }
        ad();
    }

    private void ad()
    {
        if (aW.a != null && aL != null)
        {
            aL.d();
            aL.Q().b();
        }
    }

    private ThreadSummary ae()
    {
        ThreadSummary threadsummary;
        if (!aF.a())
        {
            threadsummary = null;
        } else
        {
            ThreadSummary threadsummary1 = aW.a;
            threadsummary = threadsummary1;
            if (threadsummary1 == null)
            {
                return c.b(aF.d());
            }
        }
        return threadsummary;
    }

    private void af()
    {
        if (aR)
        {
            return;
        }
        aN = (ContactCardFragment)f.a("contactCard");
        if (aN == null)
        {
            aN = new ContactCardFragment();
            ad ad1 = f.a();
            ad1.a(i.thread_view_content_container, aN, "contactCard");
            ad1.b(aN);
            ad1.a();
            f.b();
            aN.U();
        }
        aN.a(new bz(this));
        aR = true;
    }

    private void ag()
    {
        if (aS)
        {
            aO.a(aF);
            return;
        }
        aO = (GroupContactCardFragment)f.a("groupContactCard");
        if (aO == null)
        {
            aO = new GroupContactCardFragment();
            ad ad1 = f.a();
            ad1.a(i.thread_view_content_container, aO, "groupContactCard");
            ad1.b(aO);
            ad1.a();
        }
        f.b();
        aO.a(aF);
        aO.a(new bj(this));
        aS = true;
    }

    private void ah()
    {
        if (aT)
        {
            return;
        }
        Preconditions.checkState(com.facebook.orca.threadview.cw.a());
        aM = (ThreadViewMapFragment)f.a("mapForContactCard");
        if (aM == null)
        {
            aM = new ThreadViewMapFragment();
            ad ad1 = f.a();
            ad1.a(i.thread_view_content_container, aM, "mapForContactCard");
            ad1.b(aM);
            ad1.a();
        }
        aT = true;
    }

    private void ai()
    {
        g(false);
    }

    private void aj()
    {
        g(true);
    }

    private void ak()
    {
        LeaveThreadDialogFragment leavethreaddialogfragment = new LeaveThreadDialogFragment();
        a(leavethreaddialogfragment);
        leavethreaddialogfragment.a(p(), "leaveThreadDialog");
    }

    private void al()
    {
        ThreadSummary threadsummary = aW.a;
        if (threadsummary == null)
        {
            return;
        } else
        {
            DeleteThreadDialogFragment.a(threadsummary.a()).a(p(), "deleteThreadDialog");
            return;
        }
    }

    private void am()
    {
        if (b.a())
        {
            al.a(true);
        }
    }

    private void an()
    {
        al.a(false);
    }

    private void ao()
    {
        boolean flag1 = true;
        boolean flag = false;
        if (aF.c() || aW.a == null || aV != ca.MESSAGES || ((com.facebook.orca.a.a)an.b()).a() == com.facebook.orca.a.b.NONE)
        {
            aB.setVisibility(8);
            return;
        }
        Object obj;
        String s1;
        int i1;
        if (!aW.a.h() && com.facebook.common.w.n.a(aW.a.g()) && !com.facebook.orca.threadview.dm.a(aF))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        obj = ((com.facebook.orca.a.a)an.b()).a();
        s1 = aF.d();
        if (obj == com.facebook.orca.a.b.NEW_THREAD)
        {
            if (i1 != 0 && !d(s1) && ap())
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
        } else
        if (obj == com.facebook.orca.a.b.ANY_THREAD)
        {
            if (i1 != 0 && !d(s1) && c(s1) < ((com.facebook.orca.a.a)an.b()).b())
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
        }
        if (i1 != 0 && b(aW.a))
        {
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        obj = aB;
        if (i1 != 0)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 8;
        }
        ((View) (obj)).setVisibility(i1);
    }

    private boolean ap()
    {
        boolean flag = true;
        if (aW == null)
        {
            return false;
        }
        MessagesCollection messagescollection = aW.b;
        int i1;
        if (messagescollection == null)
        {
            i1 = 0;
        } else
        {
            i1 = messagescollection.b().size();
        }
        if (i1 != true)
        {
            flag = false;
        }
        return flag;
    }

    private void aq()
    {
        if (!aF.c()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        ThreadSummary threadsummary;
        MessagesCollection messagescollection;
        threadsummary = aW.a;
        messagescollection = aW.b;
        if (messagescollection != null && messagescollection.c() != null)
        {
            ThreadViewSpec threadviewspec = ThreadViewSpec.a(messagescollection.c().e());
            aL.a(threadviewspec);
        }
        if (threadsummary != null)
        {
            ao();
            al.a(threadsummary);
            if (n() != null && (n() instanceof Activity))
            {
                aw.a(threadsummary);
            }
            if (aN != null && aN.v())
            {
                aa();
            }
        }
        com.facebook.orca.threadview.br.a[aV.ordinal()];
        JVM INSTR tableswitch 1 4: default 160
    //                   1 161
    //                   2 190
    //                   3 207
    //                   4 224;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        continue; /* Loop/switch isn't completed */
_L3:
        return;
_L4:
        if (aL == null || aW == com.facebook.orca.threadview.ci.a) goto _L1; else goto _L8
_L8:
        aL.a(aW);
        return;
_L5:
        if (aN == null) goto _L1; else goto _L9
_L9:
        aN.a(threadsummary, messagescollection);
        return;
_L6:
        if (aO == null) goto _L1; else goto _L10
_L10:
        aO.a(threadsummary, messagescollection);
        return;
        if (aM == null || messagescollection == null) goto _L1; else goto _L11
_L11:
        aM.a(threadsummary, messagescollection.b());
        return;
    }

    private void ar()
    {
        if (f.c())
        {
            for (; f.f() > 0; f.e()) { }
            aV = ca.MESSAGES;
            x();
            if (bb != null)
            {
                bb.a(this, null);
                return;
            }
        }
    }

    private Fragment as()
    {
        if (aM != null && aM.v())
        {
            return aM;
        }
        if (aO != null && aO.v())
        {
            return aO;
        }
        if (aN != null && aN.v())
        {
            return aN;
        }
        if (aL != null && aL.v())
        {
            return aL;
        } else
        {
            return null;
        }
    }

    private void at()
    {
        if (aM == null || !aM.v()) goto _L2; else goto _L1
_L1:
        aV = ca.MAP;
_L4:
        x();
        b(aV);
        return;
_L2:
        if (aO != null && aO.v())
        {
            aV = ca.GROUP_CONTACTCARD;
        } else
        if (aN != null && aN.v())
        {
            aV = ca.CONTACTCARD;
        } else
        if (aL != null && aL.v())
        {
            aV = ca.MESSAGES;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void au()
    {
        if (at == null)
        {
            return;
        }
        if (ai.i() == com.facebook.config.a.d.PAA)
        {
            at.setButtonSpecs(aK);
            return;
        }
        switch (com.facebook.orca.threadview.br.a[aV.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            at.setButtonSpecs(aH);
            return;

        case 2: // '\002'
            if (aN.a())
            {
                if (aN.P())
                {
                    at.setButtonSpecs(aJ);
                    return;
                } else
                {
                    at.setButtonSpecs(aI);
                    return;
                }
            } else
            {
                at.setButtonSpecs(aK);
                return;
            }

        case 3: // '\003'
        case 4: // '\004'
            at.setButtonSpecs(aK);
            return;
        }
    }

    private void av()
    {
        if (aU && aP && aF.a() && aW != com.facebook.orca.threadview.ci.a)
        {
            long l1 = c.a(aF.d());
            ThreadSummary threadsummary = aW.a;
            if (threadsummary != null && threadsummary.c() > l1)
            {
                ac.a(threadsummary);
                return;
            }
        }
    }

    private void aw()
    {
        if (ap != null && aq != null)
        {
            return;
        }
        if (n() instanceof ThreadViewActivity)
        {
            ap = (ThreadTitleNuxView)((Activity)n()).findViewById(i.thread_title_nux);
        } else
        {
            LayoutInflater layoutinflater = LayoutInflater.from(n());
            ViewGroup viewgroup = (ViewGroup)((Activity)n()).findViewById(i.thread_list_overlay_container);
            ap = (ThreadTitleNuxView)layoutinflater.inflate(com.facebook.k.orca_thread_view_nux, viewgroup, false);
            viewgroup.addView(ap);
        }
        aq = (u)S().a(com/facebook/orca/nux/u);
    }

    private void ax()
    {
        if (aF.c())
        {
            return;
        } else
        {
            aw();
            aq.a(aF, ap);
            return;
        }
    }

    private long ay()
    {
        ThreadSummary threadsummary = aW.a;
        if (threadsummary == null)
        {
            return -1L;
        } else
        {
            return threadsummary.c();
        }
    }

    static long b(ThreadViewFragment threadviewfragment)
    {
        return threadviewfragment.ay();
    }

    static com.google.common.d.a.s b(ThreadViewFragment threadviewfragment, com.google.common.d.a.s s1)
    {
        threadviewfragment.as = s1;
        return s1;
    }

    private void b(ServiceException serviceexception)
    {
        com.facebook.ui.d.a.a(n()).a(com.facebook.o.app_error_dialog_title).a(serviceexception).a(new bq(this)).a();
    }

    private void b(ThreadViewSpec threadviewspec)
    {
        a(threadviewspec, false);
    }

    static void b(ThreadViewFragment threadviewfragment, ServiceException serviceexception)
    {
        threadviewfragment.b(serviceexception);
    }

    static void b(ThreadViewFragment threadviewfragment, ThreadSummary threadsummary)
    {
        threadviewfragment.d(threadsummary);
    }

    static void b(ThreadViewFragment threadviewfragment, cn cn1)
    {
        threadviewfragment.b(cn1);
    }

    static void b(ThreadViewFragment threadviewfragment, String s1)
    {
        threadviewfragment.b(s1);
    }

    private void b(ca ca1)
    {
        com.facebook.orca.common.ui.titlebar.a a1 = null;
        if (n() instanceof com.facebook.orca.activity.k)
        {
            a1 = ((com.facebook.orca.activity.k)n()).c();
        }
        if (a1 == null)
        {
            return;
        }
        if (ca.MAP == ca1)
        {
            a1.m();
            return;
        } else
        {
            a1.n();
            return;
        }
    }

    private void b(cn cn1)
    {
        au.a(false);
        au.setMessage(null);
        an();
        if (aF.b() && aW != null && aW.a != null)
        {
            b(ThreadViewSpec.a(aW.a.a()));
        }
    }

    private void b(String s1)
    {
        ThreadSummary threadsummary;
        boolean flag;
        if (!com.facebook.common.w.n.c(s1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Should not be called with an empty or null groupName");
        threadsummary = aW.a;
        if (threadsummary == null)
        {
            return;
        } else
        {
            an an1 = new an();
            an1.a(threadsummary.a());
            an1.a(true);
            an1.b(s1);
            a(an1.h());
            return;
        }
    }

    private boolean b(ThreadSummary threadsummary)
    {
        UserKey userkey = c.b();
        if (userkey == null)
        {
            return false;
        }
        for (threadsummary = threadsummary.j().iterator(); threadsummary.hasNext();)
        {
            if (((ThreadParticipant)threadsummary.next()).d().equals(userkey))
            {
                return true;
            }
        }

        return false;
    }

    private int c(String s1)
    {
        s1 = com.facebook.orca.prefs.n.d(s1);
        return e.a(s1, 0);
    }

    private void c(ThreadSummary threadsummary)
    {
        (new android.app.AlertDialog.Builder(n())).setTitle(com.facebook.o.menu_mark_as_spam_confirm).setCancelable(false).setPositiveButton(com.facebook.o.dialog_yes, new bo(this, threadsummary)).setNegativeButton(com.facebook.o.dialog_no, new bn(this)).show();
    }

    static void c(ThreadViewFragment threadviewfragment)
    {
        threadviewfragment.ar();
    }

    static ContactCardFragment d(ThreadViewFragment threadviewfragment)
    {
        return threadviewfragment.aN;
    }

    private void d(ThreadSummary threadsummary)
    {
        f("mark_as_spam");
        ab.a(threadsummary);
    }

    private boolean d(String s1)
    {
        boolean flag = false;
        s1 = com.facebook.orca.prefs.n.d(s1);
        if (e.a(s1, 0) == -1)
        {
            flag = true;
        }
        return flag;
    }

    static GroupContactCardFragment e(ThreadViewFragment threadviewfragment)
    {
        return threadviewfragment.aO;
    }

    private void e(String s1)
    {
        s1 = com.facebook.orca.prefs.n.d(s1);
        e.b().a(s1, -1).a();
    }

    private void e(boolean flag)
    {
        if (!aF.c())
        {
            b.a(aF);
        }
        if (!w())
        {
            Z();
            au();
        }
        if (aF.b())
        {
            al.a(am.a(aF.e()));
        }
        aL.a(aF, flag);
        av.setThread(aF);
        aj.a(aF);
        ab();
        ax();
    }

    static View f(ThreadViewFragment threadviewfragment)
    {
        return threadviewfragment.aB;
    }

    private void f(String s1)
    {
        a((new cb("click")).f("opt_menu_item").g(s1));
    }

    private void f(boolean flag)
    {
        if (aQ)
        {
            return;
        }
        au.setVisibility(8);
        if (flag)
        {
            AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
            alphaanimation.setDuration(400L);
            alphaanimation.setFillAfter(true);
            alphaanimation.setInterpolator(new AccelerateInterpolator());
            aL.z().setAnimation(alphaanimation);
        }
        aQ = true;
        if (aZ != null)
        {
            aL.d();
            aL.Q().a(aZ);
        }
        ac();
    }

    static EditText g(ThreadViewFragment threadviewfragment)
    {
        return threadviewfragment.aC;
    }

    private void g(boolean flag)
    {
        co co1;
        if (flag)
        {
            co1 = new co(true, true);
        } else
        {
            co1 = new co(false, false);
        }
        if (!aF.c())
        {
            b.a(aF);
            b.a(co1);
        }
    }

    static ThreadViewSpec h(ThreadViewFragment threadviewfragment)
    {
        return threadviewfragment.aF;
    }

    static void i(ThreadViewFragment threadviewfragment)
    {
        threadviewfragment.Y();
    }

    static ca j(ThreadViewFragment threadviewfragment)
    {
        return threadviewfragment.aV;
    }

    static ThreadSummary k(ThreadViewFragment threadviewfragment)
    {
        return threadviewfragment.ae();
    }

    static l l(ThreadViewFragment threadviewfragment)
    {
        return threadviewfragment.aG;
    }

    static void m(ThreadViewFragment threadviewfragment)
    {
        threadviewfragment.au();
    }

    static void n(ThreadViewFragment threadviewfragment)
    {
        threadviewfragment.aj();
    }

    static void o(ThreadViewFragment threadviewfragment)
    {
        threadviewfragment.af();
    }

    static void p(ThreadViewFragment threadviewfragment)
    {
        threadviewfragment.ak();
    }

    public void A()
    {
        super.A();
        aP = true;
        if (!aF.c())
        {
            LeaveThreadDialogFragment leavethreaddialogfragment;
            if (aY)
            {
                aY = false;
                aj();
            } else
            {
                ai();
            }
            if (aF.a())
            {
                d.b(aF.d());
            }
            av();
            leavethreaddialogfragment = (LeaveThreadDialogFragment)p().a("leaveThreadDialog");
            if (leavethreaddialogfragment != null)
            {
                a(leavethreaddialogfragment);
                return;
            }
        }
    }

    public void B()
    {
        super.B();
        aP = false;
        g.a();
    }

    public void C()
    {
        super.C();
        aj.b();
        if (g != null)
        {
            g.a();
        }
    }

    public ThreadViewSpec O()
    {
        return aF;
    }

    public void P()
    {
        i.hideSoftInputFromWindow(aC.getWindowToken(), 0);
    }

    public boolean Q()
    {
        if (aV == ca.MESSAGES)
        {
            P();
            String s1 = aF.d();
            if (!aF.c() && aW.a != null && s1 != null && ((com.facebook.orca.a.a)an.b()).a() == com.facebook.orca.a.b.ANY_THREAD && !aW.a.h() && com.facebook.common.w.n.a(aW.a.g()) && !d(s1) && c(s1) < ((com.facebook.orca.a.a)an.b()).b())
            {
                com.facebook.debug.log.b.b(a, "Incremented thread show times");
                a(s1, c(s1) + 1);
            }
        }
        if (aV == ca.CONTACTCARD)
        {
            if (aN.P())
            {
                aN.d();
                return true;
            }
            aN.Q();
        }
        if (!f.c())
        {
            boolean flag;
            if (f.f() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return flag;
        }
        if (f.e())
        {
            at();
            au();
            aq();
            return true;
        } else
        {
            return false;
        }
    }

    public void R()
    {
        al.a();
        if (aq != null)
        {
            aq.b();
        }
        aL.a();
        if (b != null)
        {
            b.a(ThreadViewSpec.a);
        }
        aF = ThreadViewSpec.a;
        aW = com.facebook.orca.threadview.ci.a;
    }

    void T()
    {
        aL.z().postDelayed(new bm(this), 300L);
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(com.facebook.k.orca_thread_view_fragment, viewgroup, false);
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        aj = new bi(this, n());
        bundle = (com.facebook.orca.a.d)S().a(com/facebook/orca/a/d);
        com.facebook.debug.log.b.b(a, "checking group name upsell type");
        if (bundle.c() == g.UNINITIALIZED)
        {
            com.facebook.debug.log.b.b(a, "initializing group name upsell types");
            bundle.b();
        }
    }

    public void a(Menu menu)
    {
        super.a(menu);
        if (aV == ca.MESSAGES && com.facebook.orca.threadview.dm.a(aF))
        {
            menu.removeItem(i.mark_as_spam);
        }
    }

    public void a(Menu menu, MenuInflater menuinflater)
    {
        super.a(menu, menuinflater);
        if (aV == ca.MESSAGES)
        {
            menuinflater.inflate(com.facebook.l.thread_view_fragment_menu, menu);
        }
    }

    public void a(c c1)
    {
        bb = c1;
    }

    public void a(ThreadViewSpec threadviewspec)
    {
        a(threadviewspec, true);
    }

    public void a(ai ai1)
    {
        aZ = ai1;
    }

    public void a(ap ap1)
    {
        ay.a(ap1);
        av.setComposeMode(ap1);
    }

    public void a(ModifyThreadParams modifythreadparams)
    {
        if (ar != null)
        {
            return;
        } else
        {
            Bundle bundle = new Bundle();
            bundle.putParcelable("modifyThreadParams", modifythreadparams);
            modifythreadparams = ak.a(aq.v, bundle);
            modifythreadparams.a(new aa(n(), com.facebook.o.thread_view_saving_progress));
            ar = modifythreadparams.a();
            com.google.common.d.a.i.a(ar, new bl(this));
            return;
        }
    }

    public void a(com.facebook.widget.titlebar.a a1)
    {
        at = a1;
    }

    public void a(String s1)
    {
        if (aL != null)
        {
            aL.a(s1);
        }
    }

    public void a(boolean flag)
    {
        b.a(flag);
    }

    public boolean a(int i1, KeyEvent keyevent)
    {
        if (keyevent.getAction() == 0 && keyevent.getKeyCode() == 31)
        {
            ad();
            return true;
        } else
        {
            return false;
        }
    }

    public boolean a(MenuItem menuitem)
    {
        int i1 = menuitem.getItemId();
        if (i1 != i.refresh) goto _L2; else goto _L1
_L1:
        f("refresh");
        aj();
_L4:
        return true;
_L2:
        ThreadSummary threadsummary;
        threadsummary = aW.a;
        if (i1 != i.archive)
        {
            break; /* Loop/switch isn't completed */
        }
        if (threadsummary != null)
        {
            f("archive");
            aa.a(threadsummary);
            return true;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (i1 != i.mark_as_spam)
        {
            break; /* Loop/switch isn't completed */
        }
        if (threadsummary != null)
        {
            f("mark_as_spam");
            c(threadsummary);
            return true;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (i1 == i.delete)
        {
            if (threadsummary != null)
            {
                f("delete");
                al();
                return true;
            }
        } else
        {
            return super.a(menuitem);
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    public void b()
    {
        aY = true;
    }

    public void b(boolean flag)
    {
        aU = flag;
        av();
        ac();
    }

    public void c()
    {
        ba = true;
    }

    public void c(boolean flag)
    {
        super.c(flag);
        if (u())
        {
            if (!flag)
            {
                Z();
                au();
                return;
            }
            if (ag != null)
            {
                ag.a();
            }
            if (ah != null)
            {
                ah.b();
                return;
            }
        }
    }

    public void d()
    {
        if (d != null && aF.a())
        {
            d.b(aF.d());
            av();
        }
    }

    public void d(Bundle bundle)
    {
        if (aF.c())
        {
            com.facebook.debug.log.b.e(a, "thread spec wasn't set before fragment was attached to activity!");
        }
        bc = com.facebook.common.w.j.a(n(), 1.0F);
        bd = bc;
        V();
        W();
        ((OverlayLayout)d(i.thread_view_overlay_container)).setBackgroundDrawable(new ColorDrawable(-1));
        ay = new com.facebook.orca.compose.av(af);
        ay.a(az, aA);
        aL = (ThreadViewMessageFragment)f.a(i.orca_threadview_fragment);
        aL.a(ay);
        aL.a(this);
        if (bundle != null && bundle.containsKey("state"))
        {
            aV = (ca)Enum.valueOf(com/facebook/orca/threadview/ca, bundle.getString("state"));
        } else
        {
            aV = ca.MESSAGES;
        }
        if (f.a("groupContactCard") != null)
        {
            ag();
            if (aV != ca.GROUP_CONTACTCARD)
            {
                aO.a(aF);
                ad ad1 = f.a();
                ad1.b(aO);
                ad1.a();
            }
        }
        if (f.a("contactCard") != null)
        {
            af();
            if (aV != ca.CONTACTCARD)
            {
                aa();
                ad ad2 = f.a();
                ad2.b(aN);
                ad2.a();
            }
        }
        if (f.a("mapForContactCard") != null)
        {
            ah();
            if (aV != ca.MAP)
            {
                ad ad3 = f.a();
                ad3.b(aM);
                ad3.a();
            }
        }
        b(aV);
        b.a(new bs(this));
        aj.a();
        aX = true;
        e(true);
        d(true);
        aG.a(com.facebook.zero.a.c.h, a(com.facebook.o.zero_show_map_dialog_content), new bt(this));
        aG.a(p());
        super.d(bundle);
    }

    public void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putString("state", aV.toString());
    }

    public void f()
    {
        super.f();
        aj.a(true);
    }

    public void g()
    {
        super.g();
        aj.a(false);
    }

    public com.facebook.analytics.f.a g_()
    {
        return com.facebook.analytics.f.a.THREAD_VIEW_ACTIVITY_NAME;
    }

}
