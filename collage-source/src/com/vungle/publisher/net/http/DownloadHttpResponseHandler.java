// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.net.http;

import com.vungle.log.Logger;
import com.vungle.publisher.ad.AdManager;
import com.vungle.publisher.bk;
import com.vungle.publisher.cc;
import com.vungle.publisher.db.model.LocalAd;
import com.vungle.publisher.event.EventBus;
import com.vungle.publisher.m;
import com.vungle.publisher.n;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import javax.inject.Provider;
import org.json.JSONException;

// Referenced classes of package com.vungle.publisher.net.http:
//            MaxRetryAgeHttpResponseHandler, HttpResponse, HttpTransaction

public class DownloadHttpResponseHandler extends MaxRetryAgeHttpResponseHandler
{
    static class Factory
    {

        Provider a;

        Factory()
        {
        }
    }


    String a;
    String b;
    com.vungle.publisher.bj.b c;
    EventBus d;
    AdManager e;

    DownloadHttpResponseHandler()
    {
    }

    protected final void a(HttpTransaction httptransaction, HttpResponse httpresponse)
        throws IOException, JSONException
    {
        Object obj2 = null;
        Object obj;
        HttpURLConnection httpurlconnection;
        httpurlconnection = httpresponse.a;
        obj = httpurlconnection.getInputStream();
        Object obj1 = new File(b);
        if (!cc.b(((File) (obj1)))) goto _L2; else goto _L1
_L1:
        byte abyte0[];
        Logger.d("VungleNetwork", (new StringBuilder("downloading to: ")).append(b).toString());
        abyte0 = new byte[8192];
        obj1 = new FileOutputStream(((File) (obj1)));
        int i = 0;
_L5:
        int j = ((InputStream) (obj)).read(abyte0);
        if (j <= 0) goto _L4; else goto _L3
_L3:
        i += j;
        ((OutputStream) (obj1)).write(abyte0, 0, j);
          goto _L5
        httpresponse;
_L14:
        httptransaction = httptransaction.a;
    /* anonymous class not found */
    class _anm1 {}

        int k;
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Logger.d("VungleNetwork", (new StringBuilder()).append(httptransaction).append(": error closing input stream").toString(), ((Throwable) (obj)));
            }
        }
        if (obj1 != null)
        {
            try
            {
                ((OutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Logger.d("VungleNetwork", (new StringBuilder()).append(httptransaction).append(": error closing output stream").toString(), ((Throwable) (obj)));
            }
        }
        throw httpresponse;
_L4:
        ((OutputStream) (obj1)).flush();
        k = httpurlconnection.getContentLength();
        if (k >= 0 && k != i) goto _L7; else goto _L6
_L6:
        Logger.d("VungleNetwork", (new StringBuilder("download complete: ")).append(b).append(", size: ").append(i).toString());
        httpresponse = e.a(a).b(c);
        _cls1.a[c.ordinal()];
        JVM INSTR tableswitch 1 2: default 578
    //                   1 345
    //                   2 345;
           goto _L8 _L9 _L9
_L8:
        Logger.i("VungleNetwork", (new StringBuilder()).append(c).append(" downloaded for ad ").append(a).toString());
        httpresponse.a(com.vungle.publisher.bj.a.d);
        httpresponse.m();
        d.a(new n(httpresponse, httptransaction.b));
_L12:
        httptransaction = httptransaction.a;
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (HttpResponse httpresponse)
            {
                Logger.d("VungleNetwork", (new StringBuilder()).append(httptransaction).append(": error closing input stream").toString(), httpresponse);
            }
        }
        if (obj1 == null) goto _L11; else goto _L10
_L10:
        ((OutputStream) (obj1)).close();
_L11:
        return;
_L9:
        httpresponse.a(Integer.valueOf(i));
          goto _L8
_L7:
        Logger.w("VungleNetwork", (new StringBuilder("download size mismatch: ")).append(b).append(", expected size: ").append(k).append(", actual size: ").append(i).toString());
        b(httptransaction, httpresponse);
          goto _L12
_L2:
        Logger.w("VungleNetwork", (new StringBuilder("could not create or directory not writeable: ")).append(obj1).toString());
        b(httptransaction, httpresponse);
        obj1 = null;
          goto _L12
        httpresponse;
        Logger.d("VungleNetwork", (new StringBuilder()).append(httptransaction).append(": error closing output stream").toString(), httpresponse);
        return;
        httpresponse;
        obj = null;
        obj1 = obj2;
        continue; /* Loop/switch isn't completed */
        httpresponse;
        obj1 = obj2;
        if (true) goto _L14; else goto _L13
_L13:
    }

    protected final void b(HttpTransaction httptransaction, HttpResponse httpresponse)
    {
        d.a(new m(httptransaction.b));
    }
}
