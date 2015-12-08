// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.CountDownTimer;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.a.a.a.a.f;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.s;
import com.taplytics.a.j;
import com.tinder.e.x;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.a;
import com.tinder.managers.ab;
import com.tinder.managers.ae;
import com.tinder.managers.d;
import com.tinder.model.ProfilePhoto;
import com.tinder.model.SparksEvent;
import com.tinder.model.SuperlikeStatus;
import com.tinder.model.User;
import com.tinder.utils.DateUtils;
import com.tinder.utils.ad;
import com.tinder.utils.q;
import com.tinder.utils.r;
import com.tinder.utils.t;
import com.tinder.utils.v;
import com.tinder.views.CircleTransformation;
import com.tinder.views.CircleWithImage;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.tinder.c:
//            al, n

public final class ak extends Dialog
    implements android.view.View.OnClickListener
{
    public static interface a
    {

        public abstract void a();
    }


    ab a;
    d b;
    ae c;
    public a d;
    public n.a e;
    private String f;
    private Button g;
    private Button h;
    private Button i;
    private User j;
    private CountDownTimer k;
    private TextView l;
    private com.tinder.d.a m;
    private int n;
    private x o;
    private List p;

    public ak(Context context, User user, int i1, int j1, com.tinder.d.a a1, x x, List list)
    {
        super(context);
        ManagerApp.h().a(this);
        j = user;
        f = ((ProfilePhoto)j.getPhotos().get(i1)).imageUrl;
        n = j1;
        m = a1;
        o = x;
        p = list;
        getWindow().getAttributes().windowAnimations = 0x7f0b01df;
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        setContentView(0x7f030052);
        context = (CircleWithImage)findViewById(0x7f0e016f);
        i1 = ad.a(getContext()) / 2;
        Picasso.a(getContext()).a(f).a(new CircleTransformation()).b().b(i1, i1).a(context, null);
        context = (TextView)findViewById(0x7f0e0171);
        user = (TextView)findViewById(0x7f0e0173);
        l = (TextView)findViewById(0x7f0e0172);
        g = (Button)findViewById(0x7f0e0177);
        h = (Button)findViewById(0x7f0e0175);
        i = (Button)findViewById(0x7f0e0176);
        new j("Paywall Dialog Options on Superlike", Boolean.valueOf(false), new al(this, user));
        long l1 = a();
        if (l1 == -1L)
        {
            dismiss();
        }
        long l2 = l1 / 1000L;
        if (l1 <= 1000L)
        {
            context.setText(0x7f0601f0);
            l.setVisibility(8);
            if (!a.j)
            {
                b.e();
                a.j = true;
            }
        } else
        {
            context.setText(DateUtils.b(l1));
            l.setVisibility(0);
            k = new CountDownTimer(l1, context) {

                final TextView a;
                final ak b;

                public final void onFinish()
                {
                    b.dismiss();
                }

                public final void onTick(long l3)
                {
                    a.setText(DateUtils.b(l3 - 1000L));
                }

            
            {
                b = ak.this;
                a = textview;
                super(l1, 1000L);
            }
            };
            k.start();
        }
        context = new SparksEvent("SuperLikeRoadblock.View");
        context.put("timeRemaining", Long.valueOf(l2));
        context.put("roadblockVersion", Integer.valueOf(1));
        context.put("otherId", j.getId());
        com.tinder.managers.a.a(context);
        m.h(n);
    }

    private long a()
    {
        Object obj = a.i.resetDate;
        if (obj != null && !((String) (obj)).equalsIgnoreCase("null")) goto _L2; else goto _L1
_L1:
        return -1L;
_L2:
        if ((obj = DateUtils.b().parse(((String) (obj)))) == null) goto _L1; else goto _L3
_L3:
        long l1 = System.currentTimeMillis();
        return (((Date) (obj)).getTime() + 1000L) - l1;
        ParseException parseexception;
        parseexception;
        v.a("parse superlike reset date in dialog:", parseexception);
        return -1L;
    }

    static n.a a(ak ak1, n.a a1)
    {
        ak1.e = a1;
        return a1;
    }

    static List a(ak ak1)
    {
        return ak1.p;
    }

    static void a(ak ak1, TextView textview, Object obj)
    {
        boolean flag = ((Boolean)obj).booleanValue();
        if (flag)
        {
            ak1.setOnCancelListener(ak1. new android.content.DialogInterface.OnCancelListener() {

                final ak a;

                public final void onCancel(DialogInterface dialoginterface)
                {
                    dialoginterface = new ArrayList(com.tinder.c.ak.a(a).size());
                    ArrayList arraylist = new ArrayList(com.tinder.c.ak.a(a).size());
                    f f1;
                    for (Iterator iterator = com.tinder.c.ak.a(a).iterator(); iterator.hasNext(); arraylist.add(f1.f))
                    {
                        f1 = (f)iterator.next();
                        dialoginterface.add(f1.a);
                    }

                    SparksEvent sparksevent = new SparksEvent("SuperLikeRoadblock.Cancel");
                    f f2 = r.b(com.tinder.c.ak.a(a));
                    if (f2 != null)
                    {
                        sparksevent.put("basePrice", f2.f);
                        sparksevent.put("currency", f2.e);
                    }
                    if (ak.b(a) != null)
                    {
                        sparksevent.put("term", Integer.valueOf(r.b(ak.b(a).b.a)));
                    }
                    try
                    {
                        sparksevent.put("products", com.tinder.c.n.a(com.tinder.c.ak.a(a)));
                    }
                    catch (JSONException jsonexception)
                    {
                        v.a("Failed to create JSON for concel analytics", jsonexception);
                    }
                    sparksevent.put("skus", dialoginterface);
                    sparksevent.put("prices", arraylist);
                    sparksevent.put("locale", t.b());
                    sparksevent.put("paywallVersion", Integer.valueOf(4));
                    sparksevent.put("percentLikesLeft", Integer.valueOf(a.a.g));
                    sparksevent.put("unlimitedLikesOffered", Boolean.valueOf(ae.u()));
                    sparksevent.put("superLikesRemaining", Integer.valueOf(a.a.i.numRemaining));
                    com.tinder.managers.a.a(sparksevent);
                }

            
            {
                a = ak.this;
                super();
            }
            });
        }
        boolean flag1 = ae.a();
        if (flag && !flag1)
        {
            obj = (RecyclerView)ak1.findViewById(0x7f0e0143);
            ak1.findViewById(0x7f0e0174).setVisibility(8);
            ((RecyclerView) (obj)).setVisibility(0);
            Object obj1 = new q(((RecyclerView) (obj)));
            ((q) (obj1)).a();
            ((RecyclerView) (obj)).setLayoutManager(((android.support.v7.widget.RecyclerView.LayoutManager) (obj1)));
            obj1 = new com.tinder.adapters.ad(ak1.getContext(), ak1.p, r.b);
            ((RecyclerView) (obj)).setAdapter(((android.support.v7.widget.RecyclerView.Adapter) (obj1)));
            ((RecyclerView) (obj)).addOnItemTouchListener(new com.tinder.utils.ab(ak1.getContext(), ak1. new com.tinder.utils.ab.a(((com.tinder.adapters.ad) (obj1))) {

                final com.tinder.adapters.ad a;
                final ak b;

                public final void a(int i1)
                {
                    f f1 = a.a(i1);
                    com.tinder.c.ak.a(b, new n.a(f1, -1));
                    ak.c(b).a(f1);
                    SparksEvent sparksevent = new SparksEvent("TinderPlus.Select");
                    sparksevent.put("term", Integer.valueOf(r.b(ak.b(b).b.a)));
                    f f2 = r.b(com.tinder.c.ak.a(b));
                    if (f2 != null)
                    {
                        sparksevent.put("basePrice", f2.f);
                    }
                    try
                    {
                        sparksevent.put("products", com.tinder.c.n.a(com.tinder.c.ak.a(b)));
                    }
                    catch (JSONException jsonexception)
                    {
                        v.a("Failed to create product JSON for product selection anayltics", jsonexception);
                    }
                    if (f1 != null)
                    {
                        sparksevent.put("sku", f1.a);
                        sparksevent.put("price", f1.f);
                        sparksevent.put("locale", t.b());
                        sparksevent.put("currency", f1.e);
                        sparksevent.put("paywallVersion", Integer.valueOf(4));
                        sparksevent.put("percentLikesLeft", Integer.valueOf(b.a.g));
                        sparksevent.put("unlimitedLikesOffered", Boolean.valueOf(ae.u()));
                        sparksevent.put("superLikesRemaining", Integer.valueOf(b.a.i.numRemaining));
                        com.tinder.managers.a.a(sparksevent);
                    }
                }

            
            {
                b = ak.this;
                a = ad1;
                super();
            }
            }));
        }
        if (flag1)
        {
            textview.setText(0x7f0601ed);
            ak1.g.setVisibility(0);
            ak1.g.setOnClickListener(ak1);
            ak1.h.setVisibility(8);
            ak1.i.setVisibility(8);
            return;
        } else
        {
            obj = ak1.j.getName();
            textview.setText(String.format(ak1.getContext().getResources().getString(0x7f0601ee), new Object[] {
                obj
            }));
            ak1.h.setVisibility(0);
            ak1.i.setVisibility(0);
            ak1.h.setOnClickListener(ak1);
            ak1.i.setOnClickListener(ak1);
            ak1.g.setVisibility(8);
            return;
        }
    }

    static n.a b(ak ak1)
    {
        return ak1.e;
    }

    private void b()
    {
        if (k != null)
        {
            k.cancel();
        }
    }

    static x c(ak ak1)
    {
        return ak1.o;
    }

    public final void onClick(View view)
    {
        view.getId();
        JVM INSTR tableswitch 2131624309 2131624311: default 32
    //                   2131624309 41
    //                   2131624310 124
    //                   2131624311 216;
           goto _L1 _L2 _L3 _L4
_L1:
        b();
        dismiss();
        return;
_L2:
        long l1 = a() / 1000L;
        view = new SparksEvent("SuperLikeRoadblock.Select");
        view.put("timeRemaining", Long.valueOf(l1));
        view.put("roadblockVersion", Integer.valueOf(1));
        view.put("otherId", j.getId());
        view.put("action", Integer.valueOf(1));
        com.tinder.managers.a.a(view);
        if (d == null);
        continue; /* Loop/switch isn't completed */
_L3:
        long l2 = a() / 1000L;
        view = new SparksEvent("SuperLikeRoadblock.Select");
        view.put("timeRemaining", Long.valueOf(l2));
        view.put("roadblockVersion", Integer.valueOf(1));
        view.put("otherId", j.getId());
        view.put("action", Integer.valueOf(2));
        com.tinder.managers.a.a(view);
        if (d != null)
        {
            d.a();
        }
        continue; /* Loop/switch isn't completed */
_L4:
        long l3 = a() / 1000L;
        view = new SparksEvent("SuperLikeRoadblock.Select");
        view.put("timeRemaining", Long.valueOf(l3));
        view.put("roadblockVersion", Integer.valueOf(1));
        view.put("otherId", j.getId());
        view.put("action", Integer.valueOf(3));
        com.tinder.managers.a.a(view);
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final boolean onKeyUp(int i1, KeyEvent keyevent)
    {
        if (i1 == 4)
        {
            b();
        }
        return super.onKeyUp(i1, keyevent);
    }
}
