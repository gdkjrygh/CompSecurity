// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.sync;

import android.accounts.AccountManager;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.translate.e.d;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpRequestBase;
import org.json.JSONException;

// Referenced classes of package com.google.android.libraries.translate.sync:
//            b, k

public abstract class i
{

    private final Context a;
    private final Object b;

    i(Context context, Object obj)
    {
        a = context;
        b = obj;
    }

    protected Object a(int j)
    {
        return null;
    }

    abstract Object a(String s);

    public final Object a(HttpRequestBase httprequestbase)
    {
        int j;
        if (com.google.android.libraries.translate.sync.b.b() == null)
        {
            com.google.android.libraries.translate.sync.b.c((new k(a)).c());
        }
        String s = String.valueOf(com.google.android.libraries.translate.sync.b.b());
        if (s.length() != 0)
        {
            s = "OAuth ".concat(s);
        } else
        {
            s = new String("OAuth ");
        }
        httprequestbase.setHeader("Authorization", s);
        s = String.valueOf(httprequestbase.getURI());
        (new StringBuilder(String.valueOf(s).length() + 23)).append("Executing Auth request ").append(s);
        httprequestbase = d.a().execute(httprequestbase);
        j = httprequestbase.getStatusLine().getStatusCode();
        httprequestbase = d.b(httprequestbase);
        if (j != 200)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        if (TextUtils.isEmpty(httprequestbase))
        {
            break MISSING_BLOCK_LABEL_149;
        }
        httprequestbase = ((HttpRequestBase) (a(((String) (httprequestbase)))));
        return httprequestbase;
label0:
        {
            {
                if (j != 401 && j != 403)
                {
                    break label0;
                }
                try
                {
                    if (com.google.android.libraries.translate.sync.b.b() != null)
                    {
                        AccountManager.get(a).invalidateAuthToken("com.google", com.google.android.libraries.translate.sync.b.b());
                        com.google.android.libraries.translate.sync.b.c(null);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (HttpRequestBase httprequestbase) { }
                // Misplaced declaration of an exception variable
                catch (HttpRequestBase httprequestbase) { }
            }
            return b;
        }
        httprequestbase = ((HttpRequestBase) (a(j)));
        if (httprequestbase != null)
        {
            return httprequestbase;
        }
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_189;
_L1:
    }
}
