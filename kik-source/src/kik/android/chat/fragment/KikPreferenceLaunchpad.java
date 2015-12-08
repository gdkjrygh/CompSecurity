// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;
import com.kik.cache.ad;
import com.kik.e.a;
import com.kik.g.f;
import com.kik.g.i;
import com.kik.m.k;
import kik.a.e.n;
import kik.a.e.v;
import kik.a.e.w;
import kik.a.h.j;
import kik.android.a.b;
import kik.android.chat.KikApplication;
import kik.android.chat.fragment.settings.KikPreferenceFragment;
import kik.android.e.d;
import kik.android.util.an;
import kik.android.util.bf;
import kik.android.util.cc;
import kik.android.util.cq;
import kik.android.util.p;
import kik.android.widget.preferences.KikProfilePicPreference;
import org.c.c;

// Referenced classes of package kik.android.chat.fragment:
//            nr, ProgressDialogFragment, nx, ny, 
//            oa, nz, nu, nt, 
//            nv, nw

public class KikPreferenceLaunchpad extends KikPreferenceFragment
    implements d
{
    public static final class a extends an
    {

        private String a;
        private String b;

        public final a a()
        {
            a(a, true);
            return this;
        }

        public final boolean b()
        {
            return b(a, false).booleanValue();
        }

        public final a c()
        {
            a(b, true);
            return this;
        }

        public final boolean d()
        {
            return b(b, false).booleanValue();
        }

        public a()
        {
            a = "openPictureSetter";
            b = "openShareDialogue";
        }
    }

    public static final class b
    {

        private static boolean a;

        public static void a()
        {
            a = true;
        }

        public static void b()
        {
            a = false;
        }
    }


    private static final org.c.b l = org.c.c.a("KikPreferenceLaunchpad");
    ProgressDialogFragment a;
    protected kik.a.f.k b;
    protected n c;
    protected v d;
    ad e;
    private final a k = new a();
    private KikProfilePicPreference m;
    private volatile boolean n;
    private f o;
    private i p;

    public KikPreferenceLaunchpad()
    {
        n = false;
        o = new f();
        p = new nr(this);
    }

    static void a(KikPreferenceLaunchpad kikpreferencelaunchpad)
    {
        kikpreferencelaunchpad.d();
    }

    static void b(KikPreferenceLaunchpad kikpreferencelaunchpad)
    {
        kikpreferencelaunchpad.f();
    }

    private void d()
    {
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        kik.android.chat.fragment.b.a();
        kik.android.util.p.a().a(this, fragmentactivity);
    }

    private void f()
    {
        KikApplication.i().c().a(com.kik.d.b.a.k.M, j.b(), new Object[] {
            "s", Long.valueOf(com.kik.d.b.a.c.a.a())
        });
        kik.android.util.p.a a1 = new kik.android.util.p.a(b, c, g, d);
        a1.a(new d[] {
            this
        });
        if (a != null && a.isVisible())
        {
            a.dismiss();
        }
        a = new ProgressDialogFragment(getString(0x7f090207), true);
        a.a(new nx(this, a1));
        a(a);
    }

    protected final int a(int i)
    {
        return 0x7f07007b;
    }

    protected final void a()
    {
        ListView listview = c();
        if (listview != null)
        {
            listview.postInvalidate();
        }
        if (m != null)
        {
            m.d();
        }
    }

    public final void a(Bitmap bitmap)
    {
        if (a != null)
        {
            a(((KikDialogFragment) (null)));
        }
        g.a(com.kik.m.k.b(bitmap, android.graphics.Bitmap.CompressFormat.JPEG, 90));
        g.b(com.kik.m.k.b(bitmap, android.graphics.Bitmap.CompressFormat.JPEG, 100));
        bitmap = getActivity();
        if (bitmap != null)
        {
            bitmap.runOnUiThread(new ny(this));
        }
        Toast.makeText(getActivity(), 0x7f0901d5, 0).show();
    }

    public final void k_()
    {
        if (a != null && n)
        {
            a.dismiss();
        }
        if (kik.android.util.p.a().c())
        {
            a((new KikDialogFragment.a(getResources())).a(cq.a()).b(0x7f0901d0).b(true).a(0x7f090300, new oa(this)).b(0x7f090299, new nz(this)).a, kik.android.chat.fragment.KikScopedDialogFragment.a.b, "build");
        }
    }

    public void onActivityResult(int i, int i1, Intent intent)
    {
        kik.android.chat.fragment.b.b();
        if ((i == 10334 || i == 10335) && i1 == -1)
        {
            if (!kik.android.util.p.a().a(this, getActivity(), i, intent, c))
            {
                intent = getString(0x7f0902ba);
                String s = getString(0x7f0900ae);
                a((new KikDialogFragment.a(getResources())).a(intent).b(s).a(0x7f090193, new nu(this)).a);
            }
            return;
        }
        if (i != 10336 || i1 != -1)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        f();
        kik.android.util.p.a().g();
        return;
        intent;
        kik.android.util.p.a().g();
        throw intent;
        kik.android.util.p.a().g();
        return;
    }

    public void onCreate(Bundle bundle)
    {
        V().a(this);
        super.onCreate(bundle);
        k.a(getArguments());
        KikApplication.i().c().a(com.kik.d.b.a.k.w, j.b());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        c().setVerticalFadingEdgeEnabled(false);
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            c().setOverScrollMode(2);
        }
        m = (KikProfilePicPreference)a("kik.profile.picture");
        if (m == null) goto _L2; else goto _L1
_L1:
        V().a(m);
        m.a(e);
        m.a(new nt(this));
        if (!k.b()) goto _L4; else goto _L3
_L3:
        d();
_L2:
        viewgroup = (ListView)layoutinflater.findViewById(0x102000a);
        bundle = new android.widget.RelativeLayout.LayoutParams(viewgroup.getLayoutParams());
        bundle.setMargins(0, KikApplication.a(0), 0, 0);
        viewgroup.setLayoutParams(bundle);
        g.f();
        o.a(S.b(), p);
        viewgroup = getArguments();
        if (viewgroup != null)
        {
            bundle = viewgroup.getByteArray("kik.android.KikPreferenceActivity.extra.pic.byte");
            if (bundle != null)
            {
                bundle = new nv(this, bundle);
                if (a == null)
                {
                    a = new ProgressDialogFragment(getString(0x7f090207), true);
                    a.a(new nw(this, bundle));
                    a(a);
                }
                bundle.a(new Void[0]);
            }
            viewgroup.remove("kik.android.KikPreferenceActivity.extra.pic.byte");
        }
        return layoutinflater;
_L4:
        if (k.d())
        {
            cc.a(g.d(), getActivity(), h, e);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        o.a();
    }

    public void onPause()
    {
        n = false;
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        n = true;
        g.l();
        a();
    }

}
