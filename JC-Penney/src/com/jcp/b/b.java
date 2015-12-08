// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.f.a;
import android.text.TextUtils;
import com.jcp.util.ae;
import com.jcp.util.ao;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

// Referenced classes of package com.jcp.b:
//            a

public final class b
{

    private static String A;
    private static String B;
    private static int C;
    private static int D = -2;
    public static final Pattern a = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    public static String b = "m.jcpenney.com";
    public static String c;
    public static String d;
    public static String e = "http://m.jcpenney.com/";
    public static String f;
    public static String g = "";
    public static String h = "";
    public static boolean i = false;
    public static boolean j;
    public static String k;
    public static List l = new ArrayList();
    public static boolean m;
    public static boolean n;
    public static boolean o;
    public static boolean p;
    public static boolean q;
    public static int r;
    public static boolean s;
    public static boolean t;
    public static String u;
    public static boolean v;
    private static boolean w;
    private static String x;
    private static boolean y;
    private static boolean z;

    private b()
    {
    }

    public static String A()
    {
        return K((new StringBuilder()).append(f).append("session/activities").append(g).toString());
    }

    public static String A(String s1)
    {
        String s2 = (new StringBuilder()).append(d).append("cart/promotions/").append(s1).toString();
        s1 = s2;
        if (i)
        {
            s1 = (new StringBuilder()).append(s2).append(g).toString();
        }
        return K(s1);
    }

    public static String B()
    {
        return K((new StringBuilder()).append(f).append("customer/name").append(g).toString());
    }

    public static String B(String s1)
    {
        return K((new StringBuilder()).append("http://").append(b).append("/jcp/product.jsp?ppId=").append(s1).append("").toString());
    }

    public static String C()
    {
        return K((new StringBuilder()).append(f).append("customer/email").append(g).toString());
    }

    public static String C(String s1)
    {
        String s3 = "";
        String s2 = s3;
        if (s1 != null)
        {
            s2 = s3;
            if (s1.contains("ppId="))
            {
                s1 = s1.split("ppId=");
                s2 = s1[s1.length - 1];
            }
        }
        return s2;
    }

    public static String D()
    {
        return K((new StringBuilder()).append(f).append("customer/addresses").append(g).toString());
    }

    public static String D(String s1)
    {
        return K((new StringBuilder()).append(d).append("categories/").append(s1).append("/products?pageSize=24&page=1").toString());
    }

    public static String E()
    {
        return K((new StringBuilder()).append(f).append("customer/addresses").append(g).toString());
    }

    public static String E(String s1)
    {
        return K((new StringBuilder()).append(d).append("recommendations/search?q=").append(s1).toString());
    }

    public static String F()
    {
        return K((new StringBuilder()).append(f).append("customer/paymentMethods").append(g).toString());
    }

    public static String F(String s1)
    {
        try
        {
            s1 = (new StringBuilder()).append("http://integration.richrelevance.com/rrserver/api/rrPlatform/recsForPlacements?apiKey=5387d7af823640a7&pretty=true&useCookie=no&excludeHtml=true&recProductsCount=12&count=12&apiClientKey=f8ca6b043a545cfa&placements=").append(M(s1)).toString();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.jcp.util.ae.d(com/jcp/b/b.getName(), "RecsForPlacements  url formation error");
            return null;
        }
        return s1;
    }

    public static String G()
    {
        return K((new StringBuilder()).append(d).append("/departments").toString());
    }

    public static String G(String s1)
    {
label0:
        {
            String s2 = s1;
            if (!TextUtils.isEmpty(s1))
            {
                s2 = s1;
                if (i)
                {
                    s2 = s1;
                    if (!s1.contains("dpAkamaiOverride"))
                    {
                        if (!s1.contains("?"))
                        {
                            break label0;
                        }
                        s2 = (new StringBuilder()).append(s1).append(h).toString();
                    }
                }
            }
            return s2;
        }
        return (new StringBuilder()).append(s1).append(g).toString();
    }

    public static String H()
    {
        return K((new StringBuilder()).append(d).append("content").append("/").append("accordion").append(g).toString());
    }

    public static String H(String s1)
    {
        return (new StringBuilder()).append("http://www.flyertown.ca/flyerkit/publications/JCPenney?store_code=").append(s1).append("&locale=en-US&access_token=").append("1033d89a").toString();
    }

    public static String I()
    {
        return "https://jcp.mycreditcard.mobi";
    }

