// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.bumptech.glide.h;
import com.bumptech.glide.load.b.e;
import com.bumptech.glide.p;
import com.roidapp.baselib.b.a;
import com.roidapp.baselib.c.an;
import com.roidapp.baselib.e.l;
import com.roidapp.baselib.view.FixedDrawerLayout;
import com.roidapp.photogrid.common.cc;
import com.roidapp.photogrid.release.ParentActivity;
import com.roidapp.photogrid.release.ih;
import com.roidapp.photogrid.video.onlinemusic.Genre;
import com.roidapp.photogrid.video.onlinemusic.LocalTrack;
import com.roidapp.photogrid.video.onlinemusic.Track;
import java.util.Locale;

// Referenced classes of package com.roidapp.photogrid.video:
//            ce, ae, bg, bh, 
//            ay, q, XListView, ad, 
//            af, ag, ai, ah, 
//            ao, aj, ak, al, 
//            am, an, av, ax, 
//            aw, bf, g, f, 
//            aq, ar, as, au, 
//            at, ap, az, ba, 
//            bb, bc, bd, be, 
//            MusicPlayerService

public class TrackSelector extends ParentActivity
    implements android.view.View.OnClickListener, ce
{

    private AlertDialog A;
    private Context B;
    private ProgressBar C;
    private TextView D;
    private f E;
    private int F;
    private boolean G;
    private boolean H;
    private LocalTrack I;
    private Handler J;
    private int K;
    private int L;
    private boolean M;
    private AlertDialog N;
    private String O;
    private ServiceConnection P;
    private MusicPlayerService Q;
    private Intent R;
    private BroadcastReceiver S;
    q a;
    private FixedDrawerLayout b;
    private LinearLayout c;
    private ListView d;
    private XListView e;
    private int f;
    private ad g;
    private g h;
    private TextView i;
    private View j;
    private View k;
    private RelativeLayout l;
    private TextView m;
    private TextView n;
    private LinearLayout o;
    private Button p;
    private RelativeLayout q;
    private LinearLayout r;
    private ImageView s;
    private ProgressBar y;
    private AlertDialog z;

    public TrackSelector()
    {
        f = 0;
        F = 0x989680;
        G = false;
        H = false;
        I = null;
        J = new ae(this);
        K = com.roidapp.photogrid.video.bg.a;
        L = 0;
        M = false;
        N = null;
        O = null;
        P = new bh(this, (byte)0);
        Q = null;
        S = new ay(this);
    }

    static AlertDialog A(TrackSelector trackselector)
    {
        return trackselector.z;
    }

    static AlertDialog B(TrackSelector trackselector)
    {
        trackselector.z = null;
        return null;
    }

    static AlertDialog C(TrackSelector trackselector)
    {
        trackselector.A = null;
        return null;
    }

    static ListView D(TrackSelector trackselector)
    {
        return trackselector.d;
    }

    static int E(TrackSelector trackselector)
    {
        return trackselector.f;
    }

    static LinearLayout F(TrackSelector trackselector)
    {
        return trackselector.c;
    }

    static FixedDrawerLayout G(TrackSelector trackselector)
    {
        return trackselector.b;
    }

    static TextView H(TrackSelector trackselector)
    {
        return trackselector.m;
    }

    static AlertDialog I(TrackSelector trackselector)
    {
        return trackselector.N;
    }

    static AlertDialog J(TrackSelector trackselector)
    {
        trackselector.N = null;
        return null;
    }

    static Intent K(TrackSelector trackselector)
    {
        return trackselector.R;
    }

    static int a(TrackSelector trackselector, int i1)
    {
        trackselector.L = i1;
        return i1;
    }

    static AlertDialog a(TrackSelector trackselector)
    {
        return trackselector.A;
    }

    static MusicPlayerService a(TrackSelector trackselector, MusicPlayerService musicplayerservice)
    {
        trackselector.Q = musicplayerservice;
        return musicplayerservice;
    }

    private static String a(String s1, String s2)
    {
        if (s1 != null && s1.length() != 0) goto _L2; else goto _L1
_L1:
        String s3 = "";
_L4:
        return s3;
_L2:
        int k1;
        int i1 = s1.toLowerCase(Locale.ENGLISH).indexOf("http://") + 7;
        k1 = i1;
        if (i1 >= 7)
        {
            break; /* Loop/switch isn't completed */
        }
        k1 = s1.toLowerCase().indexOf("https://") + 8;
        s3 = s1;
        if (k1 < 8) goto _L4; else goto _L3
_L3:
label0:
        {
            int j1;
            int l1;
            if (s2 == null)
            {
                j1 = -1;
            } else
            {
                j1 = s1.toLowerCase(Locale.ENGLISH).indexOf(s2, k1) + s2.length();
            }
            if (s2 != null)
            {
                l1 = j1;
                if (j1 >= s2.length())
                {
                    break label0;
                }
            }
            l1 = s1.length();
        }
        return s1.substring(k1, l1);
    }

    private void a(int i1)
    {
        if (g != null)
        {
            F = i1;
            if (a != null)
            {
                L = a.e(F);
            }
            e.a(false);
            e.c();
            if (F == 0x989682)
            {
                if (L > 0)
                {
                    e.a();
                } else
                {
                    e.b(false);
                }
            } else
            {
                e.b(true);
            }
            g.notifyDataSetChanged();
        }
    }

    static void a(TrackSelector trackselector, int i1, boolean flag)
    {
        if (!com.roidapp.baselib.e.l.b(trackselector.B) || flag)
        {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(trackselector.B);
            builder.setOnKeyListener(new af(trackselector));
            builder.setOnCancelListener(new ag(trackselector));
            builder.setTitle(trackselector.B.getString(0x7f070035)).setMessage(trackselector.B.getString(0x7f07003a)).setPositiveButton(trackselector.B.getString(0x7f07003c), new ai(trackselector, i1)).setNegativeButton(trackselector.B.getString(0x7f070034), new ah(trackselector)).show();
        } else
        if (trackselector.a != null)
        {
            trackselector.q.setVisibility(8);
            if (trackselector.G)
            {
                trackselector.a.a(trackselector.F);
                return;
            } else
            {
                trackselector.a.a();
                return;
            }
        }
    }

    static void a(TrackSelector trackselector, LocalTrack localtrack)
    {
        trackselector.I = localtrack;
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(trackselector);
        View view = trackselector.getLayoutInflater().inflate(0x7f030090, null);
        ImageView imageview = (ImageView)view.findViewById(0x7f0d0228);
        TextView textview = (TextView)view.findViewById(0x7f0d0229);
        TextView textview1 = (TextView)view.findViewById(0x7f0d022a);
        com.bumptech.glide.h.a(trackselector).a(localtrack.getTrack().thumb_url).a(e.c).g().b(com.roidapp.baselib.b.a.b()).a(imageview);
        textview.setText(localtrack.getTrack().track_title);
        textview1.setText((new StringBuilder("By ")).append(localtrack.getTrack().artist_name).toString());
        trackselector.C = (ProgressBar)view.findViewById(0x7f0d0232);
        trackselector.D = (TextView)view.findViewById(0x7f0d0231);
        builder.setView(view);
        builder.setNegativeButton(0x7f070049, new ao(trackselector, localtrack));
        trackselector.A = builder.create();
        trackselector.A.setCancelable(false);
        trackselector.A.show();
    }

    static void a(TrackSelector trackselector, String s1)
    {
        trackselector.O = s1;
        Intent intent = new Intent("MusicPlayerService.PlayMusic");
        intent.putExtra("MusicPlayerService.Source", s1);
        trackselector.B.sendBroadcast(intent);
    }

    static void a(TrackSelector trackselector, String s1, String s2)
    {
        if (trackselector.A != null)
        {
            trackselector.A.dismiss();
        }
        trackselector.I = null;
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setDataAndType(Uri.parse((new StringBuilder("file:///")).append(s1).toString()), "audio/*");
        ih.C().f(s2);
        trackselector.setResult(43524, intent);
        trackselector.finish();
    }

    static boolean a(TrackSelector trackselector, boolean flag)
    {
        trackselector.M = flag;
        return flag;
    }

    static Context b(TrackSelector trackselector)
    {
        return trackselector.B;
    }

    static void b(TrackSelector trackselector, int i1)
    {
        trackselector.a(i1);
    }

    static void b(TrackSelector trackselector, LocalTrack localtrack)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(trackselector);
        View view = trackselector.getLayoutInflater().inflate(0x7f03008f, null);
        Object obj = (ImageView)view.findViewById(0x7f0d0228);
        TextView textview = (TextView)view.findViewById(0x7f0d0229);
        TextView textview1 = (TextView)view.findViewById(0x7f0d022a);
        ImageView imageview = (ImageView)view.findViewById(0x7f0d022d);
        if (imageview != null)
        {
            imageview.setOnClickListener(new aj(trackselector));
        }
        com.bumptech.glide.h.a(trackselector).a(localtrack.getTrack().thumb_url).a(e.c).g().b(com.roidapp.baselib.b.a.b()).a(((ImageView) (obj)));
        textview.setText(localtrack.getTrack().track_title);
        textview1.setText((new StringBuilder("By ")).append(localtrack.getTrack().artist_name).toString());
        obj = (TextView)view.findViewById(0x7f0d022e);
        ((TextView) (obj)).setText(Html.fromHtml((new StringBuilder("<u>")).append(a(localtrack.getTrack().track_url, "/")).append("...</u>").toString()));
        ((TextView) (obj)).setOnClickListener(new ak(trackselector, localtrack));
        obj = (TextView)view.findViewById(0x7f0d022f);
        ((TextView) (obj)).setText(Html.fromHtml((new StringBuilder("<u>")).append(a(localtrack.getTrack().license_url, "licenses/")).append("...</u>").toString()));
        ((TextView) (obj)).setOnClickListener(new al(trackselector, localtrack));
        obj = (TextView)view.findViewById(0x7f0d0230);
        ((TextView) (obj)).setText(Html.fromHtml((new StringBuilder("<u>")).append(a(localtrack.getTrack().artist_url, ((String) (null)))).append("</u>").toString()));
        ((TextView) (obj)).setOnClickListener(new am(trackselector, localtrack));
        builder.setView(view);
        builder.setPositiveButton(0x7f0701c6, new com.roidapp.photogrid.video.an(trackselector, localtrack));
        trackselector.z = builder.create();
        trackselector.z.show();
    }

    static boolean b(TrackSelector trackselector, boolean flag)
    {
        trackselector.H = flag;
        return flag;
    }

    static int c(TrackSelector trackselector, int i1)
    {
        trackselector.f = i1;
        return i1;
    }

    static ProgressBar c(TrackSelector trackselector)
    {
        return trackselector.C;
    }

    static int d(TrackSelector trackselector, int i1)
    {
        trackselector.K = i1;
        return i1;
    }

    static TextView d(TrackSelector trackselector)
    {
        return trackselector.D;
    }

    private void d()
    {
        if (J != null)
        {
            J.removeMessages(4097);
            J.removeMessages(4098);
            J.removeMessages(4099);
            J.removeMessages(8193);
            J.removeMessages(8194);
            J.removeMessages(8195);
            J.removeMessages(8195);
            J.removeMessages(8197);
            J.removeMessages(12289);
            J.removeMessages(12290);
            J.removeMessages(16385);
            J.removeMessages(16386);
            J.removeMessages(16388);
            J.removeMessages(16387);
        }
    }

    static int e(TrackSelector trackselector)
    {
        return trackselector.F;
    }

    static int e(TrackSelector trackselector, int i1)
    {
        trackselector.F = i1;
        return i1;
    }

    static int f(TrackSelector trackselector)
    {
        return trackselector.L;
    }

    private void f()
    {
        if (O != null)
        {
            O = null;
            Intent intent = new Intent("MusicPlayerService.StopMusic");
            B.sendBroadcast(intent);
        }
    }

    static ad g(TrackSelector trackselector)
    {
        return trackselector.g;
    }

    static XListView h(TrackSelector trackselector)
    {
        return trackselector.e;
    }

    static g i(TrackSelector trackselector)
    {
        return trackselector.h;
    }

    static RelativeLayout j(TrackSelector trackselector)
    {
        return trackselector.l;
    }

    static RelativeLayout k(TrackSelector trackselector)
    {
        return trackselector.q;
    }

    static void l(TrackSelector trackselector)
    {
        trackselector.f();
    }

    static LinearLayout m(TrackSelector trackselector)
    {
        return trackselector.o;
    }

    static boolean n(TrackSelector trackselector)
    {
        return trackselector.M;
    }

    static void o(TrackSelector trackselector)
    {
        View view = LayoutInflater.from(trackselector.B).inflate(0x7f030132, null);
        View view1 = LayoutInflater.from(trackselector).inflate(0x7f0300e9, null);
        ImageView imageview = (ImageView)view1.findViewById(0x7f0d03b0);
        if (imageview != null)
        {
            imageview.setOnClickListener(new av(trackselector));
        }
        trackselector.N = (new android.app.AlertDialog.Builder(trackselector.B)).setCustomTitle(view1).setView(view).setPositiveButton(trackselector.getResources().getString(0x7f0701ca), new ax(trackselector)).setOnCancelListener(new aw(trackselector)).show();
    }

    static void p(TrackSelector trackselector)
    {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("audio/*");
        try
        {
            trackselector.startActivityForResult(intent, 43524);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (TrackSelector trackselector)
        {
            trackselector.printStackTrace();
        }
    }

    static ProgressBar q(TrackSelector trackselector)
    {
        return trackselector.y;
    }

    static LinearLayout r(TrackSelector trackselector)
    {
        return trackselector.r;
    }

    static void s(TrackSelector trackselector)
    {
        trackselector.e = (XListView)trackselector.findViewById(0x7f0d03b7);
        trackselector.g = new ad(trackselector, trackselector.E);
        trackselector.e.setAdapter(trackselector.g);
        trackselector.e.setOnItemClickListener(new bf(trackselector));
        trackselector.e.a(trackselector);
    }

    static void t(TrackSelector trackselector)
    {
        trackselector.b = (FixedDrawerLayout)trackselector.findViewById(0x7f0d002d);
        trackselector.b.setFocusableInTouchMode(false);
        trackselector.c = (LinearLayout)trackselector.findViewById(0x7f0d002f);
        trackselector.d = (ListView)trackselector.findViewById(0x7f0d0031);
        trackselector.h = new g(trackselector, trackselector.E);
        trackselector.d.setAdapter(trackselector.h);
        if (trackselector.E == null) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L7:
        if (i1 >= trackselector.E.a()) goto _L2; else goto _L3
_L3:
        if (trackselector.E.a(i1) == null || trackselector.E.a(i1).genre_id != trackselector.F) goto _L5; else goto _L4
_L4:
        trackselector.f = i1;
        trackselector.m.setText(trackselector.E.a(i1).genre_title);
_L2:
        if (trackselector.F != 0x989680)
        {
            if (trackselector.J != null && trackselector.F != 0x989682)
            {
                if (trackselector.E.b() <= 0)
                {
                    trackselector.J.sendMessage(trackselector.J.obtainMessage(8197, trackselector.F, 1));
                } else
                {
                    trackselector.J.sendMessage(trackselector.J.obtainMessage(8197, trackselector.F, 0));
                }
            }
            if (trackselector.e != null && (!com.roidapp.baselib.e.l.b(trackselector.B) || trackselector.E.b() <= 0 && trackselector.F != 0x989682))
            {
                trackselector.e.a(true);
            }
            if (trackselector.F == 0x989682)
            {
                if (trackselector.E.b() > 0)
                {
                    trackselector.e.a();
                } else
                {
                    trackselector.e.b(false);
                }
            }
        }
        trackselector.h.a(trackselector.f);
        trackselector.d.setOnItemClickListener(new aq(trackselector));
        return;
_L5:
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static boolean u(TrackSelector trackselector)
    {
        trackselector.G = true;
        return true;
    }

    static void v(TrackSelector trackselector)
    {
        if (trackselector.E.b() <= 0)
        {
            trackselector.o.setVisibility(0);
            trackselector.l.setVisibility(8);
            trackselector.q.setVisibility(8);
        } else
        {
            trackselector.q.setVisibility(0);
            trackselector.y.setVisibility(8);
            trackselector.r.setVisibility(0);
            trackselector.o.setVisibility(8);
        }
        if (trackselector.e != null)
        {
            trackselector.e.b(false);
        }
    }

    static Handler w(TrackSelector trackselector)
    {
        return trackselector.J;
    }

    static LocalTrack x(TrackSelector trackselector)
    {
        return trackselector.I;
    }

    static LocalTrack y(TrackSelector trackselector)
    {
        trackselector.I = null;
        return null;
    }

    static f z(TrackSelector trackselector)
    {
        return trackselector.E;
    }

    public final void a()
    {
        if (!a.a(F))
        {
            Log.e("selector", " not data");
            e.b(false);
            return;
        } else
        {
            Log.e("selector", " has data");
            e.b(true);
            return;
        }
    }

    public final void b()
    {
        if (F == 0x989682)
        {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(B);
            builder.setOnKeyListener(new ar(this));
            builder.setOnCancelListener(new as(this));
            builder.setTitle("Clear History").setMessage("Do you want to clear history?").setPositiveButton(B.getString(0x7f070058), new au(this)).setNegativeButton(B.getString(0x7f070034), new at(this)).show();
            a(F);
        }
    }

    public void finish()
    {
        d();
        if (e != null)
        {
            e.setAdapter(null);
            e.a(true);
        }
        I = null;
        f();
        if (a != null)
        {
            a.b();
        }
        a = null;
        super.finish();
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        i1;
        JVM INSTR lookupswitch 4: default 44
    //                   20481: 74
    //                   20482: 112
    //                   20483: 141
    //                   43524: 52;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        super.onActivityResult(i1, j1, intent);
_L7:
        return;
_L5:
        if (intent != null && intent.getData() != null)
        {
            setResult(j1, intent);
            finish();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (o.getVisibility() != 0)
        {
            l.setVisibility(0);
        }
        if (a != null)
        {
            a.a(F);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        q.setVisibility(8);
        if (a != null)
        {
            a.a(F);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (a != null)
        {
            a.a(F);
            return;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void onClick(View view)
    {
        view.getId();
        JVM INSTR lookupswitch 2: default 32
    //                   2131559290: 33
    //                   2131559345: 132;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (d != null)
        {
            if (d.getAdapter() == null)
            {
                if (FixedDrawerLayout.g(c))
                {
                    b.f(c);
                    return;
                } else
                {
                    K = bg.f;
                    b.e(c);
                    return;
                }
            }
            if (FixedDrawerLayout.g(c))
            {
                b.f(c);
                return;
            } else
            {
                K = bg.f;
                b.e(c);
                return;
            }
        }
          goto _L1
_L3:
        finish();
        return;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        B = this;
        try
        {
            setContentView(0x7f0300ea);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle.printStackTrace();
            v = true;
            (new cc(this)).a();
        }
        if (v) goto _L2; else goto _L1
_L1:
        if (com.roidapp.baselib.e.l.b(B))
        {
            F = getSharedPreferences(getPackageName(), 0).getInt("last_gener_id", 0x989680);
        }
        j = findViewById(0x7f0d03b1);
        j.setOnClickListener(new ap(this));
        k = findViewById(0x7f0d037a);
        k.setOnClickListener(this);
        i = (TextView)findViewById(0x7f0d03b2);
        i.setOnClickListener(new az(this));
        l = (RelativeLayout)findViewById(0x7f0d040d);
        (new StringBuilder("progressbar:")).append(l);
        o = (LinearLayout)findViewById(0x7f0d03b8);
        p = (Button)findViewById(0x7f0d03b9);
        p.setOnClickListener(new ba(this));
        m = (TextView)findViewById(0x7f0d037b);
        m.setText("All Genres");
        q = (RelativeLayout)findViewById(0x7f0d03b3);
        bundle = q;
        byte byte0;
        if (com.roidapp.baselib.e.l.b(B))
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        bundle.setVisibility(byte0);
        r = (LinearLayout)findViewById(0x7f0d03b4);
        y = (ProgressBar)findViewById(0x7f0d03b6);
        s = (ImageView)findViewById(0x7f0d03b5);
        s.setOnClickListener(new bb(this));
        n = (TextView)findViewById(0x7f0d03b1);
        n.setOnClickListener(this);
        a = new q(this, new bc(this), com.roidapp.baselib.d.a.b());
        E = new bd(this);
        a.a(new be(this));
        a.a();
        JVM INSTR tableswitch 0 3: default 432
    //                   0 618
    //                   1 546
    //                   2 558
    //                   3 584;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        R = new Intent(B, com/roidapp/photogrid/video/MusicPlayerService);
        B.bindService(R, P, 1);
        bundle = new IntentFilter();
        bundle.addAction("MusicPlayerService.onError");
        bundle.addAction("MusicPlayerServic.onComplete");
        bundle.addAction("MusicPlayerService.onInfo");
        bundle.addAction("MusicPlayerService.onPrepared");
        B.registerReceiver(S, bundle);
_L2:
        return;
_L5:
        l.setVisibility(8);
        continue; /* Loop/switch isn't completed */
_L6:
        an.a(this, getResources().getString(0x7f0702f5));
        l.setVisibility(8);
        continue; /* Loop/switch isn't completed */
_L7:
        H = true;
        o.setVisibility(0);
        q.setVisibility(8);
        l.setVisibility(8);
        continue; /* Loop/switch isn't completed */
_L4:
        H = false;
        if (true) goto _L3; else goto _L8
_L8:
    }

    public void onDestroy()
    {
        d();
        if (A != null)
        {
            A.dismiss();
        }
        I = null;
        f();
        if (a != null)
        {
            a.b();
        }
        a = null;
        B.unregisterReceiver(S);
        B.unbindService(P);
        super.onDestroy();
    }

    protected void onPause()
    {
        d();
        d();
        if (J != null)
        {
            J.sendMessage(J.obtainMessage(12290));
        }
        super.onPause();
    }

    protected void onResume()
    {
        if (!G && !H && o.getVisibility() != 0)
        {
            l.setVisibility(0);
        }
        super.onResume();
    }

    public final void x()
    {
    }
}
