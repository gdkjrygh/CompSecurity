// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;
import com.kik.cards.util.UserDataParcelable;
import com.kik.e.a;
import com.kik.g.p;
import com.kik.sdkutils.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Vector;
import kik.a.d.aa;
import kik.a.d.k;
import kik.a.e.r;
import kik.a.e.w;
import kik.android.chat.KikApplication;

// Referenced classes of package kik.android.chat.fragment:
//            KikMultiselectContactsListFragment, no, np

public class KikPickUsersFragment extends KikMultiselectContactsListFragment
{
    public static class a extends KikContactsListFragment.a
    {

        public final int a()
        {
            return b("KikPickUsersFragment.EXTRA_MIN_RESULTS", 1);
        }

        public a a(ArrayList arraylist)
        {
            a("KikPickUsersFragment.EXTRA_PRESELECTED_USERS", arraylist);
            return this;
        }

        public final a a(boolean flag)
        {
            a("KikPickUsersFragment.EXTRA_FILTER_SELF", flag);
            return this;
        }

        public final int b()
        {
            return b("KikPickUsersFragment.EXTRA_MAX_RESULTS", b("KikPickUsersFragment.EXTRA_MIN_RESULTS", 1));
        }

        public final a b(int l)
        {
            a("KikPickUsersFragment.EXTRA_MIN_RESULTS", l);
            return this;
        }

        public final a b(ArrayList arraylist)
        {
            a("KikPickUsersFragment.EXTRA_FILTERED_USERS", arraylist);
            return this;
        }

        public final a c(int l)
        {
            a("KikPickUsersFragment.EXTRA_MAX_RESULTS", l);
            return this;
        }

        public final boolean c()
        {
            return b("KikPickUsersFragment.EXTRA_FILTER_SELF", true).booleanValue();
        }

        public ArrayList d()
        {
            return m("KikPickUsersFragment.EXTRA_PRESELECTED_USERS");
        }

        public a()
        {
        }
    }


    protected w N;
    private int O;
    private int U;
    private List V;
    private List W;
    private boolean X;
    private a Y;
    private boolean Z;

    public KikPickUsersFragment()
    {
        V = new ArrayList();
        W = new ArrayList();
        X = true;
        Y = new a();
        Z = false;
    }

    private void ad()
    {
        if (d().size() + V.size() >= O)
        {
            d(true);
            return;
        } else
        {
            d(false);
            return;
        }
    }

    protected final int C()
    {
        return 16;
    }

    protected final String R()
    {
        return getString(0x7f090014);
    }

    protected final void Y()
    {
        Object obj;
        if (d().size() + V.size() >= O)
        {
            obj = new Bundle();
            UserDataParcelable auserdataparcelable[] = new UserDataParcelable[d().size() + V.size()];
            Iterator iterator = V.iterator();
            int l;
            for (l = 0; iterator.hasNext(); l++)
            {
                auserdataparcelable[l] = new UserDataParcelable((String)iterator.next(), null, null);
            }

            for (Iterator iterator1 = d().iterator(); iterator1.hasNext();)
            {
                Object obj1 = (String)iterator1.next();
                obj1 = H.a(((String) (obj1)), true);
                auserdataparcelable[l] = new UserDataParcelable(((k) (obj1)).e(), ((k) (obj1)).c(), ((k) (obj1)).r());
                l++;
            }

            ((Bundle) (obj)).putParcelableArray("KikPickUsersFragment.RESULT_SELECTED_USERS", auserdataparcelable);
        } else
        {
            obj = new KikDialogFragment.a(getResources());
            ((KikDialogFragment.a) (obj)).b(getString(0x7f090228, new Object[] {
                Integer.valueOf(O)
            })).a(Z()).a(0x7f090193, null);
            a(((KikDialogFragment.a) (obj)).a, KikScopedDialogFragment.a.b, "confirmationDialog");
            obj = null;
        }
        if (obj != null)
        {
            a(((Bundle) (obj)));
            J();
        }
    }

    protected String Z()
    {
        if (Z)
        {
            return KikApplication.f(0x7f090224);
        } else
        {
            return KikApplication.f(0x7f090225);
        }
    }

    protected final String a()
    {
        return null;
    }

    protected final void a(String s, k k1)
    {
        V.remove(s);
        d().add(k1.b());
        super.a(s, k1);
    }

