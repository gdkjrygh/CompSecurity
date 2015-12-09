// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.devtools.MethodTraceScope;
import com.spotify.mobile.android.spotlets.tinkerbell.BannerItem;
import com.spotify.mobile.android.spotlets.tinkerbell.BannerView;
import com.spotify.mobile.android.ui.NavigationItem;
import com.spotify.mobile.android.ui.adapter.SettingsAdapter;
import com.spotify.mobile.android.ui.cell.settings.AbstractSettingsCell;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class fyk extends al
    implements NavigationItem, dwk, fxy
{

    private static final String aa[] = {
        "private_session_timeout", "logged_in", "current_user_name", "current_user", "product_type"
    };
    public static final String b[] = {
        "offline_mode", "private_session", "broadcast_play_state", "download_over_3g", "download_quality", "stream_quality", "facebook_connected", "post_to_facebook", "seconds_to_offline_expiry", "lastfm_username", 
        "lastfm_password", "gapless", "crossfade", "crossfade_time_seconds", "normalize", "ap", "show_unavailable_tracks"
    };
    protected boolean Y;
    protected boolean Z;
    private View ab;
    private SettingsAdapter ac;
    private LoadingView ad;
    private BannerView ae;
    private fsz af;
    private ggl ag;
    private Flags ah;
    private dxc ai;
    private String aj;
    private boolean ak;
    private final dwx al = new dwx() {

        private fyk a;

        public final void a(Flags flags)
        {
            boolean flag1 = true;
            boolean flag;
            boolean flag2;
            boolean flag3;
            if (((Boolean)flags.a(fys.ab)).booleanValue() || fiy.a(fyk.a(a)))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag2 = ((Boolean)flags.a(fys.ac)).booleanValue();
            flag3 = dwg.a(flags);
            if (fyk.b(a) != null)
            {
                flags = fyk.b(a);
                if (((SettingsAdapter) (flags)).h == flag2)
                {
                    flag1 = false;
                }
                flags.j = flag1;
                flags.k = ((SettingsAdapter) (flags)).j;
                flags.h = flag2;
                flags.i = flag;
                flags.c = SettingsAdapter.a(((SettingsAdapter) (flags)).h);
                flags.d = SettingsAdapter.b(((SettingsAdapter) (flags)).h);
                flags.g = flag3;
                flags.a();
            }
        }

            
            {
                a = fyk.this;
                super();
            }
    };
    private dwh am;
    private dkz an;
    private an ao;
    private an ap;

    public fyk()
    {
        an = new dkz() {

            private fyk a;

            public final void a()
            {
            }

            public final void a(List list, com.spotify.mobile.android.connect.ConnectManager.ConnectState connectstate)
            {
                int i = 0;
                list = fyk.b(a);
                boolean flag;
                if (fyk.c(a).c())
                {
                    if (!((ConnectManager)fyk.c(a).f()).i())
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                } else
                {
                    flag = false;
                }
                if (flag != ((SettingsAdapter) (list)).f)
                {
                    list.f = flag;
                    list.a();
                }
                list = fyk.d(a);
                connectstate = fyk.b(a).b();
                ctz.a(connectstate);
                if (8 == ((fsz) (list)).a.size())
                {
                    for (; i < 8; i++)
                    {
                        ((fsz) (list)).a.set(i, connectstate[i]);
                    }

                    list.notifyDataSetChanged();
                }
            }

            
            {
                a = fyk.this;
                super();
            }
        };
        ao = new an() {

            private fyk a;

            public final da a(Bundle bundle)
            {
                bundle = dtw.a;
                return new cu(a.k(), bundle, fyk.K(), null, null);
            }

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                Cursor cursor = (Cursor)obj;
                if (cursor.moveToFirst())
                {
                    obj = fyk.b(a);
                    obj.e = cursor.getInt(cursor.getColumnIndexOrThrow("private_session_timeout")) / 3600;
                    ((SettingsAdapter) (obj)).a();
                    if (cursor.getInt(cursor.getColumnIndexOrThrow("logged_in")) != 0)
                    {
                        SettingsAdapter settingsadapter = fyk.b(a);
                        obj = cursor.getString(cursor.getColumnIndexOrThrow("current_user_name"));
                        if (obj == null)
                        {
                            obj = "";
                        }
                        settingsadapter.l = (String)obj;
                        settingsadapter.a();
                        settingsadapter = fyk.b(a);
                        obj = cursor.getString(cursor.getColumnIndexOrThrow("current_user"));
                        if (obj == null)
                        {
                            obj = "";
                        }
                        settingsadapter.m = (String)obj;
                        settingsadapter.a();
                    }
                    a.Y = true;
                    a.J();
                }
            }

            
            {
                a = fyk.this;
                super();
            }
        };
        ap = new an() {

            private fyk a;

            public final da a(Bundle bundle)
            {
                bundle = dtx.a;
                return new cu(a.k(), bundle, fyk.b, null, null);
            }

            public final void a()
            {
                fyk.b(a).a(null);
            }

            public final void a(Object obj)
            {
                obj = (Cursor)obj;
                if (((Cursor) (obj)).moveToFirst())
                {
                    fyk.b(a).a(((Cursor) (obj)));
                    a.Z = true;
                    a.J();
                }
            }

            
            {
                a = fyk.this;
                super();
            }
        };
    }

    static String[] K()
    {
        return aa;
    }

    static Flags a(fyk fyk1)
    {
        return fyk1.ah;
    }

    public static fyk a(Flags flags)
    {
        fyk fyk1 = new fyk();
        fyw.a(fyk1, flags);
        return fyk1;
    }

    static SettingsAdapter b(fyk fyk1)
    {
        return fyk1.ac;
    }

    static dwh c(fyk fyk1)
    {
        return fyk1.am;
    }

    static fsz d(fyk fyk1)
    {
        return fyk1.af;
    }

    public final void A()
    {
        super.A();
        ag.b();
    }

    public final com.spotify.mobile.android.ui.NavigationItem.NavigationGroup A_()
    {
        return com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.m;
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return "config";
    }

    protected final void J()
    {
        if (!Y || !Z)
        {
            return;
        } else
        {
            ad.b();
            return;
        }
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        ah = fyw.a(this);
        ac = new SettingsAdapter(k(), ah);
        af = new fsz(k(), ac) {

            private fyk b;

            public final int a(int i)
            {
                SettingsAdapter settingsadapter = fyk.b(b);
                if (i >= settingsadapter.b.size()) goto _L2; else goto _L1
_L1:
                com.spotify.mobile.android.ui.adapter.SettingsAdapter._cls2.a[((com.spotify.mobile.android.ui.adapter.SettingsAdapter.Item)settingsadapter.b.get(i)).ordinal()];
                JVM INSTR tableswitch 1 26: default 156
            //                           1 163
            //                           2 170
            //                           3 177
            //                           4 163
            //                           5 163
            //                           6 163
            //                           7 163
            //                           8 184
            //                           9 177
            //                           10 177
            //                           11 170
            //                           12 170
            //                           13 170
            //                           14 163
            //                           15 177
            //                           16 156
            //                           17 226
            //                           18 233
            //                           19 233
            //                           20 233
            //                           21 233
            //                           22 233
            //                           23 233
            //                           24 156
            //                           25 156
            //                           26 191;
                   goto _L2 _L3 _L4 _L5 _L3 _L3 _L3 _L3 _L6 _L5 _L5 _L4 _L4 _L4 _L3 _L5 _L2 _L7 _L8 _L8 _L8 _L8 _L8 _L8 _L2 _L2 _L9
_L2:
                return com.spotify.mobile.android.ui.adapter.SettingsAdapter.Group.h.ordinal();
_L3:
                return com.spotify.mobile.android.ui.adapter.SettingsAdapter.Group.a.ordinal();
_L4:
                return com.spotify.mobile.android.ui.adapter.SettingsAdapter.Group.c.ordinal();
_L5:
                return com.spotify.mobile.android.ui.adapter.SettingsAdapter.Group.d.ordinal();
_L6:
                return com.spotify.mobile.android.ui.adapter.SettingsAdapter.Group.e.ordinal();
_L9:
                if (((Boolean)settingsadapter.a.a(fys.k)).booleanValue())
                {
                    return com.spotify.mobile.android.ui.adapter.SettingsAdapter.Group.b.ordinal();
                } else
                {
                    return com.spotify.mobile.android.ui.adapter.SettingsAdapter.Group.h.ordinal();
                }
_L7:
                return com.spotify.mobile.android.ui.adapter.SettingsAdapter.Group.f.ordinal();
_L8:
                return com.spotify.mobile.android.ui.adapter.SettingsAdapter.Group.g.ordinal();
            }

            
            {
                b = fyk.this;
                super(context, listadapter);
            }
        };
        af.a(ac.b());
        a(((ListAdapter) (af)));
        ab = layoutinflater.inflate(0x7f0300d0, viewgroup, false);
        viewgroup = (ListView)ab.findViewById(0x102000a);
        viewgroup.setDivider(null);
        viewgroup.setDividerHeight(0);
        viewgroup = (View)viewgroup.getParent();
        viewgroup.setVisibility(4);
        ad = LoadingView.a(layoutinflater, k(), viewgroup);
        ((ViewGroup)ab).addView(ad, -1, -1);
        ae = (BannerView)ab.findViewById(0x7f110403);
        return ab;
    }

    public final String a(Context context, Flags flags)
    {
        return context.getString(0x7f0804b1);
    }

    public final void a(Context context)
    {
        super.a(context);
        dmz.a(dxd);
        ai = dxd.a(context);
    }

    public final void a(Bundle bundle)
    {
        MethodTraceScope.h.a();
        super.a(bundle);
        a(true);
        ag = ggn.a(k(), ViewUri.H);
        MethodTraceScope.h.b();
        if (bundle != null)
        {
            aj = bundle.getString("username");
            ak = bundle.getBoolean("is_connected");
        } else
        {
            bundle = edb.a(k());
            if (bundle.c())
            {
                aj = bundle.g();
                ak = true;
                return;
            }
        }
    }

    public final void a(ListView listview, View view, int i, long l)
    {
        if (view instanceof AbstractSettingsCell)
        {
            listview = (AbstractSettingsCell)view;
            if (((AbstractSettingsCell) (listview)).c != null)
            {
                ((AbstractSettingsCell) (listview)).c.onClick(listview);
            }
        }
    }

    public final void a(Object obj)
    {
        ((ConnectManager)am.f()).a(an);
    }

    public final void b()
    {
    }

    public final void c()
    {
        super.c();
        ai.a(al);
        ai.a();
        am = new dwh(k());
        am.a(this);
        am.a();
        u().a(0x7f1100a1, null, ap);
        u().a(0x7f1100a4, null, ao);
    }

    public final void d()
    {
        u().a(0x7f1100a1);
        u().a(0x7f1100a4);
        ai.b(al);
        ai.b();
        if (am.c())
        {
            ((ConnectManager)am.f()).b(an);
            am.b();
        }
        super.d();
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putString("username", aj);
        bundle.putBoolean("is_connected", ak);
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.ay;
    }

    public final void z()
    {
        eye eye1;
        super.z();
        ac.notifyDataSetChanged();
        ad.a();
        ag.a();
        eye1 = new eye(ae, ((giq)dmz.a(giq)).b(k()), ViewUri.H, ah, aj);
        if (!ak) goto _L2; else goto _L1
_L1:
        Object obj = (String)eye1.e.a(fys.ay);
        if (obj != null) goto _L4; else goto _L3
_L3:
        boolean flag = false;
_L6:
        if (flag)
        {
            obj = eye1.b.getContext();
            BannerView bannerview = eye1.b;
            BannerItem banneritem = new BannerItem(0x7f110013, ((Context) (obj)).getString(0x7f080393), ((Context) (obj)).getString(0x7f080392), ((Context) (obj)).getString(0x7f080391), null, gcg.b(((Context) (obj)), 0x7f0f0086));
            banneritem.g = false;
            bannerview.a(banneritem);
            eye.a(((Context) (obj)), eye1.d, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.f));
        }
_L2:
        return;
_L4:
        String as[] = ((String) (obj)).split(",");
        if (as.length == 0)
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        if (!"moments".equals(as[0]))
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        if (eye1.b.b != null)
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        if (eye1.c.f(eye.a))
        {
            long l = eye1.c.b(eye.a);
            if (System.currentTimeMillis() - l < TimeUnit.DAYS.toMillis(14L))
            {
                flag = false;
                continue; /* Loop/switch isn't completed */
            }
        }
        flag = true;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static 
    {
        fyk.getSimpleName();
    }
}
