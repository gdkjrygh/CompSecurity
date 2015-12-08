// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.services;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.e;
import com.google.android.gms.wearable.f;
import com.google.android.gms.wearable.g;
import com.google.android.gms.wearable.j;
import com.google.android.gms.wearable.k;
import com.google.android.gms.wearable.l;
import com.google.android.gms.wearable.m;
import com.google.android.gms.wearable.n;
import com.google.android.gms.wearable.o;
import com.google.android.gms.wearable.p;
import com.google.android.gms.wearable.q;
import com.tinder.activities.ActivityMain;
import com.tinder.activities.ActivityProfile;
import com.tinder.e.aa;
import com.tinder.e.as;
import com.tinder.e.u;
import com.tinder.events.EventRecsAdded;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ab;
import com.tinder.managers.d;
import com.tinder.managers.i;
import com.tinder.managers.z;
import com.tinder.model.User;
import com.tinder.model.WearUser;
import com.tinder.utils.ae;
import com.tinder.utils.ag;
import de.greenrobot.event.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class WearClientService extends q
    implements com.google.android.gms.common.api.c.b, com.google.android.gms.common.api.c.c, com.tinder.utils.ae.a
{

    public com.google.android.gms.common.api.c a;
    ab b;
    i c;
    d d;
    z e;
    c f;
    private as g;
    private ArrayList h;
    private ae i;
    private Handler j;

    public WearClientService()
    {
        ManagerApp.h().a(this);
    }

    private void a()
    {
        ab ab1 = b;
        if (!d.f())
        {
            b();
        }
        g = new as() {

            final WearClientService a;

            public final void c()
            {
                WearClientService.a(a);
            }

            public final void d()
            {
                WearClientService.a(a);
            }

            public final void e()
            {
                WearClientService.b(a);
            }

            public final void f()
            {
            }

            public final void g()
            {
            }

            
            {
                a = WearClientService.this;
                super();
            }
        };
        ab1.a(g);
    }

    static void a(WearClientService wearclientservice)
    {
        o o1 = o.a("/api/recs/get_recs/failure");
        p.a.a(wearclientservice.a, o1.a());
    }

    private void a(String s, boolean flag)
    {
        j.post(new Runnable(flag, s) {

            final boolean a;
            final String b;
            final WearClientService c;

            public final void run()
            {
                ab ab1;
                java.util.LinkedList linkedlist;
                Object obj;
                LinkedHashSet linkedhashset;
                boolean flag1;
                if (a)
                {
                    com.tinder.e.l l1 = new com.tinder.e.l(this) {

                        final _cls3 a;

                        public final void a(int i1)
                        {
                        }

                        public final void c()
                        {
                        }

                        public final void d()
                        {
                        }

            
            {
                a = _pcls3;
                super();
            }
                    };
                    c.b.a(b, l1);
                } else
                {
                    u u = new u(this) {

                        final _cls3 a;

                        public final void c()
                        {
                        }

                        public final void d()
                        {
                        }

                        public final void f()
                        {
                        }

            
            {
                a = _pcls3;
                super();
            }
                    };
                    c.b.a(b, u);
                }
                ab1 = c.b;
                obj = b;
                linkedlist = ab1.a;
                obj = Arrays.asList(new String[] {
                    obj
                });
                linkedhashset = new LinkedHashSet(linkedlist.size() + ((Collection) (obj)).size());
                flag1 = linkedhashset.addAll(linkedlist);
                if (linkedhashset.addAll(((Collection) (obj))) | flag1)
                {
                    ab1.g();
                }
                new ArrayList(linkedhashset);
            }

            
            {
                c = WearClientService.this;
                a = flag;
                b = s;
                super();
            }
        });
    }

    private void b()
    {
        o o1 = o.a("/api/logged_out");
        p.a.a(a, o1.a());
    }

    static void b(WearClientService wearclientservice)
    {
        wearclientservice.b();
    }

    private void b(String s, boolean flag)
    {
        if (flag)
        {
            Object obj = c.a(s);
            s = new Bundle();
            s.putBoolean("from_push", true);
            s.putParcelable("match", ((android.os.Parcelable) (obj)));
            obj = new Intent(getApplicationContext(), com/tinder/activities/ActivityMain);
            ((Intent) (obj)).addFlags(0x14000000);
            ((Intent) (obj)).putExtras(s);
            startActivity(((Intent) (obj)));
            return;
        }
        User user = b.a(s);
        if (user == null)
        {
            e.a(s, new aa() {

                final WearClientService a;

                public final void onProfileLoadFailed()
                {
                }

                public final void onProfileLoaded(User user1)
                {
                    a.a(user1);
                }

            
            {
                a = WearClientService.this;
                super();
            }
            });
            return;
        } else
        {
            a(user);
            return;
        }
    }

    public final void a(int i1)
    {
        f.b(this);
    }

    public final void a(Bundle bundle)
    {
        f.a(this, false);
    }

    public final void a(ConnectionResult connectionresult)
    {
    }

    public final void a(User user)
    {
        Intent intent = new Intent(getApplicationContext(), com/tinder/activities/ActivityProfile);
        intent.putExtra("user", user);
        intent.putExtra("from_wear", true);
        intent.addFlags(0x14000000);
        startActivity(intent);
    }

    public final void a(List list)
    {
        ArrayList arraylist = new ArrayList();
        com.google.android.gms.wearable.i i1;
        for (list = list.iterator(); list.hasNext(); arraylist.add(i1))
        {
            WearUser wearuser = (WearUser)list.next();
            i1 = new com.google.android.gms.wearable.i();
            i1.a("rec string", ag.a(wearuser));
            i1.a("rec asset", wearuser.getAsset());
        }

        list = o.a("/api/recs/get_recs/success");
        ((o) (list)).a.a("rec users", arraylist);
        ((o) (list)).a.a("time_millis", System.currentTimeMillis());
        p.a.a(a, list.a()).a(new com.google.android.gms.common.api.g() {

            final WearClientService a;

            public final void a(com.google.android.gms.common.api.f f1)
            {
                f1 = (com.google.android.gms.wearable.d.a)f1;
                (new StringBuilder("recs result sent .. status ")).append(f1.a());
            }

            
            {
                a = WearClientService.this;
                super();
            }
        });
    }

    public void onCreate()
    {
        i = new ae(this);
        a = (new com.google.android.gms.common.api.c.a(this)).a(p.l).a(this).a(this).b();
        h = new ArrayList();
        j = new Handler(Looper.getMainLooper());
        a.b();
        p.d.a(a, this);
        p.c.a(a, this);
        p.a.a(a, this);
        super.onCreate();
    }

    public void onDataChanged(f f1)
    {
        ArrayList arraylist = new ArrayList();
        for (f1 = f1.iterator(); f1.hasNext(); arraylist.add(((com.google.android.gms.common.data.c)f1.next()).a())) { }
        f1 = arraylist.iterator();
        do
        {
            if (!f1.hasNext())
            {
                break;
            }
            Object obj = (e)f1.next();
            Uri uri = ((e) (obj)).b().b();
            String s = uri.getPath();
            (new StringBuilder("data uri ")).append(uri);
            obj = com.google.android.gms.wearable.j.a(((e) (obj)).b());
            obj = (new o(PutDataRequest.a(((j) (obj)).a), ((j) (obj)).b)).a;
            if (s.equals("/api/recs/get_recs/"))
            {
                long l1 = ((com.google.android.gms.wearable.i) (obj)).f("time_millis");
                if (!h.contains(Long.valueOf(l1)))
                {
                    a();
                    h.add(Long.valueOf(l1));
                }
            } else
            if (s.equals("/api/recs/like/"))
            {
                a(((com.google.android.gms.wearable.i) (obj)).i("user_id"), true);
            } else
            if (s.equals("/api/recs/pass/"))
            {
                a(((com.google.android.gms.wearable.i) (obj)).i("user_id"), false);
            }
        } while (true);
    }

    public void onDestroy()
    {
        if (a != null)
        {
            if (p.a != null)
            {
                p.a.b(a, this);
            }
            if (p.c != null && a != null)
            {
                p.c.b(a, this);
            }
            if (p.d != null && a != null)
            {
                p.d.b(a, this);
            }
            a.c();
        }
        super.onDestroy();
    }

    public void onEventMainThread(EventRecsAdded eventrecsadded)
    {
        eventrecsadded = new ArrayList(eventrecsadded.getAddedRecs());
        i.a(eventrecsadded);
    }

    public void onMessageReceived(l l1)
    {
        String s = l1.a();
        if (s.equals("/start/recs"))
        {
            a();
        } else
        {
            if (s.equals("/start/profile/match"))
            {
                b(ag.a(l1.b()), true);
                return;
            }
            if (s.equals("/start/profile/rec"))
            {
                b(ag.a(l1.b()), false);
                return;
            }
            if (s.equals("/api/recs/like/"))
            {
                a(ag.a(l1.b()), true);
                return;
            }
            if (s.equals("/api/recs/pass/"))
            {
                a(ag.a(l1.b()), false);
                return;
            }
        }
    }

    public void onPeerConnected(m m)
    {
        super.onPeerConnected(m);
    }

    public void onPeerDisconnected(m m)
    {
        super.onPeerDisconnected(m);
    }
}
