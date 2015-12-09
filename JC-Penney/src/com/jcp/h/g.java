// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.h;

import android.os.Bundle;
import android.text.TextUtils;
import com.digitalanalytics.api.DigitalAnalytics;
import com.jcp.JCP;
import com.jcp.pojo.GetAccountResponse;
import com.jcp.util.ae;
import java.util.List;

// Referenced classes of package com.jcp.h:
//            f, c, e, b

public final class g
{

    private static final String a = com/jcp/h/g.getName();

    private g()
    {
    }

    public static f a(Bundle bundle, f f1)
    {
        Object obj;
label0:
        {
            obj = f1;
            if (bundle == null)
            {
                break label0;
            }
            String s = bundle.getString("SitePromoOne", null);
            String s1 = bundle.getString("SitePromoTwo", null);
            String s2 = bundle.getString("SitePromoThree", null);
            if (TextUtils.isEmpty(s) && TextUtils.isEmpty(s1))
            {
                obj = f1;
                if (TextUtils.isEmpty(s2))
                {
                    break label0;
                }
            }
            bundle = f1;
            if (f1 == null)
            {
                bundle = new f();
            }
            bundle.c(s);
            bundle.d(s1);
            bundle.e(s2);
            obj = bundle;
        }
        return ((f) (obj));
    }

    public static String a(Bundle bundle)
    {
        String s1 = "";
        if (!bundle.getBoolean("SEARCH", false)) goto _L2; else goto _L1
_L1:
        if (!bundle.getBoolean("is_web_id_search", false)) goto _L4; else goto _L3
_L3:
        String s = "Mobile|WebId";
_L6:
        return s;
_L4:
        return "Mobile|Search Results";
_L2:
        if (bundle.containsKey("breadcrumbs"))
        {
            return a(((List) (bundle.getStringArrayList("breadcrumbs"))));
        }
        s = s1;
        if (bundle.containsKey("from"))
        {
            s = s1;
            if ("RecommendationFragment".equalsIgnoreCase(bundle.getString("from", "")))
            {
                return String.format("%s|%s", new Object[] {
                    "Mobile|RICHREL", bundle.getString("recommendation_zone")
                });
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static String a(List list)
    {
        if (list != null)
        {
            return (new StringBuilder()).append("MOBILE|").append(TextUtils.join("|", list)).toString();
        } else
        {
            return "";
        }
    }

    public static void a(String s, f f1)
    {
        a(s, null, f1);
    }

    public static void a(String s, String s1, f f1)
    {
        com.jcp.h.c.a(JCP.d(), s);
        a(s, s1, null, null, b(s, f1), null);
        com.jcp.h.e.a(s);
    }

    private static void a(String s, String s1, String s2, String s3, String as[], String as1[])
    {
        ae.d(a, "Fire PagView Event:");
        ae.d(a, (new StringBuilder()).append("id = ").append(s).toString());
        ae.d(a, (new StringBuilder()).append("category = ").append(s1).toString());
        ae.d(a, (new StringBuilder()).append("searchTerm = ").append(s2).toString());
        ae.d(a, (new StringBuilder()).append("searchResult = ").append(s3).toString());
        ae.d(a, (new StringBuilder()).append("attributes = ").append(as).toString());
        ae.d(a, (new StringBuilder()).append("cmmmc = ").append(as1).toString());
        if (as != null && as.length > 0)
        {
            for (int i = 0; i < as.length; i++)
            {
                ae.d(a, (new StringBuilder()).append("attr[").append(i).append("] = ").append(as[i]).toString());
            }

        }
        com.jcp.h.b.a();
        DigitalAnalytics.firePageview(s, s1, s2, s3, as, as1);
    }

    private static void a(String as[])
    {
        GetAccountResponse getaccountresponse = JCP.j();
        if (a(getaccountresponse))
        {
            as[3] = getaccountresponse.getId();
            as[14] = getaccountresponse.getId();
        }
    }

    private static void a(String as[], f f1)
    {
        if (f1 != null)
        {
            as[17] = f1.p();
            as[18] = f1.q();
            as[19] = f1.r();
        }
    }

    private static boolean a(GetAccountResponse getaccountresponse)
    {
        return getaccountresponse != null && !TextUtils.isEmpty(getaccountresponse.getId());
    }

    private static void b(String as[], f f1)
    {
        if (f1 != null && f1.t())
        {
            as[0] = "T1";
            as[1] = "Marketing_Top_Banner";
        }
    }

    private static String[] b(String s, f f1)
    {
        String as[] = new String[40];
        for (int i = 0; i < as.length; i++)
        {
            as[i] = "";
        }

        as[15] = s;
        as[22] = "3.7.01";
        as[23] = "Android";
        a(as);
        c(as, f1);
        e(as, f1);
        f(as, f1);
        d(as, f1);
        g(as, f1);
        b(as, f1);
        a(as, f1);
        return as;
    }

    private static void c(String as[], f f1)
    {
        if (f1 != null && !TextUtils.isEmpty(f1.d()))
        {
            as[28] = "true";
            as[29] = f1.d();
        }
    }

    private static void d(String as[], f f1)
    {
        if (f1 != null)
        {
            as[36] = f1.k();
        }
    }

    private static void e(String as[], f f1)
    {
        if (f1 != null)
        {
            as[4] = f1.o();
            as[5] = f1.n();
            as[6] = f1.m();
            as[7] = f1.l();
            as[8] = f1.e();
            as[9] = f1.f();
            as[11] = f1.g();
        }
    }

    private static void f(String as[], f f1)
    {
        if (f1 != null)
        {
            as[24] = f1.h();
            as[25] = f1.i();
            as[26] = f1.j();
        }
    }

    private static void g(String as[], f f1)
    {
        if (f1 != null && f1.s())
        {
            as[30] = "Guest Checkout";
        }
    }

}
