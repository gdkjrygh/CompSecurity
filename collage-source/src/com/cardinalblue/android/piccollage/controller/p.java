// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Handler;
import bolts.h;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.iab.util.d;
import com.cardinalblue.android.piccollage.iab.util.e;
import com.cardinalblue.android.piccollage.iab.util.f;
import com.cardinalblue.android.piccollage.model.PurchasableStickerBundle;
import com.cardinalblue.android.piccollage.model.StickerBundle;
import com.cardinalblue.android.piccollage.model.gson.IBackground;
import com.cardinalblue.android.piccollage.model.gson.PurchasableBackground;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            o, a

public class p
    implements android.content.DialogInterface.OnCancelListener, Observer
{

    com.cardinalblue.android.piccollage.iab.util.d.e a;
    private final Activity b;
    private final ProgressDialog c;
    private d d;
    private final ArrayList e = new ArrayList();
    private StickerBundle f;
    private boolean g;

    public p(Activity activity)
    {
        a = new com.cardinalblue.android.piccollage.iab.util.d.e() {

            final p a;

            public void a(e e1, f f1)
            {
                p.a(a, "StickerBundleRestoreClient", "Query inventory finished.");
                if (e1.d())
                {
                    p.a(a, "StickerBundleRestoreClient", (new StringBuilder()).append("Failed to query inventory: ").append(e1).toString());
                    com.cardinalblue.android.piccollage.a.b.o("iap failed");
                    com.cardinalblue.android.piccollage.controller.p.b(a);
                    return;
                }
                p.a(a, "StickerBundleRestoreClient", "Query inventory was successful.");
                h h1 = new h(Integer.valueOf(0));
                a a1 = com.cardinalblue.android.piccollage.controller.a.a();
                Object obj = a1.c();
                e1 = null;
                j j1 = j.a(Boolean.valueOf(true));
                obj = ((List) (obj)).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    IBackground ibackground = (IBackground)((Iterator) (obj)).next();
                    if ((ibackground instanceof PurchasableBackground) && f1.a(((PurchasableBackground)ibackground).getPurchaseInfo().l()) != null)
                    {
                        j1 = a1.a(((PurchasableBackground)ibackground).getPurchaseInfo());
                        if (e1 != null)
                        {
                            e1.b(new i(this, j1) {

                                final j a;
                                final _cls2 b;

                                public j a(j j)
                                    throws Exception
                                {
                                    return a;
                                }

                                public Object then(j j)
                                    throws Exception
                                {
                                    return a(j);
                                }

            
            {
                b = _pcls2;
                a = j;
                super();
            }
                            });
                        } else
                        {
                            e1 = j1;
                        }
                        h1.a(Integer.valueOf(((Integer)h1.a()).intValue() + 1));
                    }
                } while (true);
                j1.a(new i(this, h1, f1) {

                    final h a;
                    final f b;
                    final _cls2 c;

                    public Void a(j j)
                        throws Exception
                    {
                        com.cardinalblue.android.piccollage.controller.a.a().h();
                        a.a(Integer.valueOf(((Integer)a.a()).intValue() + p.a(c.a, b)));
                        if (((Integer)a.a()).intValue() <= 0)
                        {
                            com.cardinalblue.android.piccollage.a.b.o("no purchases");
                        }
                        return null;
                    }

                    public Object then(j j)
                        throws Exception
                    {
                        return a(j);
                    }

            
            {
                c = _pcls2;
                a = h1;
                b = f1;
                super();
            }
                });
            }

            
            {
                a = p.this;
                super();
            }
        };
        b = activity;
        c = new ProgressDialog(b);
        c.setProgressStyle(0);
        c.setOnCancelListener(this);
    }

    static int a(p p1, f f1)
    {
        return p1.a(f1);
    }

    private int a(f f1)
    {
        Iterator iterator = o.a().g().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            StickerBundle stickerbundle = (StickerBundle)iterator.next();
            if ((stickerbundle instanceof PurchasableStickerBundle) && f1.a(stickerbundle.l()) != null)
            {
                e.add(stickerbundle);
            }
        } while (true);
        e();
        return e.size();
    }

    static d a(p p1)
    {
        return p1.d;
    }

    static void a(p p1, String s, String s1)
    {
        p1.a(s, s1);
    }

    private void a(String s, String s1)
    {
    }

    private void b()
    {
        k.b(b, c);
    }

    static void b(p p1)
    {
        p1.c();
    }

    private void c()
    {
        k.a(b, c);
    }

    static void c(p p1)
    {
        p1.f();
    }

    private void d()
    {
        a("StickerBundleRestoreClient", "Creating IAB helper.");
        d = new d(b.getApplicationContext(), k.o());
        d.a(false);
        a("StickerBundleRestoreClient", "Starting setup.");
        d.a(new com.cardinalblue.android.piccollage.iab.util.d.d() {

            final p a;

            public void a(e e1)
            {
                p.a(a, "StickerBundleRestoreClient", "Setup finished.");
                if (!e1.c())
                {
                    p.a(a, "StickerBundleRestoreClient", (new StringBuilder()).append("Problem setting up in-app billing: ").append(e1).toString());
                    return;
                } else
                {
                    p.a(a, "StickerBundleRestoreClient", "Setup successful. Querying inventory.");
                    p.a(a).a(false, a.a);
                    return;
                }
            }

            
            {
                a = p.this;
                super();
            }
        });
    }

    private void e()
    {
        f();
    }

    private void f()
    {
        o o1 = o.a();
        if (!g && e != null && e.size() > 0)
        {
            o1.addObserver(this);
            f = (StickerBundle)e.get(0);
            o1.a(f);
            return;
        } else
        {
            com.cardinalblue.android.piccollage.a.b.o("restored");
            k.a(b, 0x7f07023e, 0);
            c();
            d.a();
            o1.deleteObserver(this);
            o1.q();
            return;
        }
    }

    private void g()
    {
        (new Handler()).postDelayed(new StickerBundleRestoreClient._cls3(), 50L);
    }

    private void h()
    {
        if (f != null)
        {
            e.remove(f);
        }
        f = null;
    }

    public void a()
    {
        c.setMessage(b.getString(0x7f070132));
        b();
        try
        {
            d();
            return;
        }
        catch (Exception exception)
        {
            c();
        }
        k.a(b, 0x7f07023f, 0);
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        com.cardinalblue.android.piccollage.a.b.o("canceled");
        g = true;
        c();
    }

    public void update(Observable observable, Object obj)
    {
        observable = (o.a)obj;
        if (((o.a) (observable)).a == o.a.a.c)
        {
            h();
            g();
        } else
        if (((o.a) (observable)).a == com.cardinalblue.android.piccollage.controller.o.a.a.d)
        {
            com.cardinalblue.android.piccollage.a.b.aW();
            h();
            g();
            return;
        }
    }

    // Unreferenced inner class com/cardinalblue/android/piccollage/controller/StickerBundleRestoreClient$3

/* anonymous class */
    class StickerBundleRestoreClient._cls3
        implements Runnable
    {

        final p a;

        public void run()
        {
            p.c(a);
        }

            
            {
                a = p.this;
                super();
            }
    }

}