    protected final void a(k k1)
    {
        super.a(k1);
        if (Z && d().size() + V.size() > 0)
        {
            Y();
            return;
        } else
        {
            c(true);
            b(true);
            ad();
            return;
        }
    }

    protected final void a(k k1, com.kik.view.adapters.ContactsCursorAdapter.a a1, Cursor cursor, int l)
    {
        if (d().size() + V.size() < U || d().contains(k1.b()) || U == -1)
        {
            super.a(k1, a1, cursor, l);
            if (b != null && !b.equals(""))
            {
                l();
            }
        } else
        if (d().size() + V.size() >= U)
        {
            a1 = getActivity();
            if (U == 1)
            {
                k1 = getActivity().getResources().getString(0x7f090329);
            } else
            {
                k1 = String.format(getActivity().getResources().getString(0x7f09032b), new Object[] {
                    Integer.valueOf(U)
                });
            }
            Toast.makeText(a1, k1, 0).show();
            return;
        }
    }

    protected final String aa()
    {
        return getString(0x7f0902ab);
    }

    protected final void b(Bundle bundle)
    {
        Y.a(bundle);
        O = Y.a();
        U = Y.b();
        X = Y.c();
        bundle = Y.d();
        ArrayList arraylist = Y.m("KikPickUsersFragment.EXTRA_FILTERED_USERS");
        if (U == 1)
        {
            Z = true;
            f();
        }
        if (X)
        {
            W.add(N.d().c);
        }
        if (arraylist != null && arraylist.size() > 0)
        {
            W.addAll(arraylist);
        }
        if (bundle != null && U != 1 && (W == null || W.size() == 0 || X))
        {
            V.addAll(bundle);
        }
        if (W.size() > 0)
        {
            V.removeAll(W);
            a((ArrayList)W);
        }
        bundle = new Vector();
        bundle.addAll(V);
        for (bundle = bundle.iterator(); bundle.hasNext();)
        {
            String s = (String)bundle.next();
            k k1 = H.b(s);
            if (k1 != null)
            {
                V.remove(s);
                if (c.getAdapter() != null)
                {
                    a(k1, null, null, 0);
                } else
                {
                    d().add(k1.b());
                    a(k1);
                }
            } else
            {
                g(s);
                H.d(s).a(new no(this, s));
            }
        }

    }

    public final boolean b()
    {
        return !Z;
    }

    protected final String c()
    {
        return getString(0x7f090106);
    }

    protected final void d(k k1)
    {
        super.d(k1);
        ad();
        if (O > 0 && d().size() + V.size() <= 0)
        {
            c(false);
            b(false);
        }
    }

    protected final void e(String s)
    {
        V.remove(s);
        super.e(s);
    }

    protected final void e(k k1)
    {
        k1 = H.b(k1.a());
        if (!k1.g())
        {
            b(getString(0x7f09036a), false);
        }
        k1.a(com.kik.sdkutils.d.a(getView(), new np(this)));
    }

    protected final void f(String s)
    {
        V.remove(s);
        super.f(s);
        ad();
    }

    protected final void g(String s)
    {
        super.g(s);
        ad();
    }

    protected final boolean g()
    {
        return true;
    }

    protected final boolean i()
    {
        return true;
    }

    protected final boolean j()
    {
        return W.size() > 0;
    }

    public void onActivityResult(int l, int i1, Intent intent)
    {
        if (l == 1559 && i1 == -1 && intent.hasExtra("SimpleFragmentWrapperActivity.EXTRA_FRAGMENT_RESULT") && d().size() + V.size() >= U && U != -1)
        {
            if (d().size() + V.size() >= U)
            {
                FragmentActivity fragmentactivity = getActivity();
                if (U == 1)
                {
                    intent = getActivity().getResources().getString(0x7f090329);
                } else
                {
                    intent = String.format(getActivity().getResources().getString(0x7f09032b), new Object[] {
                        Integer.valueOf(U)
                    });
                }
                Toast.makeText(fragmentactivity, intent, 0).show();
            }
            return;
        } else
        {
            super.onActivityResult(l, i1, intent);
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        V().a(this);
        super.onCreate(bundle);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        boolean flag1 = true;
        super.onViewCreated(view, bundle);
        boolean flag;
        if (O > 0 && d().size() + V.size() <= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (Z || flag)
        {
            flag1 = false;
        }
        c(flag1);
        b(flag1);
        ad();
    }
}
