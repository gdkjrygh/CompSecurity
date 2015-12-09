// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.aj;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.jcp.JCP;
import com.jcp.activities.JcpCheckoutSignIn;
import com.jcp.b.b;
import com.jcp.c.q;
import com.jcp.e.aa;
import com.jcp.e.ad;
import com.jcp.e.x;
import com.jcp.errorstatus.ErrorMessageUtil;
import com.jcp.model.GetAddressResponseModel;
import com.jcp.pojo.GetAccountResponse;
import com.jcp.pojo.ProfilePojo;
import com.jcp.pojo.Response;
import com.jcp.recommendation.myrecs.Recommendation;
import com.jcp.recommendation.myrecs.StrategyResults;
import com.jcp.recommendation.placements.PlacementRecs;
import com.jcp.recommendation.placements.Placements;
import com.jcp.util.ae;
import com.jcp.util.af;
import com.jcp.util.au;
import com.jcp.views.HorizontalListOfRecommendedProducts;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.jcp.fragments:
//            s, fe, ProductDetailFragment, t

public class fd extends s
    implements android.view.View.OnClickListener, aa, ad, x
{

    private static final String a = com/jcp/fragments/fd.getName();
    private static WeakReference am;
    private static final String b = a;
    private TextView aj;
    private TextView ak;
    private TextView al;
    private LinearLayout c;
    private com.jcp.c.ac d;
    private q e;
    private boolean f;
    private Recommendation g;
    private PlacementRecs h;
    private RelativeLayout i;

    public fd()
    {
    }

    public static fe U()
    {
        if (am == null || am.get() == null)
        {
            am = new WeakReference(new fe());
        }
        return (fe)am.get();
    }

    private List V()
    {
        return Arrays.asList(i().getSharedPreferences(b, 0).getStringSet("RECENT_SEARCH_TEXT", new HashSet()).toArray());
    }

    private List W()
    {
        return Arrays.asList(i().getSharedPreferences(b, 0).getStringSet("PPID", new HashSet()).toArray());
    }

    private String X()
    {
        try
        {
            com.jcp.util.af.a(i()).e();
        }
        catch (Exception exception)
        {
            com.jcp.util.ae.a(a, exception.getMessage());
        }
        return null;
    }

    private String Z()
    {
        try
        {
            com.jcp.util.af.a(i()).f();
        }
        catch (Exception exception)
        {
            com.jcp.util.ae.a(a, exception.getMessage());
        }
        return null;
    }

    private View a(int j, String s1, List list)
    {
        if (i() == null)
        {
            return null;
        } else
        {
            HorizontalListOfRecommendedProducts horizontallistofrecommendedproducts = new HorizontalListOfRecommendedProducts(i());
            horizontallistofrecommendedproducts.setTitle(s1);
            horizontallistofrecommendedproducts.setRecommendedProductsWithoutSignInItem(list);
            horizontallistofrecommendedproducts.setRecommendedProductClickListener(this);
            horizontallistofrecommendedproducts.setZone(j);
            return horizontallistofrecommendedproducts;
        }
    }

    public static fd a(String s1, boolean flag)
    {
        s1 = new fd();
        Bundle bundle = new Bundle();
        bundle.putBoolean("redirect_sign_in", flag);
        s1.g(bundle);
        return s1;
    }

    private void aa()
    {
        String s1 = Z();
        if (JCP.s().c() && !TextUtils.isEmpty(s1))
        {
            h().putBoolean("redirect_sign_in", false);
            ak.setVisibility(8);
            al.setVisibility(0);
            al.setText(String.format(a(0x7f0701e2), new Object[] {
                s1.toUpperCase()
            }));
            return;
        } else
        {
            al.setVisibility(8);
            ak.setVisibility(0);
            return;
        }
    }

    private void ab()
    {
        Intent intent = new Intent(i(), com/jcp/activities/JcpCheckoutSignIn);
        intent.putExtra("from", com/jcp/fragments/fd.getName());
        a(intent, 10001);
    }

    private void ac()
    {
        c.removeAllViewsInLayout();
        c.invalidate();
    }

    private void ad()
    {
        i.setVisibility(0);
    }

    private void ae()
    {
        i.setVisibility(8);
    }

    private void af()
    {
        c.setVisibility(8);
        aj.setVisibility(0);
    }

    private void ag()
    {
        Iterator iterator = h.getPlacements().iterator();
        int j = 1;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Placements placements = (Placements)iterator.next();
            if (placements.getRecommendedProducts().size() > 0)
            {
                c.addView(a(j, placements.getStrategyMessage(), placements.getRecommendedProducts()));
                j++;
            }
        } while (true);
    }

    private void ah()
    {
        Iterator iterator = g.getStrategyResults().iterator();
        int j = 1;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            StrategyResults strategyresults = (StrategyResults)iterator.next();
            if (strategyresults.getRecommendedProducts().size() > 0)
            {
                c.addView(a(j, strategyresults.getMessage(), strategyresults.getRecommendedProducts()));
                j++;
            }
        } while (true);
    }

    private void ai()
    {
        if (g.getStrategyResults().size() <= 6)
        {
            return;
        }
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist2 = new ArrayList();
        ArrayList arraylist3 = new ArrayList();
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = g.getStrategyResults().iterator(); iterator.hasNext();)
        {
            StrategyResults strategyresults = (StrategyResults)iterator.next();
            if ("ProductViewedViewed".equals(strategyresults.getStrategyName()))
            {
                arraylist1.add(strategyresults);
            } else
            if ("SearchBought".equals(strategyresults.getStrategyName()))
            {
                arraylist2.add(strategyresults);
            } else
            {
                arraylist3.add(strategyresults);
            }
        }

        arraylist.addAll(arraylist2);
        arraylist.addAll(arraylist1);
        arraylist.addAll(arraylist3);
        arraylist1 = new ArrayList();
        for (int j = 0; j < 6; j++)
        {
            arraylist1.add(arraylist.get(j));
        }

        g.setStrategyResults(arraylist1);
    }

    public static void c(Context context, String s1)
    {
        SharedPreferences sharedpreferences = context.getSharedPreferences(b, 0);
        context = sharedpreferences.getStringSet("PPID", new HashSet());
        context.add(s1);
        s1 = sharedpreferences.edit();
        s1.putStringSet("PPID", context);
        s1.commit();
    }

    public static void d(Context context, String s1)
    {
        SharedPreferences sharedpreferences = context.getSharedPreferences(b, 0);
        context = sharedpreferences.getStringSet("RECENT_SEARCH_TEXT", new HashSet());
        context.add(s1);
        s1 = sharedpreferences.edit();
        s1.putStringSet("RECENT_SEARCH_TEXT", context);
        s1.commit();
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030074, viewgroup, false);
    }

    protected String a()
    {
        return "RECOMMENDATIONS";
    }

    public void a(int j, int k, Intent intent)
    {
        super.a(j, k, intent);
        if (j == 10001)
        {
            if (k == -1)
            {
                ad();
                ac();
                e.a();
                U().a(true);
            } else
            if (h().getBoolean("redirect_sign_in"))
            {
                i().f().c();
                return;
            }
        }
    }

    public void a(int j, Response response)
    {
        ae();
        if (i() == null) goto _L2; else goto _L1
_L1:
        String s1 = a(0x7f070236);
        if (response == null) goto _L4; else goto _L3
_L3:
        response = ErrorMessageUtil.getErrorMessageFromJSONResponse(response.getResponseBody());
        if (TextUtils.isEmpty(response)) goto _L4; else goto _L5
_L5:
        au.a(i(), a(0x7f0701bb), response);
_L2:
        return;
_L4:
        response = s1;
        if (true) goto _L5; else goto _L6
_L6:
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        d = new com.jcp.c.ac(i());
        d.a(this);
        e = new q(i());
        e.a(this);
    }

    public void a(GetAccountResponse getaccountresponse, int j)
    {
        try
        {
            com.jcp.util.af.a(i()).a(getaccountresponse);
        }
        // Misplaced declaration of an exception variable
        catch (GetAccountResponse getaccountresponse)
        {
            getaccountresponse.printStackTrace();
        }
        aa();
        d.a(X(), W(), V());
    }

    public void a(Recommendation recommendation)
    {
        g = recommendation;
        if (g == null || g.getStrategyResults() == null)
        {
            ae();
            return;
        }
        if (g.getStrategyResults().isEmpty())
        {
            d.d();
            return;
        } else
        {
            f = true;
            ai();
            return;
        }
    }

    public void a(PlacementRecs placementrecs)
    {
        h = placementrecs;
        if (h == null || h.getPlacements() == null)
        {
            ae();
        } else
        if (h.getPlacements().isEmpty())
        {
            ae();
            af();
            return;
        }
    }

    public void a(String s1, String s2, int j)
    {
    }

    public void a(List list)
    {
        ae();
        if (f)
        {
            ah();
            return;
        } else
        {
            ag();
            return;
        }
    }

    public void a(List list, int j)
    {
    }

    public void a(GetAddressResponseModel agetaddressresponsemodel[], int j)
    {
    }

    public void a_(String s1, int j)
    {
    }

    public void a_(ProfilePojo aprofilepojo[], int j)
    {
    }

    public void b()
    {
        a(a(0x7f07033a));
        a(true);
        super.b();
    }

    public void c(Bundle bundle)
    {
        t t1 = a(i());
        if (t1 != null)
        {
            com.jcp.b.b.d(false);
            ProductDetailFragment productdetailfragment = new ProductDetailFragment();
            bundle.putString("from", "RecommendationFragment");
            productdetailfragment.g(bundle);
            t1.c(productdetailfragment, "ProductDetailFragment");
        }
    }

    public void d(Bundle bundle)
    {
        super.d(bundle);
        c = (LinearLayout)r().findViewById(0x7f0e02a4);
        ak = (TextView)r().findViewById(0x7f0e02be);
        al = (TextView)r().findViewById(0x7f0e02bc);
        aj = (TextView)r().findViewById(0x7f0e02bf);
        i = (RelativeLayout)r().findViewById(0x7f0e02c0);
        ak.setOnClickListener(this);
        aa();
        if (h().getBoolean("redirect_sign_in"))
        {
            ab();
            return;
        } else
        {
            d.a(X(), W(), V());
            return;
        }
    }

    public void onClick(View view)
    {
        if (view == ak)
        {
            ab();
        }
    }

}
