// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.protocol;

import com.google.common.a.hq;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.inject.a;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.facebook.http.protocol:
//            n

public class q
{

    private final a a;
    private final a b;

    public q(a a1, a a2)
    {
        a = a1;
        b = a2;
    }

    private List a()
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("locale", com.facebook.common.k.a.a((Locale)a.b())));
        String s = (String)b.b();
        if (s != null)
        {
            arraylist.add(new BasicNameValuePair("client_country_code", s));
        }
        return arraylist;
    }

    public List a(n n1)
    {
        n1 = hq.a(n1.d());
        n1.addAll(a());
        return n1;
    }

    public void a(android.net.Uri.Builder builder)
    {
        NameValuePair namevaluepair;
        for (Iterator iterator = a().iterator(); iterator.hasNext(); builder.appendQueryParameter(namevaluepair.getName(), namevaluepair.getValue()))
        {
            namevaluepair = (NameValuePair)iterator.next();
        }

    }
}
