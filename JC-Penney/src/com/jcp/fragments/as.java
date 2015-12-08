// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.jcp.JCP;
import com.jcp.activities.MainActivity;
import com.jcp.b.b;
import com.jcp.c.ac;
import com.jcp.c.o;
import com.jcp.e.ad;
import com.jcp.e.n;
import com.jcp.e.x;
import com.jcp.g.a;
import com.jcp.pojo.Accordion;
import com.jcp.pojo.DestinationURL;
import com.jcp.pojo.Response;
import com.jcp.receivers.NetworkChangeReceiver;
import com.jcp.recommendation.myrecs.Recommendation;
import com.jcp.recommendation.placements.PlacementRecs;
import com.jcp.recommendation.placements.Placements;
import com.jcp.util.ae;
import com.jcp.util.ah;
import com.jcp.util.bn;
import com.jcp.util.bp;
import com.jcp.util.bt;
import com.jcp.views.DataListView;
import com.jcp.views.i;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.jcp.fragments:
//            s, at, ah, t, 
//            ac, gh, fa, ProductDetailFragment

public class as extends s
    implements ad, n, x, i
{

    private static final String a = com/jcp/fragments/as.getSimpleName();
    private DataListView b;
    private final BroadcastReceiver c = new at(this);

    public as()
    {
    }

    private void U()
    {
        if (com.jcp.b.b.a(i()))
        {
            o o1 = new o(i());
            o1.a(this);
            o1.a();
        }
    }

    private void V()
    {
        if (com.jcp.b.b.a(i()))
        {
            ac ac1 = new ac(i());
            ac1.a(this);
            ac1.a();
        }
    }

    private void a(View view, boolean flag)
    {
        a(i().getResources().getString(0x7f070080), ((Activity) (i())));
        b = (DataListView)view.findViewById(0x7f0e0272);
        b.setItemClick(this);
        i().findViewById(0x7f0e0164).setVisibility(0);
        view = JCP.e().c();
        if (view == null || view.length <= 0) goto _L2; else goto _L1
_L1:
        b.a(view, false);
_L4:
        JCP.c().a(this);
        V();
        return;
_L2:
        if (JCP.d().y())
        {
            U();
        } else
        if (!flag)
        {
            view = a(i());
            if (view != null)
            {
                view.c(new com.jcp.fragments.ah(), "DepartmentFragment");
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void a(as as1)
    {
        as1.U();
    }

    private String b(String s1, String s2)
    {
        String s3 = null;
        if (s1 != null)
        {
            s3 = (new StringBuilder()).append(s2).append(s1).toString();
        }
        return s3;
    }

    static void b(as as1)
    {
        as1.V();
    }

    private void b(String s1)
    {
        android.support.v4.app.ac ac1;
        t t1;
        ac1 = i();
        if (!bt.a(ac1))
        {
            break MISSING_BLOCK_LABEL_405;
        }
        t1 = a(i());
        s1 = c(s1);
        if (!s1.contains("rewards")) goto _L2; else goto _L1
_L1:
        bn.a(t1, i(), false);
_L4:
        return;
_L2:
        Object obj;
        if (s1.contains("jcpenney.com"))
        {
            if (t1 != null)
            {
                if (s1.contains("pg40027800029"))
                {
                    t1.c(new com.jcp.fragments.ac(), "CouponsFragment");
                    return;
                }
                if (s1.contains("storelocator"))
                {
                    t1.c(new gh(), "StoreListFragment");
                }
            }
            Iterator iterator = com.jcp.b.b.y(s1).entrySet().iterator();
            do
            {
                do
                {
                    obj = s1;
                    if (!iterator.hasNext())
                    {
                        continue; /* Loop/switch isn't completed */
                    }
                    obj = (java.util.Map.Entry)iterator.next();
                    if (((String)((java.util.Map.Entry) (obj)).getKey()).equals("id") && bt.a(ac1))
                    {
                        if (((String)((java.util.Map.Entry) (obj)).getValue()).contains("cat"))
                        {
                            obj = (String)((java.util.Map.Entry) (obj)).getValue();
                            if ((s1.contains("catId") || s1.contains("categoryId")) && s1.contains("subcatId"))
                            {
                                ((MainActivity)ac1).a(((String) (obj)), null, s1, 1);
                                return;
                            }
                            if (s1.contains("id"))
                            {
                                ((MainActivity)ac1).a(((String) (obj)), null, s1, 1);
                                return;
                            } else
                            {
                                ((MainActivity)ac1).d(((String) (obj)));
                                b(((String) (obj)), d("Category"));
                                return;
                            }
                        }
                        if (((String)((java.util.Map.Entry) (obj)).getValue()).contains("dept"))
                        {
                            s1 = (String)((java.util.Map.Entry) (obj)).getValue();
                            ((MainActivity)ac1).d(s1);
                            s1 = b(s1, d("department"));
                        }
                    }
                } while (!s1.contains("index.jsp") || t1 == null);
                t1.c(new com.jcp.fragments.ah(), "DepartmentFragment");
            } while (true);
        }
        obj = s1;
        if (((String) (obj)).contains("home")) goto _L4; else goto _L3
_L3:
        if (((String) (obj)).startsWith("jcpenney://"))
        {
            ae.a(a, "Development in Progress");
            return;
        } else
        {
            e(((String) (obj)));
            return;
        }
        throw new com.jcp.d.a(String.format("Cannot typecast the object of type %s to class %s", new Object[] {
            android/app/Activity.getName(), com/jcp/activities/MainActivity.getName()
        }));
    }

    private void b(boolean flag)
    {
        PackageManager packagemanager = i().getPackageManager();
        ComponentName componentname = new ComponentName(JCP.d().getPackageName(), com/jcp/receivers/NetworkChangeReceiver.getName());
        int j;
        if (flag)
        {
            j = 1;
        } else
        {
            j = 2;
        }
        packagemanager.setComponentEnabledSetting(componentname, j, 1);
    }

    private String c(String s1)
    {
        return s1.replace("|", "%7C").replace("}", "%7D").replace("{", "%7B").trim();
    }

    private String d(String s1)
    {
        if (s1 != null)
        {
            return (new StringBuilder()).append("jcpenney://").append(s1).append("/").toString();
        } else
        {
            return "jcpenney://";
        }
    }

    private void e(String s1)
    {
        i().findViewById(0x7f0e0164).setVisibility(8);
        Object obj = new Bundle();
        ((Bundle) (obj)).putString("destinationURL", s1);
        s1 = new fa();
        s1.g(((Bundle) (obj)));
        obj = a(i());
        if (obj != null)
        {
            ((t) (obj)).c(s1, "PromotionFragment");
        }
    }

    protected String T()
    {
        return "Mobile|Welcome";
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        boolean flag = false;
        layoutinflater = layoutinflater.inflate(0x7f030069, viewgroup, false);
        i().findViewById(0x7f0e0164).setVisibility(0);
        if (bundle != null)
        {
            flag = true;
        }
        a(((View) (layoutinflater)), flag);
        return layoutinflater;
    }

    protected String a()
    {
        return "Welcome";
    }

    public void a(int j, Response response)
    {
        ae.d(a, "onFailure");
    }

    public void a(Accordion accordion)
    {
        if (accordion != null && accordion.getDestinationURL().getUrl() != null && accordion.getDestinationURL().getUrl().length() != 0)
        {
            b(accordion.getDestinationURL().getUrl());
        }
    }

    public void a(Recommendation recommendation)
    {
        ae.d(a, "onLoadedRichRelevanceMyRecs");
    }

    public void a(PlacementRecs placementrecs)
    {
        ae.d(a, "onLoadedRichRelevanceRecsForPlacements");
        if (placementrecs != null && !ah.a(placementrecs.getPlacements()))
        {
            placementrecs = ((Placements)placementrecs.getPlacements().get(0)).getStrategyMessage();
            b.setRecommendationsStrategyMessage(placementrecs);
        }
    }

    public void a(String s1, int j)
    {
    }

    public void a(String s1, String s2)
    {
        android.support.v4.app.ac ac1 = i();
        if (bt.a(ac1))
        {
            ((MainActivity)ac1).a(s1, s2);
        }
    }

    public void a(List list)
    {
        ae.d(a, "onLoadedJCPRecs");
        b.setRecommendations(list);
        b.setRecommendedProductClickListener(this);
    }

    public void a(Accordion aaccordion[], int j)
    {
        if (aaccordion != null && aaccordion.length != 0)
        {
            JCP.e().a(aaccordion);
            if (i() != null)
            {
                b.a(aaccordion, false);
            }
            com.jcp.b.a.a(i());
        }
    }

    public void b()
    {
        a(true);
        a(j().getString(0x7f070080));
        super.b();
    }

    public void c(Bundle bundle)
    {
        t t1 = a(i());
        if (t1 != null)
        {
            com.jcp.b.b.d(false);
            ProductDetailFragment productdetailfragment = new ProductDetailFragment();
            productdetailfragment.g(bundle);
            t1.b(productdetailfragment, "ProductDetailFragment");
        }
    }

    public void f_()
    {
        super.f_();
        P();
        b(true);
        i().registerReceiver(c, new IntentFilter("INTERNET_LOST"));
    }

    public void g_()
    {
        super.g_();
        i().unregisterReceiver(c);
        b(false);
    }

}
