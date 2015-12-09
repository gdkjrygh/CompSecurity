// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.SectionHeaderView;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.collection.adapter.HeaderableAdapter;
import com.spotify.mobile.android.spotlets.show.model.Show;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;

public final class enc extends emz
{

    private static final gfp aa = new gfp("addTime", 0x7f080522, true);
    private epf ab;
    private ftg ac;
    private fid ad;
    private ListView ae;
    private View af;
    private Parcelable ag;
    private LoadingView ah;
    private String ai;
    private epg aj;
    private com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver ak;
    private final android.widget.AdapterView.OnItemClickListener al = new android.widget.AdapterView.OnItemClickListener() {

        private enc a;

        public final void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            i = enc.e(a).b(i);
            switch (i)
            {
            default:
                throw new AssertionError((new StringBuilder("Unexpected section ")).append(i).toString());

            case 0: // '\0'
                a.a(ClientEventFactory.a("shows", com.spotify.mobile.android.util.ClientEvent.SubEvent.aS, null, null));
                a.a(gms.a(a.k(), "spotify:internal:collection:unplayed-episodes").a);
                // fall through

            case 4: // '\004'
                return;

            case 1: // '\001'
                a.a(ClientEventFactory.a("shows", com.spotify.mobile.android.util.ClientEvent.SubEvent.aT, null, null));
                a.a(gms.a(a.k(), "spotify:internal:collection:offlined-episodes").a);
                return;

            case 2: // '\002'
                a.a(ClientEventFactory.a("shows", com.spotify.mobile.android.util.ClientEvent.SubEvent.aR, null, null));
                a.a(gms.a(a.k(), "spotify:internal:collection:saved-episodes").a);
                return;

            case 3: // '\003'
                adapterview = (Show)view.getTag();
                break;
            }
            a.a(ClientEventFactory.a("shows", com.spotify.mobile.android.util.ClientEvent.SubEvent.aj, adapterview.b(), Long.valueOf(l)));
            a.a(gms.a(a.k(), adapterview.b()).a(adapterview.a()).a);
        }

            
            {
                a = enc.this;
                super();
            }
    };
    private DataSetObserver am;

    public enc()
    {
        super(ViewUri.bt);
        aj = new epg() {

            final enc a;

            public final void a(Object obj)
            {
                boolean flag = false;
                obj = (fis)obj;
                a.o();
                ((fis) (obj)).isLoading();
                int i = ((Show[])((fis) (obj)).getItems()).length;
                if (a.o())
                {
                    boolean flag1;
                    if (((fis) (obj)).getUnrangedLength() == 0)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    if (!((fis) (obj)).isLoading() || !flag1)
                    {
                        a.R();
                        a.O();
                        enc.b(a).post(new Runnable(this, flag1) {

                            private boolean a;
                            private _cls1 b;

                            public final void run()
                            {
                                if (enc.a(b.a) != null && !a)
                                {
                                    enc.b(b.a).onRestoreInstanceState(enc.a(b.a));
                                    enc.c(b.a);
                                }
                            }

            
            {
                b = _pcls1;
                a = flag;
                super();
            }
                        });
                        if (enc.d(a).d())
                        {
                            enc.d(a).b();
                        }
                        int j;
                        if (((fis) (obj)).a() > 0)
                        {
                            j = 1;
                        } else
                        {
                            j = 0;
                        }
                        if (flag1 && j != 0)
                        {
                            enc.e(a).b(new int[] {
                                4
                            });
                        } else
                        {
                            enc.e(a).a(new int[] {
                                4
                            });
                        }
                        obj = enc.f(a);
                        if (flag1 && j == 0)
                        {
                            j = ((flag) ? 1 : 0);
                        } else
                        {
                            j = 8;
                        }
                        ((View) (obj)).setVisibility(j);
                    }
                }
            }

            public final void a(String s)
            {
                enc.d(a).b();
                Logger.c("Failed to load list of shows %s", new Object[] {
                    s
                });
            }

            
            {
                a = enc.this;
                super();
            }
        };
        ak = new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver() {

            private enc a;

            public final void onPlayerStateReceived(PlayerState playerstate)
            {
                enc.g(a).a(playerstate.entityUri());
            }

            
            {
                a = enc.this;
                super();
            }
        };
        am = new DataSetObserver() {

            private enc a;

            public final void onChanged()
            {
                enc.e(a).d(3);
            }

            
            {
                a = enc.this;
                super();
            }
        };
    }

    static Parcelable a(enc enc1)
    {
        return enc1.ag;
    }

    public static enc a(Flags flags, String s)
    {
        Bundle bundle = new Bundle();
        enc enc1 = new enc();
        bundle.putString("username", s);
        enc1.f(bundle);
        fyw.a(enc1, flags);
        return enc1;
    }

    static ListView b(enc enc1)
    {
        return enc1.ae;
    }

    static Parcelable c(enc enc1)
    {
        enc1.ag = null;
        return null;
    }

    static LoadingView d(enc enc1)
    {
        return enc1.ah;
    }

    static ftg e(enc enc1)
    {
        return enc1.ac;
    }

    static View f(enc enc1)
    {
        return enc1.af;
    }

    static fid g(enc enc1)
    {
        return enc1.ad;
    }

    protected final epf H()
    {
        return ab;
    }

    public final String I()
    {
        return "collection_shows";
    }

    protected final HeaderableAdapter J()
    {
        return ad;
    }

    protected final epg K()
    {
        return aj;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.a(layoutinflater, viewgroup, bundle);
        viewgroup = (ViewGroup)layoutinflater.inflate(0x7f0300cf, viewgroup, false);
        ae = (ListView)viewgroup.findViewById(0x102000a);
        ae.setOnItemClickListener(al);
        ae.setOnItemLongClickListener(new fuf(k()));
        ae.setFastScrollEnabled(true);
        af = eoo.d(k(), false);
        af.setVisibility(8);
        viewgroup.addView(af);
        ac = new ftg(k());
        ac.a(new ftm(eor.a(k(), SpotifyIcon.aX, 0x7f080198), true), null, 0);
        ac.a(new ftm(eor.a(k(), SpotifyIcon.q, 0x7f080193), true), null, 1);
        if (fiy.d(super.Z))
        {
            ac.a(new ftm(eor.a(k(), SpotifyIcon.aX, 0x7f080196), true), null, 2);
        }
        SectionHeaderView sectionheaderview = new SectionHeaderView(k());
        sectionheaderview.a(b(0x7f0801a6));
        sectionheaderview.b(true);
        ac.a(new ftm(sectionheaderview, false), null, 0x80000000);
        ad = new fid(k(), new fil(k(), super.a, ai), super.b, super.Z);
        ad.a(aa);
        ad.registerDataSetObserver(am);
        ac.a(ad, null, 3);
        ac.a(new ftm(eoo.d(k(), true), false), null, 4);
        ac.a(new int[] {
            3, 4
        });
        ae.setAdapter(ac);
        ah = LoadingView.a(layoutinflater, k(), ae);
        viewgroup.addView(ah);
        ah.a();
        ae.setVisibility(4);
        ab.a(bundle, aj);
        ad.a(bundle);
        ad.a();
        return viewgroup;
    }

    protected final com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver a()
    {
        return ak;
    }

    public final String a(Context context, Flags flags)
    {
        return context.getString(0x7f0801a1);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (g() != null)
        {
            ai = g().getString("username");
        }
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
            if (bundle.containsKey("list"))
            {
                ag = bundle.getParcelable("list");
            }
        }
        if (ab == null)
        {
            ab = new fil(k(), super.a, ai);
        }
        ab.a(Integer.valueOf(0), Integer.valueOf(0));
        ab.a(aa);
    }

    public final void a(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
    }

    public final void e()
    {
        super.e();
        ad.unregisterDataSetObserver(am);
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        ab.a(bundle);
        if (ae != null)
        {
            bundle.putParcelable("list", ae.onSaveInstanceState());
        }
        if (ad != null)
        {
            ad.b(bundle);
        }
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.r;
    }

}
