// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.c;

import android.content.Context;
import com.jcp.b.b;
import com.jcp.e.w;
import com.jcp.e.x;
import com.jcp.http.a;
import com.jcp.model.Product;
import com.jcp.pojo.Response;
import com.jcp.recommendation.myrecs.Recommendation;
import com.jcp.recommendation.myrecs.RecommendedProduct;
import com.jcp.recommendation.myrecs.StrategyResults;
import com.jcp.recommendation.placements.PlacementRecs;
import com.jcp.recommendation.placements.Placements;
import com.jcp.util.aa;
import com.jcp.util.ah;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.jcp.c:
//            b

public class ac extends com.jcp.c.b
    implements w
{

    private List a;

    public ac(Context context)
    {
        a(context);
    }

    private void a(String s, int i)
    {
        a a1 = new a(b(), this);
        a1.a(true);
        a1.a(s);
        a1.a(i);
        a1.b(0);
        a1.execute(new Void[0]);
    }

    private void a(List list)
    {
        a(com.jcp.b.b.a(list), 62);
    }

    private void b(String s)
    {
        a(s, 61);
    }

    private void b(List list)
    {
        a = new ArrayList();
        if (list != null)
        {
            StrategyResults strategyresults;
            for (list = list.iterator(); list.hasNext(); a.addAll(strategyresults.getRecommendedProducts()))
            {
                strategyresults = (StrategyResults)list.next();
            }

        }
    }

    private boolean b(Response response)
    {
        response = (Recommendation)aa.a(response.getResponseBody(), com/jcp/recommendation/myrecs/Recommendation);
        if (response != null)
        {
            if (c() != null)
            {
                ((x)c()).a(response);
            }
            b(response.getStrategyResults());
            a(e());
        }
        return response != null;
    }

    private void c(List list)
    {
        a = new ArrayList();
        if (list != null)
        {
            Placements placements;
            for (list = list.iterator(); list.hasNext(); a.addAll(placements.getRecommendedProducts()))
            {
                placements = (Placements)list.next();
            }

        }
    }

    private boolean c(Response response)
    {
        response = (PlacementRecs)aa.a(response.getResponseBody(), com/jcp/recommendation/placements/PlacementRecs);
        if (response != null)
        {
            if (c() != null)
            {
                ((x)c()).a(response);
            }
            c(response.getPlacements());
            a(e());
        }
        return response != null;
    }

    private List d(List list)
    {
        ArrayList arraylist = new ArrayList();
        if (!ah.a(list) && !ah.a(a))
        {
            for (Iterator iterator = a.iterator(); iterator.hasNext();)
            {
                RecommendedProduct recommendedproduct = (RecommendedProduct)iterator.next();
                Iterator iterator1 = list.iterator();
                while (iterator1.hasNext()) 
                {
                    Product product = (Product)iterator1.next();
                    if (product.getId().equals(recommendedproduct.getId()))
                    {
                        recommendedproduct.setImages(product.getImages());
                        recommendedproduct.setPrices(product.getPrices());
                        recommendedproduct.setRating(product.getRating());
                        recommendedproduct.setReviewCount(product.getReviewCount());
                        arraylist.add(recommendedproduct);
                    }
                }
            }

        }
        return arraylist;
    }

    private boolean d(Response response)
    {
        response = (Product[])aa.a(response.getResponseBody(), [Lcom/jcp/model/Product;);
        if (response != null && c() != null)
        {
            ((x)c()).a(d(Arrays.asList(response)));
        }
        return response != null;
    }

    private List e()
    {
        ArrayList arraylist = new ArrayList();
        if (!ah.a(a))
        {
            for (Iterator iterator = a.iterator(); iterator.hasNext(); arraylist.add(((RecommendedProduct)iterator.next()).getId())) { }
        }
        return arraylist;
    }

    public void a()
    {
        a("home_page.content1_mobile");
    }

    public void a(x x1)
    {
        a(((com.jcp.e.f) (x1)));
    }

    public void a(Response response)
    {
        if (c() != null && response != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        boolean flag;
        boolean flag1;
        i = response.getReJcpRequestTypes();
        flag1 = false;
        flag = flag1;
        if (!com.jcp.http.b.a(response.getStatusCode())) goto _L4; else goto _L3
_L3:
        i;
        JVM INSTR tableswitch 60 62: default 60
    //                   60 91
    //                   61 101
    //                   62 111;
           goto _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_111;
_L6:
        break; /* Loop/switch isn't completed */
_L5:
        flag = flag1;
_L4:
        if (!flag && c() != null)
        {
            ((x)c()).a(i, response);
            return;
        }
        if (true) goto _L1; else goto _L9
_L9:
        try
        {
            flag = b(response);
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            response.setErrorMsg(exception.getMessage());
            flag = flag1;
        }
          goto _L4
_L7:
        flag = c(response);
          goto _L4
        flag = d(response);
          goto _L4
    }

    public void a(String s)
    {
        b(com.jcp.b.b.F(s));
    }

    public void a(String s, List list, List list1)
    {
        a(com.jcp.b.b.a(s, list, list1), 60);
    }

    public void d()
    {
        b(com.jcp.b.b.ag());
    }
}
