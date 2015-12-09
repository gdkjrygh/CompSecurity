// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.challenges.ui;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v4.content.LocalBroadcastManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.fitbit.data.bl.cw;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.RankedUser;
import com.fitbit.data.domain.challenges.ChallengeType;
import com.fitbit.savedstate.LoadSavedState;
import com.fitbit.savedstate.e;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.ui.b;
import com.fitbit.util.f;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.fitbit.challenges.ui:
//            ChallengeStateSupportFragment, AddPlayersFragment_, OutOfBoundsDialogFragment, PlayerItemView

public class AddPlayersFragment extends ChallengeStateSupportFragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, android.widget.AdapterView.OnItemClickListener, PlayerItemView.a
{

    public static final String a = "com.fitbit.challenges.ui.AddPlayersFragment.ADDED_PLAYERS_ENCODED_IDS_EXTRA";
    public static final String b = "com.fitbit.challenges.ui.AddPlayersFragment.START_ACTION";
    private static final String m = "DIALOG_OUT_OF_BOUND";
    private boolean A;
    private d B;
    protected String c;
    protected String d;
    protected int e;
    protected int f;
    protected ArrayList g;
    protected ArrayList h;
    protected Date i;
    protected ListView j;
    protected View k;
    b l;
    private Set n;
    private PlayerItemView o;
    private TextView p;
    private View q;
    private a r;
    private BroadcastReceiver s;
    private boolean x;
    private boolean y;
    private ServerCommunicationException z;

    public AddPlayersFragment()
    {
    /* block-local class not found */
    class a {}

        r = new a(null);
        s = new _cls1();
        x = true;
        y = false;
        A = false;
    }

    static d a(AddPlayersFragment addplayersfragment, d d1)
    {
        addplayersfragment.B = d1;
        return d1;
    }

    public static AddPlayersFragment a(ChallengeType challengetype, Date date)
    {
        return com.fitbit.challenges.ui.AddPlayersFragment_.f().b(challengetype.f()).b(challengetype.k()).a(challengetype.j()).a(date).a();
    }

    public static AddPlayersFragment a(String s1, ArrayList arraylist, ArrayList arraylist1, int i1, int j1)
    {
        return com.fitbit.challenges.ui.AddPlayersFragment_.f().a(s1).b(arraylist).a(arraylist1).b(i1).a(j1).a();
    }

    static Set a(AddPlayersFragment addplayersfragment)
    {
        return addplayersfragment.n;
    }

    static boolean a(AddPlayersFragment addplayersfragment, String s1)
    {
        return addplayersfragment.a(s1);
    }

    static boolean a(AddPlayersFragment addplayersfragment, boolean flag)
    {
        addplayersfragment.A = flag;
        return flag;
    }

    private boolean a(String s1)
    {
        while (s1 == null || g == null || h == null || !g.contains(s1) && !h.contains(s1)) 
        {
            return false;
        }
        return true;
    }

    static boolean b(AddPlayersFragment addplayersfragment)
    {
        return addplayersfragment.y;
    }

    static boolean b(AddPlayersFragment addplayersfragment, boolean flag)
    {
        addplayersfragment.y = flag;
        return flag;
    }

    static void c(AddPlayersFragment addplayersfragment)
    {
        addplayersfragment.f();
    }

    static int d(AddPlayersFragment addplayersfragment)
    {
        return addplayersfragment.l();
    }

    static boolean e(AddPlayersFragment addplayersfragment)
    {
        return addplayersfragment.x;
    }

    static PlayerItemView f(AddPlayersFragment addplayersfragment)
    {
        return addplayersfragment.o;
    }

    private void f()
    {
        getLoaderManager().restartLoader(221, new Bundle(), this);
        (new _cls2(getActivity(), 221)).a(cw.a(getActivity(), false));
    }

