// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction.a;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.serverinteraction.a:
//            d, a, e, b

public final class c
{
    private static class a
    {

        public static c a = new c();


        private a()
        {
        }
    }


    private List a;

    private c()
    {
        a = new ArrayList();
        a.add(new d());
        a.add(new com.fitbit.serverinteraction.a.a());
        a.add(new e());
    }


    public static c a()
    {
        return a.a;
    }

    public boolean a(HttpURLConnection httpurlconnection)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            b b1 = (b)iterator.next();
            if (b1.b(httpurlconnection) && !b1.a(httpurlconnection))
            {
                return false;
            }
        }

        return true;
    }

    public List b()
    {
        return a;
    }
}
