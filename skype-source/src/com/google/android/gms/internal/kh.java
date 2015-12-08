// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.y;
import com.google.android.gms.tagmanager.ak;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            jx

public final class kh
{

    private String a;

    public kh()
    {
        a = "https://www.google-analytics.com";
    }

    private static String b(String s)
    {
        String s1;
        try
        {
            s1 = URLEncoder.encode(s, "UTF-8").replaceAll("\\+", "%20");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            ak.a((new StringBuilder("Cannot encode the string: ")).append(s).toString());
            return "";
        }
        return s1;
    }

    public final String a(List list)
    {
        boolean flag = true;
        StringBuilder stringbuilder = (new StringBuilder()).append(a).append("/gtm/android?");
        if (list.size() > 1)
        {
            flag = false;
        }
        y.b(flag);
        if (list.isEmpty())
        {
            list = "";
        } else
        {
            jx jx1 = (jx)list.get(0);
            StringBuilder stringbuilder1;
            if (!jx1.f().trim().equals(""))
            {
                list = jx1.f().trim();
            } else
            {
                list = "-1";
            }
            stringbuilder1 = new StringBuilder();
            if (jx1.c() != null)
            {
                stringbuilder1.append(jx1.c());
            } else
            {
                stringbuilder1.append("id");
            }
            stringbuilder1.append("=").append(b(jx1.a())).append("&pv=").append(b(list));
            if (jx1.e())
            {
                stringbuilder1.append("&gtm_debug=x");
            }
            list = stringbuilder1.toString();
        }
        return stringbuilder.append(list).toString();
    }

    public final void a(String s)
    {
        a = s;
        ak.c((new StringBuilder("The Ctfe server endpoint was changed to: ")).append(s).toString());
    }
}
