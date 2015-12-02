// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import com.mobvista.sdk.m.a.a.c.d;
import com.mobvista.sdk.m.core.c.b;
import com.mobvista.sdk.m.core.c.f;
import com.mobvista.sdk.m.core.entity.Campaign;
import com.mobvista.sdk.m.core.entity.CampaignEx;
import com.mobvista.sdk.m.core.entity.c;
import com.mobvista.sdk.m.core.loader.a;
import com.mobvista.sdk.m.core.loader.l;
import com.mobvista.sdk.m.core.loader.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.mobvista.sdk.m.core:
//            ac, t, u, AdListener, 
//            MobvistaAd, v, AdTrackingListener

public class MobvistaAdNative
    implements d
{

    private ac a;
    private Context b;
    private String c;
    private String d;
    private List e;
    private com.mobvista.sdk.m.core.c.d f;
    private com.mobvista.sdk.m.core.entity.b g;
    private List h;
    private f i;
    private CampaignEx j;
    private Campaign k;
    private final int l = 10000;
    private final int m = 10003;
    private AdListener n;
    private com.mobvista.sdk.m.core.a.b o;
    private Handler p;
    private Runnable q;

    protected MobvistaAdNative(Activity activity, String s, String s1)
    {
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        n = null;
        o = null;
        b = activity;
        c = s;
        d = s1;
        a = new ac(b, s);
        if (i == null)
        {
            i = com.mobvista.sdk.m.core.c.f.a(activity);
        }
        p = new Handler();
        a();
    }

    static Handler a(MobvistaAdNative mobvistaadnative)
    {
        return mobvistaadnative.p;
    }

    static Campaign a(MobvistaAdNative mobvistaadnative, Campaign campaign)
    {
        mobvistaadnative.k = campaign;
        return campaign;
    }

    private void a()
    {
        if (f == null)
        {
            f = com.mobvista.sdk.m.core.c.d.a(i);
        }
        e = f.a(c);
        b();
    }

    static Runnable b(MobvistaAdNative mobvistaadnative)
    {
        return mobvistaadnative.q;
    }

    private void b()
    {
        l l1 = new l();
        l1.a(b, c);
        l1.a(10003, this);
        Log.i("MobvistaAdNative", "start to load profile...");
    }

    private void c()
    {
        com.mobvista.sdk.m.core.c.b.a(i).b();
        a a1 = new a();
        a1.a(1, com.mobvista.sdk.m.a.f.d.a, i, b, c);
        a1.a(10000, this);
        Log.i("MobvistaAdNative", "start to load ads...");
        o = null;
    }

    static boolean c(MobvistaAdNative mobvistaadnative)
    {
        return mobvistaadnative.f();
    }

    private void d()
    {
        o = new com.mobvista.sdk.m.core.a.b();
        o.a(new Object[] {
            b, d
        });
        o.a(new t(this));
        if (q == null)
        {
            q = new u(this);
        }
        p.postDelayed(q, 8000L);
        j = null;
    }

    static boolean d(MobvistaAdNative mobvistaadnative)
    {
        return mobvistaadnative.e();
    }

    static com.mobvista.sdk.m.core.a.b e(MobvistaAdNative mobvistaadnative)
    {
        return mobvistaadnative.o;
    }

    private boolean e()
    {
        if (g.a().equals("facebook"))
        {
            d();
            return true;
        }
        if (g.a().equals("mobvista"))
        {
            c();
            return true;
        } else
        {
            return false;
        }
    }

    static Campaign f(MobvistaAdNative mobvistaadnative)
    {
        return mobvistaadnative.k;
    }

    private boolean f()
    {
        if (h == null || h.size() == 0)
        {
            return false;
        }
        com.mobvista.sdk.m.core.entity.b b1 = null;
        Iterator iterator = h.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.mobvista.sdk.m.core.entity.b b2 = (com.mobvista.sdk.m.core.entity.b)iterator.next();
            if (b2.h().get("native") != null)
            {
                int j1 = ((c)b2.h().get("native")).b();
                int i1;
                if (b1 == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = ((c)b1.h().get("native")).b();
                }
                if (j1 > i1)
                {
                    b1 = b2;
                }
            }
        } while (true);
        if (b1 != null)
        {
            h.remove(b1);
            g = b1;
            return true;
        } else
        {
            return false;
        }
    }

    static AdListener g(MobvistaAdNative mobvistaadnative)
    {
        return mobvistaadnative.n;
    }

    static void h(MobvistaAdNative mobvistaadnative)
    {
        mobvistaadnative.c();
    }

    static CampaignEx i(MobvistaAdNative mobvistaadnative)
    {
        return mobvistaadnative.j;
    }

    static ac j(MobvistaAdNative mobvistaadnative)
    {
        return mobvistaadnative.a;
    }

    public void OnLoadCanceled(int i1)
    {
    }

    public void OnLoadError(int i1, String s)
    {
        if (n != null)
        {
            n.onAdLoadError(s);
        }
    }

    public void OnLoadFinish(int i1, Object obj)
    {
label0:
        {
label1:
            {
                if (i1 == 10000)
                {
                    if (obj != null)
                    {
                        List list = (List)obj;
                        if (list != null && list.size() > 0)
                        {
                            j = (CampaignEx)list.get(0);
                            if (n != null)
                            {
                                k = new Campaign();
                                k.setId(j.getId());
                                k.setAppName(j.getAppName());
                                k.setAppDesc(j.getAppDesc());
                                k.setIconUrl(j.getIconUrl());
                                k.setImageUrl(j.getImageUrl());
                                k.setBgImage(j.getBgImage());
                                k.setTimestamp(System.currentTimeMillis());
                                k.setType(2);
                                n.onAdLoaded(k);
                            }
                            Log.i("MobvistaAdNative", "Load Ads success.");
                        }
                    } else
                    if (n != null)
                    {
                        Log.i("MobvistaAdNative", "Load ads failed: No fill.");
                        n.onAdLoadError("No fill");
                    }
                }
                if (i1 == 10003)
                {
                    obj = (m)obj;
                    if (obj == null)
                    {
                        break label0;
                    }
                    if (((m) (obj)).a() != m.a)
                    {
                        break label1;
                    }
                    if (((m) (obj)).c() != null && ((m) (obj)).c().size() > 0)
                    {
                        e = ((m) (obj)).c();
                        f.a(e, c);
                    }
                }
                return;
            }
            Log.i("MobvistaAdNative", (new StringBuilder("load profile failed: [")).append(((m) (obj)).a()).append("]   ").append(((m) (obj)).b()).toString());
            return;
        }
        Log.i("MobvistaAdNative", "profile is empty.");
    }

    public void OnLoadStart(int i1)
    {
    }

    public void loadAd(AdListener adlistener)
    {
        loadAds(adlistener);
    }

    public void loadAds(AdListener adlistener)
    {
label0:
        {
            n = adlistener;
            adlistener = MobvistaAd.popPreloadedNativeAd(c);
            if (adlistener != null && ((MobvistaAdNative) (adlistener)).k != null && (((MobvistaAdNative) (adlistener)).j != null || ((MobvistaAdNative) (adlistener)).o != null))
            {
                k = ((MobvistaAdNative) (adlistener)).k;
                j = ((MobvistaAdNative) (adlistener)).j;
                o = ((MobvistaAdNative) (adlistener)).o;
                n.onAdLoaded(k);
                return;
            }
            if (e == null)
            {
                break label0;
            }
            h = new ArrayList();
            h.addAll(e);
            do
            {
                if (!f())
                {
                    break label0;
                }
            } while (!e());
            return;
        }
        c();
    }

    public void registerView(View view)
    {
        registerView(view, null);
    }

    public void registerView(View view, AdTrackingListener adtrackinglistener)
    {
        if (k == null)
        {
            Log.w("MobvistaAdNative", "No ad loaded, call loadAds() to get ad first");
            return;
        }
        a.a(adtrackinglistener);
        if (o != null)
        {
            o.a(view);
            return;
        }
        if (j == null)
        {
            Log.w("MobvistaAdNative", "No ad loaded, call loadAds() to get ad first");
            return;
        }
        if (j.isPreClick())
        {
            a.a(j, true);
        }
        a.a(j);
        view.setOnClickListener(new v(this));
    }

    public void release()
    {
        if (o != null)
        {
            o.a();
        }
        a.a();
    }
}