    public static String I(String s1)
    {
        return (new StringBuilder()).append("http://www.flyertown.ca/flyerkit/publication/").append(s1).append("/products?access_token=").append("1033d89a").toString();
    }

    public static String J()
    {
        return (new StringBuilder()).append("http://").append(b).append("/dotcom/jsp/customerservice/").append("serviceContent.jsp?pageId=pg40036500008").toString();
    }

    public static String J(String s1)
    {
        return (new StringBuilder()).append("http://www.flyertown.ca/flyerkit/publication/").append(s1).append("/pages?access_token=").append("1033d89a").toString();
    }

    public static String K()
    {
        return (new StringBuilder()).append("http://").append(b).append("/").append(c).append("/content/pg40053400007/mobile").toString();
    }

    private static String K(String s1)
    {
        String s2 = s1;
        if (!TextUtils.isEmpty(k))
        {
            s2 = s1;
            if (!TextUtils.isEmpty(s1))
            {
                if (s1.contains("?"))
                {
                    s1 = (new StringBuilder()).append(s1).append("&").toString();
                } else
                {
                    s1 = (new StringBuilder()).append(s1).append("?").toString();
                }
                s2 = (new StringBuilder()).append(s1).append("asOf=").append(k).toString();
            }
        }
        return s2;
    }

    public static String L()
    {
        return (new StringBuilder()).append("http://").append(b).append("/mobile/jsp/secure/giftcard/giftCard.jsp?").append("pageId=pg40027900016&navAction=push&navCount=0&lang=en").toString();
    }

    private static String L(String s1)
    {
        String s2 = s1;
        if (i)
        {
            if (s1.contains("?"))
            {
                s2 = (new StringBuilder()).append(s1).append(h).toString();
            } else
            {
                s2 = (new StringBuilder()).append(s1).append(g).toString();
            }
        }
        return K(s2);
    }

    public static String M()
    {
        return (new StringBuilder()).append("http://").append(b).append("/mobile/jsp/customerservice/serviceContent.jsp?").append("pageId=pg4003700009&navAction=push&navCount=0&lang=en").toString();
    }

    private static String M(String s1)
    {
        String s2 = "";
        if (s1 != null)
        {
            try
            {
                s2 = URLEncoder.encode(s1.trim(), "utf-8");
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                s1.printStackTrace();
                return "";
            }
        }
        return s2;
    }

    public static String N()
    {
        return (new StringBuilder()).append("http://").append(b).append("/mobile/jsp/customerservice/serviceContent.jsp?").append("pageId=pg40027900014&navAction=push&navCount=0&lang=en").toString();
    }

    public static String O()
    {
        return (new StringBuilder()).append("http://").append(b).append("/mobile/jsp/customerservice/serviceContent.jsp?r=true&").append("pageId=pg40027900011&navAction=push&navCount=0&lang=en").toString();
    }

    public static String P()
    {
        return (new StringBuilder()).append("http://").append(b).append("/mobile/jsp/customerservice/serviceContent.jsp?").append("pageId=pg40027900013&navAction=push&navCount=0&lang=en").toString();
    }

    public static String Q()
    {
        return "http://www.jcpenney.net/Product-Recalls.aspx";
    }

    public static String R()
    {
        return L((new StringBuilder()).append("http://").append(b).append("/customerService/articles?pageId=same-day-pickup-terms-conditions").toString());
    }

    public static String S()
    {
        return L((new StringBuilder()).append("http://").append(b).append("/customerService/articles?pageId=same-day-pickup-faq").toString());
    }

    public static String T()
    {
        return "http://phx.corporate-ir.net/External.File?item=UGFyZW50SUQ9MTg5NjA5fENoaWxkSUQ9LTF8VHlwZT0z&t=1";
    }

    public static String U()
    {
        return K((new StringBuilder()).append(d).append("cart/items").append(g).toString());
    }

    public static String V()
    {
        return K((new StringBuilder()).append(f).append("customer").append("/stores").append(g).toString());
    }

    public static String W()
    {
        return (new StringBuilder()).append("https://").append(b).append("/signin?captcha=true").append(h).toString();
    }

    public static String X()
    {
        return K((new StringBuilder()).append(f).append("orders").append(g).toString());
    }

    public static String Y()
    {
        return K((new StringBuilder()).append(f).append("savedItems").append(g).toString());
    }

    public static String Z()
    {
        return K((new StringBuilder()).append(d).append("content").append("/").append("coupons").append(g).toString());
    }

    public static String a()
    {
        return x;
    }

