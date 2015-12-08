// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.kik.e.a;
import com.kik.g.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import kik.a.d.j;
import kik.a.d.k;
import kik.a.d.n;
import kik.a.e.l;
import kik.a.e.v;
import kik.a.z;
import kik.android.KikDataProvider;
import kik.android.util.an;
import org.c.b;
import org.c.c;

// Referenced classes of package kik.android.chat.fragment:
//            KikDefaultContactsListFragment, nl, nk, nj, 
//            nm

public class KikPickContactFragment extends KikDefaultContactsListFragment
{
    public static final class a extends an
    {

        private static String a = "groupIdforPick";
        private static String b = "groupOnlyOneContact";

        static String a(a a1)
        {
            return a1.g(b);
        }

        static String b(a a1)
        {
            return a1.g(a);
        }

        static ArrayList c(a a1)
        {
            return (ArrayList)a1.k("kikpickcontactfrag.EXTRA_FILTERED_USERS");
        }


        public a()
        {
        }
    }


    private static final b Y = org.c.c.a("KikPickContactFragment");
    private List U;
    private n V;
    private Bundle W;
    private a X;
    protected v a;

    public KikPickContactFragment()
    {
        X = new a();
    }

    protected final int K()
    {
        return 0x7f09028a;
    }

    protected final String a()
    {
        return null;
    }

    protected final void a(String s, boolean flag)
    {
        Object obj = new StringBuilder();
        ((StringBuilder) (obj)).append("filler;");
        String s1;
        for (Iterator iterator = U.iterator(); iterator.hasNext(); ((StringBuilder) (obj)).append((new StringBuilder()).append(s1).append(";").toString()))
        {
            s1 = (String)iterator.next();
        }

        obj = ((StringBuilder) (obj)).toString();
        a(Uri.withAppendedPath(KikDataProvider.b, ((String) (obj))));
        super.a(s, flag);
    }

    protected final void a(k k1)
    {
label0:
        {
            if (k1 != null)
            {
                if (!k1.m())
                {
                    break label0;
                }
                a(k1, 3).a(new nl(this));
            }
            return;
        }
        a_(k1.b(), k1.c());
    }

    protected final void a_(String s, String s1)
    {
        KikDialogFragment.a a1 = new KikDialogFragment.a(getResources());
        a1.b(getString(0x7f090031, new Object[] {
            s1
        })).a(getString(0x7f09028d)).b(0x7f0902e0, new nk(this)).a(0x7f090326, new nj(this, s));
        a(a1.a, kik.android.chat.fragment.KikScopedDialogFragment.a.b, "confirmationDialog");
    }

    protected final void b(Bundle bundle)
    {
        X.a(bundle);
        bundle = kik.android.chat.fragment.a.c(X);
        z.addAll(bundle);
    }

    protected final void b(k k1)
    {
    }

    protected final String c()
    {
        return getString(0x7f090106);
    }

    public final void c(Bundle bundle)
    {
        if (bundle != null)
        {
            if ((bundle = bundle.getString("kik.prof.extra.jid")) != null)
            {
                boolean flag = bundle.equals(z.b(a).a().a());
                Iterator iterator = U.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    if (!bundle.equals((String)iterator.next()))
                    {
                        continue;
                    }
                    flag = true;
                    break;
                } while (true);
                if (flag)
                {
                    J();
                    return;
                } else
                {
                    Bundle bundle1 = new Bundle();
                    bundle1.putString("kikpickcontactfrag.groupExtraJidReturn", bundle);
                    a(bundle1);
                    J();
                    return;
                }
            }
        }
    }

    protected final boolean d()
    {
        return true;
    }

    protected final void e()
    {
        super.e();
        KikAddContactFragment.b b1 = new KikAddContactFragment.b();
        b1.b(3).a(T());
        S();
        a(b1).a(new nm(this));
    }

    protected final String f()
    {
        return null;
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
        return false;
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        if (i1 == 1559 && j1 == -1 && intent.hasExtra("SimpleFragmentWrapperActivity.EXTRA_FRAGMENT_RESULT"))
        {
            W = intent.getBundleExtra("SimpleFragmentWrapperActivity.EXTRA_FRAGMENT_RESULT");
            return;
        } else
        {
            S();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        V().a(this);
        super.onCreate(bundle);
        X.a(getArguments());
        bundle = kik.android.chat.fragment.a.a(X);
        if (bundle != null)
        {
            U = new Vector();
            U.add(bundle);
            return;
        }
        try
        {
            bundle = kik.android.chat.fragment.a.b(X);
            V = G.a(bundle, false);
            U = V.w();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            J();
        }
    }

    public void onResume()
    {
        super.onResume();
        if (W != null)
        {
            c(W);
        }
    }

}
