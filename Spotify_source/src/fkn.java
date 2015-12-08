// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.activity.upsell.premiumdestination.PremiumInAppDestinationActivity;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import java.lang.ref.WeakReference;

public final class fkn extends Fragment
    implements android.view.View.OnClickListener, fla
{

    private ImageView Y;
    private TextView Z;
    private View a;
    private FrameLayout aa;
    private View ab;
    private TextView ac;
    private TextView ad;
    private fkw ae;
    private edb af;
    private dxc ag;
    private boolean ah;
    private boolean ai;
    private ViewGroup b;

    public fkn()
    {
    }

    static TextView a(fkn fkn1)
    {
        return fkn1.ad;
    }

    public static fkn a(Flags flags)
    {
        fkn fkn1 = new fkn();
        fyw.a(fkn1, flags);
        return fkn1;
    }

    public final void B()
    {
        super.B();
        af = null;
        ag = null;
    }

    public final void F()
    {
        ab.setVisibility(0);
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f03008d, viewgroup, false);
    }

    public final void a()
    {
        if (ae == null)
        {
            Assertion.b("calling refresh() in ProfileNavDrawerFooterFragment before it has been setup!");
        } else
        {
            fkw fkw1 = ae;
            if (fkw1.b != null)
            {
                fkw1.b.a();
                fkw1.a();
                return;
            }
        }
    }

    public final void a(int i, int j)
    {
        boolean flag;
        if (j > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        for (ai = flag; !o() || ah;)
        {
            return;
        }

        i += j;
        ac.setText(String.valueOf(i));
        ab.setContentDescription(k().getResources().getQuantityString(0x7f090022, i, new Object[] {
            Integer.valueOf(i)
        }));
    }

    public final void a(Context context)
    {
        super.a(context);
        ah = evm.b(fyw.a(this));
        dmz.a(edd);
        af = edd.a(context);
        dmz.a(dxd);
        ag = dxd.a(context);
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        a = view.findViewById(0x7f11038f);
        b = (ViewGroup)view.findViewById(0x7f110393);
        Y = (ImageView)view.findViewById(0x7f11026a);
        Z = (TextView)view.findViewById(0x7f110394);
        aa = (FrameLayout)view.findViewById(0x7f110397);
        ab = view.findViewById(0x7f110395);
        ac = (TextView)view.findViewById(0x7f11038a);
        ad = (TextView)view.findViewById(0x7f110391);
        ad.setVisibility(8);
        bundle = view.findViewById(0x7f110392);
        if (ah)
        {
            ab = view.findViewById(0x7f110396);
            ac = (TextView)view.findViewById(0x7f11038d);
            bundle.setVisibility(8);
        } else
        {
            bundle.setVisibility(0);
        }
        a.setOnClickListener(this);
        b.setOnClickListener(this);
        aa.setOnClickListener(this);
        ab.setOnClickListener(this);
    }

    public final void a(String s)
    {
        dmz.a(gjj);
        gji gji1 = gjj.a(k());
        gji1.a(Y, dto.a(s), dff.f(gji1.a), dfo.a());
    }

    public final void b(String s)
    {
        if (!o())
        {
            return;
        } else
        {
            Z.setText(s);
            return;
        }
    }

    public final void c()
    {
        super.c();
        Flags flags = fyw.a(this);
        fkv fkv1 = new fkv(k());
        Object obj1 = new fkx(new fks(k()), new dzs());
        Object obj;
        fsf fsf1;
        frx frx1;
        if (ah)
        {
            obj = new edk(k());
        } else
        {
            obj = null;
        }
        obj = new fkt(((fky) (obj1)), ((edk) (obj)));
        obj1 = new fry(k());
        fsf1 = new fsf(Cosmos.getResolver(k()), de.a(k()));
        frx1 = new frx(k(), flags);
        dmz.a(fsi);
        ae = new fkw(this, ((fkt) (obj)), fkv1, flags, new fri(fsf1, frx1, fsi.a(k())), ((fry) (obj1)));
        af.a();
        af.a(ae);
        ag.a();
        ag.a(ae);
    }

    public final void c(String s)
    {
        ad.setVisibility(0);
        ad.animate().alpha(0.0F).setDuration(300L).setListener(new AnimatorListenerAdapter(s) {

            private String a;
            private fkn b;

            public final void onAnimationEnd(Animator animator)
            {
                fkn.a(b).setText(a);
                fkn.a(b).animate().alpha(1.0F).setDuration(300L).setListener(null).start();
            }

            
            {
                b = fkn.this;
                a = s;
                super();
            }
        }).start();
    }

    public final void d()
    {
        super.d();
        af.b(ae);
        af.b();
        ag.b(ae);
        ag.b();
        fkw fkw1 = ae;
        fkw1.i = true;
        if (fkw1.d != null)
        {
            fkv fkv1 = fkw1.d;
            fkv1.a.clear();
            fkv1.a = null;
        }
        if (fkw1.b != null)
        {
            fkt fkt1 = fkw1.b;
            fkt1.c.a(fkt1.e);
            fkt1.c.a(fkt1.f);
            fkt1.c.a();
            fkt1.d.a();
            fkt1.e = null;
            fkt1.f = null;
            fkt1.c = null;
        }
        if (fkw1.c != null)
        {
            fkw1.c.a();
        }
        fkw1.c = null;
        fkw1.d = null;
        fkw1.b = null;
        fkw1.a = null;
        fkw1.e = null;
        fkw1.f = null;
    }

    public final void d(boolean flag)
    {
        if (flag)
        {
            ac.setVisibility(0);
            return;
        } else
        {
            ac.setVisibility(8);
            return;
        }
    }

    public final void e(boolean flag)
    {
        if (flag)
        {
            a.setVisibility(0);
            return;
        } else
        {
            a.setVisibility(8);
            return;
        }
    }

    public final void f(boolean flag)
    {
        TextView textview = ad;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        textview.setVisibility(i);
    }

    public final void onClick(View view)
    {
        if (!view.equals(a)) goto _L2; else goto _L1
_L1:
        view = ae;
        Object obj = ((fkw) (view)).d;
        view = ((fkw) (view)).e;
        obj = (Context)((fkv) (obj)).a.get();
        if (obj != null)
        {
            ClientEvent clientevent2 = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.h);
            clientevent2.a("target", ViewUri.aT.toString());
            fop.a(((Context) (obj)), ViewUri.c, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.U, clientevent2);
            ((Context) (obj)).startActivity(PremiumInAppDestinationActivity.a(((Context) (obj)), view));
        }
_L4:
        return;
_L2:
        if (!view.equals(b))
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1 = ae;
        if (((fkw) (obj1)).f != null)
        {
            view = ((fkw) (obj1)).d;
            obj1 = ((fkw) (obj1)).f.b;
            view = (Context)((fkv) (view)).a.get();
            if (view != null && !TextUtils.isEmpty(((CharSequence) (obj1))))
            {
                obj1 = SpotifyLink.a(Uri.encode(((String) (obj1)))).d();
                ClientEvent clientevent3 = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.h);
                clientevent3.a("target", ViewUri.ai.a(((String) (obj1))).toString());
                fop.a(view, ViewUri.c, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.U, clientevent3);
                view.startActivity(gms.a(view, ((String) (obj1))).a().a);
                return;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!view.equals(aa))
        {
            continue; /* Loop/switch isn't completed */
        }
        view = ae;
        if (((fkw) (view)).d != null)
        {
            view = (Context)((fkw) (view)).d.a.get();
            if (view != null)
            {
                ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.h);
                clientevent.a("target", ViewUri.H.toString());
                fop.a(view, ViewUri.c, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.U, clientevent);
                view.startActivity(gms.a(view, "spotify:internal:preferences").a);
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (!view.equals(ab)) goto _L4; else goto _L5
_L5:
        view = ae;
        boolean flag = ai;
        if (((fkw) (view)).d == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!evm.b(((fkw) (view)).e))
        {
            break; /* Loop/switch isn't completed */
        }
        view = (Context)((fkw) (view)).d.a.get();
        if (view != null)
        {
            Object obj2 = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.h);
            ((ClientEvent) (obj2)).a("target", ViewUri.I.toString());
            fop.a(view, ViewUri.c, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.U, ((ClientEvent) (obj2)));
            obj2 = gms.a(view, "spotify:notifications").a;
            ((Intent) (obj2)).putExtra("select_inbox", flag);
            view.startActivity(((Intent) (obj2)));
            return;
        }
        if (true) goto _L4; else goto _L6
_L6:
        view = (Context)((fkw) (view)).d.a.get();
        if (view != null)
        {
            ClientEvent clientevent1 = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.h);
            clientevent1.a("target", ViewUri.G.toString());
            fop.a(view, ViewUri.c, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.U, clientevent1);
            view.startActivity(gms.a(view, "spotify:internal:inbox").a().a);
            return;
        }
        if (true) goto _L4; else goto _L7
_L7:
    }
}