    public static String a(Double double1, Double double2)
    {
        return K((new StringBuilder()).append(d).append("stores/").append(Double.toString(double1.doubleValue())).append(",").append(Double.toString(double2.doubleValue())).append(g).toString());
    }

    public static String a(Double double1, Double double2, Boolean boolean1, int i1)
    {
        if (!boolean1.booleanValue())
        {
            i1 = 5;
        }
        return K((new StringBuilder()).append(d).append("cart/stores?address=").append(Double.toString(double1.doubleValue())).append(",").append(Double.toString(double2.doubleValue())).append("&radius=50&limit=").append(i1).append(h).toString());
    }

    public static String a(Double double1, Double double2, Integer integer)
    {
        double2 = (new StringBuilder()).append(d).append("stores/").append(Double.toString(double1.doubleValue())).append(",").append(Double.toString(double2.doubleValue()));
        if (integer != null)
        {
            double1 = (new StringBuilder()).append("?radius=").append(integer).toString();
        } else
        {
            double1 = "";
        }
        return K(double2.append(double1).append(g).toString());
    }

    public static String a(String s1, Double double1, Double double2)
    {
        return K((new StringBuilder()).append(d).append("products/").append(s1).append("/").append("inventory?storeAddress=").append(Double.toString(double1.doubleValue())).append(",").append(Double.toString(double2.doubleValue())).append(h).toString());
    }

    public static String a(String s1, String s2)
    {
        return K((new StringBuilder()).append(d).append("cart/items/").append(s1).append("/fulfillment-options/").append(s2).toString());
    }

    public static String a(String s1, String s2, int i1)
    {
        return K((new StringBuilder()).append("http://api.bazaarvoice.com/data/reviews.json?apiversion=5.4&passkey=").append(s1).append("&Filter=ProductId:").append(s2).append("&Limit=20&offset=").append(i1).toString());
    }

    public static String a(String s1, String s2, String s3)
    {
        return K((new StringBuilder()).append(d).append("categories/").append(s1).append("/products?pageSize=24&page=1").append("&filters=").append(s2).append("&sortBy=").append(s3).toString());
    }

