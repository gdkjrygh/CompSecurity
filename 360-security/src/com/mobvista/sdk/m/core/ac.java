// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.view.Window;
import com.mobvista.sdk.m.a.f.j;
import com.mobvista.sdk.m.core.c.c;
import com.mobvista.sdk.m.core.c.f;
import com.mobvista.sdk.m.core.entity.CampaignEx;
import com.mobvista.sdk.m.core.loader.JumpLoader;
import com.mobvista.sdk.m.core.loader.h;
import com.mobvista.sdk.m.core.loader.k;
import com.mobvista.sdk.m.core.util.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.mobvista.sdk.m.core:
//            AdTrackingListener, ag, ad, ae, 
//            af, AdListener

public final class ac
{

    public static boolean a = false;
    private boolean b;
    private String c;
    private final int d = 10001;
    private final int e = 10002;
    private f f;
    private Context g;
    private com.mobvista.sdk.m.core.d.a h;
    private com.mobvista.sdk.m.b.a i;
    private JumpLoader j;
    private HashMap k;
    private AdTrackingListener l;

    public ac(Context context, String s)
    {
        f = null;
        g = null;
        h = null;
        l = null;
        g = context;
        c = s;
        if (f == null)
        {
            f = com.mobvista.sdk.m.core.c.f.a(g);
        }
        k = new HashMap();
    }

    static f a(ac ac1)
    {
        return ac1.f;
    }

    static void a(ac ac1, CampaignEx campaignex, com.mobvista.sdk.m.core.loader.JumpLoader.JumpLoaderResult jumploaderresult)
    {
        ac1.a(campaignex, jumploaderresult);
    }

