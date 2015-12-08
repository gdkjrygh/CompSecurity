// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.view.ViewPager;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;
import com.arist.a.i;
import com.arist.activity.base.BaseActivity;
import com.arist.b.b;
import com.arist.b.c;
import com.arist.c.a.a;
import com.arist.c.f;
import com.arist.c.h;
import com.arist.model.b.d;
import com.arist.model.equize.VisualizerView;
import com.arist.model.equize.j;
import com.arist.model.equize.n;
import com.arist.model.lrc.LrcView;
import com.arist.model.lrc.e;
import com.arist.model.skin.ColorProgressBar;
import com.arist.model.skin.l;
import java.io.File;
import java.util.ArrayList;

// Referenced classes of package com.arist.activity:
//            MyApplication, EqualizerActivity, ah, ai

public class MusicPlayActivity extends BaseActivity
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener, l
{

    private TextView a;
    private TextView b;
    private TextView c;
    private ImageView d;
    private ImageView e;
    private ImageView g;
    private ImageView h;
    private TextView i;
    private TextView j;
    private ColorProgressBar k;
    private int l[] = {
        0x7f0200ad, 0x7f0200af, 0x7f0200ac, 0x7f0200ae
    };
    private String m[];
    private LrcView n;
    private View o;
    private n p;
    private d q;
    private ai r;
    private ViewFlipper s;
    private long t;
    private ListView u;
    private i v;
    private ImageView w;
    private ViewPager x;

    public MusicPlayActivity()
    {
    }

    static void a(MusicPlayActivity musicplayactivity)
    {
        musicplayactivity.b();
    }

    static ImageView b(MusicPlayActivity musicplayactivity)
    {
        return musicplayactivity.d;
    }

    private void b()
    {
        b b1 = MyApplication.g();
        if (b1 != null)
        {
            a.setText(b1.d());
            b.setText(b1.j());
            c.setText(b1.h());
            boolean flag = ((c)com.arist.activity.MyApplication.l.get(0)).f().contains(b1);
            g.setSelected(flag);
            com.arist.c.a.a.a(b1, h);
            com.arist.model.lrc.e.a(b1, n);
        }
        v.notifyDataSetChanged();
    }

    static n c(MusicPlayActivity musicplayactivity)
    {
        return musicplayactivity.p;
    }

    static ColorProgressBar d(MusicPlayActivity musicplayactivity)
    {
        return musicplayactivity.k;
    }

    static TextView e(MusicPlayActivity musicplayactivity)
    {
        return musicplayactivity.j;
    }

    static TextView f(MusicPlayActivity musicplayactivity)
    {
        return musicplayactivity.i;
    }

    static LrcView g(MusicPlayActivity musicplayactivity)
    {
        return musicplayactivity.n;
    }

    public final void a()
    {
        com.arist.model.lrc.e.a(MyApplication.g(), n);
    }

    public final void a(ColorProgressBar colorprogressbar, boolean flag, float f1)
    {
        if (flag)
        {
            colorprogressbar = new Intent(com.arist.c.a.e);
            colorprogressbar.putExtra("seekProgress", (int)((float)com.arist.activity.MyApplication.b() * f1));
            sendBroadcast(colorprogressbar);
        }
    }

    public void handleBackClicked(View view)
    {
        onBackPressed();
    }

    public void handleEqualizerClicked(View view)
    {
        if (!com.arist.model.equize.j.a().e())
        {
            Toast.makeText(this, 0x7f0900ed, 0).show();
            return;
        } else
        {
            startActivity(new Intent(this, com/arist/activity/EqualizerActivity));
            return;
        }
    }

    public void handleFavouriteClicked(View view)
    {
        view = (c)com.arist.activity.MyApplication.l.get(0);
        b b1 = MyApplication.g();
        if (g.isSelected())
        {
            g.setSelected(false);
            view.f().remove(b1);
            q.b(b1, view);
        } else
        {
            g.setSelected(true);
            view.f().add(b1);
            q.a(b1, view);
        }
        sendBroadcast(new Intent(com.arist.c.a.c));
    }

    public void handleModeClicked(View view)
    {
        int i1 = com.arist.activity.MyApplication.i + 1;
        com.arist.activity.MyApplication.i = i1;
        if (i1 > 4)
        {
            i1 = 1;
        } else
        {
            i1 = com.arist.activity.MyApplication.i;
        }
        com.arist.activity.MyApplication.i = i1;
        com.arist.activity.MyApplication.e.c(com.arist.activity.MyApplication.i);
        Toast.makeText(this, m[com.arist.activity.MyApplication.i - 1], 0).show();
        ((ImageView)view).setImageResource(l[com.arist.activity.MyApplication.i - 1]);
    }

    public void handleNextClicked(View view)
    {
        sendBroadcast(new Intent(com.arist.c.a.g));
    }

    public void handlePlayPauseClicked(View view)
    {
        sendBroadcast(new Intent(com.arist.c.a.b));
    }

    public void handlePreviousClicked(View view)
    {
        sendBroadcast(new Intent(com.arist.c.a.f));
    }

    public void handleShareClicked(View view)
    {
        view = new Intent("android.intent.action.SEND");
        view.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(MyApplication.g().e())));
        view.setType("audio/*");
        startActivity(Intent.createChooser(view, getString(0x7f0900dd)));
    }

    public void handleSwitcherClicked(View view)
    {
        long l1 = System.currentTimeMillis();
        if (l1 - t < 1020L)
        {
            return;
        }
        t = l1;
        float f1 = (float)s.getWidth() / 2.0F;
        float f2 = (float)s.getHeight() / 2.0F;
        int i1 = s.getWidth() / 2;
        view = w;
        boolean flag;
        if (w.isSelected())
        {
            flag = false;
        } else
        {
            flag = true;
        }
        view.setSelected(flag);
        if (w.isSelected())
        {
            view = new com.arist.view.d(-90F, 0.0F, f1, f2, i1);
            view.setStartOffset(500L);
            s.setInAnimation(view);
            view = new com.arist.view.d(0.0F, 90F, f1, f2, i1);
            s.setOutAnimation(view);
            s.showPrevious();
            return;
        } else
        {
            view = new com.arist.view.d(90F, 0.0F, f1, f2, i1);
            view.setStartOffset(500L);
            s.setInAnimation(view);
            view = new com.arist.view.d(0.0F, -90F, f1, f2, i1);
            s.setOutAnimation(view);
            s.showNext();
            return;
        }
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        if (j1 == -1)
        {
            com.arist.model.lrc.e.a(MyApplication.g(), n);
        }
    }

    public void onClick(View view)
    {
        (new com.arist.model.lrc.i()).a(this, MyApplication.g());
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030005);
        q = new d();
        m = getResources().getStringArray(0x7f0c0001);
        a = (TextView)findViewById(0x7f060034);
        w = (ImageView)findViewById(0x7f060033);
        d = (ImageView)findViewById(0x7f0600ca);
        d.setSelected(com.arist.activity.MyApplication.d());
        i = (TextView)findViewById(0x7f0600cf);
        j = (TextView)findViewById(0x7f0600d1);
        i.setText(com.arist.c.h.a(0));
        k = (ColorProgressBar)findViewById(0x7f0600d0);
        k.a(this);
        LinearLayout linearlayout = (LinearLayout)findViewById(0x7f0600c9);
        linearlayout.getChildAt(0).setSelected(true);
        x = (ViewPager)findViewById(0x7f0600c8);
        ArrayList arraylist = new ArrayList();
        Object obj = getLayoutInflater().inflate(0x7f030030, null);
        arraylist.add(obj);
        View view = getLayoutInflater().inflate(0x7f030033, null);
        n = (LrcView)view.findViewById(0x7f0600cd);
        o = view.findViewById(0x7f0600ce);
        o.setOnClickListener(this);
        arraylist.add(view);
        x.a(new com.arist.a.h(arraylist));
        x.a(new ah(this, linearlayout));
        int i1;
        if (getResources().getConfiguration().orientation == 2)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0)
        {
            i1 = (((WindowManager)getSystemService("window")).getDefaultDisplay().getWidth() * 2) / 3;
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(i1 + 60, i1);
            ((View) (obj)).findViewById(0x7f0600c1).setLayoutParams(layoutparams);
            b = (TextView)((View) (obj)).findViewById(0x7f060038);
            c = (TextView)((View) (obj)).findViewById(0x7f060039);
        } else
        {
            b = (TextView)findViewById(0x7f060038);
            c = (TextView)findViewById(0x7f060039);
        }
        g = (ImageView)((View) (obj)).findViewById(0x7f0600c6);
        e = (ImageView)((View) (obj)).findViewById(0x7f0600c4);
        h = (ImageView)((View) (obj)).findViewById(0x7f0600c7);
        e.setImageResource(l[com.arist.activity.MyApplication.i - 1]);
        u = (ListView)findViewById(0x7f060036);
        v = new i(this, com.arist.activity.MyApplication.f().f());
        u.setAdapter(v);
        u.setOnItemClickListener(this);
        s = (ViewFlipper)findViewById(0x7f060035);
        obj = (VisualizerView)findViewById(0x7f060037);
        p = new n(com.arist.activity.MyApplication.a.getAudioSessionId());
        ((VisualizerView) (obj)).a(p);
        if (bundle != null)
        {
            i1 = bundle.getInt("pager_index");
            if (i1 > 0 && i1 < arraylist.size())
            {
                x.a(i1);
            }
            if (bundle.getBoolean("show_next", false))
            {
                w.setSelected(true);
                s.showNext();
            }
        }
        b();
        r = new ai(this, (byte)0);
        bundle = new IntentFilter();
        bundle.addAction(com.arist.c.a.q);
        bundle.addAction(com.arist.c.a.r);
        bundle.addAction(com.arist.c.a.j);
        bundle.addAction(com.arist.c.a.l);
        registerReceiver(r, bundle);
    }

    protected void onDestroy()
    {
        unregisterReceiver(r);
        p.a(false);
        p.b();
        super.onDestroy();
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        com.arist.activity.MyApplication.h = i1;
        sendBroadcast(new Intent(com.arist.c.a.b));
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putInt("pager_index", x.b());
        bundle.putBoolean("show_next", w.isSelected());
    }

    public void onSaveInstanceState(Bundle bundle, PersistableBundle persistablebundle)
    {
        super.onSaveInstanceState(bundle, persistablebundle);
    }
}
