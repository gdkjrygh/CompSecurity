// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.cards;

import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.m;
import com.google.android.libraries.translate.core.t;
import com.google.android.libraries.translate.e.c;
import com.google.android.libraries.translate.e.d;
import com.google.android.libraries.translate.e.k;
import java.io.IOException;
import java.net.URLEncoder;
import org.apache.http.client.HttpClient;
import org.json.JSONException;

final class f extends k
{

    private static transient m a(String as[])
    {
        m m1 = new m(as[0]);
        String s = m1.a(0);
        Object obj;
        String s1;
        StringBuilder stringbuilder;
        try
        {
            obj = d.b();
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            return null;
        }
        s1 = as[1];
        stringbuilder = t.a();
        stringbuilder.append("/translate_a/single?client=");
        stringbuilder.append(Singleton.c());
        stringbuilder.append("&dt=rm&dj=1");
        obj = d.b(((HttpClient) (obj)).execute((new c(stringbuilder.toString())).a("ie", "UTF-8").a("oe", "UTF-8").a("q", URLEncoder.encode(s, "UTF-8")).a("sl", s1).a(false)));
        try
        {
            as = m.a(as[1], ((String) (obj))).a(3);
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            return null;
        }
        if (as.isEmpty())
        {
            return null;
        }
        m1.a[0] = s;
        m1.a[1] = as;
        return m1;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }
}
