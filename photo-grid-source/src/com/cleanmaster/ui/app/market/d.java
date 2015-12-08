// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.cleanmaster.common.a;
import com.cleanmaster.service.LocalService;
import com.cleanmaster.ui.app.utils.MarketContext;
import com.cleanmaster.util.f;
import com.cleanmaster.util.g;
import com.cleanmaster.util.l;
import com.cleanmaster.util.n;
import com.picksinit.ClickAdFinishListener;
import com.picksinit.PicksMob;
import com.picksinit.SmartGoGp;
import com.picksinit.b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

// Referenced classes of package com.cleanmaster.ui.app.market:
//            e, Ad, f, i, 
//            h, g

public class d
{

    static n a = new e();
    private static Map b = null;

    public static void a(Context context, String s)
    {
label0:
        {
            if (context != null && !TextUtils.isEmpty(s))
            {
                if (!a(s))
                {
                    break label0;
                }
                com.cleanmaster.common.a.b(s, context);
            }
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(s));
        com.cleanmaster.common.a.a(context, intent);
    }

    public static void a(Context context, String s, Ad ad, String s1, boolean flag, ClickAdFinishListener clickadfinishlistener)
    {
        if (context == null)
        {
            return;
        }
        context = new MarketContext(context);
        if (ad.isDeepLink() && com.cleanmaster.common.a.b(context, ad.getPkg()))
        {
            com.cleanmaster.ui.app.market.deeplink.a.a(context, ad);
            if (clickadfinishlistener != null)
            {
                clickadfinishlistener.onClickFinish(null);
            }
        } else
        if (com.cleanmaster.common.a.b(context, ad.getPkg()))
        {
            com.cleanmaster.common.a.d(context, ad.getPkg());
            if (clickadfinishlistener != null)
            {
                clickadfinishlistener.onClickFinish(null);
            }
        } else
        if (ad.isOpenBrowser())
        {
            b(context, ad.getPkgUrl());
            if (clickadfinishlistener != null)
            {
                clickadfinishlistener.onClickFinish(null);
            }
        } else
        {
            a(context, ad.getPkgUrl(), clickadfinishlistener, ad, s);
            LocalService.a(context, ad.getPkg());
        }
        if (!flag && ad.hasDetail())
        {
            e(s, ad, s1);
        } else
        {
            a(s, ad, s1);
        }
        a(ad);
    }

