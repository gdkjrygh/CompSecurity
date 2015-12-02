// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.result.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import com.facebook.ads.NativeAd;
import com.nineoldandroids.a.c;
import com.nineoldandroids.a.k;
import com.qihoo.security.adv.AdvDataManager;
import com.qihoo.security.alasticbutton.ElasticImageButton;
import com.qihoo.security.gamebooster.d;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.support.b;
import com.qihoo.security.ui.fragment.utils.FragmentAction;
import com.qihoo.security.ui.main.BaseHomeFragment;
import com.qihoo.security.ui.result.AdvData;
import com.qihoo.security.ui.result.card.a;
import com.qihoo.security.ui.result.card.view.AdvCardComplexView;
import com.qihoo.security.ui.result.card.view.AdvCardSimpleView;
import com.qihoo.security.ui.result.card.view.CardView;
import com.qihoo.security.ui.result.card.view.FunctionCardView;
import com.qihoo.security.ui.result.f;
import com.qihoo360.mobilesafe.b.r;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.qihoo.security.ui.result.view:
//            a, ResultScrollView

public abstract class BaseResultFragment extends BaseHomeFragment
    implements android.view.View.OnClickListener, com.qihoo.security.ui.result.card.view.FunctionCardView.a, ResultScrollView.a
{

    private boolean A;
    private final AtomicBoolean B = new AtomicBoolean(false);
    private final AtomicBoolean C = new AtomicBoolean(true);
    private final AtomicBoolean D = new AtomicBoolean(false);
    private com.qihoo.security.ui.b.a.f E;
    protected View a;
    protected ElasticImageButton k;
    protected ResultScrollView l;
    protected View m;
    protected LocaleTextView n;
    protected LocaleTextView o;
    protected LocaleTextView p;
    protected ImageView q;
    protected View r;
    protected ViewGroup s;
    protected ArrayList t;
    private View u;
    private View v;
    private View w;
    private View x;
    private int y;
    private List z;

    public BaseResultFragment()
    {
        A = false;
    }

    static int a(BaseResultFragment baseresultfragment, int i1)
    {
        baseresultfragment.y = i1;
        return i1;
    }

    private k a(View view, Interpolator interpolator, int i1, long l1, int j1)
    {
        k k1 = com.nineoldandroids.a.k.a(view, "translationY", new float[] {
            (float)i1, 0.0F
        });
        k1.c(l1);
        k1.a((long)j1 * 100L);
        k1.a(interpolator);
        k1.a(new com.nineoldandroids.a.b(view) {

            final View a;
            final BaseResultFragment b;

            public void a(com.nineoldandroids.a.a a1)
            {
                a.setVisibility(0);
            }

            
            {
                b = BaseResultFragment.this;
                a = view;
                super();
            }
        });
        return k1;
    }

    static List a(BaseResultFragment baseresultfragment, List list)
    {
        baseresultfragment.z = list;
        return list;
    }

    private void a(int i1)
    {
        switch (l())
        {
        default:
            return;

        case 1: // '\001'
            break;
        }
        if (i1 == 0)
        {
            com.qihoo.security.support.b.c(11415);
            return;
        } else
        {
            com.qihoo.security.support.b.b(11414, 2);
            return;
        }
    }

    private void a(AdvData advdata)
    {
        if (advdata != null)
        {
            if (advdata.tp == 11)
            {
                AdvCardSimpleView advcardsimpleview = new AdvCardSimpleView(d);
                advcardsimpleview.setADcontent(advdata);
                advcardsimpleview.setVisibility(8);
                t.add(advcardsimpleview);
                s.addView(advcardsimpleview, new android.view.ViewGroup.LayoutParams(-1, -2));
            } else
            if (advdata.tp == 12)
            {
                AdvCardComplexView advcardcomplexview = new AdvCardComplexView(d);
                advcardcomplexview.setADcontent(advdata);
                advcardcomplexview.setVisibility(8);
                t.add(advcardcomplexview);
                s.addView(advcardcomplexview, new android.view.ViewGroup.LayoutParams(-1, -2));
                return;
            }
        }
    }

    static void a(BaseResultFragment baseresultfragment)
    {
        baseresultfragment.r();
    }

    static void a(BaseResultFragment baseresultfragment, com.nineoldandroids.a.b b1)
    {
        baseresultfragment.b(b1);
    }

    private void b(com.nineoldandroids.a.b b1)
    {
        c c1 = new c();
        ArrayList arraylist = new ArrayList();
        k k1 = com.nineoldandroids.a.k.a(q, "alpha", new float[] {
            1.0F, 0.0F
        });
        k1.c(300L);
        k k2 = com.nineoldandroids.a.k.a(q, "translationY", new float[] {
            0.0F, (float)(-com.qihoo360.mobilesafe.b.r.a(d, 10F))
        });
        k2.c(300L);
        k k3 = com.nineoldandroids.a.k.a(q, "translationY", new float[] {
            0.0F, (float)(-com.qihoo360.mobilesafe.b.r.a(d, 10F))
        });
        k3.c(300L);
        k3.a(300L);
        arraylist.add(k1);
        arraylist.add(k2);
        arraylist.add(k3);
        c1.a(arraylist);
        if (b1 != null)
        {
            c1.a(b1);
        }
        c1.a();
    }

    static void b(BaseResultFragment baseresultfragment)
    {
        baseresultfragment.t();
    }

    static int c(BaseResultFragment baseresultfragment)
    {
        return baseresultfragment.y;
    }

    static void d(BaseResultFragment baseresultfragment)
    {
        baseresultfragment.q();
    }

    static void e(BaseResultFragment baseresultfragment)
    {
        baseresultfragment.u();
    }

    static com.qihoo.security.ui.fragment.BaseFragment.b f(BaseResultFragment baseresultfragment)
    {
        return baseresultfragment.e;
    }

    static boolean g(BaseResultFragment baseresultfragment)
    {
        return baseresultfragment.i;
    }

    static AtomicBoolean h(BaseResultFragment baseresultfragment)
    {
        return baseresultfragment.D;
    }

    static List i(BaseResultFragment baseresultfragment)
    {
        return baseresultfragment.z;
    }

    static boolean j(BaseResultFragment baseresultfragment)
    {
        return baseresultfragment.A;
    }

    private void q()
    {
        a(a, com.qihoo.security.ui.result.view.a.a().c());
        a(u, com.qihoo.security.ui.result.view.a.a().c());
        a(w, com.qihoo.security.ui.result.view.a.a().e());
        a(x, com.qihoo.security.ui.result.view.a.a().d());
    }

    private void r()
    {
        int i1 = l();
        Map map;
        List list;
        int k1;
        if (t == null)
        {
            t = new ArrayList();
        } else
        {
            t.clear();
        }
        list = com.qihoo.security.ui.result.f.a().b(i1);
        z = com.qihoo.security.ui.result.f.a().c(i1);
        map = com.qihoo.security.ui.result.f.a().a(z);
        k1 = list.size();
        for (int j1 = 0; j1 < k1; j1++)
        {
            a((AdvData)map.remove(Integer.valueOf(j1)));
            a a1 = (a)list.get(j1);
            FunctionCardView functioncardview = new FunctionCardView(d);
            functioncardview.setOnCardClickListener(this);
            functioncardview.setVisibility(8);
            functioncardview.setCardViewData(a1);
            functioncardview.setTag(Integer.valueOf(a1.a));
            t.add(functioncardview);
            s.addView(functioncardview, new android.view.ViewGroup.LayoutParams(-1, -2));
        }

        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); a((AdvData)map.get((Integer)iterator.next()))) { }
    }

    private void s()
    {
        for (Iterator iterator = t.iterator(); iterator.hasNext(); ((CardView)iterator.next()).setVisibility(4)) { }
        r.setVisibility(4);
    }

    private void t()
    {
        m();
        LocaleTextView localetextview = n;
        LocaleTextView localetextview1 = o;
        ImageView imageview = q;
        LocaleTextView localetextview2 = p;
        com.nineoldandroids.a.b b1 = new com.nineoldandroids.a.b() {

            final BaseResultFragment a;

            public void b(com.nineoldandroids.a.a a1)
            {
                com.qihoo.security.ui.result.view.BaseResultFragment.a(a, new com.nineoldandroids.a.b(this) {

                    final _cls6 a;

                    public void b(com.nineoldandroids.a.a a1)
                    {
                        if (BaseResultFragment.g(a.a))
                        {
                            BaseResultFragment.e(a.a);
                            return;
                        } else
                        {
                            BaseResultFragment.h(a.a).set(true);
                            return;
                        }
                    }

            
            {
                a = _pcls6;
                super();
            }
                });
            }

            
            {
                a = BaseResultFragment.this;
                super();
            }
        };
        com.qihoo.security.ui.main.a.a(0L, null, new View[] {
            localetextview, localetextview1, imageview, localetextview2
        }, b1);
    }

    private void u()
    {
        s();
        a(new com.nineoldandroids.a.b() {

            final BaseResultFragment a;

            public void b(com.nineoldandroids.a.a a1)
            {
                a.k.setEnabled(true);
            }

            
            {
                a = BaseResultFragment.this;
                super();
            }
        });
        v();
    }

    private void v()
    {
        c c1 = new c();
        ArrayList arraylist = new ArrayList();
        DecelerateInterpolator decelerateinterpolator = new DecelerateInterpolator();
        int j1 = com.qihoo.security.ui.result.view.a.a().d();
        int i1;
        for (i1 = 0; i1 < t.size(); i1++)
        {
            arraylist.add(a((CardView)t.get(i1), decelerateinterpolator, j1, 300L, i1));
        }

        h.sendMessageDelayed(h.obtainMessage(4), 100L * (long)i1);
        c1.a(arraylist);
        c1.a(new com.nineoldandroids.a.b() {

            final BaseResultFragment a;

            public void b(com.nineoldandroids.a.a a1)
            {
                a.n();
                if (BaseResultFragment.i(a) != null && !BaseResultFragment.j(a))
                {
                    AdvDataManager.a().a(com.qihoo.security.adv.AdvDataManager.AdvReportType.Show, BaseResultFragment.i(a));
                    com.qihoo.security.ui.result.view.BaseResultFragment.a(a, null);
                }
                com.qihoo.security.ui.main.a.a(null, new View[] {
                    a.r
                });
            }

            
            {
                a = BaseResultFragment.this;
                super();
            }
        });
        c1.a();
    }

    private void w()
    {
        int i1 = com.qihoo.security.ui.result.view.a.a().e();
        Iterator iterator = t.iterator();
        for (i1 = 0 + i1; iterator.hasNext(); i1 = ((CardView)iterator.next()).getHeight() + i1) { }
        i1 = r.getHeight() + i1;
        if (com.qihoo.security.ui.result.view.a.a().b() > i1)
        {
            a(v, com.qihoo.security.ui.result.view.a.a().b() - i1);
        }
    }

    protected void a(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 6: default 44
    //                   1 45
    //                   2 62
    //                   3 70
    //                   4 105
    //                   5 110
    //                   6 140;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        return;
_L2:
        k.setVisibility(0);
        k.a(true);
        return;
_L3:
        l.a();
        return;
_L4:
        ResultScrollView resultscrollview = l;
        int i1 = com.qihoo.security.ui.result.view.a.a().c();
        resultscrollview.a(com.qihoo.security.ui.result.view.a.a().d() + i1, 300L, (com.nineoldandroids.a.b)message.obj);
        return;
_L5:
        w();
        return;
_L6:
        if (!C.getAndSet(true))
        {
            com.qihoo.security.ui.main.a.b(500L, x, new com.nineoldandroids.a.b() {

                final BaseResultFragment a;

                public void a(com.nineoldandroids.a.a a1)
                {
                    com.nineoldandroids.b.a.a(a.q, 1.0F);
                }

            
            {
                a = BaseResultFragment.this;
                super();
            }
            });
            return;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (C.getAndSet(false))
        {
            com.qihoo.security.ui.main.a.a(500L, x, null);
            return;
        }
        if (true) goto _L1; else goto _L8
_L8:
    }

    protected void a(View view, int i1)
    {
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        layoutparams.height = i1;
        view.setLayoutParams(layoutparams);
    }

    public void a(com.nineoldandroids.a.b b1)
    {
        Message message = new Message();
        message.what = 3;
        message.obj = b1;
        h.sendMessage(message);
    }

    public void a(a a1)
    {
_L2:
        return;
        if (a1 == null || com.qihoo360.mobilesafe.b.f.a()) goto _L2; else goto _L1
_L1:
        switch (a1.a)
        {
        case 5: // '\005'
        case 7: // '\007'
        case 9: // '\t'
        case 10: // '\n'
        default:
            return;

        case 6: // '\006'
            break;

        case 3: // '\003'
            b(FragmentAction.RESULT_ACTION_SWITCH_TAB, null);
            com.qihoo.security.ui.a.b(d);
            return;

        case 4: // '\004'
            b(FragmentAction.RESULT_ACTION_SWITCH_TAB, null);
            com.qihoo.security.ui.a.c(d);
            return;

        case 8: // '\b'
            b(FragmentAction.RESULT_ACTION_SWITCH_TAB, null);
            com.qihoo.security.ui.a.d(d);
            return;

        case 11: // '\013'
            com.qihoo.security.ui.a.a(d);
            break; /* Loop/switch isn't completed */
        }
        if (true) goto _L2; else goto _L3
_L3:
        if (getActivity() != null)
        {
            getActivity().overridePendingTransition(0x7f040006, 0x7f040008);
        }
        SharedPref.a(d, "sp_key_game_booster_card_clicked", true);
        if (com.qihoo.security.gamebooster.d.a(d))
        {
            com.qihoo.security.gamebooster.d.b();
            return;
        }
        if (true) goto _L2; else goto _L4
_L4:
    }

    public void a(ResultScrollView resultscrollview, int i1, int j1, int k1, int l1)
    {
        float f2 = 0.0F;
        float f3 = (com.qihoo.security.ui.result.view.a.a().d() * j1) / com.qihoo.security.ui.result.view.a.a().c();
        float f1 = f3;
        if (f3 > (float)com.qihoo.security.ui.result.view.a.a().d())
        {
            f1 = com.qihoo.security.ui.result.view.a.a().d();
        }
        if (j1 == 0)
        {
            if (h.hasMessages(5))
            {
                h.removeMessages(5);
            }
            h.sendEmptyMessageDelayed(5, 300L);
            a.bringToFront();
        } else
        {
            h.sendMessage(h.obtainMessage(6));
            l.bringToFront();
        }
        com.nineoldandroids.b.a.e(s, -f1);
        com.nineoldandroids.b.a.e(r, -f1);
        com.nineoldandroids.b.a.e(m, f1);
        f1 = 1.0F - (float)j1 / (float)(com.qihoo.security.ui.result.view.a.a().c() + com.qihoo.security.ui.result.view.a.a().d());
        if (f1 < 0.0F)
        {
            f1 = f2;
        }
        com.nineoldandroids.b.a.a(a, f1);
        com.nineoldandroids.b.a.b(a, f1);
        com.nineoldandroids.b.a.c(a, f1);
    }

    protected void b(FragmentAction fragmentaction, Bundle bundle)
    {
        com.qihoo.security.ui.fragment.BaseFragment.a a1 = h;
        bundle = new Runnable(fragmentaction, bundle) {

            final FragmentAction a;
            final Bundle b;
            final BaseResultFragment c;

            public void run()
            {
                com.qihoo.security.ui.result.view.BaseResultFragment.f(c).a(a, b);
            }

            
            {
                c = BaseResultFragment.this;
                a = fragmentaction;
                b = bundle;
                super();
            }
        };
        int i1;
        if (fragmentaction.equals(FragmentAction.RESULT_ACTION_FINISH))
        {
            i1 = 300;
        } else
        {
            i1 = 0;
        }
        a1.postDelayed(bundle, i1);
    }

    protected abstract void d();

    protected abstract int l();

    protected abstract void m();

    protected abstract void n();

    protected void o()
    {
        if (B.getAndSet(false))
        {
            h.sendMessageDelayed(h.obtainMessage(1), 100L);
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        B.set(true);
        A = false;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
    }

    public void onClick(View view)
    {
        if (com.qihoo360.mobilesafe.b.f.a())
        {
            return;
        }
        switch (view.getId())
        {
        default:
            return;

        case 2131427487: 
            a(0);
            com.qihoo.security.ui.b.b.a(p());
            k.b();
            return;

        case 2131427574: 
            a(1);
            break;
        }
        b(FragmentAction.RESULT_ACTION_FINISH, null);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        bundle = com.qihoo.security.ui.b.a.a();
        E = bundle.b(0x7f030030);
        if (E == null)
        {
            E = new com.qihoo.security.ui.b.a.f();
            E.b = layoutinflater.inflate(0x7f030030, viewgroup, false);
        }
        layoutinflater = E.b;
        a = E.a(0x7f0b009d);
        k = (ElasticImageButton)E.a(0x7f0b009f);
        viewgroup = bundle.b(0x7f03008a);
        if (viewgroup != null)
        {
            k.setTopView(((com.qihoo.security.ui.b.a.f) (viewgroup)).b);
        } else
        {
            k.setTopView(View.inflate(d, 0x7f03008a, null));
        }
        k.setOnClickListener(this);
        k.setButtonAnimatorListener(new com.qihoo.security.alasticbutton.a() {

            final BaseResultFragment a;

            public void c()
            {
            }

            public void d()
            {
                com.qihoo.security.ui.b.b.a();
                com.qihoo.security.ui.result.view.BaseResultFragment.a(a);
                a.d();
                com.qihoo.security.ui.result.view.BaseResultFragment.b(a);
            }

            public void f()
            {
                a.b(FragmentAction.RESULT_ACTION_FINISH, null);
            }

            
            {
                a = BaseResultFragment.this;
                super();
            }
        });
        l = (ResultScrollView)E.a(0x7f0b00a0);
        l.setScrollViewListener(this);
        m = E.a(0x7f0b00a1);
        u = E.a(0x7f0b00a2);
        v = E.a(0x7f0b00a6);
        w = E.a(0x7f0b00a3);
        n = (LocaleTextView)E.a(0x7f0b01c8);
        o = (LocaleTextView)E.a(0x7f0b01c9);
        x = E.a(0x7f0b00a4);
        p = (LocaleTextView)E.a(0x7f0b0195);
        q = (ImageView)E.a(0x7f0b0194);
        q.setColorFilter(d.getResources().getColor(0x7f080056));
        s = (ViewGroup)E.a(0x7f0b00a5);
        r = E.a(0x7f0b00a7);
        E.a(0x7f0b00f6).setOnClickListener(this);
        l.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            final BaseResultFragment a;

            public void onGlobalLayout()
            {
                a.l.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                int i1 = a.l.getHeight();
                if (com.qihoo.security.ui.result.view.BaseResultFragment.c(a) != i1)
                {
                    com.qihoo.security.ui.result.view.BaseResultFragment.a(a, i1);
                    com.qihoo.security.ui.result.view.BaseResultFragment.d(a);
                }
            }

            
            {
                a = BaseResultFragment.this;
                super();
            }
        });
        k.setEnabled(false);
        return layoutinflater;
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (h.hasMessages(1))
        {
            h.removeMessages(1);
        }
        if (h.hasMessages(2))
        {
            h.removeMessages(2);
        }
        if (h.hasMessages(3))
        {
            h.removeMessages(3);
        }
        if (h.hasMessages(4))
        {
            h.removeMessages(4);
        }
        if (h.hasMessages(5))
        {
            h.removeMessages(5);
        }
        if (h.hasMessages(6))
        {
            h.removeMessages(6);
        }
        if (z != null)
        {
            Iterator iterator = z.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                AdvData advdata = (AdvData)iterator.next();
                if (advdata != null && advdata.nativeAd != null)
                {
                    advdata.nativeAd.n();
                }
            } while (true);
            z.clear();
            z = null;
        }
    }

    public void onResume()
    {
        super.onResume();
        if (D.getAndSet(false))
        {
            b(new com.nineoldandroids.a.b() {

                final BaseResultFragment a;

                public void b(com.nineoldandroids.a.a a1)
                {
                    BaseResultFragment.e(a);
                }

            
            {
                a = BaseResultFragment.this;
                super();
            }
            });
        }
    }

    public void onStop()
    {
        super.onStop();
        A = true;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        C.set(true);
        a.bringToFront();
        q();
        com.qihoo.security.ui.main.a.a(a, 300L, null);
    }

    protected int p()
    {
        return -1;
    }
}
