// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import java.util.Calendar;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.paypal.android.sdk:
//            dw, eb, ec, gd, 
//            ah, dx, cn, ef, 
//            du

public class ga extends dw
{

    private static final String a = com/paypal/android/sdk/ga.getSimpleName();
    private final ah b;

    public ga(dx dx1, ef ef, ah ah1)
    {
        super(new eb(ec.a), dx1, ef);
        b = ah1;
    }

    private static void a(Map map, StringBuilder stringbuilder)
    {
        if (!map.isEmpty())
        {
            Iterator iterator = map.keySet().iterator();
            while (iterator.hasNext()) 
            {
                String s = (String)iterator.next();
                if (map.get(s) == null)
                {
                    (new StringBuilder("No value for ")).append(s).append(", skipping");
                    return;
                }
                String s1 = gd.a((String)map.get(s));
                stringbuilder.append("&").append(s);
                stringbuilder.append("=").append(s1);
            }
        }
    }

    public final String a(du du)
    {
        return "https://paypal.112.2o7.net/b/ss/paypalglobal/0/OIP-2.1.6/";
    }

    public final boolean a()
    {
        return true;
    }

    public final String b()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Object obj = Calendar.getInstance();
        int i = ((Calendar) (obj)).get(4);
        long l = -(long)((((Calendar) (obj)).get(15) + ((Calendar) (obj)).get(16)) / 60000);
        stringbuilder.append(Integer.toString(((Calendar) (obj)).get(5))).append("/").append(Integer.toString(((Calendar) (obj)).get(2))).append("/").append(Integer.toString(((Calendar) (obj)).get(1))).append(" ").append(Integer.toString(((Calendar) (obj)).get(11))).append(":").append(Integer.toString(((Calendar) (obj)).get(12))).append(":").append(Integer.toString(((Calendar) (obj)).get(13))).append(" ").append(Integer.toString(i)).append(" ").append(Long.toString(l));
        obj = stringbuilder.toString();
        stringbuilder = new StringBuilder();
        stringbuilder.append("s").append(b.a).append("?AQB=1").append("&ndh=1").append((new StringBuilder("&t")).append(gd.a(((String) (obj)))).toString());
        obj = gd.a(t().d().e().replace("-", ""));
        stringbuilder.append((new StringBuilder("&ch=")).append(gd.a(b.c)).toString()).append((new StringBuilder("&sv=")).append(b.d).toString()).append((new StringBuilder("&vid=")).append(((String) (obj))).toString());
        a(b.b, stringbuilder);
        stringbuilder.append("&AQE=1");
        return stringbuilder.toString();
    }

    public final void c()
    {
    }

    public final void d()
    {
    }

    public final String e()
    {
        return "mockSiteCatalystResponse";
    }

}
