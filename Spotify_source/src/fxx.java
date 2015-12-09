// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.service.ConnectDevice;
import com.spotify.mobile.android.ui.activity.PlayerActivity;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.view.DraggableSeekBar;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.Iterator;
import java.util.List;

public final class fxx extends Fragment
    implements dlb, dwk, fxy
{

    private View Y;
    private TextView Z;
    private View a;
    private ConnectDevice aA;
    private boolean aB;
    private Player aC;
    private Resolver aD;
    private com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver aE;
    private dkz aF;
    private Runnable aG;
    private gar aH;
    private ImageView aa;
    private TextView ab;
    private ListView ac;
    private DraggableSeekBar ad;
    private LinearLayout ae;
    private fsy af;
    private ggl ag;
    private List ah;
    private boolean ai;
    private float aj;
    private float ak;
    private boolean al;
    private gfw am;
    private boolean an;
    private Handler ao;
    private boolean ap;
    private int aq;
    private boolean ar;
    private dwh as;
    private boolean at;
    private gfx au;
    private boolean av;
    private String aw;
    private fao ax;
    private Flags ay;
    private boolean az;
    private View b;

    public fxx()
    {
        aj = 0.0F;
        ak = -1F;
        dmz.a(fop);
        az = true;
        aE = new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver() {

            private fxx a;

            public final void onPlayerStateReceived(PlayerState playerstate)
            {
                boolean flag = Boolean.parseBoolean(ezr.a(playerstate, "is_advertisement"));
                fsy fsy1 = fxx.a(a);
                fsy1.b = flag;
                fsy1.notifyDataSetChanged();
                fxx.a(a, playerstate.isPaused());
                fxx.b(a);
            }

            
            {
                a = fxx.this;
                super();
            }
        };
        aF = new dkz() {

            private fxx a;

            public final void a()
            {
            }

            public final void a(List list, com.spotify.mobile.android.connect.ConnectManager.ConnectState connectstate)
            {
                int i1 = 1;
                boolean flag = false;
                if (!a.q() || !fxx.f(a) || list == null)
                {
                    return;
                }
                fxx.a(a, list);
                list = fxx.a(a);
                list.a = fxx.g(a);
                list.notifyDataSetChanged();
                fxx.a(a, fxx.g(a).size());
                int j1;
                if (fxx.h(a) <= 1)
                {
                    i1 = 0;
                }
                list = fxx.i(a);
                if (i1 != 0)
                {
                    j1 = 8;
                } else
                {
                    j1 = 0;
                }
                list.setVisibility(j1);
                list = fxx.j(a);
                if (i1 != 0)
                {
                    j1 = 0;
                } else
                {
                    j1 = 8;
                }
                list.setVisibility(j1);
                list = fxx.k(a);
                if (i1 != 0)
                {
                    i1 = ((flag) ? 1 : 0);
                } else
                {
                    i1 = 8;
                }
                list.setVisibility(i1);
                fxx.b(a, fxx.g(a));
                if (!fxx.l(a))
                {
                    fxx.b(a, fxx.h(a));
                    fxx.m(a);
                }
                fxx.o(a).removeCallbacks(fxx.n(a));
                fxx.o(a).postDelayed(fxx.n(a), 1500L);
            }

            
            {
                a = fxx.this;
                super();
            }
        };
        aG = new Runnable() {

            private fxx a;

            public final void run()
            {
                fxx.b(a);
            }

            
            {
                a = fxx.this;
                super();
            }
        };
        aH = new gar() {

            private fxx a;

            public final void a()
            {
                fxx.b(a, true);
            }

            public final void a(int i1)
            {
                fxx fxx1 = a;
                int j1 = fxx.e(a).getMax();
                fxx.c(fxx1, (float)(i1 - 6) / (float)j1);
                fxx.s(a);
            }

            public final void a(SeekBar seekbar)
            {
                fxx.c(a, fpl.a(fxx.e(a)));
                fxx.b(a, false);
                fxx.s(a);
            }

            public final void b(int i1)
            {
                fxx fxx1 = a;
                int j1 = fxx.e(a).getMax();
                fxx.c(fxx1, (float)(i1 + 6) / (float)j1);
                fxx.s(a);
            }

            public final void b(SeekBar seekbar)
            {
                fxx.c(a, fpl.a(fxx.e(a)));
            }

            
            {
                a = fxx.this;
                super();
            }
        };
    }

    private void H()
    {
        if (aA != null)
        {
            gci.b(as);
            aA = null;
        }
    }

    private void J()
    {
        if (aA != null)
        {
            Y.setVisibility(0);
            Z.setVisibility(0);
            aa.setImageResource(gci.a(aA));
            ab.setText(gci.a(k(), aA));
            return;
        } else
        {
            Y.setVisibility(8);
            Z.setVisibility(8);
            aa.setImageResource(0x7f020189);
            ab.setText(0x7f0801e2);
            return;
        }
    }

    private AudioManager K()
    {
        return (AudioManager)k().getApplicationContext().getSystemService("audio");
    }

    static int a(fxx fxx1, int i1)
    {
        fxx1.aq = i1;
        return i1;
    }

    static fsy a(fxx fxx1)
    {
        return fxx1.af;
    }

    public static fxx a(Flags flags)
    {
        fxx fxx1 = new fxx();
        fyw.a(fxx1, flags);
        return fxx1;
    }

    static List a(fxx fxx1, List list)
    {
        fxx1.ah = list;
        return list;
    }

    private void a()
    {
        if (as != null && as.c() && q())
        {
            if (aA != null && !ah.contains(aA))
            {
                H();
                af.a(null);
                J();
                return;
            }
            if (aA == null && ((ConnectManager)as.f()).i())
            {
                ConnectDevice connectdevice = ((ConnectManager)as.f()).f();
                if (!az && connectdevice != null)
                {
                    aA = connectdevice;
                    af.a(aA);
                    J();
                    return;
                }
            }
        }
    }

    static void a(fxx fxx1, ConnectDevice connectdevice)
    {
        com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview;
        ClientEvent clientevent;
        if (connectdevice.f)
        {
            subview = com.spotify.mobile.android.util.viewuri.ViewUri.SubView.x;
        } else
        if (connectdevice.j)
        {
            subview = com.spotify.mobile.android.util.viewuri.ViewUri.SubView.v;
        } else
        if (connectdevice.i)
        {
            subview = com.spotify.mobile.android.util.viewuri.ViewUri.SubView.u;
        } else
        {
            subview = com.spotify.mobile.android.util.viewuri.ViewUri.SubView.w;
        }
        clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.ad);
        clientevent.a("name", connectdevice.d);
        fop.a(fxx1.k(), ViewUri.bA, subview, clientevent);
    }

    static void a(fxx fxx1, String s1)
    {
        fxx1.a(s1);
    }

    private void a(String s1)
    {
        av = true;
        aw = s1;
        ax = new fao(k());
        ax.a(new fap() {

            private fxx a;

            public final void a()
            {
                fxx.b(a, fxx.q(a));
                fxx.r(a);
            }

            public final void b()
            {
                a.k().finish();
                fxx.r(a);
            }

            
            {
                a = fxx.this;
                super();
            }
        });
    }

    static boolean a(fxx fxx1, float f1)
    {
        AudioManager audiomanager = fxx1.K();
        int i1 = Math.round((float)audiomanager.getStreamMaxVolume(3) * f1);
        f1 = fpl.a(fxx1.ad);
        return i1 != Math.round((float)audiomanager.getStreamMaxVolume(3) * f1);
    }

    static boolean a(fxx fxx1, boolean flag)
    {
        fxx1.az = flag;
        return flag;
    }

    private float b(float f1)
    {
        boolean flag1 = true;
        boolean flag;
        if (o() && ad != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (al || f1 == -1F || ar)
        {
            flag1 = false;
        }
        if (flag && flag1)
        {
            aj = f1;
            fpl.a(aj, ad);
            f1 = -1F;
        } else
        if (flag)
        {
            return -1F;
        }
        return f1;
    }

    static float b(fxx fxx1, float f1)
    {
        fxx1.aj = f1;
        return f1;
    }

    static void b(fxx fxx1)
    {
        fxx1.a();
    }

    static void b(fxx fxx1, int i1)
    {
        Object obj = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.R, com.spotify.mobile.android.util.ClientEvent.SubEvent.a);
        ((ClientEvent) (obj)).a("device-count", String.valueOf(i1));
        fop.a(fxx1.k(), ViewUri.bA, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, ((ClientEvent) (obj)));
        obj = fxx1.k().getIntent();
        if (obj != null)
        {
            obj = (com.spotify.mobile.android.util.ClientEvent.SubEvent)((Intent) (obj)).getSerializableExtra("picker_opening_source");
            if (obj != null)
            {
                obj = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, ((com.spotify.mobile.android.util.ClientEvent.SubEvent) (obj)));
                fop.a(fxx1.k(), ViewUri.bA, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, ((ClientEvent) (obj)));
            }
        }
    }

    static void b(fxx fxx1, String s1)
    {
        if (fxx1.at)
        {
            ((ConnectManager)fxx1.as.f()).c(s1);
        }
        if (fxx1.aA != null && fxx1.aA.b.equals(s1))
        {
            s1 = new Bundle();
            s1.putBoolean("onboarding_flow_enabled", true);
            Intent intent = (new Intent(fxx1.k(), com/spotify/mobile/android/ui/activity/PlayerActivity)).setFlags(0x4000000);
            intent.putExtras(s1);
            fxx1.a(intent, 1);
        }
        fxx1.k().finish();
    }

    static void b(fxx fxx1, List list)
    {
        boolean flag;
        list = list.iterator();
        flag = false;
_L4:
        if (!list.hasNext()) goto _L2; else goto _L1
_L1:
        ConnectDevice connectdevice;
        boolean flag1;
        connectdevice = (ConnectDevice)list.next();
        flag1 = flag;
        if (connectdevice.e)
        {
            flag1 = flag;
            if (gci.a(fxx1.as))
            {
                flag1 = true;
            }
        }
        flag = flag1;
        if (!connectdevice.e) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (!connectdevice.f) goto _L4; else goto _L5
_L5:
        boolean flag2;
        flag2 = true;
        flag = flag1;
_L11:
        fxx1.al = flag2;
        if (flag2)
        {
            list = fxx1.K();
            fpl.a((float)list.getStreamVolume(3) / (float)list.getStreamMaxVolume(3), fxx1.ad);
        }
        if (!flag) goto _L7; else goto _L6
_L6:
        if (!fxx1.ai)
        {
            list = new gef(fxx1.ae);
            list.b = 0;
            list.a = -fxx1.ae.getMeasuredHeight();
            fxx1.ae.startAnimation(list);
            fxx1.ai = true;
        }
_L9:
        return;
_L7:
        if (!fxx1.ai) goto _L9; else goto _L8
_L8:
        list = new gef(fxx1.ae);
        list.b = -fxx1.ae.getMeasuredHeight();
        list.a = 0;
        fxx1.ae.startAnimation(list);
        fxx1.ai = false;
        return;
_L2:
        flag2 = false;
        if (true) goto _L11; else goto _L10
_L10:
    }

    static boolean b(fxx fxx1, boolean flag)
    {
        fxx1.ar = flag;
        return flag;
    }

    static void c(fxx fxx1, float f1)
    {
        if (fxx1.al)
        {
            AudioManager audiomanager = fxx1.K();
            audiomanager.setStreamVolume(3, Math.round((float)audiomanager.getStreamMaxVolume(3) * f1), 0);
            fxx1.aj = f1;
        } else
        if (fxx1.at)
        {
            fxx1.aj = f1;
            ((ConnectManager)fxx1.as.f()).b(f1);
            return;
        }
    }

    static boolean c(fxx fxx1)
    {
        return fxx1.al;
    }

    static float d(fxx fxx1)
    {
        return fxx1.aj;
    }

    static DraggableSeekBar e(fxx fxx1)
    {
        return fxx1.ad;
    }

    static boolean f(fxx fxx1)
    {
        return fxx1.at;
    }

    static List g(fxx fxx1)
    {
        return fxx1.ah;
    }

    static int h(fxx fxx1)
    {
        return fxx1.aq;
    }

    static View i(fxx fxx1)
    {
        return fxx1.a;
    }

    static ListView j(fxx fxx1)
    {
        return fxx1.ac;
    }

    static TextView k(fxx fxx1)
    {
        return fxx1.ab;
    }

    static boolean l(fxx fxx1)
    {
        return fxx1.ap;
    }

    static boolean m(fxx fxx1)
    {
        fxx1.ap = true;
        return true;
    }

    static Runnable n(fxx fxx1)
    {
        return fxx1.aG;
    }

    static Handler o(fxx fxx1)
    {
        return fxx1.ao;
    }

    static boolean p(fxx fxx1)
    {
        return (new faq(fxx1.k())).b();
    }

    static String q(fxx fxx1)
    {
        return fxx1.aw;
    }

    static boolean r(fxx fxx1)
    {
        fxx1.av = false;
        return false;
    }

    static void s(fxx fxx1)
    {
        if (!fxx1.aB)
        {
            fxx1.aB = true;
            ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.al);
            clientevent.a("volume", String.valueOf(fpl.a(fxx1.ad)));
            fop.a(fxx1.k(), ViewUri.bA, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, clientevent);
        }
    }

    public final void A()
    {
        super.A();
        ao.removeCallbacks(aG);
        if (k().isFinishing())
        {
            H();
        }
        aC.unregisterPlayerStateObserver(aE);
        aD.disconnect();
        ag.b();
        int i1 = aq;
        ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.S, com.spotify.mobile.android.util.ClientEvent.SubEvent.a);
        clientevent.a("device-count", String.valueOf(i1));
        fop.a(k(), ViewUri.bA, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, clientevent);
    }

    public final void B()
    {
        super.B();
        aD.destroy();
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return "devices";
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        ay = fyw.a(this);
        an = ((Boolean)ay.a(fys.l)).booleanValue();
        viewgroup = layoutinflater.inflate(0x7f03007f, viewgroup, false);
        ((TextView)viewgroup.findViewById(0x7f11026e)).setText(0x7f0801e6);
        ac = (ListView)viewgroup.findViewById(0x7f110369);
        layoutinflater = layoutinflater.inflate(0x7f0300c0, null);
        ac.addHeaderView(layoutinflater, null, false);
        b = layoutinflater.findViewById(0x7f1103ec);
        Y = layoutinflater.findViewById(0x7f1103ed);
        Z = (TextView)layoutinflater.findViewById(0x7f1103ee);
        aa = (ImageView)layoutinflater.findViewById(0x7f1103ef);
        ab = (TextView)layoutinflater.findViewById(0x7f1103f0);
        layoutinflater = (ImageButton)viewgroup.findViewById(0x7f1102b9);
        layoutinflater.setImageDrawable(fyd.e(k()));
        layoutinflater.setOnClickListener(new android.view.View.OnClickListener() {

            private fxx a;

            public final void onClick(View view)
            {
                a.k().finish();
            }

            
            {
                a = fxx.this;
                super();
            }
        });
        af = new fsy();
        ac.setAdapter(af);
        ac.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            private fxx a;

            public final void onItemClick(AdapterView adapterview, View view, int i1, long l1)
            {
label0:
                {
                    adapterview = (ConnectDevice)view.getTag();
                    if (!((ConnectDevice) (adapterview)).e && ((ConnectDevice) (adapterview)).g && view.isEnabled())
                    {
                        fxx.a(a, adapterview);
                        if (!fxx.p(a))
                        {
                            break label0;
                        }
                        fxx.a(a, ((ConnectDevice) (adapterview)).b);
                    }
                    return;
                }
                fxx.b(a, ((ConnectDevice) (adapterview)).b);
            }

            
            {
                a = fxx.this;
                super();
            }
        });
        ad = (DraggableSeekBar)viewgroup.findViewById(0x7f110367);
        ad.setMax(100);
        fpl.a(aj, ad);
        ad.a = aH;
        ae = (LinearLayout)viewgroup.findViewById(0x7f110366);
        au = new gfx() {

            private fxx a;

            public final void a(float f1)
            {
                if (fxx.c(a) && fxx.a(a, f1))
                {
                    fxx.b(a, f1);
                    fpl.a(fxx.d(a), fxx.e(a));
                }
            }

            
            {
                a = fxx.this;
                super();
            }
        };
        return viewgroup;
    }

    public final String a(Context context, Flags flags)
    {
        return context.getString(0x7f0801e6);
    }

    public final void a(float f1)
    {
        ak = b(f1);
    }

    public final void a(int i1, int j1, Intent intent)
    {
        super.a(i1, j1, intent);
        if (i1 == 1 && j1 == -1)
        {
            k().setResult(-1);
            k().finish();
        }
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        ay = fyw.a(this);
        ao = new Handler();
        ag = ggn.a(k(), ViewUri.bA);
        a(false);
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
            ai = bundle.getBoolean("key_is_volume_visible");
            aj = bundle.getFloat("key_volume_level", 0.0F);
            al = bundle.getBoolean("key_is_self_active");
            av = bundle.getBoolean("key_sleep_timer_dialog_active");
            aw = bundle.getString("key_selected_device_hash");
        }
        am = new gfw(K(), ao);
        aD = Cosmos.getResolver(k());
    }

    public final void a(View view, Bundle bundle)
    {
        boolean flag = false;
        super.a(view, bundle);
        int i1;
        int j1;
        boolean flag1;
        if (an)
        {
            j1 = 0x7f0801e4;
            i1 = 0;
        } else
        {
            j1 = 0x7f0801e5;
            ab.setVisibility(8);
            i1 = 1;
        }
        a = ggp.a(y(), Integer.valueOf(0x7f020189), Integer.valueOf(j1));
        if (!an)
        {
            b.setVisibility(8);
        }
        if (i1 != 0)
        {
            a.setVisibility(0);
        }
        flag1 = ai;
        view = (android.view.ViewGroup.MarginLayoutParams)ae.getLayoutParams();
        if (flag1)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = -l().getDimensionPixelSize(0x7f0c00c9);
        }
        view.bottomMargin = i1;
        ae.requestLayout();
        if (av)
        {
            a(aw);
        }
    }

    public final void a(Object obj)
    {
        at = true;
        ((ConnectManager)as.f()).a(aF);
        ak = b(ak);
        ((ConnectManager)as.f()).g();
    }

    public final void b()
    {
        at = false;
        a();
    }

    public final void c()
    {
        super.c();
        if (an)
        {
            as = new dwh(k());
            as.a(this);
            as.a();
        }
        k().getContentResolver().registerContentObserver(gfw.a, true, am);
        am.b = au;
    }

    public final void d()
    {
        super.d();
        if (as != null && as.c())
        {
            ((ConnectManager)as.f()).b(aF);
            as.b();
        }
        k().getContentResolver().unregisterContentObserver(am);
        am.b = null;
    }

    public final void e()
    {
        super.e();
        if (ax != null)
        {
            ax.a.dismiss();
        }
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putBoolean("key_is_volume_visible", ai);
        bundle.putFloat("key_volume_level", aj);
        bundle.putBoolean("key_is_self_active", al);
        bundle.putBoolean("key_sleep_timer_dialog_active", av);
        bundle.putString("key_selected_device_hash", aw);
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.ak;
    }

    public final void z()
    {
        super.z();
        aC = ((PlayerFactory)dmz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerFactory)).create(aD, ViewUri.bA.toString(), FeatureIdentifier.ak, gnl.a(g()));
        aC.registerPlayerStateObserver(aE);
        ap = false;
        ag.a();
        if (an && as.c())
        {
            ((ConnectManager)as.f()).c(aF);
            ak = b(ak);
        }
        ao.removeCallbacks(aG);
        ao.postDelayed(aG, 1500L);
    }
}