    public static String a(String s1, List list, List list1)
    {
        String s2 = "";
        try
        {
            if (!TextUtils.isEmpty(s1))
            {
                s2 = (new StringBuilder()).append("userId=").append(s1).toString();
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.jcp.util.ae.d(com/jcp/b/b.getName(), "MyRecs url formation error");
            return null;
        }
        s1 = s2;
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        s1 = s2;
        if (list.isEmpty())
        {
            break MISSING_BLOCK_LABEL_94;
        }
        s1 = s2;
        if (!TextUtils.isEmpty(a(list, "|")))
        {
            s1 = (new StringBuilder()).append(s2).append("&recentlyViewed=").append(a(list, "|")).toString();
        }
        list = s1;
        if (list1 == null)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        list = s1;
        if (list1.isEmpty())
        {
            break MISSING_BLOCK_LABEL_157;
        }
        list = s1;
        if (!TextUtils.isEmpty(a(list1, "|")))
        {
            list = (new StringBuilder()).append(s1).append("&recentSearches=").append(a(list1, "|")).toString();
        }
        s1 = (new StringBuilder()).append("http://recs.richrelevance.com/rrserver/api/rrPlatform/myRecs?apiKey=5387d7af823640a7&apiClientKey=f8ca6b043a545cfa&pretty=true&recProductsCount=10&useCookie=no&").append(list).toString();
        return s1;
    }

    public static String a(String s1, boolean flag)
    {
        String s2 = (new StringBuilder()).append(d).append("products/").append(M(s1)).toString();
        s1 = s2;
        if (flag)
        {
            s1 = (new StringBuilder()).append(s2).append(g).toString();
        }
        return K(s1);
    }

    public static String a(List list)
    {
        String s1 = "";
        try
        {
            if (!TextUtils.isEmpty(a(list, ",")))
            {
                s1 = a(list, ",");
            }
            list = (new StringBuilder()).append(d).append("/products/").append(s1).toString();
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            com.jcp.util.ae.d(com/jcp/b/b.getName(), "JCP Recommendations url formation error");
            return null;
        }
        return list;
    }

    private static String a(List list, String s1)
    {
        Iterator iterator = list.iterator();
        list = null;
        while (iterator.hasNext()) 
        {
            String s2 = (String)iterator.next();
            if (TextUtils.isEmpty(list))
            {
                list = s2;
            } else
            {
                list = (new StringBuilder()).append(list).append(s1).append(s2).toString();
            }
        }
        return M(list);
    }

    public static void a(int i1)
    {
        C = i1;
    }

    public static void a(String s1)
    {
        x = s1;
    }

    public static void a(boolean flag)
    {
        y = flag;
    }

    public static boolean a(Context context)
    {
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        return context != null && context.isConnected();
    }

    public static String aa()
    {
        return u;
    }

    public static String ab()
    {
        return L((new StringBuilder()).append(f).append("savedItems/").toString());
    }

    public static String ac()
    {
        return L((new StringBuilder()).append(d).append("settings/").toString());
    }

    public static String ad()
    {
        String s2 = (new StringBuilder()).append(d).append("cart/promotions").toString();
        String s1 = s2;
        if (i)
        {
            s1 = (new StringBuilder()).append(s2).append(g).toString();
        }
        return K(s1);
    }

    public static boolean ae()
    {
        return com.jcp.b.a.a();
    }

    public static String af()
    {
        return "http://lenldtmgpr1p01.jcpenney.com/dotcom/jsp/customerservice/serviceContent.jsp?pageId=pg40053300007&lang=en";
    }

    public static String ag()
    {
        return F("generic_page.myRecs1|generic_page.myRecs2|generic_page.myRecs3|generic_page.myRecs4");
    }

    public static String[] ah()
    {
        String s1;
        String s2;
        if (i)
        {
            s1 = g;
        } else
        {
            s1 = "";
        }
        if (i)
        {
            s2 = h;
        } else
        {
            s2 = "";
        }
        return (new String[] {
            (new StringBuilder()).append("http://").append(b).append("/mobile/jsp/giftregistry/mobile/gifter/findRegistry.jsp").append("?shMore_FirstName=Registrant's%%20first%%20name").append("&shMore_LastName=Registrant's%%20last%%20name&shMore_EventType=W").append(s2).toString(), (new StringBuilder()).append("https://").append(b).append("/mobile/jsp/secure/giftregistry/mobile/createandmanage/createRegistry.jsp").append(s1).toString(), (new StringBuilder()).append("https://").append(b).append("/mobile/jsp/secure/giftregistry/mobile/createandmanage/manageRegistrySignin.jsp?sessionExpired=true").append(s2).toString()
        });
    }

    public static String[] ai()
    {
        return (new String[] {
            "http://www.jcpenney.com/dotcom/jsp/giftregistry/FindRegistry.jsp?eventCatId=cat100630111&eventType=B&grView=public&ref=grLanding&stop_mobi=yes", "https://www.jcpenney.com/dotcom/jsp/giftregistry/secure/registry/createRegistryPage.jsp?affiliateCode=&eventType=B&eventRootCatId=cat100630111&stop_mobi=yes", "https://www.jcpenney.com/dotcom/jsp/giftregistry/secure/registry/manageRegistrySigninPage.jsp?eventType=B&eventRootCatId=cat100630111&stop_mobi=yes"
        });
    }

    public static String b(String s1, String s2)
    {
        return K((new StringBuilder()).append(d).append("products/").append(s1).append("/").append("inventory?storeNumber=").append(M(s2)).append("&limit=1").append(h).toString());
    }

    public static String b(String s1, String s2, String s3)
    {
        return (new StringBuilder()).append(d).append("search?q=").append(s1).append("&filters=").append(s2).append("&sortBy=").append(s3).toString();
    }

    public static String b(String s1, boolean flag)
    {
label0:
        {
            if (flag)
            {
                if (!s1.contains("?"))
                {
                    break label0;
                }
                (new StringBuilder()).append(s1).append(h).toString();
            }
            return s1;
        }
        (new StringBuilder()).append(s1).append(g).toString();
        return s1;
    }

    public static void b(int i1)
    {
        D = i1;
    }

    public static void b(String s1)
    {
        A = s1;
    }

    public static void b(boolean flag)
    {
        z = flag;
    }

    public static boolean b()
    {
        return y;
    }

    public static String c()
    {
        return A;
    }

    public static String c(String s1, String s2)
    {
        String s3 = (new StringBuilder()).append(d).append("shipments/").append(s1).append("/").append(s2).toString();
        s2 = ao.a((new StringBuilder()).append(s2).append("jcpships|").append(s1).append("|1234-5678").toString());
        s1 = s3;
        if (s2 != null)
        {
            s1 = (new StringBuilder()).append(s3).append("?signature=").append(s2).toString();
        }
        return L(s1);
    }

    public static String c(String s1, boolean flag)
    {
        String s2 = s1;
        if (flag)
        {
            if (s1.contains("?"))
            {
                s2 = (new StringBuilder()).append(s1).append(h).toString();
            } else
            {
                s2 = (new StringBuilder()).append(s1).append(g).toString();
            }
        }
        return K(s2);
    }

    public static void c(int i1)
    {
        r = i1;
    }

    public static void c(String s1)
    {
        B = s1;
    }

    public static void c(boolean flag)
    {
        o = flag;
    }

    public static String d()
    {
        return B;
    }

    public static String d(String s1)
    {
        return K((new StringBuilder()).append(f).append("savedItems/").append(s1).append(g).toString());
    }

    public static String d(String s1, String s2)
    {
        return L((new StringBuilder()).append(d).append("products/").append(s1).append("/availability/").append(s2).toString());
    }

    public static void d(boolean flag)
    {
        w = flag;
    }

    public static int e()
    {
        return C;
    }

    public static String e(String s1)
    {
        String s2 = (new StringBuilder()).append(d).append("cart?context=shoppingCart&nearest-location=").append(s1).toString();
        s1 = s2;
        if (i)
        {
            s1 = (new StringBuilder()).append(s2).append(h).toString();
        }
        return K(s1);
    }

    public static String e(String s1, String s2)
    {
        return K((new StringBuilder()).append(d).append("categories/").append(s1).append("/products?pageSize=24&page=1").append("&sortBy=").append(s2).toString());
    }

    public static void e(boolean flag)
    {
        com.jcp.b.a.a(flag);
    }

    public static String f(String s1)
    {
        return K((new StringBuilder()).append(f).append("customer/addresses/").append(s1).append(g).toString());
    }

    public static String f(String s1, String s2)
    {
        return K((new StringBuilder()).append(d).append("categories/").append(s1).append("/products?pageSize=24&page=1").append("&filters=").append(s2).toString());
    }

    public static boolean f()
    {
        return w;
    }

    public static int g()
    {
        return D;
    }

    public static String g(String s1)
    {
        return K((new StringBuilder()).append(f).append("customer/paymentMethods/").append(s1).append(g).toString());
    }

    public static String g(String s1, String s2)
    {
        return (new StringBuilder()).append(d).append("search?q=").append(s1).append("&filters=").append(s2).toString();
    }

    public static String h()
    {
        return (new StringBuilder()).append("https://").append(b).append("/c/index.html#/checkout").toString();
    }

    public static String h(String s1)
    {
        return K((new StringBuilder()).append(f).append("customer/addresses/").append(s1).append(g).toString());
    }

    public static String i()
    {
        return (new StringBuilder()).append(h()).append("?paypal=true").toString();
    }

    public static String i(String s1)
    {
        return K((new StringBuilder()).append(f).append("customer/paymentMethods/default").append(g).toString());
    }

    public static String j()
    {
        return h();
    }

    public static String j(String s1)
    {
        return K((new StringBuilder()).append(d).append("departments/").append(s1).toString());
    }

    public static String k()
    {
        return (new StringBuilder()).append("https://").append(b).append("/detailtracker?trackingNumber=%s&phone=%s").toString();
    }

    public static String k(String s1)
    {
        return K((new StringBuilder()).append(d).append("categories/").append(s1).toString());
    }

    public static String l()
    {
        return (new StringBuilder()).append("http://").append(b).append("/mobile/jsp/customerservice/serviceContent.jsp?pageId=").append("pg40027900020&isFooter=true&title=your%20California%20privacy%20rights").toString();
    }

    public static String l(String s1)
    {
        return K((new StringBuilder()).append(f).append("savedItems/").append(s1).append(g).toString());
    }

    public static String m()
    {
        return (new StringBuilder()).append("http://").append(b).append("/mobile/jsp/customerservice/serviceContent.jsp?r=true").append("&pageId=pg40027900018&isFooter=true&title=privacy%20policy").toString();
    }

    public static String m(String s1)
    {
        return K((new StringBuilder()).append(d).append("categories/").append(s1).append("/products").append(g).toString());
    }

    public static String n()
    {
        String s2 = (new StringBuilder()).append(d).append("cart?context=shoppingCart").toString();
        String s1 = s2;
        if (i)
        {
            s1 = (new StringBuilder()).append(s2).append(h).toString();
        }
        return K(s1);
    }

    public static String n(String s1)
    {
        return K((new StringBuilder()).append(d).append("stores/").append(M(s1)).append(g).toString());
    }

    public static String o()
    {
        return K((new StringBuilder()).append(d).append("cart/fulfillment-options/2/store?select-for-items=all-available").append(h).toString());
    }

    public static String o(String s1)
    {
        return K((new StringBuilder()).append(d).append("search/suggestions/").append(s1).append(g).toString());
    }

    public static String p()
    {
        String s2 = (new StringBuilder()).append(d).append("cart/promotions").toString();
        String s1 = s2;
        if (i)
        {
            s1 = (new StringBuilder()).append(s2).append(g).toString();
        }
        return K(s1);
    }

    public static String p(String s1)
    {
        String s2 = (new StringBuilder()).append(d).append("search?q=").append(s1).toString();
        s1 = s2;
        if (i)
        {
            if (s2.contains("?"))
            {
                s1 = (new StringBuilder()).append(s2).append(h).toString();
            } else
            {
                s1 = (new StringBuilder()).append(s2).append(g).toString();
            }
        }
        return K(s1);
    }

    public static String q()
    {
        return K((new StringBuilder()).append(f).append("customer").append(g).toString());
    }

    public static String q(String s1)
    {
        return K((new StringBuilder()).append(f).append("cart/items/").append(s1).append(g).toString());
    }

    public static String r()
    {
        return (new StringBuilder()).append("https://").append(b).append("/forgotpassword").toString();
    }

    public static String r(String s1)
    {
        return K((new StringBuilder()).append(d).append("cart/items/").append(s1).append(g).toString());
    }

    public static String s()
    {
        return K(f);
    }

    public static String s(String s1)
    {
        return K((new StringBuilder()).append(f).append("customer").append("/stores").append(g).toString());
    }

    public static String t()
    {
        return (new StringBuilder()).append(s()).append("/customer/rewards-profile").toString();
    }

    public static String t(String s1)
    {
        return K((new StringBuilder()).append(f).append("customer").append("/stores/").append(s1).append(g).toString());
    }

    public static String u()
    {
        return "https://www.jcprewards.com/Registration.aspx";
    }

    public static String u(String s1)
    {
        return K((new StringBuilder()).append(f).append("savedItems/").append(s1).append(g).toString());
    }

    public static String v()
    {
        return "https://www.jcprewards.com/ResetPassword.aspx";
    }

    public static String v(String s1)
    {
        return K((new StringBuilder()).append(d).append("categories/").append(s1).append("/products?expand=content").append(h).toString());
    }

    public static String w()
    {
        if (i)
        {
            return "https://uatmbn.peny.epsilon.com/";
        } else
        {
            return "https://www.jcprewards.com/";
        }
    }

    public static String w(String s1)
    {
        String s2 = s1;
        if (i)
        {
            s2 = s1;
            if (!s1.contains("dpAkamaiOverride"))
            {
                if (s1.contains("?"))
                {
                    s2 = (new StringBuilder()).append(s1).append(h).toString();
                } else
                {
                    s2 = (new StringBuilder()).append(s1).append(g).toString();
                }
            }
        }
        return K(s2);
    }

    public static String x()
    {
        return K((new StringBuilder()).append(f).append("session").append(g).toString());
    }

    public static String x(String s1)
    {
        return K((new StringBuilder()).append(d).append("zipCodes/").append(s1).append(g).toString());
    }

    public static String y()
    {
        return K((new StringBuilder()).append(f).append("session?context=checkout").toString());
    }

    public static Map y(String s1)
    {
        a a1 = new a();
        if (!TextUtils.isEmpty(s1))
        {
            s1 = s1.split("\\?");
            if (s1.length >= 2)
            {
                s1 = s1[1].split("&");
                int j1 = s1.length;
                for (int i1 = 0; i1 < j1; i1++)
                {
                    String as[] = s1[i1].split("=");
                    if (as.length >= 2)
                    {
                        a1.put(as[0], as[1]);
                    }
                }

            }
        }
        return a1;
    }

    public static String z()
    {
        return K((new StringBuilder()).append(f).append("session/checkout").toString());
    }

    public static void z(String s1)
    {
        u = s1;
    }

    static 
    {
        c = "v2.1";
        d = (new StringBuilder()).append("http://m.jcpenney.com/").append(c).append("/").toString();
        f = (new StringBuilder()).append("https://m.jcpenney.com/").append(c).append("/").toString();
    }
}
