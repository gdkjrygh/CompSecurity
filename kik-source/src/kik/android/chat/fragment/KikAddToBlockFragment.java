// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.res.Resources;
import android.os.Bundle;
import kik.a.d.k;
import kik.android.KikDataProvider;
import kik.android.util.cq;

// Referenced classes of package kik.android.chat.fragment:
//            KikDefaultContactsListFragment, be, bj, bf

public class KikAddToBlockFragment extends KikDefaultContactsListFragment
{
    public static final class a extends KikContactsListFragment.a
    {

        public a()
        {
        }
    }


    protected android.widget.AdapterView.OnItemClickListener a;

    public KikAddToBlockFragment()
    {
        a = new be(this);
    }

    static void a(KikAddToBlockFragment kikaddtoblockfragment, String s, String s1)
    {
        kikaddtoblockfragment.b(s, s1);
    }

    private void b(String s, String s1)
    {
        KikDialogFragment.a a1 = new KikDialogFragment.a(getResources());
        a1.b(getString(0x7f090055, new Object[] {
            s1, cq.b(s1)
        })).a(getString(0x7f09003b, new Object[] {
            s1
        })).b(0x7f090299, new bj(this)).a(0x7f090296, new bf(this, s));
        a(a1.a, KikScopedDialogFragment.a.b, "addToBlock");
    }

    protected final int K()
    {
        return 0x7f090226;
    }

    protected final String a()
    {
        return getString(0x7f090284);
    }

    protected final void a(k k1)
    {
        if (k1 != null)
        {
            b(k1.b(), k1.c());
        }
    }

    protected final void a_(String s, String s1)
    {
        b(s, s1);
    }

    protected final void b(Bundle bundle)
    {
        a(KikDataProvider.e);
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
        return false;
    }

    protected final void e()
    {
    }

    protected final String f()
    {
        return null;
    }

    protected final boolean g()
    {
        return true;
    }

    protected final String h()
    {
        return getResources().getString(0x7f0900e0);
    }

    protected final boolean i()
    {
        return false;
    }

    protected final boolean j()
    {
        return false;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }
}
