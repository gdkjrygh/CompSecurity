// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards;

import android.view.View;
import com.kik.cards.web.CardsWebViewFragment;
import com.kik.cards.web.config.a;
import com.kik.cards.web.kik.b;
import com.kik.cards.web.kik.h;
import com.kik.cards.web.userdata.e;
import com.kik.g.p;
import java.util.List;
import kik.a.e.r;
import kik.a.e.w;
import kik.android.b.k;
import kik.android.b.m;
import kik.android.chat.activity.FragmentWrapperActivity;
import kik.android.chat.fragment.KikDialogFragment;
import kik.android.chat.fragment.ProgressDialogFragment;
import kik.android.d.c;
import kik.android.d.d;
import kik.android.util.bg;
import kik.android.widget.cw;

// Referenced classes of package com.kik.cards:
//            d, e, f, g, 
//            a, h, i

public abstract class KikCardsWebViewFragment extends CardsWebViewFragment
    implements a, b, com.kik.cards.web.userdata.a
{

    private boolean x;
    private boolean y;

    public KikCardsWebViewFragment()
    {
        x = false;
        y = false;
    }

    static void a(KikCardsWebViewFragment kikcardswebviewfragment)
    {
        kikcardswebviewfragment.P();
    }

    static boolean a(KikCardsWebViewFragment kikcardswebviewfragment, boolean flag)
    {
        kikcardswebviewfragment.x = flag;
        return flag;
    }

    public final h a(r r)
    {
        return new k(this, r);
    }

    public final e a()
    {
        return new m(this, t, i(), m.d());
    }

    public final p a(String s)
    {
        String s1 = getString(0x7f090193);
        String s2 = getString(0x7f090299);
        p p1 = new p();
        KikDialogFragment kikdialogfragment = new KikDialogFragment();
        kikdialogfragment.a(getString(0x7f0902a0));
        kikdialogfragment.b(String.format(getString(0x7f090057), new Object[] {
            s
        }));
        kikdialogfragment.setCancelable(true);
        kikdialogfragment.d().a(new com.kik.cards.d(this, p1));
        kikdialogfragment.a(s1, new com.kik.cards.e(this, p1));
        kikdialogfragment.b(s2, new f(this, p1));
        kikdialogfragment.a(new g(this, p1));
        a(kikdialogfragment);
        return p1;
    }

    public final void a(com.kik.cards.web.usermedia.b b1)
    {
        String s = getString(0x7f090193);
        ProgressDialogFragment progressdialogfragment;
        if (!b1.g())
        {
            progressdialogfragment = new ProgressDialogFragment(b1.c(), false);
            progressdialogfragment.e();
            progressdialogfragment.setCancelable(false);
            a(((KikDialogFragment) (progressdialogfragment)));
        } else
        {
            progressdialogfragment = null;
        }
        b1.a(new com.kik.cards.a(this, getActivity(), b1, s, progressdialogfragment));
    }

    public void a(boolean flag)
    {
        super.a(flag);
        if (!I() || y)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c(flag);
    }

    public final c b()
    {
        return kik.android.d.d.a(t());
    }

    public final void b(boolean flag)
    {
        View view = getView();
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        if (view != null && fragmentactivity != null)
        {
            view.post(new com.kik.cards.h(this, flag, fragmentactivity));
            view.postDelayed(new i(this), 500L);
        }
    }

    public final boolean b(String s)
    {
        if (w == null)
        {
            return false;
        } else
        {
            return w.a(s);
        }
    }

    public final com.kik.m.a c()
    {
        return new bg(t());
    }

    public final boolean d()
    {
        return !x;
    }

    public final boolean e()
    {
        List list = kik.android.chat.activity.k.d();
        Object obj = (FragmentWrapperActivity)getActivity();
        int j = list.size();
        obj = new kik.android.chat.activity.k.a(obj.getClass(), ((FragmentWrapperActivity) (obj)).b(), ((FragmentWrapperActivity) (obj)).c());
        return j >= 2 && !((kik.android.chat.activity.k.a)list.get(j - 1)).equals(obj);
    }

    public final boolean f()
    {
        List list = kik.android.chat.activity.k.d();
        Object obj = (FragmentWrapperActivity)getActivity();
        int j = list.size();
        obj = new kik.android.chat.activity.k.a(obj.getClass(), ((FragmentWrapperActivity) (obj)).b(), ((FragmentWrapperActivity) (obj)).c());
        if (j < 2)
        {
            return false;
        }
        return ((kik.android.chat.activity.k.a)list.get(j - 2)).equals(obj) && !com.kik.cards.web.video.b.a().m();
    }
}
