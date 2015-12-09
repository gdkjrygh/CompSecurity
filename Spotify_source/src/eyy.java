// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.google.common.base.Optional;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.collection.util.CollectionState;
import com.spotify.mobile.android.ui.activity.CoverImageActivity;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.Locale;

public final class eyy extends Fragment
    implements dod, eda, fxy
{

    private String Y;
    private eyz Z;
    private dnw a;
    private LoadingView aa;
    private gjf ab;
    private EmptyView ac;
    private Flags ad;
    private boolean ae;
    private an af;
    private String b;

    public eyy()
    {
        a = new dnw();
        b = "";
        af = new an() {

            private eyy a;

            public final da a(Bundle bundle)
            {
                bundle = dtg.a(eyy.f(a));
                return new cu(a.k(), bundle, dnw.a, null, null);
            }

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                Object obj1;
                obj1 = null;
                obj = (Cursor)obj;
                ((Cursor) (obj)).moveToFirst();
                if (((Cursor) (obj)).isAfterLast()) goto _L2; else goto _L1
_L1:
                eyz eyz1;
                dnw dnw1;
                int i;
                int j;
                if (!eyy.a(a).d())
                {
                    eyy.a(a).b();
                }
                eyy.a(a, new dnw());
                eyy.b(a).a(((Cursor) (obj)));
                eyz1 = eyy.c(a);
                dnw1 = eyy.b(a);
                obj = dnw1.h();
                ((djr)eyz1.b.f.a()).a(((CharSequence) (obj)));
                obj = dnw1.e();
                eyz1.e.a(3, ((fzv) (eyz1)).p.getString(0x7f08006e, new Object[] {
                    obj
                }));
                Object obj2 = eyz1.b;
                obj2.i = ((String) (obj));
                ((djr)((ezb) (obj2)).f.a()).b(((ezb) (obj2)).a.getString(0x7f08006a, new Object[] {
                    obj
                }).toUpperCase(Locale.getDefault()));
                ((ezb) (obj2)).g.c(((String) (obj)).toUpperCase(Locale.getDefault()));
                obj = dnw1.g();
                eyz1.f = ((String) (obj));
                eyz1.b.h = ((String) (obj));
                eyz1.d.a(0x7f11005f, null, eyz1.l);
                obj2 = dnw1.k();
                obj = eyz1.b;
                obj2 = dto.a(((String) (obj2)));
                Object obj3 = ((ezb) (obj)).l;
                android.widget.ImageView imageview = ((ezb) (obj)).f.c();
                gve gve = ((ezb) (obj)).f.g();
                ((gji) (obj3)).a(imageview, ((Uri) (obj2)), dff.b(((gji) (obj3)).a), null, gve);
                ((ezb) (obj)).l.a(((ezb) (obj)).f.d(), ((Uri) (obj2)));
                CoverImageActivity.a((Activity)((ezb) (obj)).a, ((ezb) (obj)).f.c(), ((Uri) (obj2)));
                obj = dnw1.j();
                eyz1.b.g.a(((String) (obj)));
                obj = dnw1.l();
                String as[] = ((String) (obj)).split("\n");
                obj3 = new StringBuilder(((String) (obj)).length());
                j = as.length;
                i = 0;
                for (obj = obj1; i < j; obj = obj1)
                {
                    obj1 = as[i];
                    if (!((String) (obj1)).equals(obj))
                    {
                        if (((StringBuilder) (obj3)).length() != 0)
                        {
                            ((StringBuilder) (obj3)).append('\n');
                        }
                        ((StringBuilder) (obj3)).append(((String) (obj1)));
                    }
                    i++;
                }

                obj = ((StringBuilder) (obj3)).toString();
                eyz1.c.setText(((CharSequence) (obj)));
                obj = dnw1.a(eyz1.m);
                i = dnw1.b();
                j = dnw1.d();
                obj1 = eyz1.b;
                obj1.d = ((CollectionState) (obj));
                if (((ezb) (obj1)).c == null) goto _L4; else goto _L3
_L3:
                ezb._cls3.a[((CollectionState) (obj)).ordinal()];
                JVM INSTR tableswitch 1 3: default 560
            //                           1 772
            //                           2 793
            //                           3 814;
                   goto _L5 _L6 _L7 _L8
_L5:
                break; /* Loop/switch isn't completed */
_L8:
                break MISSING_BLOCK_LABEL_814;
_L4:
                eyz1.j.a(new evo(i, j, ((CollectionState) (obj))));
                obj1 = dnw1.g();
                String s = dnw1.m();
                obj = eyz1.b;
                boolean flag;
                boolean flag1;
                if (TextUtils.isEmpty(((CharSequence) (obj1))))
                {
                    ((ezb) (obj)).a();
                } else
                {
                    Uri uri = dto.a(s);
                    ((ezb) (obj)).l.c(((ezb) (obj)).g.b, uri);
                }
                flag1 = dnw1.f();
                obj = eyz1.b;
                obj1 = ((ezb) (obj)).g;
                if (flag1 && SpotifyLink.b(((ezb) (obj)).h))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((gbg) (obj1)).a(flag);
                if (!flag1)
                {
                    ((ezb) (obj)).a();
                }
                obj = eyy.b(a).b;
                if (!((String) (obj)).equals(eyy.d(a)))
                {
                    eyy.a(a, ((String) (obj)));
                    a.g().putString("title", eyy.d(a));
                    ((fpe)a.k()).a(a, eyy.d(a));
                }
                ((fpe)a.k()).P_();
                eyy.e(a).b();
_L2:
                return;
_L6:
                ((ezb) (obj1)).c.setText(0x7f080160);
                ((ezb) (obj1)).c.setChecked(false);
                  goto _L4
_L7:
                ((ezb) (obj1)).c.setText(0x7f08015f);
                ((ezb) (obj1)).c.setChecked(false);
                  goto _L4
                ((ezb) (obj1)).c.setText(0x7f080161);
                ((ezb) (obj1)).c.setChecked(true);
                  goto _L4
            }

            
            {
                a = eyy.this;
                super();
            }
        };
    }

    static dnw a(eyy eyy1, dnw dnw1)
    {
        eyy1.a = dnw1;
        return dnw1;
    }

    public static eyy a(String s, String s1, String s2, boolean flag, Flags flags)
    {
        Bundle bundle = new Bundle();
        bundle.putString("album_uri", s);
        bundle.putString("title", s1);
        bundle.putString("lookup_track_uri", s2);
        bundle.putBoolean("autoplay", flag);
        s = new eyy();
        s.f(bundle);
        fyw.a(s, flags);
        return s;
    }

    static gjf a(eyy eyy1)
    {
        return eyy1.ab;
    }

    static String a(eyy eyy1, String s)
    {
        eyy1.Y = s;
        return s;
    }

    static dnw b(eyy eyy1)
    {
        return eyy1.a;
    }

    public static boolean b(Intent intent)
    {
        return intent.hasExtra("album_uri");
    }

    static eyz c(eyy eyy1)
    {
        return eyy1.Z;
    }

    static String d(eyy eyy1)
    {
        return eyy1.Y;
    }

    static LoadingView e(eyy eyy1)
    {
        return eyy1.aa;
    }

    static String f(eyy eyy1)
    {
        return eyy1.b;
    }

    public final void A()
    {
        Z.b();
        edb.a(k()).b(this);
        super.A();
    }

    public final void B()
    {
        super.B();
        eyz eyz1 = Z;
        if (eyz1.a.b())
        {
            ((Resolver)eyz1.a.c()).destroy();
        }
        if (eyz1.k != null)
        {
            eyz1.k.a();
        }
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return (new StringBuilder("album:")).append(b).toString();
    }

    public final Uri a()
    {
        return Uri.parse(b);
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        ad = fyw.a(this);
        viewgroup = new FrameLayout(k());
        viewgroup.setBackgroundColor(dgo.b(k(), 0x1010054));
        FrameLayout framelayout = new FrameLayout(k());
        viewgroup.addView(framelayout);
        Z = new eyz(k(), viewgroup, this, u(), b, gnl.a(this), ad, ae);
        framelayout.addView(((fzv) (Z)).q);
        ac = gag.a(k(), b(0x7f08006b));
        ac.setVisibility(8);
        framelayout.addView(ac);
        framelayout.setVisibility(4);
        aa = LoadingView.a(layoutinflater, k(), framelayout);
        viewgroup.addView(aa);
        layoutinflater = g();
        Z.h = layoutinflater.getBoolean("autoplay", false);
        Z.g = layoutinflater.getString("lookup_track_uri");
        layoutinflater.putString("lookup_track_uri", null);
        layoutinflater.putBoolean("autoplay", false);
        u().a(0x7f11005e, null, af);
        ab = gjf.a(k(), b);
        ab.c(bundle);
        ab.a();
        return viewgroup;
    }

    public final String a(Context context, Flags flags)
    {
        if (Y == null)
        {
            return context.getString(0x7f08006d);
        } else
        {
            return Y;
        }
    }

    public final void a(Bundle bundle)
    {
        boolean flag = true;
        super.a(bundle);
        b = g().getString("album_uri", "");
        Y = g().getString("title", "");
        a(true);
        if (bundle != null)
        {
            flag = false;
        }
        ae = flag;
    }

    public final void a(Menu menu, MenuInflater menuinflater)
    {
        if (o())
        {
            menu.clear();
            menuinflater = ViewUri.am.a(b);
            if (a.f && ggi.b(k()))
            {
                Object obj = dtg.b(b);
                obj = fzr.a(k(), menu, menuinflater, FeatureIdentifier.R, gnl.a(this), ((Uri) (obj)));
                Z.b.k = ((View) (obj));
            }
            if (a.f)
            {
                fzt.a(k(), menu, menuinflater, a.a(ad), true, b, ad);
                if (!TextUtils.isEmpty(a.e) && !gbx.a(a.d) && a.g)
                {
                    fzt.a(k(), menu, menuinflater, a.e, a.d);
                }
                u u = k();
                String s = b;
                String s1 = gei.b(a.d, a.b);
                Flags flags = ad;
                if (!fzt.a(u))
                {
                    menu.add(0, 0x7f1100d2, 0, 0x7f08039e).setOnMenuItemClickListener(new fzt._cls16(u, menuinflater, s, s1, flags));
                }
                if (a.h)
                {
                    fzr.a(k(), menu, menuinflater, b, a.b, ad);
                }
                if (a.i)
                {
                    fzt.a(k(), menu, menuinflater, b, ad);
                }
                fzr.a(k(), menu, menuinflater, a.b, a(0x7f0804d4, new Object[] {
                    a.d
                }), a.p, b);
                return;
            }
        }
    }

    public final void a(SessionState sessionstate)
    {
        byte byte0 = 8;
        boolean flag = sessionstate.j;
        sessionstate = ac;
        int i;
        if (!flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        sessionstate.setVisibility(i);
        sessionstate = ((fzv) (Z)).q;
        if (!flag)
        {
            i = byte0;
        } else
        {
            i = 0;
        }
        sessionstate.setVisibility(i);
        if (!flag)
        {
            ab.c();
        }
    }

    public final void c()
    {
        super.c();
        eyz eyz1 = Z;
        if (eyz1.a.b())
        {
            ((Resolver)eyz1.a.c()).connect();
        }
        if (eyz1.k != null)
        {
            eyz1.k.b(true);
        }
    }

    public final void d()
    {
        super.d();
        eyz eyz1 = Z;
        if (eyz1.a.b())
        {
            ((Resolver)eyz1.a.c()).disconnect();
        }
        if (eyz1.k != null)
        {
            eyz1.k.b(false);
        }
    }

    public final void e()
    {
        super.e();
        if (ab.e())
        {
            ab.c();
        }
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        ab.a(bundle);
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.R;
    }

    public final void z()
    {
        super.z();
        edb.a(k()).a(this);
        aa.a();
        Z.a();
    }
}
