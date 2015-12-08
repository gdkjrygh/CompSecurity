// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.friends.ui;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.fitbit.data.bl.FacebookBusinessLogic;
import com.fitbit.data.bl.SyncFacebookLinkTask;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.au;
import com.fitbit.data.bl.s;
import com.fitbit.data.domain.Profile;
import com.fitbit.e.a;
import com.fitbit.friends.ui.a.e;
import com.fitbit.friends.ui.views.FriendItemView;
import com.fitbit.home.ui.OkDialogFragment;
import com.fitbit.home.ui.j;
import com.fitbit.savedstate.i;
import com.fitbit.ui.b;
import com.fitbit.util.ListPickerDialogFragment;
import com.fitbit.util.ad;
import com.fitbit.util.f;
import com.fitbit.util.q;
import java.util.EnumSet;
import java.util.List;
import se.emilsjolander.stickylistheaders.StickyListHeadersListView;

// Referenced classes of package com.fitbit.friends.ui:
//            FriendFragmentWithFriendItemViewListener, AddFriendsListHeaderFragment, ScanNetworkOperationBinder, FindFriendsFragment_, 
//            InviteByEmailFragment, FriendsListViewType

public class FindFriendsFragment extends FriendFragmentWithFriendItemViewListener
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, FacebookCallback, AddFriendsListHeaderFragment.a
{

    private static final int e = 2000;
    private static final String f = "FindFriendsFragment";
    private static final String g = "LIST_HEADER_FRAGMENT_TAG";
    private static final String h = "INVITE_BY_EMAIL_FRAGMENT_TAG";
    private static final String i = "AddFriendsFragment.TAG_FRIEND_LIMIT_DIALOG";
    private static final String j = "AddFriendsFragment.TAG_SCAN_RETRY_DIALOG";
    private static final String k = "AddFriendsFragment.INVITE_DIALOG";
    private com.fitbit.util.ListPickerDialogFragment.a A;
    protected View a;
    protected StickyListHeadersListView b;
    protected View c;
    b d;
    private Handler l;
    private volatile boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private FriendsListViewType r;
    private String s;
    private boolean t;
    private boolean u;
    private boolean v;
    private com.fitbit.friends.ui.a.b w;
    private e x;
    private CallbackManager y;
    private BroadcastReceiver z;

    public FindFriendsFragment()
    {
        l = new Handler(Looper.getMainLooper());
        m = false;
        n = false;
        p = false;
        s = "";
        t = false;
        u = false;
        v = false;
        y = null;
    /* block-local class not found */
    class b {}

        d = new b();
        z = new _cls4();
        A = new _cls9();
    }

    private void a(ShowProgress showprogress)
    {
        a(showprogress, com.fitbit.friends.ui.ScanNetworkOperationBinder.WaitForFacebook.a);
    }

    private void a(ShowProgress showprogress, ScanNetworkOperationBinder.WaitForFacebook waitforfacebook)
    {
        ScanNetworkOperationBinder.WhatsScanning whatsscanning = w();
        if (whatsscanning == com.fitbit.friends.ui.ScanNetworkOperationBinder.WhatsScanning.a)
        {
            com.fitbit.e.a.f("FindFriendsFragment", "started scan but must not scan", new Object[0]);
            return;
        }
        com.fitbit.e.a.a("FindFriendsFragment", "try to start sync: %s", new Object[] {
            whatsscanning
        });
        v();
        AddFriendsListHeaderFragment addfriendslistheaderfragment = r();
        if (addfriendslistheaderfragment != null)
        {
    /* block-local class not found */
    class ShowProgress {}

            if (EnumSet.of(com.fitbit.friends.ui.ScanNetworkOperationBinder.WhatsScanning.b, ScanNetworkOperationBinder.WhatsScanning.c).contains(whatsscanning))
            {
                m = false;
                if (ScanNetworkOperationBinder.WhatsScanning.c.equals(whatsscanning) || !com.fitbit.friends.ui.ShowProgress.b.equals(showprogress))
                {
                    addfriendslistheaderfragment.l();
                }
            }
            if (EnumSet.of(com.fitbit.friends.ui.ScanNetworkOperationBinder.WhatsScanning.b, ScanNetworkOperationBinder.WhatsScanning.d).contains(whatsscanning) && (ScanNetworkOperationBinder.WhatsScanning.d.equals(whatsscanning) || !ShowProgress.c.equals(showprogress)))
            {
                addfriendslistheaderfragment.g();
            }
        }
        if (EnumSet.of(com.fitbit.friends.ui.ScanNetworkOperationBinder.WhatsScanning.b, ScanNetworkOperationBinder.WhatsScanning.d).contains(whatsscanning))
        {
            com.fitbit.savedstate.i.e(true);
            t = true;
        }
        (new _cls5(getActivity(), 601)).a(whatsscanning).a(waitforfacebook).a(showprogress).f();
    }

    static void a(FindFriendsFragment findfriendsfragment)
    {
        findfriendsfragment.n();
    }

    static void a(FindFriendsFragment findfriendsfragment, ShowProgress showprogress)
    {
        findfriendsfragment.a(showprogress);
    }

    static void a(FindFriendsFragment findfriendsfragment, ShowProgress showprogress, ScanNetworkOperationBinder.WaitForFacebook waitforfacebook)
    {
        findfriendsfragment.a(showprogress, waitforfacebook);
    }

    static void a(FindFriendsFragment findfriendsfragment, ScanNetworkOperationBinder.WhatsScanning whatsscanning, ShowProgress showprogress)
    {
        findfriendsfragment.a(whatsscanning, showprogress);
    }

    private void a(ScanNetworkOperationBinder.WhatsScanning whatsscanning, ShowProgress showprogress)
    {
        (new q(getFragmentManager())).a("AddFriendsFragment.TAG_SCAN_RETRY_DIALOG", com.fitbit.home.ui.j.a(new _cls7(showprogress, whatsscanning)));
    }

    private void a(boolean flag)
    {
        r().g();
        com.fitbit.e.a.a("FindFriendsFragment", "Facebook Logged in...", new Object[0]);
        (new _cls1(getActivity(), 602, flag)).a(SyncFacebookLinkTask.a(getActivity()));
    }

    static boolean a(FindFriendsFragment findfriendsfragment, boolean flag)
    {
        findfriendsfragment.m = flag;
        return flag;
    }

    static void b(FindFriendsFragment findfriendsfragment)
    {
        findfriendsfragment.q();
    }

    static void b(FindFriendsFragment findfriendsfragment, boolean flag)
    {
        findfriendsfragment.a(flag);
    }

    private void b(boolean flag)
    {
        AddFriendsListHeaderFragment addfriendslistheaderfragment = r();
        if (addfriendslistheaderfragment != null)
        {
            addfriendslistheaderfragment.a(flag);
        }
    }

    static AddFriendsListHeaderFragment c(FindFriendsFragment findfriendsfragment)
    {
        return findfriendsfragment.r();
    }

    static boolean c(FindFriendsFragment findfriendsfragment, boolean flag)
    {
        findfriendsfragment.t = flag;
        return flag;
    }

    static boolean d(FindFriendsFragment findfriendsfragment)
    {
        return findfriendsfragment.o;
    }

    static boolean d(FindFriendsFragment findfriendsfragment, boolean flag)
    {
        findfriendsfragment.o = flag;
        return flag;
    }

    static boolean e(FindFriendsFragment findfriendsfragment)
    {
        return findfriendsfragment.v;
    }

    static boolean e(FindFriendsFragment findfriendsfragment, boolean flag)
    {
        findfriendsfragment.v = flag;
        return flag;
    }

    static boolean f(FindFriendsFragment findfriendsfragment)
    {
        return findfriendsfragment.u;
    }

    public static FindFriendsFragment g()
    {
        return FindFriendsFragment_.n().a();
    }

    static com.fitbit.util.ListPickerDialogFragment.a g(FindFriendsFragment findfriendsfragment)
    {
        return findfriendsfragment.A;
    }

    static void h(FindFriendsFragment findfriendsfragment)
    {
        findfriendsfragment.x();
    }

    private void n()
    {
        FacebookBusinessLogic.a().f();
        if (r() != null)
        {
            r().f();
        }
    }

    private void q()
    {
        (new q(getFragmentManager())).a("AddFriendsFragment.TAG_SCAN_RETRY_DIALOG", com.fitbit.home.ui.j.a(new _cls2()));
    }

    private AddFriendsListHeaderFragment r()
    {
        FragmentManager fragmentmanager = getChildFragmentManager();
        if (fragmentmanager == null)
        {
            return null;
        } else
        {
            return (AddFriendsListHeaderFragment)fragmentmanager.findFragmentByTag("LIST_HEADER_FRAGMENT_TAG");
        }
    }

    private InviteByEmailFragment s()
    {
        FragmentManager fragmentmanager = getChildFragmentManager();
        if (fragmentmanager == null)
        {
            return null;
        } else
        {
            return (InviteByEmailFragment)fragmentmanager.findFragmentByTag("INVITE_BY_EMAIL_FRAGMENT_TAG");
        }
    }

    private void t()
    {
        LocalBroadcastManager localbroadcastmanager = LocalBroadcastManager.getInstance(getActivity());
        IntentFilter intentfilter = new IntentFilter("com.fitbit.FitbitMobile.ChinaConfirmationDialogController.CONTACTS_ACTION_PERMISSION_RESPONSE");
        localbroadcastmanager.registerReceiver(z, intentfilter);
        com.fitbit.ui.b.e(com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope.c);
    }

    private void u()
    {
        v();
        t();
    }

    private void v()
    {
        if (!p)
        {
            p = true;
            getLoaderManager().initLoader(600, null, this);
        }
    }

    private ScanNetworkOperationBinder.WhatsScanning w()
    {
        boolean flag = com.fitbit.savedstate.i.k();
        boolean flag1 = com.fitbit.data.bl.FacebookBusinessLogic.FacebookFitbitState.c.equals(FacebookBusinessLogic.a().d());
        if (flag && flag1)
        {
            return com.fitbit.friends.ui.ScanNetworkOperationBinder.WhatsScanning.b;
        }
        if (flag)
        {
            return ScanNetworkOperationBinder.WhatsScanning.c;
        }
        if (flag1)
        {
            return ScanNetworkOperationBinder.WhatsScanning.d;
        } else
        {
            return com.fitbit.friends.ui.ScanNetworkOperationBinder.WhatsScanning.a;
        }
    }

    private void x()
    {
    /* block-local class not found */
    class e {}

        if (x == null)
        {
            x = new e();
        }
        x.a(au.a(getActivity(), s));
    }

    public void a()
    {
        a(true, false);
    }

    public void a(Loader loader, a a1)
    {
        int j1 = 0;
        com.fitbit.e.a.a("FindFriendsFragment", "load Finished", new Object[0]);
        loader = w.b();
        if (loader != null)
        {
            com.fitbit.e.a.a("FindFriendsFragment", "finished with results", new Object[0]);
    /* block-local class not found */
    class a {}

            int i1;
            if (((a) (loader)).a != null)
            {
                i1 = ((a) (loader)).a.size();
            } else
            {
                i1 = 0;
            }
            if (((a) (loader)).b != null)
            {
                j1 = ((a) (loader)).b.size();
            }
            if (a1.a.size() != i1 || a1.b.size() != j1)
            {
                b.destroyDrawingCache();
                b.a(w);
            }
        }
        w.a(a1);
        e();
    }

    public void a(LoginResult loginresult)
    {
        loginresult = r();
        if (com.fitbit.c.b.a(AccessToken.getCurrentAccessToken()))
        {
            if (!t && loginresult != null)
            {
                loginresult.h();
            }
            if (com.fitbit.data.bl.FacebookBusinessLogic.FacebookFitbitState.b.equals(FacebookBusinessLogic.a().d()))
            {
                a(true);
            }
        } else
        {
            com.fitbit.e.a.a("FindFriendsFragment", "Facebook Logged out...", new Object[0]);
            if (loginresult != null)
            {
                loginresult.f();
                return;
            }
        }
    }

    public void a(FriendsListViewType friendslistviewtype, String s1)
    {
        s = s1;
        if (w != null)
        {
            if (friendslistviewtype.equals(r))
            {
                if (friendslistviewtype.a())
                {
                    ((e)w).a(s1);
                }
                return;
            } else
            {
                r = friendslistviewtype;
                friendslistviewtype = friendslistviewtype.a(this);
                friendslistviewtype.a(w.b());
                s1 = b;
                w = friendslistviewtype;
                s1.a(friendslistviewtype);
                b.destroyDrawingCache();
                return;
            }
        } else
        {
            r = friendslistviewtype;
            return;
        }
    }

    public void a(FriendItemView frienditemview)
    {
    }

    public void a(FriendItemView frienditemview, com.fitbit.friends.ui.views.FriendItemView.AddressType addresstype)
    {
        List list = com.fitbit.data.bl.s.a(frienditemview.getContext()).d(Long.toString(an.a().b().I()));
        if (list != null && list.size() > 2000)
        {
            ad.a(getFragmentManager(), "AddFriendsFragment.TAG_FRIEND_LIMIT_DIALOG", OkDialogFragment.a(null, 0x7f0803eb, 0x7f0803ec));
            return;
        } else
        {
            com.fitbit.util.f.a(new _cls8(this, frienditemview.b(), addresstype));
            return;
        }
    }

    protected void a(String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            r().b(true);
            a(com.fitbit.friends.ui.FriendsListViewType.a, s1);
            return;
        } else
        {
            r().b(false);
            a(com.fitbit.friends.ui.FriendsListViewType.b, s1);
            return;
        }
    }

    public void a(boolean flag, boolean flag1)
    {
        q = flag;
        if (flag)
        {
            o();
            r().b(false);
            s().d();
            return;
        }
        if (p())
        {
            a(com.fitbit.friends.ui.FriendsListViewType.b, s);
        } else
        {
            a(com.fitbit.friends.ui.FriendsListViewType.a, s);
        }
        r().a(flag1, s);
        s().a(false);
        r().b(true);
    }

    public void b()
    {
        u();
    }

    public void b(boolean flag, boolean flag1)
    {
        InviteByEmailFragment invitebyemailfragment = s();
        String s1 = s;
        if (!flag1 || !flag && com.fitbit.util.s.b(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        invitebyemailfragment.a(s1, flag);
    }

    public void c()
    {
        a(true);
    }

    public void d()
    {
        a(com.fitbit.friends.ui.ShowProgress.b);
    }

    public void e()
    {
label0:
        {
            boolean flag;
label1:
            {
                boolean flag1 = false;
                AddFriendsListHeaderFragment addfriendslistheaderfragment = r();
                if (addfriendslistheaderfragment == null)
                {
                    break label0;
                }
                flag = flag1;
                if (w == null)
                {
                    break label1;
                }
                flag = flag1;
                if (w.b() == null)
                {
                    break label1;
                }
                a a1 = w.b();
                flag = flag1;
                if (!a1.b.isEmpty())
                {
                    break label1;
                }
                flag = flag1;
                if (!a1.a.isEmpty())
                {
                    break label1;
                }
                if (!AddFriendsListHeaderFragment.ProgressButtonStates.c.equals(addfriendslistheaderfragment.j()))
                {
                    flag = flag1;
                    if (!AddFriendsListHeaderFragment.ProgressButtonStates.c.equals(addfriendslistheaderfragment.n()))
                    {
                        break label1;
                    }
                }
                flag = true;
            }
            b(flag);
        }
    }

    public boolean f()
    {
        return t;
    }

    protected void h()
    {
        b.b(false);
        Object obj = new FrameLayout(getActivity());
        ((FrameLayout) (obj)).setId(0x7f110009);
        Object obj1 = getChildFragmentManager();
        if (r() == null)
        {
            AddFriendsListHeaderFragment addfriendslistheaderfragment = com.fitbit.friends.ui.AddFriendsListHeaderFragment.a();
            ((FragmentManager) (obj1)).beginTransaction().replace(((FrameLayout) (obj)).getId(), addfriendslistheaderfragment, "LIST_HEADER_FRAGMENT_TAG").commit();
        }
        if (s() == null)
        {
            InviteByEmailFragment invitebyemailfragment = com.fitbit.friends.ui.InviteByEmailFragment.a();
            ((FragmentManager) (obj1)).beginTransaction().replace(0x7f11028c, invitebyemailfragment, "INVITE_BY_EMAIL_FRAGMENT_TAG").commit();
        }
        b.b(((View) (obj)));
        obj = b;
        obj1 = r.a(this);
        w = ((com.fitbit.friends.ui.a.b) (obj1));
        ((StickyListHeadersListView) (obj)).a(((se.emilsjolander.stickylistheaders.h) (obj1)));
        b.a(new _cls3());
        obj = (ListPickerDialogFragment)getFragmentManager().findFragmentByTag("AddFriendsFragment.INVITE_DIALOG");
        if (obj != null)
        {
            ((ListPickerDialogFragment) (obj)).a(A);
        }
    }

    protected void i()
    {
        v = true;
        j();
    }

    protected void j()
    {
        if (l != null && getActivity() != null)
        {
            l.post(new _cls6());
        }
    }

    public boolean k()
    {
        boolean flag = false;
        if (q)
        {
            a(false, false);
            flag = true;
        }
        return flag;
    }

    public void l()
    {
        x();
    }

    public String m()
    {
        return s;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        if (bundle == null)
        {
            com.fitbit.mixpanel.f.c("Social: Find Friends");
        }
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (y != null)
        {
            y.onActivityResult(i1, j1, intent);
        }
    }

    public void onCancel()
    {
        r().f();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        o = com.fitbit.savedstate.i.h();
        r = com.fitbit.friends.ui.FriendsListViewType.a;
        if (FacebookBusinessLogic.a().g())
        {
            y = com.facebook.CallbackManager.Factory.create();
            LoginManager.getInstance().registerCallback(y, this);
        }
        com.fitbit.util.i.a(android.provider.ContactsContract.Contacts.CONTENT_URI, true, d);
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
    /* block-local class not found */
    class c {}

        return new c(getActivity());
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        super.onCreateOptionsMenu(menu, menuinflater);
        menu = menu.findItem(0x7f1104de);
        if (menu != null)
        {
            ((SearchView)MenuItemCompat.getActionView(menu)).setQueryHint(getString(0x7f080400));
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (l != null)
        {
            l.removeCallbacksAndMessages(null);
            l = null;
        }
    }

    public void onError(FacebookException facebookexception)
    {
        com.fitbit.e.a.a("FindFriendsFragment", "Facebook exception: %s %s", new Object[] {
            facebookexception.getClass().getName(), facebookexception.getMessage()
        });
        if (getActivity() != null && facebookexception != null && !(facebookexception instanceof FacebookOperationCanceledException))
        {
            com.fitbit.ui.s.a(getActivity(), 0x7f0803f0, 0).i();
        }
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (a)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public boolean onMenuItemActionCollapse(MenuItem menuitem)
    {
        super.onMenuItemActionCollapse(menuitem);
        a(com.fitbit.friends.ui.FriendsListViewType.a, "");
        return true;
    }

    public boolean onMenuItemActionExpand(MenuItem menuitem)
    {
        super.onMenuItemActionExpand(menuitem);
        a(false, false);
        return true;
    }

    public void onPause()
    {
        super.onPause();
        u = false;
        LocalBroadcastManager.getInstance(getActivity()).unregisterReceiver(z);
    }

    public void onResume()
    {
        ShowProgress showprogress;
        ScanNetworkOperationBinder.WaitForFacebook waitforfacebook;
        boolean flag1;
label0:
        {
            boolean flag2 = true;
            super.onResume();
            u = true;
            boolean flag;
            if (n && y != null && com.fitbit.data.bl.FacebookBusinessLogic.FacebookFitbitState.c.equals(FacebookBusinessLogic.a().d()) || v)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (n)
            {
                flag1 = flag2;
                if (o)
                {
                    break label0;
                }
            }
            if (m)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
        }
label1:
        {
            if (v)
            {
                waitforfacebook = com.fitbit.friends.ui.ScanNetworkOperationBinder.WaitForFacebook.b;
            } else
            {
                waitforfacebook = com.fitbit.friends.ui.ScanNetworkOperationBinder.WaitForFacebook.a;
            }
            n = false;
            m = false;
            v = false;
            if (flag)
            {
                if (flag1)
                {
                    showprogress = com.fitbit.friends.ui.ShowProgress.a;
                } else
                {
                    showprogress = com.fitbit.friends.ui.ShowProgress.b;
                }
            } else
            if (flag1)
            {
                showprogress = ShowProgress.c;
            } else
            {
                showprogress = null;
            }
            if (showprogress != null && com.fitbit.ui.b.c(com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope.c))
            {
                a(showprogress, waitforfacebook);
            }
            if (o || com.fitbit.savedstate.i.j())
            {
                if (!com.fitbit.ui.b.e())
                {
                    break label1;
                }
                u();
            }
            return;
        }
        v();
    }

    public void onSuccess(Object obj)
    {
        a((LoginResult)obj);
    }

    // Unreferenced inner class com/fitbit/friends/ui/FindFriendsFragment$d
    /* block-local class not found */
    class d {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls9 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls7 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls8 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls6 {}

}
