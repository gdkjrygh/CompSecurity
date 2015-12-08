// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.controller.NetworkStateBroadcastReveiver;
import com.cardinalblue.android.piccollage.controller.o;
import com.cardinalblue.android.piccollage.iab.util.d;
import com.cardinalblue.android.piccollage.iab.util.g;
import com.cardinalblue.android.piccollage.model.InstalledStickerBundle;
import com.cardinalblue.android.piccollage.model.StickerBundle;
import com.cardinalblue.android.piccollage.model.gson.Sticker;
import com.cardinalblue.android.piccollage.model.memento.BaseMemento;
import com.cardinalblue.android.piccollage.model.memento.IMemento;
import com.cardinalblue.android.piccollage.model.n;
import com.cardinalblue.android.piccollage.view.a.u;
import com.cardinalblue.android.piccollage.view.a.v;
import com.cardinalblue.android.piccollage.view.fragments.e;
import com.supersonic.mediationsdk.logger.SupersonicError;
import com.supersonic.mediationsdk.model.Placement;
import com.supersonic.mediationsdk.sdk.RewardedVideoListener;
import com.supersonic.mediationsdk.sdk.Supersonic;
import com.supersonic.mediationsdk.sdk.SupersonicFactory;
import com.vungle.publisher.AdConfig;
import com.vungle.publisher.Orientation;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            BaseFragmentActivity

