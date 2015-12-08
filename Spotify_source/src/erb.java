// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
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
import com.spotify.cosmos.android.DeferredResolver;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.service.ConnectDevice;
import com.spotify.mobile.android.spotlets.connect.Tech;
import com.spotify.mobile.android.spotlets.connect.view.DeviceAdapterMk2;
import com.spotify.mobile.android.ui.activity.PlayerActivity;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.view.DraggableSeekBar;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.List;

public final class erb extends Fragment
    implements dlb, ere, fxy
{

    private DeviceAdapterMk2 Y;
    private ggl Z;
    private erf a;
    private Handler aa;
    private fao ab;
    private Flags ac;
    private DeferredResolver ad;
    private float ae;
    private Runnable af;
    private gar ag;
    private erc b;

    public erb()
    {
        af = new Runnable() {

            private erb a;

            public final void run()
            {
                erb.a(a).a();
            }

            
            {
                a = erb.this;
                super();
            }
        };
        ag = new gar() {

            private erb a;

            public final void a()
            {
                erb.a(a).p = true;
            }

            public final void a(int i)
            {
                erc erc1 = erb.a(a);
                float f1 = erc1.e.c(i - 6);
                erc1.a(f1);
                erc1.g.a(f1);
            }

            public final void a(SeekBar seekbar)
            {
                seekbar = erb.a(a);
                float f1 = ((erc) (seekbar)).e.R();
                seekbar.a(f1);
                seekbar.p = false;
                ((erc) (seekbar)).g.a(f1);
            }

            public final void b(int i)
            {
                erc erc1 = erb.a(a);
                float f1 = erc1.e.c(i + 6);
                erc1.a(f1);
                erc1.g.a(f1);
            }

            public final void b(SeekBar seekbar)
            {
                seekbar = erb.a(a);
                seekbar.a(((erc) (seekbar)).e.R());
            }

            
            {
                a = erb.this;
                super();
            }
        };
    }

    public static erb a(Flags flags)
    {
        erb erb1 = new erb();
        fyw.a(erb1, flags);
        return erb1;
    }

    static erc a(erb erb1)
    {
        return erb1.b;
    }

    public final void A()
    {
        super.A();
        aa.removeCallbacks(af);
        Z.b();
        Object obj = b;
        if (k().isFinishing())
        {
            ((erc) (obj)).b();
        }
        erg erg1 = ((erc) (obj)).g;
        int i = ((erc) (obj)).j;
        obj = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.S, com.spotify.mobile.android.util.ClientEvent.SubEvent.a);
        ((ClientEvent) (obj)).a("device-count", String.valueOf(i));
        fop.a(erg1.a, ViewUri.bA, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, ((ClientEvent) (obj)));
    }

    public final Fragment F()
    {
        return this;
    }

    public final void H()
    {
        k().finish();
    }

    public final String I()
    {
        return "devices";
    }

    public final boolean J()
    {
        return (new faq(k())).b();
    }

    public final void K()
    {
        ab = new fao(k());
        ab.a(new fap() {

            private erb a;

            public final void a()
            {
                erc erc1 = erb.a(a);
                erc1.a(erc1.s);
                erc1.r = false;
            }

            public final void b()
            {
                erc erc1 = erb.a(a);
                erc1.e.H();
                erc1.r = false;
            }

            
            {
                a = erb.this;
                super();
            }
        });
    }

    public final void L()
    {
        aa.removeCallbacks(af);
        aa.postDelayed(af, 1500L);
    }

    public final void M()
    {
        erf erf1 = a;
        if (!erf1.m)
        {
            gef gef1 = new gef(erf1.k);
            gef1.b = 0;
            gef1.a = -erf1.k.getMeasuredHeight();
            erf1.k.startAnimation(gef1);
            erf1.m = true;
        }
    }

    public final void N()
    {
        erf erf1 = a;
        if (erf1.m)
        {
            gef gef1 = new gef(erf1.k);
            gef1.b = -erf1.k.getMeasuredHeight();
            gef1.a = 0;
            erf1.k.startAnimation(gef1);
            erf1.m = false;
        }
    }

    public final void O()
    {
        a.h.setVisibility(8);
    }

    public final void P()
    {
        a.c.setVisibility(0);
    }

    public final boolean Q()
    {
        return o() && a != null && a.j != null;
    }

    public final float R()
    {
        return fpl.a(a.j);
    }

    public final void S()
    {
        a.d.setVisibility(8);
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        ac = fyw.a(this);
        b.n = ((Boolean)ac.a(fys.l)).booleanValue();
        a = new erf(layoutinflater, viewgroup);
        if (bundle != null)
        {
            layoutinflater = a;
            layoutinflater.m = bundle.getBoolean("key_is_volume_visible");
            layoutinflater.a(((erf) (layoutinflater)).m);
        }
        a.l.setOnClickListener(new android.view.View.OnClickListener() {

            private erb a;

            public final void onClick(View view)
            {
                a.k().finish();
            }

            
            {
                a = erb.this;
                super();
            }
        });
        Y = new DeviceAdapterMk2(k());
        a.i.setAdapter(Y);
        a.i.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            private erb a;

            public final void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                ConnectDevice connectdevice;
                erc erc1;
label0:
                {
                    connectdevice = (ConnectDevice)view.getTag();
                    erc1 = erb.a(a);
                    boolean flag = view.isEnabled();
                    if (!connectdevice.e && connectdevice.g && flag)
                    {
                        view = erc1.g;
                        ClientEvent clientevent;
                        if (connectdevice.f)
                        {
                            adapterview = com.spotify.mobile.android.util.viewuri.ViewUri.SubView.x;
                        } else
                        if (connectdevice.j)
                        {
                            adapterview = com.spotify.mobile.android.util.viewuri.ViewUri.SubView.v;
                        } else
                        if (Tech.a(connectdevice) == Tech.b)
                        {
                            adapterview = com.spotify.mobile.android.util.viewuri.ViewUri.SubView.t;
                        } else
                        if (connectdevice.i)
                        {
                            adapterview = com.spotify.mobile.android.util.viewuri.ViewUri.SubView.u;
                        } else
                        {
                            adapterview = com.spotify.mobile.android.util.viewuri.ViewUri.SubView.w;
                        }
                        clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.ad);
                        clientevent.a("name", connectdevice.d);
                        fop.a(((erg) (view)).a, ViewUri.bA, adapterview, clientevent);
                        if (!erc1.e.J())
                        {
                            break label0;
                        }
                        erc1.b(connectdevice.b);
                    }
                    return;
                }
                erc1.a(connectdevice.b);
            }

            
            {
                a = erb.this;
                super();
            }
        });
        layoutinflater = a.j;
        layoutinflater.setMax(100);
        fpl.a(b.m, layoutinflater);
        layoutinflater.a = ag;
        return a.b;
    }

    public final String a(Context context, Flags flags)
    {
        return context.getString(0x7f0801e6);
    }

    public final void a()
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("onboarding_flow_enabled", true);
        Intent intent = (new Intent(k(), com/spotify/mobile/android/ui/activity/PlayerActivity)).setFlags(0x4000000);
        intent.putExtras(bundle);
        a(intent, 1);
    }

    public final void a(float f1)
    {
        ae = f1;
        if (b != null)
        {
            b.c(f1);
        }
    }

    public final void a(int i, int j, Intent intent)
    {
        super.a(i, j, intent);
        if (i == 1 && j == -1)
        {
            k().setResult(-1);
            k().finish();
        }
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        ac = fyw.a(this);
        aa = new Handler();
        Z = ggn.a(k(), ViewUri.bA);
        b = new erc(this, new dwh(k()), new erg(k()), new erh(k(), aa));
        b.c(ae);
        a(false);
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
            bundle = new erd(bundle.getFloat("key_volume_level"), bundle.getBoolean("key_is_self_active"), bundle.getBoolean("key_sleep_timer_dialog_active"), bundle.getString("key_selected_device_hash"));
            erc erc1 = b;
            erc1.m = ((erd) (bundle)).a;
            erc1.k = ((erd) (bundle)).b;
            erc1.r = ((erd) (bundle)).c;
            erc1.s = ((erd) (bundle)).d;
        }
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        view = b;
        boolean flag;
        if (((erc) (view)).n)
        {
            flag = false;
        } else
        {
            ((erc) (view)).e.O();
            flag = true;
        }
        ((erc) (view)).e.e(((erc) (view)).n);
        if (!((erc) (view)).n)
        {
            ((erc) (view)).e.S();
        }
        if (flag)
        {
            ((erc) (view)).e.P();
        }
        if (((erc) (view)).r)
        {
            view.b(((erc) (view)).s);
        }
    }

    public final void a(ConnectDevice connectdevice)
    {
        Object obj = Y;
        obj.d = cty.a(connectdevice, ((DeviceAdapterMk2) (obj)).c);
        obj.c = connectdevice;
        ((DeviceAdapterMk2) (obj)).notifyDataSetChanged();
        obj = a;
        if (connectdevice != null)
        {
            ((erf) (obj)).e.setVisibility(0);
            ((erf) (obj)).f.setVisibility(0);
            ((erf) (obj)).g.setImageResource(gci.a(connectdevice));
            ((erf) (obj)).h.setText(gci.a(((erf) (obj)).a, connectdevice));
            return;
        } else
        {
            ((erf) (obj)).e.setVisibility(8);
            ((erf) (obj)).f.setVisibility(8);
            ((erf) (obj)).g.setImageResource(0x7f020189);
            ((erf) (obj)).h.setText(0x7f0801e3);
            return;
        }
    }

    public final void a(List list)
    {
        DeviceAdapterMk2 deviceadaptermk2 = Y;
        deviceadaptermk2.a = list;
        deviceadaptermk2.notifyDataSetChanged();
    }

    public final void b(float f1)
    {
        fpl.a(f1, a.j);
    }

    public final float c(int i)
    {
        int j = a.j.getMax();
        return (float)i / (float)j;
    }

    public final void c()
    {
        super.c();
        ad = Cosmos.getResolver(k());
        ad.connect();
        Player player = ((PlayerFactory)dmz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerFactory)).create(ad, "spotify:internal:devices", FeatureIdentifier.ak, FeatureIdentifier.I);
        erc erc1 = b;
        if (erc1.n)
        {
            erc1.f.a(erc1.c);
            erc1.f.a();
        }
        erh erh1 = erc1.h;
        gfx gfx = erc1.b;
        erh1.a.getContentResolver().registerContentObserver(gfw.a, true, erh1.b);
        erh1.b.b = gfx;
        erc1.t = player;
        erc1.t.registerPlayerStateObserver(erc1.a);
    }

    public final void d()
    {
        super.d();
        erc erc1 = b;
        if (erc1.n && erc1.f.c())
        {
            ((ConnectManager)erc1.f.f()).b(erc1.d);
            erc1.f.b();
        }
        erh erh1 = erc1.h;
        erh1.a.getContentResolver().unregisterContentObserver(erh1.b);
        erh1.b.b = null;
        erc1.t.unregisterPlayerStateObserver(erc1.a);
        ad.disconnect();
        ad.destroy();
    }

    public final void d(boolean flag)
    {
        boolean flag1 = false;
        Object obj = a;
        Object obj1 = ((erf) (obj)).c;
        int i;
        if (flag)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        ((View) (obj1)).setVisibility(i);
        obj1 = ((erf) (obj)).i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((ListView) (obj1)).setVisibility(i);
        obj = ((erf) (obj)).h;
        if (flag)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 8;
        }
        ((TextView) (obj)).setVisibility(i);
    }

    public final void e()
    {
        super.e();
        if (ab != null)
        {
            ab.a.dismiss();
        }
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putBoolean("key_is_volume_visible", a.m);
        Object obj = b;
        obj = new erd(((erc) (obj)).m, ((erc) (obj)).k, ((erc) (obj)).r, ((erc) (obj)).s);
        bundle.putFloat("key_volume_level", ((erd) (obj)).a);
        bundle.putBoolean("key_is_self_active", ((erd) (obj)).b);
        bundle.putBoolean("key_sleep_timer_dialog_active", ((erd) (obj)).c);
        bundle.putString("key_selected_device_hash", ((erd) (obj)).d);
    }

    public final void e(boolean flag)
    {
        erf erf1;
        int i;
        if (flag)
        {
            i = 0x7f0801e4;
        } else
        {
            i = 0x7f0801e5;
        }
        erf1 = a;
        erf1.c = ggp.a(erf1.b, Integer.valueOf(0x7f020189), Integer.valueOf(i));
    }

    public final void f(boolean flag)
    {
        DeviceAdapterMk2 deviceadaptermk2 = Y;
        deviceadaptermk2.b = flag;
        deviceadaptermk2.notifyDataSetChanged();
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.ak;
    }

    public final void z()
    {
        super.z();
        erc erc1 = b;
        if (erc1.f.c())
        {
            ((ConnectManager)erc1.f.f()).c(erc1.d);
        }
        erc1.q = erc1.b(erc1.q);
        erc1.l = false;
        Z.a();
        aa.removeCallbacks(af);
        aa.postDelayed(af, 1500L);
    }
}
