// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.ads;

import android.content.Context;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.microsoft.advertising.android.AdControl;
import com.microsoft.advertising.android.a.a;
import com.microsoft.advertising.android.a.b;
import com.microsoft.advertising.android.a.c;
import com.microsoft.advertising.android.a.d;
import com.microsoft.advertising.android.a.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.skype.android.ads:
//            AdPlacer, AdPlacement, AdParent, SkypeAdControlManager, 
//            ConfigManager, SkypeAdEvents, SkypeAdWorker

public class SkypeAdPlacer
    implements b, AdPlacer
{

    private static final AdPlacement c;
    private static SkypeAdPlacer k;
    AdParent a;
    AdPlacement b;
    private final Handler d = new Handler(Looper.getMainLooper());
    private HashMap e;
    private HashMap f;
    private boolean g;
    private boolean h;
    private boolean i;
    private long j;

    public SkypeAdPlacer()
    {
        e = new HashMap();
        f = new HashMap();
        a = com.skype.android.ads.AdParent.a;
        b = c;
        g = false;
        h = false;
        i = false;
        j = 0L;
        k = this;
    }

    private LinearLayout a(Context context, AdPlacement adplacement)
    {
        LinearLayout linearlayout = new LinearLayout(context);
        linearlayout.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
        f.put(a(adplacement), linearlayout);
        linearlayout.setTag(b(context, a(adplacement)));
        linearlayout.setContentDescription("advertisement");
        return linearlayout;
    }

    public static SkypeAdPlacer a()
    {
        return k;
    }

    private static String a(Context context, String s)
    {
        String s1;
label0:
        {
            s1 = s;
            if (!com.skype.android.ads.SkypeAdControlManager.a().b())
            {
                break label0;
            }
            if (!s.equals("contacts") && !s.equals("favorites"))
            {
                s1 = s;
                if (!s.equals("recents"))
                {
                    break label0;
                }
            }
            s1 = "hub";
        }
        return (new StringBuilder("SkypeAdControl:")).append(context.hashCode()).append(":").append(s1).toString();
    }

    public static String a(AdControl adcontrol)
    {
        adcontrol = ((AdControl) (adcontrol.getTag()));
        if (adcontrol instanceof String)
        {
            adcontrol = ((String)adcontrol).split(":");
            if (adcontrol[2].equals("hub"))
            {
                return "recents";
            } else
            {
                return adcontrol[2];
            }
        } else
        {
            return "other";
        }
    }

    private static String a(AdPlacement adplacement)
    {
        String s = "other";
        if (adplacement == com.skype.android.ads.AdPlacement.d)
        {
            s = "call";
        } else
        {
            if (adplacement == com.skype.android.ads.AdPlacement.c)
            {
                return "contacts";
            }
            if (adplacement == com.skype.android.ads.AdPlacement.b)
            {
                return "favorites";
            }
            if (adplacement == com.skype.android.ads.AdPlacement.a)
            {
                return "recents";
            }
        }
        return s;
    }

    private static void a(Context context, AdPlacement adplacement, View view)
    {
        Object obj = view.getLayoutParams();
        if (!(obj instanceof android.widget.LinearLayout.LayoutParams)) goto _L2; else goto _L1
_L1:
        DisplayMetrics displaymetrics;
        int l;
        int i1;
        int j1;
        int k1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        obj = (android.widget.LinearLayout.LayoutParams)obj;
        displaymetrics = new DisplayMetrics();
        ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getMetrics(displaymetrics);
        flag2 = false;
        flag = false;
        flag3 = false;
        flag1 = false;
        j1 = ((flag1) ? 1 : 0);
        l = ((flag2) ? 1 : 0);
        i1 = ((flag3) ? 1 : 0);
        k1 = ((flag) ? 1 : 0);
        if (view.getHeight() == 0) goto _L4; else goto _L3
_L3:
        if (adplacement != com.skype.android.ads.AdPlacement.b) goto _L6; else goto _L5
_L5:
        j1 = (int)(displaymetrics.density * 10F);
        l = (int)(displaymetrics.density * 10F);
        i1 = (int)(displaymetrics.density * 10F);
        k1 = ((flag) ? 1 : 0);
_L4:
        ((android.widget.LinearLayout.LayoutParams) (obj)).setMargins(l, k1, i1, j1);
        view.requestLayout();
_L2:
        return;
_L6:
        if (adplacement == com.skype.android.ads.AdPlacement.c)
        {
            k1 = (int)(displaymetrics.density * 10F);
            l = (int)(displaymetrics.density * 10F);
            i1 = (int)(displaymetrics.density * 10F);
            j1 = ((flag1) ? 1 : 0);
        } else
        if (adplacement == com.skype.android.ads.AdPlacement.a)
        {
            j1 = (int)(displaymetrics.density * 10F);
            l = (int)(displaymetrics.density * 10F);
            i1 = (int)(displaymetrics.density * 10F);
            k1 = ((flag) ? 1 : 0);
        } else
        {
            j1 = ((flag1) ? 1 : 0);
            l = ((flag2) ? 1 : 0);
            i1 = ((flag3) ? 1 : 0);
            k1 = ((flag) ? 1 : 0);
            if (adplacement == com.skype.android.ads.AdPlacement.d)
            {
                l = (int)(displaymetrics.density * 10F);
                i1 = (int)(displaymetrics.density * 10F);
                j1 = ((flag1) ? 1 : 0);
                k1 = ((flag) ? 1 : 0);
            }
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    private void a(AdPlacement adplacement, LinearLayout linearlayout, AdControl adcontrol)
    {
        if (adcontrol != null) goto _L2; else goto _L1
_L1:
        ViewGroup viewgroup;
        return;
_L2:
        if ((viewgroup = (ViewGroup)adcontrol.getParent()) == linearlayout)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (viewgroup == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (adplacement != b || a != com.skype.android.ads.AdParent.a || b != com.skype.android.ads.AdPlacement.a)
        {
            continue; /* Loop/switch isn't completed */
        }
        viewgroup.removeView(adcontrol);
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        adcontrol.setTag(a(linearlayout.getContext(), a(adplacement)));
        a(linearlayout.getContext(), adplacement, ((View) (adcontrol)));
        linearlayout.addView(adcontrol);
        return;
    }

    private static String b(Context context, String s)
    {
        return (new StringBuilder("SkypeAdPlacer:")).append(context.hashCode()).append(":").append(s).toString();
    }

    private static void b(AdControl adcontrol)
    {
        try
        {
            if ((ViewGroup)adcontrol.getParent() != null)
            {
                adcontrol.l();
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AdControl adcontrol)
        {
            Log.e("SkypeAdPlacer", (new StringBuilder("disable banner exception ")).append(adcontrol.getMessage()).toString());
        }
    }

    private boolean b(AdPlacement adplacement)
    {
        boolean flag1 = false;
        boolean flag;
        if (a == com.skype.android.ads.AdParent.a && b == adplacement)
        {
            adplacement = a(adplacement);
            flag = flag1;
            if (e.containsKey(adplacement))
            {
                flag = ((Boolean)e.get(adplacement)).booleanValue();
            }
        } else
        {
            flag = flag1;
            if (a == com.skype.android.ads.AdParent.b)
            {
                flag = flag1;
                if (com.skype.android.ads.AdPlacement.d == adplacement)
                {
                    return true;
                }
            }
        }
        return flag;
    }

    public static String[] b()
    {
        return (new String[] {
            "recents", "favorites", "contacts", "call"
        });
    }

    private static AdPlacement c(String s)
    {
        AdPlacement adplacement = com.skype.android.ads.AdPlacement.e;
        if (s.equals("call"))
        {
            adplacement = com.skype.android.ads.AdPlacement.d;
        } else
        {
            if (s.equals("contacts"))
            {
                return com.skype.android.ads.AdPlacement.c;
            }
            if (s.equals("favorites"))
            {
                return com.skype.android.ads.AdPlacement.b;
            }
            if (s.equals("recents"))
            {
                return com.skype.android.ads.AdPlacement.a;
            }
        }
        return adplacement;
    }

    private void d(String s)
    {
        if (e.containsKey(s) && ((Boolean)e.get(s)).booleanValue())
        {
            boolean flag;
            if (c(s) == com.skype.android.ads.AdPlacement.a && h)
            {
                if (!g)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } else
            {
                Object obj = (LinearLayout)f.get(s);
                if (obj != null)
                {
                    obj = (ViewGroup)((LinearLayout) (obj)).getParent();
                    if (obj instanceof ListView)
                    {
                        if (((ListView)obj).getCount() > 0)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                    } else
                    {
                        flag = true;
                    }
                } else
                {
                    flag = false;
                }
            }
            if (flag)
            {
                LinearLayout linearlayout = (LinearLayout)f.get(s);
                if (linearlayout != null && (AdControl)linearlayout.findViewWithTag(a(linearlayout.getContext(), s)) == null)
                {
                    AdControl adcontrol1 = com.skype.android.ads.SkypeAdControlManager.a().a(linearlayout.getContext(), s);
                    AdControl adcontrol = adcontrol1;
                    if (adcontrol1 == null)
                    {
                        adcontrol = adcontrol1;
                        if (ConfigManager.i() != null)
                        {
                            AdControl adcontrol2 = com.skype.android.ads.SkypeAdControlManager.a().b(linearlayout.getContext(), s);
                            adcontrol = adcontrol2;
                            if (adcontrol2 != null)
                            {
                                adcontrol2.a(this);
                                adcontrol = adcontrol2;
                            }
                        }
                    }
                    if (adcontrol != null)
                    {
                        ViewGroup viewgroup = (ViewGroup)adcontrol.getParent();
                        if (viewgroup != linearlayout)
                        {
                            if (viewgroup != null)
                            {
                                viewgroup.removeView(adcontrol);
                            }
                            a(linearlayout.getContext(), c(s), adcontrol);
                            linearlayout.addView(adcontrol);
                        }
                    }
                }
                com.skype.android.ads.SkypeAdControlManager.a().a(s);
                return;
            }
        }
    }

    public final View a(AdPlacement adplacement, Context context)
    {
        e.put(a(adplacement), Boolean.valueOf(true));
        LinearLayout linearlayout = a(context, adplacement);
        context = com.skype.android.ads.SkypeAdControlManager.a().b(context, a(adplacement));
        if (context != null)
        {
            context.a(this);
            a(adplacement, linearlayout, ((AdControl) (context)));
        }
        return linearlayout;
    }

    public final void a(AdControl adcontrol, com.microsoft.advertising.android.a.b.a a1)
    {
        try
        {
            (new StringBuilder("onEngagementChanged called with engagement type ")).append(a1).append(" on adcontrol ").append(adcontrol);
            if (a1 == com.microsoft.advertising.android.a.b.a.b)
            {
                i = true;
                j = System.currentTimeMillis();
                com.skype.android.ads.SkypeAdEvents.a(adcontrol, com.skype.android.ads.SkypeAdEvents.a(adcontrol, "EXPAND"));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (AdControl adcontrol)
        {
            (new StringBuilder("onEngagementChanged exception ")).append(adcontrol);
            return;
        }
        if (a1 == com.microsoft.advertising.android.a.b.a.c)
        {
            com.skype.android.ads.SkypeAdEvents.a(adcontrol, com.skype.android.ads.SkypeAdEvents.a(adcontrol, "CLICK", "click"));
            return;
        }
        if (a1 == com.microsoft.advertising.android.a.b.a.a)
        {
            i = false;
            com.skype.android.ads.SkypeAdEvents.a(adcontrol, com.skype.android.ads.SkypeAdEvents.a(adcontrol, "COLLAPSE", System.currentTimeMillis() - j));
        }
        return;
    }

    public final void a(AdControl adcontrol, String s, e e1)
    {
        try
        {
            (new StringBuilder("onAdError called ")).append(s).append(" code ").append(e1).append(" on adcontrol ").append(adcontrol);
            if (a == com.skype.android.ads.AdParent.a && !adcontrol.d())
            {
                adcontrol.setAutoRefreshEnabled(true);
            }
            if (e1 == e.b)
            {
                com.skype.android.ads.SkypeAdEvents.a(adcontrol, com.skype.android.ads.SkypeAdEvents.a(adcontrol, "NOAD"));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (AdControl adcontrol)
        {
            (new StringBuilder("onAdError exception ")).append(adcontrol);
            return;
        }
        if (e1 == e.f)
        {
            com.skype.android.ads.SkypeAdEvents.a(adcontrol, com.skype.android.ads.SkypeAdEvents.a(adcontrol, "ERROR", s, 1));
            return;
        }
        if (e1 == e.c)
        {
            com.skype.android.ads.SkypeAdEvents.a(adcontrol, com.skype.android.ads.SkypeAdEvents.a(adcontrol, "ERROR", s, 2));
            return;
        }
        if (e1 == e.g)
        {
            com.skype.android.ads.SkypeAdEvents.a(adcontrol, com.skype.android.ads.SkypeAdEvents.a(adcontrol, "ERROR", s, 0));
            return;
        }
        if (e1 == e.e)
        {
            com.skype.android.ads.SkypeAdEvents.a(adcontrol, com.skype.android.ads.SkypeAdEvents.a(adcontrol, "ERROR", s, 3));
        }
        return;
    }

    public final void a(a a1)
    {
        AdControl adcontrol;
        try
        {
            adcontrol = a1.a();
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            (new StringBuilder("onAdEvent exception ")).append(a1);
            return;
        }
        if (adcontrol == null)
        {
            return;
        }
        (new StringBuilder("onAdEvent called with event ")).append(a1).append(" on adcontrol ").append(adcontrol);
        if (a == com.skype.android.ads.AdParent.a && !adcontrol.d())
        {
            adcontrol.setAutoRefreshEnabled(true);
        }
        if (a1.b() == com.microsoft.advertising.android.a.a.a.d)
        {
            a1 = ((a) (a1.a("adLog")));
            if (a1 instanceof c)
            {
                com.skype.android.ads.SkypeAdEvents.a(adcontrol, com.skype.android.ads.SkypeAdEvents.a(adcontrol, "FETCH", ((c)a1).a(1)));
                return;
            }
            break MISSING_BLOCK_LABEL_331;
        }
        if (a1.b() == com.microsoft.advertising.android.a.a.a.c)
        {
            a1 = ((a) (a1.a("adLog")));
            if (a1 instanceof c)
            {
                com.skype.android.ads.SkypeAdEvents.a(adcontrol, com.skype.android.ads.SkypeAdEvents.a(adcontrol, "LOAD", ((c)a1).a(2)));
            }
            a(adcontrol.getContext(), b, ((View) (adcontrol)));
            return;
        }
        Object obj;
        Uri uri;
        if (a1.b() != com.microsoft.advertising.android.a.a.a.k || !"open".equals((String)a1.a("webContainerMethod")))
        {
            break MISSING_BLOCK_LABEL_331;
        }
        obj = (String)((Map)a1.a("webContainerMethodParams")).get("url");
        uri = Uri.parse(((String) (obj)));
        String s;
        s = "click";
        a1 = s;
        if (!"skype".equals(uri.getScheme()))
        {
            break MISSING_BLOCK_LABEL_319;
        }
        obj = new UrlQuerySanitizer(((String) (obj)));
        a1 = s;
        if (((UrlQuerySanitizer) (obj)).getParameterList().size() > 0)
        {
            a1 = ((android.net.UrlQuerySanitizer.ParameterValuePair)((UrlQuerySanitizer) (obj)).getParameterList().get(0)).mParameter;
        }
        com.skype.android.ads.SkypeAdEvents.a(adcontrol, com.skype.android.ads.SkypeAdEvents.a(adcontrol, "CLICK", a1));
    }

    public final void a(d d1)
    {
        try
        {
            (new StringBuilder("onAdLoaded called on adcontrol ")).append(d1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (d d1)
        {
            (new StringBuilder("onAdLoaded exception ")).append(d1);
        }
    }

    public final void a(AdParent adparent)
    {
        (new StringBuilder("resume ad activity ")).append(adparent.toString()).append(" at placement ").append(b.toString());
        if (adparent != com.skype.android.ads.AdParent.a) goto _L2; else goto _L1
_L1:
        d(a(b));
_L9:
        a = adparent;
        if (adparent != com.skype.android.ads.AdParent.a) goto _L4; else goto _L3
_L3:
        adparent = a(b);
        if (!b(b)) goto _L4; else goto _L5
_L5:
        LinearLayout linearlayout = (LinearLayout)f.get(adparent);
        if (linearlayout == null) goto _L4; else goto _L6
_L6:
        try
        {
            adparent = com.skype.android.ads.SkypeAdControlManager.a().a(linearlayout.getContext(), adparent);
        }
        // Misplaced declaration of an exception variable
        catch (AdParent adparent)
        {
            Log.e("SkypeAdPlacer", (new StringBuilder("onResume exception ")).append(adparent.getMessage()).toString());
            return;
        }
        if (adparent == null) goto _L4; else goto _L7
_L7:
        adparent.k();
        d.postDelayed(new Runnable(adparent) {

            final AdControl a;
            final SkypeAdPlacer b;

            public final void run()
            {
                if (b.a == com.skype.android.ads.AdParent.a && !a.d())
                {
                    a.setAutoRefreshEnabled(true);
                }
            }

            
            {
                b = SkypeAdPlacer.this;
                a = adcontrol;
                super();
            }
        }, 1000L);
_L4:
        com.skype.android.ads.SkypeAdWorker.a().b();
        return;
_L2:
        if (adparent != com.skype.android.ads.AdParent.b) goto _L9; else goto _L8
_L8:
        d("call");
          goto _L9
    }

    public final void a(AdParent adparent, AdPlacement adplacement)
    {
        if (b == adplacement)
        {
            return;
        }
        try
        {
            (new StringBuilder("onSelect activity ")).append(adparent.toString()).append(" at placement ").append(adplacement.toString());
            String s = a(b);
            com.skype.android.ads.SkypeAdControlManager.a().b(s);
            d(a(adplacement));
            a = adparent;
            b = adplacement;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AdParent adparent)
        {
            Log.e("SkypeAdPlacer", (new StringBuilder("onSelect exception ")).append(adparent.getMessage()).toString());
        }
        return;
    }

    public final void a(AdPlacement adplacement, boolean flag)
    {
        (new StringBuilder("list content at ")).append(adplacement.toString()).append(" is empty ").append(flag);
        if (adplacement == com.skype.android.ads.AdPlacement.a)
        {
            h = true;
        }
        if (flag)
        {
            try
            {
                if (adplacement == b)
                {
                    com.skype.android.ads.SkypeAdControlManager.a().b(a(adplacement));
                }
                if (adplacement == com.skype.android.ads.AdPlacement.a)
                {
                    g = flag;
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (AdPlacement adplacement)
            {
                Log.e("SkypeAdPlacer", (new StringBuilder("onListContentChange exception ")).append(adplacement.getMessage()).toString());
            }
            break MISSING_BLOCK_LABEL_164;
        }
        if (a == com.skype.android.ads.AdParent.a && b == adplacement && adplacement == com.skype.android.ads.AdPlacement.a && g)
        {
            g = flag;
            d(a(b));
        }
        if (adplacement == com.skype.android.ads.AdPlacement.a)
        {
            g = flag;
            return;
        }
    }

    public final void a(String s)
    {
        LinearLayout linearlayout = (LinearLayout)f.get(s);
        if (linearlayout != null)
        {
            s = (AdControl)linearlayout.findViewWithTag(a(linearlayout.getContext(), s));
            if (s != null)
            {
                b(s);
            }
        }
    }

    public final void a(String s, AdControl adcontrol)
    {
        LinearLayout linearlayout;
        try
        {
            linearlayout = (LinearLayout)f.get(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("SkypeAdPlacer", (new StringBuilder("update banner exception ")).append(s.getMessage()).toString());
            return;
        }
        if (linearlayout == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        s = c(s);
        adcontrol.a(this);
        a(((AdPlacement) (s)), linearlayout, adcontrol);
    }

    public final void a(String s, String s1)
    {
        try
        {
            (new StringBuilder("publisherMessage ")).append(s).append(" data ").append(s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            (new StringBuilder("publisherMessage exception ")).append(s);
        }
    }

    public final boolean a(AdPlacement adplacement, ViewGroup viewgroup)
    {
        if (adplacement == com.skype.android.ads.AdPlacement.d)
        {
            return false;
        }
        Object obj = viewgroup.findViewWithTag(a(viewgroup.getContext(), a(adplacement)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        if (!(obj instanceof AdControl))
        {
            break MISSING_BLOCK_LABEL_43;
        }
        ((View) (obj)).setVisibility(0);
        return true;
        e.put(a(adplacement), Boolean.valueOf(true));
        obj = com.skype.android.ads.SkypeAdControlManager.a().b(viewgroup.getContext(), a(adplacement));
        if (obj != null)
        {
            try
            {
                ((AdControl) (obj)).a(this);
                LinearLayout linearlayout = a(viewgroup.getContext(), adplacement);
                a(adplacement, linearlayout, ((AdControl) (obj)));
                (new StringBuilder("container ")).append(viewgroup.hashCode()).append(" with context ").append(viewgroup.getContext().hashCode());
                viewgroup.addView(linearlayout);
            }
            // Misplaced declaration of an exception variable
            catch (AdPlacement adplacement)
            {
                Log.e("SkypeAdPlacer", (new StringBuilder("add banner exception ")).append(adplacement.getMessage()).toString());
            }
            break MISSING_BLOCK_LABEL_191;
        }
        viewgroup.addView(a(viewgroup.getContext(), adplacement));
        return false;
        return true;
    }

    public final void b(AdParent adparent)
    {
        (new StringBuilder("pause ad activity ")).append(adparent.toString());
        if (adparent != com.skype.android.ads.AdParent.a) goto _L2; else goto _L1
_L1:
        adparent = a(b);
        if (!b(b)) goto _L4; else goto _L3
_L3:
        LinearLayout linearlayout = (LinearLayout)f.get(adparent);
        if (linearlayout == null) goto _L4; else goto _L5
_L5:
        try
        {
            adparent = com.skype.android.ads.SkypeAdControlManager.a().a(linearlayout.getContext(), adparent);
        }
        // Misplaced declaration of an exception variable
        catch (AdParent adparent)
        {
            Log.e("SkypeAdPlacer", (new StringBuilder("onPause exception ")).append(adparent.getMessage()).toString());
            return;
        }
        if (adparent == null) goto _L4; else goto _L6
_L6:
        adparent.setAutoRefreshEnabled(false);
_L4:
        adparent = a(b);
        com.skype.android.ads.SkypeAdControlManager.a().b(adparent);
_L8:
        a = com.skype.android.ads.AdParent.c;
        com.skype.android.ads.SkypeAdWorker.a().c();
        return;
_L2:
        if (adparent == com.skype.android.ads.AdParent.b)
        {
            com.skype.android.ads.SkypeAdControlManager.a().b("call");
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void b(AdPlacement adplacement, boolean flag)
    {
label0:
        {
            if (adplacement == b)
            {
                adplacement = a(adplacement);
                Boolean boolean1 = (Boolean)e.get(adplacement);
                if (boolean1.booleanValue() != flag)
                {
                    (new StringBuilder("visibility at ")).append(adplacement).append(" change from ").append(boolean1).append(" to ").append(flag);
                    e.put(adplacement, Boolean.valueOf(flag));
                    if (!flag)
                    {
                        break label0;
                    }
                    d(adplacement);
                }
            }
            return;
        }
        com.skype.android.ads.SkypeAdControlManager.a().b(adplacement);
    }

    public final boolean b(AdPlacement adplacement, ViewGroup viewgroup)
    {
        View view = viewgroup.findViewWithTag(b(viewgroup.getContext(), a(adplacement)));
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        adplacement = (AdControl)view.findViewWithTag(a(viewgroup.getContext(), a(adplacement)));
        if (adplacement == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        adplacement.o();
        adplacement.setVisibility(8);
        return true;
        adplacement;
        Log.e("SkypeAdPlacer", (new StringBuilder("remove banner exception ")).append(adplacement.getMessage()).toString());
        return false;
    }

    public final boolean b(String s)
    {
        return b(c(s));
    }

    public final void c()
    {
        Iterator iterator = f.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (String)iterator.next();
            LinearLayout linearlayout = (LinearLayout)f.get(obj);
            if (linearlayout != null)
            {
                obj = (AdControl)linearlayout.findViewWithTag(a(linearlayout.getContext(), ((String) (obj))));
                if (obj != null)
                {
                    b(((AdControl) (obj)));
                }
            }
        } while (true);
    }

    public final void d()
    {
        Iterator iterator = f.keySet().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj;
        LinearLayout linearlayout;
        obj = (String)iterator.next();
        linearlayout = (LinearLayout)f.get(obj);
        if (linearlayout == null) goto _L4; else goto _L3
_L3:
        Object obj1;
        AdPlacement adplacement;
        obj1 = linearlayout.findViewWithTag(a(linearlayout.getContext(), ((String) (obj))));
        adplacement = c(((String) (obj)));
        if (obj1 == null) goto _L6; else goto _L5
_L5:
        if (!(obj1 instanceof AdControl)) goto _L6; else goto _L7
_L7:
        ((View) (obj1)).setVisibility(0);
        obj = (AdControl)obj1;
_L9:
        if (obj != null)
        {
            try
            {
                if (b(adplacement))
                {
                    ((AdControl) (obj)).m();
                }
                ((AdControl) (obj)).setVisibility(0);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("SkypeAdPlacer", (new StringBuilder("enable banner exception ")).append(((Exception) (obj)).getMessage()).toString());
            }
        }
          goto _L4
_L6:
        if (!b(adplacement))
        {
            break MISSING_BLOCK_LABEL_199;
        }
        obj1 = com.skype.android.ads.SkypeAdControlManager.a().b(linearlayout.getContext(), ((String) (obj)));
        obj = obj1;
        if (obj1 == null) goto _L9; else goto _L8
_L8:
        ((AdControl) (obj1)).a(this);
        a(adplacement, (LinearLayout)linearlayout, ((AdControl) (obj1)));
        obj = obj1;
          goto _L9
_L2:
        return;
        obj = null;
          goto _L9
    }

    public final boolean e()
    {
        return i;
    }

    static 
    {
        c = com.skype.android.ads.AdPlacement.a;
    }
}
