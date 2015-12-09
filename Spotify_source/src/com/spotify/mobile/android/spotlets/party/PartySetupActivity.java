// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.party;

import android.animation.ValueAnimator;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelUuid;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.common.collect.Lists;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.android.paste.widget.SpotifyIconView;
import com.spotify.android.paste.widget.StickyRecyclerView;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.party.adapter.PartyTracksAdapter;
import com.spotify.mobile.android.spotlets.party.json.TrackJacksonModel;
import com.spotify.mobile.android.spotlets.party.json.TracksJacksonModel;
import com.spotify.mobile.android.spotlets.party.view.ModeTunerView;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.stuff.ContentViewManager;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import dmz;
import eda;
import edb;
import eyh;
import eyi;
import eyk;
import eyn;
import eyo;
import eyq;
import eys;
import eyt;
import eyu;
import eyv;
import eyw;
import eyx;
import fos;
import fou;
import fyw;
import gaa;
import gcl;
import gex;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

public class PartySetupActivity extends fou
    implements eda, eyi
{

    private String d;
    private Flags i;
    private Resolver j;
    private eyh k;
    private RecyclerView l;
    private eyv m;
    private PartyTracksAdapter n;
    private ContentViewManager o;
    private eyn p;
    private AdvertiseCallback q;
    private TracksJacksonModel r;
    private eyt s;
    private final eyx t = new eyx() {

        private PartySetupActivity a;

        public final void a(int i1)
        {
            eyh eyh1 = PartySetupActivity.a(a);
            i1++;
            if (eyh1.h != i1)
            {
                eyh1.h = i1;
                eyh1.a();
                eyh1.b.a(eyh1.f, eyh1.h, Lists.a(new String[] {
                    eyh1.g
                }), eyh1.k);
            }
        }

            
            {
                a = PartySetupActivity.this;
                super();
            }
    };
    private final android.view.View.OnClickListener u = new android.view.View.OnClickListener() {

        private PartySetupActivity a;

        public final void onClick(View view)
        {
            view = PartySetupActivity.a(a);
            if (((eyh) (view)).i != null)
            {
                ((eyh) (view)).d.a(((eyh) (view)).i, 0);
                ((eyh) (view)).a.g();
            }
        }

            
            {
                a = PartySetupActivity.this;
                super();
            }
    };
    private final eyk v = new eyk() {

        private PartySetupActivity a;

        public final void a(TrackJacksonModel trackjacksonmodel)
        {
            eyh eyh1 = PartySetupActivity.a(a);
            if (eyh1.b != null)
            {
                if (gex.a(eyh1.e))
                {
                    int i1 = eyh1.i.tracks.indexOf(trackjacksonmodel);
                    trackjacksonmodel = eyh1.d;
                    TracksJacksonModel tracksjacksonmodel = eyh1.i;
                    if (i1 < 0)
                    {
                        i1 = 0;
                    }
                    trackjacksonmodel.a(tracksjacksonmodel, i1);
                } else
                {
                    eyh1.d.a(eyh1.i, 0);
                }
                eyh1.a.g();
            }
        }

            
            {
                a = PartySetupActivity.this;
                super();
            }
    };

    public PartySetupActivity()
    {
    }

    public static Intent a(Context context, String s1, String s2, Flags flags)
    {
        context = new Intent(context, com/spotify/mobile/android/spotlets/party/PartySetupActivity);
        context.putExtra("preset", s1);
        context.putExtra("username", s2);
        fyw.a(context, flags);
        return context;
    }

    static eyh a(PartySetupActivity partysetupactivity)
    {
        return partysetupactivity.k;
    }

    static String b(PartySetupActivity partysetupactivity)
    {
        return partysetupactivity.d;
    }

    static PartyTracksAdapter c(PartySetupActivity partysetupactivity)
    {
        return partysetupactivity.n;
    }

    private void h()
    {
        if (r != null && s != null)
        {
            o.b(null);
            ModeTunerView modetunerview = m.a;
            ValueAnimator valueanimator = ValueAnimator.ofFloat(new float[] {
                0.0F, 1.0F
            });
            valueanimator.setDuration(1000L);
            valueanimator.setInterpolator(new DecelerateInterpolator());
            valueanimator.addUpdateListener(new com.spotify.mobile.android.spotlets.party.view.ModeTunerView._cls2(modetunerview));
            valueanimator.start();
        }
    }

    public final void a(SessionState sessionstate)
    {
        if (sessionstate == null)
        {
            return;
        }
        boolean flag = sessionstate.e;
        boolean flag1 = sessionstate.g;
        if (!flag || flag1)
        {
            finish();
            return;
        }
        ContentViewManager contentviewmanager = o;
        if (!sessionstate.j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        contentviewmanager.a(flag);
    }

    public final void a(TracksJacksonModel tracksjacksonmodel)
    {
        PartyTracksAdapter partytracksadapter;
        boolean flag;
        if (r == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        r = tracksjacksonmodel;
        partytracksadapter = n;
        partytracksadapter.c = tracksjacksonmodel;
        partytracksadapter.c();
        if (flag)
        {
            h();
        }
    }

    public final void a(eyt eyt1)
    {
        eyv eyv1;
        boolean flag;
        if (s == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s = eyt1;
        eyv1 = m;
        if (eyt1 != null)
        {
            eyv1.a.a(eyt1.b.toUpperCase(Locale.getDefault()));
            ArrayList arraylist = Lists.b(eyt1.a.size());
            ArrayList arraylist1 = Lists.b(eyt1.a.size());
            eys eys1;
            for (eyt1 = eyt1.a.iterator(); eyt1.hasNext(); arraylist1.add(eys1.a))
            {
                eys1 = (eys)eyt1.next();
                arraylist.add(eys1.b);
            }

            eyv1.a.a(arraylist);
            eyv1.a.b(arraylist1);
        } else
        {
            eyv1.a.a(null);
            eyv1.a.a(null);
            eyv1.a.b(null);
        }
        if (flag)
        {
            h();
        }
    }

    public final edb c()
    {
        return h;
    }

    public final void f()
    {
        Object obj = m.a;
        obj.a = 1;
        obj = ((ModeTunerView) (obj)).e;
        obj.a = 0.0F;
        obj.b = 1;
        ((eyw) (obj)).a();
    }

    public final void g()
    {
        finish();
        dmz.a(fos);
        fos.a(this, ViewUri.m.toString());
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Object obj = getIntent().getExtras();
        d = ((Bundle) (obj)).getString("username");
        bundle = ((Bundle) (obj)).getString("preset");
        i = fyw.a(((Bundle) (obj)));
        j = Cosmos.getResolver(this);
        obj = j;
        String s1 = d;
        Flags flags = i;
        Handler handler = new Handler(getMainLooper());
        k = new eyh(this, new eyq(((Resolver) (obj)), handler), new eyo(((Resolver) (obj)), handler), new eyu(((Resolver) (obj))), bundle, s1, flags);
        setContentView(0x7f03002a);
        bundle = (StickyRecyclerView)findViewById(0x7f1102bf);
        bundle.setId(0);
        m = new eyv(bundle, t, u);
        l = bundle.a();
        n = new PartyTracksAdapter(this, ViewUri.m, v, i);
        l.a(n);
        l.a(new LinearLayoutManager());
        ((SpotifyIconView)findViewById(0x7f1102b9)).setOnClickListener(new android.view.View.OnClickListener() {

            private PartySetupActivity a;

            public final void onClick(View view)
            {
                a.finish();
            }

            
            {
                a = PartySetupActivity.this;
                super();
            }
        });
        o = (new gaa(this, (EmptyView)findViewById(0x7f1102c0), bundle)).a(0x7f0802ad, 0x7f0802ac).a();
        bundle.setVisibility(4);
        k.a.f();
        if (gcl.j)
        {
            p = new eyn(((BluetoothManager)getSystemService("bluetooth")).getAdapter());
            q = new AdvertiseCallback() {

                private PartySetupActivity a;

                public final void onStartFailure(int i1)
                {
                    PartySetupActivity.c(a).d = "Nearby: ERROR device supports BLE advertising but it failed";
                }

                public final void onStartSuccess(AdvertiseSettings advertisesettings)
                {
                    super.onStartSuccess(advertisesettings);
                    PartySetupActivity.c(a).d = (new StringBuilder("Nearby: ADVERTISING user ")).append(PartySetupActivity.b(a)).toString();
                }

            
            {
                a = PartySetupActivity.this;
                super();
            }
            };
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        j.destroy();
    }

    protected void onPause()
    {
        super.onPause();
        if (p != null && p.a(this))
        {
            eyn eyn1 = p;
            AdvertiseCallback advertisecallback = q;
            if (eyn1.b != null)
            {
                eyn1.b.setName(eyn1.c);
                eyn1.b.getBluetoothLeAdvertiser().stopAdvertising(advertisecallback);
            }
        }
    }

    protected void onResume()
    {
        super.onResume();
        if (p != null && p.a(this))
        {
            eyn eyn1 = p;
            String s1 = d;
            AdvertiseCallback advertisecallback = q;
            if (eyn1.b != null && eyn1.b.isEnabled())
            {
                BluetoothLeAdvertiser bluetoothleadvertiser = eyn1.b.getBluetoothLeAdvertiser();
                eyn1.c = eyn1.b.getName();
                eyn1.b.setName(s1);
                bluetoothleadvertiser.startAdvertising((new android.bluetooth.le.AdvertiseSettings.Builder()).setAdvertiseMode(2).setTimeout(0).setTxPowerLevel(2).setConnectable(false).build(), (new android.bluetooth.le.AdvertiseData.Builder()).addServiceUuid(ParcelUuid.fromString(eyn1.a.toString())).setIncludeDeviceName(true).build(), advertisecallback);
            }
            return;
        } else
        {
            n.d = "Nearby: ERROR device does not support BLE advertising or BT is turned off";
            return;
        }
    }

    protected void onStart()
    {
        super.onStart();
        h.a(this);
        j.connect();
        Object obj2 = k;
        Object obj = Lists.a(new String[] {
            ((eyh) (obj2)).g
        });
        ((eyh) (obj2)).b.a(((eyh) (obj2)).f, ((eyh) (obj2)).h, ((List) (obj)), ((eyh) (obj2)).k);
        Object obj1 = ((eyh) (obj2)).c;
        obj = ((eyh) (obj2)).f;
        obj2 = ((eyh) (obj2)).l;
        obj2 = new eyo._cls1(((eyo) (obj1)).a, eyt, ((eyp) (obj2)));
        obj1 = ((eyo) (obj1)).b;
        StringBuilder stringbuilder = new StringBuilder("hm://group-moments/v1/presets");
        stringbuilder.append('/');
        stringbuilder.append(((String) (obj)));
        stringbuilder.append("?locale=");
        stringbuilder.append(Locale.getDefault().toString());
        ((Resolver) (obj1)).resolve(RequestBuilder.get(stringbuilder.toString()).build(), ((com.spotify.cosmos.android.Resolver.CallbackReceiver) (obj2)));
    }

    protected void onStop()
    {
        super.onStop();
        h.b(this);
        j.disconnect();
    }
}