    private void a(CampaignEx campaignex, com.mobvista.sdk.m.core.loader.JumpLoader.JumpLoaderResult jumploaderresult)
    {
        if (!com.mobvista.sdk.m.a.f.j.a(jumploaderresult.getUrl())) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (jumploaderresult.getCode() != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        Log.i("Mobvista SDK M", (new StringBuilder("Jump to Google Play: ")).append(jumploaderresult.getUrl()).toString());
        if (!TextUtils.isEmpty(campaignex.getPackageName()) && !TextUtils.isEmpty(jumploaderresult.getUrl()) && jumploaderresult.getUrl().contains(campaignex.getPackageName()))
        {
            com.mobvista.sdk.m.core.util.a.a(g, jumploaderresult.getUrl());
        } else
        {
            com.mobvista.sdk.m.core.util.a.a(g, (new StringBuilder("market://details?id=")).append(campaignex.getPackageName()).toString());
            Log.e("Mobvista SDK M", (new StringBuilder("code market This pkg is ")).append(campaignex.getPackageName()).toString());
        }
        if (l != null)
        {
            l.onFinishRedirection(campaignex, jumploaderresult.getUrl());
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (jumploaderresult.getCode() == 2)
        {
            Log.i("Mobvista SDK M", (new StringBuilder("Jump to Web: ")).append(jumploaderresult.getUrl()).toString());
            if (a)
            {
                com.mobvista.sdk.m.core.util.a.b(g, jumploaderresult.getUrl());
            } else
            if (!TextUtils.isEmpty(campaignex.getPackageName()))
            {
                com.mobvista.sdk.m.core.util.a.a(g, (new StringBuilder("market://details?id=")).append(campaignex.getPackageName()).toString());
                Log.e("Mobvista SDK M", (new StringBuilder("code link This pkg is ")).append(campaignex.getPackageName()).toString());
            }
            if (l != null)
            {
                l.onFinishRedirection(campaignex, jumploaderresult.getUrl());
                return;
            }
        } else
        {
            if (a)
            {
                Log.i("Mobvista SDK M", (new StringBuilder("Jump to download: ")).append(jumploaderresult.getUrl()).toString());
                a(campaignex, jumploaderresult.getUrl());
                return;
            }
            if (!TextUtils.isEmpty(campaignex.getPackageName()))
            {
                com.mobvista.sdk.m.core.util.a.a(g, (new StringBuilder("market://details?id=")).append(campaignex.getPackageName()).toString());
                Log.e("Mobvista SDK M", (new StringBuilder("code apk This pkg is ")).append(campaignex.getPackageName()).toString());
            }
            Log.e("Mobvista SDK M", "This is a direct download campaign, but download disabled.");
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void a(CampaignEx campaignex, String s)
    {
        e().a(campaignex.getId(), s, new ag(this, campaignex));
        if (l != null)
        {
            l.onDownloadStart(campaignex);
        }
    }

    private void a(CampaignEx campaignex, boolean flag, boolean flag1)
    {
        if (flag)
        {
            Log.i("Mobvista SDK M", "Start 302 Redirection... ");
            JumpLoader jumploader = new JumpLoader();
            if (k.containsKey(campaignex.getClickURL()) && !flag1)
            {
                return;
            }
            k.put(campaignex.getClickURL(), jumploader);
            Context context = g;
            String s = campaignex.getClickURL();
            campaignex = new ad(this, campaignex);
            if (flag1)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            jumploader.a(context, s, campaignex, flag);
            return;
        }
        if (l != null)
        {
            l.onStartRedirection(campaignex, campaignex.getClickURL());
        }
        if (k.containsKey(campaignex.getClickURL()))
        {
            ((JumpLoader)k.get(campaignex.getClickURL())).b();
            k.remove(campaignex.getClickURL());
        }
        if (campaignex.getJumpResult() != null)
        {
            a(campaignex, campaignex.getJumpResult());
            return;
        }
        Object obj = com.mobvista.sdk.m.core.c.a.a(f);
        ((com.mobvista.sdk.m.core.c.a) (obj)).a();
        obj = ((com.mobvista.sdk.m.core.c.a) (obj)).a(campaignex.getId(), c);
        if (obj != null)
        {
            campaignex.setJumpResult(((com.mobvista.sdk.m.core.loader.JumpLoader.JumpLoaderResult) (obj)));
            a(campaignex, ((com.mobvista.sdk.m.core.loader.JumpLoader.JumpLoaderResult) (obj)));
            return;
        }
        Log.i("Mobvista SDK M", "Start 302 Redirection... ");
        if (b)
        {
            Intent intent = new Intent((new StringBuilder("LAODING_SHOW")).append(c).toString());
            g.sendBroadcast(intent);
        } else
        {
            c(campaignex);
        }
        if (j != null)
        {
            j.b();
        }
        j = new JumpLoader();
        j.a(g, campaignex.getClickURL(), new ae(this, campaignex), false);
    }

    static String b(ac ac1)
    {
        return ac1.c;
    }

    private f c()
    {
        return f;
    }

    static HashMap c(ac ac1)
    {
        return ac1.k;
    }

    private void c(CampaignEx campaignex)
    {
        if (g == null)
        {
            return;
        }
        try
        {
            if (i == null)
            {
                i = new com.mobvista.sdk.m.b.a(g, campaignex);
                android.view.WindowManager.LayoutParams layoutparams = i.getWindow().getAttributes();
                i.getWindow().setAttributes(layoutparams);
                i.requestWindowFeature(1);
                i.setOnDismissListener(new af(this));
            }
            i.a(campaignex);
            i.show();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CampaignEx campaignex)
        {
            Log.e("Mobvista SDK M", "Exception", campaignex);
        }
        return;
    }

    private void d()
    {
        if (g == null)
        {
            return;
        }
        try
        {
            if (i != null && i.isShowing())
            {
                i.dismiss();
                return;
            }
        }
        catch (Exception exception)
        {
            Log.e("Mobvista SDK M", "Exception", exception);
        }
        return;
    }

    static boolean d(ac ac1)
    {
        return ac1.b;
    }

    static Context e(ac ac1)
    {
        return ac1.g;
    }

    private com.mobvista.sdk.m.core.d.a e()
    {
        if (h == null)
        {
            h = new com.mobvista.sdk.m.core.d.a();
        }
        return h;
    }

    static void f(ac ac1)
    {
        ac1.d();
    }

    static AdTrackingListener g(ac ac1)
    {
        return ac1.l;
    }

    static JumpLoader h(ac ac1)
    {
        return ac1.j;
    }

    protected final void a()
    {
        for (Iterator iterator = k.entrySet().iterator(); iterator.hasNext(); ((JumpLoader)((java.util.Map.Entry)iterator.next()).getValue()).b()) { }
        k.clear();
    }

    public final void a(AdTrackingListener adtrackinglistener)
    {
        l = adtrackinglistener;
    }

    public final void a(CampaignEx campaignex)
    {
        if (!TextUtils.isEmpty(campaignex.getImpressionURL()))
        {
            com.mobvista.sdk.m.core.c.c.a(c()).b(campaignex.getId(), c);
            (new h(campaignex.getImpressionURL())).a(10001, null);
        }
    }

    public final void a(CampaignEx campaignex, AdListener adlistener)
    {
        if (adlistener != null && campaignex != null)
        {
            adlistener.onAdClick(campaignex);
        }
        b = false;
        b(campaignex);
    }

    public final void a(CampaignEx campaignex, boolean flag)
    {
        Object obj = com.mobvista.sdk.m.core.c.a.a(f);
        ((com.mobvista.sdk.m.core.c.a) (obj)).a();
        obj = ((com.mobvista.sdk.m.core.c.a) (obj)).a(campaignex.getId(), c);
        if (obj != null)
        {
            campaignex.setJumpResult(((com.mobvista.sdk.m.core.loader.JumpLoader.JumpLoaderResult) (obj)));
        } else
        if (!com.mobvista.sdk.m.a.f.j.b(campaignex.getNoticeUrl()) || !campaignex.getClickURL().startsWith("market://") && !campaignex.getClickURL().startsWith("https://play.google.com/") && !campaignex.getClickURL().toLowerCase().endsWith(".apk"))
        {
            a(campaignex, true, flag);
            return;
        }
    }

    public final void a(boolean flag)
    {
        b = true;
    }

    public final void b()
    {
        if (j != null && j.a())
        {
            j.b();
        }
    }

    public final void b(CampaignEx campaignex)
    {
        if (com.mobvista.sdk.m.core.util.a.c(g, campaignex.getPackageName()))
        {
            com.mobvista.sdk.m.core.util.a.d(g, campaignex.getPackageName());
            com.mobvista.sdk.m.a.b.a.a.b("Mobvista SDK M", (new StringBuilder()).append(campaignex.getPackageName()).append(" is intalled.").toString());
        } else
        {
            String s1 = campaignex.getNoticeUrl();
            com.mobvista.sdk.m.core.c.a a1 = com.mobvista.sdk.m.core.c.a.a(f);
            a1.a();
            com.mobvista.sdk.m.core.loader.JumpLoader.JumpLoaderResult jumploaderresult = a1.a(campaignex.getId(), c);
            String s = s1;
            if (jumploaderresult != null)
            {
                s = s1;
                if (jumploaderresult.getNoticeurl() != null)
                {
                    s = jumploaderresult.getNoticeurl();
                    jumploaderresult.setNoticeurl(null);
                    campaignex.setJumpResult(jumploaderresult);
                    a1.a(campaignex, c);
                }
            }
            if (!TextUtils.isEmpty(s))
            {
                (new k(s)).a(10002, null);
            }
            if (campaignex.getClickURL().startsWith("market://") || campaignex.getClickURL().startsWith("https://play.google.com/"))
            {
                com.mobvista.sdk.m.core.util.a.a(g, campaignex.getClickURL());
                Log.i("Mobvista SDK M", (new StringBuilder("Jump to Google Play: ")).append(campaignex.getClickURL()).toString());
                return;
            }
            if (campaignex.getClickURL().toLowerCase().endsWith(".apk") && !a)
            {
                if (!TextUtils.isEmpty(campaignex.getPackageName()))
                {
                    com.mobvista.sdk.m.core.util.a.a(g, (new StringBuilder("market://details?id=")).append(campaignex.getPackageName()).toString());
                    Log.e("Mobvista SDK M", (new StringBuilder("click This pkg is ")).append(campaignex.getPackageName()).toString());
                    return;
                }
            } else
            {
                a(campaignex, false, true);
                return;
            }
        }
    }

}