    public static void a(Ad ad)
    {
        if (TextUtils.isEmpty(ad.getClickTrackingUrl()) || "null".equals(ad.getClickTrackingUrl()))
        {
            break MISSING_BLOCK_LABEL_80;
        }
        ad = new JSONArray(ad.getClickTrackingUrl());
        if (ad.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        int j = 0;
_L1:
        org.json.JSONObject jsonobject;
        if (j >= ad.length())
        {
            break MISSING_BLOCK_LABEL_80;
        }
        jsonobject = ad.getJSONObject(j);
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        (new com.cleanmaster.ui.app.market.f(jsonobject)).start();
        j++;
          goto _L1
        ad;
    }

    public static void a(Ad ad, String s, String s1)
    {
        if (ad == null || TextUtils.isEmpty(s))
        {
            return;
        }
        if (!TextUtils.isEmpty(s1))
        {
            s = g.a(s).e(s1);
        } else
        {
            s = g.a(s);
        }
        g.a(s, c(ad));
        ad = ad.toBuinessDataItem();
        s1 = new com.cleanmaster.util.d();
        s1.a(ad, s);
        s1.c(new Void[0]);
    }

    public static void a(String s, Ad ad, String s1)
    {
        if (ad != null && !TextUtils.isEmpty(s))
        {
            com.cleanmaster.util.d d1;
            if (!TextUtils.isEmpty(s1))
            {
                s = g.b(s).e(s1);
            } else
            {
                s = g.b(s);
            }
            g.a(s, c(ad));
            s1 = ad.toBuinessDataItem();
            d1 = new com.cleanmaster.util.d();
            d1.a(s1, s);
            d1.c(new Void[0]);
            if (ad.getResType() == 1001 && !TextUtils.isEmpty(ad.getContextCode()) && !TextUtils.isEmpty(ad.getNameSpace()))
            {
                (new l(PicksMob.getInstance().getContext(), ad.getContextCode(), ad.getNameSpace())).a();
                return;
            }
        }
    }

    public static void a(String s, String s1, int j)
    {
        Object obj;
        if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1))
        {
            if ((obj = Ad.createAd(s)) != null && !TextUtils.isEmpty(s1))
            {
                s = g.a(s1);
                ((Ad) (obj)).setResType(j);
                s1 = ((Ad) (obj)).toBuinessDataItem();
                obj = new com.cleanmaster.util.d();
                ((com.cleanmaster.util.d) (obj)).a(s1, s);
                ((com.cleanmaster.util.d) (obj)).c(new Void[0]);
                return;
            }
        }
    }

    public static void a(String s, String s1, String s2, String s3, int j)
    {
        Ad ad;
        if (!TextUtils.isEmpty(s2) && !TextUtils.isEmpty(s3))
        {
            if ((ad = Ad.createAd(s2)) != null)
            {
                s2 = g.a(s3);
                ad.setResType(j);
                s3 = ad.toBuinessDataItem();
                s3.a(s, s1);
                s = new com.cleanmaster.util.d();
                s.a(s3, s2);
                s.c(new Void[0]);
                return;
            }
        }
    }

    public static void a(List list)
    {
        if (list != null)
        {
            HashMap hashmap = new HashMap();
            List list1 = com.cleanmaster.func.cache.a.a().b();
            if (list1 != null)
            {
                for (int j = 0; j < list1.size(); j++)
                {
                    PackageInfo packageinfo = (PackageInfo)list1.get(j);
                    hashmap.put(packageinfo.packageName, packageinfo);
                }

            }
            int k = 0;
            while (k < list.size()) 
            {
                Ad ad = (Ad)list.get(k);
                PackageInfo packageinfo1 = (PackageInfo)hashmap.get(ad.getPkg());
                if (packageinfo1 != null)
                {
                    if (ad.versionCode >= 0 && ad.versionCode > packageinfo1.versionCode)
                    {
                        ad.installedStatus = 2;
                    } else
                    {
                        ad.installedStatus = 1;
                    }
                } else
                {
                    ad.installedStatus = 0;
                }
                k++;
            }
        }
    }

    public static boolean a()
    {
        return PicksMob.getInstance().isCnVersion();
    }

    public static boolean a(Context context, Intent intent)
    {
        try
        {
            context.startActivity(intent);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return true;
    }

    public static boolean a(Context context, String s, ClickAdFinishListener clickadfinishlistener, Ad ad, String s1)
    {
        if (TextUtils.isEmpty(s) || context == null)
        {
            return false;
        }
        if (a(s))
        {
            if (clickadfinishlistener != null)
            {
                clickadfinishlistener.onClickFinish(new SmartGoGp(s));
                return false;
            } else
            {
                a(context, s);
                return false;
            }
        }
        String s2 = com.cleanmaster.ui.app.utils.a.a().a(s);
        Object obj = s2;
        if (TextUtils.isEmpty(s2))
        {
            obj = b(s);
        }
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = new i();
            ((i) (obj)).a(new h(ad, s1, clickadfinishlistener, context, s));
            ((i) (obj)).b(s);
            return true;
        }
        if (clickadfinishlistener != null)
        {
            clickadfinishlistener.onClickFinish(new SmartGoGp(((String) (obj))));
            return true;
        } else
        {
            a(context, ((String) (obj)));
            return true;
        }
    }

    public static boolean a(String s)
    {
        while (TextUtils.isEmpty(s) || !s.startsWith("https://play.google.com") && !s.startsWith("http://play.google.com") && !s.startsWith("market:")) 
        {
            return false;
        }
        return true;
    }

    private static String b(String s)
    {
        return (String)a.a(s);
    }

    public static void b(Ad ad)
    {
        if (TextUtils.isEmpty(ad.getThirdImpUrl()) || "null".equals(ad.getThirdImpUrl()))
        {
            break MISSING_BLOCK_LABEL_80;
        }
        ad = new JSONArray(ad.getThirdImpUrl());
        if (ad.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        int j = 0;
_L1:
        org.json.JSONObject jsonobject;
        if (j >= ad.length())
        {
            break MISSING_BLOCK_LABEL_80;
        }
        jsonobject = ad.getJSONObject(j);
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        (new com.cleanmaster.ui.app.market.g(jsonobject)).start();
        j++;
          goto _L1
        ad;
    }

    public static void b(String s, Ad ad, String s1)
    {
        if (ad == null || TextUtils.isEmpty(s))
        {
            return;
        }
        if (!TextUtils.isEmpty(s1))
        {
            s = g.d(s).e(s1);
        } else
        {
            s = g.d(s);
        }
        ad = ad.toBuinessDataItem();
        s1 = new com.cleanmaster.util.d();
        s1.a(ad, s);
        s1.c(new Void[0]);
    }

    public static void b(String s, String s1, int j)
    {
        Object obj;
        if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1))
        {
            if ((obj = Ad.createAd(s)) != null && !TextUtils.isEmpty(s1))
            {
                s = g.b(s1);
                ((Ad) (obj)).setResType(j);
                s1 = ((Ad) (obj)).toBuinessDataItem();
                obj = new com.cleanmaster.util.d();
                ((com.cleanmaster.util.d) (obj)).a(s1, s);
                ((com.cleanmaster.util.d) (obj)).c(new Void[0]);
                return;
            }
        }
    }

    public static void b(String s, String s1, String s2, String s3, int j)
    {
        Ad ad;
        if (!TextUtils.isEmpty(s2) && !TextUtils.isEmpty(s3))
        {
            if ((ad = Ad.createAd(s2)) != null)
            {
                s2 = g.b(s3);
                ad.setResType(j);
                s3 = ad.toBuinessDataItem();
                s3.a(s, s1);
                s = new com.cleanmaster.util.d();
                s.a(s3, s2);
                s.c(new Void[0]);
                return;
            }
        }
    }

    public static boolean b(Context context, String s)
    {
        s = new Intent("android.intent.action.VIEW", Uri.parse(s));
        List list = context.getPackageManager().queryIntentActivities(s, 0x10000);
        if (list != null && list.size() > 0)
        {
            s.setFlags(0x10000000);
            a(context, s);
            return true;
        } else
        {
            return false;
        }
    }

    private static int c(Ad ad)
    {
        while (ad == null || !com.cleanmaster.common.a.b(PicksMob.getInstance().getContext(), ad.getPkg()) || !ad.isDeepLink()) 
        {
            return 0;
        }
        return TextUtils.isEmpty(ad.getDeepLink()) ? 1 : 2;
    }

    public static void c(String s, Ad ad, String s1)
    {
        if (ad == null)
        {
            return;
        } else
        {
            s = g.a(s, s1);
            ad = ad.toBuinessDataItem();
            s1 = new com.cleanmaster.util.d();
            s1.a(ad, s);
            s1.c(new Void[0]);
            return;
        }
    }

    public static void d(String s, Ad ad, String s1)
    {
        if (ad == null)
        {
            return;
        } else
        {
            s = g.b(s, s1);
            ad = ad.toBuinessDataItem();
            s1 = new com.cleanmaster.util.d();
            s1.a(ad, s);
            s1.c(new Void[0]);
            return;
        }
    }

    public static void e(String s, Ad ad, String s1)
    {
        if (ad != null && !TextUtils.isEmpty(s))
        {
            com.cleanmaster.util.d d1;
            if (!TextUtils.isEmpty(s1))
            {
                s = g.c(s).e(s1);
            } else
            {
                s = g.c(s);
            }
            s1 = ad.toBuinessDataItem();
            d1 = new com.cleanmaster.util.d();
            d1.a(s1, s);
            d1.c(new Void[0]);
            if (ad.getResType() == 1001 && !TextUtils.isEmpty(ad.getContextCode()) && !TextUtils.isEmpty(ad.getNameSpace()))
            {
                (new l(PicksMob.getInstance().getContext(), ad.getContextCode(), ad.getNameSpace())).a();
                return;
            }
        }
    }

    static 
    {
        b = new ConcurrentHashMap();
    }
}
