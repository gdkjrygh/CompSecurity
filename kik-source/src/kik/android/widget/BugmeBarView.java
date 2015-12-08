// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.kik.android.a.b;
import com.kik.cache.ContactImageView;
import com.kik.h.c;
import com.kik.m.k;
import kik.a.e.n;
import kik.a.e.v;
import kik.a.e.w;
import kik.android.chat.fragment.KikScopedDialogFragment;
import kik.android.chat.fragment.ProgressDialogFragment;
import kik.android.e.d;
import kik.android.util.cq;
import kik.android.util.p;

// Referenced classes of package kik.android.widget:
//            e, i, l, j, 
//            k, m, o, n

public class BugmeBarView extends FrameLayout
    implements d
{

    View _bugMeSingleTextLayout;
    Button _bugmeButton;
    ContactImageView _bugmePic;
    View a;
    ProgressDialogFragment b;
    private final android.view.View.OnClickListener c;
    private Context d;
    private w e;
    private n f;
    private v g;
    private KikScopedDialogFragment h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private c o;
    private kik.a.f.k p;

    public BugmeBarView(Context context)
    {
        this(context, null);
    }

    public BugmeBarView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = new e(this);
        e = null;
        m = false;
        n = true;
        d = context;
        a = LayoutInflater.from(context).inflate(0x7f03001d, this);
        ButterKnife.inject(this, a);
    }

    private void a(int i1)
    {
        _bugMeSingleTextLayout.setVisibility(8);
        i1;
        JVM INSTR tableswitch 56 57: default 32
    //                   56 33
    //                   57 140;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (d != null)
        {
            _bugmePic.setVisibility(0);
            _bugmePic.setOnClickListener(null);
            _bugmePic.setImageDrawable(d.getResources().getDrawable(0x7f020034));
            _bugMeSingleTextLayout.setVisibility(0);
            ((TextView)findViewById(0x7f0e00ad)).setText(d.getString(0x7f09022b));
            _bugmeButton.setVisibility(0);
            _bugmeButton.setText(d.getString(0x7f090085));
            _bugmeButton.setOnClickListener(c);
            return;
        }
          goto _L1
_L3:
        _bugMeSingleTextLayout.setVisibility(0);
        _bugmeButton.setVisibility(8);
        ((TextView)findViewById(0x7f0e00ad)).setText(d.getString(0x7f0901d6));
        postDelayed(new i(this), 3000L);
        return;
    }

    static void a(BugmeBarView bugmebarview)
    {
        bugmebarview.g();
    }

    static boolean a(BugmeBarView bugmebarview, boolean flag)
    {
        bugmebarview.i = flag;
        return flag;
    }

    static c b(BugmeBarView bugmebarview)
    {
        return bugmebarview.o;
    }

    private void b(int i1)
    {
        if (i1 == 0)
        {
            if (j && (!l || k) && !m)
            {
                b b1 = new b(this, 0, (int)d.getResources().getDimension(0x7f0d0000));
                b1.setDuration(300L);
                b1.setAnimationListener(new l(this));
                startAnimation(b1);
                super.setVisibility(i1);
            }
        } else
        if (m || l && !k)
        {
            h();
            return;
        }
    }

    static boolean b(BugmeBarView bugmebarview, boolean flag)
    {
        bugmebarview.k = flag;
        return flag;
    }

    static KikScopedDialogFragment c(BugmeBarView bugmebarview)
    {
        return bugmebarview.h;
    }

    static boolean c(BugmeBarView bugmebarview, boolean flag)
    {
        bugmebarview.l = flag;
        return flag;
    }

    static Context d(BugmeBarView bugmebarview)
    {
        return bugmebarview.d;
    }

    static boolean d(BugmeBarView bugmebarview, boolean flag)
    {
        bugmebarview.m = flag;
        return flag;
    }

    static void e(BugmeBarView bugmebarview)
    {
        bugmebarview.h();
    }

    private boolean f()
    {
        return n && !e.k() && !e.j();
    }

    private void g()
    {
        kik.android.util.p.a a1 = new kik.android.util.p.a(p, f, e, g);
        a1.a(new d[] {
            this
        });
        if (b != null && b.isVisible())
        {
            b.dismiss();
        }
        b = new ProgressDialogFragment(d.getString(0x7f090207), true);
        b.a(new j(this, a1));
        o.a(b);
    }

    private void h()
    {
        if (k)
        {
            return;
        } else
        {
            b b1 = new b(this, (int)d.getResources().getDimension(0x7f0d0000), 0);
            b1.setDuration(300L);
            b1.setAnimationListener(new kik.android.widget.k(this));
            startAnimation(b1);
            return;
        }
    }

    public final void a()
    {
        if (f())
        {
            a(56);
            b(0);
        } else
        if (!i)
        {
            b(8);
            return;
        }
    }

    public final void a(int i1, int j1)
    {
        j1;
        JVM INSTR lookupswitch 3: default 36
    //                   2: 42
    //                   4: 50
    //                   8: 50;
           goto _L1 _L2 _L3 _L3
_L1:
        b(i1);
        return;
_L2:
        j = false;
        continue; /* Loop/switch isn't completed */
_L3:
        j = true;
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final void a(int i1, int j1, Intent intent, n n1)
    {
        if (i1 != 10334 && i1 != 10335 || j1 != -1) goto _L2; else goto _L1
_L1:
        if (!kik.android.util.p.a().a(h, d, i1, intent, n1))
        {
            intent = (new kik.android.chat.fragment.KikDialogFragment.a(getResources())).a(d.getString(0x7f0902ba)).b(d.getString(0x7f0900ae)).a(0x7f090193, new m(this));
            o.a(intent.a());
        }
_L4:
        return;
_L2:
        if (i1 != 10336 || j1 != -1) goto _L4; else goto _L3
_L3:
        g();
        kik.android.util.p.a().g();
        return;
        intent;
        kik.android.util.p.a().g();
        throw intent;
    }

    public final void a(Bitmap bitmap)
    {
        if (b != null)
        {
            b.dismissAllowingStateLoss();
        }
        e.a(com.kik.m.k.b(bitmap, android.graphics.Bitmap.CompressFormat.JPEG, 90));
        _bugmePic.d(bitmap);
        a(57);
    }

    public final void a(c c1)
    {
        o = c1;
    }

    public final void a(n n1)
    {
        f = n1;
    }

    public final void a(v v)
    {
        g = v;
    }

    public final void a(w w1)
    {
        e = w1;
    }

    public final void a(kik.a.f.k k1)
    {
        p = k1;
    }

    public final void a(KikScopedDialogFragment kikscopeddialogfragment)
    {
        h = kikscopeddialogfragment;
    }

    public final void a(boolean flag)
    {
        n = flag;
    }

    public final int b()
    {
        return (int)d.getResources().getDimension(0x7f0d0000);
    }

    public final boolean c()
    {
        return l;
    }

    public final boolean d()
    {
        return f() || i;
    }

    public final void k_()
    {
        if (b != null && b.isVisible())
        {
            b.dismissAllowingStateLoss();
        }
        kik.android.chat.fragment.KikDialogFragment.a a1 = (new kik.android.chat.fragment.KikDialogFragment.a(getResources())).a(cq.a()).b(0x7f0901d0).b(true).a(0x7f090300, new o(this)).b(0x7f090299, new kik.android.widget.n(this));
        o.a(a1.a());
    }
}
