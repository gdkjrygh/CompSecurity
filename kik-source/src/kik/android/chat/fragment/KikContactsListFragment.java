// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Point;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.text.Html;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.kik.cache.ad;
import com.kik.e.a;
import com.kik.g.f;
import com.kik.g.i;
import com.kik.g.l;
import com.kik.g.p;
import com.kik.sdkutils.d;
import com.kik.view.adapters.ContactsCursorAdapter;
import com.kik.view.adapters.bd;
import com.kik.view.adapters.k;
import com.kik.view.adapters.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kik.a.e.r;
import kik.a.h.j;
import kik.android.KikDataProvider;
import kik.android.a.b;
import kik.android.chat.KikApplication;
import kik.android.sdkutils.concurrent.c;
import kik.android.util.ck;
import kik.android.util.cv;

// Referenced classes of package kik.android.chat.fragment:
//            KikIqFragmentBase, jf, jg, ji, 
//            jk, jl, ProgressDialogFragment, jm, 
//            je

public abstract class KikContactsListFragment extends KikIqFragmentBase
    implements u
{
    public static class a extends com.kik.ui.fragment.FragmentBase.a
    {

        static long a(a a1)
        {
            return a1.j("KikContactsListFragment.EXTRA_DEPENDENT_PROMISE");
        }

        public final a a(long l1)
        {
            a("KikContactsListFragment.EXTRA_DEPENDENT_PROMISE", l1);
            return this;
        }

        public a()
        {
        }
    }


    protected boolean A;
    protected boolean B;
    protected LinkedHashSet C;
    protected ContactsCursorAdapter D;
    protected Map E;
    protected a F;
    protected kik.a.e.l G;
    protected r H;
    protected ck I;
    protected com.kik.android.a J;
    protected ad K;
    private String L;
    private String M;
    private boolean N;
    private f O;
    private long U;
    private boolean V;
    private String W;
    private boolean X;
    private k Y;
    private ContactsCursorAdapter Z;
    private String a;
    private com.kik.view.adapters.a aa;
    private bd ab;
    private String ac;
    private String ad;
    private String ae;
    private com.kik.g.r af;
    private android.support.v4.app.LoaderManager.LoaderCallbacks ag;
    private i ah;
    private i ai;
    private i aj;
    protected String b;
    protected ListView c;
    protected FrameLayout d;
    protected LinearLayout e;
    protected Uri f;
    protected View g;
    protected View h;
    protected View i;
    protected View j;
    protected View k;
    protected View l;
    protected View m;
    protected TextView n;
    protected AnimationDrawable o;
    protected TextView p;
    protected TextView q;
    protected TextView r;
    protected EditText s;
    protected LinearLayout t;
    protected c x;
    protected kik.android.sdkutils.concurrent.d y;
    protected ArrayList z;

    public KikContactsListFragment()
    {
        b = "";
        f = KikDataProvider.a;
        z = new ArrayList();
        a = "";
        N = false;
        O = new f();
        V = false;
        A = false;
        B = true;
        W = "";
        X = false;
        C = new LinkedHashSet();
        E = new LinkedHashMap();
        F = new a();
        af = new jf(this);
        ag = new jg(this);
        ah = new ji(this);
        ai = new jk(this);
        aj = new jl(this);
    }

    static ContactsCursorAdapter a(KikContactsListFragment kikcontactslistfragment, ContactsCursorAdapter contactscursoradapter)
    {
        kikcontactslistfragment.Z = contactscursoradapter;
        return contactscursoradapter;
    }

    static com.kik.view.adapters.a a(KikContactsListFragment kikcontactslistfragment, com.kik.view.adapters.a a1)
    {
        kikcontactslistfragment.aa = a1;
        return a1;
    }

    static bd a(KikContactsListFragment kikcontactslistfragment, bd bd)
    {
        kikcontactslistfragment.ab = bd;
        return bd;
    }

    static void a(KikContactsListFragment kikcontactslistfragment)
    {
        kikcontactslistfragment.d();
    }

    static void a(KikContactsListFragment kikcontactslistfragment, String s1)
    {
        KikApplication.i().c().a(com.kik.d.b.a.k.x, "s", 0L, kik.a.h.j.b());
        if (s1.matches(KikApplication.f(0x7f0901ee)))
        {
            if (kikcontactslistfragment.z.contains(s1.toLowerCase()))
            {
                kikcontactslistfragment.X = true;
                kikcontactslistfragment.x.c();
                cv.e(new View[] {
                    kikcontactslistfragment.n, kikcontactslistfragment.g
                });
                cv.b(new View[] {
                    kikcontactslistfragment.j
                });
                kikcontactslistfragment.z();
                return;
            }
            kikcontactslistfragment.X = false;
            if (kikcontactslistfragment.g.getVisibility() != 0)
            {
                kikcontactslistfragment.g.setVisibility(0);
                kikcontactslistfragment.o.stop();
                kikcontactslistfragment.o.start();
            }
            kikcontactslistfragment.V = true;
            kikcontactslistfragment.x.c();
            kikcontactslistfragment.x.a(s1);
            kikcontactslistfragment.x.b().a(com.kik.sdkutils.d.a(kikcontactslistfragment.c, kikcontactslistfragment.af));
            return;
        } else
        {
            kikcontactslistfragment.X = true;
            kikcontactslistfragment.x.c();
            kikcontactslistfragment.g.setVisibility(8);
            kikcontactslistfragment.i.setVisibility(0);
            kikcontactslistfragment.z();
            return;
        }
    }

    static boolean b(KikContactsListFragment kikcontactslistfragment)
    {
        kikcontactslistfragment.V = false;
        return false;
    }

    static boolean c(KikContactsListFragment kikcontactslistfragment)
    {
        return kikcontactslistfragment.X;
    }

    static String d(KikContactsListFragment kikcontactslistfragment)
    {
        return kikcontactslistfragment.M;
    }

    private void d()
    {
        int i1 = ((KikApplication)getActivity().getApplication()).m().a(U);
        if (i1 != 0 && (i1 == com.kik.g.p.a.d || i1 == com.kik.g.p.a.c))
        {
            J();
        }
    }

    static String e(KikContactsListFragment kikcontactslistfragment)
    {
        return kikcontactslistfragment.ae;
    }

    static String f(KikContactsListFragment kikcontactslistfragment)
    {
        return kikcontactslistfragment.L;
    }

    static com.kik.view.adapters.a g(KikContactsListFragment kikcontactslistfragment)
    {
        return kikcontactslistfragment.aa;
    }

    static k h(KikContactsListFragment kikcontactslistfragment)
    {
        return kikcontactslistfragment.Y;
    }

    static bd i(KikContactsListFragment kikcontactslistfragment)
    {
        return kikcontactslistfragment.ab;
    }

    static boolean j(KikContactsListFragment kikcontactslistfragment)
    {
        return kikcontactslistfragment.N;
    }

    static ContactsCursorAdapter k(KikContactsListFragment kikcontactslistfragment)
    {
        return kikcontactslistfragment.Z;
    }

    static String l(KikContactsListFragment kikcontactslistfragment)
    {
        return kikcontactslistfragment.ac;
    }

    static String m(KikContactsListFragment kikcontactslistfragment)
    {
        return kikcontactslistfragment.a;
    }

    static boolean n(KikContactsListFragment kikcontactslistfragment)
    {
        kikcontactslistfragment.X = true;
        return true;
    }

    static String o(KikContactsListFragment kikcontactslistfragment)
    {
        return kikcontactslistfragment.ad;
    }

    protected static int q()
    {
        return 0x7f020161;
    }

    protected static int r()
    {
        return 0x7f020163;
    }

    protected int C()
    {
        return 32;
    }

    protected boolean Q()
    {
        return true;
    }

    protected abstract String R();

    protected abstract String a();

    protected final void a(Uri uri)
    {
        f = uri;
    }

    protected final void a(f f1)
    {
        super.a(f1);
        f1.a(H.d(), ai);
        f1.a(G.d(), ai);
    }

    protected void a(String s1)
    {
        KikChatInfoFragment.a a1 = new KikChatInfoFragment.a();
        a1.d(s1).b(1).a(F.h());
        a(((kik.android.util.an) (a1)));
    }

    protected void a(String s1, boolean flag)
    {
        String s4 = s1.trim();
        M = s4.toLowerCase();
        String s5 = TextUtils.htmlEncode(M).replaceAll(" ", "&nbsp;");
        String s2;
        String s3;
        if (j())
        {
            s2 = W;
        } else
        {
            s2 = "";
        }
        if (s4 != null)
        {
            s3 = (new StringBuilder("/")).append(Uri.encode(s4)).toString();
        } else
        {
            s3 = "";
        }
        ae = (new StringBuilder()).append(s2).append(s3).toString();
        r.setText(Html.fromHtml(String.format(KikApplication.f(0x7f09010c), new Object[] {
            s5
        })));
        q.setText(Html.fromHtml(String.format(KikApplication.f(0x7f09010b), new Object[] {
            s5
        })));
        k.setTag(M);
        x.c();
        ac = s4;
        ad = s1;
        getLoaderManager().restartLoader(1, null, ag);
        if (g())
        {
            getLoaderManager().restartLoader(0, null, ag);
        }
    }

    protected final void a(ArrayList arraylist)
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s1;
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); stringbuilder.append((new StringBuilder()).append(s1).append(";").toString()))
        {
            s1 = (String)arraylist.next();
            z.add(s1.toLowerCase());
        }

        W = stringbuilder.toString();
    }

    public boolean a(Cursor cursor)
    {
        return false;
    }

    protected final void b(f f1)
    {
        super.b(f1);
        f1.a(H.d(), aj);
        f1.a(G.d(), aj);
        f1.a(H.a(), ah);
    }

    protected void b(String s1)
    {
        a = s1;
    }

    protected final void b(String s1, boolean flag)
    {
        a(new ProgressDialogFragment(s1, flag));
    }

    public boolean b()
    {
        return false;
    }

    protected abstract String c();

    protected final void c(String s1)
    {
        KikChatFragment.a a1 = new KikChatFragment.a();
        a1.a(s1).a(u()).a(F.h());
        a(a1).a(new jm(this));
    }

    protected final void d(String s1)
    {
        b = s1;
    }

    protected void e()
    {
        KikApplication.i().c().a(com.kik.d.b.a.k.y, kik.a.h.j.b());
    }

    protected abstract boolean g();

    protected abstract String h();

    protected abstract boolean i();

    protected abstract boolean j();

    protected boolean k()
    {
        return true;
    }

    protected boolean m()
    {
        return true;
    }

    protected boolean n()
    {
        return false;
    }

    protected boolean o()
    {
        return false;
    }

    public void onCreate(Bundle bundle)
    {
        V().a(this);
        super.onCreate(bundle);
        if (bundle != null)
        {
            b = bundle.getString("kik.contacts.current_filter");
        }
        Y = new k(getActivity().getApplicationContext());
        L = KikApplication.f(0x7f0901e7);
        F.a(getArguments());
        if (kik.android.chat.fragment.a.a(F) > -1L)
        {
            U = kik.android.chat.fragment.a.a(F);
            d();
            O.a(((KikApplication)getActivity().getApplication()).m().a(), new je(this));
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
        O.a();
    }

    public void onResume()
    {
        super.onResume();
        a(b, false);
        if (I.b(kik.android.util.ck.b.c))
        {
            ArrayList arraylist = new ArrayList();
            for (Iterator iterator = I.c(kik.android.util.ck.b.c).iterator(); iterator.hasNext(); arraylist.add(((kik.a.d.k)iterator.next()).e())) { }
            J.b("Premium Promoted Chat View").a("Bots", arraylist.toArray()).b();
            return;
        } else
        {
            J.b("Premium Promoted Chat Slow Response").b();
            return;
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (b != null)
        {
            bundle.putString("kik.contacts.current_filter", b);
        }
    }

    protected final void p()
    {
        N = true;
    }

    protected final void s()
    {
        int i1 = c.getCount();
        int j1 = (int)c.getResources().getDimension(0x7f0d0023);
        Display display = getActivity().getWindowManager().getDefaultDisplay();
        Point point = new Point();
        display.getSize(point);
        i1 = Math.max(point.y - i1 * j1 - KikApplication.a(18), 0);
        if (d != null)
        {
            android.view.ViewGroup.LayoutParams layoutparams = d.getLayoutParams();
            layoutparams.height = i1;
            d.setLayoutParams(layoutparams);
            c.invalidate();
        }
    }

    protected final void t()
    {
        cv.e(new View[] {
            n, h, i, j, k, g
        });
    }

    protected boolean u()
    {
        return false;
    }

    protected final void w()
    {
        a(((KikDialogFragment) (null)));
    }

    protected boolean x()
    {
        return false;
    }

    protected final void z()
    {
        t.invalidate();
        t.requestLayout();
    }
}
