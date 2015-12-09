// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.c;

import com.android.slyce.h.a;
import com.android.slyce.k.g;
import com.android.slyce.k.h;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.android.slyce.c:
//            a, g

class d
    implements Runnable
{

    final String a;
    final a b;
    final com.android.slyce.c.g c;
    final com.android.slyce.c.a d;

    d(com.android.slyce.c.a a1, String s, a a2, com.android.slyce.c.g g1)
    {
        d = a1;
        a = s;
        b = a2;
        c = g1;
        super();
    }

    public void run()
    {
        Object obj1;
        StringBuilder stringbuilder;
        obj1 = g.a(com.android.slyce.c.a.b());
        String s = ((g) (obj1)).g();
        obj1 = ((g) (obj1)).h();
        stringbuilder = new StringBuilder();
        stringbuilder.append("http://foundation.slyceapp.com/api/v1/stream").append(a).append(b.f()).append("&").append("app_key").append("=").append(s).append("&").append("app_id").append("=").append(((String) (obj1))).append("&").append("prettyPrint").append("=").append(String.valueOf(Boolean.FALSE));
        obj1 = null;
        Object obj;
        int i;
        obj = (HttpURLConnection)(new URL(stringbuilder.toString())).openConnection();
        ((HttpURLConnection) (obj)).setReadTimeout(25000);
        ((HttpURLConnection) (obj)).setConnectTimeout(15000);
        ((HttpURLConnection) (obj)).setRequestMethod("GET");
        ((HttpURLConnection) (obj)).setDoInput(true);
        ((HttpURLConnection) (obj)).connect();
        i = ((HttpURLConnection) (obj)).getResponseCode();
        if (i == 200) goto _L2; else goto _L1
_L1:
        if (true)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        throw new NullPointerException();
_L4:
        return;
_L2:
        obj = new BufferedReader(new InputStreamReader(((HttpURLConnection) (obj)).getInputStream()));
_L5:
        obj1 = ((BufferedReader) (obj)).readLine();
        if (obj1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!b.e())
        {
            break MISSING_BLOCK_LABEL_244;
        }
        h.a(com.android.slyce.c.a.a(), "Request Cancelled");
        if (obj == null) goto _L4; else goto _L3
_L3:
        try
        {
            ((BufferedReader) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        c.a(((String) (obj1)));
          goto _L5
        obj1;
_L10:
        h.b(com.android.slyce.c.a.a(), "IOException");
        if (obj == null) goto _L4; else goto _L6
_L6:
        try
        {
            ((BufferedReader) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        if (obj == null) goto _L4; else goto _L7
_L7:
        try
        {
            ((BufferedReader) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        obj;
_L9:
        if (obj1 != null)
        {
            try
            {
                ((BufferedReader) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        throw obj;
        obj;
        return;
        Exception exception;
        exception;
        obj1 = obj;
        obj = exception;
        continue; /* Loop/switch isn't completed */
        exception;
        obj1 = obj;
        obj = exception;
        if (true) goto _L9; else goto _L8
_L8:
        IOException ioexception;
        ioexception;
        ioexception = null;
          goto _L10
    }
}
