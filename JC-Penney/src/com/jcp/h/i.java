// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.h;

import com.digitalanalytics.api.DigitalAnalytics;
import com.jcp.util.ae;

// Referenced classes of package com.jcp.h:
//            b, e, h

public final class i
{

    private static final String a = com/jcp/h/i.getName();

    private i()
    {
    }

    public static void a(String s, String s1, String s2, String s3, h h1)
    {
        a(s, s1, s2, s3, a(h1));
    }

    private static void a(String s, String s1, String s2, String s3, String as[])
    {
        ae.d(a, "Fire ProductView Event:");
        ae.d(a, (new StringBuilder()).append("pageId = ").append(s).toString());
        ae.d(a, (new StringBuilder()).append("productId = ").append(s1).toString());
        ae.d(a, (new StringBuilder()).append("productName = ").append(s2).toString());
        ae.d(a, (new StringBuilder()).append("categoryId = ").append(s3).toString());
        ae.d(a, (new StringBuilder()).append("attributes = ").append(as).toString());
        if (as != null && as.length > 0)
        {
            for (int j = 0; j < as.length; j++)
            {
                ae.d(a, (new StringBuilder()).append("attr[").append(j).append("] = ").append(as[j]).toString());
            }

        }
        b.a();
        DigitalAnalytics.fireProductview(s, s1, s2, s3, as);
        e.a((new StringBuilder()).append("ProductView:").append(s1).toString(), (new StringBuilder()).append("Page:").append(s).toString(), s3);
    }

    private static String[] a(h h1)
    {
        String as[] = new String[36];
        for (int j = 0; j < as.length; j++)
        {
            as[j] = "";
        }

        as[11] = h1.g();
        as[12] = h1.h();
        as[13] = h1.i();
        as[14] = h1.j();
        as[15] = h1.a();
        as[16] = h1.b();
        as[24] = h1.c();
        as[26] = h1.d();
        as[34] = h1.e();
        as[35] = h1.f();
        as[23] = h1.k();
        return as;
    }

}
