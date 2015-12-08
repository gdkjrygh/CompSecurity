// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.github.ksoichiro.android.observablescrollview.ObservableListView;
import com.github.ksoichiro.android.observablescrollview.k;
import com.kik.android.a;
import com.kik.cache.ad;
import com.kik.g.p;
import com.kik.view.adapters.ContactsCursorAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kik.a.e.l;
import kik.a.e.n;
import kik.a.e.r;
import kik.a.e.v;
import kik.a.e.w;
import kik.android.chat.KikApplication;
import kik.android.e.d;
import kik.android.util.cq;
import kik.android.util.cv;
import kik.android.util.e;

// Referenced classes of package kik.android.chat.fragment:
//            KikPickUsersFragment, pv, pw, px, 
//            pt, pu

public class KikStartGroupFragment extends KikPickUsersFragment
    implements k, d
{
    public static final class a extends KikPickUsersFragment.a
    {

        public final KikPickUsersFragment.a a(ArrayList arraylist)
        {
            return c(arraylist);
        }

        public final a a(String s)
        {
            a("kik.android.chat.fragment.StartGroupFragment.UserBeingUpgraded", s);
            return this;
        }

        public final a c(ArrayList arraylist)
        {
            a("kik.android.chat.fragment.StartGroupFragment.PreselectedUsers", arraylist);
            return this;
        }

        public final ArrayList d()
        {
            return m("kik.android.chat.fragment.StartGroupFragment.PreselectedUsers");
        }

        public final a e()
        {
            a("kik.android.chat.fragment.StartGroupFragment.IsFromTalkTo", true);
            return this;
        }

        public final boolean f()
        {
            return f("kik.android.chat.fragment.StartGroupFragment.IsFromTalkTo").booleanValue();
        }

        public final String g()
        {
            return g("kik.android.chat.fragment.StartGroupFragment.UserBeingUpgraded");
        }

        public a()
        {
        }
    }


    private static boolean ab = false;
    protected ad O;
    r U;
    l V;
    w W;
    v X;
    com.kik.android.a Y;
    kik.a.f.k Z;
    Button _createGroupButton;
    ImageView _groupContactView;
    EditText _groupNameEditText;
    TextView _numGroupMembersText;
    ViewGroup _rootLayout;
    n aa;
    private Set ac;
    private String ad;
    private String ae;
    private boolean af;
    private boolean ag;
    private int ah;
    private a ai;
    private View aj;
    private View ak;
    private kik.a.d.k al;
    private kik.a.d.n am;
    Button createButton;
    View groupHeader;
    ImageView groupNameClearButton;
    ViewGroup searchButton;

    public KikStartGroupFragment()
    {
        ac = new HashSet();
        ae = null;
        af = false;
        ag = false;
        ah = 0;
        ai = new a();
    }

    private android.view.View.OnFocusChangeListener a(EditText edittext, View view)
    {
        return new pv(this, edittext, view);
    }

    static Set a(KikStartGroupFragment kikstartgroupfragment)
    {
        return kikstartgroupfragment.ac;
    }

    static kik.a.d.n a(KikStartGroupFragment kikstartgroupfragment, kik.a.d.n n)
    {
        kikstartgroupfragment.am = n;
        return n;
    }

    private void a(kik.a.d.n n)
    {
        a(((kik.android.util.an) ((new KikChatFragment.a()).a(n))));
    }

    private boolean ad()
    {
        return ac.size() > 0;
    }

    private void ae()
    {
        if (ac.size() == 0)
        {
            _numGroupMembersText.setText(KikApplication.a(0x7f090194, new Object[] {
                Integer.valueOf(50)
            }));
        } else
        {
            _numGroupMembersText.setText(KikApplication.a(0x7f09011e, new Object[] {
                Integer.valueOf(ac.size() + 1), Integer.valueOf(50)
            }));
        }
        _createGroupButton.setEnabled(ad());
    }

    static void b(KikStartGroupFragment kikstartgroupfragment, kik.a.d.n n)
    {
        kikstartgroupfragment.a(n);
    }

    static boolean b(KikStartGroupFragment kikstartgroupfragment)
    {
        return kikstartgroupfragment.ag;
    }

    static kik.a.d.n c(KikStartGroupFragment kikstartgroupfragment)
    {
        return kikstartgroupfragment.am;
    }

    protected final int K()
    {
        return 0x7f09030d;
    }

    protected final boolean Q()
    {
        return false;
    }

    protected final boolean S()
    {
        return false;
    }

    protected final int T()
    {
        return 0x7f020188;
    }

    protected final String Z()
    {
        return null;
    }

    public final void a(Bitmap bitmap)
    {
        Y.b("Group Photo Changed").a("Was Empty", true).a("From Camera", ab).a("Width", bitmap.getWidth()).b();
        X.a(e.a(bitmap), am);
        a(am);
        U.j();
    }

    public final void b(kik.a.d.k k1)
    {
        super.b(k1);
        ac.add(k1);
        ae();
    }

    public final void c(kik.a.d.k k1)
    {
        super.c(k1);
        ac.remove(k1);
        ae();
    }

    public void clearComposeTo()
    {
        l();
        a(s);
    }

    public void clearGroupName()
    {
        _groupNameEditText.setText("");
    }

    protected final String h()
    {
        return KikApplication.f(0x7f0900e0);
    }

    void handleGroupCreate()
    {
        if (!ad())
        {
            a(KikApplication.f(0x7f090115), KikApplication.f(0x7f0901cf));
            return;
        }
        String s = _groupNameEditText.getText().toString();
        com.kik.android.a.f f = Y.b("Group Create Attempt");
        kik.a.d.k k1;
        long l1;
        if (s == null)
        {
            l1 = 0L;
        } else
        {
            l1 = s.length();
        }
        f.a("Name Length", l1).a("Has Picture", ag).a("Participants Count", ac.size() + 1).b();
        b(KikApplication.f(0x7f090148), false);
        if (ae != null)
        {
            Object obj = U.b(ae);
            boolean flag;
            if (obj != null && !ac.contains(obj))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                obj = null;
            }
            k1 = ((kik.a.d.k) (obj));
            if (obj != null)
            {
                ac.remove(obj);
                k1 = ((kik.a.d.k) (obj));
            }
        } else
        {
            k1 = null;
        }
        obj = new ArrayList(ac);
        V.a(s, k1, ((java.util.List) (obj))).a(new pw(this, s, ((java.util.List) (obj)), this));
    }

    public final void j_()
    {
        View view = c.getChildAt(0);
        int i = -view.getTop();
        int j = c.getFirstVisiblePosition();
        float f = -(view.getHeight() * j + i);
        f = Math.min(0.0F, Math.max(-ak.getHeight(), f));
        aj.animate().cancel();
        aj.setTranslationY(f);
    }

    public final void k_()
    {
        if (_rootLayout == null)
        {
            return;
        } else
        {
            a((new KikDialogFragment.a(_rootLayout.getResources())).a(KikApplication.f(0x7f090337)).b(KikApplication.f(0x7f09001f)).b(true).a(0x7f090193, new px(this)).a, KikScopedDialogFragment.a.b, "build");
            Y.b("Group Photo Change Error").b();
            return;
        }
    }

    protected final void l()
    {
        if (b != null)
        {
            b = "";
            A = true;
            s.setText("");
        }
        a(b, true);
        s.requestFocus();
        if (c != null)
        {
            c.setSelectionFromTop(c.getHeaderViewsCount(), KikApplication.a(113));
        }
    }

    protected final boolean m()
    {
        return D != null && !D.isEmpty();
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        boolean flag;
        flag = true;
        KikPreferenceLaunchpad.b.b();
        if (i != 10334 && i != 10335 || j != -1) goto _L2; else goto _L1
_L1:
        if (i != 10334)
        {
            flag = false;
        }
        ab = flag;
        if (!kik.android.util.p.a().a(this, getActivity(), i, intent, aa))
        {
            kik.android.util.p.a();
            d(-4);
        }
_L4:
        B = false;
        return;
_L2:
        if (i != 10336 || j != -1)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        intent = new kik.android.widget.p(kik.android.util.p.a().e());
        _groupContactView.setImageDrawable(intent);
        ag = true;
        kik.android.util.p.a().g();
        continue; /* Loop/switch isn't completed */
        intent;
        kik.android.util.p.a().g();
        throw intent;
        kik.android.util.p.a().g();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        ae();
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 0: // '\0'
            menuitem = (android.widget.AdapterView.AdapterContextMenuInfo)menuitem.getMenuInfo();
            break;
        }
        menuitem = (Cursor)c.getItemAtPosition(((android.widget.AdapterView.AdapterContextMenuInfo) (menuitem)).position);
        if (menuitem != null)
        {
            menuitem = menuitem.getString(menuitem.getColumnIndex("suggest_intent_data_id"));
            e(U.a(menuitem, true));
        }
        return true;
    }

    public void onCreate(Bundle bundle)
    {
        V().a(this);
        super.onCreate(bundle);
        ai.a(getArguments());
        ae = ai.g();
        bundle = ai.m("kik.android.chat.fragment.StartGroupFragment.PreselectedUsers");
        if (bundle != null)
        {
            Object obj;
            for (bundle = bundle.iterator(); bundle.hasNext(); ac.add(obj))
            {
                obj = (String)bundle.next();
                obj = U.a(((String) (obj)), true);
            }

        }
        af = ai.f();
        bundle = ai;
        Object obj1 = ac;
        ArrayList arraylist = new ArrayList(((Collection) (obj1)).size());
        for (obj1 = ((Collection) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); arraylist.add(((kik.a.d.k)((Iterator) (obj1)).next()).e())) { }
        bundle.a("KikPickUsersFragment.EXTRA_PRESELECTED_USERS", arraylist);
        bundle.c(49);
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        super.onCreateContextMenu(contextmenu, view, contextmenuinfo);
        if (view == _groupNameEditText)
        {
            al = null;
        }
        if (al != null)
        {
            contextmenu.setHeaderTitle(cq.a(al));
            contextmenu.add(0, 0, 0, 0x7f0901f9);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = super.onCreateView(layoutinflater, viewgroup, bundle);
        ButterKnife.inject(this, viewgroup);
        registerForContextMenu(_groupNameEditText);
        com.kik.m.d.a(_groupNameEditText, "AUTOMATION_CREATE_GROUP_NAME");
        com.kik.m.d.a(_createGroupButton, "AUTOMATION_CREATE_GROUP");
        com.kik.m.d.a(_numGroupMembersText, "AUTOMATION_GROUP_MEMBER_COUNT_LABEL");
        if (!cq.c(ad))
        {
            _groupNameEditText.setText(ad);
        }
        cv.e(new View[] {
            searchButton
        });
        cv.b(new View[] {
            createButton, groupHeader
        });
        aj = viewgroup.findViewById(0x7f0e006c);
        ak = viewgroup.findViewById(0x7f0e006e);
        ((ObservableListView)c).a(this);
        c.addHeaderView(layoutinflater.inflate(0x7f030052, c, false));
        d = (FrameLayout)layoutinflater.inflate(0x7f03002c, c, false);
        c.addFooterView(d);
        m = viewgroup.findViewById(0x7f0e0075);
        s.setOnFocusChangeListener(a(s, m));
        _groupNameEditText.addTextChangedListener(new pt(this));
        _groupNameEditText.setOnFocusChangeListener(a(_groupNameEditText, groupNameClearButton));
        s.addTextChangedListener(new pu(this));
        layoutinflater = kik.android.util.p.a().e();
        if (ag && layoutinflater != null)
        {
            layoutinflater = new kik.android.widget.p(layoutinflater);
            _groupContactView.setImageDrawable(layoutinflater);
        }
        a(_groupNameEditText, 2);
        ac.size();
        ae();
        return viewgroup;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ad = _groupNameEditText.getText().toString();
    }

    public void setGroupPicture()
    {
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        kik.android.chat.fragment.KikPreferenceLaunchpad.b.a();
        kik.android.util.p.a().a(this, fragmentactivity);
    }

    public final boolean v()
    {
        kik.android.util.p.a().h();
        String s = _groupNameEditText.getText().toString();
        com.kik.android.a.f f = Y.b("Start a Group Cancelled");
        long l1;
        if (s == null)
        {
            l1 = 0L;
        } else
        {
            l1 = s.length();
        }
        f.a("Name Length", l1).a("Has Picture", ag).a("Participants Count", ac.size() + 1).b();
        if (af)
        {
            kik.android.chat.activity.k.a(new KikConversationsFragment.a(), getActivity()).a().f();
            return true;
        } else
        {
            return super.v();
        }
    }

}
