// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.kik.g.p;
import kik.a.d.k;

// Referenced classes of package kik.android.chat.fragment:
//            KikDefaultContactsListFragment, pl, pm

public class KikSelectUserFragment extends KikDefaultContactsListFragment
{
    public static final class a extends KikContactsListFragment.a
    {

        static boolean a(a a1)
        {
            return a1.f("showSelectAsSendTo").booleanValue();
        }

        public final a a()
        {
            a("showSelectAsSendTo", true);
            return this;
        }

        public a()
        {
        }
    }


    private final a U = new a();
    private boolean a;

    public KikSelectUserFragment()
    {
    }

    static void a(KikSelectUserFragment kikselectuserfragment, Bundle bundle)
    {
        if (bundle != null)
        {
            Bundle bundle1 = new Bundle();
            bundle1.putString("KikSelectUserFragment.RESULT_JID", bundle.getString("chatContactJID"));
            kikselectuserfragment.a(bundle1);
            kikselectuserfragment.J();
        }
    }

    protected final int K()
    {
        return 0x7f09030a;
    }

    protected final String a()
    {
        return null;
    }

    protected final void a(k k1)
    {
label0:
        {
            if (k1 != null)
            {
                if (!k1.m() && k1.l())
                {
                    break label0;
                }
                KikChatInfoFragment.a a1 = new KikChatInfoFragment.a();
                a1.a(k1).b(5).b(true).d(a).a(U.h());
                a(((kik.android.util.an) (a1))).a(new pl(this));
            }
            return;
        }
        a_(k1.b(), k1.c());
    }

    protected final void a_(String s, String s1)
    {
        b(((View) (null)));
        s1 = new Bundle();
        s1.putString("KikSelectUserFragment.RESULT_JID", s);
        a(s1);
        J();
    }

    protected final void b(Bundle bundle)
    {
    }

    protected final void b(k k1)
    {
    }

    protected final String c()
    {
        return getString(0x7f090106);
    }

    protected final boolean d()
    {
        return true;
    }

    protected final void e()
    {
        super.e();
        KikAddContactFragment.b b1 = new KikAddContactFragment.b();
        b1.b(2).a(T());
        int l;
        if (U != null)
        {
            l = com.kik.ui.fragment.FragmentBase.a.a.a;
        } else
        {
            l = U.h();
        }
        b1.a(l);
        a(b1).a(new pm(this));
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

    public void onActivityResult(int l, int i1, Intent intent)
    {
        if (intent == null || i1 != -1 || !intent.hasExtra("SimpleFragmentWrapperActivity.EXTRA_FRAGMENT_RESULT") || l != 1569 && l != 1559)
        {
            S();
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        U.a(getArguments());
        a = a.a(U);
    }
}
