// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.ads.NativeAd;
import com.qihoo.security.adv.AdvDataManager;
import com.qihoo.security.adv.a.c;
import com.qihoo.security.app.BaseActivity;
import com.qihoo.security.f.b;
import com.qihoo.security.locale.d;
import com.qihoo.security.ui.result.AdvData;
import com.qihoo.security.ui.result.f;
import com.qihoo.security.widget.ImageView.RemoteImageView;
import com.qihoo.security.widget.ProgressCircleView;
import com.qihoo360.mobilesafe.b.a;
import com.qihoo360.mobilesafe.b.q;
import com.qihoo360.mobilesafe.b.s;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.gamebooster:
//            h, b, f, g, 
//            LocalGamePkg, AddGamesActivity

public class GameRecommendListActivity extends BaseActivity
    implements android.widget.AdapterView.OnItemClickListener, h
{

    private com.qihoo.security.gamebooster.f A;
    private LayoutInflater B;
    private RemoteImageView C;
    private TextView D;
    private String E;
    private Bitmap F;
    private View G;
    private View H;
    private ArrayList I;
    private boolean J;
    private List K;
    private List L;
    private List M;
    private com.qihoo.security.adv.a.a N;
    private boolean O;
    private View P;
    private boolean Q;
    private final String y = getClass().getSimpleName();
    private ListView z;

    public GameRecommendListActivity()
    {
        J = false;
        M = new ArrayList();
        Q = false;
    }

    static boolean a(GameRecommendListActivity gamerecommendlistactivity)
    {
        return gamerecommendlistactivity.J;
    }

    static boolean a(GameRecommendListActivity gamerecommendlistactivity, boolean flag)
    {
        gamerecommendlistactivity.Q = flag;
        return flag;
    }

    static ArrayList b(GameRecommendListActivity gamerecommendlistactivity)
    {
        return gamerecommendlistactivity.I;
    }

    static boolean c(GameRecommendListActivity gamerecommendlistactivity)
    {
        return gamerecommendlistactivity.O;
    }

    private void o()
    {
        F = com.qihoo.security.gamebooster.b.a().d();
        int i = com.qihoo360.mobilesafe.b.a.a(getPackageManager()).size() - com.qihoo.security.gamebooster.b.a().e() - 1;
        String s1;
        if (i > 0)
        {
            s1 = String.valueOf(i);
        } else
        {
            s1 = "0";
        }
        E = s1;
        C.setImageBitmap(F);
        D.setText(E);
    }

    private void p()
    {
        z = (ListView)findViewById(0x7f0b0146);
        G = B.inflate(0x7f030066, null);
        H = B.inflate(0x7f030067, null);
        C = (RemoteImageView)G.findViewById(0x7f0b0148);
        D = (TextView)G.findViewById(0x7f0b0149);
        z.addHeaderView(G);
        z.addHeaderView(H);
        A = new com.qihoo.security.gamebooster.f(getApplicationContext(), M);
        z.setAdapter(A);
        z.setOnItemClickListener(this);
        G.setOnClickListener(new android.view.View.OnClickListener() {

            final GameRecommendListActivity a;

            public void onClick(View view)
            {
                if (!com.qihoo.security.gamebooster.GameRecommendListActivity.a(a))
                {
                    return;
                }
                view = new Intent(a.getApplicationContext(), com/qihoo/security/gamebooster/AddGamesActivity);
                view.addFlags(0x10000000);
                view.putStringArrayListExtra("packages", com.qihoo.security.gamebooster.GameRecommendListActivity.b(a));
                if (com.qihoo.security.gamebooster.GameRecommendListActivity.c(a))
                {
                    view.putExtra("from_gameboost", true);
                }
                a.startActivity(view);
                a.overridePendingTransition(0x7f040013, 0x7f040023);
            }

            
            {
                a = GameRecommendListActivity.this;
                super();
            }
        });
        z.setOnScrollListener(new android.widget.AbsListView.OnScrollListener() {

            final GameRecommendListActivity a;

            public void onScroll(AbsListView abslistview, int i, int k, int l)
            {
                if (i + k == l)
                {
                    View view = abslistview.getChildAt(abslistview.getChildCount() - 1);
                    if (abslistview.getBottom() == view.getBottom())
                    {
                        com.qihoo.security.gamebooster.GameRecommendListActivity.a(a, true);
                    }
                }
            }

            public void onScrollStateChanged(AbsListView abslistview, int i)
            {
            }

            
            {
                a = GameRecommendListActivity.this;
                super();
            }
        });
    }

    public void a(g g1, Object obj)
    {
        J = true;
        if (I == null)
        {
            I = new ArrayList();
        }
        g1 = g1.c();
        if (g1 != null && !g1.isEmpty())
        {
            I.clear();
            g1 = g1.iterator();
            while (g1.hasNext()) 
            {
                obj = (LocalGamePkg)g1.next();
                I.add(((LocalGamePkg) (obj)).getPkgName());
            }
        }
    }

    public volatile void a(Object obj, Object obj1)
    {
        a((g)obj, obj1);
    }

    protected void j()
    {
        super.j();
        if (r != null)
        {
            b(o.a(0x7f0c008f));
        }
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        overridePendingTransition(0x7f040006, 0x7f040008);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030065);
        P = findViewById(0x7f0b0147);
        ((ProgressCircleView)P.findViewById(0x7f0b0079)).setProgressBackground(0x7f02003d);
        B = LayoutInflater.from(getApplicationContext());
        O = getIntent().getBooleanExtra("from_gameboost", false);
        p();
        o();
        EventBus.getDefault().register(this);
        N = com.qihoo.security.adv.a.a.a();
        N.a(com.qihoo.security.adv.AdvDataManager.AdvType.GameBoosterAddRecmdAdvData);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (M != null)
        {
            Iterator iterator = M.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                AdvData advdata = (AdvData)iterator.next();
                if (advdata.type == 0)
                {
                    advdata.nativeAd.n();
                }
            } while (true);
            M.clear();
        }
        if (A != null)
        {
            A.a(Q);
            A.a();
        }
        if (F != null && !F.isRecycled())
        {
            F.recycle();
            F = null;
        }
        if (I != null && !I.isEmpty())
        {
            I.clear();
        }
        EventBus.getDefault().unregister(this);
    }

    public void onEventMainThread(com.qihoo.security.f.a a1)
    {
        P.setVisibility(8);
        static class _cls3
        {

            static final int a[];

            static 
            {
                a = new int[com.qihoo.security.adv.AdvDataManager.AdvType.values().length];
                try
                {
                    a[com.qihoo.security.adv.AdvDataManager.AdvType.GameBoosterAddRecmdAdvData.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        com.qihoo.security.gamebooster._cls3.a[a1.a.ordinal()];
        JVM INSTR tableswitch 1 1: default 40
    //                   1 41;
           goto _L1 _L2
_L1:
        return;
_L2:
        K = a1.b;
        L = N.d(a1.a);
        a1 = f.a(a1.a, L, true);
        if (a1 != null)
        {
            M.clear();
            M.addAll(a1);
            A.notifyDataSetChanged();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onEventMainThread(b b1)
    {
        com.qihoo.security.gamebooster._cls3.a[b1.a.ordinal()];
        JVM INSTR tableswitch 1 1: default 28
    //                   1 29;
           goto _L1 _L2
_L1:
        return;
_L2:
        int i = N.a(K, b1.b);
        if (L != null && i >= 0)
        {
            com.qihoo.security.adv.d d1 = (com.qihoo.security.adv.d)K.get(i);
            if (N.a(d1, L))
            {
                d1.a(0);
                if (L.size() > i)
                {
                    L.add(i, d1);
                } else
                {
                    L.add(d1);
                }
                b1 = f.a(b1.a, L, false);
                if (b1 != null)
                {
                    M.clear();
                    M.addAll(b1);
                    A.notifyDataSetChanged();
                    return;
                }
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (i - 2 < 0)
        {
            return;
        }
        adapterview = (AdvData)M.get(i - 2);
        i = ((AdvData) (adapterview)).type;
        ArrayList arraylist = new ArrayList();
        arraylist.add(adapterview);
        AdvDataManager.a().a(com.qihoo.security.adv.AdvDataManager.AdvReportType.Click, arraylist);
        com.qihoo.security.adv.a.c.a(com.qihoo.security.adv.AdvDataManager.AdvType.GameBoosterAddRecmdAdvData, ((AdvData) (adapterview)).type);
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            view.performClick();
            return;

        case 1: // '\001'
        case 2: // '\002'
            break;
        }
        if (s.b(p))
        {
            com.qihoo.security.ui.result.a.a().a(adapterview);
            return;
        } else
        {
            q.a().a(0x7f0c00c4);
            return;
        }
    }

    protected void onResume()
    {
        super.onResume();
        J = false;
        o();
        com.qihoo.security.gamebooster.b.a().a(this);
    }
}