public class StickersActivity extends BaseFragmentActivity
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener, com.cardinalblue.android.piccollage.view.fragments.t.a, Observer
{
    private static class a extends Handler
    {

        private final WeakReference a;

        public void handleMessage(Message message)
        {
            StickersActivity stickersactivity = (StickersActivity)a.get();
            message.what;
            JVM INSTR tableswitch 0 2: default 40
        //                       0 41
        //                       1 50
        //                       2 77;
               goto _L1 _L2 _L3 _L4
_L1:
            return;
_L2:
            if (stickersactivity != null)
            {
                com.cardinalblue.android.piccollage.activities.StickersActivity.e(stickersactivity);
                return;
            }
            continue; /* Loop/switch isn't completed */
_L3:
            if (stickersactivity != null)
            {
                if (com.cardinalblue.android.piccollage.activities.StickersActivity.f(stickersactivity) == null)
                {
                    com.cardinalblue.android.piccollage.activities.StickersActivity.e(stickersactivity);
                }
                com.cardinalblue.android.piccollage.activities.StickersActivity.f(stickersactivity).setProgress(message.arg1);
                return;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            if (stickersactivity != null)
            {
                com.cardinalblue.android.b.k.a(stickersactivity, com.cardinalblue.android.piccollage.activities.StickersActivity.f(stickersactivity));
                return;
            }
            if (true) goto _L1; else goto _L5
_L5:
        }

        public a(StickersActivity stickersactivity)
        {
            a = new WeakReference(stickersactivity);
        }
    }

    public static class b
    {

        public final boolean a;

        public b(boolean flag)
        {
            a = flag;
        }
    }


    private static Placement x;
    d a;
    RewardedVideoListener b;
    Handler c;
    private int d;
    private v e;
    private u f;
    private ViewPager g;
    private ViewSwitcher h;
    private IMemento i;
    private MenuItem j;
    private boolean k;
    private ProgressDialog l;
    private NetworkStateBroadcastReveiver m;
    private String n;
    private View o;
    private o p;
    private StickerBundle q;
    private StickerBundle r;
    private boolean s;
    private boolean t;
    private View u;
    private TextView v;
    private Supersonic w;

    public StickersActivity()
    {
        d = 30;
        i = new BaseMemento();
        k = false;
        n = "com.cardinalblue.sticker.menu";
        s = false;
        b = new RewardedVideoListener() {

            final StickersActivity a;

            public void onRewardedVideoAdClosed()
            {
            }

            public void onRewardedVideoAdOpened()
            {
            }

            public void onRewardedVideoAdRewarded(Placement placement)
            {
                StickersActivity.a(placement);
            }

            public void onRewardedVideoInitFail(SupersonicError supersonicerror)
            {
                com.cardinalblue.android.piccollage.a.f.a(new Exception(supersonicerror.getErrorMessage()));
            }

            public void onRewardedVideoInitSuccess()
            {
            }

            public void onRewardedVideoShowFail(SupersonicError supersonicerror)
            {
                com.cardinalblue.android.piccollage.a.f.a(new Exception(supersonicerror.getErrorMessage()));
            }

            public void onVideoAvailabilityChanged(boolean flag)
            {
                bolts.j.a(new Callable(this, flag) {

                    final boolean a;
                    final _cls1 b;

                    public Object call()
                        throws Exception
                    {
                        StickersActivity.a(b.a, a);
                        com.cardinalblue.android.piccollage.controller.d.a().c(new b(a));
                        return null;
                    }

            
            {
                b = _pcls1;
                a = flag;
                super();
            }
                }, j.b);
            }

            public void onVideoEnd()
            {
            }

            public void onVideoStart()
            {
            }

            
            {
                a = StickersActivity.this;
                super();
            }
        };
        t = false;
        c = new a(this);
    }

    static u a(StickersActivity stickersactivity)
    {
        return stickersactivity.f;
    }

    static Placement a(Placement placement)
    {
        x = placement;
        return placement;
    }

    private void a()
    {
        boolean flag = false;
        int j1 = h().size();
        if (v != null)
        {
            Object obj = v;
            int i1;
            if (j1 > 0)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            ((TextView) (obj)).setVisibility(i1);
            v.setText(Integer.toString(j1));
        }
        if (u != null)
        {
            obj = u;
            if (j1 > 0)
            {
                flag = true;
            }
            ((View) (obj)).setEnabled(flag);
        }
    }

    static void a(StickersActivity stickersactivity, String s1)
    {
        stickersactivity.a(s1);
    }

    private void a(String s1)
    {
        n = s1;
        i.a().putString("key_last_bundle_id", n);
    }

    private void a(boolean flag)
    {
        if (!flag)
        {
            o.setVisibility(0);
            return;
        } else
        {
            o.setVisibility(8);
            return;
        }
    }

    static boolean a(StickersActivity stickersactivity, boolean flag)
    {
        stickersactivity.s = flag;
        return flag;
    }

    static Supersonic b(StickersActivity stickersactivity)
    {
        return stickersactivity.w;
    }

    private void b()
    {
        if (g.getCurrentItem() < e.getCount() - 1)
        {
            g.setCurrentItem(g.getCurrentItem() + 1, true);
        }
    }

    private void b(Placement placement)
    {
        if (r == null)
        {
            com.cardinalblue.android.piccollage.a.f.a(new NullPointerException("mWatchingVideoAdStickerBundle should not be null"));
            return;
        }
        placement = com.cardinalblue.android.piccollage.controller.o.a();
        com.cardinalblue.android.b.k.c(r.f());
        placement.n();
        if (r instanceof InstalledStickerBundle)
        {
            com.cardinalblue.android.piccollage.a.b.bK();
        } else
        {
            com.cardinalblue.android.piccollage.a.b.bJ();
        }
        bolts.j.a(new Callable(placement) {

            final o a;
            final StickersActivity b;

            public Object call()
                throws Exception
            {
                a.a(com.cardinalblue.android.piccollage.activities.StickersActivity.g(b));
                com.cardinalblue.android.piccollage.controller.d.a().c(new com.cardinalblue.android.piccollage.view.fragments.FreeStickerBundleFragment.OnVideoAdFinishedEvent(com.cardinalblue.android.piccollage.activities.StickersActivity.g(b)));
                return null;
            }

            
            {
                b = StickersActivity.this;
                a = o1;
                super();
            }
        }, j.b);
    }

    private void b(String s1)
    {
        if ("com.cardinalblue.sticker.menu".equals(s1))
        {
            f();
        } else
        {
            g();
            int i1 = e.a(s1, 0);
            g.setCurrentItem(i1);
        }
        a(s1);
    }

    static StickerBundle c(StickersActivity stickersactivity)
    {
        return stickersactivity.q;
    }

    private void c()
    {
        int i1 = g.getCurrentItem();
        if (i1 > 0)
        {
            g.setCurrentItem(i1 - 1, true);
        }
    }

    static MenuItem d(StickersActivity stickersactivity)
    {
        return stickersactivity.j;
    }

    private j d()
    {
        bolts.j.a a1 = bolts.j.a();
        Log.v("StickersActivity", "Creating IAB helper.");
        a = new d(this, com.cardinalblue.android.b.k.o());
        a.a(false);
        Log.v("StickersActivity", "Starting setup.");
        a.a(new com.cardinalblue.android.piccollage.iab.util.d.d(a1) {

            final bolts.j.a a;
            final StickersActivity b;

            public void a(com.cardinalblue.android.piccollage.iab.util.e e1)
            {
                Log.v("StickersActivity", "Setup finished.");
                if (!e1.c())
                {
                    Log.v("StickersActivity", (new StringBuilder()).append("Problem setting up in-app billing: ").append(e1).toString());
                    a.a(new IllegalStateException((new StringBuilder()).append("Problem setting up in-app billing: ").append(e1).toString()));
                    return;
                } else
                {
                    Log.v("StickersActivity", "Setup successful.");
                    a.a(e1);
                    return;
                }
            }

            
            {
                b = StickersActivity.this;
                a = a1;
                super();
            }
        });
        return a1.a();
    }

    static void e(StickersActivity stickersactivity)
    {
        stickersactivity.j();
    }

    private boolean e()
    {
        return h.getDisplayedChild() == 0;
    }

    static ProgressDialog f(StickersActivity stickersactivity)
    {
        return stickersactivity.l;
    }

    private void f()
    {
        if (h.getDisplayedChild() != 0)
        {
            h.setInAnimation(AnimationUtils.loadAnimation(this, 0x7f040032));
            h.setOutAnimation(AnimationUtils.loadAnimation(this, 0x7f040037));
            h.setDisplayedChild(0);
        }
        if (h().isEmpty())
        {
            k = false;
            supportInvalidateOptionsMenu();
        }
        a("com.cardinalblue.sticker.menu");
        if (t)
        {
            com.cardinalblue.android.piccollage.controller.o.a().q();
            t = false;
        }
    }

    static StickerBundle g(StickersActivity stickersactivity)
    {
        return stickersactivity.r;
    }

    private void g()
    {
        if (h.getDisplayedChild() != 1)
        {
            h.setInAnimation(AnimationUtils.loadAnimation(this, 0x7f040033));
            h.setOutAnimation(AnimationUtils.loadAnimation(this, 0x7f040036));
            h.setDisplayedChild(1);
        }
        k = true;
        supportInvalidateOptionsMenu();
    }

    private ArrayList h()
    {
        return p.h();
    }

    private Intent i()
    {
        Intent intent = new Intent();
        intent.putExtra("stickers", h());
        intent.putExtra("key_memento", i);
        return intent;
    }

    private void j()
    {
        if (l == null)
        {
            l = com.cardinalblue.android.b.j.a(this, 0x7f070132);
            l.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

                final StickersActivity a;

                public void onCancel(DialogInterface dialoginterface)
                {
                    com.cardinalblue.android.piccollage.controller.o.a().o();
                }

            
            {
                a = StickersActivity.this;
                super();
            }
            });
        }
        l.show();
    }

    private void k()
    {
        b(n);
    }

    private void l()
    {
        com.cardinalblue.android.piccollage.controller.o.a().j();
        k();
    }

    private void o()
    {
        com.cardinalblue.android.piccollage.a.b.aI("sticker page");
    }

    private void p()
    {
        w = SupersonicFactory.getInstance();
        w.setRewardedVideoListener(b);
        String s1 = com.cardinalblue.android.b.k.c(com.cardinalblue.android.b.k.a());
        w.initRewardedVideo(this, getString(0x7f070390), s1);
    }

    public void a(StickerBundle stickerbundle)
    {
        String s1;
label0:
        {
            if (stickerbundle != null)
            {
                s1 = stickerbundle.l();
                if (s1 != null)
                {
                    break label0;
                }
            }
            com.cardinalblue.android.b.k.a(this, 0x7f0700f8, 1);
            return;
        }
        if (a != null && a.c())
        {
            q = stickerbundle;
            try
            {
                a.a(this, s1, 701, new com.cardinalblue.android.piccollage.iab.util.d.c(s1) {

                    final String a;
                    final StickersActivity b;

                    public void a(com.cardinalblue.android.piccollage.iab.util.e e1, g g1)
                    {
                        boolean flag;
                        Log.v("StickersActivity", (new StringBuilder()).append("Purchase finished: ").append(e1).append(", purchase: ").append(g1).toString());
                        while (b.a == null || e1 == null) 
                        {
                            return;
                        }
                        if (e1.a() == 7)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        if (!e1.d() || flag) goto _L2; else goto _L1
_L1:
                        e1.a();
                        JVM INSTR tableswitch 6 6: default 96
                    //                                   6 128;
                           goto _L3 _L4
_L3:
                        Log.v("StickersActivity", (new StringBuilder()).append("Error purchasing: ").append(e1).toString());
                        return;
_L4:
                        ArrayList arraylist = new ArrayList();
                        arraylist.add(a);
                        b.a.a(true, arraylist, new com.cardinalblue.android.piccollage.iab.util.d.e(this, g1) {

                            final g a;
                            final _cls5 b;

                            public void a(com.cardinalblue.android.piccollage.iab.util.e e1, com.cardinalblue.android.piccollage.iab.util.f f1)
                            {
                                Log.v("StickersActivity", "Query inventory finished.");
                                if (e1.d())
                                {
                                    Log.v("StickersActivity", (new StringBuilder()).append("Failed to query inventory: ").append(e1).toString());
                                } else
                                {
                                    Log.v("StickersActivity", "Query inventory was successful.");
                                    e1 = f1.a(b.a);
                                    if (a != null)
                                    {
                                        b.b.a.a(e1, null);
                                        return;
                                    }
                                }
                            }

            
            {
                b = _pcls5;
                a = g1;
                super();
            }
                        });
                        if (true) goto _L3; else goto _L2
_L2:
                        if (flag)
                        {
                            com.cardinalblue.android.b.k.a(b, 0x7f0701ef, 0);
                        } else
                        {
                            String s3 = g1.d();
                            String s2;
                            if (b.getIntent().hasExtra("key_purchase_bundle"))
                            {
                                s2 = "IAP interstitial";
                            } else
                            {
                                s2 = "sticker store";
                            }
                            com.cardinalblue.android.piccollage.a.b.f(s3, s2);
                        }
                        Log.v("StickersActivity", "Purchase successful.");
                        (new Handler()).post(new Runnable(this, g1, e1) {

                            final g a;
                            final com.cardinalblue.android.piccollage.iab.util.e b;
                            final _cls5 c;

                            public void run()
                            {
                                if (a != null)
                                {
                                    com.cardinalblue.android.piccollage.a.f.a(a.b(), a.c(), a.d(), StickersActivity.c(c.b).d());
                                } else
                                {
                                    com.cardinalblue.android.piccollage.a.f.a(new com.cardinalblue.android.piccollage.model.k.a(b.b()));
                                }
                                com.cardinalblue.android.piccollage.controller.o.a().a(StickersActivity.c(c.b));
                            }

            
            {
                c = _pcls5;
                a = g1;
                b = e1;
                super();
            }
                        });
                        return;
                    }

            
            {
                b = StickersActivity.this;
                a = s1;
                super();
            }
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (StickerBundle stickerbundle)
            {
                com.cardinalblue.android.b.k.a(this, 0x7f07010e, 1);
            }
            return;
        } else
        {
            com.cardinalblue.android.b.k.a(this, com.cardinalblue.android.piccollage.view.fragments.e.a(null, getString(0x7f07023f), getString(0x104000a), null), "CANNOT_BIND_IAB");
            return;
        }
    }

    public void a(Sticker sticker)
    {
        p.a(sticker, false);
        a();
    }

    public boolean b(Sticker sticker)
    {
        if (h().size() < d)
        {
            p.a(sticker, true);
            a();
            return true;
        } else
        {
            com.cardinalblue.android.b.k.a(this, String.format(getString(0x7f0702a4), new Object[] {
                Integer.valueOf(30)
            }), 0);
            return false;
        }
    }

    public b getVideoAdPlayableEvent()
    {
        return new b(s);
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        Log.v("StickersActivity", (new StringBuilder()).append("onActivityResult(").append(i1).append(",").append(j1).append(",").append(intent).toString());
        if (a == null || !a.a(i1, j1, intent))
        {
            super.onActivityResult(i1, j1, intent);
            return;
        } else
        {
            Log.v("StickersActivity", "onActivityResult handled by IabHelper.");
            return;
        }
    }

    public void onBackPressed()
    {
        if (e())
        {
            setResult(0, i());
            super.onBackPressed();
            return;
        } else
        {
            f();
            o();
            return;
        }
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131755257: 
            c();
            return;

        case 2131755259: 
            b();
            return;

        case 2131755258: 
            f();
            o();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        String s1;
        String s2;
        s1 = null;
        super.onCreate(bundle);
        setContentView(0x7f03003d);
        setSupportActionBar((Toolbar)findViewById(0x7f1000c5));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        p = com.cardinalblue.android.piccollage.controller.o.a();
        p.addObserver(this);
        s2 = getIntent().getStringExtra("from");
        if (bundle == null) goto _L2; else goto _L1
_L1:
        ArrayList arraylist = bundle.getParcelableArrayList("selected_stickers");
        p.a(arraylist);
        a(bundle.getString("key_last_bundle_id"));
        if (bundle.containsKey("key_purchasing_sticker"))
        {
            q = (StickerBundle)bundle.getParcelable("key_purchasing_sticker");
        }
        if (bundle.containsKey("key_video_ad_sticker"))
        {
            r = (StickerBundle)bundle.getParcelable("key_video_ad_sticker");
        }
        t = bundle.getBoolean("key_should_resort_sticker_list");
        s = bundle.getBoolean("key_current_ad_playable");
        com.cardinalblue.android.piccollage.controller.o.a().q();
_L7:
        Object obj;
        p();
        e = new v(getSupportFragmentManager());
        f = new u(this);
        h = (ViewSwitcher)findViewById(0x7f1000f2);
        g = (ViewPager)findViewById(0x7f1000f7);
        g.setOffscreenPageLimit(2);
        g.setAdapter(e);
        obj = (RecyclerView)h.findViewById(0x7f1000f4);
        ((RecyclerView) (obj)).setLayoutManager(new GridLayoutManager(this, getResources().getInteger(0x7f090040)));
        ((RecyclerView) (obj)).setHasFixedSize(true);
        ((RecyclerView) (obj)).addItemDecoration(new com.cardinalblue.android.piccollage.view.j(getResources().getDimensionPixelSize(0x7f0b0066)));
        ((RecyclerView) (obj)).setAdapter(f);
        f.a(this);
        o = findViewById(0x7f1000f5);
        a();
        try
        {
            obj = d();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((Exception) (obj)).printStackTrace();
            obj = null;
        }
        if ("com.cardinalblue.sticker.moveto".equals(getIntent().getAction()))
        {
            s1 = n;
        }
        g.addOnPageChangeListener(new android.support.v4.view.ViewPager.OnPageChangeListener(s1, s2) {

            final String a;
            final String b;
            final StickersActivity c;

            public void onPageScrollStateChanged(int i1)
            {
            }

            public void onPageScrolled(int i1, float f1, int j1)
            {
            }

            public void onPageSelected(int i1)
            {
                StickerBundle stickerbundle = StickersActivity.a(c).a(i1);
                if (stickerbundle != null)
                {
                    StickersActivity.a(c, stickerbundle.f());
                    StickersActivity.a(c, com.cardinalblue.android.piccollage.activities.StickersActivity.b(c).isRewardedVideoAvailable());
                    String s3;
                    n n1;
                    if (stickerbundle.f().equals(a))
                    {
                        s3 = b;
                    } else
                    {
                        s3 = "sticker preview list";
                    }
                    n1 = stickerbundle.h();
                    com.cardinalblue.android.piccollage.a.b.n(stickerbundle.f(), s3);
                    if (n1 != null && n1.a() != null && !n1.a().isEmpty())
                    {
                        com.cardinalblue.android.piccollage.a.b.k(n1.a(), "sticker pack");
                    }
                }
            }

            
            {
                c = StickersActivity.this;
                a = s1;
                b = s2;
                super();
            }
        });
        findViewById(0x7f1000f9).setOnClickListener(this);
        findViewById(0x7f1000fb).setOnClickListener(this);
        findViewById(0x7f1000fa).setOnClickListener(this);
        k();
        if (bundle != null) goto _L4; else goto _L3
_L3:
        bundle = getIntent().getStringExtra("key_purchase_bundle");
        if (!TextUtils.isEmpty(bundle) && obj != null && !com.cardinalblue.android.piccollage.controller.o.a().a(bundle).g()) goto _L5; else goto _L4
_L4:
        return;
_L2:
        com.cardinalblue.android.piccollage.a.b.aI(s2);
        i = (IMemento)getIntent().getExtras().getParcelable("key_memento");
        if (i.a().containsKey("key_last_bundle_id"))
        {
            n = i.a().getString("key_last_bundle_id");
        }
        continue; /* Loop/switch isn't completed */
_L5:
        ((j) (obj)).a(new i(bundle) {

            final String a;
            final StickersActivity b;

            public Object then(j j1)
                throws Exception
            {
                j1 = com.cardinalblue.android.piccollage.controller.o.a();
                com.cardinalblue.android.piccollage.a.b.b("IAP interstitial", "sticker store", a);
                b.a(j1.a(a));
                return null;
            }

            
            {
                b = StickersActivity.this;
                a = s1;
                super();
            }
        }, j.b);
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f11001d, menu);
        j = menu.findItem(0x7f1002ea);
        j.setVisible(k);
        menu = MenuItemCompat.getActionView(j);
        u = menu.findViewById(0x7f1000bf);
        u.setOnClickListener(new android.view.View.OnClickListener() {

            final StickersActivity a;

            public void onClick(View view)
            {
                a.onOptionsItemSelected(com.cardinalblue.android.piccollage.activities.StickersActivity.d(a));
            }

            
            {
                a = StickersActivity.this;
                super();
            }
        });
        v = (TextView)menu.findViewById(0x7f1000c0);
        a();
        return true;
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (a != null)
        {
            a.a();
            a = null;
        }
        g.clearOnPageChangeListeners();
        com.cardinalblue.android.piccollage.controller.o.a().i();
        com.cardinalblue.android.piccollage.controller.o.a().deleteObserver(this);
        com.cardinalblue.android.piccollage.controller.o.a().k();
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        g();
        g.setCurrentItem(i1, false);
        a(f.a(i1).f());
    }

    public void onNetworkStateChange(com.cardinalblue.android.piccollage.controller.NetworkStateBroadcastReveiver.NetworkStateChangeEvent networkstatechangeevent)
    {
        if (!com.cardinalblue.android.b.k.a(this))
        {
            return;
        } else
        {
            a(networkstatechangeevent.a());
            e.a(networkstatechangeevent.a());
            f.a(networkstatechangeevent.a());
            k();
            return;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR lookupswitch 2: default 32
    //                   16908332: 38
    //                   2131755754: 44;
           goto _L1 _L2 _L3
_L1:
        return super.onOptionsItemSelected(menuitem);
_L2:
        onBackPressed();
_L5:
        return true;
_L3:
        if (h().isEmpty())
        {
            setResult(0);
        } else
        {
            l();
            setResult(-1, i());
        }
        if (t)
        {
            com.cardinalblue.android.piccollage.controller.o.a().q();
            t = false;
        }
        finish();
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected void onPause()
    {
        super.onPause();
        com.cardinalblue.android.piccollage.controller.d.a(this);
        com.cardinalblue.android.piccollage.controller.d.a(m);
        unregisterReceiver(m);
        m = null;
        if (w != null)
        {
            w.onPause(this);
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        if (j == null)
        {
            j = menu.findItem(0x7f1002ea);
            return true;
        } else
        {
            return super.onPrepareOptionsMenu(menu);
        }
    }

    protected void onResume()
    {
        super.onResume();
        com.cardinalblue.android.piccollage.controller.d.b(this);
        m = new NetworkStateBroadcastReveiver();
        com.cardinalblue.android.piccollage.controller.d.b(m);
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(m, intentfilter);
        if (w != null)
        {
            w.onResume(this);
        }
        if (x != null)
        {
            b(x);
            x = null;
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("selected_stickers", h());
        bundle.putString("key_last_bundle_id", n);
        bundle.putBoolean("key_current_ad_playable", s);
        if (q != null)
        {
            bundle.putParcelable("key_purchasing_sticker", q);
        }
        if (r != null)
        {
            bundle.putParcelable("key_video_ad_sticker", r);
        }
        bundle.putBoolean("key_should_resort_sticker_list", t);
    }

    public void onWatchVideoForDownloadStickerPack(com.cardinalblue.android.piccollage.view.fragments.FreeStickerBundleFragment.OnWatchVideoForDownloadPackEvent onwatchvideofordownloadpackevent)
    {
        r = onwatchvideofordownloadpackevent.a;
        onwatchvideofordownloadpackevent = new AdConfig();
        onwatchvideofordownloadpackevent.setOrientation(Orientation.autoRotate);
        if (com.cardinalblue.android.b.d.a())
        {
            onwatchvideofordownloadpackevent.setBackButtonImmediatelyEnabled(true);
        }
        w.showRewardedVideo();
    }

    public void setContentView(int i1)
    {
        super.setContentView(i1);
        d = getIntent().getExtras().getInt("max_choices", 30);
    }

    public void update(Observable observable, Object obj)
    {
        observable = (com.cardinalblue.android.piccollage.controller.o.a)obj;
        static class _cls9
        {

            static final int a[];

            static 
            {
                a = new int[com.cardinalblue.android.piccollage.controller.o.a.a.values().length];
                try
                {
                    a[com.cardinalblue.android.piccollage.controller.o.a.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[com.cardinalblue.android.piccollage.controller.o.a.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[com.cardinalblue.android.piccollage.controller.o.a.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.cardinalblue.android.piccollage.controller.o.a.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.cardinalblue.android.piccollage.controller.o.a.a.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.cardinalblue.android.piccollage.controller.o.a.a.f.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.cardinalblue.android.piccollage.controller.o.a.a.g.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls9.a[((com.cardinalblue.android.piccollage.controller.o.a) (observable)).a.ordinal()];
        JVM INSTR tableswitch 1 7: default 60
    //                   1 61
    //                   2 71
    //                   3 104
    //                   4 168
    //                   5 196
    //                   6 214
    //                   7 256;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        return;
_L2:
        c.sendEmptyMessage(0);
        return;
_L3:
        observable = c.obtainMessage(1, Integer.valueOf(((com.cardinalblue.android.piccollage.controller.o.a) (observable)).b.toString()).intValue(), -1);
        c.sendMessage(observable);
        return;
_L4:
        c.sendEmptyMessage(2);
        if (q != null)
        {
            b(q.f());
            q = null;
        } else
        if (r != null)
        {
            b(r.f());
            r = null;
        }
        t = true;
        return;
_L5:
        c.sendEmptyMessage(2);
        com.cardinalblue.android.b.k.a(this, Integer.valueOf(((com.cardinalblue.android.piccollage.controller.o.a) (observable)).b.toString()).intValue(), 0);
        return;
_L6:
        c.sendEmptyMessage(2);
        com.cardinalblue.android.b.k.a(this, 0x7f070130, 0);
        return;
_L7:
        c.sendEmptyMessage(2);
        e.notifyDataSetChanged();
        f.notifyDataSetChanged();
        if (((com.cardinalblue.android.piccollage.controller.o.a) (observable)).b != null)
        {
            b(((com.cardinalblue.android.piccollage.controller.o.a) (observable)).b.toString());
            return;
        }
          goto _L1
_L8:
        c.sendEmptyMessage(2);
        e.notifyDataSetChanged();
        f.notifyDataSetChanged();
        k();
        return;
    }
}
