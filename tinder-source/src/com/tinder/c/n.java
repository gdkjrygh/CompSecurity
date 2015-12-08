// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.a.a.a.a.f;
import com.taplytics.a.j;
import com.tinder.adapters.o;
import com.tinder.e.x;
import com.tinder.enums.PaywallPerk;
import com.tinder.f.ak;
import com.tinder.fragments.FragmentSideMenu;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.a;
import com.tinder.managers.ae;
import com.tinder.model.SparksEvent;
import com.tinder.utils.ab;
import com.tinder.utils.ad;
import com.tinder.utils.q;
import com.tinder.utils.r;
import com.tinder.utils.t;
import com.tinder.utils.v;
import com.tinder.views.BaseScroller;
import com.tinder.views.DividerItemDecoration;
import com.viewpagerindicator.CirclePageIndicator;
import java.lang.reflect.Field;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.tinder.c:
//            o, p

public final class n extends Dialog
    implements android.content.DialogInterface.OnCancelListener
{
    public static final class a
    {

        public int a;
        public f b;

        public a(f f1, int i1)
        {
            b = f1;
            a = i1;
        }
    }


    public a a;
    public int b;
    com.tinder.managers.ab c;
    ae d;
    private x e;
    private List f;
    private int g;
    private boolean h;
    private boolean i;
    private final Handler j = new Handler();
    private ViewPager k;
    private com.tinder.adapters.ad l;
    private List m;
    private com.tinder.d.a n;

    public n(Context context, List list, List list1, int i1, int j1, x x, com.tinder.d.a a1, 
            PaywallPerk paywallperk)
    {
        super(context, 0x7f0b0120);
        h = false;
        i = false;
        ManagerApp.h().a(this);
        Object obj = list1;
        if (list1 != null)
        {
            int k1 = list1.indexOf(paywallperk.stringVal);
            if (k1 >= 0)
            {
                Collections.swap(list1, 0, k1);
            }
            obj = list1;
            if (!ae.u())
            {
                obj = list1;
                if (list1.contains(PaywallPerk.UNLIMITED_LIKES.stringVal))
                {
                    obj = new ArrayList(list1);
                    ((List) (obj)).remove(PaywallPerk.UNLIMITED_LIKES.stringVal);
                }
            }
        }
        m = ((List) (obj));
        f = list;
        g = j1;
        b = i1;
        e = x;
        n = a1;
        list = getWindow();
        list1 = list.getAttributes();
        list1.width = (int)ad.a(0.92F);
        list.setAttributes(list1);
        list.setWindowAnimations(0x7f0b01df);
        setContentView(0x7f03004d);
        new j("Paywall Dialog Title", context.getString(0x7f060182), new com.tinder.c.o((TextView)findViewById(0x7f0e0140)));
        new j("Savings Text", context.getString(0x7f060180), new p((TextView)findViewById(0x7f0e0145)));
        x = (RecyclerView)findViewById(0x7f0e0143);
        k = (ViewPager)findViewById(0x7f0e0141);
        a1 = (CirclePageIndicator)findViewById(0x7f0e0142);
        list = (LinearLayout)findViewById(0x7f0e0144);
        list1 = (TextView)findViewById(0x7f0e0146);
        k.setAdapter(new o(context, m));
        a1.setViewPager(k);
        l = new com.tinder.adapters.ad(context, f, r.b);
        context = new q(x);
        context.a();
        x.addOnItemTouchListener(new ab(getContext(), new com.tinder.utils.ab.a() {

            final n a;

            public final void a(int l1)
            {
                com.tinder.c.n.a(a, new a(com.tinder.c.n.a(a).a(l1), l1));
                f f1 = com.tinder.c.n.a(a).a(l1);
                if (f1 == null)
                {
                    v.b("User clicked on a paywall option, but the adapter had no product at that position.");
                    return;
                }
                SparksEvent sparksevent = new SparksEvent("TinderPlus.Select");
                sparksevent.put("term", Integer.valueOf(r.b(n.b(a).b.a)));
                f f2 = r.b(n.c(a));
                if (f2 != null)
                {
                    sparksevent.put("basePrice", f2.f);
                }
                try
                {
                    sparksevent.put("products", com.tinder.c.n.a(n.c(a)));
                }
                catch (JSONException jsonexception)
                {
                    v.a("Failed to create product JSON for product selection anayltics", jsonexception);
                }
                sparksevent.put("features", n.d(a));
                sparksevent.put("sku", f1.a);
                sparksevent.put("price", f1.f);
                sparksevent.put("locale", t.b());
                sparksevent.put("currency", f1.e);
                sparksevent.put("paywallVersion", Integer.valueOf(4));
                sparksevent.put("from", Integer.valueOf(n.e(a)));
                sparksevent.put("percentLikesLeft", Integer.valueOf(a.c.g));
                sparksevent.put("unlimitedLikesOffered", Boolean.valueOf(ae.u()));
                sparksevent.put("superLikesRemaining", Integer.valueOf(com.tinder.c.n.f(a)));
                if (n.e(a) == 5)
                {
                    sparksevent.put("plusMenuOffer", FragmentSideMenu.c);
                }
                com.tinder.managers.a.a(sparksevent);
                n.g(a).a(f1);
            }

            
            {
                a = n.this;
                super();
            }
        }));
        x.setHasFixedSize(true);
        if (android.os.Build.VERSION.SDK_INT > 21)
        {
            x.addItemDecoration(new DividerItemDecoration(getContext(), getContext().getDrawable(0x7f020223)));
        } else
        {
            x.addItemDecoration(new DividerItemDecoration(getContext(), getContext().getResources().getDrawable(0x7f020223)));
        }
        x.setLayoutManager(context);
        x.setAdapter(l);
        if (f.size() > 1)
        {
            context = r.a(f);
            x = r.b(f);
            if (context == null || x == null || ((f) (context)).f.doubleValue() <= ((f) (x)).f.doubleValue())
            {
                list.setVisibility(8);
            } else
            {
                a1 = r.b.matcher(((f) (context)).a);
                i1 = 0x80000000;
                if (a1.matches() && a1.groupCount() == 1)
                {
                    i1 = Integer.parseInt(a1.group(1));
                } else
                {
                    list.setVisibility(8);
                }
                j1 = r.b(((f) (x)).a);
                if (i1 > 0x80000000)
                {
                    double d1 = ((f) (context)).f.doubleValue() / (double)i1 / (((f) (x)).f.doubleValue() / (double)j1);
                    context = NumberFormat.getPercentInstance();
                    context.setMinimumFractionDigits(0);
                    list1.setText(context.format(1.0D - d1));
                }
            }
        } else
        {
            list.setVisibility(8);
        }
        context = (android.widget.LinearLayout.LayoutParams)((View)list.getParent()).getLayoutParams();
        if (com.tinder.utils.o.b())
        {
            context.topMargin = 0;
            ((View)list.getParent()).setLayoutParams(context);
            list.getParent().requestLayout();
        }
        context = new Runnable() {

            final n a;

            private void a()
            {
                if (!com.tinder.c.n.j(a))
                {
                    Handler handler = n.k(a);
                    long l1;
                    if (n.h(a))
                    {
                        l1 = 8000L;
                    } else
                    {
                        l1 = 2000L;
                    }
                    handler.postDelayed(this, l1);
                }
            }

            public final void run()
            {
                int l1;
                if (n.h(a))
                {
                    a();
                    return;
                }
                l1 = n.i(a).getCurrentItem();
                if (l1 >= n.i(a).getAdapter().getCount() - 1) goto _L2; else goto _L1
_L1:
                l1++;
                if (l1 < n.i(a).getAdapter().getCount())
                {
                    n.i(a).setCurrentItem(l1, true);
                }
_L4:
                a();
                return;
_L2:
                if (n.i(a).getAdapter().getCount() > 0)
                {
                    n.i(a).setCurrentItem(0, true);
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                a = n.this;
                super();
            }
        };
        j.postDelayed(context, 2000L);
        try
        {
            list = new BaseScroller(getContext());
            list.setDuration(800);
            list.setFriction(0.025F);
            list1 = k.getClass().getDeclaredField("mScroller");
            list1.setAccessible(true);
            list1.set(k, list);
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            v.a("Failed to override scroller in view pager, view pager implementation has no field 'mScroller'.", list);
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            v.a("Failed to set paywall scroller found via reflection", list);
        }
        k.setOnTouchListener(new android.view.View.OnTouchListener(context) {

            final Runnable a;
            final n b;

            public final boolean onTouch(View view, MotionEvent motionevent)
            {
                switch (motionevent.getActionMasked())
                {
                default:
                    return false;

                case 0: // '\0'
                    com.tinder.c.n.a(b, true);
                    n.k(b).removeCallbacks(a);
                    return false;

                case 1: // '\001'
                    com.tinder.c.n.a(b, false);
                    break;
                }
                n.k(b).postDelayed(a, 8000L);
                return false;
            }

            
            {
                b = n.this;
                a = runnable;
                super();
            }
        });
        k.setPageTransformer(false, new android.support.v4.view.ViewPager.g() {

            final n a;

            public final void transformPage(View view, float f1)
            {
                int l1 = view.getWidth();
                if (f1 <= 1.0F)
                {
                    ImageView imageview = (ImageView)view.findViewById(0x7f0e01b8);
                    TextView textview = (TextView)view.findViewById(0x7f0e01ba);
                    view = (TextView)view.findViewById(0x7f0e01bb);
                    imageview.setTranslationX((float)((double)f1 * ((double)l1 / 1.5D)));
                    textview.setTranslationX((float)(l1 / 1) * f1);
                    view.setTranslationX((float)((double)f1 * ((double)l1 / 0.5D)));
                }
            }

            
            {
                a = n.this;
                super();
            }
        });
        context = new android.support.v4.view.ViewPager.i() {

            int a;
            final n b;

            public final void b(int l1)
            {
                SparksEvent sparksevent;
                sparksevent = new SparksEvent("TinderPlus.PaywallFeatureView");
                sparksevent.put("products", com.tinder.c.n.a(n.c(b)));
                sparksevent.put("features", n.d(b));
                if (n.d(b).size() > l1)
                {
                    sparksevent.put("feature", n.d(b).get(l1));
                }
                sparksevent.put("position", Integer.valueOf(l1));
                if (a == l1)
                {
                    break MISSING_BLOCK_LABEL_117;
                }
                int i2;
                if (a > l1)
                {
                    i2 = 0;
                } else
                {
                    i2 = 1;
                }
                sparksevent.put("direction", Integer.valueOf(i2));
                sparksevent.put("from", Integer.valueOf(n.e(b)));
                sparksevent.put("superLikesRemaining", Integer.valueOf(com.tinder.c.n.f(b)));
                sparksevent.put("unlimitedLikesOffered", Boolean.valueOf(ae.u()));
                if (n.e(b) == 5)
                {
                    sparksevent.put("plusMenuOffer", FragmentSideMenu.c);
                }
                com.tinder.managers.a.a(sparksevent);
_L2:
                a = l1;
                return;
                JSONException jsonexception;
                jsonexception;
                v.a("Failed to create product JSON for analytics.", jsonexception);
                if (true) goto _L2; else goto _L1
_L1:
            }

            
            {
                b = n.this;
                super();
                a = 0;
            }
        };
        k.addOnPageChangeListener(context);
        context.b(0);
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        setOnCancelListener(this);
    }

    static com.tinder.adapters.ad a(n n1)
    {
        return n1.l;
    }

    static a a(n n1, a a1)
    {
        n1.a = a1;
        return a1;
    }

    public static JSONArray a(List list)
        throws JSONException
    {
        JSONArray jsonarray = new JSONArray();
        JSONObject jsonobject;
        for (list = list.iterator(); list.hasNext(); jsonarray.put(jsonobject))
        {
            f f1 = (f)list.next();
            jsonobject = new JSONObject();
            jsonobject.put("sku", f1.a);
            jsonobject.put("price", f1.f);
        }

        return jsonarray;
    }

    static void a(TextView textview, Object obj)
    {
        textview.setText((String)obj);
    }

    static boolean a(n n1, boolean flag)
    {
        n1.h = flag;
        return flag;
    }

    static a b(n n1)
    {
        return n1.a;
    }

    static void b(TextView textview, Object obj)
    {
        textview.setText((String)obj);
    }

    static List c(n n1)
    {
        return n1.f;
    }

    static List d(n n1)
    {
        return n1.m;
    }

    static int e(n n1)
    {
        return n1.b;
    }

    static int f(n n1)
    {
        return n1.g;
    }

    static x g(n n1)
    {
        return n1.e;
    }

    static boolean h(n n1)
    {
        return n1.h;
    }

    static ViewPager i(n n1)
    {
        return n1.k;
    }

    static boolean j(n n1)
    {
        return n1.i;
    }

    static Handler k(n n1)
    {
        return n1.j;
    }

    public final void dismiss()
    {
        super.dismiss();
        i = true;
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        dialoginterface = new ArrayList(f.size());
        ArrayList arraylist = new ArrayList(f.size());
        f f1;
        for (Iterator iterator = f.iterator(); iterator.hasNext(); arraylist.add(f1.f))
        {
            f1 = (f)iterator.next();
            dialoginterface.add(f1.a);
        }

        SparksEvent sparksevent = new SparksEvent("TinderPlus.Cancel");
        f f2 = r.b(f);
        if (f2 != null)
        {
            sparksevent.put("basePrice", f2.f);
            sparksevent.put("currency", f2.e);
        }
        if (a != null)
        {
            sparksevent.put("term", Integer.valueOf(r.b(a.b.a)));
        }
        try
        {
            sparksevent.put("products", a(f));
        }
        catch (JSONException jsonexception)
        {
            v.a("Failed to create JSON for concel analytics", jsonexception);
        }
        sparksevent.put("features", m);
        sparksevent.put("skus", dialoginterface);
        sparksevent.put("prices", arraylist);
        sparksevent.put("locale", t.b());
        sparksevent.put("from", Integer.valueOf(b));
        sparksevent.put("paywallVersion", Integer.valueOf(4));
        sparksevent.put("percentLikesLeft", Integer.valueOf(c.g));
        sparksevent.put("unlimitedLikesOffered", Boolean.valueOf(ae.u()));
        sparksevent.put("superLikesRemaining", Integer.valueOf(g));
        if (b == 5)
        {
            sparksevent.put("plusMenuOffer", FragmentSideMenu.c);
        }
        com.tinder.managers.a.a(sparksevent);
        dismiss();
    }

    public final void show()
    {
        super.show();
        SparksEvent sparksevent = new SparksEvent("TinderPlus.Paywall");
        ArrayList arraylist = new ArrayList(f.size());
        f f2;
        for (Iterator iterator = f.iterator(); iterator.hasNext(); sparksevent.put(f2.a, Boolean.valueOf(true)))
        {
            f2 = (f)iterator.next();
            arraylist.add(f2.a);
        }

        f f1 = r.b(f);
        if (f1 != null)
        {
            sparksevent.put("basePrice", f1.f);
            sparksevent.put("currency", f1.e);
        }
        sparksevent.put("skus", arraylist);
        try
        {
            sparksevent.put("products", a(f));
        }
        catch (JSONException jsonexception)
        {
            v.a("Failed to create json for products for Paywall view analytics", jsonexception);
        }
        sparksevent.put("features", m);
        sparksevent.put("locale", t.b());
        sparksevent.put("from", Integer.valueOf(b));
        sparksevent.put("paywallVersion", Integer.valueOf(4));
        sparksevent.put("percentLikesLeft", Integer.valueOf(c.g));
        sparksevent.put("unlimitedLikesOffered", Boolean.valueOf(ae.u()));
        if (b == 5)
        {
            sparksevent.put("plusMenuOffer", FragmentSideMenu.c);
        }
        com.tinder.managers.a.a(sparksevent);
    }
}
