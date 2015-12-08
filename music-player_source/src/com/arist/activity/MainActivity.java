// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.arist.a.a;
import com.arist.a.e;
import com.arist.activity.base.BaseActivity;
import com.arist.b.b;
import com.arist.b.c;
import com.arist.c.f;
import com.arist.c.h;
import com.arist.model.skin.ColorImageView;
import com.arist.model.skin.ColorProgressBar;
import com.arist.model.skin.ColorTextView;
import com.ijoysoft.appwall.AppWallReceiver;
import com.ijoysoft.appwall.AppWallView;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.mobeta.android.dslv.DragSortListView;
import com.mobeta.android.dslv.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.arist.activity:
//            MyApplication, l, s, z, 
//            n, o, y, r, 
//            p, q, m, ad, 
//            t, ac, ab, ag, 
//            af, ae, u, v, 
//            w, x

public class MainActivity extends BaseActivity
    implements TextWatcher, i
{

    private View A;
    private View B;
    private View C;
    private ColorTextView D;
    private android.view.View.OnCreateContextMenuListener E;
    private ImageView F;
    private ColorImageView G;
    private ColorProgressBar H;
    private TextView I;
    private TextView J;
    private boolean K;
    private Handler L;
    private ImageView M;
    private ImageView N;
    private ImageView O;
    private ImageView P[];
    private int Q;
    private ad R;
    public int a;
    public int b;
    public int c;
    ProgressDialog d;
    public b e;
    private SlidingMenu g;
    private Button h;
    private com.arist.view.e i;
    private int j;
    private a k;
    private e l;
    private com.arist.model.b.c m;
    private com.arist.model.a.b n;
    private ViewPager o;
    private com.arist.a.h p;
    private ArrayList q;
    private ListView r;
    private DragSortListView s;
    private View t;
    private EditText u;
    private View v;
    private MyApplication w;
    private AppWallReceiver x;
    private com.arist.view.a y;
    private View z;

    public MainActivity()
    {
        a = 0;
        q = new ArrayList();
        b = com.arist.activity.MyApplication.f;
        c = MyApplication.g;
        E = new l(this);
        K = false;
        L = new s(this);
        Q = 0;
    }

    static e a(MainActivity mainactivity)
    {
        return mainactivity.l;
    }

    static void a(MainActivity mainactivity, int i1)
    {
        mainactivity.Q = i1;
    }

    static void a(MainActivity mainactivity, int i1, int j1)
    {
        if (mainactivity.d == null)
        {
            mainactivity.d = new ProgressDialog(mainactivity, 3);
            mainactivity.d.setMessage(mainactivity.getString(0x7f0900f9));
            mainactivity.d.setCancelable(false);
            mainactivity.d.setCanceledOnTouchOutside(false);
            mainactivity.d.show();
            (new z(mainactivity, j1, i1)).start();
        }
    }

    static void a(MainActivity mainactivity, int i1, int ai[])
    {
        int j1 = 0;
        boolean flag = false;
        if (i1 == 3)
        {
            j1 = ((flag) ? 1 : 0);
            do
            {
                if (j1 >= i1)
                {
                    return;
                }
                if (ai[j1] == 1)
                {
                    mainactivity.P[j1].setImageResource(0x7f0200d3);
                } else
                {
                    mainactivity.P[j1].setImageResource(0x7f0200d4);
                }
                j1++;
            } while (true);
        }
        while (j1 < i1) 
        {
            if (ai[j1] == 1)
            {
                mainactivity.P[j1].setImageResource(0x7f0200d3);
            } else
            {
                mainactivity.P[j1].setImageResource(0x7f0200d4);
            }
            j1++;
        }
    }

    static void a(MainActivity mainactivity, boolean flag)
    {
        mainactivity.d(flag);
    }

    static int b(MainActivity mainactivity)
    {
        return mainactivity.Q;
    }

    static ColorProgressBar c(MainActivity mainactivity)
    {
        return mainactivity.H;
    }

    static void d(MainActivity mainactivity)
    {
        mainactivity.h();
    }

    private void d(boolean flag)
    {
        Log.i("MainActivity", (new StringBuilder("refrashPlayListView() : ")).append(b).append("--------").append(c).toString());
        l.a(b);
        DragSortListView dragsortlistview = s;
        boolean flag1;
        if (b == 3)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        dragsortlistview.a(flag1);
        if (flag)
        {
            o.b(1);
        }
    }

    static a e(MainActivity mainactivity)
    {
        return mainactivity.k;
    }

    static boolean f(MainActivity mainactivity)
    {
        return mainactivity.K;
    }

    static void g(MainActivity mainactivity)
    {
        mainactivity.i();
    }

    static com.arist.view.a h(MainActivity mainactivity)
    {
        return mainactivity.y;
    }

    private void h()
    {
        Log.i("MainActivity", (new StringBuilder("refrashMusicListView() : ")).append(b).append("--------").append(c).toString());
        k.a(b, c);
        r.requestLayout();
        o.a(2);
    }

    static ImageView i(MainActivity mainactivity)
    {
        return mainactivity.F;
    }

    private void i()
    {
        if (MyApplication.g() != null)
        {
            I.setText(MyApplication.g().d());
            J.setText(MyApplication.g().j());
        }
        H.a(((float)com.arist.activity.MyApplication.c() * 1.0F) / (float)com.arist.activity.MyApplication.b());
        F.setSelected(MyApplication.d());
        com.arist.c.a.a.a(MyApplication.g(), G);
    }

    static SlidingMenu j(MainActivity mainactivity)
    {
        return mainactivity.g;
    }

    static ArrayList k(MainActivity mainactivity)
    {
        return mainactivity.q;
    }

    static Handler l(MainActivity mainactivity)
    {
        return mainactivity.L;
    }

    static com.arist.model.b.c m(MainActivity mainactivity)
    {
        return mainactivity.m;
    }

    static com.arist.model.a.b n(MainActivity mainactivity)
    {
        return mainactivity.n;
    }

    public final void a()
    {
        View view = getLayoutInflater().inflate(0x7f03002d, null);
        ((TextView)view.findViewById(0x7f0600ae)).setText(e.d());
        ((TextView)view.findViewById(0x7f0600af)).setText(e.h());
        ((TextView)view.findViewById(0x7f0600b0)).setText(e.j());
        ((TextView)view.findViewById(0x7f0600b1)).setText(com.arist.c.h.a(e.g()));
        TextView textview = (TextView)view.findViewById(0x7f0600b2);
        long l1 = e.f();
        Object obj;
        if (l1 < 0x100000L)
        {
            obj = (new StringBuilder(String.valueOf((double)l1 / 1024D))).append(" KB").toString();
        } else
        if (l1 < 0x40000000L)
        {
            obj = (new StringBuilder(String.valueOf((double)(l1 / 1024L) / 1024D))).append(" MB").toString();
        } else
        {
            obj = "";
        }
        textview.setText(((CharSequence) (obj)));
        ((TextView)view.findViewById(0x7f0600b3)).setText(e.e());
        obj = (new android.app.AlertDialog.Builder(this)).setTitle(0x7f090058).setIcon(0x7f020064).setCancelable(true).setView(view).create();
        view.findViewById(0x7f0600b5).setOnClickListener(new n(this, ((Dialog) (obj))));
        view.findViewById(0x7f0600b4).setOnClickListener(new o(this, ((Dialog) (obj))));
        ((Dialog) (obj)).show();
    }

    public final void a(int i1)
    {
        Toast.makeText(this, getString(i1), 0).show();
    }

    public final void a(int i1, int j1)
    {
        ListView listview = new ListView(this);
        Object obj = new ArrayList();
        Iterator iterator = MyApplication.l.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                listview.setAdapter(new ArrayAdapter(this, 0x7f03000f, ((List) (obj))));
                obj = (new android.app.AlertDialog.Builder(this)).setIcon(0x1080027).setTitle(0x7f09005b).setView(listview).create();
                listview.setOnItemClickListener(new y(this, ((AlertDialog) (obj)), i1, j1));
                ((AlertDialog) (obj)).show();
                return;
            }
            ((ArrayList) (obj)).add(((c)iterator.next()).b());
        } while (true);
    }

    public final void a(boolean flag)
    {
        boolean flag1 = false;
        Object obj = z;
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        ((View) (obj)).setVisibility(i1);
        obj = D;
        if (k.a() == 3)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        ((ColorTextView) (obj)).setVisibility(i1);
        obj = A;
        if (k.a() == 3)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        ((View) (obj)).setVisibility(i1);
        obj = C;
        if (!flag)
        {
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            i1 = 8;
        }
        ((View) (obj)).setVisibility(i1);
    }

    public void afterTextChanged(Editable editable)
    {
    }

    public final void b()
    {
        ArrayList arraylist = ((c)MyApplication.p.get(1)).f();
        Iterator iterator = arraylist.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                arraylist.clear();
                h();
                d(false);
                y.b();
                if (com.arist.activity.MyApplication.f == 0 && 1 == MyApplication.g)
                {
                    com.arist.activity.MyApplication.f = 0;
                    MyApplication.g = 0;
                    com.arist.activity.MyApplication.h = 0;
                    sendBroadcast(new Intent(com.arist.c.a.h));
                    sendBroadcast(new Intent(com.arist.c.a.j));
                }
                return;
            }
            b b1 = (b)iterator.next();
            m.a(b1.c(), 0L);
        } while (true);
    }

    public final void b(int i1, int j1)
    {
        Collections.swap(MyApplication.l, i1, j1);
        i1 = 0;
        do
        {
            if (i1 >= MyApplication.l.size())
            {
                m.b(MyApplication.l);
                return;
            }
            ((c)MyApplication.l.get(i1)).a(i1 + 1);
            i1++;
        } while (true);
    }

    public final void b(boolean flag)
    {
        byte byte0 = 8;
        Object obj = u;
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        ((EditText) (obj)).setVisibility(i1);
        obj = v;
        if (flag)
        {
            i1 = byte0;
        } else
        {
            i1 = 0;
        }
        ((View) (obj)).setVisibility(i1);
        if (!flag)
        {
            ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(u.getWindowToken(), 2);
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
    {
    }

    public final void c()
    {
        c c1 = (c)MyApplication.l.get(k.b());
        n.b(c1);
        y.b();
        h();
        d(false);
        if (3 == com.arist.activity.MyApplication.f && k.b() == MyApplication.g)
        {
            com.arist.activity.MyApplication.f = 0;
            MyApplication.g = 0;
            com.arist.activity.MyApplication.h = 0;
            sendBroadcast(new Intent(com.arist.c.a.h));
            sendBroadcast(new Intent(com.arist.c.a.j));
        }
    }

    public final void c(boolean flag)
    {
        b b1 = MyApplication.g();
        if (flag)
        {
            m.a(e.c(), 0L);
        } else
        {
            n.a(e, l.b(c));
            y.b();
        }
        k.a(e);
        y.b();
        if (b == com.arist.activity.MyApplication.f && c == MyApplication.g)
        {
            if (k.getCount() == 0)
            {
                com.arist.activity.MyApplication.f = 0;
                MyApplication.g = 0;
                com.arist.activity.MyApplication.h = 0;
                sendBroadcast(new Intent(com.arist.c.a.h));
                sendBroadcast(new Intent(com.arist.c.a.j));
                h();
                d(false);
                return;
            }
            if (k.c() == com.arist.activity.MyApplication.h)
            {
                if (MyApplication.d())
                {
                    sendBroadcast(new Intent(com.arist.c.a.b));
                }
            } else
            {
                com.arist.activity.MyApplication.h = com.arist.activity.MyApplication.f().f().indexOf(b1);
            }
        }
        l.notifyDataSetChanged();
    }

    public final void d()
    {
        (new android.app.AlertDialog.Builder(this)).setCancelable(true).setTitle(getString(0x7f0900ce)).setMessage(getString(0x7f0900cd, new Object[] {
            e.d()
        })).setIcon(0x1080027).setPositiveButton(getString(0x7f090073), new r(this)).setNegativeButton(getString(0x7f09004a), null).create().show();
    }

    public final void e()
    {
        int i1 = 0;
        View view;
        b b1;
        boolean flag;
        if (b == com.arist.activity.MyApplication.f && c == MyApplication.g)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L2:
        try
        {
            if (i1 >= r.getChildCount())
            {
                return;
            }
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return;
        }
        view = r.getChildAt(i1);
        b1 = k.c(r.getFirstVisiblePosition() + i1);
        if (MyApplication.g() == null || b1.c() != MyApplication.g().c() || !flag)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        view.setBackgroundColor(0xffc3d4de);
        break MISSING_BLOCK_LABEL_118;
        view.setBackgroundColor(0);
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void f()
    {
        View view = getLayoutInflater().inflate(0x7f03002e, null);
        EditText edittext = (EditText)view.findViewById(0x7f0600b6);
        EditText edittext1 = (EditText)view.findViewById(0x7f0600b7);
        EditText edittext2 = (EditText)view.findViewById(0x7f0600b8);
        edittext.setText(e.d());
        edittext1.setText(e.h());
        edittext2.setText(e.j());
        AlertDialog alertdialog = (new android.app.AlertDialog.Builder(this)).setCancelable(true).setTitle(e.d()).setIcon(0x7f020064).setView(view).create();
        view.findViewById(0x7f0600b9).setOnClickListener(new p(this, alertdialog, edittext, edittext1, edittext2));
        view.findViewById(0x7f0600ba).setOnClickListener(new q(this, alertdialog));
        alertdialog.show();
    }

    public final void g()
    {
        l.notifyDataSetChanged();
        y.b();
    }

    public void handleAlbumClicked(View view)
    {
        view = AnimationUtils.loadAnimation(this, 0x7f04000d);
        view.setAnimationListener(new m(this));
        G.startAnimation(view);
    }

    public void handleNextClicked(View view)
    {
        view = new Intent();
        view.setAction(com.arist.c.a.g);
        sendBroadcast(view);
    }

    public void handlePlayPauseClicked(View view)
    {
        view = new Intent();
        view.setAction(com.arist.c.a.b);
        sendBroadcast(view);
    }

    public void handlePreviousClicked(View view)
    {
        view = new Intent();
        view.setAction(com.arist.c.a.f);
        sendBroadcast(view);
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (10 == i1 && j1 == -1)
        {
            if (y != null)
            {
                y.b();
            }
            l.notifyDataSetChanged();
            k.notifyDataSetChanged();
            r.requestLayout();
        }
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        android.widget.AdapterView.AdapterContextMenuInfo adaptercontextmenuinfo;
        c c1;
        adaptercontextmenuinfo = (android.widget.AdapterView.AdapterContextMenuInfo)menuitem.getMenuInfo();
        c1 = l.b(adaptercontextmenuinfo.position);
        menuitem.getItemId();
        JVM INSTR tableswitch 0 1: default 52
    //                   0 58
    //                   1 78;
           goto _L1 _L2 _L3
_L1:
        return super.onContextItemSelected(menuitem);
_L2:
        n.a(this, c1, l, y);
        continue; /* Loop/switch isn't completed */
_L3:
        n.a(c1);
        l.a(c1);
        y.b();
        if (com.arist.activity.MyApplication.f == 3 && MyApplication.g == adaptercontextmenuinfo.position)
        {
            com.arist.activity.MyApplication.f = 0;
            MyApplication.g = 0;
            com.arist.activity.MyApplication.h = 0;
            sendBroadcast(new Intent(com.arist.c.a.h));
            sendBroadcast(new Intent(com.arist.c.a.j));
            o.b(0);
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(null);
        requestWindowFeature(1);
        setContentView(0x7f030004);
        Log.i("MainActivity", "onCreate()");
        com.ijoysoft.a.a.a().a(this);
        R = new ad(this, (byte)0);
        Object obj = new IntentFilter();
        ((IntentFilter) (obj)).addAction(com.arist.c.a.r);
        ((IntentFilter) (obj)).addAction(com.arist.c.a.j);
        ((IntentFilter) (obj)).addAction(com.arist.c.a.l);
        ((IntentFilter) (obj)).addAction(com.arist.c.a.w);
        ((IntentFilter) (obj)).addAction(com.arist.c.a.x);
        ((IntentFilter) (obj)).addAction(com.arist.c.a.z);
        ((IntentFilter) (obj)).addAction(com.arist.c.a.c);
        ((IntentFilter) (obj)).addAction("android.intent.action.MEDIA_SCANNER_STARTED");
        ((IntentFilter) (obj)).addAction("android.intent.action.MEDIA_SCANNER_FINISHED");
        registerReceiver(R, ((IntentFilter) (obj)));
        if (bundle != null)
        {
            b = bundle.getInt("firstPosition", b);
            c = bundle.getInt("secondPosition", c);
        }
        m = new com.arist.model.b.c(this);
        n = new com.arist.model.a.b();
        j = com.arist.activity.MyApplication.i;
        w = (MyApplication)getApplication();
        w.b.add(this);
        x = new AppWallReceiver(new t(this, (AppWallView)findViewById(0x7f060028)));
        x.a(this);
        y = new com.arist.view.a(this, new ac(this));
        bundle = getLayoutInflater().inflate(0x7f03002f, null);
        z = bundle.findViewById(0x7f0600be);
        D = (ColorTextView)z.findViewById(0x7f0600c0);
        D.a();
        D.setOnClickListener(new ab(this));
        C = bundle.findViewById(0x7f0600bb);
        A = bundle.findViewById(0x7f0600bd);
        A.setOnClickListener(new ab(this));
        B = bundle.findViewById(0x7f0600bc);
        B.setOnClickListener(new ag(this));
        r = (ListView)bundle.findViewById(0x7f06008a);
        k = new a(this, com.arist.activity.MyApplication.f().f());
        r.setAdapter(k);
        r.setOnItemClickListener(new af(this));
        r.setOnItemLongClickListener(k);
        s = (DragSortListView)getLayoutInflater().inflate(0x7f030022, null);
        s.a(this);
        obj = s;
        boolean flag;
        if (b == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((DragSortListView) (obj)).a(flag);
        l = new e(this, com.arist.activity.MyApplication.e());
        s.setAdapter(l);
        s.setOnItemClickListener(new ae(this));
        s.setOnCreateContextMenuListener(E);
        o = (ViewPager)findViewById(0x7f06002a);
        q.add(y);
        q.add(s);
        q.add(bundle);
        p = new com.arist.a.h(q);
        o.a(p);
        h = (Button)findViewById(0x7f060026);
        h.setOnClickListener(new u(this));
        t = findViewById(0x7f060027);
        t.setOnClickListener(new v(this));
        u = (EditText)findViewById(0x7f060029);
        u.addTextChangedListener(this);
        v = findViewById(0x7f060025);
        a(k.isEmpty());
        M = (ImageView)findViewById(0x7f06002d);
        N = (ImageView)findViewById(0x7f06002c);
        O = (ImageView)findViewById(0x7f06002e);
        P = (new ImageView[] {
            M, N, O
        });
        F = (ImageView)findViewById(0x7f060051);
        G = (ColorImageView)findViewById(0x7f060054);
        H = (ColorProgressBar)findViewById(0x7f060053);
        I = (TextView)findViewById(0x7f060056);
        J = (TextView)findViewById(0x7f060057);
        o.a(new w(this));
        i();
        i = new com.arist.view.e(this);
        g = new SlidingMenu(this, 1);
        g.a(i);
        g.j();
        g.i();
        g.a(0.35F);
        g.a(1);
        bundle = com.arist.model.skin.b.a();
        if (com.arist.activity.MyApplication.e.o())
        {
            com.arist.activity.MyApplication.e.n();
            bundle.a(this);
        }
    }

    protected void onDestroy()
    {
        Log.i("MainActivity", "onDestroy()");
        unregisterReceiver(R);
        x.b(this);
        super.onDestroy();
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        boolean flag = false;
        switch (i1)
        {
        default:
            return super.onKeyDown(i1, keyevent);

        case 82: // 'R'
            g.f();
            return true;

        case 4: // '\004'
            break;
        }
        if (g.g())
        {
            return super.onKeyDown(i1, keyevent);
        }
        if (u.getVisibility() == 0)
        {
            u.setText("");
            b(false);
            return true;
        }
        if (b == 0 && a == 2)
        {
            o.a(0);
            return true;
        }
        if (o.b() > 0)
        {
            o.a(o.b() - 1);
            return true;
        }
        keyevent = com.ijoysoft.a.a.a();
        if (!MyApplication.d())
        {
            flag = true;
        }
        keyevent.a(this, flag, new x(this));
        return true;
    }

    protected void onPause()
    {
        super.onPause();
        com.b.a.b.a(this);
    }

    protected void onResume()
    {
        super.onResume();
        if (j != com.arist.activity.MyApplication.i)
        {
            i.a();
            j = com.arist.activity.MyApplication.i;
        }
        com.b.a.b.b(this);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putInt("firstPosition", b);
        bundle.putInt("secondPosition", c);
    }

    public void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
    {
        boolean flag = false;
        if (i1 == 0 && j1 == 0 && k1 == 0)
        {
            return;
        }
        b = 0;
        c = 0;
        k.a(b);
        k.b(c);
        charsequence = charsequence.toString().toLowerCase();
        o.a(2);
        ArrayList arraylist = ((c)MyApplication.p.get(0)).f();
        ArrayList arraylist1 = new ArrayList();
        i1 = ((flag) ? 1 : 0);
        do
        {
            if (i1 >= arraylist.size())
            {
                k.a(arraylist1);
                return;
            }
            if (((b)arraylist.get(i1)).d().toLowerCase().contains(charsequence) || ((b)arraylist.get(i1)).j().toLowerCase().contains(charsequence))
            {
                arraylist1.add((b)arraylist.get(i1));
            }
            i1++;
        } while (true);
    }
}
