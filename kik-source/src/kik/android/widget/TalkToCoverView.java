// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.kik.android.a;
import com.kik.android.a.b;
import com.kik.g.e;
import com.kik.g.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kik.a.d.a.d;
import kik.a.d.a.g;
import kik.a.d.aa;
import kik.a.d.f;
import kik.a.d.n;
import kik.a.e.i;
import kik.a.e.r;
import kik.a.e.w;
import kik.android.chat.fragment.KikDialogFragment;
import kik.android.chat.fragment.KikScopedDialogFragment;

// Referenced classes of package kik.android.widget:
//            eb, dz, ea, cp, 
//            ed, ec, dx, dy

public class TalkToCoverView extends LinearLayout
{

    View _acceptButton;
    View _deleteButton;
    protected a a;
    protected w b;
    protected r c;
    protected i d;
    protected kik.a.e.f e;
    private View f;
    private Context g;
    private kik.a.d.k h;
    private KikScopedDialogFragment i;
    private ArrayList j;
    private boolean k;
    private boolean l;
    private boolean m;
    private f n;
    private i o;
    private View p;
    private int q;
    private k r;
    private aa s;

    public TalkToCoverView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        j = new ArrayList();
        l = false;
        m = true;
        r = new k(this);
        g = context;
        f = LayoutInflater.from(context).inflate(0x7f03009d, this);
        ButterKnife.inject(this, f);
    }

    static void a(TalkToCoverView talktocoverview)
    {
        Resources resources = talktocoverview.getResources();
        KikDialogFragment kikdialogfragment = new KikDialogFragment();
        kikdialogfragment.a(resources.getString(0x7f0902cd));
        kikdialogfragment.b(resources.getString(0x7f090034));
        kikdialogfragment.a(resources.getString(0x7f090326), new eb(talktocoverview));
        kikdialogfragment.b(resources.getString(0x7f0902e0), null);
        talktocoverview.i.a(kikdialogfragment);
    }

    static void b(TalkToCoverView talktocoverview)
    {
        talktocoverview.a.b("Chat Screen Delete Clicked").a("Result", true).b();
        talktocoverview.d.b(talktocoverview.h.b());
    }

    private void c()
    {
        setVisibility(8);
        k = false;
        l = false;
        if (p != null)
        {
            android.view.ViewGroup.LayoutParams layoutparams = p.getLayoutParams();
            layoutparams.height = q;
            p.setLayoutParams(layoutparams);
        }
    }

    static void c(TalkToCoverView talktocoverview)
    {
        Resources resources = talktocoverview.getResources();
        KikDialogFragment kikdialogfragment = new KikDialogFragment();
        kikdialogfragment.a(resources.getString(0x7f09003b, new Object[] {
            talktocoverview.h.c()
        }));
        kikdialogfragment.b(resources.getString(0x7f090055, new Object[] {
            talktocoverview.h.c()
        }));
        kikdialogfragment.a(resources.getString(0x7f090296), new dz(talktocoverview));
        kikdialogfragment.b(resources.getString(0x7f090299), new ea(talktocoverview));
        talktocoverview.i.a(kikdialogfragment);
    }

    static void d(TalkToCoverView talktocoverview)
    {
        if (talktocoverview.h == null || talktocoverview.h.b() == null || (talktocoverview.h instanceof n))
        {
            return;
        } else
        {
            talktocoverview.getResources();
            cp cp1 = new cp(talktocoverview.h, talktocoverview.n.c(), talktocoverview.g.getApplicationContext(), "Chat Screen", talktocoverview.a, talktocoverview.o);
            talktocoverview.i.a(cp1.a());
            return;
        }
    }

    static kik.a.d.k e(TalkToCoverView talktocoverview)
    {
        return talktocoverview.h;
    }

    static View f(TalkToCoverView talktocoverview)
    {
        return talktocoverview.f;
    }

    static Context g(TalkToCoverView talktocoverview)
    {
        return talktocoverview.g;
    }

    static void h(TalkToCoverView talktocoverview)
    {
        if (!talktocoverview.k)
        {
            b b1 = new b(talktocoverview, talktocoverview.getResources().getDimensionPixelSize(0x7f0d0028), 0);
            b1.setDuration(300L);
            b1.setAnimationListener(new ed(talktocoverview));
            talktocoverview.startAnimation(b1);
        }
    }

    static boolean i(TalkToCoverView talktocoverview)
    {
        talktocoverview.k = true;
        return true;
    }

    static void j(TalkToCoverView talktocoverview)
    {
        talktocoverview.c();
    }

    public final e a()
    {
        return r.a();
    }

    public final void a(a a1, w w1, r r1, i i1, kik.a.e.f f1)
    {
        a = a1;
        b = w1;
        c = r1;
        d = i1;
        e = f1;
    }

    public final void a(kik.a.d.k k1, View view, f f1, i i1)
    {
        n = f1;
        o = i1;
        p = view;
        if (p != null && p.getLayoutParams() != null)
        {
            q = p.getLayoutParams().height;
        }
        h = k1;
        j.clear();
        if (h instanceof n)
        {
            k1 = ((n)h).w().iterator();
            do
            {
                if (!k1.hasNext())
                {
                    break;
                }
                view = (String)k1.next();
                view = c.a(view, true);
                if (!view.l())
                {
                    j.add(view);
                }
            } while (true);
        } else
        if (h != null && !h.l())
        {
            j.add(h);
        }
        if (h.t() && ((n)h).I()) goto _L2; else goto _L1
_L1:
        if (!m && (n == null || d.a(n) != 1 || !h.l())) goto _L4; else goto _L3
_L3:
        boolean flag = false;
_L10:
        if (flag) goto _L6; else goto _L5
_L5:
        c();
_L8:
        return;
_L4:
        if (j.size() > 0)
        {
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
_L2:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L6:
        setVisibility(0);
        k = false;
        l = true;
        if (p == null) goto _L8; else goto _L7
_L7:
        k1 = p.getLayoutParams();
        k1.height = getResources().getDimensionPixelSize(0x7f0d0028);
        p.setLayoutParams(k1);
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public final void a(KikScopedDialogFragment kikscopeddialogfragment)
    {
        i = kikscopeddialogfragment;
    }

    public final void a(boolean flag)
    {
        m = flag;
    }

    protected void acceptContact()
    {
        if (j == null)
        {
            return;
        }
        Iterator iterator = (new ArrayList(j)).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            kik.a.d.k k1 = (kik.a.d.k)iterator.next();
            if (k1 != null)
            {
                kik.a.d.s s1 = n.f();
                if (s1 != null)
                {
                    c.a((d)kik.a.d.a.g.a(s1, kik/a/d/a/d));
                } else
                {
                    c.a(k1.a());
                }
                r.a(k1);
            }
        } while (true);
        postDelayed(new ec(this), 10L);
    }

    public final boolean b()
    {
        return l;
    }

    protected void deleteConversation()
    {
        if (h == null || i == null)
        {
            return;
        }
        Object obj = getResources();
        KikDialogFragment kikdialogfragment = new KikDialogFragment();
        kikdialogfragment.a(((Resources) (obj)).getString(0x7f090133));
        if (h instanceof n)
        {
            String s1 = ((Resources) (obj)).getString(0x7f0902cc);
            obj = new dx(this);
            kikdialogfragment.a(new CharSequence[] {
                s1
            }, ((android.content.DialogInterface.OnClickListener) (obj)));
        } else
        {
            a.b("Chat Screen Ignore Clicked").b();
            if (s == null)
            {
                s = b.d();
            }
            CharSequence acharsequence[];
            if (h.e().equals(s.c))
            {
                acharsequence = new CharSequence[1];
                acharsequence[0] = ((Resources) (obj)).getString(0x7f0902a9);
            } else
            {
                acharsequence = new CharSequence[3];
                acharsequence[0] = ((Resources) (obj)).getString(0x7f0902a9);
                acharsequence[1] = ((Resources) (obj)).getString(0x7f090296);
                acharsequence[2] = ((Resources) (obj)).getString(0x7f0901fb);
            }
            kikdialogfragment.a(acharsequence, new dy(this));
        }
        i.a(kikdialogfragment);
    }
}
