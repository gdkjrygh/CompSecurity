// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.logging;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.libraries.translate.e.d;
import com.google.android.libraries.translate.e.k;
import com.google.android.libraries.translate.e.l;
import java.io.IOException;
import java.net.URI;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpRequestBase;

// Referenced classes of package com.google.android.libraries.translate.logging:
//            b, Event

public final class a
    implements l
{

    final SharedPreferences a;
    private b b;
    private int c;
    private long d;

    public a(Context context, String s)
    {
        a = context.getSharedPreferences(s, 0);
        d = 0L;
        c = 0;
        context = a.getAll().entrySet().iterator();
        do
        {
            if (!context.hasNext())
            {
                break;
            }
            s = ((String) (((java.util.Map.Entry)context.next()).getValue()));
            if (s != null && (s instanceof Integer))
            {
                int i = c;
                c = ((Integer)s).intValue() + i;
            }
        } while (true);
    }

    private void a(Boolean boolean1)
    {
        this;
        JVM INSTR monitorenter ;
        if (boolean1.booleanValue())
        {
            c = 0;
            a.edit().clear().commit();
            b = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        boolean1;
        throw boolean1;
    }

    private void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        int i = a.getInt(s, 0);
        a.edit().putInt(s, i + 1).commit();
        c = c + 1;
        long l1 = System.currentTimeMillis();
        if (b == null && c >= 20 && l1 - d > 30000L)
        {
            d = l1;
            b = new b(this);
            b.f = this;
            b.a(new Void[0]);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public static boolean a(HttpRequestBase httprequestbase)
    {
        HttpResponse httpresponse;
        httpresponse = com.google.android.libraries.translate.e.d.a().execute(httprequestbase);
        if (httpresponse.getStatusLine().getStatusCode() != 204)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        httprequestbase.getURI().toString();
        return true;
        try
        {
            httpresponse.getStatusLine();
        }
        // Misplaced declaration of an exception variable
        catch (HttpRequestBase httprequestbase)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (HttpRequestBase httprequestbase)
        {
            return false;
        }
        return false;
    }

    public final void a(Event event)
    {
        a(event.tagName());
    }

    public final volatile void a(Object obj)
    {
        a((Boolean)obj);
    }
}
