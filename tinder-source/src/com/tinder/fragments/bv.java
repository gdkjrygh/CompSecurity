// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tinder.activities.ActivityMain;
import com.tinder.activities.ActivityPassport;
import com.tinder.adapters.j;
import com.tinder.enums.PaywallPerk;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.a;
import com.tinder.managers.aa;
import com.tinder.managers.ae;
import com.tinder.managers.y;
import com.tinder.model.Paywall;
import com.tinder.model.SparksEvent;
import com.tinder.model.TinderLocation;
import com.tinder.utils.ad;

// Referenced classes of package com.tinder.fragments:
//            FragmentAnchoredPopup

public final class bv extends FragmentAnchoredPopup.b
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener
{

    public static float a = 0.75F;
    y b;
    ae c;
    aa d;
    ListView e;
    View f;
    ImageView g;
    TextView h;
    j i;
    FragmentAnchoredPopup j;
    int k;
    int l;
    private boolean m;

    public bv()
    {
        ManagerApp.h().a(this);
    }

    static boolean a(bv bv1)
    {
        bv1.m = false;
        return false;
    }

    static FragmentAnchoredPopup b(bv bv1)
    {
        return bv1.j;
    }

    public final void a()
    {
        if (g == null)
        {
            return;
        }
        boolean flag = b.b();
        Object obj = g;
        int i1;
        if (flag)
        {
            i1 = 4;
        } else
        {
            i1 = 0;
        }
        ((ImageView) (obj)).setVisibility(i1);
        obj = h;
        if (flag)
        {
            i1 = l;
        } else
        {
            i1 = k;
        }
        ((TextView) (obj)).setTextColor(i1);
    }

    public final void onClick(View view)
    {
        if (m)
        {
            return;
        }
        m = true;
        switch (view.getId())
        {
        default:
            m = false;
            return;

        case 2131624251: 
            d.a(new com.tinder.e.ak() {

                final bv a;

                public final void a()
                {
                    com.tinder.fragments.bv.a(a);
                    SparksEvent sparksevent = new SparksEvent("Passport.MapOpen");
                    sparksevent.put("from", Integer.valueOf(1));
                    com.tinder.managers.a.a(sparksevent);
                    bv.b(a).b.post(new Runnable(this) {

                        final _cls1 a;

                        public final void run()
                        {
                            ActivityMain activitymain = (ActivityMain)bv.b(a.a).getActivity();
                            activitymain.startActivityForResult(new Intent(activitymain, com/tinder/activities/ActivityPassport), 9455);
                        }

            
            {
                a = _pcls1;
                super();
            }
                    });
                    bv.b(a).b.postDelayed(new Runnable(this) {

                        final _cls1 a;

                        public final void run()
                        {
                            bv.b(a.a).d();
                        }

            
            {
                a = _pcls1;
                super();
            }
                    }, 300L);
                }

                public final void b()
                {
                    com.tinder.fragments.bv.a(a);
                    SparksEvent sparksevent = new SparksEvent("Passport.MapOpen");
                    sparksevent.put("from", Integer.valueOf(1));
                    com.tinder.managers.a.a(sparksevent);
                    ((Paywall)bv.b(a).a).launchPlusSubscriptionPaywall(1, PaywallPerk.PASSPORT);
                }

                public final void c()
                {
                    com.tinder.fragments.bv.a(a);
                    Toast.makeText(bv.b(a).a, bv.b(a).a.getString(0x7f0600ab), 1).show();
                }

            
            {
                a = bv.this;
                super();
            }
            });
            break;
        }
    }

    public final void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        if (m)
        {
            return;
        }
        m = true;
        if (i1 == 0)
        {
            i.a(null);
            i.notifyDataSetChanged();
            g.setVisibility(0);
            ((ActivityMain)j.getActivity()).x();
            h.setTextColor(k);
            adapterview = new SparksEvent("Passport.MenuMyLocation");
            adapterview.put("from", Integer.valueOf(1));
            com.tinder.managers.a.a(adapterview);
            a();
            m = false;
            j.b();
            return;
        } else
        {
            adapterview = (TinderLocation)i.getItem(i1 - 1);
            g.setVisibility(4);
            h.setTextColor(l);
            i.a(adapterview);
            ((ActivityMain)j.getActivity()).a(adapterview);
            i.notifyDataSetChanged();
            a();
            AsyncTask.execute(new Runnable(adapterview) {

                final TinderLocation a;
                final bv b;

                public final void run()
                {
                    SparksEvent sparksevent = new SparksEvent("Passport.MenuChooseLocation");
                    sparksevent.put("newLat", Double.valueOf(a.getLatitude()));
                    sparksevent.put("newLon", Double.valueOf(a.getLongitude()));
                    com.tinder.managers.a.a(sparksevent);
                }

            
            {
                b = bv.this;
                a = tinderlocation;
                super();
            }
            });
            g.post(new Runnable() {

                final bv a;

                public final void run()
                {
                    com.tinder.fragments.bv.a(a);
                    bv.b(a).b();
                }

            
            {
                a = bv.this;
                super();
            }
            });
            return;
        }
    }


    // Unreferenced inner class com/tinder/fragments/bv$4

/* anonymous class */
    final class _cls4
        implements Runnable
    {

        final bv a;

        public final void run()
        {
            com.tinder.fragments.bv.a(a);
            com.tinder.managers.a.a("Passport.MenuClose");
        }

            
            {
                a = bv.this;
                super();
            }
    }


    // Unreferenced inner class com/tinder/fragments/bv$5

/* anonymous class */
    final class _cls5
        implements Runnable
    {

        final ImageView a;
        final Context b;
        final bv c;

        public final void run()
        {
            ad.a(a, android.support.v4.b.a.a(b, 0x7f0201c1));
        }

            
            {
                c = bv.this;
                a = imageview;
                b = context;
                super();
            }
    }


    // Unreferenced inner class com/tinder/fragments/bv$6

/* anonymous class */
    final class _cls6
        implements Runnable
    {

        final ImageView a;
        final Context b;
        final bv c;

        public final void run()
        {
            ad.a(a, android.support.v4.b.a.a(b, 0x7f0201c0));
        }

            
            {
                c = bv.this;
                a = imageview;
                b = context;
                super();
            }
    }

}