    private boolean g()
    {
        boolean flag2 = false;
        int i1 = h();
        boolean flag;
        boolean flag1;
        if (i1 < e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i1 > f && x && com.fitbit.savedstate.e.d(c))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag || flag1)
        {
            if (flag1)
            {
                x = false;
                com.fitbit.savedstate.e.c(c);
            }
            OutOfBoundsDialogFragment.BoundType boundtype;
            if (flag)
            {
                boundtype = OutOfBoundsDialogFragment.BoundType.a;
            } else
            {
                boundtype = com.fitbit.challenges.ui.OutOfBoundsDialogFragment.BoundType.b;
            }
            OutOfBoundsDialogFragment.a(boundtype, f, e, r).show(getFragmentManager(), "DIALOG_OUT_OF_BOUND");
            flag2 = true;
        }
        return flag2;
    }

    private int h()
    {
        return i() + l();
    }

    private int i()
    {
        if (h != null)
        {
            return h.size();
        } else
        {
            return 0;
        }
    }

    private int l()
    {
        if (n != null)
        {
            return n.size();
        } else
        {
            return 0;
        }
    }

    protected void a()
    {
        com.fitbit.ui.b.e(com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope.c);
    }

    public void a(Loader loader, c c1)
    {
        boolean flag1 = true;
        if (z == null) goto _L2; else goto _L1
_L1:
        b(false);
        b(z);
_L5:
        getActivity().invalidateOptionsMenu();
        return;
_L2:
    /* block-local class not found */
    class c {}

        boolean flag;
    /* block-local class not found */
    class b {}

        if (!A)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b(flag);
        l.clear();
        l.addAll(c1.a);
        if (!b.a(l) && !c1.b.isEmpty()) goto _L4; else goto _L3
_L3:
        j.removeFooterView(p);
        p = null;
        l.addAll(c1.b);
_L6:
        l.notifyDataSetChanged();
        if (A && l.isEmpty())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        d(flag);
        c(A);
        if (k.getVisibility() != 0)
        {
            k.setVisibility(0);
            k.setAnimation(AnimationUtils.loadAnimation(getActivity(), 0x7f050009));
        }
        if (true) goto _L5; else goto _L4
_L4:
        if (p == null)
        {
            j.removeFooterView(q);
            p = (TextView)LayoutInflater.from(j.getContext()).inflate(0x7f04019e, j, false);
            p.setText(0x7f080348);
            j.addFooterView(p, c1.b, true);
            j.addFooterView(q);
        }
          goto _L6
    }

    public void a(PlayerItemView playeritemview)
    {
        String s1 = playeritemview.b().F();
        if (!a(s1))
        {
            n.add(s1);
        }
        o = playeritemview;
        g();
    }

    protected void b()
    {
        if (c == null && d == null)
        {
            throw new RuntimeException("Missing both challengeId and challengeType");
        }
        q = LayoutInflater.from(j.getContext()).inflate(0x7f04011b, j, false);
        j.addFooterView(q);
        Object obj = j;
        b b1 = new b();
        l = b1;
        ((ListView) (obj)).setAdapter(b1);
        j.setOnItemClickListener(this);
        b(true);
        n = new HashSet();
        obj = (OutOfBoundsDialogFragment)getFragmentManager().findFragmentByTag("DIALOG_OUT_OF_BOUND");
        if (obj != null)
        {
            ((OutOfBoundsDialogFragment) (obj)).a(r);
        }
    }

    public void b(PlayerItemView playeritemview)
    {
        playeritemview = playeritemview.b().F();
        n.remove(playeritemview);
    }

    protected com.fitbit.savedstate.LoadSavedState.Status c()
    {
        if (a(z))
        {
            return com.fitbit.savedstate.LoadSavedState.Status.c;
        }
        if (k())
        {
            return LoadSavedState.a(com.fitbit.savedstate.LoadSavedState.DataType.c);
        } else
        {
            return com.fitbit.savedstate.LoadSavedState.Status.a;
        }
    }

    protected void d()
    {
        if (!g())
        {
            e();
        }
    }

    public void e()
    {
        y = true;
        getActivity().invalidateOptionsMenu();
        l.notifyDataSetChanged();
        b(true);
        v.setVisibility(0);
    /* block-local class not found */
    class d {}

        d d1 = new d(getActivity());
        B = d1;
        com.fitbit.util.f.a(d1);
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        b(true);
        return new _cls3(getActivity());
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        adapterview = ((AdapterView) (adapterview.getItemAtPosition(i1)));
        if (adapterview instanceof List)
        {
            b.a(l, true);
            p = null;
            j.removeFooterView(view);
            l.addAll((List)adapterview);
            l.notifyDataSetChanged();
        }
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (c)obj);
    }

    public void onLoaderReset(Loader loader)
    {
        c(false);
    }

    public void onPause()
    {
        super.onPause();
        LocalBroadcastManager.getInstance(getActivity()).unregisterReceiver(s);
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        boolean flag1 = true;
        MenuItem menuitem = menu.findItem(0x7f1104d2);
        boolean flag;
        boolean flag2;
        if (B != null && a(B.a()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag2 = ServerGateway.a().d();
        if (!k() || flag || y || !flag2)
        {
            flag1 = false;
        }
        menuitem.setEnabled(flag1);
        super.onPrepareOptionsMenu(menu);
    }

    public void onResume()
    {
        super.onResume();
        LocalBroadcastManager localbroadcastmanager = LocalBroadcastManager.getInstance(getActivity());
        IntentFilter intentfilter = new IntentFilter("com.fitbit.FitbitMobile.ChinaConfirmationDialogController.CONTACTS_ACTION_PERMISSION_RESPONSE");
        localbroadcastmanager.registerReceiver(s, intentfilter);
        com.fitbit.ui.b.e(com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope.c);
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}

}
